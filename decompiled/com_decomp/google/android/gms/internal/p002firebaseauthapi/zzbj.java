package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbj  reason: invalid package */
final class zzbj implements zzbm {
    final /* synthetic */ zzav zza;

    zzbj(zzav zzav) {
        this.zza = zzav;
    }

    public final <Q> zzan<Q> zza(Class<Q> cls) {
        try {
            return new zzap(this.zza, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzan<?> zzb() {
        zzav zzav = this.zza;
        return new zzap(zzav, zzav.zzd());
    }

    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    public final Class<?> zzd() {
        return null;
    }

    public final Set<Class<?>> zze() {
        return this.zza.zzh();
    }
}
