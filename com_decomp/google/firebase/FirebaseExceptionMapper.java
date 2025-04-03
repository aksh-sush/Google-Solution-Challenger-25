package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;

public class FirebaseExceptionMapper implements t {
    public final Exception getException(Status status) {
        return status.V() == 8 ? new FirebaseException(status.zza()) : new FirebaseApiNotAvailableException(status.zza());
    }
}
