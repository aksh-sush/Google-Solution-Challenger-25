package com.google.android.gms.measurement.internal;

final class q5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6352e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6353f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Object f6354g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f6355h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ i6 f6356i;

    q5(i6 i6Var, String str, String str2, Object obj, long j10) {
        this.f6356i = i6Var;
        this.f6352e = str;
        this.f6353f = str2;
        this.f6354g = obj;
        this.f6355h = j10;
    }

    public final void run() {
        this.f6356i.L(this.f6352e, this.f6353f, this.f6354g, this.f6355h);
    }
}
