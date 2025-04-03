package com.google.android.gms.internal.measurement;

import android.content.Context;

final class zzgx extends zzhs {
    private final Context zza;
    private final zzib<zzhz<zzhi>> zzb;

    zzgx(Context context, zzib<zzhz<zzhi>> zzib) {
        if (context != null) {
            this.zza = context;
            this.zzb = zzib;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhs) {
            zzhs zzhs = (zzhs) obj;
            if (this.zza.equals(zzhs.zza())) {
                zzib<zzhz<zzhi>> zzib = this.zzb;
                zzib<zzhz<zzhi>> zzb2 = zzhs.zzb();
                if (zzib != null ? zzib.equals(zzb2) : zzb2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        zzib<zzhz<zzhi>> zzib = this.zzb;
        return hashCode ^ (zzib == null ? 0 : zzib.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb2.append("FlagsContext{context=");
        sb2.append(valueOf);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(valueOf2);
        sb2.append("}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzib<zzhz<zzhi>> zzb() {
        return this.zzb;
    }
}
