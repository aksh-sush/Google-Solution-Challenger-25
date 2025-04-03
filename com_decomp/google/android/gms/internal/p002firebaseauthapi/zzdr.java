package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdr  reason: invalid package */
public final class zzdr {
    private final zzag zza;
    private final zzak zzb;

    public zzdr(zzag zzag) {
        this.zza = zzag;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzag zzag = this.zza;
        return zzag != null ? zzag.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }

    public zzdr(zzak zzak) {
        this.zza = null;
        this.zzb = zzak;
    }
}
