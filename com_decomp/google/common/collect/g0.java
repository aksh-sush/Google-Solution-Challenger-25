package com.google.common.collect;

final class g0 extends s {

    /* renamed from: l  reason: collision with root package name */
    static final g0 f7570l = new g0(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: g  reason: collision with root package name */
    final transient Object[] f7571g;

    /* renamed from: h  reason: collision with root package name */
    final transient Object[] f7572h;

    /* renamed from: i  reason: collision with root package name */
    private final transient int f7573i;

    /* renamed from: j  reason: collision with root package name */
    private final transient int f7574j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f7575k;

    g0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7571g = objArr;
        this.f7572h = objArr2;
        this.f7573i = i11;
        this.f7574j = i10;
        this.f7575k = i12;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f7572h;
        if (obj == null || objArr == null) {
            return false;
        }
        int b10 = k.b(obj);
        while (true) {
            int i10 = b10 & this.f7573i;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f7571g, 0, objArr, i10, this.f7575k);
        return i10 + this.f7575k;
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return this.f7571g;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f7575k;
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return 0;
    }

    public int hashCode() {
        return this.f7574j;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    /* renamed from: j */
    public p0 iterator() {
        return b().iterator();
    }

    /* access modifiers changed from: package-private */
    public n p() {
        return n.l(this.f7571g, this.f7575k);
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return true;
    }

    public int size() {
        return this.f7575k;
    }
}
