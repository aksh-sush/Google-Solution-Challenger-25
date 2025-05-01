package com.google.firebase.internal;

import com.google.android.gms.common.internal.q;

public class InternalTokenResult {
    private String zza;

    public InternalTokenResult(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        return q.b(this.zza, ((InternalTokenResult) obj).zza);
    }

    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return q.c(this.zza);
    }

    public String toString() {
        return q.d(this).a("token", this.zza).toString();
    }
}
