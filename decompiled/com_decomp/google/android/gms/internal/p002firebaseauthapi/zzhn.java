package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhn  reason: invalid package */
public final class zzhn extends zzzs<zzho, zzhn> implements zzaba {
    private zzhn() {
        super(zzho.zzb);
    }

    public final zzhn zza(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzho) this.zza).zze = zzyu;
        return this;
    }

    public final zzhn zzb(zziw zziw) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzho.zzf((zzho) this.zza, zziw);
        return this;
    }

    /* synthetic */ zzhn(zzhm zzhm) {
        super(zzho.zzb);
    }
}
