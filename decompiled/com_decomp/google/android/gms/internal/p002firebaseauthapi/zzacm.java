package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacm  reason: invalid package */
final class zzacm extends zzacl {
    zzacm() {
    }

    /* access modifiers changed from: package-private */
    public final int zza(int i10, byte[] bArr, int i11, int i12) {
        while (r9 < i12 && bArr[r9] >= 0) {
            i11 = r9 + 1;
        }
        if (r9 >= i12) {
            return 0;
        }
        while (r9 < i12) {
            int i13 = r9 + 1;
            byte b10 = bArr[r9];
            if (b10 < 0) {
                if (b10 >= -32) {
                    if (b10 < -16) {
                        if (i13 < i12 - 1) {
                            int i14 = i13 + 1;
                            byte b11 = bArr[i13];
                            if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                r9 = i14 + 1;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                    } else if (i13 < i12 - 2) {
                        int i15 = i13 + 1;
                        byte b12 = bArr[i13];
                        if (b12 <= -65 && (((b10 << 28) + (b12 + 112)) >> 30) == 0) {
                            int i16 = i15 + 1;
                            if (bArr[i15] <= -65) {
                                i13 = i16 + 1;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                    }
                    return zzaco.zza(bArr, i13, i12);
                } else if (i13 >= i12) {
                    return b10;
                } else {
                    if (b10 >= -62) {
                        r9 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                }
                return -1;
            }
            r9 = i13;
        }
        return 0;
    }
}
