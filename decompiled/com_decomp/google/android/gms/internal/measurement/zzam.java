package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class zzam implements zzap, zzal {
    final Map<String, zzap> zza = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        return this.zza.equals(((zzam) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.zza.isEmpty()) {
            for (String next : this.zza.keySet()) {
                sb2.append(String.format("%s: %s,", new Object[]{next, this.zza.get(next)}));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final List<String> zzb() {
        return new ArrayList(this.zza.keySet());
    }

    public zzap zzbK(String str, zzg zzg, List<zzap> list) {
        return "toString".equals(str) ? new zzat(toString()) : zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final zzap zzd() {
        String str;
        Map<String, zzap> map;
        zzap zzap;
        zzam zzam = new zzam();
        for (Map.Entry next : this.zza.entrySet()) {
            if (next.getValue() instanceof zzal) {
                map = zzam.zza;
                str = (String) next.getKey();
                zzap = (zzap) next.getValue();
            } else {
                map = zzam.zza;
                str = (String) next.getKey();
                zzap = ((zzap) next.getValue()).zzd();
            }
            map.put(str, zzap);
        }
        return zzam;
    }

    public final zzap zzf(String str) {
        return this.zza.containsKey(str) ? this.zza.get(str) : zzap.zzf;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return "[object Object]";
    }

    public final Iterator<zzap> zzl() {
        return zzaj.zzb(this.zza);
    }

    public final void zzr(String str, zzap zzap) {
        if (zzap == null) {
            this.zza.remove(str);
        } else {
            this.zza.put(str, zzap);
        }
    }

    public final boolean zzt(String str) {
        return this.zza.containsKey(str);
    }
}
