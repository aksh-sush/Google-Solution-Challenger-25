package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzdf extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzbz zzd;
    final /* synthetic */ zzee zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdf(zzee zzee, String str, String str2, boolean z10, zzbz zzbz) {
        super(zzee, true);
        this.zze = zzee;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z10;
        this.zzd = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zze.zzj)).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zzd.zzd((Bundle) null);
    }
}
