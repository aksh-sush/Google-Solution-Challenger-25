package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsz  reason: invalid package */
final class zzsz extends zzux<Void, zzg> {
    private final PhoneAuthCredential zza;

    public zzsz(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.zza = (PhoneAuthCredential) s.k(phoneAuthCredential);
    }

    public final v zza() {
        return v.a().b(new zzsy(this)).a();
    }

    public final String zzb() {
        return "updatePhoneNumber";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzo(new zzmm(this.zze.zzf(), this.zza), this.zzc);
    }
}
