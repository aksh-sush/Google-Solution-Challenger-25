package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import l5.j;

final class i extends c0 implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    final Comparator f7580e;

    i(Comparator comparator) {
        this.f7580e = (Comparator) j.o(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return this.f7580e.compare(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f7580e.equals(((i) obj).f7580e);
        }
        return false;
    }

    public int hashCode() {
        return this.f7580e.hashCode();
    }

    public String toString() {
        return this.f7580e.toString();
    }
}
