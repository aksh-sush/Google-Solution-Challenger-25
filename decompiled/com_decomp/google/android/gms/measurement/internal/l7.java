package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class l7 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzcf f6173e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f6174f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6175g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ boolean f6176h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f6177i;

    l7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, String str, String str2, boolean z10) {
        this.f6177i = appMeasurementDynamiteService;
        this.f6173e = zzcf;
        this.f6174f = str;
        this.f6175g = str2;
        this.f6176h = z10;
    }

    public final void run() {
        this.f6177i.f5822a.L().V(this.f6173e, this.f6174f, this.f6175g, this.f6176h);
    }
}
