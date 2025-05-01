package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class y5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6669e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6670f;

    y5(i6 i6Var, AtomicReference atomicReference) {
        this.f6670f = i6Var;
        this.f6669e = atomicReference;
    }

    public final void run() {
        synchronized (this.f6669e) {
            try {
                this.f6669e.set(this.f6670f.f5994a.z().x(this.f6670f.f5994a.B().s(), y2.M));
                this.f6669e.notify();
            } catch (Throwable th) {
                this.f6669e.notify();
                throw th;
            }
        }
    }
}
