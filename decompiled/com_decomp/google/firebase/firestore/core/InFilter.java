package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class InFilter extends FieldFilter {
    InFilter(FieldPath fieldPath, x xVar) {
        super(fieldPath, Filter.Operator.IN, xVar);
        Assert.hardAssert(Values.isArray(xVar), "InFilter expects an ArrayValue", new Object[0]);
    }

    public boolean matches(Document document) {
        x field = document.getField(getField());
        return field != null && Values.contains(getValue().t(), field);
    }
}
