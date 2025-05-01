package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzle  reason: invalid package */
public final class zzle implements zzbb {
    private final zzek zza;
    private final int zzb;

    public zzle(zzek zzek, int i10) {
        this.zza = zzek;
        this.zzb = i10;
        if (i10 >= 10) {
            zzek.zza(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void zza(byte[] bArr, byte[] bArr2) {
        if (!zzkd.zzb(this.zza.zza(bArr2, this.zzb), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
