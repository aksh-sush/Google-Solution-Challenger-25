package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlb  reason: invalid package */
public final class zzlb implements zzek {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzlb(byte[] bArr) {
        zzli.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb2 = zzb();
        zzb2.init(1, secretKeySpec);
        byte[] zzb3 = zzkc.zzb(zzb2.doFinal(new byte[16]));
        this.zzb = zzb3;
        this.zzc = zzkc.zzb(zzb3);
    }

    private static Cipher zzb() {
        return zzkp.zza.zza("AES/ECB/NoPadding");
    }

    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher zzb2 = zzb();
            zzb2.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            byte[] zze = max * 16 == length ? zzkd.zze(bArr, (max - 1) * 16, this.zzb, 0, 16) : zzkd.zzd(zzkc.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = zzb2.doFinal(zzkd.zze(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(zzb2.doFinal(zzkd.zzd(zze, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
