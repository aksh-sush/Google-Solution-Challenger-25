package com.google.android.gms.common.api.internal;

final class l1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m1 f5438e;

    l1(m1 m1Var) {
        this.f5438e = m1Var;
    }

    public final void run() {
        n1 n1Var = this.f5438e.f5448a;
        n1Var.f5453b.disconnect(n1Var.f5453b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
