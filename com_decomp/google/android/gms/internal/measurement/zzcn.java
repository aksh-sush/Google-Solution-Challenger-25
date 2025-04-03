package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.s;

final class zzcn extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcn(zzee zzee, Bundle bundle) {
        super(zzee, true);
        this.zzb = zzee;
        this.zza = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzb.zzj)).setConditionalUserProperty(this.zza, this.zzh);
    }
}
