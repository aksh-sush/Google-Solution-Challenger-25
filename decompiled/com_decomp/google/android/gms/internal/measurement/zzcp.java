package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzcp extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbz zzc;
    final /* synthetic */ zzee zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcp(zzee zzee, String str, String str2, zzbz zzbz) {
        super(zzee, true);
        this.zzd = zzee;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzd.zzj)).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzc.zzd((Bundle) null);
    }
}
