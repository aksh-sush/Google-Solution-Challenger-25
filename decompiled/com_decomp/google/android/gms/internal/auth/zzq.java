package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import n4.j;

public final /* synthetic */ class zzq implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzq(zzab zzab, String str) {
        this.zza = zzab;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzab = this.zza;
        ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzab, (j) obj2), this.zzb);
    }
}
