package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpl;

final class y4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f6666e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i9 f6667f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f5 f6668g;

    y4(f5 f5Var, t tVar, i9 i9Var) {
        this.f6668g = f5Var;
        this.f6666e = tVar;
        this.f6667f = i9Var;
    }

    public final void run() {
        t Z = this.f6668g.Z(this.f6666e, this.f6667f);
        zzpl.zzc();
        if (this.f6668g.f5962a.T().B((String) null, y2.f6659x0)) {
            this.f6668g.c0(Z, this.f6667f);
        } else {
            this.f6668g.Y(Z, this.f6667f);
        }
    }
}
