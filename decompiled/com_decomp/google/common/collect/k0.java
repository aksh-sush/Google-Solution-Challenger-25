package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.t;
import l5.j;

class k0 extends t {

    /* renamed from: g  reason: collision with root package name */
    final Object f7602g;

    /* renamed from: h  reason: collision with root package name */
    final Object f7603h;

    /* renamed from: i  reason: collision with root package name */
    final Object f7604i;

    k0(m0.a aVar) {
        this(aVar.b(), aVar.a(), aVar.getValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public s h() {
        return s.s(t.q(this.f7602g, this.f7603h, this.f7604i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public l i() {
        return s.s(this.f7604i);
    }

    public int size() {
        return 1;
    }

    public o t() {
        return o.k(this.f7603h, o.k(this.f7602g, this.f7604i));
    }

    /* access modifiers changed from: package-private */
    public t.b u() {
        return t.b.a(this, new int[]{0}, new int[]{0});
    }

    /* renamed from: y */
    public o c() {
        return o.k(this.f7602g, o.k(this.f7603h, this.f7604i));
    }

    k0(Object obj, Object obj2, Object obj3) {
        this.f7602g = j.o(obj);
        this.f7603h = j.o(obj2);
        this.f7604i = j.o(obj3);
    }
}
