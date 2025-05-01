package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class zzmj {
    private static final zzmj zza = new zzmj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmj() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzmj zzc() {
        return zza;
    }

    static zzmj zzd(zzmj zzmj, zzmj zzmj2) {
        int i10 = zzmj.zzb + zzmj2.zzb;
        int[] copyOf = Arrays.copyOf(zzmj.zzc, i10);
        System.arraycopy(zzmj2.zzc, 0, copyOf, zzmj.zzb, zzmj2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmj.zzd, i10);
        System.arraycopy(zzmj2.zzd, 0, copyOf2, zzmj.zzb, zzmj2.zzb);
        return new zzmj(i10, copyOf, copyOf2, true);
    }

    static zzmj zze() {
        return new zzmj(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmj)) {
            return false;
        }
        zzmj zzmj = (zzmj) obj;
        int i10 = this.zzb;
        if (i10 == zzmj.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmj.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmj.zzd;
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
                    i10 = zzjg.zzA(i17 << 3) + 8;
                } else if (i18 == 2) {
                    int zzA = zzjg.zzA(i17 << 3);
                    int zzd2 = ((zziy) this.zzd[i15]).zzd();
                    i14 += zzA + zzjg.zzA(zzd2) + zzd2;
                } else if (i18 == 3) {
                    int zzz = zzjg.zzz(i17);
                    i12 = zzz + zzz;
                    i11 = ((zzmj) this.zzd[i15]).zza();
                } else if (i18 == 5) {
                    ((Integer) this.zzd[i15]).intValue();
                    i10 = zzjg.zzA(i17 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkj.zza());
                }
                i14 += i10;
            } else {
                long longValue = ((Long) this.zzd[i15]).longValue();
                i12 = zzjg.zzA(i17 << 3);
                i11 = zzjg.zzB(longValue);
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
            int zzA = zzjg.zzA(8);
            int zzd2 = ((zziy) this.zzd[i12]).zzd();
            i11 += zzA + zzA + zzjg.zzA(16) + zzjg.zzA(i13 >>> 3) + zzjg.zzA(24) + zzjg.zzA(zzd2) + zzd2;
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
            zzli.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
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

    public final void zzi(zzjh zzjh) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    zzjh.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    zzjh.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    zzjh.zzd(i12, (zziy) obj);
                } else if (i13 == 3) {
                    zzjh.zzE(i12);
                    ((zzmj) obj).zzi(zzjh);
                    zzjh.zzh(i12);
                } else if (i13 == 5) {
                    zzjh.zzk(i12, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkj.zza());
                }
            }
        }
    }

    private zzmj(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }
}
