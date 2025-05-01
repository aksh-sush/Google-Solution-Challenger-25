package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WatchChangeAggregator {
    private Map<DocumentKey, Set<Integer>> pendingDocumentTargetMapping = new HashMap();
    private Map<DocumentKey, MutableDocument> pendingDocumentUpdates = new HashMap();
    private Set<Integer> pendingTargetResets = new HashSet();
    private final TargetMetadataProvider targetMetadataProvider;
    private final Map<Integer, e0> targetStates = new HashMap();

    public interface TargetMetadataProvider {
        ImmutableSortedSet<DocumentKey> getRemoteKeysForTarget(int i10);

        TargetData getTargetDataForTarget(int i10);
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8176a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType[] r0 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8176a = r0
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8176a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Added     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8176a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Removed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8176a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Current     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8176a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Reset     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.WatchChangeAggregator.a.<clinit>():void");
        }
    }

    public WatchChangeAggregator(TargetMetadataProvider targetMetadataProvider2) {
        this.targetMetadataProvider = targetMetadataProvider2;
    }

    private void addDocumentToTarget(int i10, MutableDocument mutableDocument) {
        if (isActiveTarget(i10)) {
            ensureTargetState(i10).a(mutableDocument.getKey(), targetContainsDocument(i10, mutableDocument.getKey()) ? DocumentViewChange.Type.MODIFIED : DocumentViewChange.Type.ADDED);
            this.pendingDocumentUpdates.put(mutableDocument.getKey(), mutableDocument);
            ensureDocumentTargetMapping(mutableDocument.getKey()).add(Integer.valueOf(i10));
        }
    }

    private Set<Integer> ensureDocumentTargetMapping(DocumentKey documentKey) {
        Set<Integer> set = this.pendingDocumentTargetMapping.get(documentKey);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.pendingDocumentTargetMapping.put(documentKey, hashSet);
        return hashSet;
    }

    private e0 ensureTargetState(int i10) {
        e0 e0Var = this.targetStates.get(Integer.valueOf(i10));
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0();
        this.targetStates.put(Integer.valueOf(i10), e0Var2);
        return e0Var2;
    }

    private int getCurrentDocumentCountForTarget(int i10) {
        TargetChange j10 = ensureTargetState(i10).j();
        return (this.targetMetadataProvider.getRemoteKeysForTarget(i10).size() + j10.getAddedDocuments().size()) - j10.getRemovedDocuments().size();
    }

    private Collection<Integer> getTargetIds(WatchChange.WatchTargetChange watchTargetChange) {
        List<Integer> targetIds = watchTargetChange.getTargetIds();
        if (!targetIds.isEmpty()) {
            return targetIds;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.targetStates.keySet()) {
            if (isActiveTarget(next.intValue())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean isActiveTarget(int i10) {
        return queryDataForActiveTarget(i10) != null;
    }

    private TargetData queryDataForActiveTarget(int i10) {
        e0 e0Var = this.targetStates.get(Integer.valueOf(i10));
        if (e0Var == null || !e0Var.e()) {
            return this.targetMetadataProvider.getTargetDataForTarget(i10);
        }
        return null;
    }

    private void removeDocumentFromTarget(int i10, DocumentKey documentKey, MutableDocument mutableDocument) {
        if (isActiveTarget(i10)) {
            e0 ensureTargetState = ensureTargetState(i10);
            if (targetContainsDocument(i10, documentKey)) {
                ensureTargetState.a(documentKey, DocumentViewChange.Type.REMOVED);
            } else {
                ensureTargetState.i(documentKey);
            }
            ensureDocumentTargetMapping(documentKey).add(Integer.valueOf(i10));
            if (mutableDocument != null) {
                this.pendingDocumentUpdates.put(documentKey, mutableDocument);
            }
        }
    }

    private void resetTarget(int i10) {
        Assert.hardAssert(this.targetStates.get(Integer.valueOf(i10)) != null && !this.targetStates.get(Integer.valueOf(i10)).e(), "Should only reset active targets", new Object[0]);
        this.targetStates.put(Integer.valueOf(i10), new e0());
        Iterator<DocumentKey> it = this.targetMetadataProvider.getRemoteKeysForTarget(i10).iterator();
        while (it.hasNext()) {
            removeDocumentFromTarget(i10, it.next(), (MutableDocument) null);
        }
    }

    private boolean targetContainsDocument(int i10, DocumentKey documentKey) {
        return this.targetMetadataProvider.getRemoteKeysForTarget(i10).contains(documentKey);
    }

    public RemoteEvent createRemoteEvent(SnapshotVersion snapshotVersion) {
        boolean z10;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.targetStates.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            e0 e0Var = (e0) next.getValue();
            TargetData queryDataForActiveTarget = queryDataForActiveTarget(intValue);
            if (queryDataForActiveTarget != null) {
                if (e0Var.d() && queryDataForActiveTarget.getTarget().isDocumentQuery()) {
                    DocumentKey fromPath = DocumentKey.fromPath(queryDataForActiveTarget.getTarget().getPath());
                    if (this.pendingDocumentUpdates.get(fromPath) == null && !targetContainsDocument(intValue, fromPath)) {
                        removeDocumentFromTarget(intValue, fromPath, MutableDocument.newNoDocument(fromPath, snapshotVersion));
                    }
                }
                if (e0Var.c()) {
                    hashMap.put(Integer.valueOf(intValue), e0Var.j());
                    e0Var.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry next2 : this.pendingDocumentTargetMapping.entrySet()) {
            DocumentKey documentKey = (DocumentKey) next2.getKey();
            Iterator it = ((Set) next2.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                TargetData queryDataForActiveTarget2 = queryDataForActiveTarget(((Integer) it.next()).intValue());
                if (queryDataForActiveTarget2 != null && !queryDataForActiveTarget2.getPurpose().equals(QueryPurpose.LIMBO_RESOLUTION)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                hashSet.add(documentKey);
            }
        }
        RemoteEvent remoteEvent = new RemoteEvent(snapshotVersion, Collections.unmodifiableMap(hashMap), Collections.unmodifiableSet(this.pendingTargetResets), Collections.unmodifiableMap(this.pendingDocumentUpdates), Collections.unmodifiableSet(hashSet));
        this.pendingDocumentUpdates = new HashMap();
        this.pendingDocumentTargetMapping = new HashMap();
        this.pendingTargetResets = new HashSet();
        return remoteEvent;
    }

    public void handleDocumentChange(WatchChange.DocumentChange documentChange) {
        MutableDocument newDocument = documentChange.getNewDocument();
        DocumentKey documentKey = documentChange.getDocumentKey();
        for (Integer intValue : documentChange.getUpdatedTargetIds()) {
            int intValue2 = intValue.intValue();
            if (newDocument == null || !newDocument.isFoundDocument()) {
                removeDocumentFromTarget(intValue2, documentKey, newDocument);
            } else {
                addDocumentToTarget(intValue2, newDocument);
            }
        }
        for (Integer intValue3 : documentChange.getRemovedTargetIds()) {
            removeDocumentFromTarget(intValue3.intValue(), documentKey, documentChange.getNewDocument());
        }
    }

    public void handleExistenceFilter(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        int targetId = existenceFilterWatchChange.getTargetId();
        int count = existenceFilterWatchChange.getExistenceFilter().getCount();
        TargetData queryDataForActiveTarget = queryDataForActiveTarget(targetId);
        if (queryDataForActiveTarget != null) {
            Target target = queryDataForActiveTarget.getTarget();
            if (target.isDocumentQuery()) {
                if (count == 0) {
                    DocumentKey fromPath = DocumentKey.fromPath(target.getPath());
                    removeDocumentFromTarget(targetId, fromPath, MutableDocument.newNoDocument(fromPath, SnapshotVersion.NONE));
                    return;
                }
                Assert.hardAssert(count == 1, "Single document existence filter with count: %d", Integer.valueOf(count));
            } else if (((long) getCurrentDocumentCountForTarget(targetId)) != ((long) count)) {
                resetTarget(targetId);
                this.pendingTargetResets.add(Integer.valueOf(targetId));
            }
        }
    }

    public void handleTargetChange(WatchChange.WatchTargetChange watchTargetChange) {
        for (Integer intValue : getTargetIds(watchTargetChange)) {
            int intValue2 = intValue.intValue();
            e0 ensureTargetState = ensureTargetState(intValue2);
            int i10 = a.f8176a[watchTargetChange.getChangeType().ordinal()];
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    ensureTargetState.h();
                    if (!ensureTargetState.e()) {
                        ensureTargetState.b();
                    }
                } else if (i10 == 3) {
                    ensureTargetState.h();
                    if (!ensureTargetState.e()) {
                        removeTarget(intValue2);
                    }
                    if (watchTargetChange.getCause() != null) {
                        z10 = false;
                    }
                    Assert.hardAssert(z10, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw Assert.fail("Unknown target watch change state: %s", watchTargetChange.getChangeType());
                    } else if (isActiveTarget(intValue2)) {
                        resetTarget(intValue2);
                    }
                } else if (isActiveTarget(intValue2)) {
                    ensureTargetState.f();
                }
            } else if (!isActiveTarget(intValue2)) {
            }
            ensureTargetState.k(watchTargetChange.getResumeToken());
        }
    }

    /* access modifiers changed from: package-private */
    public void recordPendingTargetRequest(int i10) {
        ensureTargetState(i10).g();
    }

    /* access modifiers changed from: package-private */
    public void removeTarget(int i10) {
        this.targetStates.remove(Integer.valueOf(i10));
    }
}
