package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzdm extends zzdt {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdm(zzee zzee, boolean z10) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = z10;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).setDataCollectionEnabled(this.zza);
    }
}
