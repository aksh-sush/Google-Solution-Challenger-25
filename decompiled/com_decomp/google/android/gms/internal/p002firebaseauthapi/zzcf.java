package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcf  reason: invalid package */
public final class zzcf extends zzav<zzfu> {
    zzcf() {
        super(zzfu.class, new zzcd(zzag.class));
    }

    static /* synthetic */ zzas zzj(int i10, int i11) {
        zzfw zzb = zzfx.zzb();
        zzb.zza(i10);
        return new zzas((zzfx) zzb.zzk(), i11);
    }

    public final zzat<zzfx, zzfu> zza() {
        return new zzce(this, zzfx.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzfu.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzfu zzfu = (zzfu) zzaaz;
        zzli.zzc(zzfu.zza(), 0);
        zzli.zzb(zzfu.zze().zzd());
    }
}
