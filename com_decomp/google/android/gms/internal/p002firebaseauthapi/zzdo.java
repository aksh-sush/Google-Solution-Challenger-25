package com.google.android.gms.internal.p002firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdo  reason: invalid package */
public final class zzdo {
    public static final zzij zza;
    public static final zzij zzb;
    public static final zzij zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zzhl zzhl = zzhl.NIST_P256;
        zzhq zzhq = zzhq.SHA256;
        zzgr zzgr = zzgr.UNCOMPRESSED;
        zzij zzij = zzbq.zza;
        zzjk zzjk = zzjk.TINK;
        zzhq zzhq2 = zzhq;
        zzij zzij2 = zzij;
        byte[] bArr2 = bArr;
        zza = zza(zzhl, zzhq2, zzgr, zzij2, zzjk, bArr2);
        zzb = zza(zzhl, zzhq2, zzgr.COMPRESSED, zzij2, zzjk.RAW, bArr2);
        zzc = zza(zzhl, zzhq2, zzgr, zzbq.zze, zzjk, bArr2);
    }

    public static zzij zza(zzhl zzhl, zzhq zzhq, zzgr zzgr, zzij zzij, zzjk zzjk, byte[] bArr) {
        zzgw zza2 = zzgx.zza();
        zzhi zza3 = zzhj.zza();
        zza3.zza(zzhl);
        zza3.zzb(zzhq);
        zza3.zzc(zzyu.zzn(bArr));
        zzgt zza4 = zzgu.zza();
        zza4.zza(zzij);
        zzgz zzc2 = zzha.zzc();
        zzc2.zzc((zzhj) zza3.zzk());
        zzc2.zza((zzgu) zza4.zzk());
        zzc2.zzb(zzgr);
        zza2.zza((zzha) zzc2.zzk());
        zzii zza5 = zzij.zza();
        new zzdg();
        zza5.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza5.zza(zzjk);
        zza5.zzc(((zzgx) zza2.zzk()).zzo());
        return (zzij) zza5.zzk();
    }
}
