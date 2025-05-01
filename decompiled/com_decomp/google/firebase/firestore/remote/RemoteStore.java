package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.ConnectivityMonitor;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.remote.WatchChangeAggregator;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.j;
import fa.d1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class RemoteStore implements WatchChangeAggregator.TargetMetadataProvider {
    private static final String LOG_TAG = "RemoteStore";
    private static final int MAX_PENDING_WRITES = 10;
    private final ConnectivityMonitor connectivityMonitor;
    private final Datastore datastore;
    private final Map<Integer, TargetData> listenTargets;
    private final LocalStore localStore;
    private boolean networkEnabled = false;
    private final a0 onlineStateTracker;
    private final RemoteStoreCallback remoteStoreCallback;
    private WatchChangeAggregator watchChangeAggregator;
    private final WatchStream watchStream;
    private final Deque<MutationBatch> writePipeline;
    /* access modifiers changed from: private */
    public final WriteStream writeStream;

    public interface RemoteStoreCallback {
        ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i10);

        void handleOnlineStateChange(OnlineState onlineState);

        void handleRejectedListen(int i10, d1 d1Var);

        void handleRejectedWrite(int i10, d1 d1Var);

        void handleRemoteEvent(RemoteEvent remoteEvent);

        void handleSuccessfulWrite(MutationBatchResult mutationBatchResult);
    }

    class a implements WatchStream.a {
        a() {
        }

        public void a(SnapshotVersion snapshotVersion, WatchChange watchChange) {
            RemoteStore.this.handleWatchChange(snapshotVersion, watchChange);
        }

        public void onClose(d1 d1Var) {
            RemoteStore.this.handleWatchStreamClose(d1Var);
        }

        public void onOpen() {
            RemoteStore.this.handleWatchStreamOpen();
        }
    }

    class b implements WriteStream.Callback {
        b() {
        }

        public void onClose(d1 d1Var) {
            RemoteStore.this.handleWriteStreamClose(d1Var);
        }

        public void onHandshakeComplete() {
            RemoteStore.this.handleWriteStreamHandshakeComplete();
        }

        public void onOpen() {
            RemoteStore.this.writeStream.writeHandshake();
        }

        public void onWriteResponse(SnapshotVersion snapshotVersion, List list) {
            RemoteStore.this.handleWriteStreamMutationResults(snapshotVersion, list);
        }
    }

    public RemoteStore(RemoteStoreCallback remoteStoreCallback2, LocalStore localStore2, Datastore datastore2, AsyncQueue asyncQueue, ConnectivityMonitor connectivityMonitor2) {
        this.remoteStoreCallback = remoteStoreCallback2;
        this.localStore = localStore2;
        this.datastore = datastore2;
        this.connectivityMonitor = connectivityMonitor2;
        this.listenTargets = new HashMap();
        this.writePipeline = new ArrayDeque();
        Objects.requireNonNull(remoteStoreCallback2);
        this.onlineStateTracker = new a0(asyncQueue, new c0(remoteStoreCallback2));
        this.watchStream = datastore2.createWatchStream(new a());
        this.writeStream = datastore2.createWriteStream(new b());
        connectivityMonitor2.addCallback(new d0(this, asyncQueue));
    }

    private void addToWritePipeline(MutationBatch mutationBatch) {
        Assert.hardAssert(canAddToWritePipeline(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.writePipeline.add(mutationBatch);
        if (this.writeStream.isOpen() && this.writeStream.isHandshakeComplete()) {
            this.writeStream.writeMutations(mutationBatch.getMutations());
        }
    }

    private boolean canAddToWritePipeline() {
        return canUseNetwork() && this.writePipeline.size() < 10;
    }

    private void cleanUpWatchStreamState() {
        this.watchChangeAggregator = null;
    }

    private void disableNetworkInternal() {
        this.watchStream.stop();
        this.writeStream.stop();
        if (!this.writePipeline.isEmpty()) {
            Logger.debug(LOG_TAG, "Stopping write stream with %d pending writes", Integer.valueOf(this.writePipeline.size()));
            this.writePipeline.clear();
        }
        cleanUpWatchStreamState();
    }

    /* access modifiers changed from: private */
    public void handleWatchChange(SnapshotVersion snapshotVersion, WatchChange watchChange) {
        this.onlineStateTracker.i(OnlineState.ONLINE);
        Assert.hardAssert((this.watchStream == null || this.watchChangeAggregator == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z10 = watchChange instanceof WatchChange.WatchTargetChange;
        WatchChange.WatchTargetChange watchTargetChange = z10 ? (WatchChange.WatchTargetChange) watchChange : null;
        if (watchTargetChange == null || !watchTargetChange.getChangeType().equals(WatchChange.WatchTargetChangeType.Removed) || watchTargetChange.getCause() == null) {
            if (watchChange instanceof WatchChange.DocumentChange) {
                this.watchChangeAggregator.handleDocumentChange((WatchChange.DocumentChange) watchChange);
            } else if (watchChange instanceof WatchChange.ExistenceFilterWatchChange) {
                this.watchChangeAggregator.handleExistenceFilter((WatchChange.ExistenceFilterWatchChange) watchChange);
            } else {
                Assert.hardAssert(z10, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
                this.watchChangeAggregator.handleTargetChange((WatchChange.WatchTargetChange) watchChange);
            }
            if (!snapshotVersion.equals(SnapshotVersion.NONE) && snapshotVersion.compareTo(this.localStore.getLastRemoteSnapshotVersion()) >= 0) {
                raiseWatchSnapshot(snapshotVersion);
                return;
            }
            return;
        }
        processTargetError(watchTargetChange);
    }

    /* access modifiers changed from: private */
    public void handleWatchStreamClose(d1 d1Var) {
        if (d1Var.o()) {
            Assert.hardAssert(!shouldStartWatchStream(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        cleanUpWatchStreamState();
        if (shouldStartWatchStream()) {
            this.onlineStateTracker.d(d1Var);
            startWatchStream();
            return;
        }
        this.onlineStateTracker.i(OnlineState.UNKNOWN);
    }

    /* access modifiers changed from: private */
    public void handleWatchStreamOpen() {
        for (TargetData sendWatchRequest : this.listenTargets.values()) {
            sendWatchRequest(sendWatchRequest);
        }
    }

    private void handleWriteError(d1 d1Var) {
        Assert.hardAssert(!d1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (Datastore.isPermanentWriteError(d1Var)) {
            this.writeStream.inhibitBackoff();
            this.remoteStoreCallback.handleRejectedWrite(this.writePipeline.poll().getBatchId(), d1Var);
            fillWritePipeline();
        }
    }

    private void handleWriteHandshakeError(d1 d1Var) {
        Assert.hardAssert(!d1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (Datastore.isPermanentError(d1Var)) {
            Logger.debug(LOG_TAG, "RemoteStore error before completed handshake; resetting stream token %s: %s", Util.toDebugString(this.writeStream.getLastStreamToken()), d1Var);
            WriteStream writeStream2 = this.writeStream;
            j jVar = WriteStream.EMPTY_STREAM_TOKEN;
            writeStream2.setLastStreamToken(jVar);
            this.localStore.setLastStreamToken(jVar);
        }
    }

    /* access modifiers changed from: private */
    public void handleWriteStreamClose(d1 d1Var) {
        if (d1Var.o()) {
            Assert.hardAssert(!shouldStartWriteStream(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!d1Var.o() && !this.writePipeline.isEmpty()) {
            if (this.writeStream.isHandshakeComplete()) {
                handleWriteError(d1Var);
            } else {
                handleWriteHandshakeError(d1Var);
            }
        }
        if (shouldStartWriteStream()) {
            startWriteStream();
        }
    }

    /* access modifiers changed from: private */
    public void handleWriteStreamHandshakeComplete() {
        this.localStore.setLastStreamToken(this.writeStream.getLastStreamToken());
        for (MutationBatch mutations : this.writePipeline) {
            this.writeStream.writeMutations(mutations.getMutations());
        }
    }

    /* access modifiers changed from: private */
    public void handleWriteStreamMutationResults(SnapshotVersion snapshotVersion, List<MutationResult> list) {
        this.remoteStoreCallback.handleSuccessfulWrite(MutationBatchResult.create(this.writePipeline.poll(), snapshotVersion, list, this.writeStream.getLastStreamToken()));
        fillWritePipeline();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ConnectivityMonitor.NetworkStatus networkStatus) {
        if (networkStatus.equals(ConnectivityMonitor.NetworkStatus.REACHABLE) && this.onlineStateTracker.c().equals(OnlineState.ONLINE)) {
            return;
        }
        if ((!networkStatus.equals(ConnectivityMonitor.NetworkStatus.UNREACHABLE) || !this.onlineStateTracker.c().equals(OnlineState.OFFLINE)) && canUseNetwork()) {
            Logger.debug(LOG_TAG, "Restarting streams for network reachability change.", new Object[0]);
            restartNetwork();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(AsyncQueue asyncQueue, ConnectivityMonitor.NetworkStatus networkStatus) {
        asyncQueue.enqueueAndForget(new b0(this, networkStatus));
    }

    private void processTargetError(WatchChange.WatchTargetChange watchTargetChange) {
        Assert.hardAssert(watchTargetChange.getCause() != null, "Processing target error without a cause", new Object[0]);
        for (Integer next : watchTargetChange.getTargetIds()) {
            if (this.listenTargets.containsKey(next)) {
                this.listenTargets.remove(next);
                this.watchChangeAggregator.removeTarget(next.intValue());
                this.remoteStoreCallback.handleRejectedListen(next.intValue(), watchTargetChange.getCause());
            }
        }
    }

    private void raiseWatchSnapshot(SnapshotVersion snapshotVersion) {
        Assert.hardAssert(!snapshotVersion.equals(SnapshotVersion.NONE), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        RemoteEvent createRemoteEvent = this.watchChangeAggregator.createRemoteEvent(snapshotVersion);
        for (Map.Entry next : createRemoteEvent.getTargetChanges().entrySet()) {
            TargetChange targetChange = (TargetChange) next.getValue();
            if (!targetChange.getResumeToken().isEmpty()) {
                int intValue = ((Integer) next.getKey()).intValue();
                TargetData targetData = this.listenTargets.get(Integer.valueOf(intValue));
                if (targetData != null) {
                    this.listenTargets.put(Integer.valueOf(intValue), targetData.withResumeToken(targetChange.getResumeToken(), snapshotVersion));
                }
            }
        }
        for (Integer intValue2 : createRemoteEvent.getTargetMismatches()) {
            int intValue3 = intValue2.intValue();
            TargetData targetData2 = this.listenTargets.get(Integer.valueOf(intValue3));
            if (targetData2 != null) {
                this.listenTargets.put(Integer.valueOf(intValue3), targetData2.withResumeToken(j.f8600f, targetData2.getSnapshotVersion()));
                sendUnwatchRequest(intValue3);
                sendWatchRequest(new TargetData(targetData2.getTarget(), intValue3, targetData2.getSequenceNumber(), QueryPurpose.EXISTENCE_FILTER_MISMATCH));
            }
        }
        this.remoteStoreCallback.handleRemoteEvent(createRemoteEvent);
    }

    private void restartNetwork() {
        this.networkEnabled = false;
        disableNetworkInternal();
        this.onlineStateTracker.i(OnlineState.UNKNOWN);
        this.writeStream.inhibitBackoff();
        this.watchStream.inhibitBackoff();
        enableNetwork();
    }

    private void sendUnwatchRequest(int i10) {
        this.watchChangeAggregator.recordPendingTargetRequest(i10);
        this.watchStream.unwatchTarget(i10);
    }

    private void sendWatchRequest(TargetData targetData) {
        this.watchChangeAggregator.recordPendingTargetRequest(targetData.getTargetId());
        this.watchStream.watchQuery(targetData);
    }

    private boolean shouldStartWatchStream() {
        return canUseNetwork() && !this.watchStream.isStarted() && !this.listenTargets.isEmpty();
    }

    private boolean shouldStartWriteStream() {
        return canUseNetwork() && !this.writeStream.isStarted() && !this.writePipeline.isEmpty();
    }

    private void startWatchStream() {
        Assert.hardAssert(shouldStartWatchStream(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.watchChangeAggregator = new WatchChangeAggregator(this);
        this.watchStream.start();
        this.onlineStateTracker.e();
    }

    private void startWriteStream() {
        Assert.hardAssert(shouldStartWriteStream(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.writeStream.start();
    }

    public boolean canUseNetwork() {
        return this.networkEnabled;
    }

    public Transaction createTransaction() {
        return new Transaction(this.datastore);
    }

    public void disableNetwork() {
        this.networkEnabled = false;
        disableNetworkInternal();
        this.onlineStateTracker.i(OnlineState.OFFLINE);
    }

    public void enableNetwork() {
        this.networkEnabled = true;
        if (canUseNetwork()) {
            this.writeStream.setLastStreamToken(this.localStore.getLastStreamToken());
            if (shouldStartWatchStream()) {
                startWatchStream();
            } else {
                this.onlineStateTracker.i(OnlineState.UNKNOWN);
            }
            fillWritePipeline();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void fillWritePipeline() {
        /*
            r2 = this;
            java.util.Deque<com.google.firebase.firestore.model.mutation.MutationBatch> r0 = r2.writePipeline
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000a
            r0 = -1
            goto L_0x0013
        L_0x000a:
            java.util.Deque<com.google.firebase.firestore.model.mutation.MutationBatch> r0 = r2.writePipeline
            java.lang.Object r0 = r0.getLast()
            com.google.firebase.firestore.model.mutation.MutationBatch r0 = (com.google.firebase.firestore.model.mutation.MutationBatch) r0
            goto L_0x0032
        L_0x0013:
            boolean r1 = r2.canAddToWritePipeline()
            if (r1 == 0) goto L_0x0037
            com.google.firebase.firestore.local.LocalStore r1 = r2.localStore
            com.google.firebase.firestore.model.mutation.MutationBatch r0 = r1.getNextMutationBatch(r0)
            if (r0 != 0) goto L_0x002f
            java.util.Deque<com.google.firebase.firestore.model.mutation.MutationBatch> r0 = r2.writePipeline
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0037
            com.google.firebase.firestore.remote.WriteStream r0 = r2.writeStream
            r0.markIdle()
            goto L_0x0037
        L_0x002f:
            r2.addToWritePipeline(r0)
        L_0x0032:
            int r0 = r0.getBatchId()
            goto L_0x0013
        L_0x0037:
            boolean r0 = r2.shouldStartWriteStream()
            if (r0 == 0) goto L_0x0040
            r2.startWriteStream()
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.RemoteStore.fillWritePipeline():void");
    }

    /* access modifiers changed from: package-private */
    public void forceEnableNetwork() {
        enableNetwork();
        this.onlineStateTracker.i(OnlineState.ONLINE);
    }

    public ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i10) {
        return this.remoteStoreCallback.getRemoteKeysForTarget(i10);
    }

    public TargetData getTargetDataForTarget(int i10) {
        return this.listenTargets.get(Integer.valueOf(i10));
    }

    public void handleCredentialChange() {
        if (canUseNetwork()) {
            Logger.debug(LOG_TAG, "Restarting streams for new credential.", new Object[0]);
            restartNetwork();
        }
    }

    public void listen(TargetData targetData) {
        Integer valueOf = Integer.valueOf(targetData.getTargetId());
        if (!this.listenTargets.containsKey(valueOf)) {
            this.listenTargets.put(valueOf, targetData);
            if (shouldStartWatchStream()) {
                startWatchStream();
            } else if (this.watchStream.isOpen()) {
                sendWatchRequest(targetData);
            }
        }
    }

    public void shutdown() {
        Logger.debug(LOG_TAG, "Shutting down", new Object[0]);
        this.connectivityMonitor.shutdown();
        this.networkEnabled = false;
        disableNetworkInternal();
        this.datastore.shutdown();
        this.onlineStateTracker.i(OnlineState.UNKNOWN);
    }

    public void start() {
        enableNetwork();
    }

    public void stopListening(int i10) {
        Assert.hardAssert(this.listenTargets.remove(Integer.valueOf(i10)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i10));
        if (this.watchStream.isOpen()) {
            sendUnwatchRequest(i10);
        }
        if (!this.listenTargets.isEmpty()) {
            return;
        }
        if (this.watchStream.isOpen()) {
            this.watchStream.markIdle();
        } else if (canUseNetwork()) {
            this.onlineStateTracker.i(OnlineState.UNKNOWN);
        }
    }
}
