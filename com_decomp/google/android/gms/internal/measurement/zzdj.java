package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzdj extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdj(zzee zzee, String str, zzbz zzbz) {
        super(zzee, true);
        this.zzc = zzee;
        this.zza = str;
        this.zzb = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzc.zzj)).getMaxUserProperties(this.zza, this.zzb);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzb.zzd((Bundle) null);
    }
}
