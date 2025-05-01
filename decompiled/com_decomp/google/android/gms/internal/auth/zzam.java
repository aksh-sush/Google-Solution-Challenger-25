package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.account.f;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.h;
import q3.o;

public final class zzam extends h {
    public zzam(Context context, Looper looper, d dVar, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, 120, dVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return f.c(iBinder);
    }

    public final q3.d[] getApiFeatures() {
        return new q3.d[]{g3.h.f10669l};
    }

    public final int getMinApkVersion() {
        return o.f14688a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
