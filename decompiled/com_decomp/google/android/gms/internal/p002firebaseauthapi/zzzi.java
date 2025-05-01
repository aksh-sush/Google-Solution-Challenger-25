package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzi  reason: invalid package */
final class zzzi {
    private final Object zza;
    private final int zzb;

    zzzi(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzi)) {
            return false;
        }
        zzzi zzzi = (zzzi) obj;
        return this.zza == zzzi.zza && this.zzb == zzzi.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
