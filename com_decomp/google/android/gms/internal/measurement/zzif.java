package com.google.android.gms.internal.measurement;

import java.io.Serializable;

public final class zzif {
    public static <T> zzib<T> zza(zzib<T> zzib) {
        return ((zzib instanceof zzid) || (zzib instanceof zzic)) ? zzib : zzib instanceof Serializable ? new zzic(zzib) : new zzid(zzib);
    }

    public static <T> zzib<T> zzb(T t10) {
        return new zzie(t10);
    }
}
