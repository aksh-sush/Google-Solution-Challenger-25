package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbw  reason: invalid package */
public final class zzbw extends zzav<zzew> {
    zzbw() {
        super(zzew.class, new zzbu(zzag.class));
    }

    static /* synthetic */ zzas zzj(int i10, int i11, int i12, int i13, zzhq zzhq, int i14) {
        zzfe zzb = zzff.zzb();
        zzfh zzb2 = zzfi.zzb();
        zzb2.zza(16);
        zzb.zzb((zzfi) zzb2.zzk());
        zzb.zza(i10);
        zzhv zzb3 = zzhw.zzb();
        zzhy zzc = zzhz.zzc();
        zzc.zza(zzhq);
        zzc.zzb(i13);
        zzb3.zzb((zzhz) zzc.zzk());
        zzb3.zza(32);
        zzey zza = zzez.zza();
        zza.zza((zzff) zzb.zzk());
        zza.zzb((zzhw) zzb3.zzk());
        return new zzas((zzez) zza.zzk(), i14);
    }

    public final zzat<zzez, zzew> zza() {
        return new zzbv(this, zzez.class);
    }

    public final zzid zzb() {
        return zzid.SYMMETRIC;
    }

    public final /* bridge */ /* synthetic */ zzaaz zzc(zzyu zzyu) {
        return zzew.zzd(zzyu, zzzj.zza());
    }

    public final String zzg() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zzi(zzaaz zzaaz) {
        zzew zzew = (zzew) zzaaz;
        zzli.zzc(zzew.zza(), 0);
        new zzbz();
        zzbz.zzk(zzew.zze());
        new zzef();
        zzef.zzl(zzew.zzf());
    }
}
