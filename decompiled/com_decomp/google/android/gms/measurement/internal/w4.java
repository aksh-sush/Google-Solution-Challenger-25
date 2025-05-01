package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;

final class w4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6538e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f5 f6539f;

    w4(f5 f5Var, i9 i9Var) {
        this.f6539f = f5Var;
        this.f6538e = i9Var;
    }

    public final void run() {
        this.f6539f.f5962a.a();
        w8 a02 = this.f6539f.f5962a;
        i9 i9Var = this.f6538e;
        a02.b().h();
        a02.g();
        s.g(i9Var.f6059e);
        a02.R(i9Var);
    }
}
