package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzo;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztf  reason: invalid package */
final class zztf extends zzux<String, zzg> {
    private final zzls zza;

    public zztf(String str, String str2) {
        super(4);
        s.h(str, "code cannot be null or empty");
        this.zza = new zzls(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzte(this)).a();
    }

    public final String zzb() {
        return "verifyPasswordResetCode";
    }

    public final void zzc() {
        if (new zzo(this.zzm).getOperation() != 0) {
            zzl(new Status(FirebaseError.ERROR_INTERNAL_ERROR));
        } else {
            zzm(this.zzm.zzc());
        }
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zze(this.zza, this.zzc);
    }
}
