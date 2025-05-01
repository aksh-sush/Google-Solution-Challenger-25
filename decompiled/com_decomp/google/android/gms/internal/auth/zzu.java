package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import g3.b;
import n4.j;

public final /* synthetic */ class zzu implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ b zzb;

    public /* synthetic */ zzu(zzab zzab, b bVar) {
        this.zza = zzab;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        b bVar = this.zzb;
        ((zzp) ((zzi) obj).getService()).zze(new zzz(zzab, (j) obj2), bVar);
    }
}
