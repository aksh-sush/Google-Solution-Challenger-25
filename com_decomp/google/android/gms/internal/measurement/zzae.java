package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzae implements Iterable<zzap>, zzap, zzal {
    final SortedMap<Integer, zzap> zza;
    final Map<String, zzap> zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        if (zzc() != zzae.zzc()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzae.zza.isEmpty();
        }
        for (int intValue = this.zza.firstKey().intValue(); intValue <= this.zza.lastKey().intValue(); intValue++) {
            if (!zze(intValue).equals(zzae.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    public final Iterator<zzap> iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzap zzbK(String str, zzg zzg, List<zzap> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzg, list) : zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return this.zza.lastKey().intValue() + 1;
    }

    public final zzap zzd() {
        Integer num;
        SortedMap<Integer, zzap> sortedMap;
        zzap zzap;
        zzae zzae = new zzae();
        for (Map.Entry next : this.zza.entrySet()) {
            if (next.getValue() instanceof zzal) {
                sortedMap = zzae.zza;
                num = (Integer) next.getKey();
                zzap = (zzap) next.getValue();
            } else {
                sortedMap = zzae.zza;
                num = (Integer) next.getKey();
                zzap = ((zzap) next.getValue()).zzd();
            }
            sortedMap.put(num, zzap);
        }
        return zzae;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r1.zza.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zze(int r2) {
        /*
            r1 = this;
            int r0 = r1.zzc()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.zzs(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.zzap> r0 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.zzf
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.zze(int):com.google.android.gms.internal.measurement.zzap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = r2.zzb.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap zzf(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.zzah r3 = new com.google.android.gms.internal.measurement.zzah
            int r0 = r2.zzc()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.zzt(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzap> r0 = r2.zzb
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.zzf(java.lang.String):com.google.android.gms.internal.measurement.zzap");
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        return this.zza.size() == 1 ? zze(0).zzh() : this.zza.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                zzap zze = zze(i10);
                sb2.append(str);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb2.append(zze.zzi());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final Iterator<Integer> zzk() {
        return this.zza.keySet().iterator();
    }

    public final Iterator<zzap> zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List<zzap> zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i10 = 0; i10 < zzc(); i10++) {
            arrayList.add(zze(i10));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i10, zzap zzap) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i10 >= zzc()) {
            zzq(i10, zzap);
        } else {
            for (int intValue = this.zza.lastKey().intValue(); intValue >= i10; intValue--) {
                SortedMap<Integer, zzap> sortedMap = this.zza;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzap2 = sortedMap.get(valueOf);
                if (zzap2 != null) {
                    zzq(intValue + 1, zzap2);
                    this.zza.remove(valueOf);
                }
            }
            zzq(i10, zzap);
        }
    }

    public final void zzp(int i10) {
        int intValue = this.zza.lastKey().intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.zza.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                SortedMap<Integer, zzap> sortedMap = this.zza;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!sortedMap.containsKey(valueOf) && i11 >= 0) {
                    this.zza.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= this.zza.lastKey().intValue()) {
                    SortedMap<Integer, zzap> sortedMap2 = this.zza;
                    Integer valueOf2 = Integer.valueOf(i10);
                    zzap zzap = sortedMap2.get(valueOf2);
                    if (zzap != null) {
                        this.zza.put(Integer.valueOf(i10 - 1), zzap);
                        this.zza.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i10, zzap zzap) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (zzap == null) {
            this.zza.remove(Integer.valueOf(i10));
        } else {
            this.zza.put(Integer.valueOf(i10), zzap);
        }
    }

    public final void zzr(String str, zzap zzap) {
        if (zzap == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzap);
        }
    }

    public final boolean zzs(int i10) {
        if (i10 >= 0 && i10 <= this.zza.lastKey().intValue()) {
            return this.zza.containsKey(Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final boolean zzt(String str) {
        return "length".equals(str) || this.zzb.containsKey(str);
    }

    public zzae(List<zzap> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                zzq(i10, list.get(i10));
            }
        }
    }
}
