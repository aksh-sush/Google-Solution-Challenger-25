package com.google.android.gms.internal.measurement;

public final class zzoy implements zzox {
    public static final zzhu<Long> zza;
    public static final zzhu<Boolean> zzb;
    public static final zzhu<Boolean> zzc;
    public static final zzhu<Boolean> zzd;
    public static final zzhu<Long> zze;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zzc("measurement.id.lifecycle.app_in_background_parameter", 0);
        zzb = zzhr.zze("measurement.lifecycle.app_backgrounded_engagement", false);
        zzc = zzhr.zze("measurement.lifecycle.app_backgrounded_tracking", true);
        zzd = zzhr.zze("measurement.lifecycle.app_in_background_parameter", false);
        zze = zzhr.zzc("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }

    public final boolean zza() {
        return zzb.zzb().booleanValue();
    }

    public final boolean zzb() {
        return zzd.zzb().booleanValue();
    }
}
