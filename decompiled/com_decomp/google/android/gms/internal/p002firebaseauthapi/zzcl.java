package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl  reason: invalid package */
public final class zzcl extends zzav<zzgm> {
    zzcl() {
        super(zzgm.class, new zzcj(zzag.class));
    }

    public final zzat<zzgp, zzgm> zza() {
        return new zzck(this, zzgp.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzgm.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzgm zzgm = (zzgm) zzaaz;
        zzli.zzc(zzgm.zza(), 0);
        if (zzgm.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
