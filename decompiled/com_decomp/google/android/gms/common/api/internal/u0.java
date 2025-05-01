package com.google.android.gms.common.api.internal;

abstract class u0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v0 f5496e;

    /* synthetic */ u0(v0 v0Var, t0 t0Var) {
        this.f5496e = v0Var;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        this.f5496e.f5509b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
            }
        } catch (RuntimeException e10) {
            this.f5496e.f5508a.q(e10);
        } catch (Throwable th) {
            this.f5496e.f5509b.unlock();
            throw th;
        }
        this.f5496e.f5509b.unlock();
    }
}
