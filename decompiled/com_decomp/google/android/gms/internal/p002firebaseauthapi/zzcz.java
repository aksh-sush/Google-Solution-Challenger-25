package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcz  reason: invalid package */
final class zzcz extends zzat<zzgj, zzgg> {
    final /* synthetic */ zzda zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcz(zzda zzda, Class cls) {
        super(cls);
        this.zza = zzda;
    }

    public final /* bridge */ /* synthetic */ zzaaz zza(zzyu zzyu) {
        return zzgj.zzd(zzyu, zzzj.zza());
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzaaz zzaaz) {
        zzgf zzb = zzgg.zzb();
        zzb.zza(zzyu.zzn(zzlg.zza(((zzgj) zzaaz).zza())));
        zzb.zzb(0);
        return (zzgg) zzb.zzk();
    }

    public final Map<String, zzas<zzgj>> zzd() {
        HashMap hashMap = new HashMap();
        zzgi zzb = zzgj.zzb();
        zzb.zza(64);
        hashMap.put("AES256_SIV", new zzas((zzgj) zzb.zzk(), 1));
        zzgi zzb2 = zzgj.zzb();
        zzb2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzas((zzgj) zzb2.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaaz zzaaz) {
        zzgj zzgj = (zzgj) zzaaz;
        if (zzgj.zza() != 64) {
            int zza2 = zzgj.zza();
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("invalid key size: ");
            sb2.append(zza2);
            sb2.append(". Valid keys must have 64 bytes.");
            throw new InvalidAlgorithmParameterException(sb2.toString());
        }
    }
}
