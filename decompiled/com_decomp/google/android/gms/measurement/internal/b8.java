package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class b8 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c8 f5867e;

    public /* synthetic */ b8(c8 c8Var) {
        this.f5867e = c8Var;
    }

    public final void run() {
        c8 c8Var = this.f5867e;
        d8 d8Var = c8Var.f5900g;
        long j10 = c8Var.f5898e;
        long j11 = c8Var.f5899f;
        d8Var.f5920b.h();
        d8Var.f5920b.f5994a.d().q().a("Application going to the background");
        boolean z10 = true;
        d8Var.f5920b.f5994a.F().f6531q.a(true);
        Bundle bundle = new Bundle();
        if (!d8Var.f5920b.f5994a.z().D()) {
            d8Var.f5920b.f6030e.b(j11);
            if (d8Var.f5920b.f5994a.z().B((String) null, y2.f6629i0)) {
                f8 f8Var = d8Var.f5920b.f6030e;
                long j12 = f8Var.f5975b;
                f8Var.f5975b = j11;
                bundle.putLong("_et", j11 - j12);
                d9.x(d8Var.f5920b.f5994a.K().t(true), bundle, true);
            } else {
                z10 = false;
            }
            d8Var.f5920b.f6030e.d(false, z10, j11);
        }
        d8Var.f5920b.f5994a.I().u("auto", "_ab", j10, bundle);
    }
}
