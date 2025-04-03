package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.List;
import t5.x;

public final class Bound {
    private final boolean before;
    private final List<x> position;

    public Bound(List<x> list, boolean z10) {
        this.position = list;
        this.before = z10;
    }

    public String canonicalString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.before ? "b:" : "a:");
        boolean z10 = true;
        for (x next : this.position) {
            if (!z10) {
                sb2.append(",");
            }
            sb2.append(Values.canonicalId(next));
            z10 = false;
        }
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bound.class != obj.getClass()) {
            return false;
        }
        Bound bound = (Bound) obj;
        return this.before == bound.before && this.position.equals(bound.position);
    }

    public List<x> getPosition() {
        return this.position;
    }

    public int hashCode() {
        return ((this.before ? 1 : 0) * true) + this.position.hashCode();
    }

    public boolean isBefore() {
        return this.before;
    }

    public boolean sortsBeforeDocument(List<OrderBy> list, Document document) {
        int i10;
        Assert.hardAssert(this.position.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i11 = 0;
        for (int i12 = 0; i12 < this.position.size(); i12++) {
            OrderBy orderBy = list.get(i12);
            x xVar = this.position.get(i12);
            if (orderBy.field.equals(FieldPath.KEY_PATH)) {
                Assert.hardAssert(Values.isReferenceValue(xVar), "Bound has a non-key value where the key path is being used %s", xVar);
                i10 = DocumentKey.fromName(xVar.B()).compareTo(document.getKey());
            } else {
                x field = document.getField(orderBy.getField());
                Assert.hardAssert(field != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i10 = Values.compare(xVar, field);
            }
            if (orderBy.getDirection().equals(OrderBy.Direction.DESCENDING)) {
                i10 *= -1;
            }
            i11 = i10;
            if (i11 != 0) {
                break;
            }
        }
        if (this.before) {
            if (i11 <= 0) {
                return true;
            }
        } else if (i11 < 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Bound{before=" + this.before + ", position=" + this.position + '}';
    }
}
