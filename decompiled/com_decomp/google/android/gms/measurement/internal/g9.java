package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import h4.q;

final class g9 implements q {

    /* renamed from: a  reason: collision with root package name */
    public final zzci f6002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f6003b;

    g9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzci) {
        this.f6003b = appMeasurementDynamiteService;
        this.f6002a = zzci;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f6002a.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            n4 n4Var = this.f6003b.f5822a;
            if (n4Var != null) {
                n4Var.d().w().b("Event interceptor threw exception", e10);
            }
        }
    }
}
