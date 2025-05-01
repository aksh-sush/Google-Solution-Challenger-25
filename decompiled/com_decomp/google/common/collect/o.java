package com.google.common.collect;

import com.google.common.collect.l;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class o implements Map, Serializable {

    /* renamed from: h  reason: collision with root package name */
    static final Map.Entry[] f7626h = new Map.Entry[0];

    /* renamed from: e  reason: collision with root package name */
    private transient s f7627e;

    /* renamed from: f  reason: collision with root package name */
    private transient s f7628f;

    /* renamed from: g  reason: collision with root package name */
    private transient l f7629g;

    class a extends p0 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p0 f7630e;

        a(p0 p0Var) {
            this.f7630e = p0Var;
        }

        public boolean hasNext() {
            return this.f7630e.hasNext();
        }

        public Object next() {
            return ((Map.Entry) this.f7630e.next()).getKey();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Comparator f7632a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f7633b;

        /* renamed from: c  reason: collision with root package name */
        int f7634c = 0;

        /* renamed from: d  reason: collision with root package name */
        boolean f7635d = false;

        b(int i10) {
            this.f7633b = new Object[(i10 * 2)];
        }

        private void b(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f7633b;
            if (i11 > objArr.length) {
                this.f7633b = Arrays.copyOf(objArr, l.b.c(objArr.length, i11));
                this.f7635d = false;
            }
        }

        public o a() {
            f();
            this.f7635d = true;
            return f0.m(this.f7634c, this.f7633b);
        }

        public b c(Object obj, Object obj2) {
            b(this.f7634c + 1);
            g.a(obj, obj2);
            Object[] objArr = this.f7633b;
            int i10 = this.f7634c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f7634c = i10 + 1;
            return this;
        }

        public b d(Map.Entry entry) {
            return c(entry.getKey(), entry.getValue());
        }

        public b e(Iterable iterable) {
            if (iterable instanceof Collection) {
                b(this.f7634c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                d((Map.Entry) it.next());
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public void f() {
            int i10;
            if (this.f7632a != null) {
                if (this.f7635d) {
                    this.f7633b = Arrays.copyOf(this.f7633b, this.f7634c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f7634c];
                int i11 = 0;
                while (true) {
                    i10 = this.f7634c;
                    if (i11 >= i10) {
                        break;
                    }
                    Object[] objArr = this.f7633b;
                    int i12 = i11 * 2;
                    entryArr[i11] = new AbstractMap.SimpleImmutableEntry(objArr[i12], objArr[i12 + 1]);
                    i11++;
                }
                Arrays.sort(entryArr, 0, i10, c0.a(this.f7632a).b(z.h()));
                for (int i13 = 0; i13 < this.f7634c; i13++) {
                    int i14 = i13 * 2;
                    this.f7633b[i14] = entryArr[i13].getKey();
                    this.f7633b[i14 + 1] = entryArr[i13].getValue();
                }
            }
        }
    }

    static abstract class c extends o {

        class a extends p {
            a() {
            }

            /* renamed from: j */
            public p0 iterator() {
                return c.this.m();
            }

            /* access modifiers changed from: package-private */
            public o u() {
                return c.this;
            }
        }

        c() {
        }

        /* access modifiers changed from: package-private */
        public s c() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        public s d() {
            return new q(this);
        }

        /* access modifiers changed from: package-private */
        public l e() {
            return new r(this);
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return o.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return o.super.keySet();
        }

        /* access modifiers changed from: package-private */
        public abstract p0 m();

        public /* bridge */ /* synthetic */ Collection values() {
            return o.super.values();
        }
    }

    static class d implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Object[] f7637e;

        /* renamed from: f  reason: collision with root package name */
        private final Object[] f7638f;

        d(o oVar) {
            this.f7637e = new Object[oVar.size()];
            this.f7638f = new Object[oVar.size()];
            p0 j10 = oVar.entrySet().j();
            int i10 = 0;
            while (j10.hasNext()) {
                Map.Entry entry = (Map.Entry) j10.next();
                this.f7637e[i10] = entry.getKey();
                this.f7638f[i10] = entry.getValue();
                i10++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object a(b bVar) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f7637e;
                if (i10 >= objArr.length) {
                    return bVar.a();
                }
                bVar.c(objArr[i10], this.f7638f[i10]);
                i10++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return a(new b(this.f7637e.length));
        }
    }

    o() {
    }

    public static o a(Iterable iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.e(iterable);
        return bVar.a();
    }

    public static o b(Map map) {
        if ((map instanceof o) && !(map instanceof SortedMap)) {
            o oVar = (o) map;
            if (!oVar.h()) {
                return oVar;
            }
        }
        return a(map.entrySet());
    }

    public static o k(Object obj, Object obj2) {
        g.a(obj, obj2);
        return f0.m(1, new Object[]{obj, obj2});
    }

    /* access modifiers changed from: package-private */
    public abstract s c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    public abstract s d();

    /* access modifiers changed from: package-private */
    public abstract l e();

    public boolean equals(Object obj) {
        return z.b(this, obj);
    }

    /* renamed from: f */
    public s entrySet() {
        s sVar = this.f7627e;
        if (sVar != null) {
            return sVar;
        }
        s c10 = c();
        this.f7627e = c10;
        return c10;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return false;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean h();

    public int hashCode() {
        return i0.b(entrySet());
    }

    /* access modifiers changed from: package-private */
    public p0 i() {
        return new a(entrySet().j());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public s keySet() {
        s sVar = this.f7628f;
        if (sVar != null) {
            return sVar;
        }
        s d10 = d();
        this.f7628f = d10;
        return d10;
    }

    /* renamed from: l */
    public l values() {
        l lVar = this.f7629g;
        if (lVar != null) {
            return lVar;
        }
        l e10 = e();
        this.f7629g = e10;
        return e10;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return z.g(this);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(this);
    }
}
