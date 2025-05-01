package com.google.android.gms.measurement.internal;

import h4.d;

final class r7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d f6387e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u7 f6388f;

    r7(u7 u7Var, d dVar) {
        this.f6388f = u7Var;
        this.f6387e = dVar;
    }

    public final void run() {
        synchronized (this.f6388f) {
            this.f6388f.f6471a = false;
            if (!this.f6388f.f6473c.z()) {
                this.f6388f.f6473c.f5994a.d().q().a("Connected to remote service");
                this.f6388f.f6473c.x(this.f6387e);
            }
        }
    }
}
