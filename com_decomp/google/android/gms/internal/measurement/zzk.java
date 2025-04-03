package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class zzk extends zzai {
    private final zzab zza;

    public zzk(zzab zzab) {
        super("internal.eventLogger");
        this.zza = zzab;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzh.zzh(this.zzd, 3, list);
        String zzi = zzg.zzb(list.get(0)).zzi();
        long zza2 = (long) zzh.zza(zzg.zzb(list.get(1)).zzh().doubleValue());
        zzap zzb = zzg.zzb(list.get(2));
        this.zza.zze(zzi, zza2, zzb instanceof zzam ? zzh.zzg((zzam) zzb) : new HashMap());
        return zzap.zzf;
    }
}
