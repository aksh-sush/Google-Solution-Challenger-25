package com.google.protobuf;

import android.support.v4.media.session.b;
import com.google.protobuf.f;
import com.google.protobuf.f0;
import com.google.protobuf.v;
import com.google.protobuf.z1;
import java.util.Iterator;
import java.util.Map;

final class x0 implements l1 {

    /* renamed from: a  reason: collision with root package name */
    private final t0 f8826a;

    /* renamed from: b  reason: collision with root package name */
    private final t1 f8827b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8828c;

    /* renamed from: d  reason: collision with root package name */
    private final s f8829d;

    private x0(t1 t1Var, s sVar, t0 t0Var) {
        this.f8827b = t1Var;
        this.f8828c = sVar.e(t0Var);
        this.f8829d = sVar;
        this.f8826a = t0Var;
    }

    private int k(t1 t1Var, Object obj) {
        return t1Var.i(t1Var.g(obj));
    }

    private void l(t1 t1Var, s sVar, Object obj, j1 j1Var, r rVar) {
        Object f10 = t1Var.f(obj);
        v d10 = sVar.d(obj);
        do {
            try {
                if (j1Var.t() == Integer.MAX_VALUE) {
                    t1Var.o(obj, f10);
                    return;
                }
            } finally {
                t1Var.o(obj, f10);
            }
        } while (n(j1Var, rVar, sVar, d10, t1Var, f10));
    }

    static x0 m(t1 t1Var, s sVar, t0 t0Var) {
        return new x0(t1Var, sVar, t0Var);
    }

    private boolean n(j1 j1Var, r rVar, s sVar, v vVar, t1 t1Var, Object obj) {
        int c10 = j1Var.c();
        if (c10 == z1.f8874a) {
            Object obj2 = null;
            j jVar = null;
            int i10 = 0;
            while (j1Var.t() != Integer.MAX_VALUE) {
                int c11 = j1Var.c();
                if (c11 == z1.f8876c) {
                    i10 = j1Var.D();
                    obj2 = sVar.b(rVar, this.f8826a, i10);
                } else if (c11 == z1.f8877d) {
                    if (obj2 != null) {
                        sVar.h(j1Var, obj2, rVar, vVar);
                    } else {
                        jVar = j1Var.B();
                    }
                } else if (!j1Var.F()) {
                    break;
                }
            }
            if (j1Var.c() == z1.f8875b) {
                if (jVar != null) {
                    if (obj2 != null) {
                        sVar.i(jVar, obj2, rVar, vVar);
                    } else {
                        t1Var.d(obj, i10, jVar);
                    }
                }
                return true;
            }
            throw d0.a();
        } else if (z1.b(c10) != 2) {
            return j1Var.F();
        } else {
            Object b10 = sVar.b(rVar, this.f8826a, z1.a(c10));
            if (b10 == null) {
                return t1Var.m(obj, j1Var);
            }
            sVar.h(j1Var, b10, rVar, vVar);
            return true;
        }
    }

    private void o(t1 t1Var, Object obj, a2 a2Var) {
        t1Var.s(t1Var.g(obj), a2Var);
    }

    public void a(Object obj, Object obj2) {
        n1.G(this.f8827b, obj, obj2);
        if (this.f8828c) {
            n1.E(this.f8829d, obj, obj2);
        }
    }

    public void b(Object obj, a2 a2Var) {
        Iterator q10 = this.f8829d.c(obj).q();
        while (q10.hasNext()) {
            Map.Entry entry = (Map.Entry) q10.next();
            v.b bVar = (v.b) entry.getKey();
            if (bVar.j() != z1.c.MESSAGE || bVar.b() || bVar.k()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (!(entry instanceof f0.a)) {
                a2Var.h(bVar.getNumber(), entry.getValue());
            } else {
                bVar.getNumber();
                ((f0.a) entry).a();
                throw null;
            }
        }
        o(this.f8827b, obj, a2Var);
    }

    public void c(Object obj) {
        this.f8827b.j(obj);
        this.f8829d.f(obj);
    }

    public final boolean d(Object obj) {
        return this.f8829d.c(obj).n();
    }

    public void e(Object obj, j1 j1Var, r rVar) {
        l(this.f8827b, this.f8829d, obj, j1Var, rVar);
    }

    public boolean f(Object obj, Object obj2) {
        if (!this.f8827b.g(obj).equals(this.f8827b.g(obj2))) {
            return false;
        }
        if (this.f8828c) {
            return this.f8829d.c(obj).equals(this.f8829d.c(obj2));
        }
        return true;
    }

    public void g(Object obj, byte[] bArr, int i10, int i11, f.a aVar) {
        z zVar = (z) obj;
        if (zVar.unknownFields == u1.c()) {
            zVar.unknownFields = u1.n();
        }
        b.a(obj);
        throw null;
    }

    public int h(Object obj) {
        int k10 = k(this.f8827b, obj) + 0;
        return this.f8828c ? k10 + this.f8829d.c(obj).i() : k10;
    }

    public Object i() {
        return this.f8826a.newBuilderForType().buildPartial();
    }

    public int j(Object obj) {
        int hashCode = this.f8827b.g(obj).hashCode();
        return this.f8828c ? (hashCode * 53) + this.f8829d.c(obj).hashCode() : hashCode;
    }
}
