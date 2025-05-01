package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv  reason: invalid package */
public final class zzhv extends zzzs<zzhw, zzhv> implements zzaba {
    private zzhv() {
        super(zzhw.zzb);
    }

    public final zzhv zza(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzhw) this.zza).zzf = i10;
        return this;
    }

    public final zzhv zzb(zzhz zzhz) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzhw.zzg((zzhw) this.zza, zzhz);
        return this;
    }

    /* synthetic */ zzhv(zzhu zzhu) {
        super(zzhw.zzb);
    }
}
