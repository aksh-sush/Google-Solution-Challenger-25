package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzdp extends zzdt {
    final /* synthetic */ zzdv zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdp(zzee zzee, zzdv zzdv) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = zzdv;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).registerOnMeasurementEventListener(this.zza);
    }
}
