package com.google.android.gms.measurement.internal;

final class o4 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f6279e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i9 f6280f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ f5 f6281g;

    o4(f5 f5Var, c cVar, i9 i9Var) {
        this.f6281g = f5Var;
        this.f6279e = cVar;
        this.f6280f = i9Var;
    }

    public final void run() {
        this.f6281g.f5962a.a();
        if (this.f6279e.f5875g.U() == null) {
            this.f6281g.f5962a.s(this.f6279e, this.f6280f);
        } else {
            this.f6281g.f5962a.x(this.f6279e, this.f6280f);
        }
    }
}
