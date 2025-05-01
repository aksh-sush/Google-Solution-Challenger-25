package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.zzay;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqr  reason: invalid package */
final class zzqr extends zzux<GetTokenResult, zzg> {
    private final zzme zza;

    public zzqr(String str) {
        super(1);
        s.h(str, "refresh token cannot be null");
        this.zza = new zzme(str);
    }

    public final v zza() {
        return v.a().b(new zzqq(this)).a();
    }

    public final String zzb() {
        return "getAccessToken";
    }

    public final void zzc() {
        if (TextUtils.isEmpty(this.zzj.zzf())) {
            this.zzj.zzi(this.zza.zza());
        }
        ((zzg) this.zzf).zza(this.zzj, this.zze);
        zzm(zzay.zza(this.zzj.zze()));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzk(this.zza, this.zzc);
    }
}
