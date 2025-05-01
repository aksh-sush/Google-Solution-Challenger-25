package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
public final class zzbd<P> {
    private final P zza;
    private final byte[] zzb;
    private final zzig zzc;
    private final zzjk zzd;

    zzbd(P p10, byte[] bArr, zzig zzig, zzjk zzjk, int i10) {
        this.zza = p10;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = zzig;
        this.zzd = zzjk;
    }

    public final zzig zza() {
        return this.zzc;
    }

    public final zzjk zzb() {
        return this.zzd;
    }

    public final P zzc() {
        return this.zza;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
