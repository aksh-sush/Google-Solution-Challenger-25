package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class z5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f6681e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6682f;

    z5(i6 i6Var, AtomicReference atomicReference) {
        this.f6682f = i6Var;
        this.f6681e = atomicReference;
    }

    public final void run() {
        synchronized (this.f6681e) {
            try {
                this.f6681e.set(Long.valueOf(this.f6682f.f5994a.z().r(this.f6682f.f5994a.B().s(), y2.N)));
                this.f6681e.notify();
            } catch (Throwable th) {
                this.f6681e.notify();
                throw th;
            }
        }
    }
}
