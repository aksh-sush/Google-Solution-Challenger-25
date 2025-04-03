package com.google.android.gms.internal.measurement;

import android.app.Activity;
import b4.b;
import com.google.android.gms.common.internal.s;

final class zzec extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzed zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzec(zzed zzed, Activity activity) {
        super(zzed.zza, true);
        this.zzb = zzed;
        this.zza = activity;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zza.zzj)).onActivityDestroyed(b.Z(this.zza), this.zzi);
    }
}
