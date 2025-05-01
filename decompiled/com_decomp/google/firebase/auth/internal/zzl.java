package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.s;
import com.google.firebase.auth.ActionCodeEmailInfo;

public final class zzl extends ActionCodeEmailInfo {
    private final String zza;

    public zzl(String str, String str2) {
        this.email = s.g(str);
        this.zza = s.g(str2);
    }

    public final String getPreviousEmail() {
        return this.zza;
    }
}
