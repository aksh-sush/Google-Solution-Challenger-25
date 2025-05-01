package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Map;

interface i0 {
    void a(MutableDocument mutableDocument, SnapshotVersion snapshotVersion);

    MutableDocument b(DocumentKey documentKey);

    ImmutableSortedMap c(Query query, SnapshotVersion snapshotVersion);

    void d(DocumentKey documentKey);

    Map e(Iterable iterable);
}
