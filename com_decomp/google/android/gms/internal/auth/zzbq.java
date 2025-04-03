package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import m3.b;

final class zzbq extends zzbi {
    final /* synthetic */ b zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbq(zzbt zzbt, GoogleApiClient googleApiClient, b bVar) {
        super(googleApiClient);
        this.zza = bVar;
    }

    /* access modifiers changed from: protected */
    public final void zza(Context context, zzbh zzbh) {
        zzbh.zze(new zzbp(this), this.zza);
    }
}
