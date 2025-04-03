package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaca  reason: invalid package */
public final class zzaca {
    private static final zzaca zza = new zzaca(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaca() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzaca zzc() {
        return zza;
    }

    static zzaca zzd(zzaca zzaca, zzaca zzaca2) {
        int i10 = zzaca.zzb + zzaca2.zzb;
        int[] copyOf = Arrays.copyOf(zzaca.zzc, i10);
        System.arraycopy(zzaca2.zzc, 0, copyOf, zzaca.zzb, zzaca2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzaca.zzd, i10);
        System.arraycopy(zzaca2.zzd, 0, copyOf2, zzaca.zzb, zzaca2.zzb);
        return new zzaca(i10, copyOf, copyOf2, true);
    }

    static zzaca zze() {
        return new zzaca(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaca)) {
            return false;
        }
        zzaca zzaca = (zzaca) obj;
        int i10 = this.zzb;
        if (i10 == zzaca.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzaca.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzaca.zzd;
                    int i12 = this.zzb;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int i10;
        int i11;
        int i12;
        int i13 = this.zze;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.zzb; i15++) {
            int i16 = this.zzc[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.zzd[i15]).longValue();
                    i10 = zzze.zzE(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int zzE = zzze.zzE(i17 << 3);
                    int zzd2 = ((zzyu) this.zzd[i15]).zzd();
                    i14 += zzE + zzze.zzE(zzd2) + zzd2;
                } else if (i18 == 3) {
                    int zzD = zzze.zzD(i17);
                    i12 = zzD + zzD;
                    i11 = ((zzaca) this.zzd[i15]).zza();
                } else if (i18 == 5) {
                    ((Integer) this.zzd[i15]).intValue();
                    i10 = zzze.zzE(i17 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzaae.zza());
                }
                i14 += i10;
            } else {
                long longValue = ((Long) this.zzd[i15]).longValue();
                i12 = zzze.zzE(i17 << 3);
                i11 = zzze.zzF(longValue);
            }
            i10 = i12 + i11;
            i14 += i10;
        }
        this.zze = i14;
        return i14;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int zzE = zzze.zzE(8);
            int zzd2 = ((zzyu) this.zzd[i12]).zzd();
            i11 += zzE + zzE + zzze.zzE(16) + zzze.zzE(i13 >>> 3) + zzze.zzE(24) + zzze.zzE(zzd2) + zzd2;
        }
        this.zze = i11;
        return i11;
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzabb.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(int i10, Object obj) {
        if (this.zzf) {
            int i11 = this.zzb;
            int[] iArr = this.zzc;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.zzc = Arrays.copyOf(iArr, i12);
                this.zzd = Arrays.copyOf(this.zzd, i12);
            }
            int[] iArr2 = this.zzc;
            int i13 = this.zzb;
            iArr2[i13] = i10;
            this.zzd[i13] = obj;
            this.zzb = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzzf zzzf) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzzf.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzzf.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzzf.zzd(i12, (zzyu) obj);
                } else if (i13 == 3) {
                    zzzf.zzE(i12);
                    ((zzaca) obj).zzi(zzzf);
                    zzzf.zzh(i12);
                } else if (i13 == 5) {
                    zzzf.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzaae.zza());
                }
            }
        }
    }

    private zzaca(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }
}
