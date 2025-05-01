package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import h3.a;

/* renamed from: com.google.android.gms.internal.auth-api.zbo  reason: invalid package */
public final class zbo extends h {
    private final a.C0229a zba;

    public zbo(Context context, Looper looper, d dVar, a.C0229a aVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        a.C0229a.C0230a aVar2 = new a.C0229a.C0230a(aVar == null ? a.C0229a.f10938h : aVar);
        aVar2.a(zbbj.zba());
        this.zba = new a.C0229a(aVar2);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbt ? (zbt) queryLocalInterface : new zbt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: package-private */
    public final a.C0229a zba() {
        return this.zba;
    }
}
