package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdf  reason: invalid package */
final class zzdf extends zzat<zzgx, zzhd> {
    final /* synthetic */ zzdg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdf(zzdg zzdg, Class cls) {
        super(cls);
        this.zza = zzdg;
    }

    public final /* bridge */ /* synthetic */ zzaaz zza(zzyu zzyu) {
        return zzgx.zzc(zzyu, zzzj.zza());
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzaaz zzaaz) {
        zzgx zzgx = (zzgx) zzaaz;
        ECParameterSpec zzf = zzkn.zzf(zzdp.zzc(zzgx.zzd().zzf().zzd()));
        KeyPairGenerator zza2 = zzkp.zzf.zza("EC");
        zza2.initialize(zzf);
        KeyPair generateKeyPair = zza2.generateKeyPair();
        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        zzhf zzc = zzhg.zzc();
        zzc.zzb(0);
        zzc.zza(zzgx.zzd());
        zzc.zzc(zzyu.zzn(w10.getAffineX().toByteArray()));
        zzc.zzd(zzyu.zzn(w10.getAffineY().toByteArray()));
        zzhc zzb = zzhd.zzb();
        zzb.zzc(0);
        zzb.zzb((zzhg) zzc.zzk());
        zzb.zza(zzyu.zzn(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray()));
        return (zzhd) zzb.zzk();
    }

    public final Map<String, zzas<zzgx>> zzd() {
        HashMap hashMap = new HashMap();
        zzhl zzhl = zzhl.NIST_P256;
        zzhq zzhq = zzhq.SHA256;
        zzgr zzgr = zzgr.UNCOMPRESSED;
        zzgr zzgr2 = zzgr;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzdg.zzk(zzhl, zzhq, zzgr2, zzar.zza("AES128_GCM"), zzdg.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzdg.zzk(zzhl, zzhq, zzgr2, zzar.zza("AES128_GCM"), zzdg.zza, 3));
        zzgr zzgr3 = zzgr.COMPRESSED;
        zzgr zzgr4 = zzgr3;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzdg.zzk(zzhl, zzhq, zzgr4, zzar.zza("AES128_GCM"), zzdg.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzdg.zzk(zzhl, zzhq, zzgr4, zzar.zza("AES128_GCM"), zzdg.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzdg.zzk(zzhl, zzhq, zzgr4, zzar.zza("AES128_GCM"), zzdg.zza, 3));
        zzgr zzgr5 = zzgr;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzdg.zzk(zzhl, zzhq, zzgr5, zzar.zza("AES128_CTR_HMAC_SHA256"), zzdg.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzdg.zzk(zzhl, zzhq, zzgr5, zzar.zza("AES128_CTR_HMAC_SHA256"), zzdg.zza, 3));
        zzgr zzgr6 = zzgr3;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzdg.zzk(zzhl, zzhq, zzgr6, zzar.zza("AES128_CTR_HMAC_SHA256"), zzdg.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzdg.zzk(zzhl, zzhq, zzgr6, zzar.zza("AES128_CTR_HMAC_SHA256"), zzdg.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaaz zzaaz) {
        zzdp.zzb(((zzgx) zzaaz).zzd());
    }
}
