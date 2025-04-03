package com.google.android.gms.measurement.internal;

import h4.a;

final class e6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f5947e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f5948f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f5949g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f5950h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ i6 f5951i;

    e6(i6 i6Var, a aVar, int i10, long j10, boolean z10) {
        this.f5951i = i6Var;
        this.f5947e = aVar;
        this.f5948f = i10;
        this.f5949g = j10;
        this.f5950h = z10;
    }

    public final void run() {
        this.f5951i.I(this.f5947e);
        i6.a0(this.f5951i, this.f5947e, this.f5948f, this.f5949g, false, this.f5950h);
    }
}
