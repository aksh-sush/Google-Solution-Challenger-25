package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

final class r extends l {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final o f7642f;

    class a extends p0 {

        /* renamed from: e  reason: collision with root package name */
        final p0 f7643e;

        a() {
            this.f7643e = r.this.f7642f.entrySet().j();
        }

        public boolean hasNext() {
            return this.f7643e.hasNext();
        }

        public Object next() {
            return ((Map.Entry) this.f7643e.next()).getValue();
        }
    }

    class b extends n {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f7645g;

        b(n nVar) {
            this.f7645g = nVar;
        }

        public Object get(int i10) {
            return ((Map.Entry) this.f7645g.get(i10)).getValue();
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public int size() {
            return this.f7645g.size();
        }
    }

    private static class c implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final o f7647e;

        c(o oVar) {
            this.f7647e = oVar;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.f7647e.values();
        }
    }

    r(o oVar) {
        this.f7642f = oVar;
    }

    public n b() {
        return new b(this.f7642f.entrySet().b());
    }

    public boolean contains(Object obj) {
        return obj != null && w.b(iterator(), obj);
    }

    /* renamed from: j */
    public p0 iterator() {
        return new a();
    }

    public int size() {
        return this.f7642f.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new c(this.f7642f);
    }
}
