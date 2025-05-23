package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabh  reason: invalid package */
final class zzabh {
    private static final zzabh zza = new zzabh();
    private final zzabm zzb = new zzaar();
    private final ConcurrentMap<Class<?>, zzabl<?>> zzc = new ConcurrentHashMap();

    private zzabh() {
    }

    public static zzabh zza() {
        return zza;
    }

    public final <T> zzabl<T> zzb(Class<T> cls) {
        zzaac.zzf(cls, "messageType");
        zzabl<T> zzabl = this.zzc.get(cls);
        if (zzabl == null) {
            zzabl = this.zzb.zza(cls);
            zzaac.zzf(cls, "messageType");
            zzaac.zzf(zzabl, "schema");
            zzabl<T> putIfAbsent = this.zzc.putIfAbsent(cls, zzabl);
            return putIfAbsent == null ? zzabl : putIfAbsent;
        }
    }
}
