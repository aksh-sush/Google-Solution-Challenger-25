package com.google.android.gms.internal.auth;

import java.io.Serializable;

public final class zzdn {
    public static zzdj zza(zzdj zzdj) {
        return ((zzdj instanceof zzdl) || (zzdj instanceof zzdk)) ? zzdj : zzdj instanceof Serializable ? new zzdk(zzdj) : new zzdl(zzdj);
    }

    public static zzdj zzb(Object obj) {
        return new zzdm(obj);
    }
}
