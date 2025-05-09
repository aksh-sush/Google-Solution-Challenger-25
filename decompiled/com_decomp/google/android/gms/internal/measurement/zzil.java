package com.google.android.gms.internal.measurement;

final class zzil {
    static int zza(byte[] bArr, int i10, zzik zzik) {
        int zzj = zzj(bArr, i10, zzik);
        int i11 = zzik.zza;
        if (i11 < 0) {
            throw zzkj.zzd();
        } else if (i11 > bArr.length - zzj) {
            throw zzkj.zzf();
        } else if (i11 == 0) {
            zzik.zzc = zziy.zzb;
            return zzj;
        } else {
            zzik.zzc = zziy.zzl(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzlr zzlr, byte[] bArr, int i10, int i11, int i12, zzik zzik) {
        zzlj zzlj = (zzlj) zzlr;
        Object zze = zzlj.zze();
        int zzc = zzlj.zzc(zze, bArr, i10, i11, i12, zzik);
        zzlj.zzf(zze);
        zzik.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzd(com.google.android.gms.internal.measurement.zzlr r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.zzik r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzh(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzkj r6 = com.google.android.gms.internal.measurement.zzkj.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzil.zzd(com.google.android.gms.internal.measurement.zzlr, byte[], int, int, com.google.android.gms.internal.measurement.zzik):int");
    }

    static int zze(zzlr<?> zzlr, int i10, byte[] bArr, int i11, int i12, zzkg<?> zzkg, zzik zzik) {
        int zzd = zzd(zzlr, bArr, i11, i12, zzik);
        while (true) {
            zzkg.add(zzik.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzik);
            if (i10 != zzik.zza) {
                break;
            }
            zzd = zzd(zzlr, bArr, zzj, i12, zzik);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzkg<?> zzkg, zzik zzik) {
        zzka zzka = (zzka) zzkg;
        int zzj = zzj(bArr, i10, zzik);
        int i11 = zzik.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzik);
            zzka.zzh(zzik.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzkj.zzf();
    }

    static int zzg(byte[] bArr, int i10, zzik zzik) {
        int zzj = zzj(bArr, i10, zzik);
        int i11 = zzik.zza;
        if (i11 < 0) {
            throw zzkj.zzd();
        } else if (i11 == 0) {
            zzik.zzc = "";
            return zzj;
        } else {
            zzik.zzc = new String(bArr, zzj, i11, zzkh.zza);
            return zzj + i11;
        }
    }

    static int zzh(byte[] bArr, int i10, zzik zzik) {
        int zzj = zzj(bArr, i10, zzik);
        int i11 = zzik.zza;
        if (i11 < 0) {
            throw zzkj.zzd();
        } else if (i11 == 0) {
            zzik.zzc = "";
            return zzj;
        } else {
            zzik.zzc = zzmx.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzi(int i10, byte[] bArr, int i11, int i12, zzmj zzmj, zzik zzik) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzik);
                zzmj.zzh(i10, Long.valueOf(zzik.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzmj.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzik);
                int i14 = zzik.zza;
                if (i14 < 0) {
                    throw zzkj.zzd();
                } else if (i14 <= bArr.length - zzj) {
                    zzmj.zzh(i10, i14 == 0 ? zziy.zzb : zziy.zzl(bArr, zzj, i14));
                    return zzj + i14;
                } else {
                    throw zzkj.zzf();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzmj zze = zzmj.zze();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzik);
                    int i17 = zzik.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzj2;
                        break;
                    }
                    int zzi = zzi(i16, bArr, zzj2, i12, zze, zzik);
                    i16 = i17;
                    i11 = zzi;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzkj.zze();
                }
                zzmj.zzh(i10, zze);
                return i11;
            } else if (i13 == 5) {
                zzmj.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzkj.zzb();
            }
        } else {
            throw zzkj.zzb();
        }
    }

    static int zzj(byte[] bArr, int i10, zzik zzik) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzik);
        }
        zzik.zza = b10;
        return i11;
    }

    static int zzk(int i10, byte[] bArr, int i11, zzik zzik) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] < 0) {
                                i17 = i19;
                            } else {
                                zzik.zza = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            zzik.zza = i16 | i12;
            return i17;
        }
        zzik.zza = i14 | i13;
        return i15;
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzkg<?> zzkg, zzik zzik) {
        zzka zzka = (zzka) zzkg;
        int zzj = zzj(bArr, i11, zzik);
        while (true) {
            zzka.zzh(zzik.zza);
            if (zzj >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzik);
            if (i10 != zzik.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzik);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i10, zzik zzik) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 < 0) {
            int i12 = i11 + 1;
            byte b10 = bArr[i11];
            long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
            int i13 = 7;
            while (b10 < 0) {
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                i13 += 7;
                j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
                int i15 = i14;
                b10 = b11;
                i12 = i15;
            }
            zzik.zzb = j11;
            return i12;
        }
        zzik.zzb = j10;
        return i11;
    }

    static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
