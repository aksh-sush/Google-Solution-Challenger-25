package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzii  reason: invalid package */
public final class zzii extends zzzs<zzij, zzii> implements zzaba {
    private zzii() {
        super(zzij.zzb);
    }

    public final zzii zza(zzjk zzjk) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzij) this.zza).zzg = zzjk.zza();
        return this;
    }

    public final zzii zzb(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzij.zzg((zzij) this.zza, str);
        return this;
    }

    public final zzii zzc(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzij) this.zza).zzf = zzyu;
        return this;
    }

    /* synthetic */ zzii(zzih zzih) {
        super(zzij.zzb);
    }
}
