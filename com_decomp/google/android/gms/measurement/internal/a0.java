package com.google.android.gms.measurement.internal;

final class a0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f5827e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f5828f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c2 f5829g;

    a0(c2 c2Var, String str, long j10) {
        this.f5829g = c2Var;
        this.f5827e = str;
        this.f5828f = j10;
    }

    public final void run() {
        c2.j(this.f5829g, this.f5827e, this.f5828f);
    }
}
