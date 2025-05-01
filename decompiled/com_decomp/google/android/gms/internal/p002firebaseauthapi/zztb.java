package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzg;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztb  reason: invalid package */
final class zztb extends zzux<Void, zzg> {
    private final UserProfileChangeRequest zza;

    public zztb(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        this.zza = (UserProfileChangeRequest) s.l(userProfileChangeRequest, "request cannot be null");
    }

    public final v zza() {
        return v.a().b(new zzta(this)).a();
    }

    public final String zzb() {
        return "updateProfile";
    }

    public final void zzc() {
        ((zzg) this.zzf).zza(this.zzj, zzti.zzR(this.zzd, this.zzk));
        zzm(null);
    }

    public final /* synthetic */ void zzd(zztm zztm, j jVar) {
        this.zzv = new zzuw(this, jVar);
        zztm.zzq().zzF(new zznu(this.zza, this.zze.zzf()), this.zzc);
    }
}
