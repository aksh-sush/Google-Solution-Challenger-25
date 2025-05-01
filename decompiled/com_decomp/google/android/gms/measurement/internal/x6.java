package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.d;

final class x6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6602e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f6603f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ z8 f6604g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ v7 f6605h;

    x6(v7 v7Var, i9 i9Var, boolean z10, z8 z8Var) {
        this.f6605h = v7Var;
        this.f6602e = i9Var;
        this.f6603f = z10;
        this.f6604g = z8Var;
    }

    public final void run() {
        d H = this.f6605h.f6501d;
        if (H == null) {
            this.f6605h.f5994a.d().r().a("Discarding data. Failed to set user property");
            return;
        }
        s.k(this.f6602e);
        this.f6605h.r(H, this.f6603f ? null : this.f6604g, this.f6602e);
        this.f6605h.E();
    }
}
