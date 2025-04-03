package com.google.android.gms.internal.measurement;

public final class zzge extends zzjv<zzgf, zzge> implements zzlh {
    private zzge() {
        super(zzgf.zza);
    }

    public final zzge zza(Iterable<? extends Long> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.zzh((zzgf) this.zza, iterable);
        return this;
    }

    public final zzge zzb(int i10) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzgf.zzg((zzgf) this.zza, i10);
        return this;
    }

    /* synthetic */ zzge(zzff zzff) {
        super(zzgf.zza);
    }
}
