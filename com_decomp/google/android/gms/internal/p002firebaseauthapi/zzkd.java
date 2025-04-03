package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkd  reason: invalid package */
public final class zzkd {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean zzb(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null || bArr.length != bArr2.length)) {
            byte b10 = 0;
            for (int i10 = 0; i10 < bArr.length; i10++) {
                b10 |= bArr[i10] ^ bArr2[i10];
            }
            if (b10 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] zzc(byte[]... bArr) {
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int length2 = bArr[i10].length;
            if (i11 <= a.e.API_PRIORITY_OTHER - length2) {
                i11 += length2;
                i10++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr3 : bArr) {
            int length3 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length3);
            i12 += length3;
        }
        return bArr2;
    }

    public static final byte[] zzd(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return zze(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zze(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }
}
