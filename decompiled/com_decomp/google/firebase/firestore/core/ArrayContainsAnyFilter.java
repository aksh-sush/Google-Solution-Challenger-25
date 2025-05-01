package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.Filter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import t5.x;

public class ArrayContainsAnyFilter extends FieldFilter {
    ArrayContainsAnyFilter(FieldPath fieldPath, x xVar) {
        super(fieldPath, Filter.Operator.ARRAY_CONTAINS_ANY, xVar);
        Assert.hardAssert(Values.isArray(xVar), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    public boolean matches(Document document) {
        x field = document.getField(getField());
        if (!Values.isArray(field)) {
            return false;
        }
        for (x contains : field.t().a()) {
            if (Values.contains(getValue().t(), contains)) {
                return true;
            }
        }
        return false;
    }
}
