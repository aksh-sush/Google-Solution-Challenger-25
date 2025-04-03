package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzdr extends zzdt {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzee zzg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdr(zzee zzee, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(zzee, true);
        this.zzg = zzee;
        this.zza = l10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z10;
        this.zzf = z11;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        Long l10 = this.zza;
        ((zzcc) s.k(this.zzg.zzj)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, l10 == null ? this.zzh : l10.longValue());
    }
}
