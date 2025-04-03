package com.google.protobuf;

class v1 extends t1 {
    v1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public u1 g(Object obj) {
        return ((z) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int h(u1 u1Var) {
        return u1Var.d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int i(u1 u1Var) {
        return u1Var.e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public u1 k(u1 u1Var, u1 u1Var2) {
        return u1Var2.equals(u1.c()) ? u1Var : u1.m(u1Var, u1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public u1 n() {
        return u1.n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void o(Object obj, u1 u1Var) {
        p(obj, u1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void p(Object obj, u1 u1Var) {
        ((z) obj).unknownFields = u1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public u1 r(u1 u1Var) {
        u1Var.h();
        return u1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void s(u1 u1Var, a2 a2Var) {
        u1Var.s(a2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void t(u1 u1Var, a2 a2Var) {
        u1Var.u(a2Var);
    }

    /* access modifiers changed from: package-private */
    public void j(Object obj) {
        g(obj).h();
    }

    /* access modifiers changed from: package-private */
    public boolean q(j1 j1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void a(u1 u1Var, int i10, int i11) {
        u1Var.q(z1.c(i10, 5), Integer.valueOf(i11));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void b(u1 u1Var, int i10, long j10) {
        u1Var.q(z1.c(i10, 1), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void c(u1 u1Var, int i10, u1 u1Var2) {
        u1Var.q(z1.c(i10, 3), u1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void d(u1 u1Var, int i10, j jVar) {
        u1Var.q(z1.c(i10, 2), jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void e(u1 u1Var, int i10, long j10) {
        u1Var.q(z1.c(i10, 0), Long.valueOf(j10));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public u1 f(Object obj) {
        u1 A = g(obj);
        if (A != u1.c()) {
            return A;
        }
        u1 n10 = u1.n();
        p(obj, n10);
        return n10;
    }
}
