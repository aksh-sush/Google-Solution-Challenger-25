package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzdh extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzee zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdh(zzee zzee, Bundle bundle, zzbz zzbz) {
        super(zzee, true);
        this.zzc = zzee;
        this.zza = bundle;
        this.zzb = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzc.zzj)).performAction(this.zza, this.zzb, this.zzh);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzb.zzd((Bundle) null);
    }
}
