package com.google.common.collect;

import java.util.Comparator;
import l5.d;

public abstract class c0 implements Comparator {
    protected c0() {
    }

    public static c0 a(Comparator comparator) {
        return comparator instanceof c0 ? (c0) comparator : new i(comparator);
    }

    public c0 b(d dVar) {
        return new f(dVar, this);
    }

    public abstract int compare(Object obj, Object obj2);
}
