package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcr  reason: invalid package */
final class zzcr extends zzat<zzji, zzjf> {
    final /* synthetic */ zzcs zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcr(zzcs zzcs, Class cls) {
        super(cls);
        this.zza = zzcs;
    }

    public final /* bridge */ /* synthetic */ zzaaz zza(zzyu zzyu) {
        return zzji.zzd(zzyu, zzzj.zza());
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzaaz zzaaz) {
        zzje zzb = zzjf.zzb();
        zzb.zza((zzji) zzaaz);
        zzb.zzb(0);
        return (zzjf) zzb.zzk();
    }

    public final /* bridge */ /* synthetic */ void zze(zzaaz zzaaz) {
        zzji zzji = (zzji) zzaaz;
        if (zzji.zze().isEmpty() || !zzji.zzf()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
