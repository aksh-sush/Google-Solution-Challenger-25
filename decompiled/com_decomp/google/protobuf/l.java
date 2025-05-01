package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.z1;
import java.util.List;

final class l implements j1 {

    /* renamed from: a  reason: collision with root package name */
    private final k f8669a;

    /* renamed from: b  reason: collision with root package name */
    private int f8670b;

    /* renamed from: c  reason: collision with root package name */
    private int f8671c;

    /* renamed from: d  reason: collision with root package name */
    private int f8672d = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8673a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z1$b[] r0 = com.google.protobuf.z1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8673a = r0
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8673a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.a.<clinit>():void");
        }
    }

    private l(k kVar) {
        k kVar2 = (k) c0.b(kVar, "input");
        this.f8669a = kVar2;
        kVar2.f8618d = this;
    }

    public static l Q(k kVar) {
        l lVar = kVar.f8618d;
        return lVar != null ? lVar : new l(kVar);
    }

    private Object R(z1.b bVar, Class cls, r rVar) {
        switch (a.f8673a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(r());
            case 2:
                return B();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(b());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(E());
            case 9:
                return Long.valueOf(L());
            case 10:
                return m(cls, rVar);
            case 11:
                return Integer.valueOf(G());
            case 12:
                return Long.valueOf(v());
            case 13:
                return Integer.valueOf(h());
            case 14:
                return Long.valueOf(k());
            case 15:
                return M();
            case 16:
                return Integer.valueOf(D());
            case 17:
                return Long.valueOf(d());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object S(l1 l1Var, r rVar) {
        int i10 = this.f8671c;
        this.f8671c = z1.c(z1.a(this.f8670b), 4);
        try {
            Object i11 = l1Var.i();
            l1Var.e(i11, this, rVar);
            l1Var.c(i11);
            if (this.f8670b == this.f8671c) {
                return i11;
            }
            throw d0.g();
        } finally {
            this.f8671c = i10;
        }
    }

    private Object T(l1 l1Var, r rVar) {
        int F = this.f8669a.F();
        k kVar = this.f8669a;
        if (kVar.f8615a < kVar.f8616b) {
            int n10 = kVar.n(F);
            Object i10 = l1Var.i();
            this.f8669a.f8615a++;
            l1Var.e(i10, this, rVar);
            l1Var.c(i10);
            this.f8669a.a(0);
            k kVar2 = this.f8669a;
            kVar2.f8615a--;
            kVar2.m(n10);
            return i10;
        }
        throw d0.h();
    }

    private void V(int i10) {
        if (this.f8669a.d() != i10) {
            throw d0.k();
        }
    }

    private void W(int i10) {
        if (z1.b(this.f8670b) != i10) {
            throw d0.d();
        }
    }

    private void X(int i10) {
        if ((i10 & 3) != 0) {
            throw d0.g();
        }
    }

    private void Y(int i10) {
        if ((i10 & 7) != 0) {
            throw d0.g();
        }
    }

    public Object A(l1 l1Var, r rVar) {
        W(3);
        return S(l1Var, rVar);
    }

    public j B() {
        W(2);
        return this.f8669a.p();
    }

    public void C(List list) {
        int E;
        int E2;
        if (list instanceof x) {
            x xVar = (x) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 2) {
                int F = this.f8669a.F();
                X(F);
                int d10 = this.f8669a.d() + F;
                do {
                    xVar.f(this.f8669a.u());
                } while (this.f8669a.d() < d10);
            } else if (b10 == 5) {
                do {
                    xVar.f(this.f8669a.u());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 2) {
                int F2 = this.f8669a.F();
                X(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Float.valueOf(this.f8669a.u()));
                } while (this.f8669a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f8669a.u()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else {
                throw d0.d();
            }
        }
    }

    public int D() {
        W(0);
        return this.f8669a.F();
    }

    public int E() {
        W(0);
        return this.f8669a.v();
    }

    public boolean F() {
        int i10;
        if (this.f8669a.e() || (i10 = this.f8670b) == this.f8671c) {
            return false;
        }
        return this.f8669a.I(i10);
    }

    public int G() {
        W(5);
        return this.f8669a.y();
    }

    public void H(List list) {
        int E;
        if (z1.b(this.f8670b) == 2) {
            do {
                list.add(B());
                if (!this.f8669a.e()) {
                    E = this.f8669a.E();
                } else {
                    return;
                }
            } while (E == this.f8670b);
            this.f8672d = E;
            return;
        }
        throw d0.d();
    }

    public void I(List list) {
        int E;
        int E2;
        if (list instanceof o) {
            o oVar = (o) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 1) {
                do {
                    oVar.f(this.f8669a.q());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else if (b10 == 2) {
                int F = this.f8669a.F();
                Y(F);
                int d10 = this.f8669a.d() + F;
                do {
                    oVar.f(this.f8669a.q());
                } while (this.f8669a.d() < d10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f8669a.q()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else if (b11 == 2) {
                int F2 = this.f8669a.F();
                Y(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Double.valueOf(this.f8669a.q()));
                } while (this.f8669a.d() < d11);
            } else {
                throw d0.d();
            }
        }
    }

    public void J(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    k0Var.h(this.f8669a.w());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    k0Var.h(this.f8669a.w());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f8669a.w()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Long.valueOf(this.f8669a.w()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public void K(List list) {
        int E;
        int E2;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 1) {
                do {
                    k0Var.h(this.f8669a.z());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else if (b10 == 2) {
                int F = this.f8669a.F();
                Y(F);
                int d10 = this.f8669a.d() + F;
                do {
                    k0Var.h(this.f8669a.z());
                } while (this.f8669a.d() < d10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f8669a.z()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else if (b11 == 2) {
                int F2 = this.f8669a.F();
                Y(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Long.valueOf(this.f8669a.z()));
                } while (this.f8669a.d() < d11);
            } else {
                throw d0.d();
            }
        }
    }

    public long L() {
        W(0);
        return this.f8669a.w();
    }

    public String M() {
        W(2);
        return this.f8669a.D();
    }

    public void N(List list) {
        int E;
        int E2;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 1) {
                do {
                    k0Var.h(this.f8669a.t());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else if (b10 == 2) {
                int F = this.f8669a.F();
                Y(F);
                int d10 = this.f8669a.d() + F;
                do {
                    k0Var.h(this.f8669a.t());
                } while (this.f8669a.d() < d10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f8669a.t()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else if (b11 == 2) {
                int F2 = this.f8669a.F();
                Y(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Long.valueOf(this.f8669a.t()));
                } while (this.f8669a.d() < d11);
            } else {
                throw d0.d();
            }
        }
    }

    public void O(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    b0Var.f(this.f8669a.v());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    b0Var.f(this.f8669a.v());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8669a.v()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Integer.valueOf(this.f8669a.v()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public void P(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    b0Var.f(this.f8669a.r());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    b0Var.f(this.f8669a.r());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8669a.r()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Integer.valueOf(this.f8669a.r()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public void U(List list, boolean z10) {
        int E;
        int E2;
        if (z1.b(this.f8670b) != 2) {
            throw d0.d();
        } else if (!(list instanceof i0) || z10) {
            do {
                list.add(z10 ? M() : o());
                if (!this.f8669a.e()) {
                    E = this.f8669a.E();
                } else {
                    return;
                }
            } while (E == this.f8670b);
            this.f8672d = E;
        } else {
            i0 i0Var = (i0) list;
            do {
                i0Var.n(B());
                if (!this.f8669a.e()) {
                    E2 = this.f8669a.E();
                } else {
                    return;
                }
            } while (E2 == this.f8670b);
            this.f8672d = E2;
        }
    }

    public void a(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    b0Var.f(this.f8669a.A());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    b0Var.f(this.f8669a.A());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8669a.A()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Integer.valueOf(this.f8669a.A()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public int b() {
        W(0);
        return this.f8669a.r();
    }

    public int c() {
        return this.f8670b;
    }

    public long d() {
        W(0);
        return this.f8669a.G();
    }

    public void e(List list) {
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 2) {
                int F = this.f8669a.F();
                X(F);
                int d10 = this.f8669a.d() + F;
                do {
                    b0Var.f(this.f8669a.s());
                } while (this.f8669a.d() < d10);
            } else if (b10 == 5) {
                do {
                    b0Var.f(this.f8669a.s());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 2) {
                int F2 = this.f8669a.F();
                X(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Integer.valueOf(this.f8669a.s()));
                } while (this.f8669a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f8669a.s()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else {
                throw d0.d();
            }
        }
    }

    public long f() {
        W(1);
        return this.f8669a.t();
    }

    public void g(List list) {
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 2) {
                int F = this.f8669a.F();
                X(F);
                int d10 = this.f8669a.d() + F;
                do {
                    b0Var.f(this.f8669a.y());
                } while (this.f8669a.d() < d10);
            } else if (b10 == 5) {
                do {
                    b0Var.f(this.f8669a.y());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 2) {
                int F2 = this.f8669a.F();
                X(F2);
                int d11 = this.f8669a.d() + F2;
                do {
                    list.add(Integer.valueOf(this.f8669a.y()));
                } while (this.f8669a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f8669a.y()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
            } else {
                throw d0.d();
            }
        }
    }

    public int h() {
        W(0);
        return this.f8669a.A();
    }

    public void i(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    k0Var.h(this.f8669a.B());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    k0Var.h(this.f8669a.B());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f8669a.B()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Long.valueOf(this.f8669a.B()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public void j(List list, l1 l1Var, r rVar) {
        int E;
        if (z1.b(this.f8670b) == 3) {
            int i10 = this.f8670b;
            do {
                list.add(S(l1Var, rVar));
                if (!this.f8669a.e() && this.f8672d == 0) {
                    E = this.f8669a.E();
                } else {
                    return;
                }
            } while (E == i10);
            this.f8672d = E;
            return;
        }
        throw d0.d();
    }

    public long k() {
        W(0);
        return this.f8669a.B();
    }

    public void l(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    b0Var.f(this.f8669a.F());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    b0Var.f(this.f8669a.F());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f8669a.F()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Integer.valueOf(this.f8669a.F()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public Object m(Class cls, r rVar) {
        W(2);
        return T(g1.a().d(cls), rVar);
    }

    public void n(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof h) {
            h hVar = (h) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    hVar.h(this.f8669a.o());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    hVar.h(this.f8669a.o());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f8669a.o()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Boolean.valueOf(this.f8669a.o()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public String o() {
        W(2);
        return this.f8669a.C();
    }

    public int p() {
        W(5);
        return this.f8669a.s();
    }

    public Object q(Class cls, r rVar) {
        W(3);
        return S(g1.a().d(cls), rVar);
    }

    public boolean r() {
        W(0);
        return this.f8669a.o();
    }

    public double readDouble() {
        W(1);
        return this.f8669a.q();
    }

    public float readFloat() {
        W(5);
        return this.f8669a.u();
    }

    public void s(List list, l1 l1Var, r rVar) {
        int E;
        if (z1.b(this.f8670b) == 2) {
            int i10 = this.f8670b;
            do {
                list.add(T(l1Var, rVar));
                if (!this.f8669a.e() && this.f8672d == 0) {
                    E = this.f8669a.E();
                } else {
                    return;
                }
            } while (E == i10);
            this.f8672d = E;
            return;
        }
        throw d0.d();
    }

    public int t() {
        int i10 = this.f8672d;
        if (i10 != 0) {
            this.f8670b = i10;
            this.f8672d = 0;
        } else {
            this.f8670b = this.f8669a.E();
        }
        int i11 = this.f8670b;
        return (i11 == 0 || i11 == this.f8671c) ? a.e.API_PRIORITY_OTHER : z1.a(i11);
    }

    public void u(List list) {
        U(list, false);
    }

    public long v() {
        W(1);
        return this.f8669a.z();
    }

    public Object w(l1 l1Var, r rVar) {
        W(2);
        return T(l1Var, rVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (F() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.d0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(java.util.Map r8, com.google.protobuf.m0.a r9, com.google.protobuf.r r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            com.google.protobuf.k r1 = r7.f8669a
            int r1 = r1.F()
            com.google.protobuf.k r2 = r7.f8669a
            int r1 = r2.n(r1)
            java.lang.Object r2 = r9.f8694b
            java.lang.Object r3 = r9.f8696d
        L_0x0014:
            int r4 = r7.t()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.k r5 = r7.f8669a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.F()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.d0 r4 = new com.google.protobuf.d0     // Catch:{ a -> 0x004f }
            r4.<init>(r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            com.google.protobuf.z1$b r4 = r9.f8695c     // Catch:{ a -> 0x004f }
            java.lang.Object r5 = r9.f8696d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.z1$b r4 = r9.f8693a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.F()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.d0 r8 = new com.google.protobuf.d0     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.k r8 = r7.f8669a
            r8.m(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.k r9 = r7.f8669a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l.x(java.util.Map, com.google.protobuf.m0$a, com.google.protobuf.r):void");
    }

    public void y(List list) {
        int i10;
        int E;
        int E2;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            int b10 = z1.b(this.f8670b);
            if (b10 == 0) {
                do {
                    k0Var.h(this.f8669a.G());
                    if (!this.f8669a.e()) {
                        E2 = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f8670b);
                this.f8672d = E2;
                return;
            } else if (b10 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    k0Var.h(this.f8669a.G());
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        } else {
            int b11 = z1.b(this.f8670b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f8669a.G()));
                    if (!this.f8669a.e()) {
                        E = this.f8669a.E();
                    } else {
                        return;
                    }
                } while (E == this.f8670b);
                this.f8672d = E;
                return;
            } else if (b11 == 2) {
                i10 = this.f8669a.d() + this.f8669a.F();
                do {
                    list.add(Long.valueOf(this.f8669a.G()));
                } while (this.f8669a.d() < i10);
            } else {
                throw d0.d();
            }
        }
        V(i10);
    }

    public void z(List list) {
        U(list, true);
    }
}
