package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.o;
import com.google.common.collect.t;
import java.lang.reflect.Array;
import java.util.Map;

final class j extends h0 {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final o f7581g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final o f7582h;

    /* renamed from: i  reason: collision with root package name */
    private final o f7583i;

    /* renamed from: j  reason: collision with root package name */
    private final o f7584j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final int[] f7585k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final int[] f7586l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Object[][] f7587m;

    /* renamed from: n  reason: collision with root package name */
    private final int[] f7588n;

    /* renamed from: o  reason: collision with root package name */
    private final int[] f7589o;

    private final class b extends d {

        /* renamed from: j  reason: collision with root package name */
        private final int f7590j;

        b(int i10) {
            super(j.this.f7586l[i10]);
            this.f7590j = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public Object o(int i10) {
            return j.this.f7587m[i10][this.f7590j];
        }

        /* access modifiers changed from: package-private */
        public o q() {
            return j.this.f7581g;
        }
    }

    private final class c extends d {
        private c() {
            super(j.this.f7586l.length);
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public o q() {
            return j.this.f7582h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public o o(int i10) {
            return new b(i10);
        }
    }

    private static abstract class d extends o.c {

        /* renamed from: i  reason: collision with root package name */
        private final int f7593i;

        class a extends b {

            /* renamed from: g  reason: collision with root package name */
            private int f7594g = -1;

            /* renamed from: h  reason: collision with root package name */
            private final int f7595h;

            a() {
                this.f7595h = d.this.q().size();
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public Map.Entry b() {
                int i10 = this.f7594g;
                while (true) {
                    this.f7594g = i10 + 1;
                    int i11 = this.f7594g;
                    if (i11 >= this.f7595h) {
                        return (Map.Entry) c();
                    }
                    Object o10 = d.this.o(i11);
                    if (o10 != null) {
                        return z.c(d.this.n(this.f7594g), o10);
                    }
                    i10 = this.f7594g;
                }
            }
        }

        d(int i10) {
            this.f7593i = i10;
        }

        private boolean p() {
            return this.f7593i == q().size();
        }

        /* access modifiers changed from: package-private */
        public s d() {
            return p() ? q().keySet() : super.d();
        }

        public Object get(Object obj) {
            Integer num = (Integer) q().get(obj);
            if (num == null) {
                return null;
            }
            return o(num.intValue());
        }

        /* access modifiers changed from: package-private */
        public p0 m() {
            return new a();
        }

        /* access modifiers changed from: package-private */
        public Object n(int i10) {
            return q().keySet().b().get(i10);
        }

        /* access modifiers changed from: package-private */
        public abstract Object o(int i10);

        /* access modifiers changed from: package-private */
        public abstract o q();

        public int size() {
            return this.f7593i;
        }
    }

    private final class e extends d {

        /* renamed from: j  reason: collision with root package name */
        private final int f7597j;

        e(int i10) {
            super(j.this.f7585k[i10]);
            this.f7597j = i10;
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public Object o(int i10) {
            return j.this.f7587m[this.f7597j][i10];
        }

        /* access modifiers changed from: package-private */
        public o q() {
            return j.this.f7582h;
        }
    }

    private final class f extends d {
        private f() {
            super(j.this.f7585k.length);
        }

        /* access modifiers changed from: package-private */
        public boolean h() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public o q() {
            return j.this.f7581g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public o o(int i10) {
            return new e(i10);
        }
    }

    j(n nVar, s sVar, s sVar2) {
        this.f7587m = (Object[][]) Array.newInstance(Object.class, new int[]{sVar.size(), sVar2.size()});
        o d10 = z.d(sVar);
        this.f7581g = d10;
        o d11 = z.d(sVar2);
        this.f7582h = d11;
        this.f7585k = new int[d10.size()];
        this.f7586l = new int[d11.size()];
        int[] iArr = new int[nVar.size()];
        int[] iArr2 = new int[nVar.size()];
        for (int i10 = 0; i10 < nVar.size(); i10++) {
            m0.a aVar = (m0.a) nVar.get(i10);
            Object b10 = aVar.b();
            Object a10 = aVar.a();
            int intValue = ((Integer) this.f7581g.get(b10)).intValue();
            int intValue2 = ((Integer) this.f7582h.get(a10)).intValue();
            A(b10, a10, this.f7587m[intValue][intValue2], aVar.getValue());
            this.f7587m[intValue][intValue2] = aVar.getValue();
            int[] iArr3 = this.f7585k;
            iArr3[intValue] = iArr3[intValue] + 1;
            int[] iArr4 = this.f7586l;
            iArr4[intValue2] = iArr4[intValue2] + 1;
            iArr[i10] = intValue;
            iArr2[i10] = intValue2;
        }
        this.f7588n = iArr;
        this.f7589o = iArr2;
        this.f7583i = new f();
        this.f7584j = new c();
    }

    /* access modifiers changed from: package-private */
    public m0.a G(int i10) {
        int i11 = this.f7588n[i10];
        int i12 = this.f7589o[i10];
        return t.q(d().b().get(i11), b().b().get(i12), this.f7587m[i11][i12]);
    }

    /* access modifiers changed from: package-private */
    public Object H(int i10) {
        return this.f7587m[this.f7588n[i10]][this.f7589o[i10]];
    }

    public Object j(Object obj, Object obj2) {
        Integer num = (Integer) this.f7581g.get(obj);
        Integer num2 = (Integer) this.f7582h.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.f7587m[num.intValue()][num2.intValue()];
    }

    public int size() {
        return this.f7588n.length;
    }

    public o t() {
        return o.b(this.f7584j);
    }

    /* access modifiers changed from: package-private */
    public t.b u() {
        return t.b.a(this, this.f7588n, this.f7589o);
    }

    /* renamed from: y */
    public o c() {
        return o.b(this.f7583i);
    }
}
