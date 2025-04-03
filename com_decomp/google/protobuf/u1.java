package com.google.protobuf;

import com.google.protobuf.a2;
import java.util.Arrays;

public final class u1 {

    /* renamed from: f  reason: collision with root package name */
    private static final u1 f8744f = new u1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f8745a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f8746b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f8747c;

    /* renamed from: d  reason: collision with root package name */
    private int f8748d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8749e;

    private u1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f8745a;
        int[] iArr = this.f8746b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f8746b = Arrays.copyOf(iArr, i11);
            this.f8747c = Arrays.copyOf(this.f8747c, i11);
        }
    }

    public static u1 c() {
        return f8744f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private com.google.protobuf.u1 j(com.google.protobuf.k r2) {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.E()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.i(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.u1.j(com.google.protobuf.k):com.google.protobuf.u1");
    }

    static u1 m(u1 u1Var, u1 u1Var2) {
        int i10 = u1Var.f8745a + u1Var2.f8745a;
        int[] copyOf = Arrays.copyOf(u1Var.f8746b, i10);
        System.arraycopy(u1Var2.f8746b, 0, copyOf, u1Var.f8745a, u1Var2.f8745a);
        Object[] copyOf2 = Arrays.copyOf(u1Var.f8747c, i10);
        System.arraycopy(u1Var2.f8747c, 0, copyOf2, u1Var.f8745a, u1Var2.f8745a);
        return new u1(i10, copyOf, copyOf2, true);
    }

    static u1 n() {
        return new u1();
    }

    private static boolean o(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void t(int i10, Object obj, a2 a2Var) {
        int a10 = z1.a(i10);
        int b10 = z1.b(i10);
        if (b10 == 0) {
            a2Var.e(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            a2Var.A(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            a2Var.l(a10, (j) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                a2Var.p(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(d0.d());
        } else if (a2Var.B() == a2.a.ASCENDING) {
            a2Var.k(a10);
            ((u1) obj).u(a2Var);
            a2Var.F(a10);
        } else {
            a2Var.F(a10);
            ((u1) obj).u(a2Var);
            a2Var.k(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f8749e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int i10;
        int i11 = this.f8748d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f8745a; i13++) {
            int i14 = this.f8746b[i13];
            int a10 = z1.a(i14);
            int b10 = z1.b(i14);
            if (b10 == 0) {
                i10 = m.W(a10, ((Long) this.f8747c[i13]).longValue());
            } else if (b10 == 1) {
                i10 = m.p(a10, ((Long) this.f8747c[i13]).longValue());
            } else if (b10 == 2) {
                i10 = m.h(a10, (j) this.f8747c[i13]);
            } else if (b10 == 3) {
                i10 = (m.T(a10) * 2) + ((u1) this.f8747c[i13]).d();
            } else if (b10 == 5) {
                i10 = m.n(a10, ((Integer) this.f8747c[i13]).intValue());
            } else {
                throw new IllegalStateException(d0.d());
            }
            i12 += i10;
        }
        this.f8748d = i12;
        return i12;
    }

    public int e() {
        int i10 = this.f8748d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8745a; i12++) {
            i11 += m.H(z1.a(this.f8746b[i12]), (j) this.f8747c[i12]);
        }
        this.f8748d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        int i10 = this.f8745a;
        return i10 == u1Var.f8745a && r(this.f8746b, u1Var.f8746b, i10) && o(this.f8747c, u1Var.f8747c, this.f8745a);
    }

    public void h() {
        this.f8749e = false;
    }

    public int hashCode() {
        int i10 = this.f8745a;
        return ((((527 + i10) * 31) + f(this.f8746b, i10)) * 31) + g(this.f8747c, this.f8745a);
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10, k kVar) {
        a();
        int a10 = z1.a(i10);
        int b10 = z1.b(i10);
        if (b10 == 0) {
            q(i10, Long.valueOf(kVar.w()));
            return true;
        } else if (b10 == 1) {
            q(i10, Long.valueOf(kVar.t()));
            return true;
        } else if (b10 == 2) {
            q(i10, kVar.p());
            return true;
        } else if (b10 == 3) {
            u1 u1Var = new u1();
            u1Var.j(kVar);
            kVar.a(z1.c(a10, 4));
            q(i10, u1Var);
            return true;
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                q(i10, Integer.valueOf(kVar.s()));
                return true;
            }
            throw d0.d();
        }
    }

    /* access modifiers changed from: package-private */
    public u1 k(int i10, j jVar) {
        a();
        if (i10 != 0) {
            q(z1.c(i10, 2), jVar);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    public u1 l(int i10, int i11) {
        a();
        if (i10 != 0) {
            q(z1.c(i10, 0), Long.valueOf((long) i11));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: package-private */
    public final void p(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f8745a; i11++) {
            v0.c(sb2, i10, String.valueOf(z1.a(this.f8746b[i11])), this.f8747c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void q(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f8746b;
        int i11 = this.f8745a;
        iArr[i11] = i10;
        this.f8747c[i11] = obj;
        this.f8745a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void s(a2 a2Var) {
        if (a2Var.B() == a2.a.DESCENDING) {
            for (int i10 = this.f8745a - 1; i10 >= 0; i10--) {
                a2Var.h(z1.a(this.f8746b[i10]), this.f8747c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f8745a; i11++) {
            a2Var.h(z1.a(this.f8746b[i11]), this.f8747c[i11]);
        }
    }

    public void u(a2 a2Var) {
        if (this.f8745a != 0) {
            if (a2Var.B() == a2.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f8745a; i10++) {
                    t(this.f8746b[i10], this.f8747c[i10], a2Var);
                }
                return;
            }
            for (int i11 = this.f8745a - 1; i11 >= 0; i11--) {
                t(this.f8746b[i11], this.f8747c[i11], a2Var);
            }
        }
    }

    private u1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f8748d = -1;
        this.f8745a = i10;
        this.f8746b = iArr;
        this.f8747c = objArr;
        this.f8749e = z10;
    }
}
