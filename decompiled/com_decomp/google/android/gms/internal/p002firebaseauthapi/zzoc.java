package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoc  reason: invalid package */
final class zzoc implements zzuz<zzxj> {
    final /* synthetic */ zztl zza;
    final /* synthetic */ zzpt zzb;

    zzoc(zzpt zzpt, zztl zztl) {
        this.zzb = zzpt;
        this.zza = zztl;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxj zzxj = (zzxj) obj;
        this.zzb.zzO(new zzwq(zzxj.zzd(), zzxj.zzc(), Long.valueOf(zzxj.zzb()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (zze) null, this.zza, this);
    }
}
