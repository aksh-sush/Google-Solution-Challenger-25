package com.google.protobuf;

import com.google.protobuf.c0;
import java.util.Collections;
import java.util.List;

abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0 f8612a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final j0 f8613b = new c();

    private static final class b extends j0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class f8614c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) x1.E(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.h0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.h0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.i0
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.h0 r0 = new com.google.protobuf.h0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.e1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.c0.i
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.c0$i r0 = (com.google.protobuf.c0.i) r0
                com.google.protobuf.c0$i r6 = r0.a(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.x1.S(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class r1 = f8614c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                com.google.protobuf.x1.S(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.w1
                if (r1 == 0) goto L_0x005f
                com.google.protobuf.h0 r1 = new com.google.protobuf.h0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.w1 r0 = (com.google.protobuf.w1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof com.google.protobuf.e1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof com.google.protobuf.c0.i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                com.google.protobuf.c0$i r1 = (com.google.protobuf.c0.i) r1
                boolean r2 = r1.T()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.c0$i r0 = r1.a(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) x1.E(obj, j10);
            if (list instanceof i0) {
                obj2 = ((i0) list).B();
            } else if (!f8614c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof e1) || !(list instanceof c0.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    c0.i iVar = (c0.i) list;
                    if (iVar.T()) {
                        iVar.c();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            x1.S(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            x1.S(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends j0 {
        private c() {
            super();
        }

        static c0.i f(Object obj, long j10) {
            return (c0.i) x1.E(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).c();
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            c0.i f10 = f(obj, j10);
            c0.i f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.T()) {
                    f10 = f10.a(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            x1.S(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            c0.i f10 = f(obj, j10);
            if (f10.T()) {
                return f10;
            }
            int size = f10.size();
            c0.i a10 = f10.a(size == 0 ? 10 : size * 2);
            x1.S(obj, j10, a10);
            return a10;
        }
    }

    private j0() {
    }

    static j0 a() {
        return f8612a;
    }

    static j0 b() {
        return f8613b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract List e(Object obj, long j10);
}
