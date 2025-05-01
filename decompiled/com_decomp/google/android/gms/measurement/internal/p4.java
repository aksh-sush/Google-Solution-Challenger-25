package com.google.android.gms.measurement.internal;

final class p4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f6318e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f5 f6319f;

    p4(f5 f5Var, c cVar) {
        this.f6319f = f5Var;
        this.f6318e = cVar;
    }

    public final void run() {
        this.f6319f.f5962a.a();
        if (this.f6318e.f5875g.U() == null) {
            this.f6319f.f5962a.r(this.f6318e);
        } else {
            this.f6319f.f5962a.w(this.f6318e);
        }
    }
}
