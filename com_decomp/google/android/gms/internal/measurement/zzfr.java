package com.google.android.gms.internal.measurement;

public final class zzfr extends zzjv<zzfs, zzfr> implements zzlh {
    private zzfr() {
        super(zzfs.zza);
    }

    public final int zza() {
        return ((zzfs) this.zza).zzc();
    }

    public final zzfr zzb(Iterable<? extends zzfs> iterable) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzs((zzfs) this.zza, iterable);
        return this;
    }

    public final zzfr zzc(zzfr zzfr) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzr((zzfs) this.zza, (zzfs) zzfr.zzaA());
        return this;
    }

    public final zzfr zzd() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzq((zzfs) this.zza);
        return this;
    }

    public final zzfr zze() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzo((zzfs) this.zza);
        return this;
    }

    public final zzfr zzf() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        ((zzfs) this.zza).zzk = zzjz.zzbA();
        return this;
    }

    public final zzfr zzg() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzm((zzfs) this.zza);
        return this;
    }

    public final zzfr zzh(double d10) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzp((zzfs) this.zza, d10);
        return this;
    }

    public final zzfr zzi(long j10) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzn((zzfs) this.zza, j10);
        return this;
    }

    public final zzfr zzj(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzj((zzfs) this.zza, str);
        return this;
    }

    public final zzfr zzk(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfs.zzk((zzfs) this.zza, str);
        return this;
    }

    /* synthetic */ zzfr(zzff zzff) {
        super(zzfs.zza);
    }
}
