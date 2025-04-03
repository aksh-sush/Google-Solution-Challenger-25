package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrx  reason: invalid package */
final class zzrx extends zzux<Void, zzg> {
    private final zzmw zza;

    public zzrx(String str) {
        super(9);
        this.zza = new zzmw(str);
    }

    public final v zza() {
        return v.a().b(new zzrw(this)).a();
    }

    public final String zzb() {
        return "setFirebaseUIVersion";
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzt(this.zza, this.zzc);
    }
}
