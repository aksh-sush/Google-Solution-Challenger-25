package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.a0;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;

final class n0 implements IndexManager {

    /* renamed from: a  reason: collision with root package name */
    private final a0.a f8055a = new a0.a();

    /* renamed from: b  reason: collision with root package name */
    private final SQLitePersistence f8056b;

    n0(SQLitePersistence sQLitePersistence) {
        this.f8056b = sQLitePersistence;
    }

    public void addToCollectionParentIndex(ResourcePath resourcePath) {
        Assert.hardAssert(resourcePath.length() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f8055a.a(resourcePath)) {
            this.f8056b.execute("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", resourcePath.getLastSegment(), d.c((ResourcePath) resourcePath.popLast()));
        }
    }

    public List getCollectionParents(String str) {
        ArrayList arrayList = new ArrayList();
        this.f8056b.query("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new m0(arrayList));
        return arrayList;
    }
}
