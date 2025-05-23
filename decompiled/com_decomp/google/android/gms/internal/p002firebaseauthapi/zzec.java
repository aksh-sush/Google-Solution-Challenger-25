package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzec  reason: invalid package */
public final class zzec extends zzav<zzen> {
    zzec() {
        super(zzen.class, new zzea(zzbb.class));
    }

    /* access modifiers changed from: private */
    public static void zzl(zzet zzet) {
        if (zzet.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzet.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzm(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzat<zzeq, zzen> zza() {
        return new zzeb(this, zzeq.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzen.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzen zzen = (zzen) zzaaz;
        zzli.zzc(zzen.zza(), 0);
        zzm(zzen.zzf().zzd());
        zzl(zzen.zze());
    }
}
