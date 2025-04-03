package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.Values;
import java.util.Collections;
import java.util.List;
import t5.a;
import t5.x;

public abstract class ArrayTransformOperation implements TransformOperation {
    private final List<x> elements;

    public static class Remove extends ArrayTransformOperation {
        public Remove(List<x> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        public x apply(x xVar) {
            a.b coercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(xVar);
            for (x next : getElements()) {
                int i10 = 0;
                while (i10 < coercedFieldValuesArray.h()) {
                    if (Values.equals(coercedFieldValuesArray.g(i10), next)) {
                        coercedFieldValuesArray.i(i10);
                    } else {
                        i10++;
                    }
                }
            }
            return (x) x.F().f(coercedFieldValuesArray).build();
        }
    }

    public static class Union extends ArrayTransformOperation {
        public Union(List<x> list) {
            super(list);
        }

        /* access modifiers changed from: protected */
        public x apply(x xVar) {
            a.b coercedFieldValuesArray = ArrayTransformOperation.coercedFieldValuesArray(xVar);
            for (x next : getElements()) {
                if (!Values.contains(coercedFieldValuesArray, next)) {
                    coercedFieldValuesArray.f(next);
                }
            }
            return (x) x.F().f(coercedFieldValuesArray).build();
        }
    }

    ArrayTransformOperation(List<x> list) {
        this.elements = Collections.unmodifiableList(list);
    }

    static a.b coercedFieldValuesArray(x xVar) {
        return Values.isArray(xVar) ? (a.b) xVar.t().toBuilder() : a.r();
    }

    /* access modifiers changed from: protected */
    public abstract x apply(x xVar);

    public x applyToLocalView(x xVar, Timestamp timestamp) {
        return apply(xVar);
    }

    public x applyToRemoteDocument(x xVar, x xVar2) {
        return apply(xVar);
    }

    public x computeBaseValue(x xVar) {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.elements.equals(((ArrayTransformOperation) obj).elements);
    }

    public List<x> getElements() {
        return this.elements;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.elements.hashCode();
    }
}
