package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.n0;
import com.google.common.collect.z;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l5.g;
import l5.j;

public final class e extends d implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final n f7532g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final n f7533h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final o f7534i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final o f7535j;

    /* renamed from: k  reason: collision with root package name */
    private final Object[][] f7536k;

    /* renamed from: l  reason: collision with root package name */
    private transient f f7537l;

    class a extends a {
        a(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public m0.a b(int i10) {
            return e.this.C(i10);
        }
    }

    class b extends n0.b {

        /* renamed from: e  reason: collision with root package name */
        final int f7539e;

        /* renamed from: f  reason: collision with root package name */
        final int f7540f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f7541g;

        b(int i10) {
            this.f7541g = i10;
            this.f7539e = i10 / e.this.f7533h.size();
            this.f7540f = i10 % e.this.f7533h.size();
        }

        public Object a() {
            return e.this.f7533h.get(this.f7540f);
        }

        public Object b() {
            return e.this.f7532g.get(this.f7539e);
        }

        public Object getValue() {
            return e.this.v(this.f7539e, this.f7540f);
        }
    }

    class c extends a {
        c(int i10) {
            super(i10);
        }

        /* access modifiers changed from: protected */
        public Object b(int i10) {
            return e.this.D(i10);
        }
    }

    private static abstract class d extends z.c {

        /* renamed from: e  reason: collision with root package name */
        private final o f7544e;

        class a extends c {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f7545e;

            a(int i10) {
                this.f7545e = i10;
            }

            public Object getKey() {
                return d.this.c(this.f7545e);
            }

            public Object getValue() {
                return d.this.e(this.f7545e);
            }

            public Object setValue(Object obj) {
                return d.this.f(this.f7545e, obj);
            }
        }

        class b extends a {
            b(int i10) {
                super(i10);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public Map.Entry b(int i10) {
                return d.this.b(i10);
            }
        }

        private d(o oVar) {
            this.f7544e = oVar;
        }

        /* access modifiers changed from: package-private */
        public Iterator a() {
            return new b(size());
        }

        /* access modifiers changed from: package-private */
        public Map.Entry b(int i10) {
            j.m(i10, size());
            return new a(i10);
        }

        /* access modifiers changed from: package-private */
        public Object c(int i10) {
            return this.f7544e.keySet().b().get(i10);
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean containsKey(Object obj) {
            return this.f7544e.containsKey(obj);
        }

        /* access modifiers changed from: package-private */
        public abstract String d();

        /* access modifiers changed from: package-private */
        public abstract Object e(int i10);

        /* access modifiers changed from: package-private */
        public abstract Object f(int i10, Object obj);

        public Object get(Object obj) {
            Integer num = (Integer) this.f7544e.get(obj);
            if (num == null) {
                return null;
            }
            return e(num.intValue());
        }

        public boolean isEmpty() {
            return this.f7544e.isEmpty();
        }

        public Set keySet() {
            return this.f7544e.keySet();
        }

        public Object put(Object obj, Object obj2) {
            Integer num = (Integer) this.f7544e.get(obj);
            if (num != null) {
                return f(num.intValue(), obj2);
            }
            throw new IllegalArgumentException(d() + " " + obj + " not in " + this.f7544e.keySet());
        }

        public Object remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f7544e.size();
        }

        /* synthetic */ d(o oVar, a aVar) {
            this(oVar);
        }
    }

    /* renamed from: com.google.common.collect.e$e  reason: collision with other inner class name */
    private class C0099e extends d {

        /* renamed from: f  reason: collision with root package name */
        final int f7548f;

        C0099e(int i10) {
            super(e.this.f7535j, (a) null);
            this.f7548f = i10;
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "Column";
        }

        /* access modifiers changed from: package-private */
        public Object e(int i10) {
            return e.this.v(this.f7548f, i10);
        }

        /* access modifiers changed from: package-private */
        public Object f(int i10, Object obj) {
            return e.this.F(this.f7548f, i10, obj);
        }
    }

    private class f extends d {
        private f() {
            super(e.this.f7534i, (a) null);
        }

        /* access modifiers changed from: package-private */
        public String d() {
            return "Row";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public Map e(int i10) {
            return new C0099e(i10);
        }

        /* renamed from: h */
        public Map put(Object obj, Map map) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Map f(int i10, Map map) {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ f(e eVar, a aVar) {
            this();
        }
    }

    private e(e eVar) {
        n nVar = eVar.f7532g;
        this.f7532g = nVar;
        n nVar2 = eVar.f7533h;
        this.f7533h = nVar2;
        this.f7534i = eVar.f7534i;
        this.f7535j = eVar.f7535j;
        Object[][] objArr = (Object[][]) Array.newInstance(Object.class, new int[]{nVar.size(), nVar2.size()});
        this.f7536k = objArr;
        for (int i10 = 0; i10 < this.f7532g.size(); i10++) {
            Object[] objArr2 = eVar.f7536k[i10];
            System.arraycopy(objArr2, 0, objArr[i10], 0, objArr2.length);
        }
    }

    public static e A(m0 m0Var) {
        return m0Var instanceof e ? new e((e) m0Var) : new e(m0Var);
    }

    /* access modifiers changed from: private */
    public m0.a C(int i10) {
        return new b(i10);
    }

    /* access modifiers changed from: private */
    public Object D(int i10) {
        return v(i10 / this.f7533h.size(), i10 % this.f7533h.size());
    }

    public void B() {
        for (Object[] fill : this.f7536k) {
            Arrays.fill(fill, (Object) null);
        }
    }

    /* renamed from: E */
    public s d() {
        return this.f7534i.keySet();
    }

    public Object F(int i10, int i11, Object obj) {
        j.m(i10, this.f7532g.size());
        j.m(i11, this.f7533h.size());
        Object[] objArr = this.f7536k[i10];
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Set a() {
        return super.a();
    }

    public Map c() {
        f fVar = this.f7537l;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, (a) null);
        this.f7537l = fVar2;
        return fVar2;
    }

    /* access modifiers changed from: package-private */
    public Iterator e() {
        return new a(size());
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f() {
        throw new UnsupportedOperationException();
    }

    public boolean g(Object obj) {
        for (Object[] objArr : this.f7536k) {
            for (Object a10 : r0[r3]) {
                if (g.a(obj, a10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Object j(Object obj, Object obj2) {
        Integer num = (Integer) this.f7534i.get(obj);
        Integer num2 = (Integer) this.f7535j.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return v(num.intValue(), num2.intValue());
    }

    public Object l(Object obj, Object obj2, Object obj3) {
        j.o(obj);
        j.o(obj2);
        Integer num = (Integer) this.f7534i.get(obj);
        boolean z10 = true;
        j.k(num != null, "Row %s not in %s", obj, this.f7532g);
        Integer num2 = (Integer) this.f7535j.get(obj2);
        if (num2 == null) {
            z10 = false;
        }
        j.k(z10, "Column %s not in %s", obj2, this.f7533h);
        return F(num.intValue(), num2.intValue(), obj3);
    }

    public void m(m0 m0Var) {
        super.m(m0Var);
    }

    /* access modifiers changed from: package-private */
    public Iterator o() {
        return new c(size());
    }

    public int size() {
        return this.f7532g.size() * this.f7533h.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public Object v(int i10, int i11) {
        j.m(i10, this.f7532g.size());
        j.m(i11, this.f7533h.size());
        return this.f7536k[i10][i11];
    }

    /* renamed from: w */
    public s b() {
        return this.f7535j.keySet();
    }

    public boolean x(Object obj, Object obj2) {
        return z(obj) && y(obj2);
    }

    public boolean y(Object obj) {
        return this.f7535j.containsKey(obj);
    }

    public boolean z(Object obj) {
        return this.f7534i.containsKey(obj);
    }

    private e(m0 m0Var) {
        this(m0Var.d(), m0Var.b());
        m(m0Var);
    }

    private e(Iterable iterable, Iterable iterable2) {
        n o10 = n.o(iterable);
        this.f7532g = o10;
        n o11 = n.o(iterable2);
        this.f7533h = o11;
        j.d(o10.isEmpty() == o11.isEmpty());
        this.f7534i = z.d(o10);
        this.f7535j = z.d(o11);
        this.f7536k = (Object[][]) Array.newInstance(Object.class, new int[]{o10.size(), o11.size()});
        B();
    }
}
