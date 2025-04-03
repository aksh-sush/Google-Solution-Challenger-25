package com.google.android.gms.internal.measurement;

final class zzjk {
    private final Object zza;
    private final int zzb;

    zzjk(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjk = (zzjk) obj;
        return this.zza == zzjk.zza && this.zzb == zzjk.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
