package com.google.android.gms.internal.measurement;

import android.app.Activity;
import b4.b;
import com.google.android.gms.common.internal.s;

final class zzcr extends zzdt {
    final /* synthetic */ Activity zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzee zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcr(zzee zzee, Activity activity, String str, String str2) {
        super(zzee, true);
        this.zzd = zzee;
        this.zza = activity;
        this.zzb = str;
        this.zzc = str2;
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        ((zzcc) s.k(this.zzd.zzj)).setCurrentScreen(b.Z(this.zza), this.zzb, this.zzc, this.zzh);
    }
}
