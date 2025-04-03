package com.google.android.gms.measurement.internal;

final class t6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o6 f6426e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f6427f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ v6 f6428g;

    t6(v6 v6Var, o6 o6Var, long j10) {
        this.f6428g = v6Var;
        this.f6426e = o6Var;
        this.f6427f = j10;
    }

    public final void run() {
        this.f6428g.q(this.f6426e, false, this.f6427f);
        v6 v6Var = this.f6428g;
        v6Var.f6490e = null;
        v6Var.f5994a.L().u((o6) null);
    }
}
