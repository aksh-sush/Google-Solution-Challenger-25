package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzo;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqd  reason: invalid package */
final class zzqd extends zzux<ActionCodeResult, zzg> {
    private final zzls zza;

    public zzqd(String str, String str2) {
        super(4);
        s.h(str, "code cannot be null or empty");
        this.zza = new zzls(str, str2);
    }

    public final v zza() {
        return v.a().b(new zzqc(this)).a();
    }

    public final String zzb() {
        return "checkActionCode";
    }

    public final void zzc() {
        zzm(new zzo(this.zzm));
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zze(this.zza, this.zzc);
    }
}
