package com.google.firebase.firestore.remote;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.protobuf.j;

public final class TargetChange {
    private final ImmutableSortedSet<DocumentKey> addedDocuments;
    private final boolean current;
    private final ImmutableSortedSet<DocumentKey> modifiedDocuments;
    private final ImmutableSortedSet<DocumentKey> removedDocuments;
    private final j resumeToken;

    public TargetChange(j jVar, boolean z10, ImmutableSortedSet<DocumentKey> immutableSortedSet, ImmutableSortedSet<DocumentKey> immutableSortedSet2, ImmutableSortedSet<DocumentKey> immutableSortedSet3) {
        this.resumeToken = jVar;
        this.current = z10;
        this.addedDocuments = immutableSortedSet;
        this.modifiedDocuments = immutableSortedSet2;
        this.removedDocuments = immutableSortedSet3;
    }

    public static TargetChange createSynthesizedTargetChangeForCurrentChange(boolean z10) {
        return new TargetChange(j.f8600f, z10, DocumentKey.emptyKeySet(), DocumentKey.emptyKeySet(), DocumentKey.emptyKeySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TargetChange.class != obj.getClass()) {
            return false;
        }
        TargetChange targetChange = (TargetChange) obj;
        if (this.current == targetChange.current && this.resumeToken.equals(targetChange.resumeToken) && this.addedDocuments.equals(targetChange.addedDocuments) && this.modifiedDocuments.equals(targetChange.modifiedDocuments)) {
            return this.removedDocuments.equals(targetChange.removedDocuments);
        }
        return false;
    }

    public ImmutableSortedSet<DocumentKey> getAddedDocuments() {
        return this.addedDocuments;
    }

    public ImmutableSortedSet<DocumentKey> getModifiedDocuments() {
        return this.modifiedDocuments;
    }

    public ImmutableSortedSet<DocumentKey> getRemovedDocuments() {
        return this.removedDocuments;
    }

    public j getResumeToken() {
        return this.resumeToken;
    }

    public int hashCode() {
        return (((((((this.resumeToken.hashCode() * 31) + (this.current ? 1 : 0)) * 31) + this.addedDocuments.hashCode()) * 31) + this.modifiedDocuments.hashCode()) * 31) + this.removedDocuments.hashCode();
    }

    public boolean isCurrent() {
        return this.current;
    }
}
