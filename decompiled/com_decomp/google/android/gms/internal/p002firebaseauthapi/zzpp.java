package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpp  reason: invalid package */
final class zzpp implements zzuz<zzwq> {
    final /* synthetic */ String zza;
    final /* synthetic */ zztl zzb;
    final /* synthetic */ zzpt zzc;

    zzpp(zzpt zzpt, String str, zztl zztl) {
        this.zzc = zzpt;
        this.zza = str;
        this.zzb = zztl;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        zzxg zzxg = new zzxg();
        zzxg.zze(zzwq.zze());
        zzxg.zzd(this.zza);
        zzpt.zzd(this.zzc, this.zzb, zzwq, zzxg, this);
    }
}
