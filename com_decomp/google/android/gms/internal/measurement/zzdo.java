package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.s;

final class zzdo extends zzdt {
    final /* synthetic */ zzdu zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdo(zzee zzee, zzdu zzdu) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = zzdu;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).setEventInterceptor(this.zza);
    }
}
