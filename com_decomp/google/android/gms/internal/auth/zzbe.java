package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import h3.b;
import h3.c;

public final class zzbe extends h {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, d dVar, c cVar, g gVar, o oVar) {
        super(context, looper, 16, dVar, gVar, oVar);
        this.zze = cVar == null ? new Bundle() : cVar.a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return q3.o.f14688a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        d clientSettings = getClientSettings();
        return !TextUtils.isEmpty(clientSettings.b()) && !clientSettings.e(b.f10944a).isEmpty();
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
