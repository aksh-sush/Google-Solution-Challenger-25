package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class OrderBy {
    private final Direction direction;
    final FieldPath field;

    public enum Direction {
        ASCENDING(1),
        DESCENDING(-1);
        
        private final int comparisonModifier;

        private Direction(int i10) {
            this.comparisonModifier = i10;
        }

        /* access modifiers changed from: package-private */
        public int getComparisonModifier() {
            return this.comparisonModifier;
        }
    }

    private OrderBy(Direction direction2, FieldPath fieldPath) {
        this.direction = direction2;
        this.field = fieldPath;
    }

    public static OrderBy getInstance(Direction direction2, FieldPath fieldPath) {
        return new OrderBy(direction2, fieldPath);
    }

    /* access modifiers changed from: package-private */
    public int compare(Document document, Document document2) {
        int comparisonModifier;
        int compare;
        if (this.field.equals(FieldPath.KEY_PATH)) {
            comparisonModifier = this.direction.getComparisonModifier();
            compare = document.getKey().compareTo(document2.getKey());
        } else {
            x field2 = document.getField(this.field);
            x field3 = document2.getField(this.field);
            Assert.hardAssert((field2 == null || field3 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            comparisonModifier = this.direction.getComparisonModifier();
            compare = Values.compare(field2, field3);
        }
        return comparisonModifier * compare;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OrderBy)) {
            return false;
        }
        OrderBy orderBy = (OrderBy) obj;
        return this.direction == orderBy.direction && this.field.equals(orderBy.field);
    }

    public Direction getDirection() {
        return this.direction;
    }

    public FieldPath getField() {
        return this.field;
    }

    public int hashCode() {
        return ((899 + this.direction.hashCode()) * 31) + this.field.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.direction == Direction.ASCENDING ? "" : "-");
        sb2.append(this.field.canonicalString());
        return sb2.toString();
    }
}
