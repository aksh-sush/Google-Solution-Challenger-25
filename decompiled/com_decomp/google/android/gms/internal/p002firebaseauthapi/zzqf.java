package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqf  reason: invalid package */
final class zzqf extends zzux<Void, zzg> {
    private final zzlu zza;

    public zzqf(String str, String str2, String str3) {
        super(4);
        s.h(str, "code cannot be null or empty");
        s.h(str2, "new password cannot be null or empty");
        this.zza = new zzlu(str, str2, str3);
    }

    public final v zza() {
        return v.a().b(new zzqe(this)).a();
    }

    public final String zzb() {
        return "confirmPasswordReset";
    }

    public final void zzc() {
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzf(this.zza, this.zzc);
    }
}
