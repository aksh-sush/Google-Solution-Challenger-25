package com.google.common.collect;

import com.google.common.collect.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import l5.j;

public abstract class n extends l implements List, RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private static final q0 f7616f = new b(e0.f7551i, 0);

    public static final class a extends l.a {
        public a() {
            this(4);
        }

        /* renamed from: f */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a g(Iterator it) {
            super.b(it);
            return this;
        }

        public n h() {
            this.f7608c = true;
            return n.l(this.f7606a, this.f7607b);
        }

        a(int i10) {
            super(i10);
        }
    }

    static class b extends a {

        /* renamed from: g  reason: collision with root package name */
        private final n f7617g;

        b(n nVar, int i10) {
            super(nVar.size(), i10);
            this.f7617g = nVar;
        }

        /* access modifiers changed from: protected */
        public Object b(int i10) {
            return this.f7617g.get(i10);
        }
    }

    static class c implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final Object[] f7618e;

        c(Object[] objArr) {
            this.f7618e = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return n.r(this.f7618e);
        }
    }

    class d extends n {

        /* renamed from: g  reason: collision with root package name */
        final transient int f7619g;

        /* renamed from: h  reason: collision with root package name */
        final transient int f7620h;

        d(int i10, int i11) {
            this.f7619g = i10;
            this.f7620h = i11;
        }

        /* access modifiers changed from: package-private */
        public Object[] e() {
            return n.this.e();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return n.this.h() + this.f7619g + this.f7620h;
        }

        public Object get(int i10) {
            j.m(i10, this.f7620h);
            return n.this.get(i10 + this.f7619g);
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return n.this.h() + this.f7619g;
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return n.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return n.super.listIterator();
        }

        public int size() {
            return this.f7620h;
        }

        /* renamed from: x */
        public n subList(int i10, int i11) {
            j.t(i10, i11, this.f7620h);
            n nVar = n.this;
            int i12 = this.f7619g;
            return nVar.subList(i10 + i12, i11 + i12);
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return n.super.listIterator(i10);
        }
    }

    n() {
    }

    static n k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    static n l(Object[] objArr, int i10) {
        return i10 == 0 ? u() : new e0(objArr, i10);
    }

    private static n m(Object... objArr) {
        return k(b0.b(objArr));
    }

    public static n o(Iterable iterable) {
        j.o(iterable);
        return iterable instanceof Collection ? p((Collection) iterable) : q(iterable.iterator());
    }

    public static n p(Collection collection) {
        if (!(collection instanceof l)) {
            return m(collection.toArray());
        }
        n b10 = ((l) collection).b();
        return b10.i() ? k(b10.toArray()) : b10;
    }

    public static n q(Iterator it) {
        if (!it.hasNext()) {
            return u();
        }
        Object next = it.next();
        return !it.hasNext() ? v(next) : new a().a(next).g(it).h();
    }

    public static n r(Object[] objArr) {
        return objArr.length == 0 ? u() : m((Object[]) objArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static n u() {
        return e0.f7551i;
    }

    public static n v(Object obj) {
        return m(obj);
    }

    public static n w(Comparator comparator, Iterable iterable) {
        j.o(comparator);
        Object[] c10 = v.c(iterable);
        b0.b(c10);
        Arrays.sort(c10, comparator);
        return k(c10);
    }

    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final n b() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean equals(Object obj) {
        return x.a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.b(this, obj);
    }

    /* renamed from: j */
    public p0 iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return x.d(this, obj);
    }

    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public q0 listIterator() {
        return listIterator(0);
    }

    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: t */
    public q0 listIterator(int i10) {
        j.r(i10, size());
        return isEmpty() ? f7616f : new b(this, i10);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new c(toArray());
    }

    /* renamed from: x */
    public n subList(int i10, int i11) {
        j.t(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? u() : y(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public n y(int i10, int i11) {
        return new d(i10, i11 - i10);
    }
}
