package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzod  reason: invalid package */
final class zzod implements zzuz<zzxx> {
    final /* synthetic */ zztl zza;
    final /* synthetic */ zzpt zzb;

    zzod(zzpt zzpt, zztl zztl) {
        this.zzb = zzpt;
        this.zza = zztl;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxx zzxx = (zzxx) obj;
        if (zzxx.zzg()) {
            this.zza.zzf(new zzoa(zzxx.zzd(), zzxx.zzf(), (zze) null));
            return;
        }
        this.zzb.zzO(new zzwq(zzxx.zze(), zzxx.zzc(), Long.valueOf(zzxx.zzb()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (zze) null, this.zza, this);
    }
}
