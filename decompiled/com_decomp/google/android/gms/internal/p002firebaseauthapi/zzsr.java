package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr  reason: invalid package */
final class zzsr extends zzux<AuthResult, zzg> {
    public zzsr() {
        super(2);
    }

    public final v zza() {
        return v.a().b(new zzsq(this)).a();
    }

    public final String zzb() {
        return "unlinkEmailCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        ((zzg) this.zzf).zza(this.zzj, zzR);
        zzm(new zzr(zzR));
    }
}
