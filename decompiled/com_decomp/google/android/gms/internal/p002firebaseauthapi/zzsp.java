package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsp  reason: invalid package */
final class zzsp extends zzux<Void, zzg> {
    private final zzno zza;

    public zzsp(String str, String str2) {
        super(2);
        s.g(str);
        s.k(str2);
        this.zza = new zzno(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzso(this)).a();
    }

    public final String zzb() {
        return "unenrollMfa";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzC(this.zza, this.zzc);
    }
}
