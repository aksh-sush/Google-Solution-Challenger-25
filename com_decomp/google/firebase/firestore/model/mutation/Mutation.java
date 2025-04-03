package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.x;

public abstract class Mutation {
    private final List<FieldTransform> fieldTransforms;
    private final DocumentKey key;
    private final Precondition precondition;

    Mutation(DocumentKey documentKey, Precondition precondition2) {
        this(documentKey, precondition2, new ArrayList());
    }

    static SnapshotVersion getPostMutationVersion(MutableDocument mutableDocument) {
        return mutableDocument.isFoundDocument() ? mutableDocument.getVersion() : SnapshotVersion.NONE;
    }

    public abstract void applyToLocalView(MutableDocument mutableDocument, Timestamp timestamp);

    public abstract void applyToRemoteDocument(MutableDocument mutableDocument, MutationResult mutationResult);

    public ObjectValue extractTransformBaseValue(Document document) {
        ObjectValue objectValue = null;
        for (FieldTransform next : this.fieldTransforms) {
            x computeBaseValue = next.getOperation().computeBaseValue(document.getField(next.getFieldPath()));
            if (computeBaseValue != null) {
                if (objectValue == null) {
                    objectValue = new ObjectValue();
                }
                objectValue.set(next.getFieldPath(), computeBaseValue);
            }
        }
        return objectValue;
    }

    public List<FieldTransform> getFieldTransforms() {
        return this.fieldTransforms;
    }

    public DocumentKey getKey() {
        return this.key;
    }

    public Precondition getPrecondition() {
        return this.precondition;
    }

    /* access modifiers changed from: package-private */
    public boolean hasSameKeyAndPrecondition(Mutation mutation) {
        return this.key.equals(mutation.key) && this.precondition.equals(mutation.precondition);
    }

    /* access modifiers changed from: package-private */
    public int keyAndPreconditionHashCode() {
        return (getKey().hashCode() * 31) + this.precondition.hashCode();
    }

    /* access modifiers changed from: package-private */
    public String keyAndPreconditionToString() {
        return "key=" + this.key + ", precondition=" + this.precondition;
    }

    /* access modifiers changed from: protected */
    public Map<FieldPath, x> localTransformResults(Timestamp timestamp, MutableDocument mutableDocument) {
        HashMap hashMap = new HashMap(this.fieldTransforms.size());
        for (FieldTransform next : this.fieldTransforms) {
            hashMap.put(next.getFieldPath(), next.getOperation().applyToLocalView(mutableDocument.getField(next.getFieldPath()), timestamp));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public Map<FieldPath, x> serverTransformResults(MutableDocument mutableDocument, List<x> list) {
        HashMap hashMap = new HashMap(this.fieldTransforms.size());
        Assert.hardAssert(this.fieldTransforms.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.fieldTransforms.size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            FieldTransform fieldTransform = this.fieldTransforms.get(i10);
            hashMap.put(fieldTransform.getFieldPath(), fieldTransform.getOperation().applyToRemoteDocument(mutableDocument.getField(fieldTransform.getFieldPath()), list.get(i10)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void verifyKeyMatches(MutableDocument mutableDocument) {
        Assert.hardAssert(mutableDocument.getKey().equals(getKey()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    Mutation(DocumentKey documentKey, Precondition precondition2, List<FieldTransform> list) {
        this.key = documentKey;
        this.precondition = precondition2;
        this.fieldTransforms = list;
    }
}
