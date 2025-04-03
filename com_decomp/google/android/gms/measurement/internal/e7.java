package com.google.android.gms.measurement.internal;

final class e7 extends m {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v7 f5952e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e7(v7 v7Var, i5 i5Var) {
        super(i5Var);
        this.f5952e = v7Var;
    }

    public final void c() {
        v7 v7Var = this.f5952e;
        v7Var.h();
        if (v7Var.z()) {
            v7Var.f5994a.d().v().a("Inactivity, disconnecting from the service");
            v7Var.Q();
        }
    }
}
