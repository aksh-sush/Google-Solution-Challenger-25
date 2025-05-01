package com.google.android.gms.internal.measurement;

public final class zznf implements zzne {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zze("measurement.androidId.delete_feature", true);
        zzb = zzhr.zze("measurement.log_androidId_enabled", false);
    }

    public final boolean zza() {
        return zza.zzb().booleanValue();
    }
}
