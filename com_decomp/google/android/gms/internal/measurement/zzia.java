package com.google.android.gms.internal.measurement;

final class zzia<T> extends zzhz<T> {
    private final T zza;

    zzia(T t10) {
        this.zza = t10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzia) {
            return this.zza.equals(((zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
