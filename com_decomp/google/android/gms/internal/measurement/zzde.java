package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzde extends zzdt {
    final /* synthetic */ zzbz zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzde(zzee zzee, zzbz zzbz) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).getCurrentScreenClass(this.zza);
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        this.zza.zzd((Bundle) null);
    }
}
