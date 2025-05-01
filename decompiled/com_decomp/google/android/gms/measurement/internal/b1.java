package com.google.android.gms.measurement.internal;

final class b1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f5844e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c2 f5845f;

    b1(c2 c2Var, long j10) {
        this.f5845f = c2Var;
        this.f5844e = j10;
    }

    public final void run() {
        this.f5845f.q(this.f5844e);
    }
}
