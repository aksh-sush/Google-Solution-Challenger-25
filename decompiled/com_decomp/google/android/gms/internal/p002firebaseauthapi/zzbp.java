package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbp  reason: invalid package */
public final class zzbp {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzjn zzc;
    @Deprecated
    public static final zzjn zzd;
    @Deprecated
    public static final zzjn zze;

    static {
        new zzbw();
        new zzcf();
        new zzci();
        new zzcc();
        new zzco();
        new zzcs();
        new zzcl();
        new zzcv();
        zzjn zzb2 = zzjn.zzb();
        zzc = zzb2;
        zzd = zzb2;
        zze = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzbn.zzn(new zzbt());
        zzeg.zza();
        zzbn.zzm(new zzbw(), true);
        zzbn.zzm(new zzcf(), true);
        zzbn.zzm(new zzcc(), true);
        zzci.zzj(true);
        zzbn.zzm(new zzcl(), true);
        zzbn.zzm(new zzco(), true);
        zzbn.zzm(new zzcs(), true);
        zzbn.zzm(new zzcv(), true);
    }
}
