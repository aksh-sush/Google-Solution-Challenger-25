package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

final class a1 extends t1 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f5293a;

    a1(b1 b1Var) {
        this.f5293a = new WeakReference(b1Var);
    }

    public final void a() {
        b1 b1Var = (b1) this.f5293a.get();
        if (b1Var != null) {
            b1.u(b1Var);
        }
    }
}
