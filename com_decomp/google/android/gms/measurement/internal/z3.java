package com.google.android.gms.measurement.internal;

abstract class z3 extends a3 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f6677b;

    z3(n4 n4Var) {
        super(n4Var);
        this.f5994a.i();
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (!m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f6677b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!n()) {
            this.f5994a.g();
            this.f6677b = true;
        }
    }

    public final void k() {
        if (!this.f6677b) {
            l();
            this.f5994a.g();
            this.f6677b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public void l() {
    }

    /* access modifiers changed from: package-private */
    public final boolean m() {
        return this.f6677b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean n();
}
