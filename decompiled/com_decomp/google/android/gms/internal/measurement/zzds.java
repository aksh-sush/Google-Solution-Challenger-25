package com.google.android.gms.internal.measurement;

import b4.b;
import com.google.android.gms.common.internal.s;

final class zzds extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzee zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzds(zzee zzee, String str, String str2, Object obj, boolean z10) {
        super(zzee, true);
        this.zze = zzee;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z10;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zze.zzj)).setUserProperty(this.zza, this.zzb, b.Z(this.zzc), this.zzd, this.zzh);
    }
}
