package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzde  reason: invalid package */
final class zzde extends zzau<zzal, zzhd> {
    zzde(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zzb(Object obj) {
        zzhd zzhd = (zzhd) obj;
        zzha zzb = zzhd.zze().zzb();
        zzhj zzf = zzb.zzf();
        int zzc = zzdp.zzc(zzf.zzd());
        byte[] zzs = zzhd.zzf().zzs();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, zzs), zzkn.zzf(zzc));
        return new zzkj((ECPrivateKey) zzkp.zzg.zza("EC").generatePrivate(eCPrivateKeySpec), zzf.zzf().zzs(), zzdp.zza(zzf.zze()), zzdp.zzd(zzb.zza()), new zzdq(zzb.zzb().zzd()));
    }
}
