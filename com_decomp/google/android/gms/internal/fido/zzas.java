package com.google.android.gms.internal.fido;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

final class zzas extends zzat {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzat zzc;

    zzas(zzat zzat, int i10, int i11) {
        this.zzc = zzat;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzam.zza(i10, this.zzb, FirebaseAnalytics.Param.INDEX);
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzat zzf(int i10, int i11) {
        zzam.zze(i10, i11, this.zzb);
        zzat zzat = this.zzc;
        int i12 = this.zza;
        return zzat.subList(i10 + i12, i11 + i12);
    }
}
