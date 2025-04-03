package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqn  reason: invalid package */
final class zzqn extends zzux<Void, zzg> {
    private final zzma zza;

    public zzqn(PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, String str2) {
        super(2);
        s.k(phoneMultiFactorAssertion);
        s.g(str);
        this.zza = new zzma(phoneMultiFactorAssertion.zza(), str, str2);
    }

    public final v zza() {
        return v.a().b(new zzqm(this)).a();
    }

    public final String zzb() {
        return "finalizeMfaEnrollment";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzi(this.zza, this.zzc);
    }
}
