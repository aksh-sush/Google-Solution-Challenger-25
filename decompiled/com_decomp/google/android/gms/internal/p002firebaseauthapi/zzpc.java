package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpc  reason: invalid package */
final class zzpc implements zzuz<zzwb> {
    final /* synthetic */ zzpd zza;

    zzpc(zzpd zzpd) {
        this.zza = zzpd;
    }

    public final void zza(String str) {
        this.zza.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwb zzwb = (zzwb) obj;
        zzwq zzwq = new zzwq(zzwb.zzc(), zzwb.zzb(), Long.valueOf(zzws.zza(zzwb.zzb())), "Bearer");
        zzpd zzpd = this.zza;
        zzpd.zzc.zzO(zzwq, (String) null, (String) null, Boolean.FALSE, (zze) null, zzpd.zzb, this);
    }
}
