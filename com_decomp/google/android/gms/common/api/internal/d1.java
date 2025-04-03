package com.google.android.gms.common.api.internal;

abstract class d1 {

    /* renamed from: a  reason: collision with root package name */
    private final c1 f5345a;

    protected d1(c1 c1Var) {
        this.f5345a = c1Var;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void b(f1 f1Var) {
        f1Var.f5354a.lock();
        try {
            if (f1Var.f5364k == this.f5345a) {
                a();
            }
        } finally {
            f1Var.f5354a.unlock();
        }
    }
}
