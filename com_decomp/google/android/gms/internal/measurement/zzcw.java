package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzcw extends zzdt {
    final /* synthetic */ long zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcw(zzee zzee, long j10) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = j10;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).setSessionTimeoutDuration(this.zza);
    }
}
