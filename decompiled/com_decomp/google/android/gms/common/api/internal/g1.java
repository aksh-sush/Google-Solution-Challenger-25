package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zap;
import java.util.concurrent.ExecutorService;
import z3.c;

public abstract class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f5370a = zap.zaa().zac(2, new c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f5370a;
    }
}
