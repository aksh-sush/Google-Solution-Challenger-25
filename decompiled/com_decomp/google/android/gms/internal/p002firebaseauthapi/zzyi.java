package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi  reason: invalid package */
final class zzyi {
    static int zza(byte[] bArr, int i10, zzyh zzyh) {
        int zzj = zzj(bArr, i10, zzyh);
        int i11 = zzyh.zza;
        if (i11 < 0) {
            throw zzaae.zzf();
        } else if (i11 > bArr.length - zzj) {
            throw zzaae.zzi();
        } else if (i11 == 0) {
            zzyh.zzc = zzyu.zzb;
            return zzj;
        } else {
            zzyh.zzc = zzyu.zzo(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzb(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(zzabl zzabl, byte[] bArr, int i10, int i11, int i12, zzyh zzyh) {
        zzabc zzabc = (zzabc) zzabl;
        Object zze = zzabc.zze();
        int zzc = zzabc.zzc(zze, bArr, i10, i11, i12, zzyh);
        zzabc.zzf(zze);
        zzyh.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzd(com.google.android.gms.internal.p002firebaseauthapi.zzabl r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.p002firebaseauthapi.zzyh r10) {
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
            r0.zzi(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.firebase-auth-api.zzaae r6 = com.google.android.gms.internal.p002firebaseauthapi.zzaae.zzi()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzyi.zzd(com.google.android.gms.internal.firebase-auth-api.zzabl, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    static int zze(zzabl<?> zzabl, int i10, byte[] bArr, int i11, int i12, zzaab<?> zzaab, zzyh zzyh) {
        int zzd = zzd(zzabl, bArr, i11, i12, zzyh);
        while (true) {
            zzaab.add(zzyh.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzj = zzj(bArr, zzd, zzyh);
            if (i10 != zzyh.zza) {
                break;
            }
            zzd = zzd(zzabl, bArr, zzj, i12, zzyh);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i10, zzaab<?> zzaab, zzyh zzyh) {
        zzzx zzzx = (zzzx) zzaab;
        int zzj = zzj(bArr, i10, zzyh);
        int i11 = zzyh.zza + zzj;
        while (zzj < i11) {
            zzj = zzj(bArr, zzj, zzyh);
            zzzx.zzf(zzyh.zza);
        }
        if (zzj == i11) {
            return zzj;
        }
        throw zzaae.zzi();
    }

    static int zzg(byte[] bArr, int i10, zzyh zzyh) {
        int zzj = zzj(bArr, i10, zzyh);
        int i11 = zzyh.zza;
        if (i11 < 0) {
            throw zzaae.zzf();
        } else if (i11 == 0) {
            zzyh.zzc = "";
            return zzj;
        } else {
            zzyh.zzc = new String(bArr, zzj, i11, zzaac.zza);
            return zzj + i11;
        }
    }

    static int zzh(byte[] bArr, int i10, zzyh zzyh) {
        int zzj = zzj(bArr, i10, zzyh);
        int i11 = zzyh.zza;
        if (i11 < 0) {
            throw zzaae.zzf();
        } else if (i11 == 0) {
            zzyh.zzc = "";
            return zzj;
        } else {
            zzyh.zzc = zzaco.zzd(bArr, zzj, i11);
            return zzj + i11;
        }
    }

    static int zzi(int i10, byte[] bArr, int i11, int i12, zzaca zzaca, zzyh zzyh) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int zzm = zzm(bArr, i11, zzyh);
                zzaca.zzh(i10, Long.valueOf(zzyh.zzb));
                return zzm;
            } else if (i13 == 1) {
                zzaca.zzh(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int zzj = zzj(bArr, i11, zzyh);
                int i14 = zzyh.zza;
                if (i14 < 0) {
                    throw zzaae.zzf();
                } else if (i14 <= bArr.length - zzj) {
                    zzaca.zzh(i10, i14 == 0 ? zzyu.zzb : zzyu.zzo(bArr, zzj, i14));
                    return zzj + i14;
                } else {
                    throw zzaae.zzi();
                }
            } else if (i13 == 3) {
                int i15 = (i10 & -8) | 4;
                zzaca zze = zzaca.zze();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i11, zzyh);
                    int i17 = zzyh.zza;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = zzj2;
                        break;
                    }
                    int zzi = zzi(i16, bArr, zzj2, i12, zze, zzyh);
                    i16 = i17;
                    i11 = zzi;
                }
                if (i11 > i12 || i16 != i15) {
                    throw zzaae.zzg();
                }
                zzaca.zzh(i10, zze);
                return i11;
            } else if (i13 == 5) {
                zzaca.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
                return i11 + 4;
            } else {
                throw zzaae.zzc();
            }
        } else {
            throw zzaae.zzc();
        }
    }

    static int zzj(byte[] bArr, int i10, zzyh zzyh) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzk(b10, bArr, i11, zzyh);
        }
        zzyh.zza = b10;
        return i11;
    }

    static int zzk(int i10, byte[] bArr, int i11, zzyh zzyh) {
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
                                zzyh.zza = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            zzyh.zza = i16 | i12;
            return i17;
        }
        zzyh.zza = i14 | i13;
        return i15;
    }

    static int zzl(int i10, byte[] bArr, int i11, int i12, zzaab<?> zzaab, zzyh zzyh) {
        zzzx zzzx = (zzzx) zzaab;
        int zzj = zzj(bArr, i11, zzyh);
        while (true) {
            zzzx.zzf(zzyh.zza);
            if (zzj >= i12) {
                break;
            }
            int zzj2 = zzj(bArr, zzj, zzyh);
            if (i10 != zzyh.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzyh);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i10, zzyh zzyh) {
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
            zzyh.zzb = j11;
            return i12;
        }
        zzyh.zzb = j10;
        return i11;
    }

    static long zzn(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
