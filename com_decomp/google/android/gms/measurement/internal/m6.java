package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcf;

final class m6 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ zzcf f6205e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ t f6206f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f6207g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f6208h;

    m6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcf, t tVar, String str) {
        this.f6208h = appMeasurementDynamiteService;
        this.f6205e = zzcf;
        this.f6206f = tVar;
        this.f6207g = str;
    }

    public final void run() {
        this.f6208h.f5822a.L().p(this.f6205e, this.f6206f, this.f6207g);
    }
}
