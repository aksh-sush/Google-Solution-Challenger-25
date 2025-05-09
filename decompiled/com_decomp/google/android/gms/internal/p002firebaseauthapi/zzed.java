package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed  reason: invalid package */
final class zzed extends zzau<zzbb, zzht> {
    zzed(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zzb(Object obj) {
        zzht zzht = (zzht) obj;
        zzhq zzb = zzht.zzf().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzht.zzg().zzs(), "HMAC");
        int zza = zzht.zzf().zza();
        zzhq zzhq = zzhq.UNKNOWN_HASH;
        int ordinal = zzb.ordinal();
        if (ordinal == 1) {
            return new zzle(new zzld("HMACSHA1", secretKeySpec), zza);
        }
        if (ordinal == 2) {
            return new zzle(new zzld("HMACSHA384", secretKeySpec), zza);
        }
        if (ordinal == 3) {
            return new zzle(new zzld("HMACSHA256", secretKeySpec), zza);
        }
        if (ordinal == 4) {
            return new zzle(new zzld("HMACSHA512", secretKeySpec), zza);
        }
        if (ordinal == 5) {
            return new zzle(new zzld("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
