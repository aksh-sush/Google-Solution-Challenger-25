package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;

public final class o2 extends r2 {

    /* renamed from: b  reason: collision with root package name */
    protected final e f5470b;

    public o2(int i10, e eVar) {
        super(i10);
        this.f5470b = (e) s.l(eVar, "Null methods are not runnable.");
    }

    public final void a(Status status) {
        try {
            this.f5470b.setFailedResult(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb2.append(simpleName);
        sb2.append(": ");
        sb2.append(localizedMessage);
        try {
            this.f5470b.setFailedResult(new Status(10, sb2.toString()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    public final void c(n1 n1Var) {
        try {
            this.f5470b.run(n1Var.s());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(c0 c0Var, boolean z10) {
        c0Var.c(this.f5470b, z10);
    }
}
