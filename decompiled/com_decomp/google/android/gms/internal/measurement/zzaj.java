package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzal, zzap zzap, zzg zzg, List<zzap> list) {
        if (zzal.zzt(zzap.zzi())) {
            zzap zzf = zzal.zzf(zzap.zzi());
            if (zzf instanceof zzai) {
                return ((zzai) zzf).zza(zzg, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{zzap.zzi()}));
        } else if ("hasOwnProperty".equals(zzap.zzi())) {
            zzh.zzh("hasOwnProperty", 1, list);
            return zzal.zzt(zzg.zzb(list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{zzap.zzi()}));
        }
    }

    public static Iterator<zzap> zzb(Map<String, zzap> map) {
        return new zzak(map.keySet().iterator());
    }
}
