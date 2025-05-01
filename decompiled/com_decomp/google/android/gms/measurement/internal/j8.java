package com.google.android.gms.measurement.internal;

final class j8 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g9 f6130e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f6131f;

    j8(AppMeasurementDynamiteService appMeasurementDynamiteService, g9 g9Var) {
        this.f6131f = appMeasurementDynamiteService;
        this.f6130e = g9Var;
    }

    public final void run() {
        this.f6131f.f5822a.I().G(this.f6130e);
    }
}
