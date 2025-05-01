package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzau  reason: invalid package */
public abstract class zzau<PrimitiveT, KeyT> {
    private final Class<PrimitiveT> zza;

    public zzau(Class<PrimitiveT> cls) {
        this.zza = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zzb(KeyT keyt);
}
