package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcv  reason: invalid package */
public final class zzcv extends zzav<zzjq> {
    zzcv() {
        super(zzjq.class, new zzct(zzag.class));
    }

    public final zzat<zzjt, zzjq> zza() {
        return new zzcu(this, zzjt.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzjq.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzjq zzjq = (zzjq) zzaaz;
        zzli.zzc(zzjq.zza(), 0);
        if (zzjq.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
