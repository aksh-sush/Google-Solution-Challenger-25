package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack  reason: invalid package */
final class zzack {
    static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (zze(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || zze(b12) || zze(b13)) {
            throw zzaae.zzd();
        }
        byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((b14 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((b14 & 1023) + 56320);
    }

    static /* synthetic */ void zzb(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || zze(b11)) {
            throw zzaae.zzd();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* synthetic */ void zzc(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zze(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zze(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                return;
            }
        }
        throw zzaae.zzd();
    }

    static /* synthetic */ boolean zzd(byte b10) {
        return b10 >= 0;
    }

    private static boolean zze(byte b10) {
        return b10 > -65;
    }
}
