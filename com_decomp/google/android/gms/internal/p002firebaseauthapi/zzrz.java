package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrz  reason: invalid package */
final class zzrz extends zzux<AuthResult, zzg> {
    private final zzmy zza;

    public zzrz(String str) {
        super(2);
        this.zza = new zzmy(str);
    }

    public final v zza() {
        return v.a().b(new zzry(this)).a();
    }

    public final String zzb() {
        return "signInAnonymously";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzu(this.zza, this.zzc);
    }
}
