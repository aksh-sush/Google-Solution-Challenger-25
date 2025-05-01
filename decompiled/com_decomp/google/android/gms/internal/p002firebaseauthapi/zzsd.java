package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsd  reason: invalid package */
final class zzsd extends zzux<AuthResult, zzg> {
    private final zznc zza;

    public zzsd(String str, String str2) {
        super(2);
        s.h(str, "token cannot be null or empty");
        this.zza = new zznc(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzsc(this)).a();
    }

    public final String zzb() {
        return "signInWithCustomToken";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzw(this.zza, this.zzc);
    }
}
