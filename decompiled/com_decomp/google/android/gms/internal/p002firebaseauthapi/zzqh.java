package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqh  reason: invalid package */
final class zzqh extends zzux<AuthResult, zzg> {
    final zzlw zza;

    public zzqh(String str, String str2, String str3) {
        super(2);
        s.h(str, "email cannot be null or empty");
        s.h(str2, "password cannot be null or empty");
        this.zza = new zzlw(str, str2, str3);
    }

    public final v zza() {
        return v.a().b(new zzqg(this)).a();
    }

    public final String zzb() {
        return "createUserWithEmailAndPassword";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }
}
