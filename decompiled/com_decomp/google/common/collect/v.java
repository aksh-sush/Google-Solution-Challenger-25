package com.google.common.collect;

import java.util.Collection;

public abstract class v {
    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x.g(iterable.iterator());
    }

    public static Object b(Iterable iterable) {
        return w.d(iterable.iterator());
    }

    static Object[] c(Iterable iterable) {
        return a(iterable).toArray();
    }
}
