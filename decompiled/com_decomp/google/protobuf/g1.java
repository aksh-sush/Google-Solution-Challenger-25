package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class g1 {

    /* renamed from: c  reason: collision with root package name */
    private static final g1 f8584c = new g1();

    /* renamed from: a  reason: collision with root package name */
    private final m1 f8585a = new l0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f8586b = new ConcurrentHashMap();

    private g1() {
    }

    public static g1 a() {
        return f8584c;
    }

    public void b(Object obj, j1 j1Var, r rVar) {
        e(obj).e(obj, j1Var, rVar);
    }

    public l1 c(Class cls, l1 l1Var) {
        c0.b(cls, "messageType");
        c0.b(l1Var, "schema");
        return (l1) this.f8586b.putIfAbsent(cls, l1Var);
    }

    public l1 d(Class cls) {
        c0.b(cls, "messageType");
        l1 l1Var = (l1) this.f8586b.get(cls);
        if (l1Var != null) {
            return l1Var;
        }
        l1 a10 = this.f8585a.a(cls);
        l1 c10 = c(cls, a10);
        return c10 != null ? c10 : a10;
    }

    public l1 e(Object obj) {
        return d(obj.getClass());
    }
}
