package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqx  reason: invalid package */
final class zzqx extends zzux<AuthResult, zzg> {
    private final PhoneAuthCredential zza;

    public zzqx(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zza = (PhoneAuthCredential) s.l(phoneAuthCredential, "credential cannot be null");
    }

    public final v zza() {
        return v.a().b(new zzqw(this)).a();
    }

    public final String zzb() {
        return "linkPhoneAuthCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzo(new zzmm(this.zze.zzf(), this.zza), this.zzc);
    }
}
