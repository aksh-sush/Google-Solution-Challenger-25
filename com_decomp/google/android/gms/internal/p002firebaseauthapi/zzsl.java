package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsl  reason: invalid package */
final class zzsl extends zzux<Void, zzg> {
    private final zznk zza;

    public zzsl(zzag zzag, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        s.k(zzag);
        s.g(str);
        this.zza = new zznk(zzag.zzc(), str, str2, j10, z10, z11, str3, str4, z12);
    }

    public final v zza() {
        return v.a().b(new zzsk(this)).a();
    }

    public final String zzb() {
        return "startMfaEnrollmentWithPhoneNumber";
    }

    public final void zzc() {
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzA(this.zza, this.zzc);
    }
}
