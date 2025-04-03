package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class q6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o6 f6357e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ o6 f6358f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f6359g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f6360h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v6 f6361i;

    q6(v6 v6Var, o6 o6Var, o6 o6Var2, long j10, boolean z10) {
        this.f6361i = v6Var;
        this.f6357e = o6Var;
        this.f6358f = o6Var2;
        this.f6359g = j10;
        this.f6360h = z10;
    }

    public final void run() {
        this.f6361i.p(this.f6357e, this.f6358f, this.f6359g, this.f6360h, (Bundle) null);
    }
}
