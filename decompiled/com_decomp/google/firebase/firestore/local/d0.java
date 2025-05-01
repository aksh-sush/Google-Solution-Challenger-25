package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class d0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final List f7966a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private ImmutableSortedSet f7967b = new ImmutableSortedSet(Collections.emptyList(), c.f7953c);

    /* renamed from: c  reason: collision with root package name */
    private int f7968c = 1;

    /* renamed from: d  reason: collision with root package name */
    private j f7969d = WriteStream.EMPTY_STREAM_TOKEN;

    /* renamed from: e  reason: collision with root package name */
    private final MemoryPersistence f7970e;

    d0(MemoryPersistence memoryPersistence) {
        this.f7970e = memoryPersistence;
    }

    private int o(int i10) {
        if (this.f7966a.isEmpty()) {
            return 0;
        }
        return i10 - ((MutationBatch) this.f7966a.get(0)).getBatchId();
    }

    private int p(int i10, String str) {
        int o10 = o(i10);
        Assert.hardAssert(o10 >= 0 && o10 < this.f7966a.size(), "Batches must exist to be %s", str);
        return o10;
    }

    private List r(ImmutableSortedSet immutableSortedSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            MutationBatch f10 = f(((Integer) it.next()).intValue());
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        return arrayList;
    }

    public void a() {
        if (this.f7966a.isEmpty()) {
            Assert.hardAssert(this.f7967b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    public MutationBatch b(int i10) {
        int o10 = o(i10 + 1);
        if (o10 < 0) {
            o10 = 0;
        }
        if (this.f7966a.size() > o10) {
            return (MutationBatch) this.f7966a.get(o10);
        }
        return null;
    }

    public int c() {
        if (this.f7966a.isEmpty()) {
            return -1;
        }
        return this.f7968c - 1;
    }

    public List d(Iterable iterable) {
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.emptyList(), Util.comparator());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            Iterator iteratorFrom = this.f7967b.iteratorFrom(new c(documentKey, 0));
            while (iteratorFrom.hasNext()) {
                c cVar = (c) iteratorFrom.next();
                if (!documentKey.equals(cVar.d())) {
                    break;
                }
                immutableSortedSet = immutableSortedSet.insert(Integer.valueOf(cVar.c()));
            }
        }
        return r(immutableSortedSet);
    }

    public MutationBatch e(Timestamp timestamp, List list, List list2) {
        boolean z10 = true;
        Assert.hardAssert(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i10 = this.f7968c;
        this.f7968c = i10 + 1;
        int size = this.f7966a.size();
        if (size > 0) {
            if (((MutationBatch) this.f7966a.get(size - 1)).getBatchId() >= i10) {
                z10 = false;
            }
            Assert.hardAssert(z10, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        MutationBatch mutationBatch = new MutationBatch(i10, timestamp, list, list2);
        this.f7966a.add(mutationBatch);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Mutation mutation = (Mutation) it.next();
            this.f7967b = this.f7967b.insert(new c(mutation.getKey(), i10));
            this.f7970e.getIndexManager().addToCollectionParentIndex((ResourcePath) mutation.getKey().getPath().popLast());
        }
        return mutationBatch;
    }

    public MutationBatch f(int i10) {
        int o10 = o(i10);
        if (o10 < 0 || o10 >= this.f7966a.size()) {
            return null;
        }
        MutationBatch mutationBatch = (MutationBatch) this.f7966a.get(o10);
        Assert.hardAssert(mutationBatch.getBatchId() == i10, "If found batch must match", new Object[0]);
        return mutationBatch;
    }

    public void g(MutationBatch mutationBatch) {
        Assert.hardAssert(p(mutationBatch.getBatchId(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f7966a.remove(0);
        ImmutableSortedSet immutableSortedSet = this.f7967b;
        for (Mutation key : mutationBatch.getMutations()) {
            DocumentKey key2 = key.getKey();
            this.f7970e.getReferenceDelegate().e(key2);
            immutableSortedSet = immutableSortedSet.remove(new c(key2, mutationBatch.getBatchId()));
        }
        this.f7967b = immutableSortedSet;
    }

    public j getLastStreamToken() {
        return this.f7969d;
    }

    public List h(Query query) {
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath path = query.getPath();
        int length = path.length() + 1;
        c cVar = new c(DocumentKey.fromPath(!DocumentKey.isDocumentKey(path) ? (ResourcePath) path.append("") : path), 0);
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.emptyList(), Util.comparator());
        Iterator iteratorFrom = this.f7967b.iteratorFrom(cVar);
        while (iteratorFrom.hasNext()) {
            c cVar2 = (c) iteratorFrom.next();
            ResourcePath path2 = cVar2.d().getPath();
            if (!path.isPrefixOf(path2)) {
                break;
            } else if (path2.length() == length) {
                immutableSortedSet = immutableSortedSet.insert(Integer.valueOf(cVar2.c()));
            }
        }
        return r(immutableSortedSet);
    }

    public List i(DocumentKey documentKey) {
        c cVar = new c(documentKey, 0);
        ArrayList arrayList = new ArrayList();
        Iterator iteratorFrom = this.f7967b.iteratorFrom(cVar);
        while (iteratorFrom.hasNext()) {
            c cVar2 = (c) iteratorFrom.next();
            if (!documentKey.equals(cVar2.d())) {
                break;
            }
            MutationBatch f10 = f(cVar2.c());
            Assert.hardAssert(f10 != null, "Batches in the index must exist in the main table", new Object[0]);
            arrayList.add(f10);
        }
        return arrayList;
    }

    public void j(MutationBatch mutationBatch, j jVar) {
        int batchId = mutationBatch.getBatchId();
        int p10 = p(batchId, "acknowledged");
        Assert.hardAssert(p10 == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        MutationBatch mutationBatch2 = (MutationBatch) this.f7966a.get(p10);
        Assert.hardAssert(batchId == mutationBatch2.getBatchId(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(batchId), Integer.valueOf(mutationBatch2.getBatchId()));
        this.f7969d = (j) Preconditions.checkNotNull(jVar);
    }

    public void k(j jVar) {
        this.f7969d = (j) Preconditions.checkNotNull(jVar);
    }

    public List l() {
        return Collections.unmodifiableList(this.f7966a);
    }

    /* access modifiers changed from: package-private */
    public boolean m(DocumentKey documentKey) {
        Iterator iteratorFrom = this.f7967b.iteratorFrom(new c(documentKey, 0));
        if (!iteratorFrom.hasNext()) {
            return false;
        }
        return ((c) iteratorFrom.next()).d().equals(documentKey);
    }

    /* access modifiers changed from: package-private */
    public long n(LocalSerializer localSerializer) {
        long j10 = 0;
        for (MutationBatch encodeMutationBatch : this.f7966a) {
            j10 += (long) localSerializer.encodeMutationBatch(encodeMutationBatch).getSerializedSize();
        }
        return j10;
    }

    public boolean q() {
        return this.f7966a.isEmpty();
    }

    public void start() {
        if (q()) {
            this.f7968c = 1;
        }
    }
}
