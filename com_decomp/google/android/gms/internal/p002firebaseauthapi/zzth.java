package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthProvider;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzth  reason: invalid package */
final class zzth extends zzux<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zzmu zza;

    public zzth(zzxd zzxd) {
        super(8);
        s.k(zzxd);
        this.zza = new zzmu(zzxd);
    }

    public final v zza() {
        return v.a().b(new zztg(this)).a();
    }

    public final String zzb() {
        return "verifyPhoneNumber";
    }

    public final void zzc() {
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzs(this.zza, this.zzc);
    }
}
