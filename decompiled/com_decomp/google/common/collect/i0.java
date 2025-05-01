package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l5.j;

public abstract class i0 {

    static abstract class a extends AbstractSet {
        a() {
        }

        public boolean removeAll(Collection collection) {
            return i0.d(this, collection);
        }

        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) j.o(collection));
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static HashSet c(int i10) {
        return new HashSet(z.a(i10));
    }

    static boolean d(Set set, Collection collection) {
        j.o(collection);
        if (collection instanceof a0) {
            collection = ((a0) collection).g();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? e(set, collection.iterator()) : w.e(set.iterator(), collection);
    }

    static boolean e(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
