package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfb extends zzjv<zzfc, zzfb> implements zzlh {
    private zzfb() {
        super(zzfc.zza);
    }

    public final int zza() {
        return ((zzfc) this.zza).zzb();
    }

    public final zzfa zzb(int i10) {
        return ((zzfc) this.zza).zzd(i10);
    }

    public final zzfb zzc() {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        ((zzfc) this.zza).zzk = zzjz.zzbA();
        return this;
    }

    public final zzfb zzd(int i10, zzez zzez) {
        if (this.zzb) {
            zzaE();
            this.zzb = false;
        }
        zzfc.zzm((zzfc) this.zza, i10, (zzfa) zzez.zzaA());
        return this;
    }

    public final List<zzeh> zze() {
        return Collections.unmodifiableList(((zzfc) this.zza).zzi());
    }

    /* synthetic */ zzfb(zzey zzey) {
        super(zzfc.zza);
    }
}
