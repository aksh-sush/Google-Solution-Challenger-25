package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsv  reason: invalid package */
final class zzsv extends zzux<Void, zzg> {
    private final String zza;

    public zzsv(String str) {
        super(2);
        this.zza = s.h(str, "email cannot be null or empty");
    }

    public final v zza() {
        return v.a().b(new zzsu(this)).a();
    }

    public final String zzb() {
        return "updateEmail";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzc(new zzlo(this.zze.zzf(), this.zza), this.zzc);
    }
}
