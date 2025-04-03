package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import n4.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw  reason: invalid package */
public final class zzuw<ResultT, CallbackT> {
    private final zzux<ResultT, CallbackT> zza;
    private final j zzb;

    public zzuw(zzux<ResultT, CallbackT> zzux, j jVar) {
        this.zza = zzux;
        this.zzb = jVar;
    }

    public final void zza(ResultT resultt, Status status) {
        s.l(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzux<ResultT, CallbackT> zzux = this.zza;
            if (zzux.zzs != null) {
                j jVar = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzux.zzd);
                zzux<ResultT, CallbackT> zzux2 = this.zza;
                jVar.b(zzto.zzc(instance, zzux2.zzs, ("reauthenticateWithCredential".equals(zzux2.zzb()) || "reauthenticateWithCredentialWithData".equals(this.zza.zzb())) ? this.zza.zze : null));
                return;
            }
            AuthCredential authCredential = zzux.zzp;
            if (authCredential != null) {
                this.zzb.b(zzto.zzb(status, authCredential, zzux.zzq, zzux.zzr));
            } else {
                this.zzb.b(zzto.zza(status));
            }
        } else {
            this.zzb.c(resultt);
        }
    }
}
