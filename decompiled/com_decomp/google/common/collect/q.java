package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

final class q extends u {

    /* renamed from: g  reason: collision with root package name */
    private final o f7640g;

    private static class a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final o f7641e;

        a(o oVar) {
            this.f7641e = oVar;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.f7641e.keySet();
        }
    }

    q(o oVar) {
        this.f7640g = oVar;
    }

    public boolean contains(Object obj) {
        return this.f7640g.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    public Object get(int i10) {
        return ((Map.Entry) this.f7640g.entrySet().b().get(i10)).getKey();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return true;
    }

    /* renamed from: j */
    public p0 iterator() {
        return this.f7640g.i();
    }

    public int size() {
        return this.f7640g.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new a(this.f7640g);
    }
}
