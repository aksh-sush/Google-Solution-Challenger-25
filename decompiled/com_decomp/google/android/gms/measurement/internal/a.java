package com.google.android.gms.measurement.internal;

final class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f5824e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f5825f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c2 f5826g;

    a(c2 c2Var, String str, long j10) {
        this.f5826g = c2Var;
        this.f5824e = str;
        this.f5825f = j10;
    }

    public final void run() {
        c2.i(this.f5826g, this.f5824e, this.f5825f);
    }
}
