package com.google.android.gms.measurement.internal;

abstract class n8 extends m8 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f6266c;

    n8(w8 w8Var) {
        super(w8Var);
        this.f6214b.q();
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (!this.f6266c) {
            l();
            this.f6214b.l();
            this.f6266c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f6266c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean l();
}
