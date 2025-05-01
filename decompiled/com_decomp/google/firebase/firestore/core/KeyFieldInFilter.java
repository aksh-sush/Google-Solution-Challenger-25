package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import t5.x;

public class KeyFieldInFilter extends FieldFilter {
    private final List<DocumentKey> keys;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    KeyFieldInFilter(com.google.firebase.firestore.model.FieldPath r2, t5.x r3) {
        /*
            r1 = this;
            com.google.firebase.firestore.core.Filter$Operator r0 = com.google.firebase.firestore.core.Filter.Operator.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.keys = r2
            java.util.List r3 = extractDocumentKeysFromArrayValue(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.KeyFieldInFilter.<init>(com.google.firebase.firestore.model.FieldPath, t5.x):void");
    }

    static List<DocumentKey> extractDocumentKeysFromArrayValue(Filter.Operator operator, x xVar) {
        Assert.hardAssert(operator == Filter.Operator.IN || operator == Filter.Operator.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        Assert.hardAssert(Values.isArray(xVar), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (x xVar2 : xVar.t().a()) {
            boolean isReferenceValue = Values.isReferenceValue(xVar2);
            Assert.hardAssert(isReferenceValue, "Comparing on key with " + operator.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(DocumentKey.fromName(xVar2.B()));
        }
        return arrayList;
    }

    public boolean matches(Document document) {
        return this.keys.contains(document.getKey());
    }
}
