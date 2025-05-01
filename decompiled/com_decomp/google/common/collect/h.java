package com.google.common.collect;

import java.util.Collection;
import l5.j;

public abstract class h {
    static StringBuilder a(int i10) {
        g.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean b(Collection collection, Object obj) {
        j.o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean c(Collection collection, Object obj) {
        j.o(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
