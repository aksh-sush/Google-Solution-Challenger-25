package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbk  reason: invalid package */
final class zzbk implements zzbm {
    final /* synthetic */ zzbi zza;
    final /* synthetic */ zzav zzb;

    zzbk(zzbi zzbi, zzav zzav) {
        this.zza = zzbi;
        this.zzb = zzav;
    }

    public final <Q> zzan<Q> zza(Class<Q> cls) {
        try {
            return new zzbh(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final zzan<?> zzb() {
        zzbi zzbi = this.zza;
        return new zzbh(zzbi, this.zzb, zzbi.zzd());
    }

    public final Class<?> zzc() {
        return this.zza.getClass();
    }

    public final Class<?> zzd() {
        return this.zzb.getClass();
    }

    public final Set<Class<?>> zze() {
        return this.zza.zzh();
    }
}
