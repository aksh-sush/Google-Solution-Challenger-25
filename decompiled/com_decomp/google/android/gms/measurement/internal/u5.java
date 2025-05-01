package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class u5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6468e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6469f;

    u5(i6 i6Var, AtomicReference atomicReference) {
        this.f6469f = i6Var;
        this.f6468e = atomicReference;
    }

    public final void run() {
        synchronized (this.f6468e) {
            try {
                this.f6468e.set(Boolean.valueOf(this.f6469f.f5994a.z().B(this.f6469f.f5994a.B().s(), y2.L)));
                this.f6468e.notify();
            } catch (Throwable th) {
                this.f6468e.notify();
                throw th;
            }
        }
    }
}
