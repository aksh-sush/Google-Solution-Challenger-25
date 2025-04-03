package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabn  reason: invalid package */
final class zzabn {
    private static final Class<?> zza;
    private static final zzabz<?, ?> zzb = zzab(false);
    private static final zzabz<?, ?> zzc = zzab(true);
    private static final zzabz<?, ?> zzd = new zzacb();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
    }

    public static zzabz<?, ?> zzA() {
        return zzc;
    }

    public static zzabz<?, ?> zzB() {
        return zzd;
    }

    static <UT, UB> UB zzC(int i10, List<Integer> list, zzaaa zzaaa, UB ub, zzabz<UT, UB> zzabz) {
        if (zzaaa == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzaaa.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = zzD(i10, intValue, ub, zzabz);
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
                if (!zzaaa.zza()) {
                    ub = zzD(i10, intValue2, ub, zzabz);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zzD(int i10, int i11, UB ub, zzabz<UT, UB> zzabz) {
        if (ub == null) {
            ub = zzabz.zzf();
        }
        zzabz.zzl(ub, i10, (long) i11);
        return ub;
    }

    static <T, FT extends zzzn<FT>> void zzE(zzzk<FT> zzzk, T t10, T t11) {
        zzzk.zza(t11);
        throw null;
    }

    static <T, UT, UB> void zzF(zzabz<UT, UB> zzabz, T t10, T t11) {
        zzabz.zzo(t10, zzabz.zze(zzabz.zzd(t10), zzabz.zzd(t11)));
    }

    public static void zzG(Class<?> cls) {
        Class<?> cls2;
        if (!zzzw.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zzI(zzaau zzaau, T t10, T t11, long j10) {
        zzacj.zzs(t10, j10, zzaau.zzc(zzacj.zzf(t10, j10), zzacj.zzf(t11, j10)));
    }

    public static void zzJ(int i10, List<Boolean> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzc(i10, list, z10);
        }
    }

    public static void zzK(int i10, List<zzyu> list, zzzf zzzf) {
        if (list != null && !list.isEmpty()) {
            zzzf.zze(i10, list);
        }
    }

    public static void zzL(int i10, List<Double> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzg(i10, list, z10);
        }
    }

    public static void zzM(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzj(i10, list, z10);
        }
    }

    public static void zzN(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzl(i10, list, z10);
        }
    }

    public static void zzO(int i10, List<Long> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzn(i10, list, z10);
        }
    }

    public static void zzP(int i10, List<Float> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzp(i10, list, z10);
        }
    }

    public static void zzQ(int i10, List<?> list, zzzf zzzf, zzabl zzabl) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzzf.zzq(i10, list.get(i11), zzabl);
            }
        }
    }

    public static void zzR(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzs(i10, list, z10);
        }
    }

    public static void zzS(int i10, List<Long> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzu(i10, list, z10);
        }
    }

    public static void zzT(int i10, List<?> list, zzzf zzzf, zzabl zzabl) {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                zzzf.zzv(i10, list.get(i11), zzabl);
            }
        }
    }

    public static void zzU(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzx(i10, list, z10);
        }
    }

    public static void zzV(int i10, List<Long> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzz(i10, list, z10);
        }
    }

    public static void zzW(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzB(i10, list, z10);
        }
    }

    public static void zzX(int i10, List<Long> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzD(i10, list, z10);
        }
    }

    public static void zzY(int i10, List<String> list, zzzf zzzf) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzG(i10, list);
        }
    }

    public static void zzZ(int i10, List<Integer> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzI(i10, list, z10);
        }
    }

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzze.zzE(i10 << 3) + 1);
    }

    public static void zzaa(int i10, List<Long> list, zzzf zzzf, boolean z10) {
        if (list != null && !list.isEmpty()) {
            zzzf.zzK(i10, list, z10);
        }
    }

    private static zzabz<?, ?> zzab(boolean z10) {
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
            return (zzabz) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zzb(List<?> list) {
        return list.size();
    }

    static int zzc(int i10, List<zzyu> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzze.zzD(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzD += zzze.zzw(list.get(i11));
        }
        return zzD;
    }

    static int zzd(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzze.zzD(i10));
    }

    static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzze.zzy(zzzx.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzze.zzy(list.get(i11).intValue());
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
        return size * (zzze.zzE(i10 << 3) + 4);
    }

    static int zzg(List<?> list) {
        return list.size() * 4;
    }

    static int zzh(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzze.zzE(i10 << 3) + 8);
    }

    static int zzi(List<?> list) {
        return list.size() * 8;
    }

    static int zzj(int i10, List<zzaaz> list, zzabl zzabl) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzze.zzx(i10, list.get(i12), zzabl);
        }
        return i11;
    }

    static int zzk(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzze.zzD(i10));
    }

    static int zzl(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzze.zzy(zzzx.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzze.zzy(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzm(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzze.zzD(i10));
    }

    static int zzn(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzze.zzF(zzaao.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzze.zzF(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int zzo(int i10, Object obj, zzabl zzabl) {
        if (!(obj instanceof zzaah)) {
            return zzze.zzE(i10 << 3) + zzze.zzA((zzaaz) obj, zzabl);
        }
        int zzE = zzze.zzE(i10 << 3);
        int zza2 = ((zzaah) obj).zza();
        return zzE + zzze.zzE(zza2) + zza2;
    }

    static int zzp(int i10, List<?> list, zzabl zzabl) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzze.zzD(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            zzD += obj instanceof zzaah ? zzze.zzz((zzaah) obj) : zzze.zzA((zzaaz) obj, zzabl);
        }
        return zzD;
    }

    static int zzq(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzze.zzD(i10));
    }

    static int zzr(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzzx.zze(i11);
                i10 += zzze.zzE((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i12 = i10 + zzze.zzE((intValue >> 31) ^ (intValue + intValue));
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
        return zzt(list) + (size * zzze.zzD(i10));
    }

    static int zzt(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzaao.zze(i11);
                i10 += zzze.zzF((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + zzze.zzF((longValue >> 63) ^ (longValue + longValue));
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
        int zzD = zzze.zzD(i10) * size;
        if (list instanceof zzaaj) {
            zzaaj zzaaj = (zzaaj) list;
            while (i11 < size) {
                Object zzf = zzaaj.zzf(i11);
                zzD += zzf instanceof zzyu ? zzze.zzw((zzyu) zzf) : zzze.zzC((String) zzf);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                zzD += obj instanceof zzyu ? zzze.zzw((zzyu) obj) : zzze.zzC((String) obj);
                i11++;
            }
        }
        return zzD;
    }

    static int zzv(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzze.zzD(i10));
    }

    static int zzw(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzx) {
            zzzx zzzx = (zzzx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzze.zzE(zzzx.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzze.zzE(list.get(i11).intValue());
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
        return zzy(list) + (size * zzze.zzD(i10));
    }

    static int zzy(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaao) {
            zzaao zzaao = (zzaao) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzze.zzF(zzaao.zze(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + zzze.zzF(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzabz<?, ?> zzz() {
        return zzb;
    }
}
