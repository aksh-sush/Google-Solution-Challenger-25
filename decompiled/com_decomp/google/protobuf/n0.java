package com.google.protobuf;

import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class n0 extends LinkedHashMap {

    /* renamed from: f  reason: collision with root package name */
    private static final n0 f8699f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8700e = true;

    static {
        n0 n0Var = new n0();
        f8699f = n0Var;
        n0Var.i();
    }

    private n0() {
    }

    static int a(Map map) {
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i10 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return c0.d((byte[]) obj);
        }
        if (!(obj instanceof c0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void c(Map map) {
        for (Object next : map.keySet()) {
            c0.a(next);
            c0.a(map.get(next));
        }
    }

    public static n0 d() {
        return f8699f;
    }

    private void e() {
        if (!h()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean f(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean g(java.util.Map r4, java.util.Map r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.n0.g(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        e();
        super.clear();
    }

    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && g(this, (Map) obj);
    }

    public boolean h() {
        return this.f8700e;
    }

    public int hashCode() {
        return a(this);
    }

    public void i() {
        this.f8700e = false;
    }

    public void j(n0 n0Var) {
        e();
        if (!n0Var.isEmpty()) {
            putAll(n0Var);
        }
    }

    public n0 k() {
        return isEmpty() ? new n0() : new n0(this);
    }

    public Object put(Object obj, Object obj2) {
        e();
        c0.a(obj);
        c0.a(obj2);
        return super.put(obj, obj2);
    }

    public void putAll(Map map) {
        e();
        c(map);
        super.putAll(map);
    }

    public Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    private n0(Map map) {
        super(map);
    }
}
