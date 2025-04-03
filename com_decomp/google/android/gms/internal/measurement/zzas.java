package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzas implements Iterator<zzap> {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    zzas(zzat zzat) {
        this.zza = zzat;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zza.length();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zza.length()) {
            String zzb2 = this.zza.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return new zzat(String.valueOf(zzb2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
