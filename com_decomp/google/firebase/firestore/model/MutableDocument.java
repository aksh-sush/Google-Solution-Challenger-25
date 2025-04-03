package com.google.firebase.firestore.model;

import t5.x;

public final class MutableDocument implements Document, Cloneable {
    private a documentState;
    private b documentType;
    private final DocumentKey key;
    private ObjectValue value;
    private SnapshotVersion version;

    private enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    private enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private MutableDocument(DocumentKey documentKey) {
        this.key = documentKey;
    }

    public static MutableDocument newFoundDocument(DocumentKey documentKey, SnapshotVersion snapshotVersion, ObjectValue objectValue) {
        return new MutableDocument(documentKey).convertToFoundDocument(snapshotVersion, objectValue);
    }

    public static MutableDocument newInvalidDocument(DocumentKey documentKey) {
        return new MutableDocument(documentKey, b.INVALID, SnapshotVersion.NONE, new ObjectValue(), a.SYNCED);
    }

    public static MutableDocument newNoDocument(DocumentKey documentKey, SnapshotVersion snapshotVersion) {
        return new MutableDocument(documentKey).convertToNoDocument(snapshotVersion);
    }

    public static MutableDocument newUnknownDocument(DocumentKey documentKey, SnapshotVersion snapshotVersion) {
        return new MutableDocument(documentKey).convertToUnknownDocument(snapshotVersion);
    }

    public MutableDocument clone() {
        return new MutableDocument(this.key, this.documentType, this.version, this.value.clone(), this.documentState);
    }

    public MutableDocument convertToFoundDocument(SnapshotVersion snapshotVersion, ObjectValue objectValue) {
        this.version = snapshotVersion;
        this.documentType = b.FOUND_DOCUMENT;
        this.value = objectValue;
        this.documentState = a.SYNCED;
        return this;
    }

    public MutableDocument convertToNoDocument(SnapshotVersion snapshotVersion) {
        this.version = snapshotVersion;
        this.documentType = b.NO_DOCUMENT;
        this.value = new ObjectValue();
        this.documentState = a.SYNCED;
        return this;
    }

    public MutableDocument convertToUnknownDocument(SnapshotVersion snapshotVersion) {
        this.version = snapshotVersion;
        this.documentType = b.UNKNOWN_DOCUMENT;
        this.value = new ObjectValue();
        this.documentState = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutableDocument.class != obj.getClass()) {
            return false;
        }
        MutableDocument mutableDocument = (MutableDocument) obj;
        if (this.key.equals(mutableDocument.key) && this.version.equals(mutableDocument.version) && this.documentType.equals(mutableDocument.documentType) && this.documentState.equals(mutableDocument.documentState)) {
            return this.value.equals(mutableDocument.value);
        }
        return false;
    }

    public ObjectValue getData() {
        return this.value;
    }

    public x getField(FieldPath fieldPath) {
        return getData().get(fieldPath);
    }

    public DocumentKey getKey() {
        return this.key;
    }

    public SnapshotVersion getVersion() {
        return this.version;
    }

    public boolean hasCommittedMutations() {
        return this.documentState.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    public boolean hasLocalMutations() {
        return this.documentState.equals(a.HAS_LOCAL_MUTATIONS);
    }

    public boolean hasPendingWrites() {
        return hasLocalMutations() || hasCommittedMutations();
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public boolean isFoundDocument() {
        return this.documentType.equals(b.FOUND_DOCUMENT);
    }

    public boolean isNoDocument() {
        return this.documentType.equals(b.NO_DOCUMENT);
    }

    public boolean isUnknownDocument() {
        return this.documentType.equals(b.UNKNOWN_DOCUMENT);
    }

    public boolean isValidDocument() {
        return !this.documentType.equals(b.INVALID);
    }

    public MutableDocument setHasCommittedMutations() {
        this.documentState = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public MutableDocument setHasLocalMutations() {
        this.documentState = a.HAS_LOCAL_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.key + ", version=" + this.version + ", type=" + this.documentType + ", documentState=" + this.documentState + ", value=" + this.value + '}';
    }

    private MutableDocument(DocumentKey documentKey, b bVar, SnapshotVersion snapshotVersion, ObjectValue objectValue, a aVar) {
        this.key = documentKey;
        this.version = snapshotVersion;
        this.documentType = bVar;
        this.documentState = aVar;
        this.value = objectValue;
    }
}
