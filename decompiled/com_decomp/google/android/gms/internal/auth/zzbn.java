package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.w;
import n4.j;

final class zzbn extends zzbd {
    final /* synthetic */ j zza;

    zzbn(zzbo zzbo, j jVar) {
        this.zza = jVar;
    }

    public final void zzc(String str) {
        w.a(str != null ? Status.f5268k : new Status(3006), str, this.zza);
    }
}
