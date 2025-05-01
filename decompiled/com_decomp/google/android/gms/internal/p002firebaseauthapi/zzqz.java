package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqz  reason: invalid package */
final class zzqz extends zzux<AuthResult, zzg> {
    private final EmailAuthCredential zza;

    public zzqz(EmailAuthCredential emailAuthCredential) {
        super(2);
        this.zza = (EmailAuthCredential) s.l(emailAuthCredential, "credential cannot be null");
    }

    public final v zza() {
        return v.a().b(new zzqy(this)).a();
    }

    public final String zzb() {
        return "linkEmailAuthCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        EmailAuthCredential emailAuthCredential = this.zza;
        emailAuthCredential.zzb(this.zze);
        zztm.zzq().zzy(new zzng(emailAuthCredential), this.zzc);
    }
}
