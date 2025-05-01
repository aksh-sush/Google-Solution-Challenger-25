package com.google.android.gms.internal.measurement;

public final class zzfp extends zzjv<zzfq, zzfp> implements zzlh {
    private zzfp() {
        super(zzfq.zza);
    }

    public final zzfp zza(long j10) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfq.zzd((zzfq) this.zza, j10);
        return this;
    }

    public final zzfp zzb(String str) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfq.zzc((zzfq) this.zza, str);
        return this;
    }

    /* synthetic */ zzfp(zzff zzff) {
        super(zzfq.zza);
    }
}
