package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.d;

final class k7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6148e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f6149f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f6150g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f6151h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v7 f6152i;

    k7(v7 v7Var, boolean z10, i9 i9Var, boolean z11, c cVar, c cVar2) {
        this.f6152i = v7Var;
        this.f6148e = i9Var;
        this.f6149f = z11;
        this.f6150g = cVar;
        this.f6151h = cVar2;
    }

    public final void run() {
        d H = this.f6152i.f6501d;
        if (H == null) {
            this.f6152i.f5994a.d().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        s.k(this.f6148e);
        this.f6152i.r(H, this.f6149f ? null : this.f6150g, this.f6148e);
        this.f6152i.E();
    }
}
