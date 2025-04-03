package com.google.common.collect;

import com.google.common.collect.m0;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import l5.d;
import l5.g;

public abstract class n0 {

    /* renamed from: a  reason: collision with root package name */
    private static final d f7622a = new a();

    static class a implements d {
        a() {
        }

        /* renamed from: a */
        public Map apply(Map map) {
            return Collections.unmodifiableMap(map);
        }
    }

    static abstract class b implements m0.a {
        b() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m0.a)) {
                return false;
            }
            m0.a aVar = (m0.a) obj;
            return g.a(b(), aVar.b()) && g.a(a(), aVar.a()) && g.a(getValue(), aVar.getValue());
        }

        public int hashCode() {
            return g.b(b(), a(), getValue());
        }

        public String toString() {
            return "(" + b() + "," + a() + ")=" + getValue();
        }
    }

    static final class c extends b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        private final Object f7623e;

        /* renamed from: f  reason: collision with root package name */
        private final Object f7624f;

        /* renamed from: g  reason: collision with root package name */
        private final Object f7625g;

        c(Object obj, Object obj2, Object obj3) {
            this.f7623e = obj;
            this.f7624f = obj2;
            this.f7625g = obj3;
        }

        public Object a() {
            return this.f7624f;
        }

        public Object b() {
            return this.f7623e;
        }

        public Object getValue() {
            return this.f7625g;
        }
    }

    static boolean a(m0 m0Var, Object obj) {
        if (obj == m0Var) {
            return true;
        }
        if (obj instanceof m0) {
            return m0Var.a().equals(((m0) obj).a());
        }
        return false;
    }

    public static m0.a b(Object obj, Object obj2, Object obj3) {
        return new c(obj, obj2, obj3);
    }
}
