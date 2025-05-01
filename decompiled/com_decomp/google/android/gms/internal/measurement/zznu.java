package com.google.android.gms.internal.measurement;

public final class zznu implements zznt {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zze("measurement.euid.client.dev", false);
        zzb = zzhr.zze("measurement.euid.service", false);
    }

    public final boolean zza() {
        return zza.zzb().booleanValue();
    }

    public final boolean zzb() {
        return zzb.zzb().booleanValue();
    }
}
