package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyw  reason: invalid package */
final class zzyw extends zzyx {
    private final byte[] zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh = a.e.API_PRIORITY_OTHER;

    /* synthetic */ zzyw(byte[] bArr, int i10, int i11, boolean z10, zzyv zzyv) {
        super((zzyv) null);
        this.zzc = bArr;
        this.zzd = i11;
        this.zzf = 0;
    }

    private final void zzv() {
        int i10 = this.zzd + this.zze;
        this.zzd = i10;
        int i11 = this.zzh;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.zze = i12;
            this.zzd = i10 - i12;
            return;
        }
        this.zze = 0;
    }

    public final byte zza() {
        int i10 = this.zzf;
        if (i10 != this.zzd) {
            byte[] bArr = this.zzc;
            this.zzf = i10 + 1;
            return bArr[i10];
        }
        throw zzaae.zzi();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.zzf;
            if (i11 >= 0) {
                int i12 = this.zzh;
                if (i11 <= i12) {
                    this.zzh = i11;
                    zzv();
                    return i12;
                }
                throw zzaae.zzi();
            }
            throw zzaae.zzg();
        }
        throw zzaae.zzf();
    }

    public final int zzd() {
        int i10 = this.zzf;
        if (this.zzd - i10 >= 4) {
            byte[] bArr = this.zzc;
            this.zzf = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw zzaae.zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zze() {
        /*
            r5 = this;
            int r0 = r5.zzf
            int r1 = r5.zzd
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.zzc
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.zzf = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.zzf = r1
            return r0
        L_0x006c:
            long r0 = r5.zzi()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzyw.zze():int");
    }

    public final int zzf() {
        if (zzp()) {
            this.zzg = 0;
            return 0;
        }
        int zze2 = zze();
        this.zzg = zze2;
        if ((zze2 >>> 3) != 0) {
            return zze2;
        }
        throw zzaae.zzc();
    }

    public final long zzg() {
        int i10 = this.zzf;
        if (this.zzd - i10 >= 8) {
            byte[] bArr = this.zzc;
            this.zzf = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }
        throw zzaae.zzi();
    }

    public final long zzh() {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        int i10 = this.zzf;
        int i11 = this.zzd;
        if (i11 != i10) {
            byte[] bArr = this.zzc;
            int i12 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                this.zzf = i12;
                return (long) b11;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                byte b12 = b11 ^ (bArr[i12] << 7);
                if (b12 < 0) {
                    b10 = b12 ^ Byte.MIN_VALUE;
                } else {
                    int i14 = i13 + 1;
                    byte b13 = b12 ^ (bArr[i13] << 14);
                    if (b13 >= 0) {
                        j11 = (long) (b13 ^ 16256);
                    } else {
                        i13 = i14 + 1;
                        byte b14 = b13 ^ (bArr[i14] << 21);
                        if (b14 < 0) {
                            b10 = b14 ^ -2080896;
                        } else {
                            i14 = i13 + 1;
                            long j14 = (((long) bArr[i13]) << 28) ^ ((long) b14);
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i15 = i14 + 1;
                                long j15 = j14 ^ (((long) bArr[i14]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i14 = i15 + 1;
                                    j14 = j15 ^ (((long) bArr[i15]) << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i15 = i14 + 1;
                                        j15 = j14 ^ (((long) bArr[i14]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i14 = i15 + 1;
                                            j11 = (j15 ^ (((long) bArr[i15]) << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i15 = i14 + 1;
                                                if (((long) bArr[i14]) >= 0) {
                                                    j10 = j11;
                                                    i13 = i15;
                                                    this.zzf = i13;
                                                    return j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j12 ^ j15;
                                i13 = i15;
                                this.zzf = i13;
                                return j10;
                            }
                            j11 = j14 ^ j13;
                        }
                    }
                    i13 = i14;
                    j10 = j11;
                    this.zzf = i13;
                    return j10;
                }
                j10 = (long) b10;
                this.zzf = i13;
                return j10;
            }
        }
        return zzi();
    }

    /* access modifiers changed from: package-private */
    public final long zzi() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= ((long) (zza & Byte.MAX_VALUE)) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzaae.zze();
    }

    public final zzyu zzj() {
        int zze2 = zze();
        if (zze2 > 0) {
            int i10 = this.zzd;
            int i11 = this.zzf;
            if (zze2 <= i10 - i11) {
                zzyu zzo = zzyu.zzo(this.zzc, i11, zze2);
                this.zzf += zze2;
                return zzo;
            }
        }
        if (zze2 == 0) {
            return zzyu.zzb;
        }
        if (zze2 > 0) {
            int i12 = this.zzd;
            int i13 = this.zzf;
            if (zze2 <= i12 - i13) {
                int i14 = zze2 + i13;
                this.zzf = i14;
                return zzyu.zzq(Arrays.copyOfRange(this.zzc, i13, i14));
            }
        }
        if (zze2 <= 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    public final String zzk() {
        int zze2 = zze();
        if (zze2 > 0) {
            int i10 = this.zzd;
            int i11 = this.zzf;
            if (zze2 <= i10 - i11) {
                String str = new String(this.zzc, i11, zze2, zzaac.zza);
                this.zzf += zze2;
                return str;
            }
        }
        if (zze2 == 0) {
            return "";
        }
        if (zze2 < 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    public final String zzl() {
        int zze2 = zze();
        if (zze2 > 0) {
            int i10 = this.zzd;
            int i11 = this.zzf;
            if (zze2 <= i10 - i11) {
                String zzd2 = zzaco.zzd(this.zzc, i11, zze2);
                this.zzf += zze2;
                return zzd2;
            }
        }
        if (zze2 == 0) {
            return "";
        }
        if (zze2 <= 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    public final void zzm(int i10) {
        if (this.zzg != i10) {
            throw zzaae.zzb();
        }
    }

    public final void zzn(int i10) {
        this.zzh = i10;
        zzv();
    }

    public final void zzo(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzd;
            int i12 = this.zzf;
            if (i10 <= i11 - i12) {
                this.zzf = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw zzaae.zzf();
        }
        throw zzaae.zzi();
    }

    public final boolean zzp() {
        return this.zzf == this.zzd;
    }

    public final boolean zzq() {
        return zzh() != 0;
    }

    public final boolean zzr(int i10) {
        int zzf2;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzd - this.zzf >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zzc;
                    int i13 = this.zzf;
                    this.zzf = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzaae.zze();
            }
            while (i12 < 10) {
                if (zza() < 0) {
                    i12++;
                }
            }
            throw zzaae.zze();
            return true;
        } else if (i11 == 1) {
            zzo(8);
            return true;
        } else if (i11 == 2) {
            zzo(zze());
            return true;
        } else if (i11 == 3) {
            do {
                zzf2 = zzf();
                if (zzf2 == 0 || !zzr(zzf2)) {
                    zzm(((i10 >>> 3) << 3) | 4);
                }
                zzf2 = zzf();
                break;
            } while (!zzr(zzf2));
            zzm(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                zzo(4);
                return true;
            }
            throw zzaae.zza();
        }
    }
}
