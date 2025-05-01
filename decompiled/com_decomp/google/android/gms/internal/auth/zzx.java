package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import n4.j;

final class zzx extends i.a {
    final /* synthetic */ j zza;

    zzx(zzab zzab, j jVar) {
        this.zza = jVar;
    }

    public final void onResult(Status status) {
        zzab.zzf(status, (Object) null, this.zza);
    }
}
