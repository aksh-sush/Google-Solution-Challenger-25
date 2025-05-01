package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import m3.c;

final class zzbu implements h {
    private final Status zza;
    private c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final c getResponse() {
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(c cVar) {
        this.zzb = cVar;
        this.zza = Status.f5268k;
    }
}
