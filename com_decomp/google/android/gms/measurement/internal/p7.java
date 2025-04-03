package com.google.android.gms.measurement.internal;

import h4.d;

final class p7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ d f6334e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ u7 f6335f;

    p7(u7 u7Var, d dVar) {
        this.f6335f = u7Var;
        this.f6334e = dVar;
    }

    public final void run() {
        synchronized (this.f6335f) {
            this.f6335f.f6471a = false;
            if (!this.f6335f.f6473c.z()) {
                this.f6335f.f6473c.f5994a.d().v().a("Connected to service");
                this.f6335f.f6473c.x(this.f6334e);
            }
        }
    }
}
