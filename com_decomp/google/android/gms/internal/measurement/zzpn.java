package com.google.android.gms.internal.measurement;

public final class zzpn implements zzpm {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Long> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zze("measurement.module.pixie.ees", false);
        zzb = zzhr.zzc("measurement.id.module.pixie.ees", 0);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }
}
