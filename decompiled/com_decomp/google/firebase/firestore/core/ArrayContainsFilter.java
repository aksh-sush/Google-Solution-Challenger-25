package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import t5.x;

public class ArrayContainsFilter extends FieldFilter {
    ArrayContainsFilter(FieldPath fieldPath, x xVar) {
        super(fieldPath, Filter.Operator.ARRAY_CONTAINS, xVar);
    }

    public boolean matches(Document document) {
        x field = document.getField(getField());
        return Values.isArray(field) && Values.contains(field.t(), getValue());
    }
}
