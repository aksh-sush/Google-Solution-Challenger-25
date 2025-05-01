package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql  reason: invalid package */
final class zzql extends zzux<SignInMethodQueryResult, zzg> {
    private final zzmg zza;

    public zzql(String str, String str2) {
        super(3);
        s.h(str, "email cannot be null or empty");
        this.zza = new zzmg(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzqk(this)).a();
    }

    public final String zzb() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzc() {
        zzm(new zzaj(this.zzl.zzb()));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzl(this.zza, this.zzc);
    }
}
