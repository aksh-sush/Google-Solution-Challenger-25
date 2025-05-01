package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzmm implements Iterator<String> {
    final Iterator<String> zza;
    final /* synthetic */ zzmn zzb;

    zzmm(zzmn zzmn) {
        this.zzb = zzmn;
        this.zza = zzmn.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
