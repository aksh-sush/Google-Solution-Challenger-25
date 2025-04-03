package com.google.android.gms.internal.measurement;

public final class zzeg extends zzjv<zzeh, zzeg> implements zzlh {
    private zzeg() {
        super(zzeh.zza);
    }

    public final int zza() {
        return ((zzeh) this.zza).zzb();
    }

    public final int zzb() {
        return ((zzeh) this.zza).zzc();
    }

    public final zzeg zzc(int i10, zzei zzei) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzeh.zzj((zzeh) this.zza, i10, (zzej) zzei.zzaA());
        return this;
    }

    public final zzeg zzd(int i10, zzer zzer) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzeh.zzi((zzeh) this.zza, i10, (zzes) zzer.zzaA());
        return this;
    }

    public final zzej zze(int i10) {
        return ((zzeh) this.zza).zze(i10);
    }

    public final zzes zzf(int i10) {
        return ((zzeh) this.zza).zzf(i10);
    }

    /* synthetic */ zzeg(zzef zzef) {
        super(zzeh.zza);
    }
}
