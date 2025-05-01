package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsx  reason: invalid package */
final class zzsx extends zzux<Void, zzg> {
    private final String zza;

    public zzsx(String str) {
        super(2);
        this.zza = s.h(str, "password cannot be null or empty");
    }

    public final v zza() {
        return v.a().b(new zzsw(this)).a();
    }

    public final String zzb() {
        return "updatePassword";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzd(new zzlq(this.zze.zzf(), this.zza), this.zzc);
    }
}
