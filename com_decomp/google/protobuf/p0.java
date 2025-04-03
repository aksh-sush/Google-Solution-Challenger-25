package com.google.protobuf;

import com.google.protobuf.m0;
import java.util.Map;

class p0 implements o0 {
    p0() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        m0 m0Var = (m0) obj2;
        int i11 = 0;
        if (n0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : n0Var.entrySet()) {
            i11 += m0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static n0 j(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        n0 n0Var2 = (n0) obj2;
        if (!n0Var2.isEmpty()) {
            if (!n0Var.h()) {
                n0Var = n0Var.k();
            }
            n0Var.j(n0Var2);
        }
        return n0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return n0.d().k();
    }

    public int c(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((n0) obj).h();
    }

    public Object e(Object obj) {
        ((n0) obj).i();
        return obj;
    }

    public m0.a f(Object obj) {
        return ((m0) obj).c();
    }

    public Map g(Object obj) {
        return (n0) obj;
    }

    public Map h(Object obj) {
        return (n0) obj;
    }
}
