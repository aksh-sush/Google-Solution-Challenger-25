package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;

public final class DeleteMutation extends Mutation {
    public DeleteMutation(DocumentKey documentKey, Precondition precondition) {
        super(documentKey, precondition);
    }

    public void applyToLocalView(MutableDocument mutableDocument, Timestamp timestamp) {
        verifyKeyMatches(mutableDocument);
        if (getPrecondition().isValidFor(mutableDocument)) {
            mutableDocument.convertToNoDocument(SnapshotVersion.NONE);
        }
    }

    public void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult) {
        verifyKeyMatches(mutableDocument);
        Assert.hardAssert(mutationResult.getTransformResults().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        mutableDocument.convertToNoDocument(mutationResult.getVersion()).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeleteMutation.class != obj.getClass()) {
            return false;
        }
        return hasSameKeyAndPrecondition((DeleteMutation) obj);
    }

    public int hashCode() {
        return keyAndPreconditionHashCode();
    }

    public String toString() {
        return "DeleteMutation{" + keyAndPreconditionToString() + "}";
    }
}
