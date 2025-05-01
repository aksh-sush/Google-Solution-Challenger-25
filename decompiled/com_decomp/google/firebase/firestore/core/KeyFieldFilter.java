package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class KeyFieldFilter extends FieldFilter {
    private final DocumentKey key = DocumentKey.fromName(getValue().B());

    KeyFieldFilter(FieldPath fieldPath, Filter.Operator operator, x xVar) {
        super(fieldPath, operator, xVar);
        Assert.hardAssert(Values.isReferenceValue(xVar), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
    }

    public boolean matches(Document document) {
        return matchesComparison(document.getKey().compareTo(this.key));
    }
}
