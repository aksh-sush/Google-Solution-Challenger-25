package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class a6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AtomicReference f5836e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f5837f;

    a6(i6 i6Var, AtomicReference atomicReference) {
        this.f5837f = i6Var;
        this.f5836e = atomicReference;
    }

    public final void run() {
        synchronized (this.f5836e) {
            try {
                this.f5836e.set(Integer.valueOf(this.f5837f.f5994a.z().o(this.f5837f.f5994a.B().s(), y2.O)));
                this.f5836e.notify();
            } catch (Throwable th) {
                this.f5836e.notify();
                throw th;
            }
        }
    }
}
