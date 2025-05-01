package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.s;

public final class zzbv implements h {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) s.k(status);
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) s.k(str);
        this.zza = Status.f5268k;
    }
}
