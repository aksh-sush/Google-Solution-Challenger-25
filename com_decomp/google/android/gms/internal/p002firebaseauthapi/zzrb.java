package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzh;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrb  reason: invalid package */
final class zzrb extends zzux<Void, zzg> {
    private final zzna zza;

    public zzrb(AuthCredential authCredential, String str) {
        super(2);
        s.l(authCredential, "credential cannot be null");
        zzxq zza2 = zzh.zza(authCredential, str);
        zza2.zzb(false);
        this.zza = new zzna(zza2);
    }

    public final v zza() {
        return v.a().b(new zzra(this)).a();
    }

    public final String zzb() {
        return "reauthenticateWithCredential";
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
        zztm.zzq().zzv(this.zza, this.zzc);
    }
}
