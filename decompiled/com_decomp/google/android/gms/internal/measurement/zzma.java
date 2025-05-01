package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzma implements Iterator<Map.Entry> {
    final /* synthetic */ zzme zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator<Map.Entry> zzd;

    /* synthetic */ zzma(zzme zzme, zzlz zzlz) {
        this.zza = zzme;
    }

    private final Iterator<Map.Entry> zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zzb.size()) {
            return !this.zza.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        return (Map.Entry) (i10 < this.zza.zzb.size() ? this.zza.zzb.get(this.zzb) : zza().next());
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            if (this.zzb < this.zza.zzb.size()) {
                zzme zzme = this.zza;
                int i10 = this.zzb;
                this.zzb = i10 - 1;
                Object unused = zzme.zzl(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
