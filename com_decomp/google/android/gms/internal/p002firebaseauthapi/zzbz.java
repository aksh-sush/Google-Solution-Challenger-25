package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbz  reason: invalid package */
public final class zzbz extends zzav<zzfc> {
    zzbz() {
        super(zzfc.class, new zzbx(zzkz.class));
    }

    public static final void zzk(zzfc zzfc) {
        zzli.zzc(zzfc.zza(), 0);
        zzli.zzb(zzfc.zzg().zzd());
        zzl(zzfc.zzf());
    }

    /* access modifiers changed from: private */
    public static final void zzl(zzfi zzfi) {
        if (zzfi.zza() < 12 || zzfi.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzat<zzff, zzfc> zza() {
        return new zzby(this, zzff.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzfc.zze(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzk((zzfc) zzaaz);
    }
}
