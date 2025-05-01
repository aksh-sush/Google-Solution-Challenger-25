package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrt  reason: invalid package */
final class zzrt extends zzux<Void, zzg> {
    private final zzmq zza;

    public zzrt(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        s.h(str, "token cannot be null or empty");
        this.zza = new zzmq(str, actionCodeSettings);
    }

    public final v zza() {
        return v.a().b(new zzrs(this)).a();
    }

    public final String zzb() {
        return "sendEmailVerification";
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzq(this.zza, this.zzc);
    }
}
