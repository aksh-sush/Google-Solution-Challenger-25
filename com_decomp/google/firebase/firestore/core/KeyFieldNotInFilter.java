package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.List;

public class KeyFieldNotInFilter extends FieldFilter {
    private final List<DocumentKey> keys;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    KeyFieldNotInFilter(com.google.firebase.firestore.model.FieldPath r2, t5.x r3) {
        /*
            r1 = this;
            com.google.firebase.firestore.core.Filter$Operator r0 = com.google.firebase.firestore.core.Filter.Operator.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.keys = r2
            java.util.List r3 = com.google.firebase.firestore.core.KeyFieldInFilter.extractDocumentKeysFromArrayValue(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.KeyFieldNotInFilter.<init>(com.google.firebase.firestore.model.FieldPath, t5.x):void");
    }

    public boolean matches(Document document) {
        return !this.keys.contains(document.getKey());
    }
}
