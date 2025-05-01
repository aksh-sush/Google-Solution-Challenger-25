package com.google.common.collect;

import l5.j;

class e0 extends n {

    /* renamed from: i  reason: collision with root package name */
    static final n f7551i = new e0(new Object[0], 0);

    /* renamed from: g  reason: collision with root package name */
    final transient Object[] f7552g;

    /* renamed from: h  reason: collision with root package name */
    private final transient int f7553h;

    e0(Object[] objArr, int i10) {
        this.f7552g = objArr;
        this.f7553h = i10;
    }

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f7552g, 0, objArr, i10, this.f7553h);
        return i10 + this.f7553h;
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return this.f7552g;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f7553h;
    }

    public Object get(int i10) {
        j.m(i10, this.f7553h);
        return this.f7552g[i10];
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    public int size() {
        return this.f7553h;
    }
}
