package com.google.android.gms.internal.measurement;

public final class zznc implements zznb {
    public static final zzhu<Boolean> zza;
    public static final zzhu<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zza();
        zza = zza2.zze("measurement.adid_zero.service", false);
        zzb = zza2.zze("measurement.adid_zero.remove_lair_if_adidzero_false", true);
    }

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzb().booleanValue();
    }

    public final boolean zzc() {
        return zzb.zzb().booleanValue();
    }
}
