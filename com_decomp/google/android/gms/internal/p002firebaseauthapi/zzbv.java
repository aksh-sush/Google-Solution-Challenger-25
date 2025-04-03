package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbv  reason: invalid package */
final class zzbv extends zzat<zzez, zzew> {
    final /* synthetic */ zzbw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbv(zzbw zzbw, Class cls) {
        super(cls);
        this.zza = zzbw;
    }

    public final /* bridge */ /* synthetic */ zzaaz zza(zzyu zzyu) {
        return zzez.zzc(zzyu, zzzj.zza());
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzaaz zzaaz) {
        zzez zzez = (zzez) zzaaz;
        new zzbz();
        zzfc zzg = zzby.zzg(zzez.zzd());
        Object zzc = new zzef().zza().zzc(zzez.zze());
        zzev zzb = zzew.zzb();
        zzb.zza(zzg);
        zzb.zzb((zzht) zzc);
        zzb.zzc(0);
        return (zzew) zzb.zzk();
    }

    public final Map<String, zzas<zzez>> zzd() {
        HashMap hashMap = new HashMap();
        zzhq zzhq = zzhq.SHA256;
        hashMap.put("AES128_CTR_HMAC_SHA256", zzbw.zzj(16, 16, 32, 16, zzhq, 1));
        zzhq zzhq2 = zzhq;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzbw.zzj(16, 16, 32, 16, zzhq2, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzbw.zzj(32, 16, 32, 32, zzhq2, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzbw.zzj(32, 16, 32, 32, zzhq2, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaaz zzaaz) {
        zzez zzez = (zzez) zzaaz;
        ((zzby) new zzbz().zza()).zze(zzez.zzd());
        new zzef().zza().zze(zzez.zze());
        zzli.zzb(zzez.zzd().zza());
    }
}
