package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzke  reason: invalid package */
final class zzke extends zzkf {
    zzke(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    public final int[] zzc(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzkf.zzf(iArr2, this.zza);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
