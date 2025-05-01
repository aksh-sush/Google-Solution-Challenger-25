package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuf  reason: invalid package */
public final class zzuf extends zzpv {
    private final String zzb;

    /* synthetic */ zzuf(String str, zzud zzud) {
        this.zzb = s.h(str, "A valid API key must be provided");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzuf)) {
            return false;
        }
        zzuf zzuf = (zzuf) obj;
        return q.b(this.zzb, zzuf.zzb) && this.zza == zzuf.zza;
    }

    public final int hashCode() {
        return q.c(this.zzb) + (true ^ this.zza ? 1 : 0);
    }

    /* renamed from: zzb */
    public final zzuf zza() {
        return new zzuf(s.g(this.zzb), (zzud) null);
    }

    public final String zzc() {
        return this.zzb;
    }
}
