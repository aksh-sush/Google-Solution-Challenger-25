package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs  reason: invalid package */
final class zzbs implements zzag {
    private final zzbf<zzag> zza;

    /* synthetic */ zzbs(zzbf zzbf, zzbr zzbr) {
        this.zza = zzbf;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbd zzc : this.zza.zzd(copyOfRange)) {
                try {
                    return ((zzag) zzc.zzc()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e10) {
                    Logger zzd = zzbt.zza;
                    Level level = Level.INFO;
                    String valueOf = String.valueOf(e10.toString());
                    zzd.logp(level, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", valueOf.length() != 0 ? "ciphertext prefix matches a key, but cannot decrypt: ".concat(valueOf) : new String("ciphertext prefix matches a key, but cannot decrypt: "));
                }
            }
        }
        for (zzbd zzc2 : this.zza.zzd(zzaj.zza)) {
            try {
                return ((zzag) zzc2.zzc()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
