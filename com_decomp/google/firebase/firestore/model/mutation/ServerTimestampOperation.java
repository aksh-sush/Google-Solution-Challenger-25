package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.ServerTimestamps;
import t5.x;

public class ServerTimestampOperation implements TransformOperation {
    private static final ServerTimestampOperation SHARED_INSTANCE = new ServerTimestampOperation();

    private ServerTimestampOperation() {
    }

    public static ServerTimestampOperation getInstance() {
        return SHARED_INSTANCE;
    }

    public x applyToLocalView(x xVar, Timestamp timestamp) {
        return ServerTimestamps.valueOf(timestamp, xVar);
    }

    public x applyToRemoteDocument(x xVar, x xVar2) {
        return xVar2;
    }

    public x computeBaseValue(x xVar) {
        return null;
    }
}
