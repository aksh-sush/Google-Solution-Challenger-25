package com.google.android.gms.measurement.internal;

final class n5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f6259e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6260f;

    n5(i6 i6Var, long j10) {
        this.f6260f = i6Var;
        this.f6259e = j10;
    }

    public final void run() {
        this.f6260f.f5994a.F().f6525k.b(this.f6259e);
        this.f6260f.f5994a.d().q().b("Session timeout duration set", Long.valueOf(this.f6259e));
    }
}
