package com.google.android.gms.measurement.internal;

final class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i5 f6155e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ m f6156f;

    l(m mVar, i5 i5Var) {
        this.f6156f = mVar;
        this.f6155e = i5Var;
    }

    public final void run() {
        this.f6155e.f();
        if (b.a()) {
            this.f6155e.b().z(this);
            return;
        }
        boolean e10 = this.f6156f.e();
        this.f6156f.f6192c = 0;
        if (e10) {
            this.f6156f.c();
        }
    }
}
