package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzda  reason: invalid package */
public final class zzda extends zzav<zzgg> {
    zzda() {
        super(zzgg.class, new zzcy(zzak.class));
    }

    public final zzat<zzgj, zzgg> zza() {
        return new zzcz(this, zzgj.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzgg.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzgg zzgg = (zzgg) zzaaz;
        zzli.zzc(zzgg.zza(), 0);
        if (zzgg.zze().zzd() != 64) {
            int zzd = zzgg.zze().zzd();
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("invalid key size: ");
            sb2.append(zzd);
            sb2.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(sb2.toString());
        }
    }
}
