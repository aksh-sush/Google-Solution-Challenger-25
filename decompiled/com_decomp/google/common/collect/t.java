package com.google.common.collect;

import com.google.common.collect.m0;
import com.google.common.collect.n;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l5.j;

public abstract class t extends d implements Serializable {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f7650a = x.f();

        /* renamed from: b  reason: collision with root package name */
        private Comparator f7651b;

        /* renamed from: c  reason: collision with root package name */
        private Comparator f7652c;

        public t a() {
            int size = this.f7650a.size();
            if (size != 0) {
                return size != 1 ? h0.D(this.f7650a, this.f7651b, this.f7652c) : new k0((m0.a) v.b(this.f7650a));
            }
            return t.v();
        }

        public a b(Object obj, Object obj2, Object obj3) {
            this.f7650a.add(t.q(obj, obj2, obj3));
            return this;
        }
    }

    static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Object[] f7653e;

        /* renamed from: f  reason: collision with root package name */
        private final Object[] f7654f;

        /* renamed from: g  reason: collision with root package name */
        private final Object[] f7655g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f7656h;

        /* renamed from: i  reason: collision with root package name */
        private final int[] f7657i;

        private b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f7653e = objArr;
            this.f7654f = objArr2;
            this.f7655g = objArr3;
            this.f7656h = iArr;
            this.f7657i = iArr2;
        }

        static b a(t tVar, int[] iArr, int[] iArr2) {
            return new b(tVar.d().toArray(), tVar.b().toArray(), tVar.z().toArray(), iArr, iArr2);
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            Object[] objArr = this.f7655g;
            if (objArr.length == 0) {
                return t.v();
            }
            int i10 = 0;
            if (objArr.length == 1) {
                return t.w(this.f7653e[0], this.f7654f[0], objArr[0]);
            }
            n.a aVar = new n.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.f7655g;
                if (i10 >= objArr2.length) {
                    return h0.F(aVar.h(), s.o(this.f7653e), s.o(this.f7654f));
                }
                aVar.a(t.q(this.f7653e[this.f7656h[i10]], this.f7654f[this.f7657i[i10]], objArr2[i10]));
                i10++;
            }
        }
    }

    t() {
    }

    static m0.a q(Object obj, Object obj2, Object obj3) {
        return n0.b(j.p(obj, "rowKey"), j.p(obj2, "columnKey"), j.p(obj3, FirebaseAnalytics.Param.VALUE));
    }

    public static t v() {
        return l0.f7609k;
    }

    public static t w(Object obj, Object obj2, Object obj3) {
        return new k0(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void f() {
        throw new UnsupportedOperationException();
    }

    public boolean g(Object obj) {
        return z().contains(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
        return super.j(obj, obj2);
    }

    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    public final Object l(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final Iterator o() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final p0 e() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: r */
    public s a() {
        return (s) super.a();
    }

    /* renamed from: s */
    public s b() {
        return t().keySet();
    }

    public abstract o t();

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract b u();

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return u();
    }

    /* renamed from: x */
    public s d() {
        return y().keySet();
    }

    public abstract o y();

    public l z() {
        return (l) super.n();
    }
}
