package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import n4.j;

public abstract class w {
    public static void a(Status status, Object obj, j jVar) {
        if (status.j0()) {
            jVar.c(obj);
        } else {
            jVar.b(new b(status));
        }
    }

    public static void b(Status status, j jVar) {
        a(status, (Object) null, jVar);
    }

    public static boolean c(Status status, Object obj, j jVar) {
        return status.j0() ? jVar.e(obj) : jVar.d(new b(status));
    }
}
