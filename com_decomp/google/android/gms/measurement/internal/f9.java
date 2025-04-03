package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class f9 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzcf f5978e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f5979f;

    f9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf) {
        this.f5979f = appMeasurementDynamiteService;
        this.f5978e = zzcf;
    }

    public final void run() {
        this.f5979f.f5822a.N().C(this.f5978e, this.f5979f.f5822a.n());
    }
}
