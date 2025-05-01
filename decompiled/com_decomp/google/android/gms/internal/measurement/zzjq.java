package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class zzjq<T extends zzjp<T>> {
    private static final zzjq zzb = new zzjq(true);
    final zzme<T, Object> zza = new zzlu(16);
    private boolean zzc;
    private boolean zzd;

    private zzjq() {
    }

    public static <T extends zzjp<T>> zzjq<T> zza() {
        throw null;
    }

    private static final void zzd(T t10, Object obj) {
        boolean z10;
        zzmy zzb2 = t10.zzb();
        zzkh.zze(obj);
        zzmy zzmy = zzmy.DOUBLE;
        zzmz zzmz = zzmz.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z10 = obj instanceof Integer;
                break;
            case 1:
                z10 = obj instanceof Long;
                break;
            case 2:
                z10 = obj instanceof Float;
                break;
            case 3:
                z10 = obj instanceof Double;
                break;
            case 4:
                z10 = obj instanceof Boolean;
                break;
            case 5:
                z10 = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zziy) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzkb)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzlg) || (obj instanceof zzkl)) {
                    return;
                }
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t10.zza()), t10.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzjq zzjq = new zzjq();
        for (int i10 = 0; i10 < this.zza.zzb(); i10++) {
            Map.Entry<T, Object> zzg = this.zza.zzg(i10);
            zzjq.zzc((zzjp) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry next : this.zza.zzc()) {
            zzjq.zzc((zzjp) next.getKey(), next.getValue());
        }
        zzjq.zzd = this.zzd;
        return zzjq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        return this.zza.equals(((zzjq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(T t10, Object obj) {
        if (!t10.zzc()) {
            zzd(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                zzd(t10, arrayList.get(i10));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzkl) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    private zzjq(boolean z10) {
        zzb();
        zzb();
    }
}
