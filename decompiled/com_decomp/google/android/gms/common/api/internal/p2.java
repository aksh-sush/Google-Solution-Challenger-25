package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import n4.j;
import q3.d;

public final class p2 extends x1 {

    /* renamed from: b  reason: collision with root package name */
    private final v f5475b;

    /* renamed from: c  reason: collision with root package name */
    private final j f5476c;

    /* renamed from: d  reason: collision with root package name */
    private final t f5477d;

    public p2(int i10, v vVar, j jVar, t tVar) {
        super(i10);
        this.f5476c = jVar;
        this.f5475b = vVar;
        this.f5477d = tVar;
        if (i10 == 2 && vVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f5476c.d(this.f5477d.getException(status));
    }

    public final void b(Exception exc) {
        this.f5476c.d(exc);
    }

    public final void c(n1 n1Var) {
        try {
            this.f5475b.b(n1Var.s(), this.f5476c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(r2.e(e11));
        } catch (RuntimeException e12) {
            this.f5476c.d(e12);
        }
    }

    public final void d(c0 c0Var, boolean z10) {
        c0Var.d(this.f5476c, z10);
    }

    public final boolean f(n1 n1Var) {
        return this.f5475b.c();
    }

    public final d[] g(n1 n1Var) {
        return this.f5475b.e();
    }
}
