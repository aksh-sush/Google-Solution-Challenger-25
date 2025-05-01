package com.google.android.gms.measurement.internal;

final class b5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ z8 f5860e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i9 f5861f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f5 f5862g;

    b5(f5 f5Var, z8 z8Var, i9 i9Var) {
        this.f5862g = f5Var;
        this.f5860e = z8Var;
        this.f5861f = i9Var;
    }

    public final void run() {
        this.f5862g.f5962a.a();
        if (this.f5860e.U() == null) {
            this.f5862g.f5962a.t(this.f5860e, this.f5861f);
        } else {
            this.f5862g.f5962a.z(this.f5860e, this.f5861f);
        }
    }
}
