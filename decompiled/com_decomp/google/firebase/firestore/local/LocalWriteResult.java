package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;

public final class LocalWriteResult {
    private final int batchId;
    private final ImmutableSortedMap<DocumentKey, Document> changes;

    LocalWriteResult(int i10, ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        this.batchId = i10;
        this.changes = immutableSortedMap;
    }

    public int getBatchId() {
        return this.batchId;
    }

    public ImmutableSortedMap<DocumentKey, Document> getChanges() {
        return this.changes;
    }
}
