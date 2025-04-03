package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.x;

public final class PatchMutation extends Mutation {
    private final FieldMask mask;
    private final ObjectValue value;

    public PatchMutation(DocumentKey documentKey, ObjectValue objectValue, FieldMask fieldMask, Precondition precondition) {
        this(documentKey, objectValue, fieldMask, precondition, new ArrayList());
    }

    private Map<FieldPath, x> getPatch() {
        HashMap hashMap = new HashMap();
        for (FieldPath next : this.mask.getMask()) {
            if (!next.isEmpty()) {
                hashMap.put(next, this.value.get(next));
            }
        }
        return hashMap;
    }

    public void applyToLocalView(MutableDocument mutableDocument, Timestamp timestamp) {
        verifyKeyMatches(mutableDocument);
        if (getPrecondition().isValidFor(mutableDocument)) {
            Map<FieldPath, x> localTransformResults = localTransformResults(timestamp, mutableDocument);
            ObjectValue data = mutableDocument.getData();
            data.setAll(getPatch());
            data.setAll(localTransformResults);
            mutableDocument.convertToFoundDocument(Mutation.getPostMutationVersion(mutableDocument), mutableDocument.getData()).setHasLocalMutations();
        }
    }

    public void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult) {
        verifyKeyMatches(mutableDocument);
        if (!getPrecondition().isValidFor(mutableDocument)) {
            mutableDocument.convertToUnknownDocument(mutationResult.getVersion());
            return;
        }
        Map<FieldPath, x> serverTransformResults = serverTransformResults(mutableDocument, mutationResult.getTransformResults());
        ObjectValue data = mutableDocument.getData();
        data.setAll(getPatch());
        data.setAll(serverTransformResults);
        mutableDocument.convertToFoundDocument(mutationResult.getVersion(), mutableDocument.getData()).setHasCommittedMutations();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PatchMutation.class != obj.getClass()) {
            return false;
        }
        PatchMutation patchMutation = (PatchMutation) obj;
        return hasSameKeyAndPrecondition(patchMutation) && this.value.equals(patchMutation.value) && getFieldTransforms().equals(patchMutation.getFieldTransforms());
    }

    public FieldMask getMask() {
        return this.mask;
    }

    public ObjectValue getValue() {
        return this.value;
    }

    public int hashCode() {
        return (keyAndPreconditionHashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "PatchMutation{" + keyAndPreconditionToString() + ", mask=" + this.mask + ", value=" + this.value + "}";
    }

    public PatchMutation(DocumentKey documentKey, ObjectValue objectValue, FieldMask fieldMask, Precondition precondition, List<FieldTransform> list) {
        super(documentKey, precondition, list);
        this.value = objectValue;
        this.mask = fieldMask;
    }
}
