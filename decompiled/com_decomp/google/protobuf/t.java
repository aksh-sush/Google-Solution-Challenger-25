package com.google.protobuf;

import android.support.v4.media.session.b;
import com.google.protobuf.z;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

final class t extends s {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8741a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z1$b[] r0 = com.google.protobuf.z1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8741a = r0
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f8741a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.a.<clinit>():void");
        }
    }

    t() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry entry) {
        return ((z.c) entry.getKey()).getNumber();
    }

    /* access modifiers changed from: package-private */
    public Object b(r rVar, t0 t0Var, int i10) {
        return rVar.a(t0Var, i10);
    }

    /* access modifiers changed from: package-private */
    public v c(Object obj) {
        b.a(obj);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public v d(Object obj) {
        b.a(obj);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public boolean e(t0 t0Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).r();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        r4 = java.lang.Long.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g(com.google.protobuf.j1 r4, java.lang.Object r5, com.google.protobuf.r r6, com.google.protobuf.v r7, java.lang.Object r8, com.google.protobuf.t1 r9) {
        /*
            r3 = this;
            com.google.protobuf.z$d r5 = (com.google.protobuf.z.d) r5
            int r0 = r5.d()
            com.google.protobuf.z$c r1 = r5.f8865d
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00d2
            com.google.protobuf.z$c r1 = r5.f8865d
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x00d2
            int[] r6 = com.google.protobuf.t.a.f8741a
            com.google.protobuf.z1$b r1 = r5.b()
            int r1 = r1.ordinal()
            r6 = r6[r1]
            switch(r6) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009f;
                case 6: goto L_0x0096;
                case 7: goto L_0x008d;
                case 8: goto L_0x0084;
                case 9: goto L_0x007b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0069;
                case 12: goto L_0x0060;
                case 13: goto L_0x0056;
                case 14: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Type cannot be packed: "
            r6.append(r7)
            com.google.protobuf.z$c r5 = r5.f8865d
            com.google.protobuf.z1$b r5 = r5.e()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0042:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.P(r6)
            com.google.protobuf.z$c r4 = r5.f8865d
            com.google.protobuf.c0$d r4 = r4.c()
            java.lang.Object r8 = com.google.protobuf.n1.z(r0, r6, r4, r8, r9)
            goto L_0x00cb
        L_0x0056:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.i(r6)
            goto L_0x00cb
        L_0x0060:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.a(r6)
            goto L_0x00cb
        L_0x0069:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.K(r6)
            goto L_0x00cb
        L_0x0072:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.g(r6)
            goto L_0x00cb
        L_0x007b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.l(r6)
            goto L_0x00cb
        L_0x0084:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.n(r6)
            goto L_0x00cb
        L_0x008d:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.e(r6)
            goto L_0x00cb
        L_0x0096:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.N(r6)
            goto L_0x00cb
        L_0x009f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.O(r6)
            goto L_0x00cb
        L_0x00a8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.y(r6)
            goto L_0x00cb
        L_0x00b1:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.J(r6)
            goto L_0x00cb
        L_0x00ba:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.C(r6)
            goto L_0x00cb
        L_0x00c3:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4.I(r6)
        L_0x00cb:
            com.google.protobuf.z$c r4 = r5.f8865d
            r7.v(r4, r6)
            goto L_0x01b5
        L_0x00d2:
            com.google.protobuf.z1$b r1 = r5.b()
            com.google.protobuf.z1$b r2 = com.google.protobuf.z1.b.ENUM
            if (r1 != r2) goto L_0x00ef
            int r4 = r4.E()
            com.google.protobuf.z$c r6 = r5.f8865d
            com.google.protobuf.c0$d r6 = r6.c()
            com.google.protobuf.c0$c r6 = r6.a(r4)
            if (r6 != 0) goto L_0x015f
            java.lang.Object r4 = com.google.protobuf.n1.L(r0, r4, r8, r9)
            return r4
        L_0x00ef:
            int[] r9 = com.google.protobuf.t.a.f8741a
            com.google.protobuf.z1$b r0 = r5.b()
            int r0 = r0.ordinal()
            r9 = r9[r0]
            switch(r9) {
                case 1: goto L_0x017b;
                case 2: goto L_0x0172;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015b;
                case 6: goto L_0x0156;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0143;
                case 10: goto L_0x013e;
                case 11: goto L_0x0139;
                case 12: goto L_0x0134;
                case 13: goto L_0x012f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0122;
                case 16: goto L_0x011d;
                case 17: goto L_0x010f;
                case 18: goto L_0x0101;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            r4 = 0
            goto L_0x0183
        L_0x0101:
            com.google.protobuf.t0 r9 = r5.c()
            java.lang.Class r9 = r9.getClass()
            java.lang.Object r4 = r4.m(r9, r6)
            goto L_0x0183
        L_0x010f:
            com.google.protobuf.t0 r9 = r5.c()
            java.lang.Class r9 = r9.getClass()
            java.lang.Object r4 = r4.q(r9, r6)
            goto L_0x0183
        L_0x011d:
            java.lang.String r4 = r4.o()
            goto L_0x0183
        L_0x0122:
            com.google.protobuf.j r4 = r4.B()
            goto L_0x0183
        L_0x0127:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Shouldn't reach here."
            r4.<init>(r5)
            throw r4
        L_0x012f:
            long r0 = r4.k()
            goto L_0x016d
        L_0x0134:
            int r4 = r4.h()
            goto L_0x015f
        L_0x0139:
            long r0 = r4.v()
            goto L_0x016d
        L_0x013e:
            int r4 = r4.G()
            goto L_0x015f
        L_0x0143:
            int r4 = r4.D()
            goto L_0x015f
        L_0x0148:
            boolean r4 = r4.r()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0183
        L_0x0151:
            int r4 = r4.p()
            goto L_0x015f
        L_0x0156:
            long r0 = r4.f()
            goto L_0x016d
        L_0x015b:
            int r4 = r4.E()
        L_0x015f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0183
        L_0x0164:
            long r0 = r4.d()
            goto L_0x016d
        L_0x0169:
            long r0 = r4.L()
        L_0x016d:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0183
        L_0x0172:
            float r4 = r4.readFloat()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0183
        L_0x017b:
            double r0 = r4.readDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
        L_0x0183:
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x018f
            com.google.protobuf.z$c r5 = r5.f8865d
            r7.a(r5, r4)
            goto L_0x01b5
        L_0x018f:
            int[] r6 = com.google.protobuf.t.a.f8741a
            com.google.protobuf.z1$b r9 = r5.b()
            int r9 = r9.ordinal()
            r6 = r6[r9]
            r9 = 17
            if (r6 == r9) goto L_0x01a4
            r9 = 18
            if (r6 == r9) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            com.google.protobuf.z$c r6 = r5.f8865d
            java.lang.Object r6 = r7.h(r6)
            if (r6 == 0) goto L_0x01b0
            java.lang.Object r4 = com.google.protobuf.c0.h(r6, r4)
        L_0x01b0:
            com.google.protobuf.z$c r5 = r5.f8865d
            r7.v(r5, r4)
        L_0x01b5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t.g(com.google.protobuf.j1, java.lang.Object, com.google.protobuf.r, com.google.protobuf.v, java.lang.Object, com.google.protobuf.t1):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public void h(j1 j1Var, Object obj, r rVar, v vVar) {
        z.d dVar = (z.d) obj;
        vVar.v(dVar.f8865d, j1Var.m(dVar.c().getClass(), rVar));
    }

    /* access modifiers changed from: package-private */
    public void i(j jVar, Object obj, r rVar, v vVar) {
        z.d dVar = (z.d) obj;
        t0 buildPartial = dVar.c().newBuilderForType().buildPartial();
        g Q = g.Q(ByteBuffer.wrap(jVar.H()), true);
        g1.a().b(buildPartial, Q, rVar);
        vVar.v(dVar.f8865d, buildPartial);
        if (Q.t() != Integer.MAX_VALUE) {
            throw d0.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(a2 a2Var, Map.Entry entry) {
        z.c cVar = (z.c) entry.getKey();
        if (cVar.b()) {
            switch (a.f8741a[cVar.e().ordinal()]) {
                case 1:
                    n1.P(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 2:
                    n1.T(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 3:
                    n1.W(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 4:
                    n1.e0(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 5:
                case 14:
                    n1.V(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 6:
                    n1.S(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 7:
                    n1.R(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 8:
                    n1.N(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 9:
                    n1.d0(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 10:
                    n1.Y(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 11:
                    n1.Z(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 12:
                    n1.a0(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 13:
                    n1.b0(cVar.getNumber(), (List) entry.getValue(), a2Var, cVar.k());
                    return;
                case 15:
                    n1.O(cVar.getNumber(), (List) entry.getValue(), a2Var);
                    return;
                case 16:
                    n1.c0(cVar.getNumber(), (List) entry.getValue(), a2Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        n1.U(cVar.getNumber(), (List) entry.getValue(), a2Var, g1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        n1.X(cVar.getNumber(), (List) entry.getValue(), a2Var, g1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.f8741a[cVar.e().ordinal()]) {
                case 1:
                    a2Var.q(cVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    a2Var.D(cVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    a2Var.e(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    a2Var.I(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    a2Var.m(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    a2Var.A(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    a2Var.p(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    a2Var.f(cVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    a2Var.g(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    a2Var.j(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    a2Var.r(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    a2Var.N(cVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    a2Var.C(cVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    a2Var.l(cVar.getNumber(), (j) entry.getValue());
                    return;
                case 16:
                    a2Var.G(cVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    a2Var.i(cVar.getNumber(), entry.getValue(), g1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    a2Var.w(cVar.getNumber(), entry.getValue(), g1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
