package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoz  reason: invalid package */
final class zzoz implements zzuz<zzwq> {
    final /* synthetic */ String zza;
    final /* synthetic */ zztl zzb;
    final /* synthetic */ zzpt zzc;

    zzoz(zzpt zzpt, String str, zztl zztl) {
        this.zzc = zzpt;
        this.zza = str;
        this.zzb = zztl;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zza.zzu(new zzya(((zzwq) obj).zze(), this.zza), new zzoy(this));
    }
}
