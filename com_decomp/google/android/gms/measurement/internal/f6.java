package com.google.android.gms.measurement.internal;

import h4.a;

final class f6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ a f5965e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f5966f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f5967g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f5968h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ i6 f5969i;

    f6(i6 i6Var, a aVar, int i10, long j10, boolean z10) {
        this.f5969i = i6Var;
        this.f5965e = aVar;
        this.f5966f = i10;
        this.f5967g = j10;
        this.f5968h = z10;
    }

    public final void run() {
        this.f5969i.I(this.f5965e);
        i6.a0(this.f5969i, this.f5965e, this.f5966f, this.f5967g, false, this.f5968h);
    }
}
