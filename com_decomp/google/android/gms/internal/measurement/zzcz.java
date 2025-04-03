package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzcz extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcz(zzee zzee, String str) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = str;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).endAdUnitExposure(this.zza, this.zzi);
    }
}
