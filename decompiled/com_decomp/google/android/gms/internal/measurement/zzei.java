package com.google.android.gms.internal.measurement;

public final class zzei extends zzjv<zzej, zzei> implements zzlh {
    private zzei() {
        super(zzej.zza);
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzej.zzi((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i10, zzel zzel) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzej.zzj((zzej) this.zza, i10, zzel);
        return this;
    }

    public final zzel zzd(int i10) {
        return ((zzej) this.zza).zze(i10);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }

    /* synthetic */ zzei(zzef zzef) {
        super(zzej.zza);
    }
}
