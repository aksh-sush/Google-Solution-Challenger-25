package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzka  reason: invalid package */
public final class zzka implements zzag {
    private static final ThreadLocal<Cipher> zza = new zzjz();
    private final SecretKey zzb;

    public zzka(byte[] bArr) {
        zzli.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec gCMParameterSpec = (!zzlh.zzb() || zzlh.zza() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
            ThreadLocal<Cipher> threadLocal = zza;
            threadLocal.get().init(2, this.zzb, gCMParameterSpec);
            if (bArr2.length != 0) {
                threadLocal.get().updateAAD(bArr2);
            }
            return threadLocal.get().doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
