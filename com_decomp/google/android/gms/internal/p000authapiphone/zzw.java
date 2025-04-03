package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
public final class zzw extends h {
    public zzw(Context context, Looper looper, d dVar, g gVar, o oVar) {
        super(context, looper, 126, dVar, gVar, oVar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    public final q3.d[] getApiFeatures() {
        return zzac.zze;
    }

    public final int getMinApkVersion() {
        return q3.o.f14688a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
