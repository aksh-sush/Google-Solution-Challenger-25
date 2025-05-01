package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class e9 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzcf f5954e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f5955f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f5956g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f5957h;

    e9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, String str, String str2) {
        this.f5957h = appMeasurementDynamiteService;
        this.f5954e = zzcf;
        this.f5955f = str;
        this.f5956g = str2;
    }

    public final void run() {
        this.f5957h.f5822a.L().T(this.f5954e, this.f5955f, this.f5956g);
    }
}
