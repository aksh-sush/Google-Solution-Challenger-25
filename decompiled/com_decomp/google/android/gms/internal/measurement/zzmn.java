package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzmn extends AbstractList<String> implements RandomAccess, zzko {
    /* access modifiers changed from: private */
    public final zzko zza;

    public zzmn(zzko zzko) {
        this.zza = zzko;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzkn) this.zza).get(i10);
    }

    public final Iterator<String> iterator() {
        return new zzmm(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new zzml(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzko zze() {
        return this;
    }

    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    public final List<?> zzh() {
        return this.zza.zzh();
    }

    public final void zzi(zziy zziy) {
        throw new UnsupportedOperationException();
    }
}
