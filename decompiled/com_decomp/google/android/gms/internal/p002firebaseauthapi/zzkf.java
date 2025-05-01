package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf  reason: invalid package */
abstract class zzkf implements zzkz {
    private static final int[] zzb = zzi(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] zza;
    private final int zzc;

    zzkf(byte[] bArr, int i10) {
        if (bArr.length == 32) {
            this.zza = zzi(bArr);
            this.zzc = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    static void zze(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        int i16 = (i15 >>> -16) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        int i19 = (i18 >>> -12) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        int i22 = (i21 >>> -8) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = (i24 >>> -7) | (i24 << 7);
    }

    static void zzf(int[] iArr, int[] iArr2) {
        int[] iArr3 = zzb;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void zzg(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i10 = 0; i10 < 10; i10++) {
            zze(iArr2, 0, 4, 8, 12);
            zze(iArr2, 1, 5, 9, 13);
            zze(iArr2, 2, 6, 10, 14);
            zze(iArr2, 3, 7, 11, 15);
            zze(iArr2, 0, 5, 10, 15);
            zze(iArr2, 1, 6, 11, 12);
            zze(iArr2, 2, 7, 8, 13);
            zze(iArr2, 3, 4, 9, 14);
        }
    }

    static int[] zzi(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public final byte[] zza(byte[] bArr) {
        return zzh(ByteBuffer.wrap(bArr));
    }

    /* access modifiers changed from: package-private */
    public abstract int zzb();

    /* access modifiers changed from: package-private */
    public abstract int[] zzc(int[] iArr, int i10);

    /* access modifiers changed from: package-private */
    public final ByteBuffer zzd(byte[] bArr, int i10) {
        int[] zzc2 = zzc(zzi(bArr), i10);
        int[] iArr = (int[]) zzc2.clone();
        zzg(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzc2[i11] = zzc2[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzc2, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzh(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= zzb()) {
            byte[] bArr = new byte[zzb()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            int remaining = byteBuffer.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer zzd = zzd(bArr, this.zzc + i11);
                if (i11 == i10 - 1) {
                    zzkd.zza(allocate, byteBuffer, zzd, remaining % 64);
                } else {
                    zzkd.zza(allocate, byteBuffer, zzd, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
