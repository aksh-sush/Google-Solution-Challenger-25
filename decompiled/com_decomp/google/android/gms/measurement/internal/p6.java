package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class p6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Bundle f6329e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ o6 f6330f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ o6 f6331g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ long f6332h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ v6 f6333i;

    p6(v6 v6Var, Bundle bundle, o6 o6Var, o6 o6Var2, long j10) {
        this.f6333i = v6Var;
        this.f6329e = bundle;
        this.f6330f = o6Var;
        this.f6331g = o6Var2;
        this.f6332h = j10;
    }

    public final void run() {
        v6.x(this.f6333i, this.f6329e, this.f6330f, this.f6331g, this.f6332h);
    }
}
