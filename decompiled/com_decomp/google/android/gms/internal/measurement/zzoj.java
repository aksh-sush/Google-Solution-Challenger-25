package com.google.android.gms.internal.measurement;

public final class zzoj implements zzoi {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;
    public static final zzhu<Boolean> zzc;

    static {
        zzhr zzhr = new zzhr(zzhk.zza("com.google.android.gms.measurement"));
        zza = zzhr.zze("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzb = zzhr.zze("measurement.client.sessions.check_on_startup", true);
        zzc = zzhr.zze("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }
}
