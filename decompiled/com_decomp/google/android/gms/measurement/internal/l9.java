package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzoe;
import h4.a0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class l9 {

    /* renamed from: a  reason: collision with root package name */
    private String f6181a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6182b;

    /* renamed from: c  reason: collision with root package name */
    private zzgd f6183c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f6184d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f6185e;

    /* renamed from: f  reason: collision with root package name */
    private Map f6186f;

    /* renamed from: g  reason: collision with root package name */
    private Map f6187g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ q9 f6188h;

    /* synthetic */ l9(q9 q9Var, String str, zzgd zzgd, BitSet bitSet, BitSet bitSet2, Map map, Map map2, a0 a0Var) {
        this.f6188h = q9Var;
        this.f6181a = str;
        this.f6184d = bitSet;
        this.f6185e = bitSet2;
        this.f6186f = map;
        this.f6187g = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f6187g.put(num, arrayList);
        }
        this.f6182b = false;
        this.f6183c = zzgd;
    }

    /* access modifiers changed from: package-private */
    public final zzfk a(int i10) {
        ArrayList arrayList;
        List list;
        zzfj zzb = zzfk.zzb();
        zzb.zza(i10);
        zzb.zzc(this.f6182b);
        zzgd zzgd = this.f6183c;
        if (zzgd != null) {
            zzb.zzd(zzgd);
        }
        zzgc zzf = zzgd.zzf();
        zzf.zzb(y8.J(this.f6184d));
        zzf.zzd(y8.J(this.f6185e));
        Map map = this.f6186f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f6186f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = (Long) this.f6186f.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    zzfl zzc = zzfm.zzc();
                    zzc.zzb(intValue2);
                    zzc.zza(l10.longValue());
                    arrayList2.add((zzfm) zzc.zzaA());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map map2 = this.f6187g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f6187g.keySet()) {
                zzge zzd = zzgf.zzd();
                zzd.zzb(num.intValue());
                List list2 = (List) this.f6187g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzgf) zzd.zzaA());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (zzfk) zzb.zzaA();
    }

    /* access modifiers changed from: package-private */
    public final void c(o9 o9Var) {
        int a10 = o9Var.a();
        Boolean bool = o9Var.f6298c;
        if (bool != null) {
            this.f6185e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = o9Var.f6299d;
        if (bool2 != null) {
            this.f6184d.set(a10, bool2.booleanValue());
        }
        if (o9Var.f6300e != null) {
            Map map = this.f6186f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = o9Var.f6300e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f6186f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (o9Var.f6301f != null) {
            Map map2 = this.f6187g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f6187g.put(valueOf2, list);
            }
            if (o9Var.c()) {
                list.clear();
            }
            zzoe.zzc();
            g z10 = this.f6188h.f5994a.z();
            String str = this.f6181a;
            x2 x2Var = y2.f6613a0;
            if (z10.B(str, x2Var) && o9Var.b()) {
                list.clear();
            }
            zzoe.zzc();
            boolean B = this.f6188h.f5994a.z().B(this.f6181a, x2Var);
            Long valueOf3 = Long.valueOf(o9Var.f6301f.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }

    /* synthetic */ l9(q9 q9Var, String str, a0 a0Var) {
        this.f6188h = q9Var;
        this.f6181a = str;
        this.f6182b = true;
        this.f6184d = new BitSet();
        this.f6185e = new BitSet();
        this.f6186f = new a();
        this.f6187g = new a();
    }
}
