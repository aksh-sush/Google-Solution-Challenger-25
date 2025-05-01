package com.google.firebase.firestore.model;

import java.util.Comparator;
import t5.x;

public interface Document {
    public static final Comparator<Document> KEY_COMPARATOR = new a();

    ObjectValue getData();

    x getField(FieldPath fieldPath);

    DocumentKey getKey();

    SnapshotVersion getVersion();

    boolean hasCommittedMutations();

    boolean hasLocalMutations();

    boolean hasPendingWrites();

    boolean isFoundDocument();

    boolean isNoDocument();

    boolean isUnknownDocument();

    boolean isValidDocument();
}
