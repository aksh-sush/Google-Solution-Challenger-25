package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkb  reason: invalid package */
public final class zzkb implements zzak {
    private static final Collection<Integer> zza = Arrays.asList(new Integer[]{64});
    private static final byte[] zzb = new byte[16];
    private final zzlb zzc;
    private final byte[] zzd;

    public zzkb(byte[] bArr) {
        Collection<Integer> collection = zza;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i10 = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.zzd = Arrays.copyOfRange(bArr, i10, length);
            this.zzc = new zzlb(copyOfRange);
            return;
        }
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("invalid key size: ");
        sb2.append(length);
        sb2.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb2.toString());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher zza2 = zzkp.zza.zza("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            zza2.init(2, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = zza2.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && zzlh.zzb()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] zza3 = this.zzc.zza(zzb, 16);
            for (char c10 = 0; c10 <= 0; c10 = 1) {
                byte[] bArr6 = bArr5[0];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                zza3 = zzkd.zzd(zzkc.zzb(zza3), this.zzc.zza(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = zza3.length;
                if (length2 >= length3) {
                    int i10 = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i11 = 0; i11 < zza3.length; i11++) {
                        int i12 = i10 + i11;
                        bArr3[i12] = (byte) (bArr3[i12] ^ zza3[i11]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = zzkd.zzd(zzkc.zza(bArr7), zzkc.zzb(zza3));
            }
            if (zzkd.zzb(copyOfRange, this.zzc.zza(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
