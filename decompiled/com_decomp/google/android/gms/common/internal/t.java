package com.google.android.gms.common.internal;

public final class t {

    /* renamed from: b  reason: collision with root package name */
    private static t f5701b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f5702c = new u(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private u f5703a;

    private t() {
    }

    public static synchronized t b() {
        t tVar;
        synchronized (t.class) {
            if (f5701b == null) {
                f5701b = new t();
            }
            tVar = f5701b;
        }
        return tVar;
    }

    public u a() {
        return this.f5703a;
    }

    public final synchronized void c(u uVar) {
        if (uVar == null) {
            this.f5703a = f5702c;
            return;
        }
        u uVar2 = this.f5703a;
        if (uVar2 == null || uVar2.j0() < uVar.j0()) {
            this.f5703a = uVar;
        }
    }
}
