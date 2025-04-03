package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzk;
import i4.g;

final class zzs extends zze {
    private final /* synthetic */ zzk.zzb zzag;

    zzs(zzk.zzb zzb) {
        this.zzag = zzb;
    }

    public final void zza(Status status, g gVar) {
        this.zzag.setResult(new zzk.zza(status, gVar));
    }
}
