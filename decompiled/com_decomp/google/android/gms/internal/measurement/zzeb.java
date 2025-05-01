package com.google.android.gms.internal.measurement;

import android.app.Activity;
import b4.b;
import com.google.android.gms.common.internal.s;

final class zzeb extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzbz zzb;
    final /* synthetic */ zzed zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeb(zzed zzed, Activity activity, zzbz zzbz) {
        super(zzed.zza, true);
        this.zzc = zzed;
        this.zza = activity;
        this.zzb = zzbz;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzc.zza.zzj)).onActivitySaveInstanceState(b.Z(this.zza), this.zzb, this.zzi);
    }
}
