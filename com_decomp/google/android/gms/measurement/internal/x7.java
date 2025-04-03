package com.google.android.gms.measurement.internal;

final class x7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ w8 f6606e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Runnable f6607f;

    x7(y7 y7Var, w8 w8Var, Runnable runnable) {
        this.f6606e = w8Var;
        this.f6607f = runnable;
    }

    public final void run() {
        this.f6606e.a();
        this.f6606e.k0(this.f6607f);
        this.f6606e.A();
    }
}
