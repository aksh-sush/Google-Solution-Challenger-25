package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzib  reason: invalid package */
public final class zzib extends zzzs<zzie, zzib> implements zzaba {
    private zzib() {
        super(zzie.zzb);
    }

    public final zzib zza(zzid zzid) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzie) this.zza).zzg = zzid.zza();
        return this;
    }

    public final zzib zzb(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzie) this.zza).zze = str;
        return this;
    }

    public final zzib zzc(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzie) this.zza).zzf = zzyu;
        return this;
    }

    /* synthetic */ zzib(zzia zzia) {
        super(zzie.zzb);
    }
}
