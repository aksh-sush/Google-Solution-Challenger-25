package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhc  reason: invalid package */
public final class zzhc extends zzzs<zzhd, zzhc> implements zzaba {
    private zzhc() {
        super(zzhd.zzb);
    }

    public final zzhc zza(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzhd) this.zza).zzg = zzyu;
        return this;
    }

    public final zzhc zzb(zzhg zzhg) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzhd.zzh((zzhd) this.zza, zzhg);
        return this;
    }

    public final zzhc zzc(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzhd) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzhc(zzhb zzhb) {
        super(zzhd.zzb);
    }
}
