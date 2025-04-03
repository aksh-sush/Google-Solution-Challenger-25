package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla  reason: invalid package */
final class zzla {
    static byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long zzb = zzb(bArr3, 0, 0);
            int i10 = 2;
            long zzb2 = zzb(bArr3, 3, 2) & 67108611;
            long zzb3 = zzb(bArr3, 6, 4) & 67092735;
            long zzb4 = zzb(bArr3, 9, 6) & 66076671;
            long zzb5 = zzb(bArr3, 12, 8) & 1048575;
            long j10 = zzb2 * 5;
            long j11 = zzb3 * 5;
            long j12 = zzb4 * 5;
            long j13 = zzb5 * 5;
            int i11 = 17;
            byte[] bArr5 = new byte[17];
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            int i12 = 0;
            while (true) {
                int length = bArr4.length;
                if (i12 < length) {
                    int min = Math.min(16, length - i12);
                    System.arraycopy(bArr4, i12, bArr5, 0, min);
                    bArr5[min] = 1;
                    if (min != 16) {
                        Arrays.fill(bArr5, min + 1, i11, (byte) 0);
                    }
                    long zzb6 = j18 + zzb(bArr5, 0, 0);
                    long zzb7 = j15 + zzb(bArr5, 3, i10);
                    long zzb8 = j14 + zzb(bArr5, 6, 4);
                    long zzb9 = j16 + zzb(bArr5, 9, 6);
                    long zzb10 = j17 + (zzb(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                    long j19 = (zzb6 * zzb) + (zzb7 * j13) + (zzb8 * j12) + (zzb9 * j11) + (zzb10 * j10);
                    long j20 = (zzb6 * zzb2) + (zzb7 * zzb) + (zzb8 * j13) + (zzb9 * j12) + (zzb10 * j11) + (j19 >> 26);
                    long j21 = (zzb6 * zzb3) + (zzb7 * zzb2) + (zzb8 * zzb) + (zzb9 * j13) + (zzb10 * j12) + (j20 >> 26);
                    long j22 = (zzb6 * zzb4) + (zzb7 * zzb3) + (zzb8 * zzb2) + (zzb9 * zzb) + (zzb10 * j13) + (j21 >> 26);
                    long j23 = (zzb6 * zzb5) + (zzb7 * zzb4) + (zzb8 * zzb3) + (zzb9 * zzb2) + (zzb10 * zzb) + (j22 >> 26);
                    j17 = j23 & 67108863;
                    long j24 = (j19 & 67108863) + ((j23 >> 26) * 5);
                    j18 = j24 & 67108863;
                    j15 = (j20 & 67108863) + (j24 >> 26);
                    i12 += 16;
                    j16 = j22 & 67108863;
                    j14 = j21 & 67108863;
                    i11 = 17;
                    i10 = 2;
                } else {
                    long j25 = j14 + (j15 >> 26);
                    long j26 = j25 & 67108863;
                    long j27 = j16 + (j25 >> 26);
                    long j28 = j27 & 67108863;
                    long j29 = j17 + (j27 >> 26);
                    long j30 = j29 & 67108863;
                    long j31 = j18 + ((j29 >> 26) * 5);
                    long j32 = j31 & 67108863;
                    long j33 = (j15 & 67108863) + (j31 >> 26);
                    long j34 = j32 + 5;
                    long j35 = (j34 >> 26) + j33;
                    long j36 = j26 + (j35 >> 26);
                    long j37 = j28 + (j36 >> 26);
                    long j38 = (j30 + (j37 >> 26)) - 67108864;
                    long j39 = j38 >> 63;
                    long j40 = ~j39;
                    long j41 = (j33 & j39) | (j35 & 67108863 & j40);
                    long j42 = (j26 & j39) | (j36 & 67108863 & j40);
                    long j43 = (j28 & j39) | (j37 & 67108863 & j40);
                    long zzc = (((j32 & j39) | (j34 & 67108863 & j40) | (j41 << 26)) & 4294967295L) + zzc(bArr3, 16);
                    long zzc2 = (((j41 >> 6) | (j42 << 20)) & 4294967295L) + zzc(bArr3, 20) + (zzc >> 32);
                    long zzc3 = (((j42 >> 12) | (j43 << 14)) & 4294967295L) + zzc(bArr3, 24) + (zzc2 >> 32);
                    long zzc4 = zzc(bArr3, 28);
                    byte[] bArr6 = new byte[16];
                    zzd(bArr6, zzc & 4294967295L, 0);
                    zzd(bArr6, zzc2 & 4294967295L, 4);
                    zzd(bArr6, zzc3 & 4294967295L, 8);
                    zzd(bArr6, ((((((j38 & j40) | (j39 & j30)) << 8) | (j43 >> 18)) & 4294967295L) + zzc4 + (zzc3 >> 32)) & 4294967295L, 12);
                    return bArr6;
                }
            }
        } else {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
    }

    private static long zzb(byte[] bArr, int i10, int i11) {
        return (zzc(bArr, i10) >> i11) & 67108863;
    }

    private static long zzc(byte[] bArr, int i10) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) ((int) (255 & j10));
            i11++;
            j10 >>= 8;
        }
    }
}
