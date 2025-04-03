package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class o5 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzcf f6282e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f6283f;

    o5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf) {
        this.f6283f = appMeasurementDynamiteService;
        this.f6282e = zzcf;
    }

    public final void run() {
        this.f6283f.f5822a.L().R(this.f6282e);
    }
}
