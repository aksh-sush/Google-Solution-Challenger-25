package com.google.common.collect;

import com.google.common.collect.m0;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import l5.j;

abstract class h0 extends t {

    static class a implements Comparator {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Comparator f7576e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Comparator f7577f;

        a(Comparator comparator, Comparator comparator2) {
            this.f7576e = comparator;
            this.f7577f = comparator2;
        }

        /* renamed from: a */
        public int compare(m0.a aVar, m0.a aVar2) {
            Comparator comparator = this.f7576e;
            int compare = comparator == null ? 0 : comparator.compare(aVar.b(), aVar2.b());
            if (compare != 0) {
                return compare;
            }
            Comparator comparator2 = this.f7577f;
            if (comparator2 == null) {
                return 0;
            }
            return comparator2.compare(aVar.a(), aVar2.a());
        }
    }

    private final class b extends u {
        private b() {
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof m0.a)) {
                return false;
            }
            m0.a aVar = (m0.a) obj;
            Object j10 = h0.this.j(aVar.b(), aVar.a());
            return j10 != null && j10.equals(aVar.getValue());
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return false;
        }

        public int size() {
            return h0.this.size();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public m0.a get(int i10) {
            return h0.this.G(i10);
        }

        /* synthetic */ b(h0 h0Var, a aVar) {
            this();
        }
    }

    private final class c extends n {
        private c() {
        }

        public Object get(int i10) {
            return h0.this.H(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public int size() {
            return h0.this.size();
        }

        /* synthetic */ c(h0 h0Var, a aVar) {
            this();
        }
    }

    h0() {
    }

    static h0 D(List list, Comparator comparator, Comparator comparator2) {
        j.o(list);
        if (!(comparator == null && comparator2 == null)) {
            Collections.sort(list, new a(comparator, comparator2));
        }
        return E(list, comparator, comparator2);
    }

    private static h0 E(Iterable iterable, Comparator comparator, Comparator comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        n o10 = n.o(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m0.a aVar = (m0.a) it.next();
            linkedHashSet.add(aVar.b());
            linkedHashSet2.add(aVar.a());
        }
        return F(o10, comparator == null ? s.m(linkedHashSet) : s.m(n.w(comparator, linkedHashSet)), comparator2 == null ? s.m(linkedHashSet2) : s.m(n.w(comparator2, linkedHashSet2)));
    }

    static h0 F(n nVar, s sVar, s sVar2) {
        return ((long) nVar.size()) > (((long) sVar.size()) * ((long) sVar2.size())) / 2 ? new j(nVar, sVar, sVar2) : new l0(nVar, sVar, sVar2);
    }

    /* access modifiers changed from: package-private */
    public final void A(Object obj, Object obj2, Object obj3, Object obj4) {
        j.l(obj3 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final s h() {
        return k() ? s.r() : new b(this, (a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final l i() {
        return k() ? n.u() : new c(this, (a) null);
    }

    /* access modifiers changed from: package-private */
    public abstract m0.a G(int i10);

    /* access modifiers changed from: package-private */
    public abstract Object H(int i10);
}
