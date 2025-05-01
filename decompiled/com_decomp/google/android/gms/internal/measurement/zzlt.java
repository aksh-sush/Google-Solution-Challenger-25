package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzlt {
    private static final Class<?> zza;
    private static final zzmi<?, ?> zzb = zzab(false);
    private static final zzmi<?, ?> zzc = zzab(true);
    private static final zzmi<?, ?> zzd = new zzmk();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzmi<?, ?> zzA() {
        return zzc;
    }

    public static zzmi<?, ?> zzB() {
        return zzd;
    }

    static <UT, UB> UB zzC(int i10, List<Integer> list, zzkd zzkd, UB ub, zzmi<UT, UB> zzmi) {
        if (zzkd == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzkd.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = zzD(i10, intValue, ub, zzmi);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzkd.zza(intValue2)) {
                    ub = zzD(i10, intValue2, ub, zzmi);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zzD(int i10, int i11, UB ub, zzmi<UT, UB> zzmi) {
        if (ub == null) {
            ub = zzmi.zze();
        }
        zzmi.zzf(ub, i10, (long) i11);
        return ub;
    }

    static <T, FT extends zzjp<FT>> void zzE(zzjm<FT> zzjm, T t10, T t11) {
        zzjm.zza(t11);
        throw null;
    }

    static <T, UT, UB> void zzF(zzmi<UT, UB> zzmi, T t10, T t11) {
        zzmi.zzh(t10, zzmi.zzd(zzmi.zzc(t10), zzmi.zzc(t11)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzjz.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zzI(zzlb zzlb, T t10, T t11, long j10) {
        zzms.zzs(t10, j10, zzlb.zzb(zzms.zzf(t10, j10), zzms.zzf(t11, j10)));
    }

    public static void zzJ(int i10, List<Boolean> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzc(i10, list, z10);
        }
    }

    public static void zzK(int i10, List<zziy> list, zzjh zzjh) {
        if (list != null && !list.isEmpty()) {
            zzjh.zze(i10, list);
        }
    }

    public static void zzL(int i10, List<Double> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzg(i10, list, z10);
        }
    }

    public static void zzM(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzj(i10, list, z10);
        }
    }

    public static void zzN(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzl(i10, list, z10);
        }
    }

    public static void zzO(int i10, List<Long> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzn(i10, list, z10);
        }
    }

    public static void zzP(int i10, List<Float> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzp(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List<?> list, zzjh zzjh, zzlr zzlr) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzjh.zzq(i10, list.get(i11), zzlr);
            }
        }
    }

    public static void zzR(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzs(i10, list, z10);
        }
    }

    public static void zzS(int i10, List<Long> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzu(i10, list, z10);
        }
    }

    public static void zzT(int i10, List<?> list, zzjh zzjh, zzlr zzlr) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzjh.zzv(i10, list.get(i11), zzlr);
            }
        }
    }

    public static void zzU(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzx(i10, list, z10);
        }
    }

    public static void zzV(int i10, List<Long> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzz(i10, list, z10);
        }
    }

    public static void zzW(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzB(i10, list, z10);
        }
    }

    public static void zzX(int i10, List<Long> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzD(i10, list, z10);
        }
    }

    public static void zzY(int i10, List<String> list, zzjh zzjh) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzG(i10, list);
        }
    }

    public static void zzZ(int i10, List<Integer> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzI(i10, list, z10);
        }
    }

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i10 << 3) + 1);
    }

    public static void zzaa(int i10, List<Long> list, zzjh zzjh, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzjh.zzK(i10, list, z10);
        }
    }

    private static zzmi<?, ?> zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzmi) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List<?> list) {
        return list.size();
    }

    static int zzc(int i10, List<zziy> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzjg.zzz(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzz += zzjg.zzt(list.get(i11));
        }
        return zzz;
    }

    static int zzd(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjg.zzz(i10));
    }

    static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzv(zzka.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzv(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzf(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i10 << 3) + 4);
    }

    static int zzg(List<?> list) {
        return list.size() * 4;
    }

    static int zzh(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzA(i10 << 3) + 8);
    }

    static int zzi(List<?> list) {
        return list.size() * 8;
    }

    static int zzj(int i10, List<zzlg> list, zzlr zzlr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzjg.zzu(i10, list.get(i12), zzlr);
        }
        return i11;
    }

    static int zzk(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzjg.zzz(i10));
    }

    static int zzl(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzv(zzka.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzv(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzm(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzjg.zzz(i10));
    }

    static int zzn(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkv = (zzkv) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzB(zzkv.zza(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzB(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzo(int i10, Object obj, zzlr zzlr) {
        if (!(obj instanceof zzkm)) {
            return zzjg.zzA(i10 << 3) + zzjg.zzx((zzlg) obj, zzlr);
        }
        int zzA = zzjg.zzA(i10 << 3);
        int zza2 = ((zzkm) obj).zza();
        return zzA + zzjg.zzA(zza2) + zza2;
    }

    static int zzp(int i10, List<?> list, zzlr zzlr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjg.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzz += obj instanceof zzkm ? zzjg.zzw((zzkm) obj) : zzjg.zzx((zzlg) obj, zzlr);
        }
        return zzz;
    }

    static int zzq(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjg.zzz(i10));
    }

    static int zzr(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzka.zze(i11);
                i10 += zzjg.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i12 = i10 + zzjg.zzA((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzs(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzjg.zzz(i10));
    }

    static int zzt(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkv = (zzkv) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzkv.zza(i11);
                i10 += zzjg.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + zzjg.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    static int zzu(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjg.zzz(i10) * size;
        if (list instanceof zzko) {
            zzko zzko = (zzko) list;
            while (i11 < size) {
                Object zzf = zzko.zzf(i11);
                zzz += zzf instanceof zziy ? zzjg.zzt((zziy) zzf) : zzjg.zzy((String) zzf);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzz += obj instanceof zziy ? zzjg.zzt((zziy) obj) : zzjg.zzy((String) obj);
                i11++;
            }
        }
        return zzz;
    }

    static int zzv(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjg.zzz(i10));
    }

    static int zzw(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzka) {
            zzka zzka = (zzka) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzA(zzka.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzA(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzx(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzjg.zzz(i10));
    }

    static int zzy(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkv) {
            zzkv zzkv = (zzkv) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjg.zzB(zzkv.zza(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzjg.zzB(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzmi<?, ?> zzz() {
        return zzb;
    }
}
