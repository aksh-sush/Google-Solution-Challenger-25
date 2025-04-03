package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziu  reason: invalid package */
public final class zziu extends zzzs<zziv, zziu> implements zzaba {
    private zziu() {
        super(zziv.zzb);
    }

    public final zziu zza(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zziv) this.zza).zzg = i10;
        return this;
    }

    public final zziu zzb(zzjk zzjk) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zziv) this.zza).zzh = zzjk.zza();
        return this;
    }

    public final zziu zzc(zzig zzig) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zziv) this.zza).zzf = zzig.zza();
        return this;
    }

    public final zziu zzd(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zziv.zzd((zziv) this.zza, str);
        return this;
    }

    /* synthetic */ zziu(zzis zzis) {
        super(zziv.zzb);
    }
}
