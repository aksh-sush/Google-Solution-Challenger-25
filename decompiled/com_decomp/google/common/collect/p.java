package com.google.common.collect;

import java.io.Serializable;
import java.util.Map;

abstract class p extends s {

    private static class a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final o f7639e;

        a(o oVar) {
            this.f7639e = oVar;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.f7639e.entrySet();
        }
    }

    p() {
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = u().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    public int hashCode() {
        return u().hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return u().h();
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return u().g();
    }

    public int size() {
        return u().size();
    }

    /* access modifiers changed from: package-private */
    public abstract o u();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new a(u());
    }
}
