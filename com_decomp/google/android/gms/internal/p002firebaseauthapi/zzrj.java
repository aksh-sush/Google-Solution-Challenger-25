package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrj  reason: invalid package */
final class zzrj extends zzux<Void, zzg> {
    private final zzne zza;

    public zzrj(String str, String str2, String str3) {
        super(2);
        s.h(str, "email cannot be null or empty");
        s.h(str2, "password cannot be null or empty");
        this.zza = new zzne(str, str2, str3);
    }

    public final v zza() {
        return v.a().b(new zzri(this)).a();
    }

    public final String zzb() {
        return "reauthenticateWithEmailPassword";
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
        zztm.zzq().zzx(this.zza, this.zzc);
    }
}
