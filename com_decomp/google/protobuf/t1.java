package com.google.protobuf;

abstract class t1 {
    t1() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, int i10, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, int i10, j jVar);

    /* access modifiers changed from: package-private */
    public abstract void e(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract Object f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int i(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object k(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.Object r3, com.google.protobuf.j1 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.t()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t1.l(java.lang.Object, com.google.protobuf.j1):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(Object obj, j1 j1Var) {
        int c10 = j1Var.c();
        int a10 = z1.a(c10);
        int b10 = z1.b(c10);
        if (b10 == 0) {
            e(obj, a10, j1Var.L());
            return true;
        } else if (b10 == 1) {
            b(obj, a10, j1Var.f());
            return true;
        } else if (b10 == 2) {
            d(obj, a10, j1Var.B());
            return true;
        } else if (b10 == 3) {
            Object n10 = n();
            int c11 = z1.c(a10, 4);
            l(n10, j1Var);
            if (c11 == j1Var.c()) {
                c(obj, a10, r(n10));
                return true;
            }
            throw d0.a();
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                a(obj, a10, j1Var.p());
                return true;
            }
            throw d0.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract boolean q(j1 j1Var);

    /* access modifiers changed from: package-private */
    public abstract Object r(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void s(Object obj, a2 a2Var);

    /* access modifiers changed from: package-private */
    public abstract void t(Object obj, a2 a2Var);
}
