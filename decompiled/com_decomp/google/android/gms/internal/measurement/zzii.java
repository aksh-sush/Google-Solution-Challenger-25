package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzii<E> extends AbstractList<E> implements zzkg<E> {
    private boolean zza = true;

    zzii() {
    }

    public void add(int i10, E e10) {
        zzbM();
        super.add(i10, e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        zzbM();
        return super.addAll(i10, collection);
    }

    public void clear() {
        zzbM();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public E remove(int i10) {
        zzbM();
        return super.remove(i10);
    }

    public final boolean removeAll(Collection<?> collection) {
        zzbM();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        zzbM();
        return super.retainAll(collection);
    }

    public E set(int i10, E e10) {
        zzbM();
        return super.set(i10, e10);
    }

    public final void zzb() {
        this.zza = false;
    }

    /* access modifiers changed from: protected */
    public final void zzbM() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public boolean add(E e10) {
        zzbM();
        return super.add(e10);
    }

    public boolean addAll(Collection<? extends E> collection) {
        zzbM();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzbM();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
