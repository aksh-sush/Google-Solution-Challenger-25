package com.google.android.gms.measurement.internal;

abstract class h5 extends g5 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f6024b;

    h5(n4 n4Var) {
        super(n4Var);
        this.f5994a.i();
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* access modifiers changed from: protected */
    public final void k() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void l() {
        if (this.f6024b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!j()) {
            this.f5994a.g();
            this.f6024b = true;
        }
    }

    public final void m() {
        if (!this.f6024b) {
            i();
            this.f5994a.g();
            this.f6024b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        return this.f6024b;
    }
}
