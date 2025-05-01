package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzcs extends zzdt {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcs(zzee zzee, Boolean bool) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = bool;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        if (this.zza != null) {
            ((zzcc) s.k(this.zzb.zzj)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            ((zzcc) s.k(this.zzb.zzj)).clearMeasurementEnabled(this.zzh);
        }
    }
}
