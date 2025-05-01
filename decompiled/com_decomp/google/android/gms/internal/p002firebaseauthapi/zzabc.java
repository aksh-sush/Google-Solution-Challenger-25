package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabc  reason: invalid package */
final class zzabc<T> implements zzabl<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzacj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaaz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzaan zzn;
    private final zzabz<?, ?> zzo;
    private final zzzk<?> zzp;
    private final zzabe zzq;
    private final zzaau zzr;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaaz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.gms.internal.firebase-auth-api.zzabe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.firebase-auth-api.zzaau} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.firebase-auth-api.zzzk<?>, com.google.android.gms.internal.firebase-auth-api.zzzk] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.firebase-auth-api.zzaan] */
    /* JADX WARNING: type inference failed for: r3v13, types: [com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzabc(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.p002firebaseauthapi.zzaaz r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.p002firebaseauthapi.zzabe r17, com.google.android.gms.internal.p002firebaseauthapi.zzaan r18, com.google.android.gms.internal.p002firebaseauthapi.zzabz<?, ?> r19, com.google.android.gms.internal.p002firebaseauthapi.zzzk<?> r20, com.google.android.gms.internal.p002firebaseauthapi.zzaau r21) {
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
            boolean r3 = r1 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzzw
            r0.zzi = r3
            r3 = r11
            r0.zzj = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.zzh(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.zzh = r3
            r3 = r13
            r0.zzk = r3
            r3 = r14
            r0.zzl = r3
            r3 = r15
            r0.zzm = r3
            r3 = r16
            r0.zzq = r3
            r3 = r17
            r0.zzn = r3
            r3 = r18
            r0.zzo = r3
            r0.zzp = r2
            r0.zzg = r1
            r1 = r20
            r0.zzr = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.firebase-auth-api.zzaaz, boolean, boolean, int[], int, int, com.google.android.gms.internal.firebase-auth-api.zzabe, com.google.android.gms.internal.firebase-auth-api.zzaan, com.google.android.gms.internal.firebase-auth-api.zzabz, com.google.android.gms.internal.firebase-auth-api.zzzk, com.google.android.gms.internal.firebase-auth-api.zzaau, byte[]):void");
    }

    private final int zzA(int i10, int i11) {
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

    private static int zzB(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzC(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> long zzD(T t10, long j10) {
        return ((Long) zzacj.zzf(t10, j10)).longValue();
    }

    private final zzaaa zzE(int i10) {
        int i11 = i10 / 3;
        return (zzaaa) this.zzd[i11 + i11 + 1];
    }

    private final zzabl zzF(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzabl zzabl = (zzabl) this.zzd[i12];
        if (zzabl != null) {
            return zzabl;
        }
        zzabl zzb2 = zzabh.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final <UT, UB> UB zzG(Object obj, int i10, UB ub, zzabz<UT, UB> zzabz) {
        int i11 = this.zzc[i10];
        Object zzf2 = zzacj.zzf(obj, (long) (zzC(i10) & 1048575));
        if (zzf2 == null || zzE(i10) == null) {
            return ub;
        }
        zzaat zzaat = (zzaat) zzf2;
        zzaas zzaas = (zzaas) zzH(i10);
        throw null;
    }

    private final Object zzH(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzI(Class<?> cls, String str) {
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

    private final void zzJ(T t10, T t11, int i10) {
        long zzC = (long) (zzC(i10) & 1048575);
        if (zzQ(t11, i10)) {
            Object zzf2 = zzacj.zzf(t10, zzC);
            Object zzf3 = zzacj.zzf(t11, zzC);
            if (zzf2 != null && zzf3 != null) {
                zzf3 = zzaac.zzg(zzf2, zzf3);
            } else if (zzf3 == null) {
                return;
            }
            zzacj.zzs(t10, zzC, zzf3);
            zzM(t10, i10);
        }
    }

    private final void zzK(T t10, T t11, int i10) {
        int zzC = zzC(i10);
        int i11 = this.zzc[i10];
        long j10 = (long) (zzC & 1048575);
        if (zzT(t11, i11, i10)) {
            Object zzf2 = zzT(t10, i11, i10) ? zzacj.zzf(t10, j10) : null;
            Object zzf3 = zzacj.zzf(t11, j10);
            if (zzf2 != null && zzf3 != null) {
                zzf3 = zzaac.zzg(zzf2, zzf3);
            } else if (zzf3 == null) {
                return;
            }
            zzacj.zzs(t10, j10, zzf3);
            zzN(t10, i11, i10);
        }
    }

    private final void zzL(Object obj, int i10, zzabk zzabk) {
        long j10;
        Object zzp2;
        if (zzP(i10)) {
            j10 = (long) (i10 & 1048575);
            zzp2 = zzabk.zzu();
        } else {
            int i11 = i10 & 1048575;
            if (this.zzi) {
                j10 = (long) i11;
                zzp2 = zzabk.zzt();
            } else {
                j10 = (long) i11;
                zzp2 = zzabk.zzp();
            }
        }
        zzacj.zzs(obj, j10, zzp2);
    }

    private final void zzM(T t10, int i10) {
        int zzz = zzz(i10);
        long j10 = (long) (1048575 & zzz);
        if (j10 != 1048575) {
            zzacj.zzq(t10, j10, (1 << (zzz >>> 20)) | zzacj.zzc(t10, j10));
        }
    }

    private final void zzN(T t10, int i10, int i11) {
        zzacj.zzq(t10, (long) (zzz(i11) & 1048575), i10);
    }

    private final boolean zzO(T t10, T t11, int i10) {
        return zzQ(t10, i10) == zzQ(t11, i10);
    }

    private static boolean zzP(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzQ(T t10, int i10) {
        int zzz = zzz(i10);
        long j10 = (long) (zzz & 1048575);
        if (j10 != 1048575) {
            return (zzacj.zzc(t10, j10) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i10);
        long j11 = (long) (zzC & 1048575);
        switch (zzB(zzC)) {
            case 0:
                return zzacj.zza(t10, j11) != 0.0d;
            case 1:
                return zzacj.zzb(t10, j11) != 0.0f;
            case 2:
                return zzacj.zzd(t10, j11) != 0;
            case 3:
                return zzacj.zzd(t10, j11) != 0;
            case 4:
                return zzacj.zzc(t10, j11) != 0;
            case 5:
                return zzacj.zzd(t10, j11) != 0;
            case 6:
                return zzacj.zzc(t10, j11) != 0;
            case 7:
                return zzacj.zzw(t10, j11);
            case 8:
                Object zzf2 = zzacj.zzf(t10, j11);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zzyu) {
                    return !zzyu.zzb.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzacj.zzf(t10, j11) != null;
            case 10:
                return !zzyu.zzb.equals(zzacj.zzf(t10, j11));
            case 11:
                return zzacj.zzc(t10, j11) != 0;
            case 12:
                return zzacj.zzc(t10, j11) != 0;
            case 13:
                return zzacj.zzc(t10, j11) != 0;
            case 14:
                return zzacj.zzd(t10, j11) != 0;
            case 15:
                return zzacj.zzc(t10, j11) != 0;
            case 16:
                return zzacj.zzd(t10, j11) != 0;
            case 17:
                return zzacj.zzf(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzQ(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean zzS(Object obj, int i10, zzabl zzabl) {
        return zzabl.zzk(zzacj.zzf(obj, (long) (i10 & 1048575)));
    }

    private final boolean zzT(T t10, int i10, int i11) {
        return zzacj.zzc(t10, (long) (zzz(i11) & 1048575)) == i10;
    }

    private static <T> boolean zzU(T t10, long j10) {
        return ((Boolean) zzacj.zzf(t10, j10)).booleanValue();
    }

    private final void zzV(T t10, zzzf zzzf) {
        int i10;
        T t11 = t10;
        zzzf zzzf2 = zzzf;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int zzC = zzC(i12);
                int i15 = this.zzc[i12];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
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
                long j10 = (long) (zzC & i11);
                switch (zzB) {
                    case 0:
                        if ((i13 & i10) == 0) {
                            break;
                        } else {
                            zzzf2.zzf(i15, zzacj.zza(t11, j10));
                            continue;
                        }
                    case 1:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzo(i15, zzacj.zzb(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzt(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzJ(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzr(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzm(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzk(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzb(i15, zzacj.zzw(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i13 & i10) != 0) {
                            zzX(i15, unsafe.getObject(t11, j10), zzzf2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzv(i15, unsafe.getObject(t11, j10), zzF(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzd(i15, (zzyu) unsafe.getObject(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzH(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzi(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzw(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzy(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzA(i15, unsafe.getInt(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzC(i15, unsafe.getLong(t11, j10));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i13 & i10) != 0) {
                            zzzf2.zzq(i15, unsafe.getObject(t11, j10), zzF(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzabn.zzL(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 19:
                        zzabn.zzP(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 20:
                        zzabn.zzS(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 21:
                        zzabn.zzaa(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 22:
                        zzabn.zzR(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 23:
                        zzabn.zzO(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 24:
                        zzabn.zzN(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 25:
                        zzabn.zzJ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        continue;
                    case 26:
                        zzabn.zzY(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2);
                        break;
                    case 27:
                        zzabn.zzT(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, zzF(i12));
                        break;
                    case 28:
                        zzabn.zzK(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2);
                        break;
                    case 29:
                        zzabn.zzZ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 30:
                        zzabn.zzM(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 31:
                        zzabn.zzU(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 32:
                        zzabn.zzV(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 33:
                        zzabn.zzW(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 34:
                        zzabn.zzX(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, false);
                        break;
                    case 35:
                        zzabn.zzL(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 36:
                        zzabn.zzP(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 37:
                        zzabn.zzS(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 38:
                        zzabn.zzaa(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 39:
                        zzabn.zzR(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 40:
                        zzabn.zzO(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 41:
                        zzabn.zzN(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 42:
                        zzabn.zzJ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 43:
                        zzabn.zzZ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 44:
                        zzabn.zzM(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 45:
                        zzabn.zzU(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 46:
                        zzabn.zzV(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 47:
                        zzabn.zzW(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 48:
                        zzabn.zzX(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, true);
                        break;
                    case 49:
                        zzabn.zzQ(this.zzc[i12], (List) unsafe.getObject(t11, j10), zzzf2, zzF(i12));
                        break;
                    case 50:
                        zzW(zzzf2, i15, unsafe.getObject(t11, j10), i12);
                        break;
                    case 51:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzf(i15, zzo(t11, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzo(i15, zzp(t11, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzt(i15, zzD(t11, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzJ(i15, zzD(t11, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzr(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzm(i15, zzD(t11, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzk(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzb(i15, zzU(t11, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(t11, i15, i12)) {
                            zzX(i15, unsafe.getObject(t11, j10), zzzf2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzv(i15, unsafe.getObject(t11, j10), zzF(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzd(i15, (zzyu) unsafe.getObject(t11, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzH(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzi(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzw(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzy(i15, zzD(t11, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzA(i15, zzs(t11, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzC(i15, zzD(t11, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(t11, i15, i12)) {
                            zzzf2.zzq(i15, unsafe.getObject(t11, j10), zzF(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            zzabz<?, ?> zzabz = this.zzo;
            zzabz.zzr(zzabz.zzd(t11), zzzf2);
            return;
        }
        this.zzp.zza(t11);
        throw null;
    }

    private final <K, V> void zzW(zzzf zzzf, int i10, Object obj, int i11) {
        if (obj != null) {
            zzaas zzaas = (zzaas) zzH(i11);
            throw null;
        }
    }

    private static final void zzX(int i10, Object obj, zzzf zzzf) {
        if (obj instanceof String) {
            zzzf.zzF(i10, (String) obj);
        } else {
            zzzf.zzd(i10, (zzyu) obj);
        }
    }

    static zzaca zzd(Object obj) {
        zzzw zzzw = (zzzw) obj;
        zzaca zzaca = zzzw.zzc;
        if (zzaca != zzaca.zzc()) {
            return zzaca;
        }
        zzaca zze2 = zzaca.zze();
        zzzw.zzc = zze2;
        return zze2;
    }

    static <T> zzabc<T> zzl(Class<T> cls, zzaaw zzaaw, zzabe zzabe, zzaan zzaan, zzabz<?, ?> zzabz, zzzk<?> zzzk, zzaau zzaau) {
        if (zzaaw instanceof zzabj) {
            return zzm((zzabj) zzaaw, zzabe, zzaan, zzabz, zzzk, zzaau);
        }
        zzabw zzabw = (zzabw) zzaaw;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.p002firebaseauthapi.zzabc<T> zzm(com.google.android.gms.internal.p002firebaseauthapi.zzabj r34, com.google.android.gms.internal.p002firebaseauthapi.zzabe r35, com.google.android.gms.internal.p002firebaseauthapi.zzaan r36, com.google.android.gms.internal.p002firebaseauthapi.zzabz<?, ?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzzk<?> r38, com.google.android.gms.internal.p002firebaseauthapi.zzaau r39) {
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
            com.google.android.gms.internal.firebase-auth-api.zzaaz r18 = r34.zza()
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
            java.lang.reflect.Field r12 = zzI(r2, r12)
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
            java.lang.reflect.Field r7 = zzI(r2, r7)
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
            java.lang.reflect.Field r8 = zzI(r2, r8)
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
            java.lang.reflect.Field r11 = zzI(r2, r11)
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
            com.google.android.gms.internal.firebase-auth-api.zzabc r0 = new com.google.android.gms.internal.firebase-auth-api.zzabc
            r4 = r0
            com.google.android.gms.internal.firebase-auth-api.zzaaz r9 = r34.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzm(com.google.android.gms.internal.firebase-auth-api.zzabj, com.google.android.gms.internal.firebase-auth-api.zzabe, com.google.android.gms.internal.firebase-auth-api.zzaan, com.google.android.gms.internal.firebase-auth-api.zzabz, com.google.android.gms.internal.firebase-auth-api.zzzk, com.google.android.gms.internal.firebase-auth-api.zzaau):com.google.android.gms.internal.firebase-auth-api.zzabc");
    }

    private static <T> double zzo(T t10, long j10) {
        return ((Double) zzacj.zzf(t10, j10)).doubleValue();
    }

    private static <T> float zzp(T t10, long j10) {
        return ((Float) zzacj.zzf(t10, j10)).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x026a, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzx(r8, (com.google.android.gms.internal.p002firebaseauthapi.zzaaz) r0.getObject(r15, r12), zzF(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0281, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF((r9 >> 63) ^ (r9 + r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
        r7 = (r7 >> 31) ^ (r7 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02bf, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c5, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02cf, code lost:
        r7 = r0.getObject(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02d3, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
        r7 = ((com.google.android.gms.internal.p002firebaseauthapi.zzyu) r7).zzd();
        r8 = r8 + (com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7) + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ea, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzo(r8, r0.getObject(r15, r12), zzF(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0302, code lost:
        if ((r7 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0305, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzC((java.lang.String) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0316, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x032d, code lost:
        r7 = r0.getInt(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0331, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3);
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzy(r7);
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
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3) + com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x035c, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036a, code lost:
        r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0374, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if ((r7 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu) != false) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r7 = zzs(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r9 = zzD(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c3, code lost:
        r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzD(r8) + com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0263, code lost:
        r4 = r4 + r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzq(T r15) {
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
            int r7 = r14.zzC(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzB(r7)
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
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x026a
        L_0x0049:
            boolean r9 = r14.zzT(r15, r8, r3)
            if (r9 == 0) goto L_0x0374
            long r9 = zzD(r15, r12)
            goto L_0x0281
        L_0x0055:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = zzs(r15, r12)
            goto L_0x0299
        L_0x0061:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x0069:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x0071:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00c2
        L_0x0078:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            int r7 = zzs(r15, r12)
            goto L_0x02bf
        L_0x0084:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02cf
        L_0x008c:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x02ea
        L_0x0094:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu
            if (r9 == 0) goto L_0x0305
            goto L_0x0304
        L_0x00a4:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x0316
        L_0x00ac:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00b4:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00bc:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00c2:
            int r7 = zzs(r15, r12)
            goto L_0x0331
        L_0x00c8:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x00d5
        L_0x00cf:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
        L_0x00d5:
            long r9 = zzD(r15, r12)
            goto L_0x034b
        L_0x00db:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x035c
        L_0x00e3:
            boolean r7 = r14.zzT(r15, r8, r3)
            if (r7 == 0) goto L_0x0374
            goto L_0x036a
        L_0x00eb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzH(r3)
            com.google.android.gms.internal.p002firebaseauthapi.zzaau.zza(r8, r7, r9)
            goto L_0x0374
        L_0x00f8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.firebase-auth-api.zzabl r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzj(r8, r7, r9)
            goto L_0x0263
        L_0x0108:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzt(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0116:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzr(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0124:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0132:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0140:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zze(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x014e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzw(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x015c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzb(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0169:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0176:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0183:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzl(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x0190:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzy(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x019d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzn(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01aa:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r7)
            if (r7 <= 0) goto L_0x0374
            goto L_0x01c3
        L_0x01b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r7)
            if (r7 <= 0) goto L_0x0374
        L_0x01c3:
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzD(r8)
            int r9 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            int r8 = r8 + r9
            goto L_0x033b
        L_0x01ce:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzs(r8, r7, r1)
            goto L_0x0263
        L_0x01da:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzq(r8, r7, r1)
            goto L_0x0263
        L_0x01e6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzd(r8, r7, r1)
            goto L_0x0263
        L_0x01f2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzv(r8, r7, r1)
            goto L_0x0263
        L_0x01fd:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzc(r8, r7)
            goto L_0x0263
        L_0x0208:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.firebase-auth-api.zzabl r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzp(r8, r7, r9)
            goto L_0x0263
        L_0x0217:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzu(r8, r7)
            goto L_0x0263
        L_0x0222:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zza(r8, r7, r1)
            goto L_0x0263
        L_0x022d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzk(r8, r7, r1)
            goto L_0x0263
        L_0x0238:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzx(r8, r7, r1)
            goto L_0x0263
        L_0x0243:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzm(r8, r7, r1)
            goto L_0x0263
        L_0x024e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzf(r8, r7, r1)
            goto L_0x0263
        L_0x0259:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzh(r8, r7, r1)
        L_0x0263:
            int r4 = r4 + r7
            goto L_0x0374
        L_0x0266:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x026a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.firebase-auth-api.zzaaz r7 = (com.google.android.gms.internal.p002firebaseauthapi.zzaaz) r7
            com.google.android.gms.internal.firebase-auth-api.zzabl r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzx(r8, r7, r9)
            goto L_0x0263
        L_0x0279:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0374
            long r9 = r0.getLong(r15, r12)
        L_0x0281:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r9)
            goto L_0x033b
        L_0x0291:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            int r7 = r0.getInt(r15, r12)
        L_0x0299:
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
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
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
        L_0x02c5:
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            goto L_0x033b
        L_0x02cb:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02cf:
            java.lang.Object r7 = r0.getObject(r15, r12)
        L_0x02d3:
            com.google.android.gms.internal.firebase-auth-api.zzyu r7 = (com.google.android.gms.internal.p002firebaseauthapi.zzyu) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x033c
        L_0x02e6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x02ea:
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.firebase-auth-api.zzabl r9 = r14.zzF(r3)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzo(r8, r7, r9)
            goto L_0x0263
        L_0x02f8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu
            if (r9 == 0) goto L_0x0305
        L_0x0304:
            goto L_0x02d3
        L_0x0305:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzC(r7)
            goto L_0x033b
        L_0x0312:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x0316:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
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
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r8)
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzy(r7)
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
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r9)
            int r7 = r7 + r8
            goto L_0x0263
        L_0x0358:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x035c:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            int r7 = r7 + 4
            goto L_0x0263
        L_0x0366:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0374
        L_0x036a:
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r7)
            int r7 = r7 + 8
            goto L_0x0263
        L_0x0374:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0378:
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r14.zzo
            java.lang.Object r1 = r0.zzd(r15)
            int r0 = r0.zza(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzh
            if (r0 != 0) goto L_0x0388
            return r4
        L_0x0388:
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r0 = r14.zzp
            r0.zza(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzq(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0263, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzx(r6, (com.google.android.gms.internal.p002firebaseauthapi.zzaaz) com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7), zzF(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027c, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF((r7 >> 63) ^ (r7 + r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0297, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
        r4 = (r4 >> 31) ^ (r4 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cb, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
        r4 = ((com.google.android.gms.internal.p002firebaseauthapi.zzyu) r4).zzd();
        r5 = r5 + (com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02f4, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzo(r6, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7), zzF(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x030e, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0311, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzC((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0324, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0342, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0346, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3);
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzy(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0350, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0351, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0360, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0364, code lost:
        r3 = r3 + (com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3) + com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0377, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0387, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0391, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu) != false) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r4 = zzs(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r4 = zzD(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzD(r6) + com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x025a, code lost:
        r3 = r3 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzr(T r12) {
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
            int r4 = r11.zzC(r2)
            int r5 = zzB(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.firebase-auth-api.zzzp r4 = com.google.android.gms.internal.p002firebaseauthapi.zzzp.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.firebase-auth-api.zzzp r4 = com.google.android.gms.internal.p002firebaseauthapi.zzzp.SINT64_LIST_PACKED
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
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0263
        L_0x0040:
            boolean r5 = r11.zzT(r12, r6, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = zzD(r12, r7)
            goto L_0x027c
        L_0x004c:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = zzs(r12, r7)
            goto L_0x0297
        L_0x0058:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x0060:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0068:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00b9
        L_0x006f:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = zzs(r12, r7)
            goto L_0x02c5
        L_0x007b:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02d7
        L_0x0083:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x02f4
        L_0x008b:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu
            if (r5 == 0) goto L_0x0311
            goto L_0x0310
        L_0x009b:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0324
        L_0x00a3:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00ab:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00b3:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00b9:
            int r4 = zzs(r12, r7)
            goto L_0x0346
        L_0x00bf:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x00cc
        L_0x00c6:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
        L_0x00cc:
            long r4 = zzD(r12, r7)
            goto L_0x0364
        L_0x00d2:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x00da:
            boolean r4 = r11.zzT(r12, r6, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x00e2:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.lang.Object r5 = r11.zzH(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzaau.zza(r6, r4, r5)
            goto L_0x0391
        L_0x00ef:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzj(r6, r4, r5)
            goto L_0x025a
        L_0x00ff:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzt(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x010d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzr(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x011b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0129:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0137:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zze(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0145:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzw(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0153:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzb(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0160:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x016d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x017a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzl(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0187:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzy(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x0194:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzn(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01a1:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzg(r4)
            if (r4 <= 0) goto L_0x0391
            goto L_0x01ba
        L_0x01ae:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzi(r4)
            if (r4 <= 0) goto L_0x0391
        L_0x01ba:
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzD(r6)
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            int r5 = r5 + r6
            goto L_0x0350
        L_0x01c5:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzs(r6, r4, r1)
            goto L_0x025a
        L_0x01d1:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzq(r6, r4, r1)
            goto L_0x025a
        L_0x01dd:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzd(r6, r4, r1)
            goto L_0x025a
        L_0x01e9:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzv(r6, r4, r1)
            goto L_0x025a
        L_0x01f4:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzc(r6, r4)
            goto L_0x025a
        L_0x01ff:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzp(r6, r4, r5)
            goto L_0x025a
        L_0x020e:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzu(r6, r4)
            goto L_0x025a
        L_0x0219:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zza(r6, r4, r1)
            goto L_0x025a
        L_0x0224:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzk(r6, r4, r1)
            goto L_0x025a
        L_0x022f:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzx(r6, r4, r1)
            goto L_0x025a
        L_0x023a:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzm(r6, r4, r1)
            goto L_0x025a
        L_0x0245:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzf(r6, r4, r1)
            goto L_0x025a
        L_0x0250:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzh(r6, r4, r1)
        L_0x025a:
            int r3 = r3 + r4
            goto L_0x0391
        L_0x025d:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0263:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzaaz r4 = (com.google.android.gms.internal.p002firebaseauthapi.zzaaz) r4
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzx(r6, r4, r5)
            goto L_0x025a
        L_0x0272:
            boolean r5 = r11.zzQ(r12, r2)
            if (r5 == 0) goto L_0x0391
            long r7 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r12, r7)
        L_0x027c:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r6)
            goto L_0x0350
        L_0x028d:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r12, r7)
        L_0x0297:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            goto L_0x02cb
        L_0x02a3:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x02ab:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x02b3:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0342
        L_0x02bb:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r12, r7)
        L_0x02c5:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
        L_0x02cb:
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            goto L_0x0350
        L_0x02d1:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02d7:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
        L_0x02db:
            com.google.android.gms.internal.firebase-auth-api.zzyu r4 = (com.google.android.gms.internal.p002firebaseauthapi.zzyu) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x0351
        L_0x02ee:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x02f4:
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r11.zzF(r2)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzo(r6, r4, r5)
            goto L_0x025a
        L_0x0302:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzyu
            if (r5 == 0) goto L_0x0311
        L_0x0310:
            goto L_0x02db
        L_0x0311:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzC(r4)
            goto L_0x0350
        L_0x031e:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0324:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            int r4 = r4 + 1
            goto L_0x025a
        L_0x032e:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0377
        L_0x0335:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0387
        L_0x033c:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0342:
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r12, r7)
        L_0x0346:
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzy(r4)
        L_0x0350:
            int r5 = r5 + r4
        L_0x0351:
            int r3 = r3 + r5
            goto L_0x0391
        L_0x0353:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
            goto L_0x0360
        L_0x035a:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0360:
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r12, r7)
        L_0x0364:
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r6)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzF(r4)
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0391
        L_0x0371:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0377:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            int r4 = r4 + 4
            goto L_0x025a
        L_0x0381:
            boolean r4 = r11.zzQ(r12, r2)
            if (r4 == 0) goto L_0x0391
        L_0x0387:
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzze.zzE(r4)
            int r4 = r4 + 8
            goto L_0x025a
        L_0x0391:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0395:
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r11.zzo
            java.lang.Object r12 = r0.zzd(r12)
            int r12 = r0.zza(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzr(java.lang.Object):int");
    }

    private static <T> int zzs(T t10, long j10) {
        return ((Integer) zzacj.zzf(t10, j10)).intValue();
    }

    private final <K, V> int zzt(T t10, byte[] bArr, int i10, int i11, int i12, long j10, zzyh zzyh) {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i12);
        Object object = unsafe.getObject(t10, j10);
        if (zzaau.zzb(object)) {
            zzaat zzb2 = zzaat.zza().zzb();
            zzaau.zzc(zzb2, object);
            unsafe.putObject(t10, j10, zzb2);
        }
        zzaas zzaas = (zzaas) zzH;
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
    private final int zzu(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.p002firebaseauthapi.zzyh r29) {
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
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r0.zzF(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzc(r2, r3, r4, r5, r6, r7)
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
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r11)
            long r3 = r11.zzb
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzt(r3)
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
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r11)
            int r3 = r11.zza
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzs(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r11)
            int r4 = r11.zza
            com.google.android.gms.internal.firebase-auth-api.zzaaa r5 = r0.zzE(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.zza()
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            com.google.android.gms.internal.firebase-auth-api.zzaca r1 = zzd(r17)
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
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zza(r3, r4, r11)
            java.lang.Object r3 = r11.zzc
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            com.google.android.gms.internal.firebase-auth-api.zzabl r2 = r0.zzF(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzd(r2, r3, r4, r5, r11)
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
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r11)
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
            boolean r5 = com.google.android.gms.internal.p002firebaseauthapi.zzaco.zzf(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzd()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r11)
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
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r18, r19)
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
            long r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r11)
            int r3 = r11.zza
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r11)
            long r3 = r11.zzb
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r18, r19)
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
            long r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r18, r19)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzu(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
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
    private final int zzv(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.p002firebaseauthapi.zzyh r34) {
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzk(r0, r12, r3, r11)
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
            int r0 = r15.zzy(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.zzx(r5)
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
            int r0 = zzB(r1)
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
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r4, r11)
            long r3 = r11.zzb
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzt(r3)
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzs(r1)
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
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r4, r11)
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
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zza(r12, r4, r11)
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
            com.google.android.gms.internal.firebase-auth-api.zzabl r2 = r15.zzF(r8)
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzd(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0113
            java.lang.Object r3 = r11.zzc
            goto L_0x00f0
        L_0x0113:
            java.lang.Object r4 = r11.zzc
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r3, r4)
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzg(r12, r4, r11)
            goto L_0x0134
        L_0x0130:
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzh(r12, r4, r11)
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
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r4, r11)
            long r2 = r11.zzb
            r21 = 0
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r0 = 0
        L_0x0155:
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzm(r14, r5, r0)
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r12, r4)
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
            long r21 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r12, r4)
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r4, r11)
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
            int r17 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r4, r11)
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
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzp(r14, r5, r0)
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
            long r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzo(r14, r5, r0)
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
            com.google.android.gms.internal.firebase-auth-api.zzaab r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaab) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x023a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0232
            r1 = 10
            goto L_0x0233
        L_0x0232:
            int r1 = r1 + r1
        L_0x0233:
            com.google.android.gms.internal.firebase-auth-api.zzaab r0 = r0.zzd(r1)
            r9.putObject(r14, r5, r0)
        L_0x023a:
            r5 = r0
            com.google.android.gms.internal.firebase-auth-api.zzabl r0 = r15.zzF(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zze(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
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
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02af
            goto L_0x029b
        L_0x0304:
            com.google.android.gms.internal.firebase-auth-api.zzaca r4 = zzd(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzi(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.firebase-auth-api.zzaae r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
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
        r6 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        if (r2 == r7.zza) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r6, r7);
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
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzyu.zzb);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzyu.zzo(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.zza) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7);
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
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzw(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p002firebaseauthapi.zzyh r29) {
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
            com.google.android.gms.internal.firebase-auth-api.zzaab r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaab) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.firebase-auth-api.zzaab r12 = r12.zzd(r13)
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
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r15.zzF(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzc(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x03cd
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzt(r4)
            r12.zzf(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03ec
        L_0x007b:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
        L_0x0084:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzt(r8)
            r12.zzf(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            com.google.android.gms.internal.firebase-auth-api.zzzx r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzx) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzs(r4)
            r12.zzf(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03ec
        L_0x00bb:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzzx r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzx) r12
        L_0x00c4:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzs(r4)
            r12.zzf(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzf(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03eb
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzl(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            com.google.android.gms.internal.firebase-auth-api.zzzw r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzzw) r1
            com.google.android.gms.internal.firebase-auth-api.zzaca r3 = r1.zzc
            com.google.android.gms.internal.firebase-auth-api.zzaca r4 = com.google.android.gms.internal.p002firebaseauthapi.zzaca.zzc()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            com.google.android.gms.internal.firebase-auth-api.zzaaa r4 = r15.zzE(r8)
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r5 = r0.zzo
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzC(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0240
        L_0x010f:
            com.google.android.gms.internal.firebase-auth-api.zzaca r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzaca) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03eb
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            com.google.android.gms.internal.firebase-auth-api.zzyu r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyu.zzb
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            com.google.android.gms.internal.firebase-auth-api.zzyu r6 = com.google.android.gms.internal.p002firebaseauthapi.zzyu.zzo(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x0151:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x015c:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r15.zzF(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            if (r6 != 0) goto L_0x01c9
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01c4
            if (r6 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r1)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza
            r8.<init>(r3, r4, r6, r9)
        L_0x019e:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x01a2:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x01bf
            if (r6 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza
            r8.<init>(r3, r4, r6, r9)
            goto L_0x019e
        L_0x01bf:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
            throw r1
        L_0x01c4:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
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
            boolean r9 = com.google.android.gms.internal.p002firebaseauthapi.zzaco.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza
            r9.<init>(r3, r4, r6, r10)
        L_0x01e2:
            r12.add(r9)
            r4 = r8
        L_0x01e6:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x03eb
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r6, r7)
            int r6 = r7.zza
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x01fb
            goto L_0x01cf
        L_0x01fb:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.p002firebaseauthapi.zzaco.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01e2
        L_0x020b:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzd()
            throw r1
        L_0x0210:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
            throw r1
        L_0x0215:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzd()
            throw r1
        L_0x021a:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzf()
            throw r1
        L_0x021f:
            r1 = 0
            if (r6 != r14) goto L_0x0248
            com.google.android.gms.internal.firebase-auth-api.zzyj r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzyj) r12
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x022b:
            if (r2 >= r4) goto L_0x023e
            int r2 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r2, r7)
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
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x0248:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzyj r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzyj) r12
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x0267
            goto L_0x0272
        L_0x0267:
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
            goto L_0x0256
        L_0x0272:
            return r4
        L_0x0273:
            if (r6 != r14) goto L_0x0293
            com.google.android.gms.internal.firebase-auth-api.zzzx r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzx) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x027e:
            if (r1 >= r2) goto L_0x028a
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 4
            goto L_0x027e
        L_0x028a:
            if (r1 != r2) goto L_0x028e
            goto L_0x03ec
        L_0x028e:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x0293:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzzx r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzx) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r17, r18)
        L_0x029b:
            r12.zzf(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b0
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r3, r4)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02d1
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02bc:
            if (r1 >= r2) goto L_0x02c8
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r3, r1)
            r12.zzf(r4)
            int r1 = r1 + 8
            goto L_0x02bc
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x03ec
        L_0x02cc:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x02d1:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
            long r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r17, r18)
        L_0x02d9:
            r12.zzf(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02ee
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            long r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r3, r4)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x02f7
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzf(r3, r4, r12, r7)
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
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030a:
            if (r6 != r14) goto L_0x032a
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0315:
            if (r1 >= r2) goto L_0x0321
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zzf(r4)
            goto L_0x0315
        L_0x0321:
            if (r1 != r2) goto L_0x0325
            goto L_0x03ec
        L_0x0325:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x032a:
            if (r6 != 0) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzaao r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzaao) r12
        L_0x032e:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zzf(r8)
            if (r1 >= r5) goto L_0x0341
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x032e
        L_0x0341:
            return r1
        L_0x0342:
            if (r6 != r14) goto L_0x0366
            com.google.android.gms.internal.firebase-auth-api.zzzq r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzq) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x034d
        L_0x035d:
            if (r1 != r2) goto L_0x0361
            goto L_0x03ec
        L_0x0361:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x0366:
            if (r6 != r9) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzzq r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzq) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r17, r18)
        L_0x036e:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0387
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r3, r4)
            goto L_0x036e
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ab
            com.google.android.gms.internal.firebase-auth-api.zzzg r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzg) r12
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a6
            goto L_0x03ec
        L_0x03a6:
            com.google.android.gms.internal.firebase-auth-api.zzaae r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r1
        L_0x03ab:
            if (r6 != r13) goto L_0x03eb
            com.google.android.gms.internal.firebase-auth-api.zzzg r12 = (com.google.android.gms.internal.p002firebaseauthapi.zzzg) r12
            long r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r17, r18)
        L_0x03b3:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03cc
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03c7
            goto L_0x03cc
        L_0x03c7:
            long r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r3, r4)
            goto L_0x03b3
        L_0x03cc:
            return r1
        L_0x03cd:
            if (r4 >= r5) goto L_0x03ea
            int r8 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r3, r4, r7)
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
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzc(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    private final int zzx(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzA(i10, 0);
    }

    private final int zzy(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzA(i10, i11);
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 2];
    }

    public final int zza(T t10) {
        return this.zzj ? zzr(t10) : zzq(t10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r2 = r2 * 53;
        r3 = zzs(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r2 = r2 * 53;
        r3 = zzD(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        if (r3 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5).hashCode();
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
        r3 = ((java.lang.String) com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011f, code lost:
        r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzc(r3);
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
            int r3 = r8.zzC(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzB(r3)
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
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0027:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x002f:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x003e:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x004b:
            goto L_0x008d
        L_0x004c:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0053:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x005b:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00cb
        L_0x0063:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00e4
        L_0x006b:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            boolean r3 = zzU(r9, r5)
            goto L_0x00f7
        L_0x0079:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x008d
        L_0x0080:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x0087:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x008d:
            int r2 = r2 * 53
            int r3 = zzs(r9, r5)
            goto L_0x0123
        L_0x0095:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            goto L_0x00a2
        L_0x009c:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
        L_0x00a2:
            int r2 = r2 * 53
            long r3 = zzD(r9, r5)
            goto L_0x011f
        L_0x00aa:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            float r3 = zzp(r9, r5)
            goto L_0x0110
        L_0x00b7:
            boolean r3 = r8.zzT(r9, r4, r1)
            if (r3 == 0) goto L_0x0124
            int r2 = r2 * 53
            double r3 = zzo(r9, r5)
            goto L_0x011b
        L_0x00c4:
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            if (r3 == 0) goto L_0x00e0
            goto L_0x00dc
        L_0x00cb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00d6:
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            if (r3 == 0) goto L_0x00e0
        L_0x00dc:
            int r7 = r3.hashCode()
        L_0x00e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0124
        L_0x00e4:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0123
        L_0x00f1:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzw(r9, r5)
        L_0x00f7:
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zza(r3)
            goto L_0x0123
        L_0x00fc:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            goto L_0x0123
        L_0x0103:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            goto L_0x011f
        L_0x010a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzb(r9, r5)
        L_0x0110:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0123
        L_0x0115:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza(r9, r5)
        L_0x011b:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x011f:
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzc(r3)
        L_0x0123:
            int r2 = r2 + r3
        L_0x0124:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0128:
            int r2 = r2 * 53
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r8.zzo
            java.lang.Object r0 = r0.zzd(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x013a
            return r2
        L_0x013a:
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r0 = r8.zzp
            r0.zza(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzb(java.lang.Object):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0324, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0340, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x036a, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x038c, code lost:
        if (r0 != r15) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fe, code lost:
        r10.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0148, code lost:
        r10.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f6, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022d, code lost:
        r0.putLong(r1, r2, r4);
        r5 = r6 | r24;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026c, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x026e, code lost:
        r3 = r8;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0286, code lost:
        r7 = r33;
        r18 = r6;
        r19 = r8;
        r26 = r10;
        r8 = r11;
        r23 = r20;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzc(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.p002firebaseauthapi.zzyh r34) {
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
            if (r0 >= r13) goto L_0x0400
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            goto L_0x002d
        L_0x0028:
            r27 = r1
            r1 = r0
            r0 = r27
        L_0x002d:
            int r8 = r1 >>> 3
            r7 = r1 & 7
            r4 = 3
            if (r8 <= r2) goto L_0x003a
            int r3 = r3 / r4
            int r2 = r15.zzy(r8, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.zzx(r8)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r2 = r0
            r18 = r5
            r23 = r8
            r26 = r10
            r7 = r11
            r17 = -1
            r19 = 0
            r8 = r1
            goto L_0x038f
        L_0x0050:
            int[] r3 = r15.zzc
            int r19 = r2 + 1
            r3 = r3[r19]
            int r4 = zzB(r3)
            r20 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r3 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r4 > r0) goto L_0x0293
            int[] r0 = r15.zzc
            int r24 = r2 + 2
            r0 = r0[r24]
            int r24 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r24
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            r17 = r2
            if (r0 == r6) goto L_0x008b
            if (r6 == r11) goto L_0x0083
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0083:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x008d
        L_0x008b:
            r25 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r4) {
                case 0: goto L_0x0250;
                case 1: goto L_0x0234;
                case 2: goto L_0x0211;
                case 3: goto L_0x0211;
                case 4: goto L_0x01f9;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01bc;
                case 7: goto L_0x019a;
                case 8: goto L_0x0176;
                case 9: goto L_0x014d;
                case 10: goto L_0x0133;
                case 11: goto L_0x01f9;
                case 12: goto L_0x0103;
                case 13: goto L_0x01bc;
                case 14: goto L_0x01d5;
                case 15: goto L_0x00e6;
                case 16: goto L_0x00bd;
                default: goto L_0x0092;
            }
        L_0x0092:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 3
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x0286
            com.google.android.gms.internal.firebase-auth-api.zzabl r0 = r15.zzF(r8)
            int r1 = r20 << 3
            r7 = r1 | 4
            r1 = r30
            r3 = r32
            r12 = r4
            r4 = r7
            r5 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0272
            java.lang.Object r1 = r9.zzc
            goto L_0x027c
        L_0x00bd:
            if (r7 != 0) goto L_0x00da
            r1 = r21
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r1, r9)
            long r0 = r9.zzb
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzt(r0)
            r2 = r22
            r0 = r10
            r11 = r20
            r1 = r29
            r20 = r8
            r8 = r17
            r17 = -1
            goto L_0x022d
        L_0x00da:
            r11 = r20
            r20 = r8
            r8 = r17
            r17 = -1
            r2 = r21
            goto L_0x0286
        L_0x00e6:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != 0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r1, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzyx.zzs(r1)
        L_0x00fe:
            r10.putInt(r14, r2, r1)
            goto L_0x026c
        L_0x0103:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != 0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r1, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.firebase-auth-api.zzaaa r4 = r15.zzE(r8)
            if (r4 == 0) goto L_0x00fe
            boolean r4 = r4.zza()
            if (r4 == 0) goto L_0x0124
            goto L_0x00fe
        L_0x0124:
            com.google.android.gms.internal.firebase-auth-api.zzaca r2 = zzd(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzh(r11, r1)
            r5 = r6
            goto L_0x026e
        L_0x0133:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zza(r12, r1, r9)
            java.lang.Object r1 = r9.zzc
        L_0x0148:
            r10.putObject(r14, r2, r1)
            goto L_0x026c
        L_0x014d:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x01f6
            com.google.android.gms.internal.firebase-auth-api.zzabl r0 = r15.zzF(r8)
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzd(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x016b
            java.lang.Object r1 = r9.zzc
            goto L_0x0148
        L_0x016b:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r1, r4)
            goto L_0x0148
        L_0x0176:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 2
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x01f6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x018f
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzg(r12, r1, r9)
            goto L_0x0193
        L_0x018f:
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzh(r12, r1, r9)
        L_0x0193:
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r4, r1)
            goto L_0x026c
        L_0x019a:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != 0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r1, r9)
            long r1 = r9.zzb
            r21 = 0
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01b6
            r1 = 1
            goto L_0x01b7
        L_0x01b6:
            r1 = 0
        L_0x01b7:
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzm(r14, r4, r1)
            goto L_0x026c
        L_0x01bc:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x01f6
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
            goto L_0x026c
        L_0x01d5:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 1
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x01f6
            long r21 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r12, r1)
            r7 = r1
            r0 = r10
            r1 = r29
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x026c
        L_0x01f6:
            r2 = r1
            goto L_0x0286
        L_0x01f9:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != 0) goto L_0x0286
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzj(r12, r2, r9)
            int r1 = r9.zza
            r10.putInt(r14, r4, r1)
            goto L_0x026c
        L_0x0211:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != 0) goto L_0x0286
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzm(r12, r2, r9)
            long r2 = r9.zzb
            r0 = r10
            r1 = r29
            r21 = r2
            r2 = r4
            r4 = r21
        L_0x022d:
            r0.putLong(r1, r2, r4)
            r5 = r6 | r24
            r0 = r7
            goto L_0x026e
        L_0x0234:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x0286
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzb(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzp(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x026c
        L_0x0250:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 1
            r20 = r8
            r8 = r17
            r17 = -1
            if (r7 != r0) goto L_0x0286
            long r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzn(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzo(r14, r4, r0)
            int r0 = r2 + 8
        L_0x026c:
            r5 = r6 | r24
        L_0x026e:
            r3 = r8
            r1 = r11
            goto L_0x02df
        L_0x0272:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r1, r2)
        L_0x027c:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x026e
        L_0x0286:
            r7 = r33
            r18 = r6
            r19 = r8
            r26 = r10
            r8 = r11
            r23 = r20
            goto L_0x0372
        L_0x0293:
            r11 = r20
            r12 = r22
            r17 = -1
            r20 = r8
            r8 = r2
            r2 = r21
            r0 = 27
            if (r4 != r0) goto L_0x02f6
            r0 = 2
            if (r7 != r0) goto L_0x02e7
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.firebase-auth-api.zzaab r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzaab) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x02c2
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ba
            r1 = 10
            goto L_0x02bb
        L_0x02ba:
            int r1 = r1 + r1
        L_0x02bb:
            com.google.android.gms.internal.firebase-auth-api.zzaab r0 = r0.zzd(r1)
            r10.putObject(r14, r12, r0)
        L_0x02c2:
            r7 = r0
            com.google.android.gms.internal.firebase-auth-api.zzabl r0 = r15.zzF(r8)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r18 = r5
            r5 = r7
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zze(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r8
            r5 = r18
        L_0x02df:
            r2 = r20
            r6 = r25
            r11 = r33
            goto L_0x0019
        L_0x02e7:
            r18 = r5
            r25 = r6
            r15 = r2
            r19 = r8
            r26 = r10
            r23 = r20
            r20 = r11
            goto L_0x036d
        L_0x02f6:
            r18 = r5
            r25 = r6
            r6 = r2
            r0 = 49
            if (r4 > r0) goto L_0x0344
            long r2 = (long) r3
            r0 = r28
            r1 = r29
            r21 = r2
            r2 = r30
            r3 = r6
            r5 = r4
            r4 = r32
            r31 = r5
            r5 = r11
            r15 = r6
            r6 = r20
            r19 = r8
            r23 = r20
            r26 = r10
            r9 = r21
            r20 = r11
            r11 = r31
            r14 = r34
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0340
        L_0x0326:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r18
            r3 = r19
            r1 = r20
            r2 = r23
            r6 = r25
            r10 = r26
            goto L_0x0019
        L_0x0340:
            r7 = r33
            r2 = r0
            goto L_0x0370
        L_0x0344:
            r31 = r4
            r15 = r6
            r19 = r8
            r26 = r10
            r23 = r20
            r20 = r11
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x0375
            r0 = 2
            if (r7 != r0) goto L_0x036d
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0340
            goto L_0x0326
        L_0x036d:
            r7 = r33
            r2 = r15
        L_0x0370:
            r8 = r20
        L_0x0372:
            r6 = r25
            goto L_0x038f
        L_0x0375:
            r0 = r28
            r1 = r29
            r2 = r30
            r8 = r3
            r3 = r15
            r4 = r32
            r5 = r20
            r6 = r23
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0340
            goto L_0x0326
        L_0x038f:
            if (r8 != r7) goto L_0x03a1
            if (r7 == 0) goto L_0x03a1
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r18
            r2 = 0
            goto L_0x040d
        L_0x03a1:
            r9 = r28
            boolean r0 = r9.zzh
            if (r0 == 0) goto L_0x03d9
            r10 = r34
            com.google.android.gms.internal.firebase-auth-api.zzzj r0 = r10.zzd
            com.google.android.gms.internal.firebase-auth-api.zzzj r1 = com.google.android.gms.internal.p002firebaseauthapi.zzzj.zza()
            if (r0 == r1) goto L_0x03d6
            com.google.android.gms.internal.firebase-auth-api.zzaaz r0 = r9.zzg
            com.google.android.gms.internal.firebase-auth-api.zzzj r1 = r10.zzd
            r11 = r23
            com.google.android.gms.internal.firebase-auth-api.zzzu r0 = r1.zzb(r0, r11)
            if (r0 != 0) goto L_0x03cf
            com.google.android.gms.internal.firebase-auth-api.zzaca r4 = zzd(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzi(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03ee
        L_0x03cf:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.firebase-auth-api.zzzt r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzzt) r0
            r2 = 0
            throw r2
        L_0x03d6:
            r12 = r29
            goto L_0x03dd
        L_0x03d9:
            r12 = r29
            r10 = r34
        L_0x03dd:
            r11 = r23
            com.google.android.gms.internal.firebase-auth-api.zzaca r4 = zzd(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzi(r0, r1, r2, r3, r4, r5)
        L_0x03ee:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r19
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x0400:
            r18 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x040d:
            if (r6 == r3) goto L_0x0415
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x0415:
            int r3 = r9.zzl
        L_0x0417:
            int r4 = r9.zzm
            if (r3 >= r4) goto L_0x0427
            int[] r4 = r9.zzk
            r4 = r4[r3]
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r5 = r9.zzo
            r9.zzG(r12, r4, r2, r5)
            int r3 = r3 + 1
            goto L_0x0417
        L_0x0427:
            r2 = r32
            if (r7 != 0) goto L_0x0433
            if (r0 != r2) goto L_0x042e
            goto L_0x0437
        L_0x042e:
            com.google.android.gms.internal.firebase-auth-api.zzaae r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzg()
            throw r0
        L_0x0433:
            if (r0 > r2) goto L_0x0438
            if (r1 != r7) goto L_0x0438
        L_0x0437:
            return r0
        L_0x0438:
            com.google.android.gms.internal.firebase-auth-api.zzaae r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    public final T zze() {
        return ((zzzw) this.zzg).zzj(4, (Object) null, (Object) null);
    }

    public final void zzf(T t10) {
        int i10;
        int i11 = this.zzl;
        while (true) {
            i10 = this.zzm;
            if (i11 >= i10) {
                break;
            }
            long zzC = (long) (zzC(this.zzk[i11]) & 1048575);
            Object zzf2 = zzacj.zzf(t10, zzC);
            if (zzf2 != null) {
                ((zzaat) zzf2).zzc();
                zzacj.zzs(t10, zzC, zzf2);
            }
            i11++;
        }
        int length = this.zzk.length;
        while (i10 < length) {
            this.zzn.zzb(t10, (long) this.zzk[i10]);
            i10++;
        }
        this.zzo.zzm(t10);
        if (this.zzh) {
            this.zzp.zze(t10);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r7, r2, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r8, r2));
        zzN(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r7, r2, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r7, r2, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r7, r2, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        zzM(r7, r0);
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
            int r1 = r6.zzC(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.zzc
            r4 = r4[r0]
            int r1 = zzB(r1)
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
            boolean r1 = r6.zzT(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.zzK(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.zzT(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r7, r2, r1)
            r6.zzN(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.firebase-auth-api.zzaau r1 = r6.zzr
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzI(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r6.zzn
            r1.zzc(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.zzJ(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzw(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzm(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzb(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzp(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.zzQ(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza(r8, r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzo(r7, r2, r4)
        L_0x00eb:
            r6.zzM(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r6.zzo
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzF(r0, r7, r8)
            boolean r0 = r6.zzh
            if (r0 == 0) goto L_0x0100
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r0 = r6.zzp
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzE(r0, r7, r8)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzg(java.lang.Object, java.lang.Object):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void zzh(T r13, com.google.android.gms.internal.p002firebaseauthapi.zzabk r14, com.google.android.gms.internal.p002firebaseauthapi.zzzj r15) {
        /*
            r12 = this;
            r15.getClass()
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r7 = r12.zzo
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r8 = r12.zzp
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.zzc()     // Catch:{ all -> 0x0079 }
            int r2 = r12.zzx(r1)     // Catch:{ all -> 0x0079 }
            if (r2 >= 0) goto L_0x007c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0030
            int r14 = r12.zzl
        L_0x001b:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x051b
            r7.zzn(r13, r10)
            return
        L_0x0030:
            boolean r2 = r12.zzh     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0036
            r2 = r9
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.firebase-auth-api.zzaaz r2 = r12.zzg     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r8.zzc(r15, r2, r1)     // Catch:{ all -> 0x0079 }
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.firebase-auth-api.zzzo r0 = r8.zzb(r13)     // Catch:{ all -> 0x0079 }
        L_0x0045:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.zzd(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0079 }
            r0 = r11
            goto L_0x000a
        L_0x0052:
            r7.zzq(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x0064:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x051b
            r7.zzn(r13, r10)
            return
        L_0x0079:
            r14 = move-exception
            goto L_0x051c
        L_0x007c:
            int r3 = r12.zzC(r2)     // Catch:{ all -> 0x0079 }
            int r4 = zzB(r3)     // Catch:{ zzaad -> 0x04f5 }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x04cb;
                case 1: goto L_0x04bf;
                case 2: goto L_0x04b3;
                case 3: goto L_0x04a7;
                case 4: goto L_0x049b;
                case 5: goto L_0x048f;
                case 6: goto L_0x0483;
                case 7: goto L_0x0477;
                case 8: goto L_0x0472;
                case 9: goto L_0x0447;
                case 10: goto L_0x043c;
                case 11: goto L_0x0431;
                case 12: goto L_0x041a;
                case 13: goto L_0x040f;
                case 14: goto L_0x0404;
                case 15: goto L_0x03f9;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03bd;
                case 18: goto L_0x03b2;
                case 19: goto L_0x03a7;
                case 20: goto L_0x039c;
                case 21: goto L_0x0391;
                case 22: goto L_0x0386;
                case 23: goto L_0x037b;
                case 24: goto L_0x0370;
                case 25: goto L_0x0365;
                case 26: goto L_0x033b;
                case 27: goto L_0x0329;
                case 28: goto L_0x031b;
                case 29: goto L_0x0310;
                case 30: goto L_0x02ff;
                case 31: goto L_0x02f4;
                case 32: goto L_0x02e9;
                case 33: goto L_0x02de;
                case 34: goto L_0x02d3;
                case 35: goto L_0x02c5;
                case 36: goto L_0x02b7;
                case 37: goto L_0x02a9;
                case 38: goto L_0x029b;
                case 39: goto L_0x028d;
                case 40: goto L_0x027f;
                case 41: goto L_0x0271;
                case 42: goto L_0x0263;
                case 43: goto L_0x0255;
                case 44: goto L_0x0240;
                case 45: goto L_0x0232;
                case 46: goto L_0x0224;
                case 47: goto L_0x0216;
                case 48: goto L_0x0208;
                case 49: goto L_0x01f6;
                case 50: goto L_0x01c0;
                case 51: goto L_0x01b1;
                case 52: goto L_0x01a2;
                case 53: goto L_0x0193;
                case 54: goto L_0x0184;
                case 55: goto L_0x0175;
                case 56: goto L_0x0166;
                case 57: goto L_0x0157;
                case 58: goto L_0x0148;
                case 59: goto L_0x0143;
                case 60: goto L_0x0115;
                case 61: goto L_0x010b;
                case 62: goto L_0x00fd;
                case 63: goto L_0x00dc;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00c0;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a4;
                case 68: goto L_0x0092;
                default: goto L_0x008a;
            }     // Catch:{ zzaad -> 0x04f5 }
        L_0x008a:
            if (r10 != 0) goto L_0x04d8
            java.lang.Object r1 = r7.zzf()     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x04d7
        L_0x0092:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r5 = r14.zzr(r5, r15)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
        L_0x009f:
            r12.zzN(r13, r1, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzn()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x00b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            int r5 = r14.zzi()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x00c0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzm()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x00ce:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            int r5 = r14.zzh()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x00dc:
            int r4 = r14.zze()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaaa r6 = r12.zzE(r2)     // Catch:{ zzaad -> 0x04f5 }
            if (r6 == 0) goto L_0x00f3
            boolean r6 = r6.zza()     // Catch:{ zzaad -> 0x04f5 }
            if (r6 == 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            java.lang.Object r10 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzD(r1, r4, r10, r7)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x00f3:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r5, r3)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x00fd:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            int r5 = r14.zzj()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x010b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzyu r5 = r14.zzp()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0115:
            boolean r4 = r12.zzT(r13, r1, r2)     // Catch:{ zzaad -> 0x04f5 }
            r3 = r3 & r5
            if (r4 == 0) goto L_0x0132
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r13, r3)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r6 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r6 = r14.zzs(r6, r15)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r5 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r5, r6)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0132:
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r5 = r14.zzs(r5, r15)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            r12.zzM(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0143:
            r12.zzL(r13, r3, r14)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0148:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            boolean r5 = r14.zzN()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0157:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            int r5 = r14.zzf()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0166:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzk()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0175:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            int r5 = r14.zzg()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0184:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzo()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x0193:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzl()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x01a2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            float r5 = r14.zzb()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x01b1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            double r5 = r14.zza()     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x009f
        L_0x01c0:
            java.lang.Object r1 = r12.zzH(r2)     // Catch:{ zzaad -> 0x04f5 }
            int r2 = r12.zzC(r2)     // Catch:{ zzaad -> 0x04f5 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            if (r4 == 0) goto L_0x01e6
            boolean r5 = com.google.android.gms.internal.p002firebaseauthapi.zzaau.zzb(r4)     // Catch:{ zzaad -> 0x04f5 }
            if (r5 == 0) goto L_0x01f1
            com.google.android.gms.internal.firebase-auth-api.zzaat r5 = com.google.android.gms.internal.p002firebaseauthapi.zzaat.zza()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaat r5 = r5.zzb()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzaau.zzc(r5, r4)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r2, r5)     // Catch:{ zzaad -> 0x04f5 }
            r4 = r5
            goto L_0x01f1
        L_0x01e6:
            com.google.android.gms.internal.firebase-auth-api.zzaat r4 = com.google.android.gms.internal.p002firebaseauthapi.zzaat.zza()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaat r4 = r4.zzb()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r2, r4)     // Catch:{ zzaad -> 0x04f5 }
        L_0x01f1:
            com.google.android.gms.internal.firebase-auth-api.zzaat r4 = (com.google.android.gms.internal.p002firebaseauthapi.zzaat) r4     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaas r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzaas) r1     // Catch:{ zzaad -> 0x04f5 }
            throw r9     // Catch:{ zzaad -> 0x04f5 }
        L_0x01f6:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaan r2 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaad -> 0x04f5 }
            r14.zzC(r2, r1, r15)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0208:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x0211:
            r14.zzJ(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0216:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x021f:
            r14.zzI(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0224:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x022d:
            r14.zzH(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0232:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x023b:
            r14.zzG(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0240:
            com.google.android.gms.internal.firebase-auth-api.zzaan r4 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzaad -> 0x04f5 }
            r14.zzy(r3)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaaa r2 = r12.zzE(r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x024f:
            java.lang.Object r10 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzC(r1, r3, r2, r10, r7)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0255:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x025e:
            r14.zzL(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0263:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x026c:
            r14.zzv(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0271:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x027a:
            r14.zzz(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x027f:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x0288:
            r14.zzA(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x028d:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x0296:
            r14.zzD(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x029b:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x02a4:
            r14.zzM(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x02a9:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x02b2:
            r14.zzE(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x02b7:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x02c0:
            r14.zzB(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x02c5:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x02ce:
            r14.zzx(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x02d3:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x0211
        L_0x02de:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x021f
        L_0x02e9:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x022d
        L_0x02f4:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x023b
        L_0x02ff:
            com.google.android.gms.internal.firebase-auth-api.zzaan r4 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r3 = r4.zza(r13, r5)     // Catch:{ zzaad -> 0x04f5 }
            r14.zzy(r3)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaaa r2 = r12.zzE(r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x024f
        L_0x0310:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x025e
        L_0x031b:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            r14.zzw(r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaan r4 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r2 = r4.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            r14.zzF(r2, r1, r15)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x033b:
            boolean r1 = zzP(r3)     // Catch:{ zzaad -> 0x04f5 }
            if (r1 == 0) goto L_0x0353
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            r2 = r14
            com.google.android.gms.internal.firebase-auth-api.zzyy r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzyy) r2     // Catch:{ zzaad -> 0x04f5 }
            r3 = 1
            r2.zzK(r1, r3)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0353:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            r2 = r14
            com.google.android.gms.internal.firebase-auth-api.zzyy r2 = (com.google.android.gms.internal.p002firebaseauthapi.zzyy) r2     // Catch:{ zzaad -> 0x04f5 }
            r3 = 0
            r2.zzK(r1, r3)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x0365:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x026c
        L_0x0370:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x027a
        L_0x037b:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x0288
        L_0x0386:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x0296
        L_0x0391:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x02a4
        L_0x039c:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x02b2
        L_0x03a7:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x02c0
        L_0x03b2:
            com.google.android.gms.internal.firebase-auth-api.zzaan r1 = r12.zzn     // Catch:{ zzaad -> 0x04f5 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzaad -> 0x04f5 }
            java.util.List r1 = r1.zza(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x02ce
        L_0x03bd:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            if (r1 == 0) goto L_0x03db
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r13, r3)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r2 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r2 = r14.zzr(r2, r15)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r1, r2)     // Catch:{ zzaad -> 0x04f5 }
        L_0x03d6:
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x03db:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = r14.zzr(r1, r15)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
        L_0x03e9:
            r12.zzM(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x000a
        L_0x03ee:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzn()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x03f9:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            int r1 = r14.zzi()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0404:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzm()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x040f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            int r1 = r14.zzh()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x041a:
            int r4 = r14.zze()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzaaa r6 = r12.zzE(r2)     // Catch:{ zzaad -> 0x04f5 }
            if (r6 == 0) goto L_0x042a
            boolean r6 = r6.zza()     // Catch:{ zzaad -> 0x04f5 }
            if (r6 == 0) goto L_0x00ed
        L_0x042a:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r5, r4)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0431:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            int r1 = r14.zzj()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x043c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzyu r1 = r14.zzp()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0447:
            boolean r1 = r12.zzQ(r13, r2)     // Catch:{ zzaad -> 0x04f5 }
            if (r1 == 0) goto L_0x0462
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r13, r3)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r2 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r2 = r14.zzs(r2, r15)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaac.zzg(r1, r2)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03d6
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.firebase-auth-api.zzabl r1 = r12.zzF(r2)     // Catch:{ zzaad -> 0x04f5 }
            java.lang.Object r1 = r14.zzs(r1, r15)     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzs(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0472:
            r12.zzL(r13, r3, r14)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0477:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            boolean r1 = r14.zzN()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzm(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x0483:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            int r1 = r14.zzf()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x048f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzk()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x049b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            int r1 = r14.zzg()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzq(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x04a7:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzo()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x04b3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            long r5 = r14.zzl()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzr(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x04bf:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            float r1 = r14.zzb()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzp(r13, r3, r1)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x04cb:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ zzaad -> 0x04f5 }
            double r5 = r14.zza()     // Catch:{ zzaad -> 0x04f5 }
            com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzo(r13, r3, r5)     // Catch:{ zzaad -> 0x04f5 }
            goto L_0x03e9
        L_0x04d7:
            r10 = r1
        L_0x04d8:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ zzaad -> 0x04f5 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x04e0:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x04ef
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x04e0
        L_0x04ef:
            if (r10 == 0) goto L_0x051b
            r7.zzn(r13, r10)
            return
        L_0x04f5:
            r7.zzq(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x04ff
            java.lang.Object r1 = r7.zzc(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x04ff:
            boolean r1 = r7.zzp(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.zzl
        L_0x0507:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0516
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0507
        L_0x0516:
            if (r10 == 0) goto L_0x051b
            r7.zzn(r13, r10)
        L_0x051b:
            return
        L_0x051c:
            int r15 = r12.zzl
        L_0x051e:
            int r0 = r12.zzm
            if (r15 >= r0) goto L_0x052d
            int[] r0 = r12.zzk
            r0 = r0[r15]
            java.lang.Object r10 = r12.zzG(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x051e
        L_0x052d:
            if (r10 == 0) goto L_0x0532
            r7.zzn(r13, r10)
        L_0x0532:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzh(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzabk, com.google.android.gms.internal.firebase-auth-api.zzzj):void");
    }

    public final void zzi(T t10, byte[] bArr, int i10, int i11, zzyh zzyh) {
        if (this.zzj) {
            zzv(t10, bArr, i10, i11, zzyh);
        } else {
            zzc(t10, bArr, i10, i11, 0, zzyh);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzj(T r9, T r10) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.zzC(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = zzB(r3)
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
            int r3 = r8.zzz(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r3)
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r9, r5)
            java.lang.Object r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzH(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzw(r9, r5)
            boolean r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzw(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r9, r5)
            int r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r9, r5)
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzb(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.zzO(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza(r10, r5)
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
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r8.zzo
            java.lang.Object r0 = r0.zzd(r9)
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r2 = r8.zzo
            java.lang.Object r2 = r2.zzd(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.zzh
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r0 = r8.zzp
            r0.zza(r9)
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r9 = r8.zzp
            r9.zza(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean zzk(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzl) {
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzC = zzC(i15);
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
            if ((268435456 & zzC) != 0 && !zzR(t10, i15, i11, i10, i19)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(t11, i16, i15) && !zzS(t11, zzC, zzF(i15))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzaat) zzacj.zzf(t11, (long) (zzC & 1048575))).isEmpty()) {
                            zzaas zzaas = (zzaas) zzH(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzacj.zzf(t11, (long) (zzC & 1048575));
                if (!list.isEmpty()) {
                    zzabl zzF = zzF(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzF.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzR(t10, i15, i11, i10, i19) && !zzS(t11, zzC, zzF(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(t11);
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
        r11.zzd(r4, (com.google.android.gms.internal.p002firebaseauthapi.zzyu) com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03cf, code lost:
        r11.zzv(r4, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, (long) (r3 & 1048575)), zzF(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03e4, code lost:
        zzX(r4, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, (long) (r3 & 1048575)), r11);
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
        r11.zzq(r4, com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, (long) (r3 & 1048575)), zzF(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x035c, code lost:
        r11.zzC(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzn(T r10, com.google.android.gms.internal.p002firebaseauthapi.zzzf r11) {
        /*
            r9 = this;
            boolean r0 = r9.zzj
            if (r0 == 0) goto L_0x0484
            boolean r0 = r9.zzh
            if (r0 != 0) goto L_0x047d
            int[] r0 = r9.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x000d:
            if (r2 >= r0) goto L_0x0473
            int r3 = r9.zzC(r2)
            int[] r4 = r9.zzc
            r4 = r4[r2]
            int r5 = zzB(r3)
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
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x0341
        L_0x002c:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzD(r10, r5)
            goto L_0x035c
        L_0x003a:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x036d
        L_0x0048:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzD(r10, r5)
            goto L_0x037e
        L_0x0056:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x038f
        L_0x0064:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x03a0
        L_0x0072:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x03b1
        L_0x0080:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03bc
        L_0x0088:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03cf
        L_0x0090:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            goto L_0x03e4
        L_0x0098:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = zzU(r10, r5)
            goto L_0x03fb
        L_0x00a6:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x040c
        L_0x00b4:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzD(r10, r5)
            goto L_0x041c
        L_0x00c2:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = zzs(r10, r5)
            goto L_0x042c
        L_0x00d0:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzD(r10, r5)
            goto L_0x043c
        L_0x00de:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = zzD(r10, r5)
            goto L_0x044c
        L_0x00ec:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = zzp(r10, r5)
            goto L_0x045c
        L_0x00fa:
            boolean r5 = r9.zzT(r10, r4, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = zzo(r10, r5)
            goto L_0x046c
        L_0x0108:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            r9.zzW(r11, r4, r3, r2)
            goto L_0x046f
        L_0x0113:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r9.zzF(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzQ(r4, r3, r11, r5)
            goto L_0x046f
        L_0x0128:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzX(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0139:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzW(r4, r3, r11, r6)
            goto L_0x046f
        L_0x014a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzV(r4, r3, r11, r6)
            goto L_0x046f
        L_0x015b:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzU(r4, r3, r11, r6)
            goto L_0x046f
        L_0x016c:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzM(r4, r3, r11, r6)
            goto L_0x046f
        L_0x017d:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzZ(r4, r3, r11, r6)
            goto L_0x046f
        L_0x018e:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzJ(r4, r3, r11, r6)
            goto L_0x046f
        L_0x019f:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzN(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01b0:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzO(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01c1:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzR(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01d2:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzaa(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01e3:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzS(r4, r3, r11, r6)
            goto L_0x046f
        L_0x01f4:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzP(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0205:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r7 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r7)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzL(r4, r3, r11, r6)
            goto L_0x046f
        L_0x0216:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzX(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0227:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzW(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0238:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzV(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0249:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzU(r4, r3, r11, r1)
            goto L_0x046f
        L_0x025a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzM(r4, r3, r11, r1)
            goto L_0x046f
        L_0x026b:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzZ(r4, r3, r11, r1)
            goto L_0x046f
        L_0x027c:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzK(r4, r3, r11)
            goto L_0x046f
        L_0x028d:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r9.zzF(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzT(r4, r3, r11, r5)
            goto L_0x046f
        L_0x02a2:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzY(r4, r3, r11)
            goto L_0x046f
        L_0x02b3:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzJ(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02c4:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzN(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02d5:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzO(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02e6:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzR(r4, r3, r11, r1)
            goto L_0x046f
        L_0x02f7:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzaa(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0308:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzS(r4, r3, r11, r1)
            goto L_0x046f
        L_0x0319:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzP(r4, r3, r11, r1)
            goto L_0x046f
        L_0x032a:
            int[] r4 = r9.zzc
            r4 = r4[r2]
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.p002firebaseauthapi.zzabn.zzL(r4, r3, r11, r1)
            goto L_0x046f
        L_0x033b:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x0341:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r9.zzF(r2)
            r11.zzq(r4, r3, r5)
            goto L_0x046f
        L_0x0350:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
        L_0x035c:
            r11.zzC(r4, r5)
            goto L_0x046f
        L_0x0361:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x036d:
            r11.zzA(r4, r3)
            goto L_0x046f
        L_0x0372:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
        L_0x037e:
            r11.zzy(r4, r5)
            goto L_0x046f
        L_0x0383:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x038f:
            r11.zzw(r4, r3)
            goto L_0x046f
        L_0x0394:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x03a0:
            r11.zzi(r4, r3)
            goto L_0x046f
        L_0x03a5:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x03b1:
            r11.zzH(r4, r3)
            goto L_0x046f
        L_0x03b6:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03bc:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            com.google.android.gms.internal.firebase-auth-api.zzyu r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzyu) r3
            r11.zzd(r4, r3)
            goto L_0x046f
        L_0x03c9:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03cf:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            com.google.android.gms.internal.firebase-auth-api.zzabl r5 = r9.zzF(r2)
            r11.zzv(r4, r3, r5)
            goto L_0x046f
        L_0x03de:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
        L_0x03e4:
            r3 = r3 & r7
            long r5 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzf(r10, r5)
            zzX(r4, r3, r11)
            goto L_0x046f
        L_0x03ef:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            boolean r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzw(r10, r5)
        L_0x03fb:
            r11.zzb(r4, r3)
            goto L_0x046f
        L_0x0400:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x040c:
            r11.zzk(r4, r3)
            goto L_0x046f
        L_0x0410:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
        L_0x041c:
            r11.zzm(r4, r5)
            goto L_0x046f
        L_0x0420:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            int r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzc(r10, r5)
        L_0x042c:
            r11.zzr(r4, r3)
            goto L_0x046f
        L_0x0430:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
        L_0x043c:
            r11.zzJ(r4, r5)
            goto L_0x046f
        L_0x0440:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            long r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzd(r10, r5)
        L_0x044c:
            r11.zzt(r4, r5)
            goto L_0x046f
        L_0x0450:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            float r3 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zzb(r10, r5)
        L_0x045c:
            r11.zzo(r4, r3)
            goto L_0x046f
        L_0x0460:
            boolean r5 = r9.zzQ(r10, r2)
            if (r5 == 0) goto L_0x046f
            r3 = r3 & r7
            long r5 = (long) r3
            double r5 = com.google.android.gms.internal.p002firebaseauthapi.zzacj.zza(r10, r5)
        L_0x046c:
            r11.zzf(r4, r5)
        L_0x046f:
            int r2 = r2 + 3
            goto L_0x000d
        L_0x0473:
            com.google.android.gms.internal.firebase-auth-api.zzabz<?, ?> r0 = r9.zzo
            java.lang.Object r10 = r0.zzd(r10)
            r0.zzr(r10, r11)
            return
        L_0x047d:
            com.google.android.gms.internal.firebase-auth-api.zzzk<?> r11 = r9.zzp
            r11.zza(r10)
            r10 = 0
            throw r10
        L_0x0484:
            r9.zzV(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzabc.zzn(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzzf):void");
    }
}
