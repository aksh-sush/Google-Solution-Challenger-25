package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class zzlj<T> implements zzlr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzms.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlg zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzku zzm;
    private final zzmi<?, ?> zzn;
    private final zzjm<?> zzo;
    private final zzll zzp;
    private final zzlb zzq;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.measurement.zzlg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.gms.internal.measurement.zzll} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.measurement.zzlb} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.measurement.zzjm, com.google.android.gms.internal.measurement.zzjm<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.measurement.zzku] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.measurement.zzmi<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzlj(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzlg r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.measurement.zzll r17, com.google.android.gms.internal.measurement.zzku r18, com.google.android.gms.internal.measurement.zzmi<?, ?> r19, com.google.android.gms.internal.measurement.zzjm<?> r20, com.google.android.gms.internal.measurement.zzlb r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.zzc = r3
            r3 = r7
            r0.zzd = r3
            r3 = r8
            r0.zze = r3
            r3 = r9
            r0.zzf = r3
            r3 = r11
            r0.zzi = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.zzc(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.zzh = r3
            r3 = r13
            r0.zzj = r3
            r3 = r14
            r0.zzk = r3
            r3 = r15
            r0.zzl = r3
            r3 = r16
            r0.zzp = r3
            r3 = r17
            r0.zzm = r3
            r3 = r18
            r0.zzn = r3
            r0.zzo = r2
            r0.zzg = r1
            r1 = r20
            r0.zzq = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.measurement.zzlg, boolean, boolean, int[], int, int, com.google.android.gms.internal.measurement.zzll, com.google.android.gms.internal.measurement.zzku, com.google.android.gms.internal.measurement.zzmi, com.google.android.gms.internal.measurement.zzjm, com.google.android.gms.internal.measurement.zzlb, byte[]):void");
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> long zzC(T t10, long j10) {
        return ((Long) zzms.zzf(t10, j10)).longValue();
    }

    private final zzkd zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkd) this.zzd[i11 + i11 + 1];
    }

    private final zzlr zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlr zzlr = (zzlr) this.zzd[i12];
        if (zzlr != null) {
            return zzlr;
        }
        zzlr zzb2 = zzlo.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final void zzH(T t10, T t11, int i10) {
        long zzB = (long) (zzB(i10) & 1048575);
        if (zzM(t11, i10)) {
            Object zzf2 = zzms.zzf(t10, zzB);
            Object zzf3 = zzms.zzf(t11, zzB);
            if (zzf2 != null && zzf3 != null) {
                zzf3 = zzkh.zzg(zzf2, zzf3);
            } else if (zzf3 == null) {
                return;
            }
            zzms.zzs(t10, zzB, zzf3);
            zzJ(t10, i10);
        }
    }

    private final void zzI(T t10, T t11, int i10) {
        int zzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = (long) (zzB & 1048575);
        if (zzP(t11, i11, i10)) {
            Object zzf2 = zzP(t10, i11, i10) ? zzms.zzf(t10, j10) : null;
            Object zzf3 = zzms.zzf(t11, j10);
            if (zzf2 != null && zzf3 != null) {
                zzf3 = zzkh.zzg(zzf2, zzf3);
            } else if (zzf3 == null) {
                return;
            }
            zzms.zzs(t10, j10, zzf3);
            zzK(t10, i11, i10);
        }
    }

    private final void zzJ(T t10, int i10) {
        int zzy = zzy(i10);
        long j10 = (long) (1048575 & zzy);
        if (j10 != 1048575) {
            zzms.zzq(t10, j10, (1 << (zzy >>> 20)) | zzms.zzc(t10, j10));
        }
    }

    private final void zzK(T t10, int i10, int i11) {
        zzms.zzq(t10, (long) (zzy(i11) & 1048575), i10);
    }

    private final boolean zzL(T t10, T t11, int i10) {
        return zzM(t10, i10) == zzM(t11, i10);
    }

    private final boolean zzM(T t10, int i10) {
        int zzy = zzy(i10);
        long j10 = (long) (zzy & 1048575);
        if (j10 != 1048575) {
            return (zzms.zzc(t10, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i10);
        long j11 = (long) (zzB & 1048575);
        switch (zzA(zzB)) {
            case 0:
                return zzms.zza(t10, j11) != 0.0d;
            case 1:
                return zzms.zzb(t10, j11) != 0.0f;
            case 2:
                return zzms.zzd(t10, j11) != 0;
            case 3:
                return zzms.zzd(t10, j11) != 0;
            case 4:
                return zzms.zzc(t10, j11) != 0;
            case 5:
                return zzms.zzd(t10, j11) != 0;
            case 6:
                return zzms.zzc(t10, j11) != 0;
            case 7:
                return zzms.zzw(t10, j11);
            case 8:
                Object zzf2 = zzms.zzf(t10, j11);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zziy) {
                    return !zziy.zzb.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzms.zzf(t10, j11) != null;
            case 10:
                return !zziy.zzb.equals(zzms.zzf(t10, j11));
            case 11:
                return zzms.zzc(t10, j11) != 0;
            case 12:
                return zzms.zzc(t10, j11) != 0;
            case 13:
                return zzms.zzc(t10, j11) != 0;
            case 14:
                return zzms.zzd(t10, j11) != 0;
            case 15:
                return zzms.zzc(t10, j11) != 0;
            case 16:
                return zzms.zzd(t10, j11) != 0;
            case 17:
                return zzms.zzf(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzN(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzM(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean zzO(Object obj, int i10, zzlr zzlr) {
        return zzlr.zzj(zzms.zzf(obj, (long) (i10 & 1048575)));
    }

    private final boolean zzP(T t10, int i10, int i11) {
        return zzms.zzc(t10, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static <T> boolean zzQ(T t10, long j10) {
        return ((Boolean) zzms.zzf(t10, j10)).booleanValue();
    }

    private final void zzR(T t10, zzjh zzjh) {
        int i10;
        T t11 = t10;
        zzjh zzjh2 = zzjh;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int zzB = zzB(i12);
                int i15 = this.zzc[i12];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
                    int i16 = this.zzc[i12 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i14) {
                        i13 = unsafe.getInt(t11, (long) i17);
                        i14 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = (long) (zzB & i11);
                switch (zzA) {
                    case 0:
                        if ((i13 & i10) == 0) {
                            break;
                        } else {
                            zzjh2.zzf(i15, zzms.zza(t11, j10));
                            continue;
                        }
                    case 1:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzo(i15, zzms.zzb(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzt(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzJ(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzr(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzm(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzk(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzb(i15, zzms.zzw(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i13 & i10) != 0) {
                            zzT(i15, unsafe.getObject(t11, j10), zzjh2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzv(i15, unsafe.getObject(t11, j10), zzE(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzd(i15, (zziy) unsafe.getObject(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzH(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzi(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzw(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzy(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzA(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzC(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i13 & i10) != 0) {
                            zzjh2.zzq(i15, unsafe.getObject(t11, j10), zzE(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzlt.zzL(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 19:
                        zzlt.zzP(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 20:
                        zzlt.zzS(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 21:
                        zzlt.zzaa(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 22:
                        zzlt.zzR(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 23:
                        zzlt.zzO(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 24:
                        zzlt.zzN(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 25:
                        zzlt.zzJ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        continue;
                    case 26:
                        zzlt.zzY(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2);
                        break;
                    case 27:
                        zzlt.zzT(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, zzE(i12));
                        break;
                    case 28:
                        zzlt.zzK(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2);
                        break;
                    case 29:
                        zzlt.zzZ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 30:
                        zzlt.zzM(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 31:
                        zzlt.zzU(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 32:
                        zzlt.zzV(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 33:
                        zzlt.zzW(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 34:
                        zzlt.zzX(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, false);
                        break;
                    case 35:
                        zzlt.zzL(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 36:
                        zzlt.zzP(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 37:
                        zzlt.zzS(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 38:
                        zzlt.zzaa(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 39:
                        zzlt.zzR(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 40:
                        zzlt.zzO(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 41:
                        zzlt.zzN(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 42:
                        zzlt.zzJ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 43:
                        zzlt.zzZ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 44:
                        zzlt.zzM(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 45:
                        zzlt.zzU(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 46:
                        zzlt.zzV(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 47:
                        zzlt.zzW(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 48:
                        zzlt.zzX(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, true);
                        break;
                    case 49:
                        zzlt.zzQ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzjh2, zzE(i12));
                        break;
                    case 50:
                        zzS(zzjh2, i15, unsafe.getObject(t11, j10), i12);
                        break;
                    case 51:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzf(i15, zzn(t11, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzo(i15, zzo(t11, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzt(i15, zzC(t11, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzJ(i15, zzC(t11, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzr(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzm(i15, zzC(t11, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzk(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzb(i15, zzQ(t11, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzP(t11, i15, i12)) {
                            zzT(i15, unsafe.getObject(t11, j10), zzjh2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzv(i15, unsafe.getObject(t11, j10), zzE(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzd(i15, (zziy) unsafe.getObject(t11, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzH(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzi(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzw(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzy(i15, zzC(t11, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzA(i15, zzr(t11, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzC(i15, zzC(t11, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzP(t11, i15, i12)) {
                            zzjh2.zzq(i15, unsafe.getObject(t11, j10), zzE(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            zzmi<?, ?> zzmi = this.zzn;
            zzmi.zzi(zzmi.zzc(t11), zzjh2);
            return;
        }
        this.zzo.zza(t11);
        throw null;
    }

    private final <K, V> void zzS(zzjh zzjh, int i10, Object obj, int i11) {
        if (obj != null) {
            zzkz zzkz = (zzkz) zzF(i11);
            throw null;
        }
    }

    private static final void zzT(int i10, Object obj, zzjh zzjh) {
        if (obj instanceof String) {
            zzjh.zzF(i10, (String) obj);
        } else {
            zzjh.zzd(i10, (zziy) obj);
        }
    }

    static zzmj zzd(Object obj) {
        zzjz zzjz = (zzjz) obj;
        zzmj zzmj = zzjz.zzc;
        if (zzmj != zzmj.zzc()) {
            return zzmj;
        }
        zzmj zze2 = zzmj.zze();
        zzjz.zzc = zze2;
        return zze2;
    }

    static <T> zzlj<T> zzk(Class<T> cls, zzld zzld, zzll zzll, zzku zzku, zzmi<?, ?> zzmi, zzjm<?> zzjm, zzlb zzlb) {
        if (zzld instanceof zzlq) {
            return zzl((zzlq) zzld, zzll, zzku, zzmi, zzjm, zzlb);
        }
        zzmf zzmf = (zzmf) zzld;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.zzlj<T> zzl(com.google.android.gms.internal.measurement.zzlq r34, com.google.android.gms.internal.measurement.zzll r35, com.google.android.gms.internal.measurement.zzku r36, com.google.android.gms.internal.measurement.zzmi<?, ?> r37, com.google.android.gms.internal.measurement.zzjm<?> r38, com.google.android.gms.internal.measurement.zzlb r39) {
        /*
            int r0 = r34.zzc()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.zzd()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = zza
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r34.zze()
            com.google.android.gms.internal.measurement.zzlg r18 = r34.zza()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r1) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0193:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a5
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0193
        L_0x01a5:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ad
        L_0x01ab:
            r3 = r24
        L_0x01ad:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01da
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d4
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01bb
        L_0x01d4:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r1
            r1 = r24
        L_0x01de:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0222
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r1 = r1 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r1 = r1 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r1 = r1 + r1
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzG(r2, r12)
            r17[r1] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r1 = r1 + 1
            r7 = r17[r1]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzG(r2, r7)
            r17[r1] = r7
        L_0x0283:
            r1 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r0 = r6
            r7 = r8
            r29 = r11
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzG(r2, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r1 + 1
            char r1 = r0.charAt(r1)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r11) goto L_0x0354
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r1 = r1 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r1 = r1 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r1 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zzG(r2, r11)
            r17[r7] = r11
        L_0x036f:
            r0 = r6
            long r6 = r15.objectFieldOffset(r11)
            int r7 = (int) r6
            int r1 = r1 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r0 = r6
            r27 = r1
            r1 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0381:
            r6 = 18
            if (r5 < r6) goto L_0x038f
            r6 = 49
            if (r5 > r6) goto L_0x038f
            int r6 = r23 + 1
            r13[r23] = r8
            r23 = r6
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r6 = r9 + 1
            r31[r9] = r4
            int r4 = r6 + 1
            r9 = r3 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a6
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r3 = 0
        L_0x03a7:
            r3 = r3 | r9
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r31[r6] = r3
            int r9 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r7
            r31[r4] = r1
            r6 = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.measurement.zzlj r0 = new com.google.android.gms.internal.measurement.zzlj
            r4 = r0
            com.google.android.gms.internal.measurement.zzlg r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzl(com.google.android.gms.internal.measurement.zzlq, com.google.android.gms.internal.measurement.zzll, com.google.android.gms.internal.measurement.zzku, com.google.android.gms.internal.measurement.zzmi, com.google.android.gms.internal.measurement.zzjm, com.google.android.gms.internal.measurement.zzlb):com.google.android.gms.internal.measurement.zzlj");
    }

    private static <T> double zzn(T t10, long j10) {
        return ((Double) zzms.zzf(t10, j10)).doubleValue();
    }

    private static <T> float zzo(T t10, long j10) {
        return ((Float) zzms.zzf(t10, j10)).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026a, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzu(r8, (com.google.android.gms.internal.measurement.zzlg) r0.getObject(r15, r12), zzE(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0281, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
        r7 = com.google.android.gms.internal.measurement.zzjg.zzB((r9 >> 63) ^ (r9 + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
        r7 = (r7 >> 31) ^ (r7 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cf, code lost:
        r7 = r0.getObject(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d3, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
        r7 = ((com.google.android.gms.internal.measurement.zziy) r7).zzd();
        r8 = r8 + (com.google.android.gms.internal.measurement.zzjg.zzA(r7) + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        r7 = com.google.android.gms.internal.measurement.zzlt.zzo(r8, r0.getObject(r15, r12), zzE(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0302, code lost:
        if ((r7 instanceof com.google.android.gms.internal.measurement.zziy) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0305, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
        r7 = com.google.android.gms.internal.measurement.zzjg.zzy((java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0316, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032d, code lost:
        r7 = r0.getInt(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0331, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3);
        r7 = com.google.android.gms.internal.measurement.zzjg.zzv(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x033b, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x033c, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0347, code lost:
        r9 = r0.getLong(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034b, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3) + com.google.android.gms.internal.measurement.zzjg.zzB(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035c, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036a, code lost:
        r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r8 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0374, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if ((r7 instanceof com.google.android.gms.internal.measurement.zziy) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r7 = zzr(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r9 = zzC(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c3, code lost:
        r8 = com.google.android.gms.internal.measurement.zzjg.zzz(r8) + com.google.android.gms.internal.measurement.zzjg.zzA(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        r4 = r4 + r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzp(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.zzc
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0378
            int r7 = r14.zzB(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzA(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.zzc
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r2
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r2
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0366;
                case 1: goto L_0x0358;
                case 2: goto L_0x0343;
                case 3: goto L_0x033e;
                case 4: goto L_0x0329;
                case 5: goto L_0x0324;
                case 6: goto L_0x031f;
                case 7: goto L_0x0312;
                case 8: goto L_0x02f8;
                case 9: goto L_0x02e6;
                case 10: goto L_0x02cb;
                case 11: goto L_0x02b7;
                case 12: goto L_0x02b1;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a5;
                case 15: goto L_0x0291;
                case 16: goto L_0x0279;
                case 17: goto L_0x0266;
                case 18: goto L_0x0259;
                case 19: goto L_0x024e;
                case 20: goto L_0x0243;
                case 21: goto L_0x0238;
                case 22: goto L_0x022d;
                case 23: goto L_0x0259;
                case 24: goto L_0x024e;
                case 25: goto L_0x0222;
                case 26: goto L_0x0217;
                case 27: goto L_0x0208;
                case 28: goto L_0x01fd;
                case 29: goto L_0x01f2;
                case 30: goto L_0x01e6;
                case 31: goto L_0x024e;
                case 32: goto L_0x0259;
                case 33: goto L_0x01da;
                case 34: goto L_0x01ce;
                case 35: goto L_0x01b7;
                case 36: goto L_0x01aa;
                case 37: goto L_0x019d;
                case 38: goto L_0x0190;
                case 39: goto L_0x0183;
                case 40: goto L_0x0176;
                case 41: goto L_0x0169;
                case 42: goto L_0x015c;
                case 43: goto L_0x014e;
                case 44: goto L_0x0140;
                case 45: goto L_0x0132;
                case 46: goto L_0x0124;
                case 47: goto L_0x0116;
                case 48: goto L_0x0108;
                case 49: goto L_0x00f8;
                case 50: goto L_0x00eb;
                case 51: goto L_0x00e3;
                case 52: goto L_0x00db;
                case 53: goto L_0x00cf;
                case 54: goto L_0x00c8;
                case 55: goto L_0x00bc;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00ac;
                case 58: goto L_0x00a4;
                case 59: goto L_0x0094;
                case 60: goto L_0x008c;
                case 61: goto L_0x0084;
                case 62: goto L_0x0078;
                case 63: goto L_0x0071;
                case 64: goto L_0x0069;
                case 65: goto L_0x0061;
                case 66: goto L_0x0055;
                case 67: goto L_0x0049;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0374
        L_0x0041:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x026a
        L_0x0049:
            boolean r9 = r14.zzP(r15, r8, r3)
            if (r9 == 0) goto L_0x0374
            long r9 = zzC(r15, r12)
            goto L_0x0281
        L_0x0055:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = zzr(r15, r12)
            goto L_0x0299
        L_0x0061:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x0069:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x0071:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00c2
        L_0x0078:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = zzr(r15, r12)
            goto L_0x02bf
        L_0x0084:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02cf
        L_0x008c:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02ea
        L_0x0094:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.zziy
            if (r9 == 0) goto L_0x0305
            goto L_0x0304
        L_0x00a4:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x0316
        L_0x00ac:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00b4:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00bc:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00c2:
            int r7 = zzr(r15, r12)
            goto L_0x0331
        L_0x00c8:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00d5
        L_0x00cf:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00d5:
            long r9 = zzC(r15, r12)
            goto L_0x034b
        L_0x00db:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00e3:
            boolean r7 = r14.zzP(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00eb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzF(r3)
            com.google.android.gms.internal.measurement.zzlb.zza(r8, r7, r9)
            goto L_0x0374
        L_0x00f8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.zzlr r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzj(r8, r7, r9)
            goto L_0x0263
        L_0x0108:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzt(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0116:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzr(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0124:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzi(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0132:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0140:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zze(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x014e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzw(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x015c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzb(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0169:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0176:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzi(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0183:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzl(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0190:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzy(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x019d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzn(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01aa:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzi(r7)
            if (r7 <= 0) goto L_0x0374
        L_0x01c3:
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzz(r8)
            int r9 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r8 = r8 + r9
            goto L_0x033b
        L_0x01ce:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzs(r8, r7, r1)
            goto L_0x0263
        L_0x01da:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzq(r8, r7, r1)
            goto L_0x0263
        L_0x01e6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzd(r8, r7, r1)
            goto L_0x0263
        L_0x01f2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzv(r8, r7, r1)
            goto L_0x0263
        L_0x01fd:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzc(r8, r7)
            goto L_0x0263
        L_0x0208:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.zzlr r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzp(r8, r7, r9)
            goto L_0x0263
        L_0x0217:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzu(r8, r7)
            goto L_0x0263
        L_0x0222:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zza(r8, r7, r1)
            goto L_0x0263
        L_0x022d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzk(r8, r7, r1)
            goto L_0x0263
        L_0x0238:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzx(r8, r7, r1)
            goto L_0x0263
        L_0x0243:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzm(r8, r7, r1)
            goto L_0x0263
        L_0x024e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzf(r8, r7, r1)
            goto L_0x0263
        L_0x0259:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzh(r8, r7, r1)
        L_0x0263:
            int r4 = r4 + r7
            goto L_0x0374
        L_0x0266:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x026a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlg r7 = (com.google.android.gms.internal.measurement.zzlg) r7
            com.google.android.gms.internal.measurement.zzlr r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzu(r8, r7, r9)
            goto L_0x0263
        L_0x0279:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0374
            long r9 = r0.getLong(r15, r12)
        L_0x0281:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzB(r9)
            goto L_0x033b
        L_0x0291:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            int r7 = r0.getInt(r15, r12)
        L_0x0299:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            goto L_0x02c5
        L_0x02a5:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x02ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x02b1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x032d
        L_0x02b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            int r7 = r0.getInt(r15, r12)
        L_0x02bf:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
        L_0x02c5:
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            goto L_0x033b
        L_0x02cb:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02cf:
            java.lang.Object r7 = r0.getObject(r15, r12)
        L_0x02d3:
            com.google.android.gms.internal.measurement.zziy r7 = (com.google.android.gms.internal.measurement.zziy) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x033c
        L_0x02e6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02ea:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.zzlr r9 = r14.zzE(r3)
            int r7 = com.google.android.gms.internal.measurement.zzlt.zzo(r8, r7, r9)
            goto L_0x0263
        L_0x02f8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.zziy
            if (r9 == 0) goto L_0x0305
        L_0x0304:
            goto L_0x02d3
        L_0x0305:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzy(r7)
            goto L_0x033b
        L_0x0312:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x0316:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r7 = r7 + r11
            goto L_0x0263
        L_0x031f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x0324:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x0329:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x032d:
            int r7 = r0.getInt(r15, r12)
        L_0x0331:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzA(r8)
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzv(r7)
        L_0x033b:
            int r8 = r8 + r7
        L_0x033c:
            int r4 = r4 + r8
            goto L_0x0374
        L_0x033e:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            goto L_0x0347
        L_0x0343:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x0347:
            long r9 = r0.getLong(r15, r12)
        L_0x034b:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r8 = com.google.android.gms.internal.measurement.zzjg.zzB(r9)
            int r7 = r7 + r8
            goto L_0x0263
        L_0x0358:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x035c:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r7 = r7 + 4
            goto L_0x0263
        L_0x0366:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x036a:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.zzjg.zzA(r7)
            int r7 = r7 + 8
            goto L_0x0263
        L_0x0374:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0378:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r14.zzn
            java.lang.Object r1 = r0.zzc(r15)
            int r0 = r0.zza(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x0388
            return r4
        L_0x0388:
            com.google.android.gms.internal.measurement.zzjm<?> r0 = r14.zzo
            r0.zza(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzp(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r4 = com.google.android.gms.internal.measurement.zzjg.zzu(r6, (com.google.android.gms.internal.measurement.zzlg) com.google.android.gms.internal.measurement.zzms.zzf(r12, r7), zzE(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.zzjg.zzB((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0297, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
        r4 = ((com.google.android.gms.internal.measurement.zziy) r4).zzd();
        r5 = r5 + (com.google.android.gms.internal.measurement.zzjg.zzA(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r4 = com.google.android.gms.internal.measurement.zzlt.zzo(r6, com.google.android.gms.internal.measurement.zzms.zzf(r12, r7), zzE(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zziy) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0311, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.zzjg.zzy((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        r4 = com.google.android.gms.internal.measurement.zzms.zzc(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3);
        r4 = com.google.android.gms.internal.measurement.zzjg.zzv(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0360, code lost:
        r4 = com.google.android.gms.internal.measurement.zzms.zzd(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r3 = r3 + (com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3) + com.google.android.gms.internal.measurement.zzjg.zzB(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zziy) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = zzr(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = zzC(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r5 = com.google.android.gms.internal.measurement.zzjg.zzz(r6) + com.google.android.gms.internal.measurement.zzjg.zzA(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r3 = r3 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0395
            int r4 = r11.zzB(r2)
            int r5 = zzA(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.zzjr r4 = com.google.android.gms.internal.measurement.zzjr.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.zzjr r4 = com.google.android.gms.internal.measurement.zzjr.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.zzc
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0381;
                case 1: goto L_0x0371;
                case 2: goto L_0x035a;
                case 3: goto L_0x0353;
                case 4: goto L_0x033c;
                case 5: goto L_0x0335;
                case 6: goto L_0x032e;
                case 7: goto L_0x031e;
                case 8: goto L_0x0302;
                case 9: goto L_0x02ee;
                case 10: goto L_0x02d1;
                case 11: goto L_0x02bb;
                case 12: goto L_0x02b3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x028d;
                case 16: goto L_0x0272;
                case 17: goto L_0x025d;
                case 18: goto L_0x0250;
                case 19: goto L_0x0245;
                case 20: goto L_0x023a;
                case 21: goto L_0x022f;
                case 22: goto L_0x0224;
                case 23: goto L_0x0250;
                case 24: goto L_0x0245;
                case 25: goto L_0x0219;
                case 26: goto L_0x020e;
                case 27: goto L_0x01ff;
                case 28: goto L_0x01f4;
                case 29: goto L_0x01e9;
                case 30: goto L_0x01dd;
                case 31: goto L_0x0245;
                case 32: goto L_0x0250;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01c5;
                case 35: goto L_0x01ae;
                case 36: goto L_0x01a1;
                case 37: goto L_0x0194;
                case 38: goto L_0x0187;
                case 39: goto L_0x017a;
                case 40: goto L_0x016d;
                case 41: goto L_0x0160;
                case 42: goto L_0x0153;
                case 43: goto L_0x0145;
                case 44: goto L_0x0137;
                case 45: goto L_0x0129;
                case 46: goto L_0x011b;
                case 47: goto L_0x010d;
                case 48: goto L_0x00ff;
                case 49: goto L_0x00ef;
                case 50: goto L_0x00e2;
                case 51: goto L_0x00da;
                case 52: goto L_0x00d2;
                case 53: goto L_0x00c6;
                case 54: goto L_0x00bf;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ab;
                case 57: goto L_0x00a3;
                case 58: goto L_0x009b;
                case 59: goto L_0x008b;
                case 60: goto L_0x0083;
                case 61: goto L_0x007b;
                case 62: goto L_0x006f;
                case 63: goto L_0x0068;
                case 64: goto L_0x0060;
                case 65: goto L_0x0058;
                case 66: goto L_0x004c;
                case 67: goto L_0x0040;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0391
        L_0x0038:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0263
        L_0x0040:
            boolean r5 = r11.zzP(r12, r6, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = zzC(r12, r7)
            goto L_0x027c
        L_0x004c:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = zzr(r12, r7)
            goto L_0x0297
        L_0x0058:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x0060:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0068:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = zzr(r12, r7)
            goto L_0x02c5
        L_0x007b:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02d7
        L_0x0083:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02f4
        L_0x008b:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zziy
            if (r5 == 0) goto L_0x0311
            goto L_0x0310
        L_0x009b:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0324
        L_0x00a3:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00ab:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00b3:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00b9:
            int r4 = zzr(r12, r7)
            goto L_0x0346
        L_0x00bf:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00cc:
            long r4 = zzC(r12, r7)
            goto L_0x0364
        L_0x00d2:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00da:
            boolean r4 = r11.zzP(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00e2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.lang.Object r5 = r11.zzF(r2)
            com.google.android.gms.internal.measurement.zzlb.zza(r6, r4, r5)
            goto L_0x0391
        L_0x00ef:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlr r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzj(r6, r4, r5)
            goto L_0x025a
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzt(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzr(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzi(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zze(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzw(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzb(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0160:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x016d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzi(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x017a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzl(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0187:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzy(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0194:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzn(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01ae:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzi(r4)
            if (r4 <= 0) goto L_0x0391
        L_0x01ba:
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzz(r6)
            int r6 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            int r5 = r5 + r6
            goto L_0x0350
        L_0x01c5:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzs(r6, r4, r1)
            goto L_0x025a
        L_0x01d1:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzq(r6, r4, r1)
            goto L_0x025a
        L_0x01dd:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzd(r6, r4, r1)
            goto L_0x025a
        L_0x01e9:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzv(r6, r4, r1)
            goto L_0x025a
        L_0x01f4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzc(r6, r4)
            goto L_0x025a
        L_0x01ff:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.zzlr r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzp(r6, r4, r5)
            goto L_0x025a
        L_0x020e:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzu(r6, r4)
            goto L_0x025a
        L_0x0219:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zza(r6, r4, r1)
            goto L_0x025a
        L_0x0224:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzk(r6, r4, r1)
            goto L_0x025a
        L_0x022f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzx(r6, r4, r1)
            goto L_0x025a
        L_0x023a:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzm(r6, r4, r1)
            goto L_0x025a
        L_0x0245:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzf(r6, r4, r1)
            goto L_0x025a
        L_0x0250:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzh(r6, r4, r1)
        L_0x025a:
            int r3 = r3 + r4
            goto L_0x0391
        L_0x025d:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0263:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlg r4 = (com.google.android.gms.internal.measurement.zzlg) r4
            com.google.android.gms.internal.measurement.zzlr r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzu(r6, r4, r5)
            goto L_0x025a
        L_0x0272:
            boolean r5 = r11.zzM(r12, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = com.google.android.gms.internal.measurement.zzms.zzd(r12, r7)
        L_0x027c:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzB(r6)
            goto L_0x0350
        L_0x028d:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r12, r7)
        L_0x0297:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02cb
        L_0x02a3:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x02ab:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x02b3:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0342
        L_0x02bb:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r12, r7)
        L_0x02c5:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
        L_0x02cb:
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            goto L_0x0350
        L_0x02d1:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02d7:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
        L_0x02db:
            com.google.android.gms.internal.measurement.zziy r4 = (com.google.android.gms.internal.measurement.zziy) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x0351
        L_0x02ee:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02f4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            com.google.android.gms.internal.measurement.zzlr r5 = r11.zzE(r2)
            int r4 = com.google.android.gms.internal.measurement.zzlt.zzo(r6, r4, r5)
            goto L_0x025a
        L_0x0302:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zziy
            if (r5 == 0) goto L_0x0311
        L_0x0310:
            goto L_0x02db
        L_0x0311:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzy(r4)
            goto L_0x0350
        L_0x031e:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0324:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            int r4 = r4 + 1
            goto L_0x025a
        L_0x032e:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0335:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x033c:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0342:
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r12, r7)
        L_0x0346:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.zzjg.zzA(r5)
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzv(r4)
        L_0x0350:
            int r5 = r5 + r4
        L_0x0351:
            int r3 = r3 + r5
            goto L_0x0391
        L_0x0353:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0360
        L_0x035a:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0360:
            long r4 = com.google.android.gms.internal.measurement.zzms.zzd(r12, r7)
        L_0x0364:
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.zzjg.zzA(r6)
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzB(r4)
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0391
        L_0x0371:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0377:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            int r4 = r4 + 4
            goto L_0x025a
        L_0x0381:
            boolean r4 = r11.zzM(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0387:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.zzjg.zzA(r4)
            int r4 = r4 + 8
            goto L_0x025a
        L_0x0391:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0395:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r11.zzn
            java.lang.Object r12 = r0.zzc(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzq(java.lang.Object):int");
    }

    private static <T> int zzr(T t10, long j10) {
        return ((Integer) zzms.zzf(t10, j10)).intValue();
    }

    private final <K, V> int zzs(T t10, byte[] bArr, int i10, int i11, int i12, long j10, zzik zzik) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i12);
        Object object = unsafe.getObject(t10, j10);
        if (!((zzla) object).zze()) {
            zzla zzb2 = zzla.zza().zzb();
            zzlb.zzb(zzb2, object);
            unsafe.putObject(t10, j10, zzb2);
        }
        zzkz zzkz = (zzkz) zzF;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzt(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.measurement.zzik r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzb
            int[] r7 = r0.zzc
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0183;
                case 52: goto L_0x016b;
                case 53: goto L_0x0160;
                case 54: goto L_0x0160;
                case 55: goto L_0x0155;
                case 56: goto L_0x0140;
                case 57: goto L_0x012b;
                case 58: goto L_0x0114;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x0155;
                case 63: goto L_0x0084;
                case 64: goto L_0x012b;
                case 65: goto L_0x0140;
                case 66: goto L_0x0071;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x019c
            com.google.android.gms.internal.measurement.zzlr r5 = r0.zzE(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzil.zzc(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.zzc
            if (r15 != 0) goto L_0x0052
            goto L_0x00ec
        L_0x0052:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzkh.zzg(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r11)
            long r3 = r11.zzb
            long r3 = com.google.android.gms.internal.measurement.zzjc.zzc(r3)
        L_0x0066:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x006a:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0071:
            if (r5 == 0) goto L_0x0075
            goto L_0x019c
        L_0x0075:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r11)
            int r3 = r11.zza
            int r3 = com.google.android.gms.internal.measurement.zzjc.zzb(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r11)
            int r4 = r11.zza
            com.google.android.gms.internal.measurement.zzkd r5 = r0.zzD(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.zza(r4)
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            com.google.android.gms.internal.measurement.zzmj r1 = zzd(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzh(r2, r4)
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00b0:
            r2 = r3
            goto L_0x019d
        L_0x00b3:
            if (r5 == r15) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            int r2 = com.google.android.gms.internal.measurement.zzil.zza(r3, r4, r11)
            java.lang.Object r3 = r11.zzc
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            com.google.android.gms.internal.measurement.zzlr r2 = r0.zzE(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.measurement.zzil.zzd(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d5
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            java.lang.Object r3 = r11.zzc
            if (r15 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzkh.zzg(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r11)
            int r4 = r11.zza
            if (r4 != 0) goto L_0x00f0
            java.lang.String r3 = ""
        L_0x00ec:
            r12.putObject(r1, r9, r3)
            goto L_0x010f
        L_0x00f0:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0104
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.measurement.zzmx.zzf(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzc()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.measurement.zzkh.zza
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r11)
            long r3 = r11.zzb
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0124
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x006a
        L_0x012b:
            if (r5 == r7) goto L_0x012f
            goto L_0x019c
        L_0x012f:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzb(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0140:
            r2 = 1
            if (r5 == r2) goto L_0x0144
            goto L_0x019c
        L_0x0144:
            long r2 = com.google.android.gms.internal.measurement.zzil.zzn(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r11)
            int r3 = r11.zza
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r11)
            long r3 = r11.zzb
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = com.google.android.gms.internal.measurement.zzil.zzb(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0183:
            r2 = 1
            if (r5 == r2) goto L_0x0187
            goto L_0x019c
        L_0x0187:
            long r2 = com.google.android.gms.internal.measurement.zzil.zzn(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x019c:
            r2 = r4
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzt(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02af, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e0, code lost:
        if (r0 != r15) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0301, code lost:
        if (r0 != r15) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r19 = r32;
        r11 = r34;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r9.putObject(r14, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        r6 = r6 | r20;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        r2 = r8;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01de, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01fa, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fc, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01fd, code lost:
        r1 = r19;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0202, code lost:
        r6 = r32;
        r2 = r4;
        r18 = r8;
        r28 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0299, code lost:
        if (r0 != r15) goto L_0x029b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzu(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.measurement.zzik r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = zzb
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x032a
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.zzil.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.zzx(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.zzw(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r8) goto L_0x004e
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = 0
        L_0x004a:
            r27 = -1
            goto L_0x0304
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = zzA(r1)
            r8 = r1 & r10
            long r10 = (long) r8
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x020b
            int[] r8 = r15.zzc
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L_0x0085
            if (r7 == r10) goto L_0x007d
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x007d:
            if (r8 == r10) goto L_0x0084
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0084:
            r7 = r8
        L_0x0085:
            r8 = 5
            switch(r0) {
                case 0: goto L_0x01e1;
                case 1: goto L_0x01c7;
                case 2: goto L_0x01a5;
                case 3: goto L_0x01a5;
                case 4: goto L_0x0190;
                case 5: goto L_0x0172;
                case 6: goto L_0x015d;
                case 7: goto L_0x013b;
                case 8: goto L_0x011a;
                case 9: goto L_0x00f8;
                case 10: goto L_0x00e0;
                case 11: goto L_0x0190;
                case 12: goto L_0x00cd;
                case 13: goto L_0x015d;
                case 14: goto L_0x0172;
                case 15: goto L_0x00b3;
                case 16: goto L_0x0092;
                default: goto L_0x0089;
            }
        L_0x0089:
            r19 = r32
            r11 = r34
            r8 = r2
        L_0x008e:
            r32 = r6
            goto L_0x0202
        L_0x0092:
            if (r3 != 0) goto L_0x0089
            r11 = r34
            r0 = r22
            int r8 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r4, r11)
            long r3 = r11.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjc.zzc(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r19 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            goto L_0x01c3
        L_0x00b3:
            r19 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x008e
            int r0 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.measurement.zzjc.zzb(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            r6 = r6 | r20
            goto L_0x01fc
        L_0x00cd:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x008e
            int r2 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r4, r11)
            int r3 = r11.zza
            r9.putInt(r14, r0, r3)
            goto L_0x00f3
        L_0x00e0:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008e
            int r2 = com.google.android.gms.internal.measurement.zzil.zza(r12, r4, r11)
            java.lang.Object r3 = r11.zzc
        L_0x00f0:
            r9.putObject(r14, r0, r3)
        L_0x00f3:
            r6 = r6 | r20
            r0 = r2
            goto L_0x01fc
        L_0x00f8:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008e
            com.google.android.gms.internal.measurement.zzlr r2 = r15.zzE(r8)
            int r2 = com.google.android.gms.internal.measurement.zzil.zzd(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0113
            java.lang.Object r3 = r11.zzc
            goto L_0x00f0
        L_0x0113:
            java.lang.Object r4 = r11.zzc
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzkh.zzg(r3, r4)
            goto L_0x00f0
        L_0x011a:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x0202
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0130
            int r0 = com.google.android.gms.internal.measurement.zzil.zzg(r12, r4, r11)
            goto L_0x0134
        L_0x0130:
            int r0 = com.google.android.gms.internal.measurement.zzil.zzh(r12, r4, r11)
        L_0x0134:
            java.lang.Object r1 = r11.zzc
            r9.putObject(r14, r5, r1)
            goto L_0x01fa
        L_0x013b:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != 0) goto L_0x0202
            int r1 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r4, r11)
            long r2 = r11.zzb
            r21 = 0
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            com.google.android.gms.internal.measurement.zzms.zzm(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x01fc
        L_0x015d:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 5
            if (r3 != r0) goto L_0x0202
            int r0 = com.google.android.gms.internal.measurement.zzil.zzb(r12, r4)
            r9.putInt(r14, r5, r0)
            goto L_0x01de
        L_0x0172:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != r0) goto L_0x0202
            long r21 = com.google.android.gms.internal.measurement.zzil.zzn(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r6 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r6 + 8
            goto L_0x01fa
        L_0x0190:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0202
            int r0 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r4, r11)
            int r1 = r11.zza
            r9.putInt(r14, r5, r1)
            goto L_0x01fa
        L_0x01a5:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0202
            int r17 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r4, r11)
            long r2 = r11.zzb
            r0 = r9
            r1 = r30
            r21 = r2
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
        L_0x01c3:
            r2 = r8
            r0 = r17
            goto L_0x01fd
        L_0x01c7:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 5
            if (r3 != r0) goto L_0x0202
            int r0 = com.google.android.gms.internal.measurement.zzil.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzms.zzp(r14, r5, r0)
        L_0x01de:
            int r0 = r4 + 4
            goto L_0x01fa
        L_0x01e1:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != r0) goto L_0x0202
            long r0 = com.google.android.gms.internal.measurement.zzil.zzn(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzms.zzo(r14, r5, r0)
            int r0 = r4 + 8
        L_0x01fa:
            r6 = r32 | r20
        L_0x01fc:
            r2 = r8
        L_0x01fd:
            r1 = r19
            r8 = -1
            goto L_0x001a
        L_0x0202:
            r6 = r32
            r2 = r4
            r18 = r8
            r28 = r9
            goto L_0x004a
        L_0x020b:
            r19 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r34
            r2 = 27
            if (r0 != r2) goto L_0x0264
            r2 = 2
            if (r3 != r2) goto L_0x0257
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.android.gms.internal.measurement.zzkg r0 = (com.google.android.gms.internal.measurement.zzkg) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x023a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0232
            r1 = 10
            goto L_0x0233
        L_0x0232:
            int r1 = r1 + r1
        L_0x0233:
            com.google.android.gms.internal.measurement.zzkg r0 = r0.zzd(r1)
            r9.putObject(r14, r5, r0)
        L_0x023a:
            r5 = r0
            com.google.android.gms.internal.measurement.zzlr r0 = r15.zzE(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zze(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r15
            r1 = r19
            r8 = -1
            r15 = r29
            goto L_0x001a
        L_0x0257:
            r15 = r4
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r20
            r27 = -1
            goto L_0x02e3
        L_0x0264:
            r15 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02b1
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r22 = r3
            r3 = r4
            r23 = r15
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r19
            r26 = r7
            r7 = r22
            r18 = r8
            r27 = -1
            r28 = r9
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02af
        L_0x029b:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
            r6 = r23
            r7 = r26
            goto L_0x0322
        L_0x02af:
            r2 = r0
            goto L_0x02e4
        L_0x02b1:
            r32 = r0
            r22 = r3
            r24 = r5
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r15
            r27 = -1
            r15 = r4
            r0 = 50
            r9 = r32
            r7 = r22
            if (r9 != r0) goto L_0x02e9
            r0 = 2
            if (r7 != r0) goto L_0x02e3
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r24
            r8 = r34
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02af
            goto L_0x029b
        L_0x02e3:
            r2 = r15
        L_0x02e4:
            r6 = r23
            r7 = r26
            goto L_0x0304
        L_0x02e9:
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r19
            r10 = r24
            r12 = r18
            r13 = r34
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02af
            goto L_0x029b
        L_0x0304:
            com.google.android.gms.internal.measurement.zzmj r4 = zzd(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
        L_0x0322:
            r9 = r28
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001a
        L_0x032a:
            r23 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x033d
            long r1 = (long) r7
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x033d:
            r1 = r33
            if (r0 != r1) goto L_0x0342
            return r0
        L_0x0342:
            com.google.android.gms.internal.measurement.zzkj r0 = com.google.android.gms.internal.measurement.zzkj.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0254, code lost:
        if (r7.zzb != 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0258, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0259, code lost:
        r12.zze(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025c, code lost:
        if (r4 >= r5) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025e, code lost:
        r6 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        if (r2 == r7.zza) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r4 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026f, code lost:
        if (r7.zzb == 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (r4 == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r12.add(com.google.android.gms.internal.measurement.zziy.zzb);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(com.google.android.gms.internal.measurement.zziy.zzl(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.zza) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7);
        r4 = r7.zza;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r4 != 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        throw com.google.android.gms.internal.measurement.zzkj.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw com.google.android.gms.internal.measurement.zzkj.zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzv(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzik r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.zzkg r12 = (com.google.android.gms.internal.measurement.zzkg) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.zzkg r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0388;
                case 19: goto L_0x0342;
                case 20: goto L_0x030a;
                case 21: goto L_0x030a;
                case 22: goto L_0x02ef;
                case 23: goto L_0x02b1;
                case 24: goto L_0x0273;
                case 25: goto L_0x021f;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02ef;
                case 30: goto L_0x00dc;
                case 31: goto L_0x0273;
                case 32: goto L_0x02b1;
                case 33: goto L_0x009c;
                case 34: goto L_0x005c;
                case 35: goto L_0x0388;
                case 36: goto L_0x0342;
                case 37: goto L_0x030a;
                case 38: goto L_0x030a;
                case 39: goto L_0x02ef;
                case 40: goto L_0x02b1;
                case 41: goto L_0x0273;
                case 42: goto L_0x021f;
                case 43: goto L_0x02ef;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0273;
                case 46: goto L_0x02b1;
                case 47: goto L_0x009c;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzlr r1 = r15.zzE(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzil.zzc(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x03cd
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.measurement.zzjc.zzc(r4)
            r12.zzg(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03ec
        L_0x007b:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
        L_0x0084:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.measurement.zzjc.zzc(r8)
            r12.zzg(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            com.google.android.gms.internal.measurement.zzka r12 = (com.google.android.gms.internal.measurement.zzka) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjc.zzb(r4)
            r12.zzh(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03ec
        L_0x00bb:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzka r12 = (com.google.android.gms.internal.measurement.zzka) r12
        L_0x00c4:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.measurement.zzjc.zzb(r4)
            r12.zzh(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = com.google.android.gms.internal.measurement.zzil.zzf(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03eb
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.zzil.zzl(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            com.google.android.gms.internal.measurement.zzjz r1 = (com.google.android.gms.internal.measurement.zzjz) r1
            com.google.android.gms.internal.measurement.zzmj r3 = r1.zzc
            com.google.android.gms.internal.measurement.zzmj r4 = com.google.android.gms.internal.measurement.zzmj.zzc()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            com.google.android.gms.internal.measurement.zzkd r4 = r15.zzD(r8)
            com.google.android.gms.internal.measurement.zzmi<?, ?> r5 = r0.zzn
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzlt.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0240
        L_0x010f:
            com.google.android.gms.internal.measurement.zzmj r3 = (com.google.android.gms.internal.measurement.zzmj) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03eb
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            com.google.android.gms.internal.measurement.zziy r4 = com.google.android.gms.internal.measurement.zziy.zzb
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            com.google.android.gms.internal.measurement.zziy r6 = com.google.android.gms.internal.measurement.zziy.zzl(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x0151:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x015c:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            com.google.android.gms.internal.measurement.zzlr r1 = r15.zzE(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.zzil.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            if (r6 != 0) goto L_0x01c9
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01c4
            if (r6 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r1)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkh.zza
            r8.<init>(r3, r4, r6, r9)
        L_0x019e:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x01a2:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01bf
            if (r6 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.zzkh.zza
            r8.<init>(r3, r4, r6, r9)
            goto L_0x019e
        L_0x01bf:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x01c4:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x01c9:
            int r6 = r7.zza
            if (r6 < 0) goto L_0x021a
            if (r6 != 0) goto L_0x01d3
        L_0x01cf:
            r12.add(r1)
            goto L_0x01e6
        L_0x01d3:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zzmx.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkh.zza
            r9.<init>(r3, r4, r6, r10)
        L_0x01e2:
            r12.add(r9)
            r4 = r8
        L_0x01e6:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x01fb
            goto L_0x01cf
        L_0x01fb:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.zzmx.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.zzkh.zza
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01e2
        L_0x020b:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzc()
            throw r1
        L_0x0210:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzc()
            throw r1
        L_0x021a:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzd()
            throw r1
        L_0x021f:
            r1 = 0
            if (r6 != r14) goto L_0x0248
            com.google.android.gms.internal.measurement.zzim r12 = (com.google.android.gms.internal.measurement.zzim) r12
            int r2 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x022b:
            if (r2 >= r4) goto L_0x023e
            int r2 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r2, r7)
            long r5 = r7.zzb
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0239
            r5 = 1
            goto L_0x023a
        L_0x0239:
            r5 = 0
        L_0x023a:
            r12.zze(r5)
            goto L_0x022b
        L_0x023e:
            if (r2 != r4) goto L_0x0243
        L_0x0240:
            r1 = r2
            goto L_0x03ec
        L_0x0243:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x0248:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzim r12 = (com.google.android.gms.internal.measurement.zzim) r12
            int r4 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
        L_0x0256:
            r6 = 1
            goto L_0x0259
        L_0x0258:
            r6 = 0
        L_0x0259:
            r12.zze(r6)
            if (r4 >= r5) goto L_0x0272
            int r6 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x0267
            goto L_0x0272
        L_0x0267:
            int r4 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
            goto L_0x0256
        L_0x0272:
            return r4
        L_0x0273:
            if (r6 != r14) goto L_0x0293
            com.google.android.gms.internal.measurement.zzka r12 = (com.google.android.gms.internal.measurement.zzka) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x027e:
            if (r1 >= r2) goto L_0x028a
            int r4 = com.google.android.gms.internal.measurement.zzil.zzb(r3, r1)
            r12.zzh(r4)
            int r1 = r1 + 4
            goto L_0x027e
        L_0x028a:
            if (r1 != r2) goto L_0x028e
            goto L_0x03ec
        L_0x028e:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x0293:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzka r12 = (com.google.android.gms.internal.measurement.zzka) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzb(r17, r18)
        L_0x029b:
            r12.zzh(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b0
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzb(r3, r4)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02d1
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bc:
            if (r1 >= r2) goto L_0x02c8
            long r4 = com.google.android.gms.internal.measurement.zzil.zzn(r3, r1)
            r12.zzg(r4)
            int r1 = r1 + 8
            goto L_0x02bc
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x03ec
        L_0x02cc:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x02d1:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
            long r8 = com.google.android.gms.internal.measurement.zzil.zzn(r17, r18)
        L_0x02d9:
            r12.zzg(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02ee
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            long r8 = com.google.android.gms.internal.measurement.zzil.zzn(r3, r4)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x02f7
            int r1 = com.google.android.gms.internal.measurement.zzil.zzf(r3, r4, r12, r7)
            goto L_0x03ec
        L_0x02f7:
            if (r6 == 0) goto L_0x02fb
            goto L_0x03eb
        L_0x02fb:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.zzil.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030a:
            if (r6 != r14) goto L_0x032a
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0315:
            if (r1 >= r2) goto L_0x0321
            int r1 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzg(r4)
            goto L_0x0315
        L_0x0321:
            if (r1 != r2) goto L_0x0325
            goto L_0x03ec
        L_0x0325:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x032a:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzkv r12 = (com.google.android.gms.internal.measurement.zzkv) r12
        L_0x032e:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzg(r8)
            if (r1 >= r5) goto L_0x0341
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032e
        L_0x0341:
            return r1
        L_0x0342:
            if (r6 != r14) goto L_0x0366
            com.google.android.gms.internal.measurement.zzjs r12 = (com.google.android.gms.internal.measurement.zzjs) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            int r4 = com.google.android.gms.internal.measurement.zzil.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x034d
        L_0x035d:
            if (r1 != r2) goto L_0x0361
            goto L_0x03ec
        L_0x0361:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x0366:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzjs r12 = (com.google.android.gms.internal.measurement.zzjs) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzb(r17, r18)
        L_0x036e:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0387
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r1 = com.google.android.gms.internal.measurement.zzil.zzb(r3, r4)
            goto L_0x036e
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ab
            com.google.android.gms.internal.measurement.zzji r12 = (com.google.android.gms.internal.measurement.zzji) r12
            int r1 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            long r4 = com.google.android.gms.internal.measurement.zzil.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a6
            goto L_0x03ec
        L_0x03a6:
            com.google.android.gms.internal.measurement.zzkj r1 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r1
        L_0x03ab:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.measurement.zzji r12 = (com.google.android.gms.internal.measurement.zzji) r12
            long r8 = com.google.android.gms.internal.measurement.zzil.zzn(r17, r18)
        L_0x03b3:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03cc
            int r4 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03c7
            goto L_0x03cc
        L_0x03c7:
            long r8 = com.google.android.gms.internal.measurement.zzil.zzn(r3, r4)
            goto L_0x03b3
        L_0x03cc:
            return r1
        L_0x03cd:
            if (r4 >= r5) goto L_0x03ea
            int r8 = com.google.android.gms.internal.measurement.zzil.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x03d8
            goto L_0x03ea
        L_0x03d8:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.zzil.zzc(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzik):int");
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int zza(T t10) {
        return this.zzi ? zzq(t10) : zzp(t10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = zzr(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = zzC(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = com.google.android.gms.internal.measurement.zzkh.zza(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = com.google.android.gms.internal.measurement.zzkh.zzc(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0128
            int r3 = r8.zzB(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzA(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0115;
                case 1: goto L_0x010a;
                case 2: goto L_0x0103;
                case 3: goto L_0x0103;
                case 4: goto L_0x00fc;
                case 5: goto L_0x0103;
                case 6: goto L_0x00fc;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00e4;
                case 9: goto L_0x00d6;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00fc;
                case 12: goto L_0x00fc;
                case 13: goto L_0x00fc;
                case 14: goto L_0x0103;
                case 15: goto L_0x00fc;
                case 16: goto L_0x0103;
                case 17: goto L_0x00c4;
                case 18: goto L_0x00cb;
                case 19: goto L_0x00cb;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00cb;
                case 22: goto L_0x00cb;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00cb;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00cb;
                case 28: goto L_0x00cb;
                case 29: goto L_0x00cb;
                case 30: goto L_0x00cb;
                case 31: goto L_0x00cb;
                case 32: goto L_0x00cb;
                case 33: goto L_0x00cb;
                case 34: goto L_0x00cb;
                case 35: goto L_0x00cb;
                case 36: goto L_0x00cb;
                case 37: goto L_0x00cb;
                case 38: goto L_0x00cb;
                case 39: goto L_0x00cb;
                case 40: goto L_0x00cb;
                case 41: goto L_0x00cb;
                case 42: goto L_0x00cb;
                case 43: goto L_0x00cb;
                case 44: goto L_0x00cb;
                case 45: goto L_0x00cb;
                case 46: goto L_0x00cb;
                case 47: goto L_0x00cb;
                case 48: goto L_0x00cb;
                case 49: goto L_0x00cb;
                case 50: goto L_0x00cb;
                case 51: goto L_0x00b7;
                case 52: goto L_0x00aa;
                case 53: goto L_0x009c;
                case 54: goto L_0x0095;
                case 55: goto L_0x0087;
                case 56: goto L_0x0080;
                case 57: goto L_0x0079;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0124
        L_0x001f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x004b:
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            boolean r3 = zzQ(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x008d:
            int r2 = r2 * 53
            int r3 = zzr(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = zzC(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            float r3 = zzo(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.zzP(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            double r3 = zzn(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0124
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.zzms.zzw(r9, r5)
        L_0x00f7:
            int r3 = com.google.android.gms.internal.measurement.zzkh.zza(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.zzms.zzb(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.zzms.zza(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = com.google.android.gms.internal.measurement.zzkh.zzc(r3)
        L_0x0123:
            int r2 = r2 + r3
        L_0x0124:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0128:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x013a
            return r2
        L_0x013a:
            com.google.android.gms.internal.measurement.zzjm<?> r0 = r8.zzo
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzb(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0335, code lost:
        if (r0 != r3) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0350, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x037c, code lost:
        if (r0 != r14) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x039e, code lost:
        if (r0 != r14) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0106, code lost:
        r10.putInt(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
        r1 = r9.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        r10.putObject(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c8, code lost:
        r1 = r6 | r23;
        r6 = r31;
        r2 = r5;
        r3 = r7;
        r5 = r1;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f1, code lost:
        r2 = r1;
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0265, code lost:
        r5 = r6 | r23;
        r6 = r31;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026a, code lost:
        r1 = r11;
        r2 = r13;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0270, code lost:
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028e, code lost:
        r15 = r33;
        r21 = r6;
        r19 = r7;
        r27 = r10;
        r7 = r11;
        r6 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzik r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x040f
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.measurement.zzil.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r2) goto L_0x003a
            int r3 = r3 / r7
            int r2 = r15.zzx(r0, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.zzw(r0)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r20 = r0
            r2 = r1
            r7 = r4
            r21 = r5
            r27 = r10
            r15 = r11
            r19 = 0
            r26 = -1
            goto L_0x03a1
        L_0x0050:
            int[] r3 = r15.zzc
            int r20 = r2 + 1
            r3 = r3[r20]
            int r7 = zzA(r3)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r7 > r0) goto L_0x029d
            int[] r0 = r15.zzc
            int r23 = r2 + 2
            r0 = r0[r23]
            int r23 = r0 >>> 20
            r11 = 1
            int r23 = r11 << r23
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0088
            if (r6 == r11) goto L_0x0081
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0081:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r11 = r0
            goto L_0x0089
        L_0x0088:
            r11 = r6
        L_0x0089:
            r6 = r5
            r0 = 5
            r12 = r30
            switch(r7) {
                case 0: goto L_0x024b;
                case 1: goto L_0x0231;
                case 2: goto L_0x020d;
                case 3: goto L_0x020d;
                case 4: goto L_0x01f6;
                case 5: goto L_0x01d2;
                case 6: goto L_0x01b4;
                case 7: goto L_0x0196;
                case 8: goto L_0x017a;
                case 9: goto L_0x0154;
                case 10: goto L_0x013d;
                case 11: goto L_0x01f6;
                case 12: goto L_0x010b;
                case 13: goto L_0x01b4;
                case 14: goto L_0x01d2;
                case 15: goto L_0x00f1;
                case 16: goto L_0x00bb;
                default: goto L_0x0090;
            }
        L_0x0090:
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r0 = 3
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x0270
            com.google.android.gms.internal.measurement.zzlr r0 = r15.zzE(r7)
            int r1 = r13 << 3
            r5 = r1 | 4
            r1 = r30
            r20 = r13
            r12 = r3
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0273
            java.lang.Object r1 = r9.zzc
            goto L_0x027d
        L_0x00bb:
            if (r8 != 0) goto L_0x00e7
            int r7 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r24 = com.google.android.gms.internal.measurement.zzjc.zzc(r0)
            r8 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r19 = -1
            r2 = r3
            r17 = r7
            r31 = r11
            r11 = r21
            r7 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r3 = r7
            r2 = r8
            r1 = r11
            r0 = r17
            goto L_0x02ea
        L_0x00e7:
            r7 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            goto L_0x028e
        L_0x00f1:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.measurement.zzjc.zzb(r1)
        L_0x0106:
            r10.putInt(r14, r3, r1)
            goto L_0x01c8
        L_0x010b:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.measurement.zzkd r2 = r15.zzD(r7)
            if (r2 == 0) goto L_0x0106
            boolean r2 = r2.zza(r1)
            if (r2 == 0) goto L_0x0129
            goto L_0x0106
        L_0x0129:
            com.google.android.gms.internal.measurement.zzmj r2 = zzd(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r2 = r5
            r5 = r6
            r3 = r7
            r1 = r11
            r6 = r31
            goto L_0x02ea
        L_0x013d:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.measurement.zzil.zza(r12, r1, r9)
        L_0x014d:
            java.lang.Object r1 = r9.zzc
        L_0x014f:
            r10.putObject(r14, r3, r1)
            goto L_0x01c8
        L_0x0154:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x01f1
            com.google.android.gms.internal.measurement.zzlr r0 = r15.zzE(r7)
            int r0 = com.google.android.gms.internal.measurement.zzil.zzd(r0, r12, r1, r13, r9)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x016f
            java.lang.Object r1 = r9.zzc
            goto L_0x014f
        L_0x016f:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkh.zzg(r1, r2)
            goto L_0x014f
        L_0x017a:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x01f1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0191
            int r0 = com.google.android.gms.internal.measurement.zzil.zzg(r12, r1, r9)
            goto L_0x014d
        L_0x0191:
            int r0 = com.google.android.gms.internal.measurement.zzil.zzh(r12, r1, r9)
            goto L_0x014d
        L_0x0196:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r1, r9)
            long r1 = r9.zzb
            r20 = 0
            int r8 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r8 == 0) goto L_0x01af
            r1 = 1
            goto L_0x01b0
        L_0x01af:
            r1 = 0
        L_0x01b0:
            com.google.android.gms.internal.measurement.zzms.zzm(r14, r3, r1)
            goto L_0x01c8
        L_0x01b4:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != r0) goto L_0x01f1
            int r0 = com.google.android.gms.internal.measurement.zzil.zzb(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
        L_0x01c8:
            r1 = r6 | r23
            r6 = r31
            r2 = r5
            r3 = r7
            r5 = r1
            r1 = r11
            goto L_0x02ea
        L_0x01d2:
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 1
            r19 = -1
            if (r8 != r0) goto L_0x01f1
            long r20 = com.google.android.gms.internal.measurement.zzil.zzn(r12, r1)
            r0 = r10
            r8 = r1
            r1 = r29
            r2 = r3
            r13 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0265
        L_0x01f1:
            r2 = r1
            r20 = r5
            goto L_0x028e
        L_0x01f6:
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != 0) goto L_0x0270
            int r0 = com.google.android.gms.internal.measurement.zzil.zzj(r12, r2, r9)
            int r1 = r9.zza
            r10.putInt(r14, r3, r1)
            goto L_0x0265
        L_0x020d:
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != 0) goto L_0x0270
            int r8 = com.google.android.gms.internal.measurement.zzil.zzm(r12, r2, r9)
            long r1 = r9.zzb
            r0 = r10
            r20 = r1
            r1 = r29
            r2 = r3
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r3 = r7
            r0 = r8
            goto L_0x026a
        L_0x0231:
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x0270
            int r0 = com.google.android.gms.internal.measurement.zzil.zzb(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.zzms.zzp(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x0265
        L_0x024b:
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r0 = 1
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x0270
            long r0 = com.google.android.gms.internal.measurement.zzil.zzn(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.zzms.zzo(r14, r3, r0)
            int r0 = r2 + 8
        L_0x0265:
            r5 = r6 | r23
            r6 = r31
            r3 = r7
        L_0x026a:
            r1 = r11
            r2 = r13
            r13 = r32
            goto L_0x02ea
        L_0x0270:
            r20 = r13
            goto L_0x028e
        L_0x0273:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzkh.zzg(r1, r2)
        L_0x027d:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r23
            r12 = r30
            r6 = r31
            r13 = r32
            r3 = r7
            r1 = r11
            r2 = r20
            goto L_0x02ea
        L_0x028e:
            r15 = r33
            r21 = r6
            r19 = r7
            r27 = r10
            r7 = r11
            r26 = -1
            r6 = r31
            goto L_0x03a1
        L_0x029d:
            r12 = r3
            r4 = r7
            r11 = r21
            r19 = -1
            r7 = r2
            r2 = r1
            r0 = 27
            if (r4 != r0) goto L_0x02ff
            r0 = 2
            if (r8 != r0) goto L_0x02ee
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.measurement.zzkg r0 = (com.google.android.gms.internal.measurement.zzkg) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02c9
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02c1
            r1 = 10
            goto L_0x02c2
        L_0x02c1:
            int r1 = r1 + r1
        L_0x02c2:
            com.google.android.gms.internal.measurement.zzkg r0 = r0.zzd(r1)
            r10.putObject(r14, r12, r0)
        L_0x02c9:
            r8 = r0
            com.google.android.gms.internal.measurement.zzlr r0 = r15.zzE(r7)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r21 = r5
            r5 = r8
            r23 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r2 = r20
            r5 = r21
            r6 = r23
        L_0x02ea:
            r11 = r33
            goto L_0x0019
        L_0x02ee:
            r21 = r5
            r23 = r6
            r15 = r33
            r14 = r2
            r19 = r7
            r27 = r10
            r18 = r11
            r26 = -1
            goto L_0x037f
        L_0x02ff:
            r3 = r2
            r21 = r5
            r23 = r6
            r0 = 49
            if (r4 > r0) goto L_0x0352
            r5 = r22
            long r5 = (long) r5
            r0 = r28
            r1 = r29
            r2 = r30
            r31 = r3
            r22 = r4
            r4 = r32
            r24 = r5
            r5 = r11
            r6 = r20
            r19 = r7
            r26 = -1
            r7 = r8
            r8 = r19
            r27 = r10
            r9 = r24
            r15 = r33
            r18 = r11
            r11 = r22
            r14 = r34
            int r0 = r0.zzv(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r31
            if (r0 == r14) goto L_0x0350
        L_0x0337:
            r14 = r29
            r12 = r30
            r13 = r32
            r9 = r34
            r11 = r15
            r1 = r18
            r3 = r19
            r2 = r20
            r5 = r21
            r6 = r23
            r10 = r27
            r15 = r28
            goto L_0x0019
        L_0x0350:
            r2 = r0
            goto L_0x0380
        L_0x0352:
            r15 = r33
            r14 = r3
            r19 = r7
            r27 = r10
            r18 = r11
            r5 = r22
            r26 = -1
            r22 = r4
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x0385
            r0 = 2
            if (r8 != r0) goto L_0x037f
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r14
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            int r0 = r0.zzs(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x0350
            goto L_0x0337
        L_0x037f:
            r2 = r14
        L_0x0380:
            r7 = r18
            r6 = r23
            goto L_0x03a1
        L_0x0385:
            r0 = r28
            r1 = r29
            r2 = r30
            r10 = r5
            r3 = r14
            r4 = r32
            r5 = r18
            r6 = r20
            r7 = r8
            r8 = r10
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x0350
            goto L_0x0337
        L_0x03a1:
            if (r7 != r15) goto L_0x03b0
            if (r15 == 0) goto L_0x03b0
            r8 = r28
            r12 = r29
            r0 = r2
            r1 = r7
            r9 = r15
            r5 = r21
            goto L_0x0418
        L_0x03b0:
            r8 = r28
            r9 = r15
            boolean r0 = r8.zzh
            if (r0 == 0) goto L_0x03e8
            r10 = r34
            com.google.android.gms.internal.measurement.zzjl r0 = r10.zzd
            com.google.android.gms.internal.measurement.zzjl r1 = com.google.android.gms.internal.measurement.zzjl.zza()
            if (r0 == r1) goto L_0x03e5
            com.google.android.gms.internal.measurement.zzlg r0 = r8.zzg
            com.google.android.gms.internal.measurement.zzjl r1 = r10.zzd
            r11 = r20
            com.google.android.gms.internal.measurement.zzjx r0 = r1.zzc(r0, r11)
            if (r0 != 0) goto L_0x03df
            com.google.android.gms.internal.measurement.zzmj r4 = zzd(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03fd
        L_0x03df:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.measurement.zzjw r0 = (com.google.android.gms.internal.measurement.zzjw) r0
            throw r17
        L_0x03e5:
            r12 = r29
            goto L_0x03ec
        L_0x03e8:
            r12 = r29
            r10 = r34
        L_0x03ec:
            r11 = r20
            com.google.android.gms.internal.measurement.zzmj r4 = zzd(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.zzil.zzi(r0, r1, r2, r3, r4, r5)
        L_0x03fd:
            r13 = r32
            r1 = r7
            r15 = r8
            r2 = r11
            r14 = r12
            r3 = r19
            r5 = r21
            r12 = r30
            r11 = r9
            r9 = r10
            r10 = r27
            goto L_0x0019
        L_0x040f:
            r21 = r5
            r23 = r6
            r27 = r10
            r9 = r11
            r12 = r14
            r8 = r15
        L_0x0418:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0423
            long r3 = (long) r6
            r6 = r27
            r6.putInt(r12, r3, r5)
        L_0x0423:
            int r3 = r8.zzk
        L_0x0425:
            int r4 = r8.zzl
            if (r3 >= r4) goto L_0x0450
            int[] r4 = r8.zzj
            r4 = r4[r3]
            int[] r5 = r8.zzc
            r5 = r5[r4]
            int r5 = r8.zzB(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.zzms.zzf(r12, r5)
            if (r5 != 0) goto L_0x043e
            goto L_0x0444
        L_0x043e:
            com.google.android.gms.internal.measurement.zzkd r6 = r8.zzD(r4)
            if (r6 != 0) goto L_0x0447
        L_0x0444:
            int r3 = r3 + 1
            goto L_0x0425
        L_0x0447:
            com.google.android.gms.internal.measurement.zzla r5 = (com.google.android.gms.internal.measurement.zzla) r5
            java.lang.Object r0 = r8.zzF(r4)
            com.google.android.gms.internal.measurement.zzkz r0 = (com.google.android.gms.internal.measurement.zzkz) r0
            throw r17
        L_0x0450:
            r2 = r32
            if (r9 != 0) goto L_0x045c
            if (r0 != r2) goto L_0x0457
            goto L_0x0460
        L_0x0457:
            com.google.android.gms.internal.measurement.zzkj r0 = com.google.android.gms.internal.measurement.zzkj.zze()
            throw r0
        L_0x045c:
            if (r0 > r2) goto L_0x0461
            if (r1 != r9) goto L_0x0461
        L_0x0460:
            return r0
        L_0x0461:
            com.google.android.gms.internal.measurement.zzkj r0 = com.google.android.gms.internal.measurement.zzkj.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    public final T zze() {
        return ((zzjz) this.zzg).zzl(4, (Object) null, (Object) null);
    }

    public final void zzf(T t10) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long zzB = (long) (zzB(this.zzj[i11]) & 1048575);
            Object zzf2 = zzms.zzf(t10, zzB);
            if (zzf2 != null) {
                ((zzla) zzf2).zzc();
                zzms.zzs(t10, zzB, zzf2);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(t10, (long) this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(t10);
        if (this.zzh) {
            this.zzo.zzb(t10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.google.android.gms.internal.measurement.zzms.zzs(r7, r2, com.google.android.gms.internal.measurement.zzms.zzf(r8, r2));
        zzK(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        com.google.android.gms.internal.measurement.zzms.zzs(r7, r2, com.google.android.gms.internal.measurement.zzms.zzf(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        com.google.android.gms.internal.measurement.zzms.zzq(r7, r2, com.google.android.gms.internal.measurement.zzms.zzc(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        com.google.android.gms.internal.measurement.zzms.zzr(r7, r2, com.google.android.gms.internal.measurement.zzms.zzd(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        zzJ(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(T r7, T r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.zzc
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.zzB(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.zzc
            r4 = r4[r0]
            int r1 = zzA(r1)
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.zzP(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.zzI(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.zzP(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzms.zzf(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzs(r7, r2, r1)
            r6.zzK(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.measurement.zzlb r1 = r6.zzq
            com.google.android.gms.internal.measurement.zzlt.zzI(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.measurement.zzku r1 = r6.zzm
            r1.zzb(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.zzH(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.zzms.zzf(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzs(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.measurement.zzms.zzw(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzm(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.measurement.zzms.zzc(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzq(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.measurement.zzms.zzd(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzr(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.measurement.zzms.zzb(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzp(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.zzM(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.measurement.zzms.zza(r8, r2)
            com.google.android.gms.internal.measurement.zzms.zzo(r7, r2, r4)
        L_0x00eb:
            r6.zzJ(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r6.zzn
            com.google.android.gms.internal.measurement.zzlt.zzF(r0, r7, r8)
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.measurement.zzjm<?> r0 = r6.zzo
            com.google.android.gms.internal.measurement.zzlt.zzE(r0, r7, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzg(java.lang.Object, java.lang.Object):void");
    }

    public final void zzh(T t10, byte[] bArr, int i10, int i11, zzik zzik) {
        if (this.zzi) {
            zzu(t10, bArr, i10, i11, zzik);
        } else {
            zzc(t10, bArr, i10, i11, 0, zzik);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzi(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.zzB(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = zzA(r3)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.zzy(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r3)
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.measurement.zzlt.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.google.android.gms.internal.measurement.zzms.zzw(r9, r5)
            boolean r4 = com.google.android.gms.internal.measurement.zzms.zzw(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.measurement.zzms.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.google.android.gms.internal.measurement.zzms.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.measurement.zzms.zzb(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.zzL(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.google.android.gms.internal.measurement.zzms.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.measurement.zzms.zza(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r8.zzn
            java.lang.Object r0 = r0.zzc(r9)
            com.google.android.gms.internal.measurement.zzmi<?, ?> r2 = r8.zzn
            java.lang.Object r2 = r2.zzc(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            com.google.android.gms.internal.measurement.zzjm<?> r0 = r8.zzo
            r0.zza(r9)
            com.google.android.gms.internal.measurement.zzjm<?> r9 = r8.zzo
            r9.zza(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzi(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean zzj(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int i15 = this.zzj[i14];
            int i16 = this.zzc[i15];
            int zzB = zzB(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & zzB) != 0 && !zzN(t10, i15, i11, i10, i19)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzP(t11, i16, i15) && !zzO(t11, zzB, zzE(i15))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzla) zzms.zzf(t11, (long) (zzB & 1048575))).isEmpty()) {
                            zzkz zzkz = (zzkz) zzF(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzms.zzf(t11, (long) (zzB & 1048575));
                if (!list.isEmpty()) {
                    zzlr zzE = zzE(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzE.zzj(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzN(t10, i15, i11, i10, i19) && !zzO(t11, zzB, zzE(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(t11);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x036d, code lost:
        r11.zzA(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x037e, code lost:
        r11.zzy(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038f, code lost:
        r11.zzw(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03a0, code lost:
        r11.zzi(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03b1, code lost:
        r11.zzH(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03bc, code lost:
        r11.zzd(r4, (com.google.android.gms.internal.measurement.zziy) com.google.android.gms.internal.measurement.zzms.zzf(r10, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03cf, code lost:
        r11.zzv(r4, com.google.android.gms.internal.measurement.zzms.zzf(r10, (long) (r3 & 1048575)), zzE(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e4, code lost:
        zzT(r4, com.google.android.gms.internal.measurement.zzms.zzf(r10, (long) (r3 & 1048575)), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03fb, code lost:
        r11.zzb(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x040c, code lost:
        r11.zzk(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x041c, code lost:
        r11.zzm(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x042c, code lost:
        r11.zzr(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x043c, code lost:
        r11.zzJ(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x044c, code lost:
        r11.zzt(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x045c, code lost:
        r11.zzo(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x046c, code lost:
        r11.zzf(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0341, code lost:
        r11.zzq(r4, com.google.android.gms.internal.measurement.zzms.zzf(r10, (long) (r3 & 1048575)), zzE(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035c, code lost:
        r11.zzC(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzm(T r10, com.google.android.gms.internal.measurement.zzjh r11) {
        /*
            r9 = this;
            boolean r0 = r9.zzi
            if (r0 == 0) goto L_0x0484
            boolean r0 = r9.zzh
            if (r0 != 0) goto L_0x047d
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0473
            int r3 = r9.zzB(r2)
            int[] r4 = r9.zzc
            r4 = r4[r2]
            int r5 = zzA(r3)
            r6 = 1
            r7 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0460;
                case 1: goto L_0x0450;
                case 2: goto L_0x0440;
                case 3: goto L_0x0430;
                case 4: goto L_0x0420;
                case 5: goto L_0x0410;
                case 6: goto L_0x0400;
                case 7: goto L_0x03ef;
                case 8: goto L_0x03de;
                case 9: goto L_0x03c9;
                case 10: goto L_0x03b6;
                case 11: goto L_0x03a5;
                case 12: goto L_0x0394;
                case 13: goto L_0x0383;
                case 14: goto L_0x0372;
                case 15: goto L_0x0361;
                case 16: goto L_0x0350;
                case 17: goto L_0x033b;
                case 18: goto L_0x032a;
                case 19: goto L_0x0319;
                case 20: goto L_0x0308;
                case 21: goto L_0x02f7;
                case 22: goto L_0x02e6;
                case 23: goto L_0x02d5;
                case 24: goto L_0x02c4;
                case 25: goto L_0x02b3;
                case 26: goto L_0x02a2;
                case 27: goto L_0x028d;
                case 28: goto L_0x027c;
                case 29: goto L_0x026b;
                case 30: goto L_0x025a;
                case 31: goto L_0x0249;
                case 32: goto L_0x0238;
                case 33: goto L_0x0227;
                case 34: goto L_0x0216;
                case 35: goto L_0x0205;
                case 36: goto L_0x01f4;
                case 37: goto L_0x01e3;
                case 38: goto L_0x01d2;
                case 39: goto L_0x01c1;
                case 40: goto L_0x01b0;
                case 41: goto L_0x019f;
                case 42: goto L_0x018e;
                case 43: goto L_0x017d;
                case 44: goto L_0x016c;
                case 45: goto L_0x015b;
                case 46: goto L_0x014a;
                case 47: goto L_0x0139;
                case 48: goto L_0x0128;
                case 49: goto L_0x0113;
                case 50: goto L_0x0108;
                case 51: goto L_0x00fa;
                case 52: goto L_0x00ec;
                case 53: goto L_0x00de;
                case 54: goto L_0x00d0;
                case 55: goto L_0x00c2;
                case 56: goto L_0x00b4;
                case 57: goto L_0x00a6;
                case 58: goto L_0x0098;
                case 59: goto L_0x0090;
                case 60: goto L_0x0088;
                case 61: goto L_0x0080;
                case 62: goto L_0x0072;
                case 63: goto L_0x0064;
                case 64: goto L_0x0056;
                case 65: goto L_0x0048;
                case 66: goto L_0x003a;
                case 67: goto L_0x002c;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x046f
        L_0x0024:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x0341
        L_0x002c:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzC(r10, r5)
            goto L_0x035c
        L_0x003a:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x036d
        L_0x0048:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzC(r10, r5)
            goto L_0x037e
        L_0x0056:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x038f
        L_0x0064:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x03a0
        L_0x0072:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x03b1
        L_0x0080:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03bc
        L_0x0088:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03cf
        L_0x0090:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03e4
        L_0x0098:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = zzQ(r10, r5)
            goto L_0x03fb
        L_0x00a6:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x040c
        L_0x00b4:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzC(r10, r5)
            goto L_0x041c
        L_0x00c2:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzr(r10, r5)
            goto L_0x042c
        L_0x00d0:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzC(r10, r5)
            goto L_0x043c
        L_0x00de:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzC(r10, r5)
            goto L_0x044c
        L_0x00ec:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = zzo(r10, r5)
            goto L_0x045c
        L_0x00fa:
            boolean r5 = r9.zzP(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = zzn(r10, r5)
            goto L_0x046c
        L_0x0108:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            r9.zzS(r11, r4, r3, r2)
            goto L_0x046f
        L_0x0113:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlr r5 = r9.zzE(r2)
            com.google.android.gms.internal.measurement.zzlt.zzQ(r4, r3, r11, r5)
            goto L_0x046f
        L_0x0128:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzX(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0139:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzW(r4, r3, r11, r6)
            goto L_0x046f
        L_0x014a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzV(r4, r3, r11, r6)
            goto L_0x046f
        L_0x015b:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzU(r4, r3, r11, r6)
            goto L_0x046f
        L_0x016c:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzM(r4, r3, r11, r6)
            goto L_0x046f
        L_0x017d:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzZ(r4, r3, r11, r6)
            goto L_0x046f
        L_0x018e:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzJ(r4, r3, r11, r6)
            goto L_0x046f
        L_0x019f:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzN(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01b0:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzO(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01c1:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzR(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01d2:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzaa(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01e3:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzS(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01f4:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzP(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0205:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzL(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0216:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzX(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0227:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzW(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0238:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzV(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0249:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzU(r4, r3, r11, r1)
            goto L_0x046f
        L_0x025a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzM(r4, r3, r11, r1)
            goto L_0x046f
        L_0x026b:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzZ(r4, r3, r11, r1)
            goto L_0x046f
        L_0x027c:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzK(r4, r3, r11)
            goto L_0x046f
        L_0x028d:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlr r5 = r9.zzE(r2)
            com.google.android.gms.internal.measurement.zzlt.zzT(r4, r3, r11, r5)
            goto L_0x046f
        L_0x02a2:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzY(r4, r3, r11)
            goto L_0x046f
        L_0x02b3:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzJ(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02c4:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzN(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02d5:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzO(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02e6:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzR(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02f7:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzaa(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0308:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzS(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0319:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzP(r4, r3, r11, r1)
            goto L_0x046f
        L_0x032a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.zzlt.zzL(r4, r3, r11, r1)
            goto L_0x046f
        L_0x033b:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x0341:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            com.google.android.gms.internal.measurement.zzlr r5 = r9.zzE(r2)
            r11.zzq(r4, r3, r5)
            goto L_0x046f
        L_0x0350:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
        L_0x035c:
            r11.zzC(r4, r5)
            goto L_0x046f
        L_0x0361:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x036d:
            r11.zzA(r4, r3)
            goto L_0x046f
        L_0x0372:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
        L_0x037e:
            r11.zzy(r4, r5)
            goto L_0x046f
        L_0x0383:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x038f:
            r11.zzw(r4, r3)
            goto L_0x046f
        L_0x0394:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x03a0:
            r11.zzi(r4, r3)
            goto L_0x046f
        L_0x03a5:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x03b1:
            r11.zzH(r4, r3)
            goto L_0x046f
        L_0x03b6:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03bc:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            com.google.android.gms.internal.measurement.zziy r3 = (com.google.android.gms.internal.measurement.zziy) r3
            r11.zzd(r4, r3)
            goto L_0x046f
        L_0x03c9:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03cf:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            com.google.android.gms.internal.measurement.zzlr r5 = r9.zzE(r2)
            r11.zzv(r4, r3, r5)
            goto L_0x046f
        L_0x03de:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03e4:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzms.zzf(r10, r5)
            zzT(r4, r3, r11)
            goto L_0x046f
        L_0x03ef:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = com.google.android.gms.internal.measurement.zzms.zzw(r10, r5)
        L_0x03fb:
            r11.zzb(r4, r3)
            goto L_0x046f
        L_0x0400:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x040c:
            r11.zzk(r4, r3)
            goto L_0x046f
        L_0x0410:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
        L_0x041c:
            r11.zzm(r4, r5)
            goto L_0x046f
        L_0x0420:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.zzms.zzc(r10, r5)
        L_0x042c:
            r11.zzr(r4, r3)
            goto L_0x046f
        L_0x0430:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
        L_0x043c:
            r11.zzJ(r4, r5)
            goto L_0x046f
        L_0x0440:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.measurement.zzms.zzd(r10, r5)
        L_0x044c:
            r11.zzt(r4, r5)
            goto L_0x046f
        L_0x0450:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = com.google.android.gms.internal.measurement.zzms.zzb(r10, r5)
        L_0x045c:
            r11.zzo(r4, r3)
            goto L_0x046f
        L_0x0460:
            boolean r5 = r9.zzM(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = com.google.android.gms.internal.measurement.zzms.zza(r10, r5)
        L_0x046c:
            r11.zzf(r4, r5)
        L_0x046f:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0473:
            com.google.android.gms.internal.measurement.zzmi<?, ?> r0 = r9.zzn
            java.lang.Object r10 = r0.zzc(r10)
            r0.zzi(r10, r11)
            return
        L_0x047d:
            com.google.android.gms.internal.measurement.zzjm<?> r11 = r9.zzo
            r11.zza(r10)
            r10 = 0
            throw r10
        L_0x0484:
            r9.zzR(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlj.zzm(java.lang.Object, com.google.android.gms.internal.measurement.zzjh):void");
    }
}
