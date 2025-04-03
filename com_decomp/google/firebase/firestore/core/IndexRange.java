package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class IndexRange {
    private final x end;
    private final FieldPath fieldPath;
    private final x start;

    public static class Builder {
        /* access modifiers changed from: private */
        public x end;
        /* access modifiers changed from: private */
        public FieldPath fieldPath;
        /* access modifiers changed from: private */
        public x start;

        public IndexRange build() {
            Assert.hardAssert(this.fieldPath != null, "Field path must be specified", new Object[0]);
            return new IndexRange(this);
        }

        public Builder setEnd(x xVar) {
            this.end = xVar;
            return this;
        }

        public Builder setFieldPath(FieldPath fieldPath2) {
            this.fieldPath = fieldPath2;
            return this;
        }

        public Builder setStart(x xVar) {
            this.start = xVar;
            return this;
        }
    }

    private IndexRange(Builder builder) {
        this.fieldPath = builder.fieldPath;
        this.start = builder.start;
        this.end = builder.end;
    }

    public static Builder builder() {
        return new Builder();
    }

    public x getEnd() {
        return this.end;
    }

    public FieldPath getFieldPath() {
        return this.fieldPath;
    }

    public x getStart() {
        return this.start;
    }
}
