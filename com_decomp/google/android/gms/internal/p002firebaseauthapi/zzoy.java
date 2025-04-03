package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy  reason: invalid package */
final class zzoy implements zzuz<zzyb> {
    final /* synthetic */ zzoz zza;

    zzoy(zzoz zzoz) {
        this.zza = zzoz;
    }

    public final void zza(String str) {
        this.zza.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzyb zzyb = (zzyb) obj;
        if (TextUtils.isEmpty(zzyb.zzb()) || TextUtils.isEmpty(zzyb.zzc())) {
            this.zza.zzb.zzh(zzai.zza("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzwq zzwq = new zzwq(zzyb.zzc(), zzyb.zzb(), Long.valueOf(zzws.zza(zzyb.zzb())), "Bearer");
        zzoz zzoz = this.zza;
        zzoz.zzc.zzO(zzwq, (String) null, (String) null, Boolean.FALSE, (zze) null, zzoz.zzb, this);
    }
}
