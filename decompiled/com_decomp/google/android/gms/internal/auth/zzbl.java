package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import m3.b;
import n4.j;

public final /* synthetic */ class zzbl implements r {
    public final /* synthetic */ zzbo zza;
    public final /* synthetic */ b zzb;

    public /* synthetic */ zzbl(zzbo zzbo, b bVar) {
        this.zza = zzbo;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzbo zzbo = this.zza;
        b bVar = this.zzb;
        ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzbo, (j) obj2), bVar);
    }
}
