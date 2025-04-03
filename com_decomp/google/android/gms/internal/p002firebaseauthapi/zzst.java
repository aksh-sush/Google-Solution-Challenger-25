package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzst  reason: invalid package */
final class zzst extends zzux<AuthResult, zzg> {
    private final String zza;

    public zzst(String str) {
        super(2);
        this.zza = s.h(str, "provider cannot be null or empty");
    }

    public final v zza() {
        return v.a().b(new zzss(this)).a();
    }

    public final String zzb() {
        return "unlinkFederatedCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzE(new zzns(this.zza, this.zze.zzf()), this.zzc);
    }
}
