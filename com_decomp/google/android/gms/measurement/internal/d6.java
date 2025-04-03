package com.google.android.gms.measurement.internal;

import h4.a;

final class d6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f5910e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f5911f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f5912g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f5913h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ boolean f5914i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ i6 f5915j;

    d6(i6 i6Var, a aVar, long j10, int i10, long j11, boolean z10) {
        this.f5915j = i6Var;
        this.f5910e = aVar;
        this.f5911f = j10;
        this.f5912g = i10;
        this.f5913h = j11;
        this.f5914i = z10;
    }

    public final void run() {
        this.f5915j.I(this.f5910e);
        this.f5915j.y(this.f5911f, false);
        i6.a0(this.f5915j, this.f5910e, this.f5912g, this.f5913h, true, this.f5914i);
    }
}
