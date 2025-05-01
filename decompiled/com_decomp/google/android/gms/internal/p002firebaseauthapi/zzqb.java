package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqb  reason: invalid package */
final class zzqb extends zzux<Void, zzg> {
    private final zzlm zza;

    public zzqb(String str, String str2) {
        super(7);
        s.h(str, "code cannot be null or empty");
        this.zza = new zzlm(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzqa(this)).a();
    }

    public final String zzb() {
        return "applyActionCode";
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzb(this.zza, this.zzc);
    }
}
