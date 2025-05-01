package com.google.common.collect;

import l5.j;

final class j0 extends s {

    /* renamed from: g  reason: collision with root package name */
    final transient Object f7600g;

    /* renamed from: h  reason: collision with root package name */
    private transient int f7601h;

    j0(Object obj) {
        this.f7600g = j.o(obj);
    }

    public boolean contains(Object obj) {
        return this.f7600g.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        objArr[i10] = this.f7600g;
        return i10 + 1;
    }

    public final int hashCode() {
        int i10 = this.f7601h;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.f7600g.hashCode();
        this.f7601h = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    /* renamed from: j */
    public p0 iterator() {
        return w.f(this.f7600g);
    }

    /* access modifiers changed from: package-private */
    public n p() {
        return n.v(this.f7600g);
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f7601h != 0;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        return '[' + this.f7600g.toString() + ']';
    }

    j0(Object obj, int i10) {
        this.f7600g = obj;
        this.f7601h = i10;
    }
}
