package com.google.firebase.firestore.core;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleElement;
import com.google.firebase.firestore.bundle.BundleLoader;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.core.View;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.LocalViewChanges;
import com.google.firebase.firestore.local.LocalWriteResult;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.local.ReferenceSet;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import fa.d1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import n4.i;
import n4.j;

public class SyncEngine implements RemoteStore.RemoteStoreCallback {
    private static final String TAG = "SyncEngine";
    private final Map<Integer, b> activeLimboResolutionsByTarget = new HashMap();
    private final Map<DocumentKey, Integer> activeLimboTargetsByKey = new HashMap();
    private User currentUser;
    private final LinkedHashSet<DocumentKey> enqueuedLimboResolutions = new LinkedHashSet<>();
    private final ReferenceSet limboDocumentRefs = new ReferenceSet();
    private final LocalStore localStore;
    private final int maxConcurrentLimboResolutions;
    private final Map<User, Map<Integer, j>> mutationUserCallbacks = new HashMap();
    private final Map<Integer, List<j>> pendingWritesCallbacks;
    private final Map<Integer, List<Query>> queriesByTarget = new HashMap();
    private final Map<Query, w> queryViewsByQuery = new HashMap();
    private final RemoteStore remoteStore;
    private c syncEngineListener;
    private final TargetIdGenerator targetIdGenerator = TargetIdGenerator.forSyncEngine();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7841a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.core.LimboDocumentChange$Type[] r0 = com.google.firebase.firestore.core.LimboDocumentChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7841a = r0
                com.google.firebase.firestore.core.LimboDocumentChange$Type r1 = com.google.firebase.firestore.core.LimboDocumentChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7841a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.LimboDocumentChange$Type r1 = com.google.firebase.firestore.core.LimboDocumentChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.SyncEngine.a.<clinit>():void");
        }
    }

    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final DocumentKey f7842a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f7843b;

        b(DocumentKey documentKey) {
            this.f7842a = documentKey;
        }
    }

    interface c {
        void handleOnlineStateChange(OnlineState onlineState);

        void onError(Query query, d1 d1Var);

        void onViewSnapshots(List list);
    }

    public SyncEngine(LocalStore localStore2, RemoteStore remoteStore2, User user, int i10) {
        this.localStore = localStore2;
        this.remoteStore = remoteStore2;
        this.maxConcurrentLimboResolutions = i10;
        this.currentUser = user;
        this.pendingWritesCallbacks = new HashMap();
    }

    private void addUserCallback(int i10, j jVar) {
        Map map = this.mutationUserCallbacks.get(this.currentUser);
        if (map == null) {
            map = new HashMap();
            this.mutationUserCallbacks.put(this.currentUser, map);
        }
        map.put(Integer.valueOf(i10), jVar);
    }

    private void assertCallback(String str) {
        Assert.hardAssert(this.syncEngineListener != null, "Trying to call %s before setting callback", str);
    }

    private void emitNewSnapsAndNotifyLocalStore(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, RemoteEvent remoteEvent) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<Query, w> value : this.queryViewsByQuery.entrySet()) {
            w wVar = (w) value.getValue();
            View c10 = wVar.c();
            View.DocumentChanges computeDocChanges = c10.computeDocChanges(immutableSortedMap);
            if (computeDocChanges.needsRefill()) {
                computeDocChanges = c10.computeDocChanges(this.localStore.executeQuery(wVar.a(), false).getDocuments(), computeDocChanges);
            }
            ViewChange applyChanges = wVar.c().applyChanges(computeDocChanges, remoteEvent == null ? null : remoteEvent.getTargetChanges().get(Integer.valueOf(wVar.b())));
            updateTrackedLimboDocuments(applyChanges.getLimboChanges(), wVar.b());
            if (applyChanges.getSnapshot() != null) {
                arrayList.add(applyChanges.getSnapshot());
                arrayList2.add(LocalViewChanges.fromViewSnapshot(wVar.b(), applyChanges.getSnapshot()));
            }
        }
        this.syncEngineListener.onViewSnapshots(arrayList);
        this.localStore.notifyLocalViewChanges(arrayList2);
    }

    private boolean errorIsInteresting(d1 d1Var) {
        d1.b m10 = d1Var.m();
        return (m10 == d1.b.FAILED_PRECONDITION && (d1Var.n() != null ? d1Var.n() : "").contains("requires an index")) || m10 == d1.b.PERMISSION_DENIED;
    }

    private void failOutstandingPendingWritesAwaitingTasks() {
        for (Map.Entry<Integer, List<j>> value : this.pendingWritesCallbacks.entrySet()) {
            for (j b10 : (List) value.getValue()) {
                b10.b(new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change.", FirebaseFirestoreException.Code.CANCELLED));
            }
        }
        this.pendingWritesCallbacks.clear();
    }

    private ViewSnapshot initializeViewAndComputeSnapshot(Query query, int i10) {
        TargetChange targetChange;
        QueryResult executeQuery = this.localStore.executeQuery(query, true);
        ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
        if (this.queriesByTarget.get(Integer.valueOf(i10)) != null) {
            boolean z10 = false;
            if (this.queryViewsByQuery.get((Query) this.queriesByTarget.get(Integer.valueOf(i10)).get(0)).c().getSyncState() == ViewSnapshot.SyncState.SYNCED) {
                z10 = true;
            }
            targetChange = TargetChange.createSynthesizedTargetChangeForCurrentChange(z10);
        } else {
            targetChange = null;
        }
        View view = new View(query, executeQuery.getRemoteKeys());
        ViewChange applyChanges = view.applyChanges(view.computeDocChanges(executeQuery.getDocuments()), targetChange);
        updateTrackedLimboDocuments(applyChanges.getLimboChanges(), i10);
        this.queryViewsByQuery.put(query, new w(query, i10, view));
        if (!this.queriesByTarget.containsKey(Integer.valueOf(i10))) {
            this.queriesByTarget.put(Integer.valueOf(i10), new ArrayList(1));
        }
        this.queriesByTarget.get(Integer.valueOf(i10)).add(query);
        return applyChanges.getSnapshot();
    }

    private void logErrorIfInteresting(d1 d1Var, String str, Object... objArr) {
        if (errorIsInteresting(d1Var)) {
            Logger.warn("Firestore", "%s: %s", String.format(str, objArr), d1Var);
        }
    }

    private void notifyUser(int i10, d1 d1Var) {
        Map map = this.mutationUserCallbacks.get(this.currentUser);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i10);
            j jVar = (j) map.get(valueOf);
            if (jVar != null) {
                if (d1Var != null) {
                    jVar.b(Util.exceptionFromStatus(d1Var));
                } else {
                    jVar.c((Object) null);
                }
                map.remove(valueOf);
            }
        }
    }

    private void pumpEnqueuedLimboResolutions() {
        while (!this.enqueuedLimboResolutions.isEmpty() && this.activeLimboTargetsByKey.size() < this.maxConcurrentLimboResolutions) {
            Iterator<DocumentKey> it = this.enqueuedLimboResolutions.iterator();
            DocumentKey next = it.next();
            it.remove();
            int nextId = this.targetIdGenerator.nextId();
            this.activeLimboResolutionsByTarget.put(Integer.valueOf(nextId), new b(next));
            this.activeLimboTargetsByKey.put(next, Integer.valueOf(nextId));
            this.remoteStore.listen(new TargetData(Query.atPath(next.getPath()).toTarget(), nextId, -1, QueryPurpose.LIMBO_RESOLUTION));
        }
    }

    private void removeAndCleanupTarget(int i10, d1 d1Var) {
        for (Query query : this.queriesByTarget.get(Integer.valueOf(i10))) {
            this.queryViewsByQuery.remove(query);
            if (!d1Var.o()) {
                this.syncEngineListener.onError(query, d1Var);
                logErrorIfInteresting(d1Var, "Listen for %s failed", query);
            }
        }
        this.queriesByTarget.remove(Integer.valueOf(i10));
        ImmutableSortedSet<DocumentKey> referencesForId = this.limboDocumentRefs.referencesForId(i10);
        this.limboDocumentRefs.removeReferencesForId(i10);
        Iterator<DocumentKey> it = referencesForId.iterator();
        while (it.hasNext()) {
            DocumentKey next = it.next();
            if (!this.limboDocumentRefs.containsKey(next)) {
                removeLimboTarget(next);
            }
        }
    }

    private void removeLimboTarget(DocumentKey documentKey) {
        this.enqueuedLimboResolutions.remove(documentKey);
        Integer num = this.activeLimboTargetsByKey.get(documentKey);
        if (num != null) {
            this.remoteStore.stopListening(num.intValue());
            this.activeLimboTargetsByKey.remove(documentKey);
            this.activeLimboResolutionsByTarget.remove(num);
            pumpEnqueuedLimboResolutions();
        }
    }

    private void resolvePendingWriteTasks(int i10) {
        if (this.pendingWritesCallbacks.containsKey(Integer.valueOf(i10))) {
            for (j c10 : this.pendingWritesCallbacks.get(Integer.valueOf(i10))) {
                c10.c((Object) null);
            }
            this.pendingWritesCallbacks.remove(Integer.valueOf(i10));
        }
    }

    private void trackLimboChange(LimboDocumentChange limboDocumentChange) {
        DocumentKey key = limboDocumentChange.getKey();
        if (!this.activeLimboTargetsByKey.containsKey(key) && !this.enqueuedLimboResolutions.contains(key)) {
            Logger.debug(TAG, "New document in limbo: %s", key);
            this.enqueuedLimboResolutions.add(key);
            pumpEnqueuedLimboResolutions();
        }
    }

    private void updateTrackedLimboDocuments(List<LimboDocumentChange> list, int i10) {
        for (LimboDocumentChange next : list) {
            int i11 = a.f7841a[next.getType().ordinal()];
            if (i11 == 1) {
                this.limboDocumentRefs.addReference(next.getKey(), i10);
                trackLimboChange(next);
            } else if (i11 == 2) {
                Logger.debug(TAG, "Document no longer in limbo: %s", next.getKey());
                DocumentKey key = next.getKey();
                this.limboDocumentRefs.removeReference(key, i10);
                if (!this.limboDocumentRefs.containsKey(key)) {
                    removeLimboTarget(key);
                }
            } else {
                throw Assert.fail("Unknown limbo change type: %s", next.getType());
            }
        }
    }

    public Map<DocumentKey, Integer> getActiveLimboDocumentResolutions() {
        return new HashMap(this.activeLimboTargetsByKey);
    }

    public List<DocumentKey> getEnqueuedLimboDocumentResolutions() {
        return new ArrayList(this.enqueuedLimboResolutions);
    }

    public ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i10) {
        b bVar = this.activeLimboResolutionsByTarget.get(Integer.valueOf(i10));
        if (bVar != null && bVar.f7843b) {
            return DocumentKey.emptyKeySet().insert(bVar.f7842a);
        }
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        if (this.queriesByTarget.containsKey(Integer.valueOf(i10))) {
            for (Query query : this.queriesByTarget.get(Integer.valueOf(i10))) {
                if (this.queryViewsByQuery.containsKey(query)) {
                    emptyKeySet = emptyKeySet.unionWith(this.queryViewsByQuery.get(query).c().getSyncedDocuments());
                }
            }
        }
        return emptyKeySet;
    }

    public void handleCredentialChange(User user) {
        boolean z10 = !this.currentUser.equals(user);
        this.currentUser = user;
        if (z10) {
            failOutstandingPendingWritesAwaitingTasks();
            emitNewSnapsAndNotifyLocalStore(this.localStore.handleUserChange(user), (RemoteEvent) null);
        }
        this.remoteStore.handleCredentialChange();
    }

    public void handleOnlineStateChange(OnlineState onlineState) {
        assertCallback("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Query, w> value : this.queryViewsByQuery.entrySet()) {
            ViewChange applyOnlineStateChange = ((w) value.getValue()).c().applyOnlineStateChange(onlineState);
            Assert.hardAssert(applyOnlineStateChange.getLimboChanges().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (applyOnlineStateChange.getSnapshot() != null) {
                arrayList.add(applyOnlineStateChange.getSnapshot());
            }
        }
        this.syncEngineListener.onViewSnapshots(arrayList);
        this.syncEngineListener.handleOnlineStateChange(onlineState);
    }

    public void handleRejectedListen(int i10, d1 d1Var) {
        assertCallback("handleRejectedListen");
        b bVar = this.activeLimboResolutionsByTarget.get(Integer.valueOf(i10));
        DocumentKey c10 = bVar != null ? bVar.f7842a : null;
        if (c10 != null) {
            this.activeLimboTargetsByKey.remove(c10);
            this.activeLimboResolutionsByTarget.remove(Integer.valueOf(i10));
            pumpEnqueuedLimboResolutions();
            SnapshotVersion snapshotVersion = SnapshotVersion.NONE;
            handleRemoteEvent(new RemoteEvent(snapshotVersion, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(c10, MutableDocument.newNoDocument(c10, snapshotVersion)), Collections.singleton(c10)));
            return;
        }
        this.localStore.releaseTarget(i10);
        removeAndCleanupTarget(i10, d1Var);
    }

    public void handleRejectedWrite(int i10, d1 d1Var) {
        assertCallback("handleRejectedWrite");
        ImmutableSortedMap<DocumentKey, Document> rejectBatch = this.localStore.rejectBatch(i10);
        if (!rejectBatch.isEmpty()) {
            logErrorIfInteresting(d1Var, "Write failed at %s", rejectBatch.getMinKey().getPath());
        }
        notifyUser(i10, d1Var);
        resolvePendingWriteTasks(i10);
        emitNewSnapsAndNotifyLocalStore(rejectBatch, (RemoteEvent) null);
    }

    public void handleRemoteEvent(RemoteEvent remoteEvent) {
        assertCallback("handleRemoteEvent");
        for (Map.Entry next : remoteEvent.getTargetChanges().entrySet()) {
            TargetChange targetChange = (TargetChange) next.getValue();
            b bVar = this.activeLimboResolutionsByTarget.get((Integer) next.getKey());
            if (bVar != null) {
                Assert.hardAssert((targetChange.getAddedDocuments().size() + targetChange.getModifiedDocuments().size()) + targetChange.getRemovedDocuments().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (targetChange.getAddedDocuments().size() > 0) {
                    boolean unused = bVar.f7843b = true;
                } else if (targetChange.getModifiedDocuments().size() > 0) {
                    Assert.hardAssert(bVar.f7843b, "Received change for limbo target document without add.", new Object[0]);
                } else if (targetChange.getRemovedDocuments().size() > 0) {
                    Assert.hardAssert(bVar.f7843b, "Received remove for limbo target document without add.", new Object[0]);
                    boolean unused2 = bVar.f7843b = false;
                }
            }
        }
        emitNewSnapsAndNotifyLocalStore(this.localStore.applyRemoteEvent(remoteEvent), remoteEvent);
    }

    public void handleSuccessfulWrite(MutationBatchResult mutationBatchResult) {
        assertCallback("handleSuccessfulWrite");
        notifyUser(mutationBatchResult.getBatch().getBatchId(), (d1) null);
        resolvePendingWriteTasks(mutationBatchResult.getBatch().getBatchId());
        emitNewSnapsAndNotifyLocalStore(this.localStore.acknowledgeBatch(mutationBatchResult), (RemoteEvent) null);
    }

    public int listen(Query query) {
        assertCallback("listen");
        Assert.hardAssert(!this.queryViewsByQuery.containsKey(query), "We already listen to query: %s", query);
        TargetData allocateTarget = this.localStore.allocateTarget(query.toTarget());
        this.syncEngineListener.onViewSnapshots(Collections.singletonList(initializeViewAndComputeSnapshot(query, allocateTarget.getTargetId())));
        this.remoteStore.listen(allocateTarget);
        return allocateTarget.getTargetId();
    }

    public void loadBundle(BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        try {
            BundleMetadata bundleMetadata = bundleReader.getBundleMetadata();
            if (this.localStore.hasNewerBundle(bundleMetadata)) {
                loadBundleTask.setResult(LoadBundleTaskProgress.forSuccess(bundleMetadata));
                try {
                    bundleReader.close();
                } catch (IOException e10) {
                    Logger.warn(TAG, "Exception while closing bundle", e10);
                }
            } else {
                loadBundleTask.updateProgress(LoadBundleTaskProgress.forInitial(bundleMetadata));
                BundleLoader bundleLoader = new BundleLoader(this.localStore, bundleMetadata);
                long j10 = 0;
                while (true) {
                    BundleElement nextElement = bundleReader.getNextElement();
                    if (nextElement != null) {
                        long bytesRead = bundleReader.getBytesRead();
                        LoadBundleTaskProgress addElement = bundleLoader.addElement(nextElement, bytesRead - j10);
                        if (addElement != null) {
                            loadBundleTask.updateProgress(addElement);
                        }
                        j10 = bytesRead;
                    } else {
                        emitNewSnapsAndNotifyLocalStore(bundleLoader.applyChanges(), (RemoteEvent) null);
                        this.localStore.saveBundle(bundleMetadata);
                        loadBundleTask.setResult(LoadBundleTaskProgress.forSuccess(bundleMetadata));
                        try {
                            bundleReader.close();
                            return;
                        } catch (IOException e11) {
                            Logger.warn(TAG, "Exception while closing bundle", e11);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e12) {
            Logger.warn("Firestore", "Loading bundle failed : %s", e12);
            loadBundleTask.setException(new FirebaseFirestoreException("Bundle failed to load", FirebaseFirestoreException.Code.INVALID_ARGUMENT, e12));
            try {
                bundleReader.close();
            } catch (IOException e13) {
                Logger.warn(TAG, "Exception while closing bundle", e13);
            }
        } catch (Throwable th) {
            try {
                bundleReader.close();
            } catch (IOException e14) {
                Logger.warn(TAG, "Exception while closing bundle", e14);
            }
            throw th;
        }
    }

    public void registerPendingWritesTask(j jVar) {
        if (!this.remoteStore.canUseNetwork()) {
            Logger.debug(TAG, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int highestUnacknowledgedBatchId = this.localStore.getHighestUnacknowledgedBatchId();
        if (highestUnacknowledgedBatchId == -1) {
            jVar.c((Object) null);
            return;
        }
        if (!this.pendingWritesCallbacks.containsKey(Integer.valueOf(highestUnacknowledgedBatchId))) {
            this.pendingWritesCallbacks.put(Integer.valueOf(highestUnacknowledgedBatchId), new ArrayList());
        }
        this.pendingWritesCallbacks.get(Integer.valueOf(highestUnacknowledgedBatchId)).add(jVar);
    }

    public void setCallback(c cVar) {
        this.syncEngineListener = cVar;
    }

    /* access modifiers changed from: package-private */
    public void stopListening(Query query) {
        assertCallback("stopListening");
        w wVar = this.queryViewsByQuery.get(query);
        Assert.hardAssert(wVar != null, "Trying to stop listening to a query not found", new Object[0]);
        this.queryViewsByQuery.remove(query);
        int b10 = wVar.b();
        List list = this.queriesByTarget.get(Integer.valueOf(b10));
        list.remove(query);
        if (list.isEmpty()) {
            this.localStore.releaseTarget(b10);
            this.remoteStore.stopListening(b10);
            removeAndCleanupTarget(b10, d1.f10374f);
        }
    }

    public <TResult> i transaction(AsyncQueue asyncQueue, Function<Transaction, i> function) {
        return new TransactionRunner(asyncQueue, this.remoteStore, function).run();
    }

    public void writeMutations(List<Mutation> list, j jVar) {
        assertCallback("writeMutations");
        LocalWriteResult writeLocally = this.localStore.writeLocally(list);
        addUserCallback(writeLocally.getBatchId(), jVar);
        emitNewSnapsAndNotifyLocalStore(writeLocally.getChanges(), (RemoteEvent) null);
        this.remoteStore.fillWritePipeline();
    }
}
