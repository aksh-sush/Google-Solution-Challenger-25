package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzce  reason: invalid package */
final class zzce extends zzat<zzfx, zzfu> {
    final /* synthetic */ zzcf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzce(zzcf zzcf, Class cls) {
        super(cls);
        this.zza = zzcf;
    }

    public final /* bridge */ /* synthetic */ zzaaz zza(zzyu zzyu) {
        return zzfx.zzd(zzyu, zzzj.zza());
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzaaz zzaaz) {
        zzft zzb = zzfu.zzb();
        zzb.zza(zzyu.zzn(zzlg.zza(((zzfx) zzaaz).zza())));
        zzb.zzb(0);
        return (zzfu) zzb.zzk();
    }

    public final Map<String, zzas<zzfx>> zzd() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzcf.zzj(16, 1));
        hashMap.put("AES128_GCM_RAW", zzcf.zzj(16, 3));
        hashMap.put("AES256_GCM", zzcf.zzj(32, 1));
        hashMap.put("AES256_GCM_RAW", zzcf.zzj(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaaz zzaaz) {
        zzli.zzb(((zzfx) zzaaz).zza());
    }
}
