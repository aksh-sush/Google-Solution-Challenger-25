package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.e;
import h3.b;

abstract class zzbj extends e {
    public zzbj(GoogleApiClient googleApiClient) {
        super(b.f10944a, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ h createFailedResult(Status status) {
        return new zzbv(status);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzbe zzbe = (zzbe) bVar;
        zza(zzbe.getContext(), (zzbh) zzbe.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((h) obj);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Context context, zzbh zzbh);
}
