package com.google.android.gms.internal.measurement;

import b4.b;
import com.google.android.gms.common.internal.s;

final class zzdg extends zzdt {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzee zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdg(zzee zzee, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(zzee, false);
        this.zzc = zzee;
        this.zza = str;
        this.zzb = obj;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzc.zzj)).logHealthData(5, this.zza, b.Z(this.zzb), b.Z((Object) null), b.Z((Object) null));
    }
}
