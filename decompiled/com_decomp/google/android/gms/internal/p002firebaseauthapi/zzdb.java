package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdb  reason: invalid package */
public final class zzdb {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzjn zzb = zzjn.zzb();
    @Deprecated
    public static final zzjn zzc = zzjn.zzb();

    static {
        new zzda();
        try {
            zzbn.zzn(new zzdd());
            zzbn.zzm(new zzda(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
