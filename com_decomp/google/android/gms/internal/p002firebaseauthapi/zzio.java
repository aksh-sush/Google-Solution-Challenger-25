package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzio  reason: invalid package */
public final class zzio extends zzzs<zzir, zzio> implements zzaba {
    private zzio() {
        super(zzir.zzb);
    }

    public final int zza() {
        return ((zzir) this.zza).zza();
    }

    public final zzio zzb(zziq zziq) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzir.zzi((zzir) this.zza, zziq);
        return this;
    }

    public final zzio zzc(int i10) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzir) this.zza).zze = i10;
        return this;
    }

    public final zziq zzd(int i10) {
        return ((zzir) this.zza).zzd(i10);
    }

    public final List<zziq> zze() {
        return Collections.unmodifiableList(((zzir) this.zza).zzg());
    }

    /* synthetic */ zzio(zzin zzin) {
        super(zzir.zzb);
    }
}
