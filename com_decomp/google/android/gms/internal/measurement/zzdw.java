package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import b4.b;
import com.google.android.gms.common.internal.s;

final class zzdw extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ Activity zzb;
    final /* synthetic */ zzed zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdw(zzed zzed, Bundle bundle, Activity activity) {
        super(zzed.zza, true);
        this.zzc = zzed;
        this.zza = bundle;
        this.zzb = activity;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        Bundle bundle;
        if (this.zza != null) {
            bundle = new Bundle();
            if (this.zza.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.zza.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((zzcc) s.k(this.zzc.zza.zzj)).onActivityCreated(b.Z(this.zzb), bundle, this.zzi);
    }
}
