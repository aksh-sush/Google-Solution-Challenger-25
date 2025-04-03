package com.google.firebase.firestore.local;

import android.util.Pair;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class e0 implements i0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public ImmutableSortedMap f7978a = ImmutableSortedMap.Builder.emptyMap(DocumentKey.comparator());

    /* renamed from: b  reason: collision with root package name */
    private final MemoryPersistence f7979b;

    private class b implements Iterable {

        class a implements Iterator {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Iterator f7981e;

            a(Iterator it) {
                this.f7981e = it;
            }

            /* renamed from: b */
            public MutableDocument next() {
                return (MutableDocument) ((Pair) ((Map.Entry) this.f7981e.next()).getValue()).first;
            }

            public boolean hasNext() {
                return this.f7981e.hasNext();
            }
        }

        private b() {
        }

        public Iterator iterator() {
            return new a(e0.this.f7978a.iterator());
        }
    }

    e0(MemoryPersistence memoryPersistence) {
        this.f7979b = memoryPersistence;
    }

    public void a(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.hardAssert(!snapshotVersion.equals(SnapshotVersion.NONE), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f7978a = this.f7978a.insert(mutableDocument.getKey(), new Pair(mutableDocument.clone(), snapshotVersion));
        this.f7979b.getIndexManager().addToCollectionParentIndex((ResourcePath) mutableDocument.getKey().getPath().popLast());
    }

    public MutableDocument b(DocumentKey documentKey) {
        Pair pair = (Pair) this.f7978a.get(documentKey);
        return pair != null ? ((MutableDocument) pair.first).clone() : MutableDocument.newInvalidDocument(documentKey);
    }

    public ImmutableSortedMap c(Query query, SnapshotVersion snapshotVersion) {
        Assert.hardAssert(!query.isCollectionGroupQuery(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ImmutableSortedMap<DocumentKey, MutableDocument> emptyMutableDocumentMap = DocumentCollections.emptyMutableDocumentMap();
        ResourcePath path = query.getPath();
        Iterator iteratorFrom = this.f7978a.iteratorFrom(DocumentKey.fromPath((ResourcePath) path.append("")));
        while (iteratorFrom.hasNext()) {
            Map.Entry entry = (Map.Entry) iteratorFrom.next();
            if (!path.isPrefixOf(((DocumentKey) entry.getKey()).getPath())) {
                break;
            }
            MutableDocument mutableDocument = (MutableDocument) ((Pair) entry.getValue()).first;
            if (mutableDocument.isFoundDocument() && ((SnapshotVersion) ((Pair) entry.getValue()).second).compareTo(snapshotVersion) > 0 && query.matches(mutableDocument)) {
                emptyMutableDocumentMap = emptyMutableDocumentMap.insert(mutableDocument.getKey(), mutableDocument.clone());
            }
        }
        return emptyMutableDocumentMap;
    }

    public void d(DocumentKey documentKey) {
        this.f7978a = this.f7978a.remove(documentKey);
    }

    public Map e(Iterable iterable) {
        HashMap hashMap = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            hashMap.put(documentKey, b(documentKey));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public long g(LocalSerializer localSerializer) {
        Iterator it = new b().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) localSerializer.encodeMaybeDocument((MutableDocument) it.next()).getSerializedSize();
        }
        return j10;
    }

    /* access modifiers changed from: package-private */
    public Iterable h() {
        return new b();
    }
}
