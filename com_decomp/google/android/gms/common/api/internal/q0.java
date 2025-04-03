package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import l4.d;
import l4.l;

final class q0 extends d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f5478a;

    q0(v0 v0Var) {
        this.f5478a = new WeakReference(v0Var);
    }

    public final void s(l lVar) {
        v0 v0Var = (v0) this.f5478a.get();
        if (v0Var != null) {
            v0Var.f5508a.p(new p0(this, v0Var, v0Var, lVar));
        }
    }
}
