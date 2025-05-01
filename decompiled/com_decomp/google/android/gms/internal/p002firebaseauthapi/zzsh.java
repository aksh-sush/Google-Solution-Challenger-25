package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsh  reason: invalid package */
final class zzsh extends zzux<AuthResult, zzg> {
    private final zzng zza;

    public zzsh(EmailAuthCredential emailAuthCredential) {
        super(2);
        s.l(emailAuthCredential, "credential cannot be null");
        this.zza = new zzng(emailAuthCredential);
    }

    public final v zza() {
        return v.a().b(new zzsg(this)).a();
    }

    public final String zzb() {
        return "sendSignInLinkToEmail";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzy(this.zza, this.zzc);
    }
}
