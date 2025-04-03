package com.google.protobuf;

final class l0 implements m1 {

    /* renamed from: b  reason: collision with root package name */
    private static final s0 f8674b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final s0 f8675a;

    static class a implements s0 {
        a() {
        }

        public r0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements s0 {

        /* renamed from: a  reason: collision with root package name */
        private s0[] f8676a;

        b(s0... s0VarArr) {
            this.f8676a = s0VarArr;
        }

        public r0 a(Class cls) {
            for (s0 s0Var : this.f8676a) {
                if (s0Var.b(cls)) {
                    return s0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (s0 b10 : this.f8676a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public l0() {
        this(b());
    }

    private static s0 b() {
        return new b(y.c(), c());
    }

    private static s0 c() {
        try {
            return (s0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f8674b;
        }
    }

    private static boolean d(r0 r0Var) {
        return r0Var.b() == f1.PROTO2;
    }

    private static l1 e(Class cls, r0 r0Var) {
        if (z.class.isAssignableFrom(cls)) {
            if (d(r0Var)) {
                return w0.Q(cls, r0Var, a1.b(), j0.b(), n1.M(), u.b(), q0.b());
            }
            return w0.Q(cls, r0Var, a1.b(), j0.b(), n1.M(), (s) null, q0.b());
        } else if (d(r0Var)) {
            return w0.Q(cls, r0Var, a1.a(), j0.a(), n1.H(), u.a(), q0.a());
        } else {
            return w0.Q(cls, r0Var, a1.a(), j0.a(), n1.I(), (s) null, q0.a());
        }
    }

    public l1 a(Class cls) {
        t1 H;
        s a10;
        n1.J(cls);
        r0 a11 = this.f8675a.a(cls);
        if (!a11.a()) {
            return e(cls, a11);
        }
        if (z.class.isAssignableFrom(cls)) {
            H = n1.M();
            a10 = u.b();
        } else {
            H = n1.H();
            a10 = u.a();
        }
        return x0.m(H, a10, a11.c());
    }

    private l0(s0 s0Var) {
        this.f8675a = (s0) c0.b(s0Var, "messageInfoFactory");
    }
}
