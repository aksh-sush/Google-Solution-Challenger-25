package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.util.Assert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f7975a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f7976b;

    /* renamed from: c  reason: collision with root package name */
    private final IndexManager f7977c;

    e(i0 i0Var, g0 g0Var, IndexManager indexManager) {
        this.f7975a = i0Var;
        this.f7976b = g0Var;
        this.f7977c = indexManager;
    }

    private ImmutableSortedMap a(List list, ImmutableSortedMap immutableSortedMap) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Mutation next : ((MutationBatch) it.next()).getMutations()) {
                if ((next instanceof PatchMutation) && !immutableSortedMap.containsKey(next.getKey())) {
                    hashSet.add(next.getKey());
                }
            }
        }
        for (Map.Entry entry : this.f7975a.e(hashSet).entrySet()) {
            if (((MutableDocument) entry.getValue()).isFoundDocument()) {
                immutableSortedMap = immutableSortedMap.insert((DocumentKey) entry.getKey(), (MutableDocument) entry.getValue());
            }
        }
        return immutableSortedMap;
    }

    private void b(Map map, List list) {
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((MutationBatch) it.next()).applyToLocalView((MutableDocument) entry.getValue());
            }
        }
    }

    private Document d(DocumentKey documentKey, List list) {
        MutableDocument b10 = this.f7975a.b(documentKey);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((MutationBatch) it.next()).applyToLocalView(b10);
        }
        return b10;
    }

    private ImmutableSortedMap f(Query query, SnapshotVersion snapshotVersion) {
        Assert.hardAssert(query.getPath().isEmpty(), "Currently we only support collection group queries at the root.", new Object[0]);
        String collectionGroup = query.getCollectionGroup();
        ImmutableSortedMap<DocumentKey, Document> emptyDocumentMap = DocumentCollections.emptyDocumentMap();
        for (ResourcePath append : this.f7977c.getCollectionParents(collectionGroup)) {
            Iterator it = g(query.asCollectionQueryAtPath((ResourcePath) append.append(collectionGroup)), snapshotVersion).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                emptyDocumentMap = emptyDocumentMap.insert((DocumentKey) entry.getKey(), (Document) entry.getValue());
            }
        }
        return emptyDocumentMap;
    }

    private ImmutableSortedMap g(Query query, SnapshotVersion snapshotVersion) {
        ImmutableSortedMap c10 = this.f7975a.c(query, snapshotVersion);
        List<MutationBatch> h10 = this.f7976b.h(query);
        ImmutableSortedMap a10 = a(h10, c10);
        for (MutationBatch mutationBatch : h10) {
            for (Mutation next : mutationBatch.getMutations()) {
                if (query.getPath().isImmediateParentOf(next.getKey().getPath())) {
                    DocumentKey key = next.getKey();
                    MutableDocument mutableDocument = (MutableDocument) a10.get(key);
                    if (mutableDocument == null) {
                        mutableDocument = MutableDocument.newInvalidDocument(key);
                        a10 = a10.insert(key, mutableDocument);
                    }
                    next.applyToLocalView(mutableDocument, mutationBatch.getLocalWriteTime());
                    if (!mutableDocument.isFoundDocument()) {
                        a10 = a10.remove(key);
                    }
                }
            }
        }
        ImmutableSortedMap<DocumentKey, Document> emptyDocumentMap = DocumentCollections.emptyDocumentMap();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (query.matches((Document) entry.getValue())) {
                emptyDocumentMap = emptyDocumentMap.insert((DocumentKey) entry.getKey(), (Document) entry.getValue());
            }
        }
        return emptyDocumentMap;
    }

    private ImmutableSortedMap h(ResourcePath resourcePath) {
        ImmutableSortedMap<DocumentKey, Document> emptyDocumentMap = DocumentCollections.emptyDocumentMap();
        Document c10 = c(DocumentKey.fromPath(resourcePath));
        return c10.isFoundDocument() ? emptyDocumentMap.insert(c10.getKey(), c10) : emptyDocumentMap;
    }

    /* access modifiers changed from: package-private */
    public Document c(DocumentKey documentKey) {
        return d(documentKey, this.f7976b.i(documentKey));
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedMap e(Iterable iterable) {
        return j(this.f7975a.e(iterable));
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedMap i(Query query, SnapshotVersion snapshotVersion) {
        ResourcePath path = query.getPath();
        if (query.isDocumentQuery()) {
            return h(path);
        }
        return query.isCollectionGroupQuery() ? f(query, snapshotVersion) : g(query, snapshotVersion);
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedMap j(Map map) {
        ImmutableSortedMap<DocumentKey, Document> emptyDocumentMap = DocumentCollections.emptyDocumentMap();
        b(map, this.f7976b.d(map.keySet()));
        for (Map.Entry entry : map.entrySet()) {
            emptyDocumentMap = emptyDocumentMap.insert((DocumentKey) entry.getKey(), (Document) entry.getValue());
        }
        return emptyDocumentMap;
    }
}
