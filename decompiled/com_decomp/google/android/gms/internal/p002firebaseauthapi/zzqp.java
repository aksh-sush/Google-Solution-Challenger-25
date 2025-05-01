package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp  reason: invalid package */
final class zzqp extends zzux<AuthResult, zzg> {
    private final zzmc zza;

    public zzqp(PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str) {
        super(2);
        s.k(phoneMultiFactorAssertion);
        s.g(str);
        this.zza = new zzmc(phoneMultiFactorAssertion.zza(), str);
    }

    public final v zza() {
        return v.a().b(new zzqo(this)).a();
    }

    public final String zzb() {
        return "finalizeMfaSignIn";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        FirebaseUser firebaseUser = this.zze;
        if (firebaseUser == null || firebaseUser.getUid().equalsIgnoreCase(zzR.getUid())) {
            ((zzg) this.zzf).zza(this.zzj, zzR);
            zzm(new zzr(zzR));
            return;
        }
        zzl(new Status(FirebaseError.ERROR_USER_MISMATCH));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzj(this.zza, this.zzc);
    }
}
