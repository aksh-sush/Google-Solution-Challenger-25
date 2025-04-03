package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class NotInFilter extends FieldFilter {
    NotInFilter(FieldPath fieldPath, x xVar) {
        super(fieldPath, Filter.Operator.NOT_IN, xVar);
        Assert.hardAssert(Values.isArray(xVar), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r3 = r3.getField(getField());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean matches(com.google.firebase.firestore.model.Document r3) {
        /*
            r2 = this;
            t5.x r0 = r2.getValue()
            t5.a r0 = r0.t()
            t5.x r1 = com.google.firebase.firestore.model.Values.NULL_VALUE
            boolean r0 = com.google.firebase.firestore.model.Values.contains(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0012
            return r1
        L_0x0012:
            com.google.firebase.firestore.model.FieldPath r0 = r2.getField()
            t5.x r3 = r3.getField(r0)
            if (r3 == 0) goto L_0x002b
            t5.x r0 = r2.getValue()
            t5.a r0 = r0.t()
            boolean r3 = com.google.firebase.firestore.model.Values.contains(r0, r3)
            if (r3 != 0) goto L_0x002b
            r1 = 1
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.NotInFilter.matches(com.google.firebase.firestore.model.Document):boolean");
    }
}
