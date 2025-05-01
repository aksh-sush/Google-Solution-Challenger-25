package com.google.common.collect;

import com.google.common.collect.m0;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class d implements m0 {

    /* renamed from: e  reason: collision with root package name */
    private transient Set f7528e;

    /* renamed from: f  reason: collision with root package name */
    private transient Collection f7529f;

    class a extends AbstractSet {
        a() {
        }

        public void clear() {
            d.this.f();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof m0.a)) {
                return false;
            }
            m0.a aVar = (m0.a) obj;
            Map map = (Map) z.f(d.this.c(), aVar.b());
            return map != null && h.b(map.entrySet(), z.c(aVar.a(), aVar.getValue()));
        }

        public Iterator iterator() {
            return d.this.e();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof m0.a)) {
                return false;
            }
            m0.a aVar = (m0.a) obj;
            Map map = (Map) z.f(d.this.c(), aVar.b());
            return map != null && h.c(map.entrySet(), z.c(aVar.a(), aVar.getValue()));
        }

        public int size() {
            return d.this.size();
        }
    }

    class b extends AbstractCollection {
        b() {
        }

        public void clear() {
            d.this.f();
        }

        public boolean contains(Object obj) {
            return d.this.g(obj);
        }

        public Iterator iterator() {
            return d.this.o();
        }

        public int size() {
            return d.this.size();
        }
    }

    d() {
    }

    public Set a() {
        Set set = this.f7528e;
        if (set != null) {
            return set;
        }
        Set h10 = h();
        this.f7528e = h10;
        return h10;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator e();

    public boolean equals(Object obj) {
        return n0.a(this, obj);
    }

    public abstract void f();

    public abstract boolean g(Object obj);

    /* access modifiers changed from: package-private */
    public Set h() {
        return new a();
    }

    public int hashCode() {
        return a().hashCode();
    }

    /* access modifiers changed from: package-private */
    public Collection i() {
        return new b();
    }

    public Object j(Object obj, Object obj2) {
        Map map = (Map) z.f(c(), obj);
        if (map == null) {
            return null;
        }
        return z.f(map, obj2);
    }

    public boolean k() {
        return size() == 0;
    }

    public abstract Object l(Object obj, Object obj2, Object obj3);

    public void m(m0 m0Var) {
        for (m0.a aVar : m0Var.a()) {
            l(aVar.b(), aVar.a(), aVar.getValue());
        }
    }

    public Collection n() {
        Collection collection = this.f7529f;
        if (collection != null) {
            return collection;
        }
        Collection i10 = i();
        this.f7529f = i10;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator o();

    public String toString() {
        return c().toString();
    }
}
