package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrv  reason: invalid package */
final class zzrv extends zzux<Void, zzg> {
    private final zzms zza;
    private final String zzw;

    public zzrv(String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        super(4);
        s.h(str, "email cannot be null or empty");
        this.zza = new zzms(str, actionCodeSettings, str2);
        this.zzw = str3;
    }

    public final v zza() {
        return v.a().b(new zzru(this)).a();
    }

    public final String zzb() {
        return this.zzw;
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzr(this.zza, this.zzc);
    }
}
