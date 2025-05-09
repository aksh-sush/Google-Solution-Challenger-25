package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzla<K, V> extends LinkedHashMap<K, V> {
    private static final zzla zza;
    private boolean zzb = true;

    static {
        zzla zzla = new zzla();
        zza = zzla;
        zzla.zzb = false;
    }

    private zzla() {
    }

    public static <K, V> zzla<K, V> zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzkh.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzkb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzg();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i10;
    }

    public final V put(K k10, V v10) {
        zzg();
        zzkh.zze(k10);
        zzkh.zze(v10);
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzg();
        for (Object next : map.keySet()) {
            zzkh.zze(next);
            zzkh.zze(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzla<K, V> zzb() {
        return isEmpty() ? new zzla<>() : new zzla<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzla<K, V> zzla) {
        zzg();
        if (!zzla.isEmpty()) {
            putAll(zzla);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzla(Map<K, V> map) {
        super(map);
    }
}
