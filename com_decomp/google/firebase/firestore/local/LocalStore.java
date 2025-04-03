package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleCallback;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetIdGenerator;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class LocalStore implements BundleCallback {
    private static final long RESUME_TOKEN_MAX_AGE_SECONDS = TimeUnit.MINUTES.toSeconds(5);
    private final BundleCache bundleCache;
    private e localDocuments;
    private final ReferenceSet localViewReferences;
    private g0 mutationQueue;
    private final Persistence persistence;
    private final SparseArray<TargetData> queryDataByTarget = new SparseArray<>();
    private QueryEngine queryEngine;
    private final i0 remoteDocuments;
    private final j2 targetCache;
    private final Map<Target, Integer> targetIdByTarget = new HashMap();
    private final TargetIdGenerator targetIdGenerator;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        TargetData f7924a;

        /* renamed from: b  reason: collision with root package name */
        int f7925b;

        private b() {
        }
    }

    public LocalStore(Persistence persistence2, QueryEngine queryEngine2, User user) {
        Assert.hardAssert(persistence2.isStarted(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.persistence = persistence2;
        j2 targetCache2 = persistence2.getTargetCache();
        this.targetCache = targetCache2;
        this.bundleCache = persistence2.getBundleCache();
        this.targetIdGenerator = TargetIdGenerator.forTargetCache(targetCache2.getHighestTargetId());
        this.mutationQueue = persistence2.getMutationQueue(user);
        i0 remoteDocumentCache = persistence2.getRemoteDocumentCache();
        this.remoteDocuments = remoteDocumentCache;
        e eVar = new e(remoteDocumentCache, this.mutationQueue, persistence2.getIndexManager());
        this.localDocuments = eVar;
        this.queryEngine = queryEngine2;
        queryEngine2.setLocalDocumentsView(eVar);
        ReferenceSet referenceSet = new ReferenceSet();
        this.localViewReferences = referenceSet;
        persistence2.getReferenceDelegate().b(referenceSet);
    }

    private void applyWriteToRemoteDocuments(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        for (DocumentKey next : batch.getKeys()) {
            MutableDocument b10 = this.remoteDocuments.b(next);
            SnapshotVersion snapshotVersion = mutationBatchResult.getDocVersions().get(next);
            Assert.hardAssert(snapshotVersion != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (b10.getVersion().compareTo(snapshotVersion) < 0) {
                batch.applyToRemoteDocument(b10, mutationBatchResult);
                if (b10.isValidDocument()) {
                    this.remoteDocuments.a(b10, mutationBatchResult.getCommitVersion());
                }
            }
        }
        this.mutationQueue.g(batch);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$acknowledgeBatch$2(MutationBatchResult mutationBatchResult) {
        MutationBatch batch = mutationBatchResult.getBatch();
        this.mutationQueue.j(batch, mutationBatchResult.getStreamToken());
        applyWriteToRemoteDocuments(mutationBatchResult);
        this.mutationQueue.a();
        return this.localDocuments.e(batch.getKeys());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$allocateTarget$7(b bVar, Target target) {
        int nextId = this.targetIdGenerator.nextId();
        bVar.f7925b = nextId;
        TargetData targetData = new TargetData(target, nextId, this.persistence.getReferenceDelegate().g(), QueryPurpose.LISTEN);
        bVar.f7924a = targetData;
        this.targetCache.f(targetData);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyBundledDocuments$10(ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            MutableDocument mutableDocument = (MutableDocument) entry.getValue();
            if (mutableDocument.isFoundDocument()) {
                emptyKeySet = emptyKeySet.insert(documentKey);
            }
            hashMap.put(documentKey, mutableDocument);
            hashMap2.put(documentKey, mutableDocument.getVersion());
        }
        this.targetCache.c(targetData.getTargetId());
        this.targetCache.b(emptyKeySet, targetData.getTargetId());
        return this.localDocuments.j(populateDocumentChanges(hashMap, hashMap2, SnapshotVersion.NONE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$applyRemoteEvent$5(RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        Map<Integer, TargetChange> targetChanges = remoteEvent.getTargetChanges();
        long g10 = this.persistence.getReferenceDelegate().g();
        for (Map.Entry next : targetChanges.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            TargetChange targetChange = (TargetChange) next.getValue();
            TargetData targetData = this.queryDataByTarget.get(intValue);
            if (targetData != null) {
                this.targetCache.h(targetChange.getRemovedDocuments(), intValue);
                this.targetCache.b(targetChange.getAddedDocuments(), intValue);
                j resumeToken = targetChange.getResumeToken();
                if (!resumeToken.isEmpty()) {
                    TargetData withSequenceNumber = targetData.withResumeToken(resumeToken, remoteEvent.getSnapshotVersion()).withSequenceNumber(g10);
                    this.queryDataByTarget.put(intValue, withSequenceNumber);
                    if (shouldPersistTargetData(targetData, withSequenceNumber, targetChange)) {
                        this.targetCache.d(withSequenceNumber);
                    }
                }
            }
        }
        Map<DocumentKey, MutableDocument> documentUpdates = remoteEvent.getDocumentUpdates();
        Set<DocumentKey> resolvedLimboDocuments = remoteEvent.getResolvedLimboDocuments();
        for (DocumentKey next2 : documentUpdates.keySet()) {
            if (resolvedLimboDocuments.contains(next2)) {
                this.persistence.getReferenceDelegate().a(next2);
            }
        }
        Map<DocumentKey, MutableDocument> populateDocumentChanges = populateDocumentChanges(documentUpdates, (Map<DocumentKey, SnapshotVersion>) null, remoteEvent.getSnapshotVersion());
        SnapshotVersion lastRemoteSnapshotVersion = this.targetCache.getLastRemoteSnapshotVersion();
        if (!snapshotVersion.equals(SnapshotVersion.NONE)) {
            Assert.hardAssert(snapshotVersion.compareTo(lastRemoteSnapshotVersion) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion, lastRemoteSnapshotVersion);
            this.targetCache.e(snapshotVersion);
        }
        return this.localDocuments.j(populateDocumentChanges);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LruGarbageCollector.Results lambda$collectGarbage$14(LruGarbageCollector lruGarbageCollector) {
        return lruGarbageCollector.collect(this.queryDataByTarget);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ NamedQuery lambda$getNamedQuery$12(String str) {
        return this.bundleCache.getNamedQuery(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasNewerBundle$8(BundleMetadata bundleMetadata) {
        BundleMetadata bundleMetadata2 = this.bundleCache.getBundleMetadata(bundleMetadata.getBundleId());
        return Boolean.valueOf(bundleMetadata2 != null && bundleMetadata2.getCreateTime().compareTo(bundleMetadata.getCreateTime()) >= 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyLocalViewChanges$6(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalViewChanges localViewChanges = (LocalViewChanges) it.next();
            int targetId = localViewChanges.getTargetId();
            this.localViewReferences.addReferences(localViewChanges.getAdded(), targetId);
            ImmutableSortedSet<DocumentKey> removed = localViewChanges.getRemoved();
            Iterator<DocumentKey> it2 = removed.iterator();
            while (it2.hasNext()) {
                this.persistence.getReferenceDelegate().i(it2.next());
            }
            this.localViewReferences.removeReferences(removed, targetId);
            if (!localViewChanges.isFromCache()) {
                TargetData targetData = this.queryDataByTarget.get(targetId);
                Assert.hardAssert(targetData != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(targetId));
                this.queryDataByTarget.put(targetId, targetData.withLastLimboFreeSnapshotVersion(targetData.getSnapshotVersion()));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableSortedMap lambda$rejectBatch$3(int i10) {
        MutationBatch f10 = this.mutationQueue.f(i10);
        Assert.hardAssert(f10 != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.mutationQueue.g(f10);
        this.mutationQueue.a();
        return this.localDocuments.e(f10.getKeys());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseTarget$13(int i10) {
        TargetData targetData = this.queryDataByTarget.get(i10);
        Assert.hardAssert(targetData != null, "Tried to release nonexistent target: %s", Integer.valueOf(i10));
        Iterator<DocumentKey> it = this.localViewReferences.removeReferencesForId(i10).iterator();
        while (it.hasNext()) {
            this.persistence.getReferenceDelegate().i(it.next());
        }
        this.persistence.getReferenceDelegate().h(targetData);
        this.queryDataByTarget.remove(i10);
        this.targetIdByTarget.remove(targetData.getTarget());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$saveBundle$9(BundleMetadata bundleMetadata) {
        this.bundleCache.saveBundleMetadata(bundleMetadata);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$saveNamedQuery$11(NamedQuery namedQuery, TargetData targetData, int i10, ImmutableSortedSet immutableSortedSet) {
        if (namedQuery.getReadTime().compareTo(targetData.getSnapshotVersion()) > 0) {
            TargetData withResumeToken = targetData.withResumeToken(j.f8600f, namedQuery.getReadTime());
            this.queryDataByTarget.append(i10, withResumeToken);
            this.targetCache.d(withResumeToken);
            this.targetCache.c(i10);
            this.targetCache.b(immutableSortedSet, i10);
        }
        this.bundleCache.saveNamedQuery(namedQuery);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setLastStreamToken$4(j jVar) {
        this.mutationQueue.k(jVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startMutationQueue$0() {
        this.mutationQueue.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LocalWriteResult lambda$writeLocally$1(Set set, List list, Timestamp timestamp) {
        ImmutableSortedMap e10 = this.localDocuments.e(set);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mutation mutation = (Mutation) it.next();
            ObjectValue extractTransformBaseValue = mutation.extractTransformBaseValue((Document) e10.get(mutation.getKey()));
            if (extractTransformBaseValue != null) {
                arrayList.add(new PatchMutation(mutation.getKey(), extractTransformBaseValue, extractTransformBaseValue.getFieldMask(), Precondition.exists(true)));
            }
        }
        MutationBatch e11 = this.mutationQueue.e(timestamp, arrayList, list);
        e11.applyToLocalDocumentSet(e10);
        return new LocalWriteResult(e11.getBatchId(), e10);
    }

    private static Target newUmbrellaTarget(String str) {
        return Query.atPath(ResourcePath.fromString("__bundle__/docs/" + str)).toTarget();
    }

    private Map<DocumentKey, MutableDocument> populateDocumentChanges(Map<DocumentKey, MutableDocument> map, Map<DocumentKey, SnapshotVersion> map2, SnapshotVersion snapshotVersion) {
        HashMap hashMap = new HashMap();
        Map e10 = this.remoteDocuments.e(map.keySet());
        for (Map.Entry next : map.entrySet()) {
            DocumentKey documentKey = (DocumentKey) next.getKey();
            MutableDocument mutableDocument = (MutableDocument) next.getValue();
            MutableDocument mutableDocument2 = (MutableDocument) e10.get(documentKey);
            SnapshotVersion snapshotVersion2 = map2 != null ? map2.get(documentKey) : snapshotVersion;
            if (mutableDocument.isNoDocument() && mutableDocument.getVersion().equals(SnapshotVersion.NONE)) {
                this.remoteDocuments.d(mutableDocument.getKey());
            } else if (!mutableDocument2.isValidDocument() || mutableDocument.getVersion().compareTo(mutableDocument2.getVersion()) > 0 || (mutableDocument.getVersion().compareTo(mutableDocument2.getVersion()) == 0 && mutableDocument2.hasPendingWrites())) {
                Assert.hardAssert(!SnapshotVersion.NONE.equals(snapshotVersion2), "Cannot add a document when the remote version is zero", new Object[0]);
                this.remoteDocuments.a(mutableDocument, snapshotVersion2);
            } else {
                Logger.debug("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", documentKey, mutableDocument2.getVersion(), mutableDocument.getVersion());
            }
            hashMap.put(documentKey, mutableDocument);
        }
        return hashMap;
    }

    private static boolean shouldPersistTargetData(TargetData targetData, TargetData targetData2, TargetChange targetChange) {
        Assert.hardAssert(!targetData2.getResumeToken().isEmpty(), "Attempted to persist query data with empty resume token", new Object[0]);
        return targetData.getResumeToken().isEmpty() || targetData2.getSnapshotVersion().getTimestamp().getSeconds() - targetData.getSnapshotVersion().getTimestamp().getSeconds() >= RESUME_TOKEN_MAX_AGE_SECONDS || (targetChange.getAddedDocuments().size() + targetChange.getModifiedDocuments().size()) + targetChange.getRemovedDocuments().size() > 0;
    }

    private void startMutationQueue() {
        this.persistence.runTransaction("Start MutationQueue", (Runnable) new q(this));
    }

    public ImmutableSortedMap<DocumentKey, Document> acknowledgeBatch(MutationBatchResult mutationBatchResult) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Acknowledge batch", new r(this, mutationBatchResult));
    }

    public TargetData allocateTarget(Target target) {
        int i10;
        TargetData g10 = this.targetCache.g(target);
        if (g10 != null) {
            i10 = g10.getTargetId();
        } else {
            b bVar = new b();
            this.persistence.runTransaction("Allocate target", (Runnable) new g(this, bVar, target));
            i10 = bVar.f7925b;
            g10 = bVar.f7924a;
        }
        if (this.queryDataByTarget.get(i10) == null) {
            this.queryDataByTarget.put(i10, g10);
            this.targetIdByTarget.put(target, Integer.valueOf(i10));
        }
        return g10;
    }

    public ImmutableSortedMap<DocumentKey, Document> applyBundledDocuments(ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap, String str) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply bundle documents", new l(this, immutableSortedMap, allocateTarget(newUmbrellaTarget(str))));
    }

    public ImmutableSortedMap<DocumentKey, Document> applyRemoteEvent(RemoteEvent remoteEvent) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Apply remote event", new k(this, remoteEvent, remoteEvent.getSnapshotVersion()));
    }

    public LruGarbageCollector.Results collectGarbage(LruGarbageCollector lruGarbageCollector) {
        return (LruGarbageCollector.Results) this.persistence.runTransaction("Collect garbage", new o(this, lruGarbageCollector));
    }

    public QueryResult executeQuery(Query query, boolean z10) {
        SnapshotVersion snapshotVersion;
        ImmutableSortedSet<DocumentKey> immutableSortedSet;
        TargetData targetData = getTargetData(query.toTarget());
        SnapshotVersion snapshotVersion2 = SnapshotVersion.NONE;
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        if (targetData != null) {
            snapshotVersion = targetData.getLastLimboFreeSnapshotVersion();
            immutableSortedSet = this.targetCache.a(targetData.getTargetId());
        } else {
            immutableSortedSet = emptyKeySet;
            snapshotVersion = snapshotVersion2;
        }
        QueryEngine queryEngine2 = this.queryEngine;
        if (z10) {
            snapshotVersion2 = snapshotVersion;
        }
        return new QueryResult(queryEngine2.getDocumentsMatchingQuery(query, snapshotVersion2, z10 ? immutableSortedSet : DocumentKey.emptyKeySet()), immutableSortedSet);
    }

    public int getHighestUnacknowledgedBatchId() {
        return this.mutationQueue.c();
    }

    public SnapshotVersion getLastRemoteSnapshotVersion() {
        return this.targetCache.getLastRemoteSnapshotVersion();
    }

    public j getLastStreamToken() {
        return this.mutationQueue.getLastStreamToken();
    }

    public NamedQuery getNamedQuery(String str) {
        return (NamedQuery) this.persistence.runTransaction("Get named query", new j(this, str));
    }

    public MutationBatch getNextMutationBatch(int i10) {
        return this.mutationQueue.b(i10);
    }

    public ImmutableSortedSet<DocumentKey> getRemoteDocumentKeys(int i10) {
        return this.targetCache.a(i10);
    }

    /* access modifiers changed from: package-private */
    public TargetData getTargetData(Target target) {
        Integer num = this.targetIdByTarget.get(target);
        return num != null ? this.queryDataByTarget.get(num.intValue()) : this.targetCache.g(target);
    }

    public ImmutableSortedMap<DocumentKey, Document> handleUserChange(User user) {
        List l10 = this.mutationQueue.l();
        this.mutationQueue = this.persistence.getMutationQueue(user);
        startMutationQueue();
        List l11 = this.mutationQueue.l();
        e eVar = new e(this.remoteDocuments, this.mutationQueue, this.persistence.getIndexManager());
        this.localDocuments = eVar;
        this.queryEngine.setLocalDocumentsView(eVar);
        ImmutableSortedSet<DocumentKey> emptyKeySet = DocumentKey.emptyKeySet();
        for (List<MutationBatch> it : Arrays.asList(new List[]{l10, l11})) {
            for (MutationBatch mutations : it) {
                for (Mutation key : mutations.getMutations()) {
                    emptyKeySet = emptyKeySet.insert(key.getKey());
                }
            }
        }
        return this.localDocuments.e(emptyKeySet);
    }

    public boolean hasNewerBundle(BundleMetadata bundleMetadata) {
        return ((Boolean) this.persistence.runTransaction("Has newer bundle", new i(this, bundleMetadata))).booleanValue();
    }

    public void notifyLocalViewChanges(List<LocalViewChanges> list) {
        this.persistence.runTransaction("notifyLocalViewChanges", (Runnable) new m(this, list));
    }

    public Document readDocument(DocumentKey documentKey) {
        return this.localDocuments.c(documentKey);
    }

    public ImmutableSortedMap<DocumentKey, Document> rejectBatch(int i10) {
        return (ImmutableSortedMap) this.persistence.runTransaction("Reject batch", new f(this, i10));
    }

    public void releaseTarget(int i10) {
        this.persistence.runTransaction("Release target", (Runnable) new p(this, i10));
    }

    public void saveBundle(BundleMetadata bundleMetadata) {
        this.persistence.runTransaction("Save bundle", (Runnable) new n(this, bundleMetadata));
    }

    public void saveNamedQuery(NamedQuery namedQuery, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        TargetData allocateTarget = allocateTarget(namedQuery.getBundledQuery().getTarget());
        this.persistence.runTransaction("Saved named query", (Runnable) new s(this, namedQuery, allocateTarget, allocateTarget.getTargetId(), immutableSortedSet));
    }

    public void setLastStreamToken(j jVar) {
        this.persistence.runTransaction("Set stream token", (Runnable) new t(this, jVar));
    }

    public void start() {
        startMutationQueue();
    }

    public LocalWriteResult writeLocally(List<Mutation> list) {
        Timestamp now = Timestamp.now();
        HashSet hashSet = new HashSet();
        for (Mutation key : list) {
            hashSet.add(key.getKey());
        }
        return (LocalWriteResult) this.persistence.runTransaction("Locally write mutations", new h(this, hashSet, list, now));
    }
}
