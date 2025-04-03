package com.google.protobuf;

import com.google.protobuf.c0;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f8701a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final t1 f8702b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final t1 f8703c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final t1 f8704d = new v1();

    static Object A(int i10, List list, c0.e eVar, Object obj, t1 t1Var) {
        if (eVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = L(i10, intValue, obj, t1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!eVar.a(intValue2)) {
                    obj = L(i10, intValue2, obj, t1Var);
                    it.remove();
                }
            }
        }
        return obj;
    }

    private static Class B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static t1 C(boolean z10) {
        try {
            Class D = D();
            if (D == null) {
                return null;
            }
            return (t1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void E(s sVar, Object obj, Object obj2) {
        v c10 = sVar.c(obj2);
        if (!c10.m()) {
            sVar.d(obj).s(c10);
        }
    }

    static void F(o0 o0Var, Object obj, Object obj2, long j10) {
        x1.S(obj, j10, o0Var.a(x1.E(obj, j10), x1.E(obj2, j10)));
    }

    static void G(t1 t1Var, Object obj, Object obj2) {
        t1Var.p(obj, t1Var.k(t1Var.g(obj), t1Var.g(obj2)));
    }

    public static t1 H() {
        return f8702b;
    }

    public static t1 I() {
        return f8703c;
    }

    public static void J(Class cls) {
        Class cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = f8701a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static Object L(int i10, int i11, Object obj, t1 t1Var) {
        if (obj == null) {
            obj = t1Var.n();
        }
        t1Var.e(obj, i10, (long) i11);
        return obj;
    }

    public static t1 M() {
        return f8704d;
    }

    public static void N(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.v(i10, list, z10);
        }
    }

    public static void O(int i10, List list, a2 a2Var) {
        if (list != null && !list.isEmpty()) {
            a2Var.O(i10, list);
        }
    }

    public static void P(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.M(i10, list, z10);
        }
    }

    public static void Q(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.L(i10, list, z10);
        }
    }

    public static void R(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.t(i10, list, z10);
        }
    }

    public static void S(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.n(i10, list, z10);
        }
    }

    public static void T(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.d(i10, list, z10);
        }
    }

    public static void U(int i10, List list, a2 a2Var, l1 l1Var) {
        if (list != null && !list.isEmpty()) {
            a2Var.b(i10, list, l1Var);
        }
    }

    public static void V(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.c(i10, list, z10);
        }
    }

    public static void W(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.K(i10, list, z10);
        }
    }

    public static void X(int i10, List list, a2 a2Var, l1 l1Var) {
        if (list != null && !list.isEmpty()) {
            a2Var.a(i10, list, l1Var);
        }
    }

    public static void Y(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.o(i10, list, z10);
        }
    }

    public static void Z(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.s(i10, list, z10);
        }
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? m.T(i10) + m.A(size) : size * m.e(i10, true);
    }

    public static void a0(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.H(i10, list, z10);
        }
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.z(i10, list, z10);
        }
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T = size * m.T(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            T += m.i((j) list.get(i11));
        }
        return T;
    }

    public static void c0(int i10, List list, a2 a2Var) {
        if (list != null && !list.isEmpty()) {
            a2Var.E(i10, list);
        }
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int T = m.T(i10);
        return z10 ? T + m.A(e10) : e10 + (size * T);
    }

    public static void d0(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.y(i10, list, z10);
        }
    }

    static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.m(b0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.m(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List list, a2 a2Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            a2Var.u(i10, list, z10);
        }
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? m.T(i10) + m.A(size * 4) : size * m.n(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? m.T(i10) + m.A(size * 8) : size * m.p(i10, 0);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, l1 l1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += m.t(i10, (t0) list.get(i12), l1Var);
        }
        return i11;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int T = m.T(i10);
        return z10 ? T + m.A(l10) : l10 + (size * T);
    }

    static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.x(b0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? m.T(i10) + m.A(n10) : n10 + (list.size() * m.T(i10));
    }

    static int n(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.z(k0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.z(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, l1 l1Var) {
        return m.D(i10, (t0) obj, l1Var);
    }

    static int p(int i10, List list, l1 l1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T = m.T(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            T += m.F((t0) list.get(i11), l1Var);
        }
        return T;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        int T = m.T(i10);
        return z10 ? T + m.A(r10) : r10 + (size * T);
    }

    static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.O(b0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.O(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        int T = m.T(i10);
        return z10 ? T + m.A(t10) : t10 + (size * T);
    }

    static int t(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.Q(k0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.Q(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int T = m.T(i10) * size;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            while (i11 < size) {
                Object G = i0Var.G(i11);
                T += G instanceof j ? m.i((j) G) : m.S((String) G);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                T += obj instanceof j ? m.i((j) obj) : m.S((String) obj);
                i11++;
            }
        }
        return T;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        int T = m.T(i10);
        return z10 ? T + m.A(w10) : w10 + (size * T);
    }

    static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof b0) {
            b0 b0Var = (b0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.V(b0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.V(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        int T = m.T(i10);
        return z10 ? T + m.A(y10) : y10 + (size * T);
    }

    static int y(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += m.X(k0Var.l(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + m.X(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    static Object z(int i10, List list, c0.d dVar, Object obj, t1 t1Var) {
        if (dVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = L(i10, intValue, obj, t1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (dVar.a(intValue2) == null) {
                    obj = L(i10, intValue2, obj, t1Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
