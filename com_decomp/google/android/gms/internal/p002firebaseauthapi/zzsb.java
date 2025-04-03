package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzh;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsb  reason: invalid package */
final class zzsb extends zzux<AuthResult, zzg> {
    private final zzna zza;

    public zzsb(AuthCredential authCredential, String str) {
        super(2);
        s.l(authCredential, "credential cannot be null");
        this.zza = new zzna(zzh.zza(authCredential, str));
    }

    public final v zza() {
        return v.a().b(new zzsa(this)).a();
    }

    public final String zzb() {
        return "signInWithCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzv(this.zza, this.zzc);
    }
}
