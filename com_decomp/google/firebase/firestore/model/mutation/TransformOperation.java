package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import t5.x;

public interface TransformOperation {
    x applyToLocalView(x xVar, Timestamp timestamp);

    x applyToRemoteDocument(x xVar, x xVar2);

    x computeBaseValue(x xVar);
}
