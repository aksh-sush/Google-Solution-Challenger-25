package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.d;

final class j7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i9 f6125e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f6126f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ t f6127g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ String f6128h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v7 f6129i;

    j7(v7 v7Var, boolean z10, i9 i9Var, boolean z11, t tVar, String str) {
        this.f6129i = v7Var;
        this.f6125e = i9Var;
        this.f6126f = z11;
        this.f6127g = tVar;
        this.f6128h = str;
    }

    public final void run() {
        d H = this.f6129i.f6501d;
        if (H == null) {
            this.f6129i.f5994a.d().r().a("Discarding data. Failed to send event to service");
            return;
        }
        s.k(this.f6125e);
        this.f6129i.r(H, this.f6126f ? null : this.f6127g, this.f6125e);
        this.f6129i.E();
    }
}
