package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.IndexRange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import t5.x;

public class SQLiteCollectionIndex {

    /* renamed from: db  reason: collision with root package name */
    private final SQLitePersistence f7930db;
    private final String uid;

    SQLiteCollectionIndex(SQLitePersistence sQLitePersistence, User user) {
        this.f7930db = sQLitePersistence;
        this.uid = user.isAuthenticated() ? user.getUid() : "";
    }

    public void addEntry(FieldPath fieldPath, x xVar, DocumentKey documentKey) {
        throw new RuntimeException("Not yet implemented.");
    }

    public IndexCursor getCursor(ResourcePath resourcePath, IndexRange indexRange) {
        throw new RuntimeException("Not yet implemented.");
    }

    public void removeEntry(FieldPath fieldPath, x xVar, DocumentKey documentKey) {
        throw new RuntimeException("Not yet implemented.");
    }
}
