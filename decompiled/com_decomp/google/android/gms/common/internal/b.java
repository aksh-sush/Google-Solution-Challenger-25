package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

public abstract class b {
    public static com.google.android.gms.common.api.b a(Status status) {
        return status.X() ? new f(status) : new com.google.android.gms.common.api.b(status);
    }
}
