package com.google.android.gms.internal.p002firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbq  reason: invalid package */
public final class zzbq {
    public static final zzij zza = zzc(16);
    public static final zzij zzb = zzc(32);
    public static final zzij zzc = zzb(16, 16);
    public static final zzij zzd = zzb(32, 16);
    public static final zzij zze;
    public static final zzij zzf;
    public static final zzij zzg;
    public static final zzij zzh;

    static {
        zzhq zzhq = zzhq.SHA256;
        zze = zza(16, 16, 32, 16, zzhq);
        zzf = zza(32, 16, 32, 32, zzhq);
        zzii zza2 = zzij.zza();
        new zzcl();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzjk zzjk = zzjk.TINK;
        zza2.zza(zzjk);
        zzg = (zzij) zza2.zzk();
        zzii zza3 = zzij.zza();
        new zzcv();
        zza3.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza3.zza(zzjk);
        zzh = (zzij) zza3.zzk();
    }

    public static zzij zza(int i10, int i11, int i12, int i13, zzhq zzhq) {
        zzfe zzb2 = zzff.zzb();
        zzfh zzb3 = zzfi.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzfi) zzb3.zzk());
        zzb2.zza(i10);
        zzhv zzb4 = zzhw.zzb();
        zzhy zzc2 = zzhz.zzc();
        zzc2.zza(zzhq);
        zzc2.zzb(i13);
        zzb4.zzb((zzhz) zzc2.zzk());
        zzb4.zza(32);
        zzey zza2 = zzez.zza();
        zza2.zza((zzff) zzb2.zzk());
        zza2.zzb((zzhw) zzb4.zzk());
        zzii zza3 = zzij.zza();
        zza3.zzc(((zzez) zza2.zzk()).zzo());
        new zzbw();
        zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza3.zza(zzjk.TINK);
        return (zzij) zza3.zzk();
    }

    public static zzij zzb(int i10, int i11) {
        zzfn zzb2 = zzfo.zzb();
        zzb2.zza(i10);
        zzfq zzb3 = zzfr.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzfr) zzb3.zzk());
        zzii zza2 = zzij.zza();
        zza2.zzc(((zzfo) zzb2.zzk()).zzo());
        new zzcc();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza2.zza(zzjk.TINK);
        return (zzij) zza2.zzk();
    }

    public static zzij zzc(int i10) {
        zzfw zzb2 = zzfx.zzb();
        zzb2.zza(i10);
        zzii zza2 = zzij.zza();
        zza2.zzc(((zzfx) zzb2.zzk()).zzo());
        new zzcf();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza2.zza(zzjk.TINK);
        return (zzij) zza2.zzk();
    }
}
