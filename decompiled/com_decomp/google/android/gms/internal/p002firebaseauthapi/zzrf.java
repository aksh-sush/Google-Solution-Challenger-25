package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzx;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrf  reason: invalid package */
final class zzrf extends zzux<Void, zzg> {
    private final zzng zza;

    public zzrf(EmailAuthCredential emailAuthCredential) {
        super(2);
        s.l(emailAuthCredential, "Credential cannot be null");
        this.zza = new zzng(emailAuthCredential);
    }

    public final v zza() {
        return v.a().b(new zzre(this)).a();
    }

    public final String zzb() {
        return "reauthenticateWithEmailLink";
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
        zztm.zzq().zzy(this.zza, this.zzc);
    }
}
