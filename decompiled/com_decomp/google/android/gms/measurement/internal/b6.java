package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class b6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5863e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f5864f;

    b6(i6 i6Var, AtomicReference atomicReference) {
        this.f5864f = i6Var;
        this.f5863e = atomicReference;
    }

    public final void run() {
        synchronized (this.f5863e) {
            try {
                this.f5863e.set(Double.valueOf(this.f5864f.f5994a.z().k(this.f5864f.f5994a.B().s(), y2.P)));
                this.f5863e.notify();
            } catch (Throwable th) {
                this.f5863e.notify();
                throw th;
            }
        }
    }
}
