package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import n4.j;

abstract class k2 extends x1 {

    /* renamed from: b  reason: collision with root package name */
    protected final j f5426b;

    public k2(int i10, j jVar) {
        super(i10);
        this.f5426b = jVar;
    }

    public final void a(Status status) {
        this.f5426b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.f5426b.d(exc);
    }

    public final void c(n1 n1Var) {
        try {
            h(n1Var);
        } catch (DeadObjectException e10) {
            a(r2.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(r2.e(e11));
        } catch (RuntimeException e12) {
            this.f5426b.d(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(n1 n1Var);
}
