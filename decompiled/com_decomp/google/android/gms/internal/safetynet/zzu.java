package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.safetynet.zzk;
import i4.j;

final class zzu extends zze {
    private final /* synthetic */ zzk.zzd zzai;

    zzu(zzk.zzd zzd) {
        this.zzai = zzd;
    }

    public final void zza(Status status, j jVar) {
        this.zzai.setResult(new zzk.zzg(status, jVar));
    }
}
