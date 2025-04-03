package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zzio extends zzir {
    final /* synthetic */ zziy zza;
    private int zzb = 0;
    private final int zzc;

    zzio(zziy zziy) {
        this.zza = zziy;
        this.zzc = zziy.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
