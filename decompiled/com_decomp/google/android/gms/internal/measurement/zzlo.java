package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzlo {
    private static final zzlo zza = new zzlo();
    private final zzls zzb = new zzky();
    private final ConcurrentMap<Class<?>, zzlr<?>> zzc = new ConcurrentHashMap();

    private zzlo() {
    }

    public static zzlo zza() {
        return zza;
    }

    public final <T> zzlr<T> zzb(Class<T> cls) {
        zzkh.zzf(cls, "messageType");
        zzlr<T> zzlr = this.zzc.get(cls);
        if (zzlr == null) {
            zzlr = this.zzb.zza(cls);
            zzkh.zzf(cls, "messageType");
            zzkh.zzf(zzlr, "schema");
            zzlr<T> putIfAbsent = this.zzc.putIfAbsent(cls, zzlr);
            return putIfAbsent == null ? zzlr : putIfAbsent;
        }
    }
}
