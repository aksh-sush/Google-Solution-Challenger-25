package com.google.protobuf;

import com.google.protobuf.c0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class c extends AbstractList implements c0.i {

    /* renamed from: e  reason: collision with root package name */
    private boolean f8539e = true;

    c() {
    }

    public boolean T() {
        return this.f8539e;
    }

    public boolean add(Object obj) {
        b();
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection collection) {
        b();
        return super.addAll(i10, collection);
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.f8539e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c() {
        this.f8539e = false;
    }

    public void clear() {
        b();
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

    public abstract Object remove(int i10);

    public boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        b();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        b();
        return super.addAll(collection);
    }
}
