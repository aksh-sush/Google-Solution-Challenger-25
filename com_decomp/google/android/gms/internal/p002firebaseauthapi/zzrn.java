package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrn  reason: invalid package */
final class zzrn extends zzux<Void, zzg> {
    private final zzni zza;

    public zzrn(PhoneAuthCredential phoneAuthCredential, String str) {
        super(2);
        s.l(phoneAuthCredential, "credential cannot be null");
        phoneAuthCredential.zze(false);
        this.zza = new zzni(phoneAuthCredential, str);
    }

    public final v zza() {
        return v.a().b(new zzrm(this)).a();
    }

    public final String zzb() {
        return "reauthenticateWithPhoneCredential";
    }

    public final void zzc() {
        zzx zzR = zzti.zzR(this.zzd, this.zzk);
        if (this.zze.getUid().equalsIgnoreCase(zzR.getUid())) {
            ((zzg) this.zzf).zza(this.zzj, zzR);
            zzm(null);
            return;
        }
        zzl(new Status(FirebaseError.ERROR_USER_MISMATCH));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzz(this.zza, this.zzc);
    }
}
