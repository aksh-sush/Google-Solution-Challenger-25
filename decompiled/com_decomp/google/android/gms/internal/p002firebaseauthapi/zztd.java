package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeSettings;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd  reason: invalid package */
final class zztd extends zzux<Void, Void> {
    private final zznw zza;

    public zztd(String str, String str2, ActionCodeSettings actionCodeSettings) {
        super(6);
        s.g(str);
        s.g(str2);
        s.k(actionCodeSettings);
        this.zza = new zznw(str, str2, actionCodeSettings);
    }

    public final v zza() {
        return v.a().b(new zztc(this)).a();
    }

    public final String zzb() {
        return "verifyBeforeUpdateEmail";
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzG(this.zza, this.zzc);
    }
}
