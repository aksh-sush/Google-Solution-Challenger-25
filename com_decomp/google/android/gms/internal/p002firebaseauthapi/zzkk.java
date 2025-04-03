package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkk  reason: invalid package */
public final class zzkk implements zzam {
    private final zzkm zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzki zzd;

    public zzkk(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, zzki zzki) {
        zzkn.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzkm(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzki;
    }
}
