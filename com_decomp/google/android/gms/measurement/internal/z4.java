package com.google.android.gms.measurement.internal;

final class z4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f6678e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6679f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f5 f6680g;

    z4(f5 f5Var, t tVar, String str) {
        this.f6680g = f5Var;
        this.f6678e = tVar;
        this.f6679f = str;
    }

    public final void run() {
        this.f6680g.f5962a.a();
        this.f6680g.f5962a.j(this.f6678e, this.f6679f);
    }
}
