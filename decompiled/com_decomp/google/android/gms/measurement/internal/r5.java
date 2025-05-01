package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class r5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f6384e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i6 f6385f;

    r5(i6 i6Var, long j10) {
        this.f6385f = i6Var;
        this.f6384e = j10;
    }

    public final void run() {
        this.f6385f.y(this.f6384e, true);
        this.f6385f.f5994a.L().S(new AtomicReference());
    }
}
