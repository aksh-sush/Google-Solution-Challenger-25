package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.a;

final class x4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6599e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f5 f6600f;

    x4(f5 f5Var, i9 i9Var) {
        this.f6600f = f5Var;
        this.f6599e = i9Var;
    }

    public final void run() {
        this.f6600f.f5962a.a();
        w8 a02 = this.f6600f.f5962a;
        i9 i9Var = this.f6599e;
        a02.b().h();
        a02.g();
        s.g(i9Var.f6059e);
        a b10 = a.b(i9Var.f6080z);
        a U = a02.U(i9Var.f6059e);
        a02.d().v().c("Setting consent, package, consent", i9Var.f6059e, b10);
        a02.y(i9Var.f6059e, b10);
        if (b10.m(U)) {
            a02.u(i9Var);
        }
    }
}
