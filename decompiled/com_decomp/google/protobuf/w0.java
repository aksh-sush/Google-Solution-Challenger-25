package com.google.protobuf;

import android.support.v4.media.session.b;
import com.google.protobuf.a2;
import com.google.protobuf.c0;
import com.google.protobuf.f;
import com.google.protobuf.z1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class w0 implements l1 {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f8797r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f8798s = x1.F();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f8799a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f8800b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8801c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8802d;

    /* renamed from: e  reason: collision with root package name */
    private final t0 f8803e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f8804f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8805g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8806h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f8807i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f8808j;

    /* renamed from: k  reason: collision with root package name */
    private final int f8809k;

    /* renamed from: l  reason: collision with root package name */
    private final int f8810l;

    /* renamed from: m  reason: collision with root package name */
    private final y0 f8811m;

    /* renamed from: n  reason: collision with root package name */
    private final j0 f8812n;

    /* renamed from: o  reason: collision with root package name */
    private final t1 f8813o;

    /* renamed from: p  reason: collision with root package name */
    private final s f8814p;

    /* renamed from: q  reason: collision with root package name */
    private final o0 f8815q;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8816a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.z1$b[] r0 = com.google.protobuf.z1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8816a = r0
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8816a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.a.<clinit>():void");
        }
    }

    private w0(int[] iArr, Object[] objArr, int i10, int i11, t0 t0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, y0 y0Var, j0 j0Var, t1 t1Var, s sVar, o0 o0Var) {
        this.f8799a = iArr;
        this.f8800b = objArr;
        this.f8801c = i10;
        this.f8802d = i11;
        this.f8805g = t0Var instanceof z;
        this.f8806h = z10;
        this.f8804f = sVar != null && sVar.e(t0Var);
        this.f8807i = z11;
        this.f8808j = iArr2;
        this.f8809k = i12;
        this.f8810l = i13;
        this.f8811m = y0Var;
        this.f8812n = j0Var;
        this.f8813o = t1Var;
        this.f8814p = sVar;
        this.f8803e = t0Var;
        this.f8815q = o0Var;
    }

    private static boolean A(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean B(Object obj, int i10) {
        int h02 = h0(i10);
        long j10 = (long) (1048575 & h02);
        if (j10 == 1048575) {
            int r02 = r0(i10);
            long U = U(r02);
            switch (q0(r02)) {
                case 0:
                    return x1.y(obj, U) != 0.0d;
                case 1:
                    return x1.z(obj, U) != 0.0f;
                case 2:
                    return x1.C(obj, U) != 0;
                case 3:
                    return x1.C(obj, U) != 0;
                case 4:
                    return x1.A(obj, U) != 0;
                case 5:
                    return x1.C(obj, U) != 0;
                case 6:
                    return x1.A(obj, U) != 0;
                case 7:
                    return x1.r(obj, U);
                case 8:
                    Object E = x1.E(obj, U);
                    if (E instanceof String) {
                        return !((String) E).isEmpty();
                    }
                    if (E instanceof j) {
                        return !j.f8600f.equals(E);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return x1.E(obj, U) != null;
                case 10:
                    return !j.f8600f.equals(x1.E(obj, U));
                case 11:
                    return x1.A(obj, U) != 0;
                case 12:
                    return x1.A(obj, U) != 0;
                case 13:
                    return x1.A(obj, U) != 0;
                case 14:
                    return x1.C(obj, U) != 0;
                case 15:
                    return x1.A(obj, U) != 0;
                case 16:
                    return x1.C(obj, U) != 0;
                case 17:
                    return x1.E(obj, U) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (x1.A(obj, j10) & (1 << (h02 >>> 20))) != 0;
        }
    }

    private boolean C(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return B(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean D(Object obj, int i10, l1 l1Var) {
        return l1Var.d(x1.E(obj, U(i10)));
    }

    private boolean E(Object obj, int i10, int i11) {
        List list = (List) x1.E(obj, U(i10));
        if (list.isEmpty()) {
            return true;
        }
        l1 u10 = u(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!u10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean F(Object obj, int i10, int i11) {
        Map g10 = this.f8815q.g(x1.E(obj, U(i10)));
        if (g10.isEmpty()) {
            return true;
        }
        if (this.f8815q.f(t(i11)).f8695c.a() != z1.c.MESSAGE) {
            return true;
        }
        l1 l1Var = null;
        for (Object next : g10.values()) {
            if (l1Var == null) {
                l1Var = g1.a().d(next.getClass());
            }
            if (!l1Var.d(next)) {
                return false;
            }
        }
        return true;
    }

    private boolean G(Object obj, Object obj2, int i10) {
        long h02 = (long) (h0(i10) & 1048575);
        return x1.A(obj, h02) == x1.A(obj2, h02);
    }

    private boolean H(Object obj, int i10, int i11) {
        return x1.A(obj, (long) (h0(i11) & 1048575)) == i10;
    }

    private static boolean I(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static List J(Object obj, long j10) {
        return (List) x1.E(obj, j10);
    }

    private static long K(Object obj, long j10) {
        return x1.C(obj, j10);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private void L(com.google.protobuf.t1 r17, com.google.protobuf.s r18, java.lang.Object r19, com.google.protobuf.j1 r20, com.google.protobuf.r r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.t()     // Catch:{ all -> 0x054f }
            int r3 = r8.f0(r1)     // Catch:{ all -> 0x054f }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f8809k
        L_0x001e:
            int r1 = r8.f8810l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f8808j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f8804f     // Catch:{ all -> 0x054f }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.protobuf.t0 r2 = r8.f8803e     // Catch:{ all -> 0x054f }
            r15 = r18
            java.lang.Object r1 = r15.b(r11, r2, r1)     // Catch:{ all -> 0x054f }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            com.google.protobuf.v r1 = r18.d(r19)     // Catch:{ all -> 0x054f }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x054f }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x054f }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.F()     // Catch:{ all -> 0x054f }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x054f }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x054f }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f8809k
        L_0x0079:
            int r1 = r8.f8810l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f8808j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.r0(r3)     // Catch:{ all -> 0x054f }
            int r2 = q0(r4)     // Catch:{ a -> 0x0508 }
            switch(r2) {
                case 0: goto L_0x04dd;
                case 1: goto L_0x04d0;
                case 2: goto L_0x04c3;
                case 3: goto L_0x04b6;
                case 4: goto L_0x04a9;
                case 5: goto L_0x049c;
                case 6: goto L_0x048f;
                case 7: goto L_0x0482;
                case 8: goto L_0x047d;
                case 9: goto L_0x044c;
                case 10: goto L_0x0440;
                case 11: goto L_0x0434;
                case 12: goto L_0x0425;
                case 13: goto L_0x0419;
                case 14: goto L_0x040d;
                case 15: goto L_0x0401;
                case 16: goto L_0x03f5;
                case 17: goto L_0x03be;
                case 18: goto L_0x03b2;
                case 19: goto L_0x03a6;
                case 20: goto L_0x039a;
                case 21: goto L_0x038e;
                case 22: goto L_0x0382;
                case 23: goto L_0x0376;
                case 24: goto L_0x036a;
                case 25: goto L_0x035e;
                case 26: goto L_0x0359;
                case 27: goto L_0x0347;
                case 28: goto L_0x0338;
                case 29: goto L_0x032c;
                case 30: goto L_0x031a;
                case 31: goto L_0x030e;
                case 32: goto L_0x0302;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02ea;
                case 35: goto L_0x02db;
                case 36: goto L_0x02cc;
                case 37: goto L_0x02bd;
                case 38: goto L_0x02ae;
                case 39: goto L_0x029f;
                case 40: goto L_0x0290;
                case 41: goto L_0x0281;
                case 42: goto L_0x0272;
                case 43: goto L_0x0263;
                case 44: goto L_0x024d;
                case 45: goto L_0x023e;
                case 46: goto L_0x022f;
                case 47: goto L_0x0220;
                case 48: goto L_0x0211;
                case 49: goto L_0x01fb;
                case 50: goto L_0x01ea;
                case 51: goto L_0x01d9;
                case 52: goto L_0x01c8;
                case 53: goto L_0x01b7;
                case 54: goto L_0x01a6;
                case 55: goto L_0x0195;
                case 56: goto L_0x0184;
                case 57: goto L_0x0173;
                case 58: goto L_0x0162;
                case 59: goto L_0x015d;
                case 60: goto L_0x0126;
                case 61: goto L_0x011a;
                case 62: goto L_0x010a;
                case 63: goto L_0x00f7;
                case 64: goto L_0x00e7;
                case 65: goto L_0x00d7;
                case 66: goto L_0x00c7;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ a -> 0x0508 }
        L_0x009b:
            if (r13 != 0) goto L_0x04eb
            java.lang.Object r1 = r17.n()     // Catch:{ a -> 0x0508 }
            goto L_0x04ea
        L_0x00a3:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r2 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = r0.A(r2, r11)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
        L_0x00b2:
            r8.o0(r10, r1, r3)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x00b7:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            long r6 = r20.k()     // Catch:{ a -> 0x0508 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x00c7:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            int r2 = r20.h()     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x00d7:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            long r6 = r20.v()     // Catch:{ a -> 0x0508 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x00e7:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            int r2 = r20.G()     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x00f7:
            int r2 = r20.b()     // Catch:{ a -> 0x0508 }
            r8.s(r3)     // Catch:{ a -> 0x0508 }
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x010a:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            int r2 = r20.D()     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x011a:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.j r2 = r20.B()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0126:
            boolean r2 = r8.H(r10, r1, r3)     // Catch:{ a -> 0x0508 }
            if (r2 == 0) goto L_0x0149
            long r5 = U(r4)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = com.google.protobuf.x1.E(r10, r5)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r5 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r5 = r0.w(r5, r11)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = com.google.protobuf.c0.h(r2, r5)     // Catch:{ a -> 0x0508 }
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0149:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r2 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = r0.w(r2, r11)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            r8.n0(r10, r3)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x015d:
            r8.k0(r10, r4, r0)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0162:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            boolean r2 = r20.r()     // Catch:{ a -> 0x0508 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0173:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            int r2 = r20.p()     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0184:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            long r6 = r20.f()     // Catch:{ a -> 0x0508 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x0195:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            int r2 = r20.E()     // Catch:{ a -> 0x0508 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x01a6:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            long r6 = r20.d()     // Catch:{ a -> 0x0508 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x01b7:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            long r6 = r20.L()     // Catch:{ a -> 0x0508 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x01c8:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x0508 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x01d9:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x0508 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r4, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x00b2
        L_0x01ea:
            java.lang.Object r4 = r8.t(r3)     // Catch:{ a -> 0x0508 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.M(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x01fb:
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r6 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.i0(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0211:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x021b:
            r0.i(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0220:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x022a:
            r0.a(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x022f:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x0239:
            r0.K(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x023e:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x0248:
            r0.g(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x024d:
            com.google.protobuf.j0 r2 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0508 }
            r0.P(r2)     // Catch:{ a -> 0x0508 }
            r8.s(r3)     // Catch:{ a -> 0x0508 }
        L_0x025d:
            java.lang.Object r13 = com.google.protobuf.n1.A(r1, r2, r12, r13, r9)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0263:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x026d:
            r0.l(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0272:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x027c:
            r0.n(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0281:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x028b:
            r0.e(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0290:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x029a:
            r0.N(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x029f:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x02a9:
            r0.O(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x02ae:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x02b8:
            r0.y(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x02bd:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x02c7:
            r0.J(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x02cc:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x02d6:
            r0.C(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x02db:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
        L_0x02e5:
            r0.I(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x02ea:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x021b
        L_0x02f6:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x022a
        L_0x0302:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x0239
        L_0x030e:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x0248
        L_0x031a:
            com.google.protobuf.j0 r2 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r2 = r2.e(r10, r4)     // Catch:{ a -> 0x0508 }
            r0.P(r2)     // Catch:{ a -> 0x0508 }
            r8.s(r3)     // Catch:{ a -> 0x0508 }
            goto L_0x025d
        L_0x032c:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x026d
        L_0x0338:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            r0.H(r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0347:
            com.google.protobuf.l1 r5 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.j0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x0359:
            r8.l0(r10, r4, r0)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x035e:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x027c
        L_0x036a:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x028b
        L_0x0376:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x029a
        L_0x0382:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x02a9
        L_0x038e:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x02b8
        L_0x039a:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x02c7
        L_0x03a6:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x02d6
        L_0x03b2:
            com.google.protobuf.j0 r1 = r8.f8812n     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            java.util.List r1 = r1.e(r10, r2)     // Catch:{ a -> 0x0508 }
            goto L_0x02e5
        L_0x03be:
            boolean r1 = r8.B(r10, r3)     // Catch:{ a -> 0x0508 }
            if (r1 == 0) goto L_0x03e1
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            java.lang.Object r1 = com.google.protobuf.x1.E(r10, r1)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r2 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = r0.A(r2, r11)     // Catch:{ a -> 0x0508 }
            java.lang.Object r1 = com.google.protobuf.c0.h(r1, r2)     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
        L_0x03dc:
            com.google.protobuf.x1.S(r10, r2, r1)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x03e1:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r4 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r4 = r0.A(r4, r11)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r1, r4)     // Catch:{ a -> 0x0508 }
        L_0x03f0:
            r8.n0(r10, r3)     // Catch:{ a -> 0x0508 }
            goto L_0x000d
        L_0x03f5:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            long r4 = r20.k()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.R(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0401:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            int r4 = r20.h()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x040d:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            long r4 = r20.v()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.R(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0419:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            int r4 = r20.G()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0425:
            int r1 = r20.b()     // Catch:{ a -> 0x0508 }
            r8.s(r3)     // Catch:{ a -> 0x0508 }
            long r4 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r4, r1)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0434:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            int r4 = r20.D()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0440:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.j r4 = r20.B()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x044c:
            boolean r1 = r8.B(r10, r3)     // Catch:{ a -> 0x0508 }
            if (r1 == 0) goto L_0x046c
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            java.lang.Object r1 = com.google.protobuf.x1.E(r10, r1)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r2 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r2 = r0.w(r2, r11)     // Catch:{ a -> 0x0508 }
            java.lang.Object r1 = com.google.protobuf.c0.h(r1, r2)     // Catch:{ a -> 0x0508 }
            long r2 = U(r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03dc
        L_0x046c:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.l1 r4 = r8.u(r3)     // Catch:{ a -> 0x0508 }
            java.lang.Object r4 = r0.w(r4, r11)     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.S(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x047d:
            r8.k0(r10, r4, r0)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x0482:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            boolean r4 = r20.r()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.I(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x048f:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            int r4 = r20.p()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x049c:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            long r4 = r20.f()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.R(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04a9:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            int r4 = r20.E()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.Q(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04b6:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            long r4 = r20.d()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.R(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04c3:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            long r4 = r20.L()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.R(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04d0:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.P(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04dd:
            long r1 = U(r4)     // Catch:{ a -> 0x0508 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x0508 }
            com.google.protobuf.x1.O(r10, r1, r4)     // Catch:{ a -> 0x0508 }
            goto L_0x03f0
        L_0x04ea:
            r13 = r1
        L_0x04eb:
            boolean r1 = r9.m(r13, r0)     // Catch:{ a -> 0x0508 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f8809k
        L_0x04f3:
            int r1 = r8.f8810l
            if (r0 >= r1) goto L_0x0502
            int[] r1 = r8.f8808j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x04f3
        L_0x0502:
            if (r13 == 0) goto L_0x0507
            r9.o(r10, r13)
        L_0x0507:
            return
        L_0x0508:
            boolean r1 = r9.q(r0)     // Catch:{ all -> 0x054f }
            if (r1 == 0) goto L_0x052b
            boolean r1 = r20.F()     // Catch:{ all -> 0x054f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f8809k
        L_0x0516:
            int r1 = r8.f8810l
            if (r0 >= r1) goto L_0x0525
            int[] r1 = r8.f8808j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0516
        L_0x0525:
            if (r13 == 0) goto L_0x052a
            r9.o(r10, r13)
        L_0x052a:
            return
        L_0x052b:
            if (r13 != 0) goto L_0x0532
            java.lang.Object r1 = r9.f(r10)     // Catch:{ all -> 0x054f }
            r13 = r1
        L_0x0532:
            boolean r1 = r9.m(r13, r0)     // Catch:{ all -> 0x054f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f8809k
        L_0x053a:
            int r1 = r8.f8810l
            if (r0 >= r1) goto L_0x0549
            int[] r1 = r8.f8808j
            r1 = r1[r0]
            java.lang.Object r13 = r8.q(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x053a
        L_0x0549:
            if (r13 == 0) goto L_0x054e
            r9.o(r10, r13)
        L_0x054e:
            return
        L_0x054f:
            r0 = move-exception
            int r1 = r8.f8809k
        L_0x0552:
            int r2 = r8.f8810l
            if (r1 >= r2) goto L_0x0561
            int[] r2 = r8.f8808j
            r2 = r2[r1]
            java.lang.Object r13 = r8.q(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0552
        L_0x0561:
            if (r13 == 0) goto L_0x0566
            r9.o(r10, r13)
        L_0x0566:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.L(com.google.protobuf.t1, com.google.protobuf.s, java.lang.Object, com.google.protobuf.j1, com.google.protobuf.r):void");
    }

    private final void M(Object obj, int i10, Object obj2, r rVar, j1 j1Var) {
        long U = U(r0(i10));
        Object E = x1.E(obj, U);
        if (E == null) {
            E = this.f8815q.b(obj2);
            x1.S(obj, U, E);
        } else if (this.f8815q.d(E)) {
            Object b10 = this.f8815q.b(obj2);
            this.f8815q.a(b10, E);
            x1.S(obj, U, b10);
            E = b10;
        }
        j1Var.x(this.f8815q.h(E), this.f8815q.f(obj2), rVar);
    }

    private void N(Object obj, Object obj2, int i10) {
        long U = U(r0(i10));
        if (B(obj2, i10)) {
            Object E = x1.E(obj, U);
            Object E2 = x1.E(obj2, U);
            if (E != null && E2 != null) {
                E2 = c0.h(E, E2);
            } else if (E2 == null) {
                return;
            }
            x1.S(obj, U, E2);
            n0(obj, i10);
        }
    }

    private void O(Object obj, Object obj2, int i10) {
        int r02 = r0(i10);
        int T = T(i10);
        long U = U(r02);
        if (H(obj2, T, i10)) {
            Object E = H(obj, T, i10) ? x1.E(obj, U) : null;
            Object E2 = x1.E(obj2, U);
            if (E != null && E2 != null) {
                E2 = c0.h(E, E2);
            } else if (E2 == null) {
                return;
            }
            x1.S(obj, U, E2);
            o0(obj, T, i10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        com.google.protobuf.x1.S(r6, r1, com.google.protobuf.x1.E(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        com.google.protobuf.x1.Q(r6, r1, com.google.protobuf.x1.A(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        com.google.protobuf.x1.R(r6, r1, com.google.protobuf.x1.C(r7, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        n0(r6, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        com.google.protobuf.x1.S(r6, r1, com.google.protobuf.x1.E(r7, r1));
        o0(r6, r3, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P(java.lang.Object r6, java.lang.Object r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.r0(r8)
            long r1 = U(r0)
            int r3 = r5.T(r8)
            int r0 = q0(r0)
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a3;
                case 5: goto L_0x009c;
                case 6: goto L_0x0095;
                case 7: goto L_0x0087;
                case 8: goto L_0x0079;
                case 9: goto L_0x0074;
                case 10: goto L_0x006d;
                case 11: goto L_0x0066;
                case 12: goto L_0x005f;
                case 13: goto L_0x0058;
                case 14: goto L_0x0050;
                case 15: goto L_0x0049;
                case 16: goto L_0x0041;
                case 17: goto L_0x0074;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x0033;
                case 51: goto L_0x0021;
                case 52: goto L_0x0021;
                case 53: goto L_0x0021;
                case 54: goto L_0x0021;
                case 55: goto L_0x0021;
                case 56: goto L_0x0021;
                case 57: goto L_0x0021;
                case 58: goto L_0x0021;
                case 59: goto L_0x0021;
                case 60: goto L_0x001c;
                case 61: goto L_0x0015;
                case 62: goto L_0x0015;
                case 63: goto L_0x0015;
                case 64: goto L_0x0015;
                case 65: goto L_0x0015;
                case 66: goto L_0x0015;
                case 67: goto L_0x0015;
                case 68: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00e4
        L_0x0015:
            boolean r0 = r5.H(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0027
        L_0x001c:
            r5.O(r6, r7, r8)
            goto L_0x00e4
        L_0x0021:
            boolean r0 = r5.H(r7, r3, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0027:
            java.lang.Object r7 = com.google.protobuf.x1.E(r7, r1)
            com.google.protobuf.x1.S(r6, r1, r7)
            r5.o0(r6, r3, r8)
            goto L_0x00e4
        L_0x0033:
            com.google.protobuf.o0 r8 = r5.f8815q
            com.google.protobuf.n1.F(r8, r6, r7, r1)
            goto L_0x00e4
        L_0x003a:
            com.google.protobuf.j0 r8 = r5.f8812n
            r8.d(r6, r7, r1)
            goto L_0x00e4
        L_0x0041:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0049:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x0050:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x0058:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x0065
        L_0x005f:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x0065:
            goto L_0x00a9
        L_0x0066:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x006d:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x007f
        L_0x0074:
            r5.N(r6, r7, r8)
            goto L_0x00e4
        L_0x0079:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x007f:
            java.lang.Object r7 = com.google.protobuf.x1.E(r7, r1)
            com.google.protobuf.x1.S(r6, r1, r7)
            goto L_0x00e1
        L_0x0087:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            boolean r7 = com.google.protobuf.x1.r(r7, r1)
            com.google.protobuf.x1.I(r6, r1, r7)
            goto L_0x00e1
        L_0x0095:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00a9
        L_0x009c:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00a3:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00a9:
            int r7 = com.google.protobuf.x1.A(r7, r1)
            com.google.protobuf.x1.Q(r6, r1, r7)
            goto L_0x00e1
        L_0x00b1:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            goto L_0x00be
        L_0x00b8:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
        L_0x00be:
            long r3 = com.google.protobuf.x1.C(r7, r1)
            com.google.protobuf.x1.R(r6, r1, r3)
            goto L_0x00e1
        L_0x00c6:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            float r7 = com.google.protobuf.x1.z(r7, r1)
            com.google.protobuf.x1.P(r6, r1, r7)
            goto L_0x00e1
        L_0x00d4:
            boolean r0 = r5.B(r7, r8)
            if (r0 == 0) goto L_0x00e4
            double r3 = com.google.protobuf.x1.y(r7, r1)
            com.google.protobuf.x1.O(r6, r1, r3)
        L_0x00e1:
            r5.n0(r6, r8)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.P(java.lang.Object, java.lang.Object, int):void");
    }

    static w0 Q(Class cls, r0 r0Var, y0 y0Var, j0 j0Var, t1 t1Var, s sVar, o0 o0Var) {
        if (r0Var instanceof i1) {
            return S((i1) r0Var, y0Var, j0Var, t1Var, sVar, o0Var);
        }
        b.a(r0Var);
        return R((p1) null, y0Var, j0Var, t1Var, sVar, o0Var);
    }

    static w0 R(p1 p1Var, y0 y0Var, j0 j0Var, t1 t1Var, s sVar, o0 o0Var) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.protobuf.w0 S(com.google.protobuf.i1 r34, com.google.protobuf.y0 r35, com.google.protobuf.j0 r36, com.google.protobuf.t1 r37, com.google.protobuf.s r38, com.google.protobuf.o0 r39) {
        /*
            com.google.protobuf.f1 r0 = r34.b()
            com.google.protobuf.f1 r1 = com.google.protobuf.f1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r34.e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f8797r
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0161
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0161:
            sun.misc.Unsafe r15 = f8798s
            java.lang.Object[] r17 = r34.d()
            com.google.protobuf.t0 r18 = r34.c()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0180:
            if (r4 >= r1) goto L_0x03c0
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a8
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0190:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0190
        L_0x01a2:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01aa
        L_0x01a8:
            r3 = r24
        L_0x01aa:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b8:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d1
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b8
        L_0x01d1:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01db
        L_0x01d7:
            r28 = r1
            r1 = r24
        L_0x01db:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e8
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e8:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0217
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fd:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0212
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fd
        L_0x0212:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0217:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0237
            r14 = 17
            if (r12 != r14) goto L_0x0224
            goto L_0x0237
        L_0x0224:
            r14 = 12
            if (r12 != r14) goto L_0x0245
            if (r10 != 0) goto L_0x0245
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0243
        L_0x0237:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0243:
            r16 = r14
        L_0x0245:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0250
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0258
        L_0x0250:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m0(r2, r12)
            r17[r1] = r12
        L_0x0258:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026b
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0273
        L_0x026b:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m0(r2, r8)
            r17[r1] = r8
        L_0x0273:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r31 = r0
            r0 = r10
            r8 = r11
            r29 = r32
            r25 = 1
            r10 = r9
            r9 = r1
            r1 = 0
            goto L_0x0388
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x031c
            r8 = 1
            goto L_0x031d
        L_0x031c:
            r8 = 0
        L_0x031d:
            if (r8 == 0) goto L_0x036e
            r8 = 17
            if (r5 > r8) goto L_0x036e
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0348
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0332:
            int r29 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0344
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r29
            goto L_0x0332
        L_0x0344:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x034a
        L_0x0348:
            r29 = r8
        L_0x034a:
            int r8 = r6 * 2
            int r26 = r1 / 32
            int r8 = r8 + r26
            r12 = r17[r8]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035b
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0363
        L_0x035b:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m0(r2, r12)
            r17[r8] = r12
        L_0x0363:
            r0 = r10
            r8 = r11
            long r10 = r15.objectFieldOffset(r12)
            int r11 = (int) r10
            int r1 = r1 % 32
            r10 = r11
            goto L_0x0378
        L_0x036e:
            r31 = r0
            r0 = r10
            r8 = r11
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0378:
            r11 = 18
            if (r5 < r11) goto L_0x0386
            r11 = 49
            if (r5 > r11) goto L_0x0386
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x0386:
            r16 = r27
        L_0x0388:
            int r11 = r21 + 1
            r7[r21] = r4
            int r4 = r11 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0395
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0396
        L_0x0395:
            r12 = 0
        L_0x0396:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039d
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039e
        L_0x039d:
            r3 = 0
        L_0x039e:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r11] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r10
            r7[r4] = r1
            r10 = r0
            r11 = r8
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0180
        L_0x03c0:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            r8 = r11
            com.google.protobuf.w0 r1 = new com.google.protobuf.w0
            com.google.protobuf.t0 r9 = r34.c()
            r11 = 0
            r4 = r1
            r5 = r7
            r6 = r8
            r7 = r14
            r8 = r33
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.S(com.google.protobuf.i1, com.google.protobuf.y0, com.google.protobuf.j0, com.google.protobuf.t1, com.google.protobuf.s, com.google.protobuf.o0):com.google.protobuf.w0");
    }

    private int T(int i10) {
        return this.f8799a[i10];
    }

    private static long U(int i10) {
        return (long) (i10 & 1048575);
    }

    private static boolean V(Object obj, long j10) {
        return ((Boolean) x1.E(obj, j10)).booleanValue();
    }

    private static double W(Object obj, long j10) {
        return ((Double) x1.E(obj, j10)).doubleValue();
    }

    private static float X(Object obj, long j10) {
        return ((Float) x1.E(obj, j10)).floatValue();
    }

    private static int Y(Object obj, long j10) {
        return ((Integer) x1.E(obj, j10)).intValue();
    }

    private static long Z(Object obj, long j10) {
        return ((Long) x1.E(obj, j10)).longValue();
    }

    private int a0(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, f.a aVar) {
        Object obj2 = obj;
        long j11 = j10;
        Unsafe unsafe = f8798s;
        int i13 = i12;
        Object t10 = t(i12);
        Object object = unsafe.getObject(obj, j11);
        if (this.f8815q.d(object)) {
            Object b10 = this.f8815q.b(t10);
            this.f8815q.a(b10, object);
            unsafe.putObject(obj, j11, b10);
            object = b10;
        }
        return m(bArr, i10, i11, this.f8815q.f(t10), this.f8815q.h(object), aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011b, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int b0(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.protobuf.f.a r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r8 = r22
            r2 = r23
            r9 = r26
            r5 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f8798s
            int[] r6 = r0.f8799a
            int r7 = r5 + 2
            r6 = r6[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r7
            long r13 = (long) r6
            r6 = 5
            r7 = 1
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0133;
                case 52: goto L_0x0123;
                case 53: goto L_0x0113;
                case 54: goto L_0x0113;
                case 55: goto L_0x0106;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00f0;
                case 58: goto L_0x00db;
                case 59: goto L_0x00ad;
                case 60: goto L_0x0089;
                case 61: goto L_0x007f;
                case 62: goto L_0x0106;
                case 63: goto L_0x0072;
                case 64: goto L_0x00f0;
                case 65: goto L_0x00fb;
                case 66: goto L_0x0064;
                case 67: goto L_0x0056;
                case 68: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0146
        L_0x0027:
            r6 = 3
            if (r2 != r6) goto L_0x0146
            r2 = r21 & -8
            r6 = r2 | 4
            com.google.protobuf.l1 r2 = r0.u(r5)
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.google.protobuf.f.m(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x0049
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004a
        L_0x0049:
            r15 = 0
        L_0x004a:
            java.lang.Object r3 = r11.f8570c
            if (r15 != 0) goto L_0x0050
            goto L_0x011f
        L_0x0050:
            java.lang.Object r3 = com.google.protobuf.c0.h(r15, r3)
            goto L_0x011f
        L_0x0056:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.K(r3, r4, r11)
            long r3 = r11.f8569b
            long r3 = com.google.protobuf.k.c(r3)
            goto L_0x011b
        L_0x0064:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.H(r3, r4, r11)
            int r3 = r11.f8568a
            int r3 = com.google.protobuf.k.b(r3)
            goto L_0x010e
        L_0x0072:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.H(r3, r4, r11)
            int r3 = r11.f8568a
            r0.s(r5)
            goto L_0x010e
        L_0x007f:
            if (r2 != r15) goto L_0x0146
            int r2 = com.google.protobuf.f.b(r3, r4, r11)
            java.lang.Object r3 = r11.f8570c
            goto L_0x011f
        L_0x0089:
            if (r2 != r15) goto L_0x0146
            com.google.protobuf.l1 r2 = r0.u(r5)
            r5 = r20
            int r2 = com.google.protobuf.f.o(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00a0
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00a1
        L_0x00a0:
            r15 = 0
        L_0x00a1:
            java.lang.Object r3 = r11.f8570c
            if (r15 != 0) goto L_0x00a7
            goto L_0x011f
        L_0x00a7:
            java.lang.Object r3 = com.google.protobuf.c0.h(r15, r3)
            goto L_0x011f
        L_0x00ad:
            if (r2 != r15) goto L_0x0146
            int r2 = com.google.protobuf.f.H(r3, r4, r11)
            int r4 = r11.f8568a
            if (r4 != 0) goto L_0x00ba
            java.lang.String r3 = ""
            goto L_0x011f
        L_0x00ba:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00ce
            int r5 = r2 + r4
            boolean r5 = com.google.protobuf.y1.t(r3, r2, r5)
            if (r5 == 0) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            com.google.protobuf.d0 r1 = com.google.protobuf.d0.c()
            throw r1
        L_0x00ce:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.protobuf.c0.f8540a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
            goto L_0x0142
        L_0x00db:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.K(r3, r4, r11)
            long r3 = r11.f8569b
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r7 = 0
        L_0x00eb:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            goto L_0x011f
        L_0x00f0:
            if (r2 != r6) goto L_0x0146
            int r2 = com.google.protobuf.f.g(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x012d
        L_0x00fb:
            if (r2 != r7) goto L_0x0146
            long r2 = com.google.protobuf.f.i(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x013d
        L_0x0106:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.H(r3, r4, r11)
            int r3 = r11.f8568a
        L_0x010e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x011f
        L_0x0113:
            if (r2 != 0) goto L_0x0146
            int r2 = com.google.protobuf.f.K(r3, r4, r11)
            long r3 = r11.f8569b
        L_0x011b:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x011f:
            r12.putObject(r1, r9, r3)
            goto L_0x0142
        L_0x0123:
            if (r2 != r6) goto L_0x0146
            float r2 = com.google.protobuf.f.k(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x012d:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0142
        L_0x0133:
            if (r2 != r7) goto L_0x0146
            double r2 = com.google.protobuf.f.d(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x013d:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0142:
            r12.putInt(r1, r13, r8)
            goto L_0x0147
        L_0x0146:
            r2 = r4
        L_0x0147:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.b0(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.protobuf.f$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d4, code lost:
        if (r0 != r15) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f5, code lost:
        if (r0 != r15) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f8, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r18 = r32;
        r11 = r34;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008c, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        r9.putObject(r14, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f1, code lost:
        r6 = r6 | r20;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c1, code lost:
        r2 = r8;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d8, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f7, code lost:
        r6 = r32;
        r2 = r4;
        r19 = r8;
        r28 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028f, code lost:
        if (r0 != r15) goto L_0x0291;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int d0(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.f.a r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f8798s
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0017:
            if (r0 >= r13) goto L_0x031d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.protobuf.f.G(r0, r12, r3, r11)
            int r3 = r11.f8568a
            r4 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r4 = r3
        L_0x002c:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.g0(r5, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.f0(r5)
        L_0x003d:
            r2 = r0
            if (r2 != r8) goto L_0x004b
            r2 = r4
            r18 = r5
            r28 = r9
            r19 = 0
        L_0x0047:
            r27 = -1
            goto L_0x02fa
        L_0x004b:
            int[] r0 = r15.f8799a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = q0(r1)
            long r10 = U(r1)
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x0200
            int[] r8 = r15.f8799a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L_0x0083
            if (r7 == r10) goto L_0x007b
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x007b:
            if (r8 == r10) goto L_0x0082
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0082:
            r7 = r8
        L_0x0083:
            r8 = 5
            switch(r0) {
                case 0: goto L_0x01db;
                case 1: goto L_0x01c5;
                case 2: goto L_0x01a3;
                case 3: goto L_0x01a3;
                case 4: goto L_0x018e;
                case 5: goto L_0x0170;
                case 6: goto L_0x015b;
                case 7: goto L_0x0139;
                case 8: goto L_0x0118;
                case 9: goto L_0x00f6;
                case 10: goto L_0x00de;
                case 11: goto L_0x018e;
                case 12: goto L_0x00cb;
                case 13: goto L_0x015b;
                case 14: goto L_0x0170;
                case 15: goto L_0x00b1;
                case 16: goto L_0x0090;
                default: goto L_0x0087;
            }
        L_0x0087:
            r18 = r32
            r11 = r34
            r8 = r2
        L_0x008c:
            r32 = r6
            goto L_0x01f7
        L_0x0090:
            if (r3 != 0) goto L_0x0087
            r11 = r34
            r0 = r22
            int r8 = com.google.protobuf.f.K(r12, r4, r11)
            long r3 = r11.f8569b
            long r4 = com.google.protobuf.k.c(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r18 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            goto L_0x01c1
        L_0x00b1:
            r18 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x008c
            int r0 = com.google.protobuf.f.H(r12, r4, r11)
            int r1 = r11.f8568a
            int r1 = com.google.protobuf.k.b(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            r6 = r6 | r20
            goto L_0x01f2
        L_0x00cb:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x008c
            int r2 = com.google.protobuf.f.H(r12, r4, r11)
            int r3 = r11.f8568a
            r9.putInt(r14, r0, r3)
            goto L_0x00f1
        L_0x00de:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008c
            int r2 = com.google.protobuf.f.b(r12, r4, r11)
            java.lang.Object r3 = r11.f8570c
        L_0x00ee:
            r9.putObject(r14, r0, r3)
        L_0x00f1:
            r6 = r6 | r20
            r0 = r2
            goto L_0x01f2
        L_0x00f6:
            r18 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008c
            com.google.protobuf.l1 r2 = r15.u(r8)
            int r2 = com.google.protobuf.f.o(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0111
            java.lang.Object r3 = r11.f8570c
            goto L_0x00ee
        L_0x0111:
            java.lang.Object r4 = r11.f8570c
            java.lang.Object r3 = com.google.protobuf.c0.h(r3, r4)
            goto L_0x00ee
        L_0x0118:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x01f7
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x012e
            int r0 = com.google.protobuf.f.B(r12, r4, r11)
            goto L_0x0132
        L_0x012e:
            int r0 = com.google.protobuf.f.E(r12, r4, r11)
        L_0x0132:
            java.lang.Object r1 = r11.f8570c
            r9.putObject(r14, r5, r1)
            goto L_0x01f0
        L_0x0139:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != 0) goto L_0x01f7
            int r1 = com.google.protobuf.f.K(r12, r4, r11)
            long r2 = r11.f8569b
            r21 = 0
            int r4 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r4 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r0 = 0
        L_0x0153:
            com.google.protobuf.x1.I(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x01f2
        L_0x015b:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 5
            if (r3 != r0) goto L_0x01f7
            int r0 = com.google.protobuf.f.g(r12, r4)
            r9.putInt(r14, r5, r0)
            goto L_0x01d8
        L_0x0170:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != r0) goto L_0x01f7
            long r21 = com.google.protobuf.f.i(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r6 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r6 + 8
            goto L_0x01f0
        L_0x018e:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x01f7
            int r0 = com.google.protobuf.f.H(r12, r4, r11)
            int r1 = r11.f8568a
            r9.putInt(r14, r5, r1)
            goto L_0x01f0
        L_0x01a3:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x01f7
            int r17 = com.google.protobuf.f.K(r12, r4, r11)
            long r2 = r11.f8569b
            r0 = r9
            r1 = r30
            r21 = r2
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
        L_0x01c1:
            r2 = r8
            r0 = r17
            goto L_0x01f3
        L_0x01c5:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 5
            if (r3 != r0) goto L_0x01f7
            float r0 = com.google.protobuf.f.k(r12, r4)
            com.google.protobuf.x1.P(r14, r5, r0)
        L_0x01d8:
            int r0 = r4 + 4
            goto L_0x01f0
        L_0x01db:
            r18 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 1
            if (r3 != r0) goto L_0x01f7
            double r0 = com.google.protobuf.f.d(r12, r4)
            com.google.protobuf.x1.O(r14, r5, r0)
            int r0 = r4 + 8
        L_0x01f0:
            r6 = r32 | r20
        L_0x01f2:
            r2 = r8
        L_0x01f3:
            r1 = r18
            goto L_0x031a
        L_0x01f7:
            r6 = r32
            r2 = r4
            r19 = r8
            r28 = r9
            goto L_0x0047
        L_0x0200:
            r18 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r34
            r2 = 27
            if (r0 != r2) goto L_0x025a
            r2 = 2
            if (r3 != r2) goto L_0x024d
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.protobuf.c0$i r0 = (com.google.protobuf.c0.i) r0
            boolean r1 = r0.T()
            if (r1 != 0) goto L_0x0230
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0227
            r1 = 10
            goto L_0x0229
        L_0x0227:
            int r1 = r1 * 2
        L_0x0229:
            com.google.protobuf.c0$i r0 = r0.a(r1)
            r9.putObject(r14, r5, r0)
        L_0x0230:
            r5 = r0
            com.google.protobuf.l1 r0 = r15.u(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.protobuf.f.p(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r15
            r1 = r18
            r8 = -1
            r15 = r29
            goto L_0x0017
        L_0x024d:
            r15 = r4
            r26 = r7
            r19 = r8
            r28 = r9
            r23 = r20
            r27 = -1
            goto L_0x02d7
        L_0x025a:
            r15 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02a5
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r22 = r3
            r3 = r4
            r23 = r15
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r18
            r26 = r7
            r7 = r22
            r19 = r8
            r27 = -1
            r28 = r9
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02f8
        L_0x0291:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
            r6 = r23
            r7 = r26
            goto L_0x0318
        L_0x02a5:
            r32 = r0
            r22 = r3
            r24 = r5
            r26 = r7
            r19 = r8
            r28 = r9
            r23 = r15
            r27 = -1
            r15 = r4
            r0 = 50
            r9 = r32
            r7 = r22
            if (r9 != r0) goto L_0x02dd
            r0 = 2
            if (r7 != r0) goto L_0x02d7
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r24
            r8 = r34
            int r0 = r0.a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02f8
            goto L_0x0291
        L_0x02d7:
            r2 = r15
        L_0x02d8:
            r6 = r23
            r7 = r26
            goto L_0x02fa
        L_0x02dd:
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r18
            r10 = r24
            r12 = r19
            r13 = r34
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02f8
            goto L_0x0291
        L_0x02f8:
            r2 = r0
            goto L_0x02d8
        L_0x02fa:
            com.google.protobuf.u1 r4 = v(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.protobuf.f.F(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r18
            r2 = r19
        L_0x0318:
            r9 = r28
        L_0x031a:
            r8 = -1
            goto L_0x0017
        L_0x031d:
            r23 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0330
            long r1 = (long) r7
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0330:
            r1 = r33
            if (r0 != r1) goto L_0x0335
            return r0
        L_0x0335:
            com.google.protobuf.d0 r0 = com.google.protobuf.d0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.d0(java.lang.Object, byte[], int, int, com.google.protobuf.f$a):int");
    }

    private int e0(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, f.a aVar) {
        int i17;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        f.a aVar2 = aVar;
        Unsafe unsafe = f8798s;
        c0.i iVar = (c0.i) unsafe.getObject(obj, j12);
        if (!iVar.T()) {
            int size = iVar.size();
            iVar = iVar.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j12, iVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i19 == 2) {
                    return f.r(bArr, i18, iVar, aVar2);
                }
                if (i19 == 1) {
                    return f.e(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return f.u(bArr, i18, iVar, aVar2);
                }
                if (i19 == 5) {
                    return f.l(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return f.y(bArr, i18, iVar, aVar2);
                }
                if (i19 == 0) {
                    return f.L(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return f.x(bArr, i18, iVar, aVar2);
                }
                if (i19 == 0) {
                    return f.I(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return f.t(bArr, i18, iVar, aVar2);
                }
                if (i19 == 1) {
                    return f.j(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return f.s(bArr, i18, iVar, aVar2);
                }
                if (i19 == 5) {
                    return f.h(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return f.q(bArr, i18, iVar, aVar2);
                }
                if (i19 == 0) {
                    return f.a(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    int i21 = ((j10 & 536870912) > 0 ? 1 : ((j10 & 536870912) == 0 ? 0 : -1));
                    byte[] bArr3 = bArr;
                    int i22 = i10;
                    int i23 = i11;
                    c0.i iVar2 = iVar;
                    f.a aVar3 = aVar;
                    return i21 == 0 ? f.C(i12, bArr3, i22, i23, iVar2, aVar3) : f.D(i12, bArr3, i22, i23, iVar2, aVar3);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return f.p(u(i20), i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return f.c(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = f.x(bArr, i18, iVar, aVar2);
                } else if (i19 == 0) {
                    i17 = f.I(i12, bArr, i10, i11, iVar, aVar);
                }
                z zVar = (z) obj2;
                u1 u1Var = zVar.unknownFields;
                if (u1Var == u1.c()) {
                    u1Var = null;
                }
                s(i20);
                u1 u1Var2 = (u1) n1.A(i13, iVar, (c0.e) null, u1Var, this.f8813o);
                if (u1Var2 != null) {
                    zVar.unknownFields = u1Var2;
                }
                return i17;
            case 33:
            case 47:
                if (i19 == 2) {
                    return f.v(bArr, i18, iVar, aVar2);
                }
                if (i19 == 0) {
                    return f.z(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return f.w(bArr, i18, iVar, aVar2);
                }
                if (i19 == 0) {
                    return f.A(i12, bArr, i10, i11, iVar, aVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return f.n(u(i20), i12, bArr, i10, i11, iVar, aVar);
                }
                break;
        }
        return i18;
    }

    private int f0(int i10) {
        if (i10 < this.f8801c || i10 > this.f8802d) {
            return -1;
        }
        return p0(i10, 0);
    }

    private int g0(int i10, int i11) {
        if (i10 < this.f8801c || i10 > this.f8802d) {
            return -1;
        }
        return p0(i10, i11);
    }

    private int h0(int i10) {
        return this.f8799a[i10 + 2];
    }

    private void i0(Object obj, long j10, j1 j1Var, l1 l1Var, r rVar) {
        j1Var.j(this.f8812n.e(obj, j10), l1Var, rVar);
    }

    private void j0(Object obj, int i10, j1 j1Var, l1 l1Var, r rVar) {
        j1Var.s(this.f8812n.e(obj, U(i10)), l1Var, rVar);
    }

    private boolean k(Object obj, Object obj2, int i10) {
        return B(obj, i10) == B(obj2, i10);
    }

    private void k0(Object obj, int i10, j1 j1Var) {
        long U;
        Object B;
        if (A(i10)) {
            U = U(i10);
            B = j1Var.M();
        } else if (this.f8805g) {
            U = U(i10);
            B = j1Var.o();
        } else {
            U = U(i10);
            B = j1Var.B();
        }
        x1.S(obj, U, B);
    }

    private static boolean l(Object obj, long j10) {
        return x1.r(obj, j10);
    }

    private void l0(Object obj, int i10, j1 j1Var) {
        if (A(i10)) {
            j1Var.z(this.f8812n.e(obj, U(i10)));
        } else {
            j1Var.u(this.f8812n.e(obj, U(i10)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [byte, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m(byte[] r15, int r16, int r17, com.google.protobuf.m0.a r18, java.util.Map r19, com.google.protobuf.f.a r20) {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = com.google.protobuf.f.H(r15, r0, r10)
            int r1 = r10.f8568a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            java.lang.Object r1 = r9.f8694b
            java.lang.Object r2 = r9.f8696d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = com.google.protobuf.f.G(r0, r15, r1, r10)
            int r1 = r10.f8568a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.z1$b r1 = r9.f8695c
            int r1 = r1.c()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.z1$b r4 = r9.f8695c
            java.lang.Object r0 = r9.f8696d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f8570c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.z1$b r1 = r9.f8693a
            int r1 = r1.c()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.z1$b r4 = r9.f8693a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f8570c
            goto L_0x001d
        L_0x006f:
            int r0 = com.google.protobuf.f.M(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.d0 r0 = com.google.protobuf.d0.g()
            throw r0
        L_0x0081:
            com.google.protobuf.d0 r0 = com.google.protobuf.d0.k()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.m(byte[], int, int, com.google.protobuf.m0$a, java.util.Map, com.google.protobuf.f$a):int");
    }

    private static Field m0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r7.f8570c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r7.f8570c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r7.f8570c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int n(byte[] r2, int r3, int r4, com.google.protobuf.z1.b r5, java.lang.Class r6, com.google.protobuf.f.a r7) {
        /*
            r1 = this;
            int[] r0 = com.google.protobuf.w0.a.f8816a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = com.google.protobuf.f.E(r2, r3, r7)
            goto L_0x0099
        L_0x0019:
            int r2 = com.google.protobuf.f.K(r2, r3, r7)
            long r3 = r7.f8569b
            long r3 = com.google.protobuf.k.c(r3)
            goto L_0x0042
        L_0x0024:
            int r2 = com.google.protobuf.f.H(r2, r3, r7)
            int r3 = r7.f8568a
            int r3 = com.google.protobuf.k.b(r3)
            goto L_0x004d
        L_0x002f:
            com.google.protobuf.g1 r5 = com.google.protobuf.g1.a()
            com.google.protobuf.l1 r5 = r5.d(r6)
            int r2 = com.google.protobuf.f.o(r5, r2, r3, r4, r7)
            goto L_0x0099
        L_0x003c:
            int r2 = com.google.protobuf.f.K(r2, r3, r7)
            long r3 = r7.f8569b
        L_0x0042:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0051
        L_0x0047:
            int r2 = com.google.protobuf.f.H(r2, r3, r7)
            int r3 = r7.f8568a
        L_0x004d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x0051:
            r7.f8570c = r3
            goto L_0x0099
        L_0x0054:
            float r2 = com.google.protobuf.f.k(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x006e
        L_0x005d:
            long r4 = com.google.protobuf.f.i(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x007b
        L_0x0066:
            int r2 = com.google.protobuf.f.g(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x006e:
            r7.f8570c = r2
            int r2 = r3 + 4
            goto L_0x0099
        L_0x0073:
            double r4 = com.google.protobuf.f.d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
        L_0x007b:
            r7.f8570c = r2
            int r2 = r3 + 8
            goto L_0x0099
        L_0x0080:
            int r2 = com.google.protobuf.f.b(r2, r3, r7)
            goto L_0x0099
        L_0x0085:
            int r2 = com.google.protobuf.f.K(r2, r3, r7)
            long r3 = r7.f8569b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r3 = 1
            goto L_0x0094
        L_0x0093:
            r3 = 0
        L_0x0094:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0051
        L_0x0099:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.n(byte[], int, int, com.google.protobuf.z1$b, java.lang.Class, com.google.protobuf.f$a):int");
    }

    private void n0(Object obj, int i10) {
        int h02 = h0(i10);
        long j10 = (long) (1048575 & h02);
        if (j10 != 1048575) {
            x1.Q(obj, j10, (1 << (h02 >>> 20)) | x1.A(obj, j10));
        }
    }

    private static double o(Object obj, long j10) {
        return x1.y(obj, j10);
    }

    private void o0(Object obj, int i10, int i11) {
        x1.Q(obj, (long) (h0(i11) & 1048575), i10);
    }

    private boolean p(Object obj, Object obj2, int i10) {
        int r02 = r0(i10);
        long U = U(r02);
        switch (q0(r02)) {
            case 0:
                return k(obj, obj2, i10) && Double.doubleToLongBits(x1.y(obj, U)) == Double.doubleToLongBits(x1.y(obj2, U));
            case 1:
                return k(obj, obj2, i10) && Float.floatToIntBits(x1.z(obj, U)) == Float.floatToIntBits(x1.z(obj2, U));
            case 2:
                return k(obj, obj2, i10) && x1.C(obj, U) == x1.C(obj2, U);
            case 3:
                return k(obj, obj2, i10) && x1.C(obj, U) == x1.C(obj2, U);
            case 4:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 5:
                return k(obj, obj2, i10) && x1.C(obj, U) == x1.C(obj2, U);
            case 6:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 7:
                return k(obj, obj2, i10) && x1.r(obj, U) == x1.r(obj2, U);
            case 8:
                return k(obj, obj2, i10) && n1.K(x1.E(obj, U), x1.E(obj2, U));
            case 9:
                return k(obj, obj2, i10) && n1.K(x1.E(obj, U), x1.E(obj2, U));
            case 10:
                return k(obj, obj2, i10) && n1.K(x1.E(obj, U), x1.E(obj2, U));
            case 11:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 12:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 13:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 14:
                return k(obj, obj2, i10) && x1.C(obj, U) == x1.C(obj2, U);
            case 15:
                return k(obj, obj2, i10) && x1.A(obj, U) == x1.A(obj2, U);
            case 16:
                return k(obj, obj2, i10) && x1.C(obj, U) == x1.C(obj2, U);
            case 17:
                return k(obj, obj2, i10) && n1.K(x1.E(obj, U), x1.E(obj2, U));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return n1.K(x1.E(obj, U), x1.E(obj2, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return G(obj, obj2, i10) && n1.K(x1.E(obj, U), x1.E(obj2, U));
            default:
                return true;
        }
    }

    private int p0(int i10, int i11) {
        int length = (this.f8799a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int T = T(i13);
            if (i10 == T) {
                return i13;
            }
            if (i10 < T) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final Object q(Object obj, int i10, Object obj2, t1 t1Var) {
        T(i10);
        if (x1.E(obj, U(r0(i10))) == null) {
            return obj2;
        }
        s(i10);
        return obj2;
    }

    private static int q0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static float r(Object obj, long j10) {
        return x1.z(obj, j10);
    }

    private int r0(int i10) {
        return this.f8799a[i10 + 1];
    }

    private c0.e s(int i10) {
        b.a(this.f8800b[((i10 / 3) * 2) + 1]);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s0(java.lang.Object r18, com.google.protobuf.a2 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f8804f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.s r3 = r0.f8814p
            com.google.protobuf.v r3 = r3.c(r1)
            boolean r5 = r3.m()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.q()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f8799a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f8798s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x0030:
            if (r10 >= r6) goto L_0x048f
            int r13 = r0.r0(r10)
            int r14 = r0.T(r10)
            int r15 = q0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0058
            int[] r4 = r0.f8799a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0052
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0052:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.protobuf.s r9 = r0.f8814p
            int r9 = r9.a(r5)
            if (r9 > r14) goto L_0x0077
            com.google.protobuf.s r9 = r0.f8814p
            r9.j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            long r8 = U(r13)
            switch(r15) {
                case 0: goto L_0x047d;
                case 1: goto L_0x0471;
                case 2: goto L_0x0465;
                case 3: goto L_0x0459;
                case 4: goto L_0x044d;
                case 5: goto L_0x0441;
                case 6: goto L_0x0435;
                case 7: goto L_0x0429;
                case 8: goto L_0x041d;
                case 9: goto L_0x040c;
                case 10: goto L_0x03fd;
                case 11: goto L_0x03f0;
                case 12: goto L_0x03e3;
                case 13: goto L_0x03d6;
                case 14: goto L_0x03c9;
                case 15: goto L_0x03bc;
                case 16: goto L_0x03af;
                case 17: goto L_0x039e;
                case 18: goto L_0x038e;
                case 19: goto L_0x037e;
                case 20: goto L_0x036e;
                case 21: goto L_0x035e;
                case 22: goto L_0x034e;
                case 23: goto L_0x033e;
                case 24: goto L_0x032e;
                case 25: goto L_0x031e;
                case 26: goto L_0x030f;
                case 27: goto L_0x02fc;
                case 28: goto L_0x02ed;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02cd;
                case 31: goto L_0x02bd;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029d;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r13 = 0
            goto L_0x0488
        L_0x0081:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.l1 r8 = r0.u(r10)
            r2.i(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = Z(r1, r8)
            r2.C(r14, r8)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.N(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = Z(r1, r8)
            r2.r(r14, r8)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.j(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.J(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.g(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.j r4 = (com.google.protobuf.j) r4
            r2.l(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.l1 r8 = r0.u(r10)
            r2.w(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.w0(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = V(r1, r8)
            r2.f(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.p(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = Z(r1, r8)
            r2.A(r14, r8)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Y(r1, r8)
            r2.m(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = Z(r1, r8)
            r2.I(r14, r8)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r8 = Z(r1, r8)
            r2.e(r14, r8)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = X(r1, r8)
            r2.D(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.H(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r8 = W(r1, r8)
            r2.q(r14, r8)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.v0(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.l1 r9 = r0.u(r10)
            com.google.protobuf.n1.U(r4, r8, r2, r9)
            goto L_0x007e
        L_0x01ad:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.n1.b0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bd:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.a0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01cd:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Z(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01dd:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Y(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01ed:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Q(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01fd:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.d0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x020d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.N(r4, r8, r2, r13)
            goto L_0x007e
        L_0x021d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.R(r4, r8, r2, r13)
            goto L_0x007e
        L_0x022d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.S(r4, r8, r2, r13)
            goto L_0x007e
        L_0x023d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.V(r4, r8, r2, r13)
            goto L_0x007e
        L_0x024d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.e0(r4, r8, r2, r13)
            goto L_0x007e
        L_0x025d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.W(r4, r8, r2, r13)
            goto L_0x007e
        L_0x026d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.T(r4, r8, r2, r13)
            goto L_0x007e
        L_0x027d:
            r13 = 1
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.P(r4, r8, r2, r13)
            goto L_0x007e
        L_0x028d:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.n1.b0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x029d:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.a0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ad:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Z(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02bd:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Y(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02cd:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.Q(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02dd:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.d0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x02ed:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.O(r4, r8, r2)
            goto L_0x007e
        L_0x02fc:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.l1 r9 = r0.u(r10)
            com.google.protobuf.n1.X(r4, r8, r2, r9)
            goto L_0x007e
        L_0x030f:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.c0(r4, r8, r2)
            goto L_0x007e
        L_0x031e:
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.n1.N(r4, r8, r2, r13)
            goto L_0x0488
        L_0x032e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.R(r4, r8, r2, r13)
            goto L_0x0488
        L_0x033e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.S(r4, r8, r2, r13)
            goto L_0x0488
        L_0x034e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.V(r4, r8, r2, r13)
            goto L_0x0488
        L_0x035e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.e0(r4, r8, r2, r13)
            goto L_0x0488
        L_0x036e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.W(r4, r8, r2, r13)
            goto L_0x0488
        L_0x037e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.T(r4, r8, r2, r13)
            goto L_0x0488
        L_0x038e:
            r13 = 0
            int r4 = r0.T(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.n1.P(r4, r8, r2, r13)
            goto L_0x0488
        L_0x039e:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.l1 r8 = r0.u(r10)
            r2.i(r14, r4, r8)
            goto L_0x0488
        L_0x03af:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.C(r14, r8)
            goto L_0x0488
        L_0x03bc:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.N(r14, r4)
            goto L_0x0488
        L_0x03c9:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.r(r14, r8)
            goto L_0x0488
        L_0x03d6:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.j(r14, r4)
            goto L_0x0488
        L_0x03e3:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.J(r14, r4)
            goto L_0x0488
        L_0x03f0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.g(r14, r4)
            goto L_0x0488
        L_0x03fd:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.j r4 = (com.google.protobuf.j) r4
            r2.l(r14, r4)
            goto L_0x0488
        L_0x040c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.l1 r8 = r0.u(r10)
            r2.w(r14, r4, r8)
            goto L_0x0488
        L_0x041d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.w0(r14, r4, r2)
            goto L_0x0488
        L_0x0429:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            boolean r4 = l(r1, r8)
            r2.f(r14, r4)
            goto L_0x0488
        L_0x0435:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.p(r14, r4)
            goto L_0x0488
        L_0x0441:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.A(r14, r8)
            goto L_0x0488
        L_0x044d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            int r4 = r7.getInt(r1, r8)
            r2.m(r14, r4)
            goto L_0x0488
        L_0x0459:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.I(r14, r8)
            goto L_0x0488
        L_0x0465:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            long r8 = r7.getLong(r1, r8)
            r2.e(r14, r8)
            goto L_0x0488
        L_0x0471:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            float r4 = r(r1, r8)
            r2.D(r14, r4)
            goto L_0x0488
        L_0x047d:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0488
            double r8 = o(r1, r8)
            r2.q(r14, r8)
        L_0x0488:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0030
        L_0x048f:
            if (r5 == 0) goto L_0x04a6
            com.google.protobuf.s r4 = r0.f8814p
            r4.j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a4
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048f
        L_0x04a4:
            r5 = 0
            goto L_0x048f
        L_0x04a6:
            com.google.protobuf.t1 r3 = r0.f8813o
            r0.x0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.s0(java.lang.Object, com.google.protobuf.a2):void");
    }

    private Object t(int i10) {
        return this.f8800b[(i10 / 3) * 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d0, code lost:
        r14.i(r7, com.google.protobuf.x1.E(r13, U(r6)), u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ef, code lost:
        r14.C(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0402, code lost:
        r14.N(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0415, code lost:
        r14.r(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0428, code lost:
        r14.j(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x043b, code lost:
        r14.J(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x044e, code lost:
        r14.g(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0459, code lost:
        r14.l(r7, (com.google.protobuf.j) com.google.protobuf.x1.E(r13, U(r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x046e, code lost:
        r14.w(r7, com.google.protobuf.x1.E(r13, U(r6)), u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0485, code lost:
        w0(r7, com.google.protobuf.x1.E(r13, U(r6)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a0, code lost:
        r14.f(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b3, code lost:
        r14.p(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c5, code lost:
        r14.A(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r14.m(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04e9, code lost:
        r14.I(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04fb, code lost:
        r14.e(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x050d, code lost:
        r14.D(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x051f, code lost:
        r14.q(r7, r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t0(java.lang.Object r13, com.google.protobuf.a2 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f8804f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.s r0 = r12.f8814p
            com.google.protobuf.v r0 = r0.c(r13)
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.q()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f8799a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0526
            int r6 = r12.r0(r5)
            int r7 = r12.T(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.s r8 = r12.f8814p
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.s r8 = r12.f8814p
            r8.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = q0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0511;
                case 1: goto L_0x04ff;
                case 2: goto L_0x04ed;
                case 3: goto L_0x04db;
                case 4: goto L_0x04c9;
                case 5: goto L_0x04b7;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0492;
                case 8: goto L_0x047f;
                case 9: goto L_0x0468;
                case 10: goto L_0x0453;
                case 11: goto L_0x0440;
                case 12: goto L_0x042d;
                case 13: goto L_0x041a;
                case 14: goto L_0x0407;
                case 15: goto L_0x03f4;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03ca;
                case 18: goto L_0x03b7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0391;
                case 21: goto L_0x037e;
                case 22: goto L_0x036b;
                case 23: goto L_0x0358;
                case 24: goto L_0x0345;
                case 25: goto L_0x0332;
                case 26: goto L_0x031f;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e2;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02a9;
                case 33: goto L_0x0296;
                case 34: goto L_0x0283;
                case 35: goto L_0x0270;
                case 36: goto L_0x025d;
                case 37: goto L_0x024a;
                case 38: goto L_0x0237;
                case 39: goto L_0x0224;
                case 40: goto L_0x0211;
                case 41: goto L_0x01fe;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01c5;
                case 45: goto L_0x01b2;
                case 46: goto L_0x019f;
                case 47: goto L_0x018c;
                case 48: goto L_0x0179;
                case 49: goto L_0x0162;
                case 50: goto L_0x0155;
                case 51: goto L_0x0145;
                case 52: goto L_0x0135;
                case 53: goto L_0x0125;
                case 54: goto L_0x0115;
                case 55: goto L_0x0105;
                case 56: goto L_0x00f5;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00d5;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00bd;
                case 62: goto L_0x00ad;
                case 63: goto L_0x009d;
                case 64: goto L_0x008d;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0522
        L_0x0055:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x03d0
        L_0x005d:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = Z(r13, r8)
            goto L_0x03ef
        L_0x006d:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x0402
        L_0x007d:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = Z(r13, r8)
            goto L_0x0415
        L_0x008d:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x0428
        L_0x009d:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x043b
        L_0x00ad:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x044e
        L_0x00bd:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0459
        L_0x00c5:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x046e
        L_0x00cd:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            goto L_0x0485
        L_0x00d5:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            boolean r6 = V(r13, r8)
            goto L_0x04a0
        L_0x00e5:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x04b3
        L_0x00f5:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = Z(r13, r8)
            goto L_0x04c5
        L_0x0105:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = Y(r13, r8)
            goto L_0x04d7
        L_0x0115:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = Z(r13, r8)
            goto L_0x04e9
        L_0x0125:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = Z(r13, r8)
            goto L_0x04fb
        L_0x0135:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            float r6 = X(r13, r8)
            goto L_0x050d
        L_0x0145:
            boolean r8 = r12.H(r13, r7, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            double r8 = W(r13, r8)
            goto L_0x051f
        L_0x0155:
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            r12.v0(r14, r7, r6, r5)
            goto L_0x0522
        L_0x0162:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.l1 r8 = r12.u(r5)
            com.google.protobuf.n1.U(r7, r6, r14, r8)
            goto L_0x0522
        L_0x0179:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.b0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x018c:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.a0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x019f:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Z(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01b2:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Y(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01c5:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Q(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01d8:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.d0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01eb:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.N(r7, r6, r14, r9)
            goto L_0x0522
        L_0x01fe:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.R(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0211:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.S(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0224:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.V(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0237:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.e0(r7, r6, r14, r9)
            goto L_0x0522
        L_0x024a:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.W(r7, r6, r14, r9)
            goto L_0x0522
        L_0x025d:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.T(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0270:
            int r7 = r12.T(r5)
            long r10 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.P(r7, r6, r14, r9)
            goto L_0x0522
        L_0x0283:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.b0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0296:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.a0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02a9:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Z(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02bc:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Y(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02cf:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.Q(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02e2:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.d0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x02f5:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.O(r7, r6, r14)
            goto L_0x0522
        L_0x0308:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.l1 r8 = r12.u(r5)
            com.google.protobuf.n1.X(r7, r6, r14, r8)
            goto L_0x0522
        L_0x031f:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.c0(r7, r6, r14)
            goto L_0x0522
        L_0x0332:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.N(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0345:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.R(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0358:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.S(r7, r6, r14, r4)
            goto L_0x0522
        L_0x036b:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.V(r7, r6, r14, r4)
            goto L_0x0522
        L_0x037e:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.e0(r7, r6, r14, r4)
            goto L_0x0522
        L_0x0391:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.W(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03a4:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.T(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03b7:
            int r7 = r12.T(r5)
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.n1.P(r7, r6, r14, r4)
            goto L_0x0522
        L_0x03ca:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x03d0:
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            com.google.protobuf.l1 r8 = r12.u(r5)
            r14.i(r7, r6, r8)
            goto L_0x0522
        L_0x03e1:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = K(r13, r8)
        L_0x03ef:
            r14.C(r7, r8)
            goto L_0x0522
        L_0x03f4:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x0402:
            r14.N(r7, r6)
            goto L_0x0522
        L_0x0407:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = K(r13, r8)
        L_0x0415:
            r14.r(r7, r8)
            goto L_0x0522
        L_0x041a:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x0428:
            r14.j(r7, r6)
            goto L_0x0522
        L_0x042d:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x043b:
            r14.J(r7, r6)
            goto L_0x0522
        L_0x0440:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x044e:
            r14.g(r7, r6)
            goto L_0x0522
        L_0x0453:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0459:
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            com.google.protobuf.j r6 = (com.google.protobuf.j) r6
            r14.l(r7, r6)
            goto L_0x0522
        L_0x0468:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x046e:
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            com.google.protobuf.l1 r8 = r12.u(r5)
            r14.w(r7, r6, r8)
            goto L_0x0522
        L_0x047f:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
        L_0x0485:
            long r8 = U(r6)
            java.lang.Object r6 = com.google.protobuf.x1.E(r13, r8)
            r12.w0(r7, r6, r14)
            goto L_0x0522
        L_0x0492:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            boolean r6 = l(r13, r8)
        L_0x04a0:
            r14.f(r7, r6)
            goto L_0x0522
        L_0x04a5:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x04b3:
            r14.p(r7, r6)
            goto L_0x0522
        L_0x04b7:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = K(r13, r8)
        L_0x04c5:
            r14.A(r7, r8)
            goto L_0x0522
        L_0x04c9:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            int r6 = z(r13, r8)
        L_0x04d7:
            r14.m(r7, r6)
            goto L_0x0522
        L_0x04db:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = K(r13, r8)
        L_0x04e9:
            r14.I(r7, r8)
            goto L_0x0522
        L_0x04ed:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            long r8 = K(r13, r8)
        L_0x04fb:
            r14.e(r7, r8)
            goto L_0x0522
        L_0x04ff:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            float r6 = r(r13, r8)
        L_0x050d:
            r14.D(r7, r6)
            goto L_0x0522
        L_0x0511:
            boolean r8 = r12.B(r13, r5)
            if (r8 == 0) goto L_0x0522
            long r8 = U(r6)
            double r8 = o(r13, r8)
        L_0x051f:
            r14.q(r7, r8)
        L_0x0522:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0526:
            if (r2 == 0) goto L_0x053c
            com.google.protobuf.s r3 = r12.f8814p
            r3.j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x053a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0526
        L_0x053a:
            r2 = r1
            goto L_0x0526
        L_0x053c:
            com.google.protobuf.t1 r0 = r12.f8813o
            r12.x0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.t0(java.lang.Object, com.google.protobuf.a2):void");
    }

    private l1 u(int i10) {
        int i11 = (i10 / 3) * 2;
        l1 l1Var = (l1) this.f8800b[i11];
        if (l1Var != null) {
            return l1Var;
        }
        l1 d10 = g1.a().d((Class) this.f8800b[i11 + 1]);
        this.f8800b[i11] = d10;
        return d10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03d6, code lost:
        r12.i(r5, com.google.protobuf.x1.E(r11, U(r4)), u(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f5, code lost:
        r12.C(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        r12.N(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x041b, code lost:
        r12.r(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x042e, code lost:
        r12.j(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0441, code lost:
        r12.J(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0454, code lost:
        r12.g(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x045f, code lost:
        r12.l(r5, (com.google.protobuf.j) com.google.protobuf.x1.E(r11, U(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0474, code lost:
        r12.w(r5, com.google.protobuf.x1.E(r11, U(r4)), u(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x048b, code lost:
        w0(r5, com.google.protobuf.x1.E(r11, U(r4)), r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a6, code lost:
        r12.f(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b9, code lost:
        r12.p(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04cb, code lost:
        r12.A(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04dd, code lost:
        r12.m(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x04ef, code lost:
        r12.I(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0501, code lost:
        r12.e(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0513, code lost:
        r12.D(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0525, code lost:
        r12.q(r5, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u0(java.lang.Object r11, com.google.protobuf.a2 r12) {
        /*
            r10 = this;
            com.google.protobuf.t1 r0 = r10.f8813o
            r10.x0(r0, r11, r12)
            boolean r0 = r10.f8804f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.s r0 = r10.f8814p
            com.google.protobuf.v r0 = r0.c(r11)
            boolean r2 = r0.m()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f8799a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x052c
            int r4 = r10.r0(r3)
            int r5 = r10.T(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.s r6 = r10.f8814p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.s r6 = r10.f8814p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = q0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0505;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cf;
                case 5: goto L_0x04bd;
                case 6: goto L_0x04ab;
                case 7: goto L_0x0498;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x0459;
                case 11: goto L_0x0446;
                case 12: goto L_0x0433;
                case 13: goto L_0x0420;
                case 14: goto L_0x040d;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e7;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03bd;
                case 19: goto L_0x03aa;
                case 20: goto L_0x0397;
                case 21: goto L_0x0384;
                case 22: goto L_0x0371;
                case 23: goto L_0x035e;
                case 24: goto L_0x034b;
                case 25: goto L_0x0338;
                case 26: goto L_0x0325;
                case 27: goto L_0x030e;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02e8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c2;
                case 32: goto L_0x02af;
                case 33: goto L_0x029c;
                case 34: goto L_0x0289;
                case 35: goto L_0x0276;
                case 36: goto L_0x0263;
                case 37: goto L_0x0250;
                case 38: goto L_0x023d;
                case 39: goto L_0x022a;
                case 40: goto L_0x0217;
                case 41: goto L_0x0204;
                case 42: goto L_0x01f1;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cb;
                case 45: goto L_0x01b8;
                case 46: goto L_0x01a5;
                case 47: goto L_0x0192;
                case 48: goto L_0x017f;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014b;
                case 52: goto L_0x013b;
                case 53: goto L_0x012b;
                case 54: goto L_0x011b;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fb;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00db;
                case 59: goto L_0x00d3;
                case 60: goto L_0x00cb;
                case 61: goto L_0x00c3;
                case 62: goto L_0x00b3;
                case 63: goto L_0x00a3;
                case 64: goto L_0x0093;
                case 65: goto L_0x0083;
                case 66: goto L_0x0073;
                case 67: goto L_0x0063;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0528
        L_0x005b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x03d6
        L_0x0063:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = Z(r11, r6)
            goto L_0x03f5
        L_0x0073:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x0408
        L_0x0083:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = Z(r11, r6)
            goto L_0x041b
        L_0x0093:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x042e
        L_0x00a3:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x0441
        L_0x00b3:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x0454
        L_0x00c3:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x045f
        L_0x00cb:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x0474
        L_0x00d3:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            goto L_0x048b
        L_0x00db:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            boolean r4 = V(r11, r6)
            goto L_0x04a6
        L_0x00eb:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x04b9
        L_0x00fb:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = Z(r11, r6)
            goto L_0x04cb
        L_0x010b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = Y(r11, r6)
            goto L_0x04dd
        L_0x011b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = Z(r11, r6)
            goto L_0x04ef
        L_0x012b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = Z(r11, r6)
            goto L_0x0501
        L_0x013b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            float r4 = X(r11, r6)
            goto L_0x0513
        L_0x014b:
            boolean r6 = r10.H(r11, r5, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            double r6 = W(r11, r6)
            goto L_0x0525
        L_0x015b:
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            r10.v0(r12, r5, r4, r3)
            goto L_0x0528
        L_0x0168:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.l1 r6 = r10.u(r3)
            com.google.protobuf.n1.U(r5, r4, r12, r6)
            goto L_0x0528
        L_0x017f:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.b0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0192:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.a0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01a5:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Z(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01b8:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Y(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01cb:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Q(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01de:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.d0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x01f1:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.N(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0204:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.R(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0217:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.S(r5, r4, r12, r7)
            goto L_0x0528
        L_0x022a:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.V(r5, r4, r12, r7)
            goto L_0x0528
        L_0x023d:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.e0(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0250:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.W(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0263:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.T(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0276:
            int r5 = r10.T(r3)
            long r8 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.P(r5, r4, r12, r7)
            goto L_0x0528
        L_0x0289:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.b0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x029c:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.a0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02af:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Z(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02c2:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Y(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02d5:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.Q(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02e8:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.d0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x02fb:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.O(r5, r4, r12)
            goto L_0x0528
        L_0x030e:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.l1 r6 = r10.u(r3)
            com.google.protobuf.n1.X(r5, r4, r12, r6)
            goto L_0x0528
        L_0x0325:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.c0(r5, r4, r12)
            goto L_0x0528
        L_0x0338:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.N(r5, r4, r12, r8)
            goto L_0x0528
        L_0x034b:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.R(r5, r4, r12, r8)
            goto L_0x0528
        L_0x035e:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.S(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0371:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.V(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0384:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.e0(r5, r4, r12, r8)
            goto L_0x0528
        L_0x0397:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.W(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03aa:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.T(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03bd:
            int r5 = r10.T(r3)
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.n1.P(r5, r4, r12, r8)
            goto L_0x0528
        L_0x03d0:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x03d6:
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            com.google.protobuf.l1 r6 = r10.u(r3)
            r12.i(r5, r4, r6)
            goto L_0x0528
        L_0x03e7:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = K(r11, r6)
        L_0x03f5:
            r12.C(r5, r6)
            goto L_0x0528
        L_0x03fa:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x0408:
            r12.N(r5, r4)
            goto L_0x0528
        L_0x040d:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = K(r11, r6)
        L_0x041b:
            r12.r(r5, r6)
            goto L_0x0528
        L_0x0420:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x042e:
            r12.j(r5, r4)
            goto L_0x0528
        L_0x0433:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x0441:
            r12.J(r5, r4)
            goto L_0x0528
        L_0x0446:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x0454:
            r12.g(r5, r4)
            goto L_0x0528
        L_0x0459:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x045f:
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            com.google.protobuf.j r4 = (com.google.protobuf.j) r4
            r12.l(r5, r4)
            goto L_0x0528
        L_0x046e:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x0474:
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            com.google.protobuf.l1 r6 = r10.u(r3)
            r12.w(r5, r4, r6)
            goto L_0x0528
        L_0x0485:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
        L_0x048b:
            long r6 = U(r4)
            java.lang.Object r4 = com.google.protobuf.x1.E(r11, r6)
            r10.w0(r5, r4, r12)
            goto L_0x0528
        L_0x0498:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            boolean r4 = l(r11, r6)
        L_0x04a6:
            r12.f(r5, r4)
            goto L_0x0528
        L_0x04ab:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x04b9:
            r12.p(r5, r4)
            goto L_0x0528
        L_0x04bd:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = K(r11, r6)
        L_0x04cb:
            r12.A(r5, r6)
            goto L_0x0528
        L_0x04cf:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            int r4 = z(r11, r6)
        L_0x04dd:
            r12.m(r5, r4)
            goto L_0x0528
        L_0x04e1:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = K(r11, r6)
        L_0x04ef:
            r12.I(r5, r6)
            goto L_0x0528
        L_0x04f3:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            long r6 = K(r11, r6)
        L_0x0501:
            r12.e(r5, r6)
            goto L_0x0528
        L_0x0505:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            float r4 = r(r11, r6)
        L_0x0513:
            r12.D(r5, r4)
            goto L_0x0528
        L_0x0517:
            boolean r6 = r10.B(r11, r3)
            if (r6 == 0) goto L_0x0528
            long r6 = U(r4)
            double r6 = o(r11, r6)
        L_0x0525:
            r12.q(r5, r6)
        L_0x0528:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x052c:
            if (r2 == 0) goto L_0x0543
            com.google.protobuf.s r11 = r10.f8814p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0541
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x052c
        L_0x0541:
            r2 = r1
            goto L_0x052c
        L_0x0543:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.u0(java.lang.Object, com.google.protobuf.a2):void");
    }

    static u1 v(Object obj) {
        z zVar = (z) obj;
        u1 u1Var = zVar.unknownFields;
        if (u1Var != u1.c()) {
            return u1Var;
        }
        u1 n10 = u1.n();
        zVar.unknownFields = n10;
        return n10;
    }

    private void v0(a2 a2Var, int i10, Object obj, int i11) {
        if (obj != null) {
            a2Var.x(i10, this.f8815q.f(t(i11)), this.f8815q.g(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f1, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0202, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0213, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0224, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0235, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0246, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0257, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0259, code lost:
        r2.putInt(r1, (long) r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025d, code lost:
        r4 = (com.google.protobuf.m.T(r10) + com.google.protobuf.m.V(r3)) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030e, code lost:
        if ((r8 & r15) != 0) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0310, code lost:
        r3 = com.google.protobuf.m.t(r10, (com.google.protobuf.t0) r2.getObject(r1, r13), u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0327, code lost:
        r3 = com.google.protobuf.m.P(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0334, code lost:
        r3 = com.google.protobuf.m.N(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x033b, code lost:
        if ((r8 & r15) != 0) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033d, code lost:
        r3 = com.google.protobuf.m.L(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0344, code lost:
        if ((r8 & r15) != 0) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0346, code lost:
        r4 = com.google.protobuf.m.J(r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x034b, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0355, code lost:
        r3 = com.google.protobuf.m.l(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0362, code lost:
        r3 = com.google.protobuf.m.U(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0369, code lost:
        if ((r8 & r15) != 0) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x036b, code lost:
        r3 = com.google.protobuf.m.h(r10, (com.google.protobuf.j) r2.getObject(r1, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0378, code lost:
        if ((r8 & r15) != 0) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x037a, code lost:
        r3 = com.google.protobuf.n1.o(r10, r2.getObject(r1, r13), u(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03a5, code lost:
        if ((r8 & r15) != 0) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03a7, code lost:
        r3 = com.google.protobuf.m.e(r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0402, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (H(r1, r10, r5) != false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (H(r1, r10, r5) != false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (H(r1, r10, r5) != false) goto L_0x0346;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (H(r1, r10, r5) != false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b8, code lost:
        if (H(r1, r10, r5) != false) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        if (H(r1, r10, r5) != false) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0173, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0185, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0197, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a9, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bb, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cd, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01df, code lost:
        if (r0.f8807i != false) goto L_0x0259;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int w(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f8798s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f8799a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0409
            int r9 = r0.r0(r5)
            int r10 = r0.T(r5)
            int r11 = q0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x003a
            int[] r12 = r0.f8799a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0058
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0058
        L_0x003a:
            boolean r12 = r0.f8807i
            if (r12 == 0) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.w.DOUBLE_LIST_PACKED
            int r12 = r12.a()
            if (r11 < r12) goto L_0x0056
            com.google.protobuf.w r12 = com.google.protobuf.w.SINT64_LIST_PACKED
            int r12 = r12.a()
            if (r11 > r12) goto L_0x0056
            int[] r12 = r0.f8799a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            r15 = 0
        L_0x0058:
            long r13 = U(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x03f6;
                case 1: goto L_0x03ec;
                case 2: goto L_0x03de;
                case 3: goto L_0x03d0;
                case 4: goto L_0x03c2;
                case 5: goto L_0x03b8;
                case 6: goto L_0x03ae;
                case 7: goto L_0x03a3;
                case 8: goto L_0x0387;
                case 9: goto L_0x0376;
                case 10: goto L_0x0367;
                case 11: goto L_0x035a;
                case 12: goto L_0x034d;
                case 13: goto L_0x0342;
                case 14: goto L_0x0339;
                case 15: goto L_0x032c;
                case 16: goto L_0x031f;
                case 17: goto L_0x030c;
                case 18: goto L_0x02fd;
                case 19: goto L_0x02f1;
                case 20: goto L_0x02e5;
                case 21: goto L_0x02d9;
                case 22: goto L_0x02cd;
                case 23: goto L_0x02fd;
                case 24: goto L_0x02f1;
                case 25: goto L_0x02c1;
                case 26: goto L_0x02b6;
                case 27: goto L_0x02a7;
                case 28: goto L_0x029c;
                case 29: goto L_0x0290;
                case 30: goto L_0x0283;
                case 31: goto L_0x02f1;
                case 32: goto L_0x02fd;
                case 33: goto L_0x0276;
                case 34: goto L_0x0269;
                case 35: goto L_0x0249;
                case 36: goto L_0x0238;
                case 37: goto L_0x0227;
                case 38: goto L_0x0216;
                case 39: goto L_0x0205;
                case 40: goto L_0x01f4;
                case 41: goto L_0x01e3;
                case 42: goto L_0x01d1;
                case 43: goto L_0x01bf;
                case 44: goto L_0x01ad;
                case 45: goto L_0x019b;
                case 46: goto L_0x0189;
                case 47: goto L_0x0177;
                case 48: goto L_0x0165;
                case 49: goto L_0x0155;
                case 50: goto L_0x0145;
                case 51: goto L_0x0137;
                case 52: goto L_0x012b;
                case 53: goto L_0x011b;
                case 54: goto L_0x010b;
                case 55: goto L_0x00fb;
                case 56: goto L_0x00ef;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00da;
                case 59: goto L_0x00bc;
                case 60: goto L_0x00b4;
                case 61: goto L_0x00ac;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0094;
                case 64: goto L_0x008c;
                case 65: goto L_0x0084;
                case 66: goto L_0x0078;
                case 67: goto L_0x006c;
                case 68: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0309
        L_0x0064:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            goto L_0x0310
        L_0x006c:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            long r3 = Z(r1, r13)
            goto L_0x0327
        L_0x0078:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            int r3 = Y(r1, r13)
            goto L_0x0334
        L_0x0084:
            boolean r9 = r0.H(r1, r10, r5)
            if (r9 == 0) goto L_0x0309
            goto L_0x033d
        L_0x008c:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            goto L_0x0346
        L_0x0094:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            int r3 = Y(r1, r13)
            goto L_0x0355
        L_0x00a0:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            int r3 = Y(r1, r13)
            goto L_0x0362
        L_0x00ac:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            goto L_0x036b
        L_0x00b4:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            goto L_0x037a
        L_0x00bc:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.j
            if (r4 == 0) goto L_0x00d2
            com.google.protobuf.j r3 = (com.google.protobuf.j) r3
            int r3 = com.google.protobuf.m.h(r10, r3)
            goto L_0x0308
        L_0x00d2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.m.R(r10, r3)
            goto L_0x0308
        L_0x00da:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            goto L_0x03a7
        L_0x00e2:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            r3 = 0
            int r4 = com.google.protobuf.m.n(r10, r3)
            goto L_0x034b
        L_0x00ef:
            boolean r9 = r0.H(r1, r10, r5)
            if (r9 == 0) goto L_0x0309
            int r3 = com.google.protobuf.m.p(r10, r3)
            goto L_0x0308
        L_0x00fb:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            int r3 = Y(r1, r13)
            int r3 = com.google.protobuf.m.w(r10, r3)
            goto L_0x0308
        L_0x010b:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            long r3 = Z(r1, r13)
            int r3 = com.google.protobuf.m.W(r10, r3)
            goto L_0x0308
        L_0x011b:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            long r3 = Z(r1, r13)
            int r3 = com.google.protobuf.m.y(r10, r3)
            goto L_0x0308
        L_0x012b:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            int r3 = com.google.protobuf.m.r(r10, r9)
            goto L_0x0308
        L_0x0137:
            boolean r3 = r0.H(r1, r10, r5)
            if (r3 == 0) goto L_0x0309
            r3 = 0
            int r3 = com.google.protobuf.m.j(r10, r3)
            goto L_0x0308
        L_0x0145:
            com.google.protobuf.o0 r3 = r0.f8815q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.t(r5)
            int r3 = r3.c(r10, r4, r9)
            goto L_0x0308
        L_0x0155:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.l1 r4 = r0.u(r5)
            int r3 = com.google.protobuf.n1.j(r10, r3, r4)
            goto L_0x0308
        L_0x0165:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.t(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0177:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.r(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0189:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.i(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x019b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.g(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x01ad:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.e(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x01bf:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.w(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x01d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.b(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x01e3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.g(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x01f4:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.i(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0205:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.l(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0216:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.y(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0227:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.n(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0238:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.g(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
            goto L_0x0259
        L_0x0249:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.i(r3)
            if (r3 <= 0) goto L_0x0309
            boolean r4 = r0.f8807i
            if (r4 == 0) goto L_0x025d
        L_0x0259:
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x025d:
            int r4 = com.google.protobuf.m.T(r10)
            int r9 = com.google.protobuf.m.V(r3)
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x034b
        L_0x0269:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.n1.s(r10, r3, r4)
            goto L_0x0308
        L_0x0276:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.q(r10, r3, r4)
            goto L_0x0308
        L_0x0283:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.d(r10, r3, r4)
            goto L_0x0308
        L_0x0290:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.v(r10, r3, r4)
            goto L_0x0308
        L_0x029c:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.c(r10, r3)
            goto L_0x0308
        L_0x02a7:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.l1 r4 = r0.u(r5)
            int r3 = com.google.protobuf.n1.p(r10, r3, r4)
            goto L_0x0308
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.u(r10, r3)
            goto L_0x0308
        L_0x02c1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.n1.a(r10, r3, r4)
            goto L_0x0308
        L_0x02cd:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.k(r10, r3, r4)
            goto L_0x0308
        L_0x02d9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.x(r10, r3, r4)
            goto L_0x0308
        L_0x02e5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.m(r10, r3, r4)
            goto L_0x0308
        L_0x02f1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.f(r10, r3, r4)
            goto L_0x0308
        L_0x02fd:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.n1.h(r10, r3, r4)
        L_0x0308:
            int r6 = r6 + r3
        L_0x0309:
            r11 = 0
            goto L_0x0402
        L_0x030c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
        L_0x0310:
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.t0 r3 = (com.google.protobuf.t0) r3
            com.google.protobuf.l1 r4 = r0.u(r5)
            int r3 = com.google.protobuf.m.t(r10, r3, r4)
            goto L_0x0308
        L_0x031f:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            long r3 = r2.getLong(r1, r13)
        L_0x0327:
            int r3 = com.google.protobuf.m.P(r10, r3)
            goto L_0x0308
        L_0x032c:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            int r3 = r2.getInt(r1, r13)
        L_0x0334:
            int r3 = com.google.protobuf.m.N(r10, r3)
            goto L_0x0308
        L_0x0339:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0309
        L_0x033d:
            int r3 = com.google.protobuf.m.L(r10, r3)
            goto L_0x0308
        L_0x0342:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
        L_0x0346:
            r3 = 0
            int r4 = com.google.protobuf.m.J(r10, r3)
        L_0x034b:
            int r6 = r6 + r4
            goto L_0x0309
        L_0x034d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            int r3 = r2.getInt(r1, r13)
        L_0x0355:
            int r3 = com.google.protobuf.m.l(r10, r3)
            goto L_0x0308
        L_0x035a:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            int r3 = r2.getInt(r1, r13)
        L_0x0362:
            int r3 = com.google.protobuf.m.U(r10, r3)
            goto L_0x0308
        L_0x0367:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
        L_0x036b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.j r3 = (com.google.protobuf.j) r3
            int r3 = com.google.protobuf.m.h(r10, r3)
            goto L_0x0308
        L_0x0376:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
        L_0x037a:
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.l1 r4 = r0.u(r5)
            int r3 = com.google.protobuf.n1.o(r10, r3, r4)
            goto L_0x0308
        L_0x0387:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.j
            if (r4 == 0) goto L_0x039b
            com.google.protobuf.j r3 = (com.google.protobuf.j) r3
            int r3 = com.google.protobuf.m.h(r10, r3)
            goto L_0x0308
        L_0x039b:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.m.R(r10, r3)
            goto L_0x0308
        L_0x03a3:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
        L_0x03a7:
            r3 = 1
            int r3 = com.google.protobuf.m.e(r10, r3)
            goto L_0x0308
        L_0x03ae:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0309
            r11 = 0
            int r3 = com.google.protobuf.m.n(r10, r11)
            goto L_0x0401
        L_0x03b8:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0402
            int r3 = com.google.protobuf.m.p(r10, r3)
            goto L_0x0401
        L_0x03c2:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0402
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.m.w(r10, r3)
            goto L_0x0401
        L_0x03d0:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0402
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.m.W(r10, r3)
            goto L_0x0401
        L_0x03de:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0402
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.m.y(r10, r3)
            goto L_0x0401
        L_0x03ec:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0402
            int r3 = com.google.protobuf.m.r(r10, r9)
            goto L_0x0401
        L_0x03f6:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0402
            r3 = 0
            int r3 = com.google.protobuf.m.j(r10, r3)
        L_0x0401:
            int r6 = r6 + r3
        L_0x0402:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0409:
            com.google.protobuf.t1 r2 = r0.f8813o
            int r2 = r0.y(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f8804f
            if (r2 == 0) goto L_0x041f
            com.google.protobuf.s r2 = r0.f8814p
            com.google.protobuf.v r1 = r2.c(r1)
            int r1 = r1.k()
            int r6 = r6 + r1
        L_0x041f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.w(java.lang.Object):int");
    }

    private void w0(int i10, Object obj, a2 a2Var) {
        if (obj instanceof String) {
            a2Var.G(i10, (String) obj);
        } else {
            a2Var.l(i10, (j) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01db, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ec, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fd, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020e, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0210, code lost:
        r2.putInt(r1, (long) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0214, code lost:
        r6 = (com.google.protobuf.m.T(r8) + com.google.protobuf.m.V(r7)) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0299, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r6 = com.google.protobuf.m.t(r8, (com.google.protobuf.t0) com.google.protobuf.x1.E(r1, r9), u(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bb, code lost:
        r6 = com.google.protobuf.m.P(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ca, code lost:
        r6 = com.google.protobuf.m.N(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d5, code lost:
        r6 = com.google.protobuf.m.L(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e0, code lost:
        r6 = com.google.protobuf.m.J(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ef, code lost:
        r6 = com.google.protobuf.m.l(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fe, code lost:
        r6 = com.google.protobuf.m.U(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0309, code lost:
        r6 = com.google.protobuf.x1.E(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030d, code lost:
        r6 = com.google.protobuf.m.h(r8, (com.google.protobuf.j) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031a, code lost:
        r6 = com.google.protobuf.n1.o(r8, com.google.protobuf.x1.E(r1, r9), u(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0334, code lost:
        if ((r6 instanceof com.google.protobuf.j) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x033e, code lost:
        r6 = com.google.protobuf.m.e(r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x034a, code lost:
        r6 = com.google.protobuf.m.n(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0356, code lost:
        r6 = com.google.protobuf.m.p(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0366, code lost:
        r6 = com.google.protobuf.m.w(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0376, code lost:
        r6 = com.google.protobuf.m.W(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0386, code lost:
        r6 = com.google.protobuf.m.y(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0392, code lost:
        r6 = com.google.protobuf.m.r(r8, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x039e, code lost:
        r6 = com.google.protobuf.m.j(r8, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a6, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if ((r6 instanceof com.google.protobuf.j) != false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r6 = com.google.protobuf.m.R(r8, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012a, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013c, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0184, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0196, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a8, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b9, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ca, code lost:
        if (r0.f8807i != false) goto L_0x0210;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int x(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f8798s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f8799a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x03aa
            int r6 = r15.r0(r4)
            int r7 = q0(r6)
            int r8 = r15.T(r4)
            long r9 = U(r6)
            com.google.protobuf.w r6 = com.google.protobuf.w.DOUBLE_LIST_PACKED
            int r6 = r6.a()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.w r6 = com.google.protobuf.w.SINT64_LIST_PACKED
            int r6 = r6.a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f8799a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x0398;
                case 1: goto L_0x038c;
                case 2: goto L_0x037c;
                case 3: goto L_0x036c;
                case 4: goto L_0x035c;
                case 5: goto L_0x0350;
                case 6: goto L_0x0344;
                case 7: goto L_0x0338;
                case 8: goto L_0x0328;
                case 9: goto L_0x0314;
                case 10: goto L_0x0303;
                case 11: goto L_0x02f4;
                case 12: goto L_0x02e5;
                case 13: goto L_0x02da;
                case 14: goto L_0x02cf;
                case 15: goto L_0x02c0;
                case 16: goto L_0x02b1;
                case 17: goto L_0x029c;
                case 18: goto L_0x0291;
                case 19: goto L_0x0288;
                case 20: goto L_0x027f;
                case 21: goto L_0x0276;
                case 22: goto L_0x026d;
                case 23: goto L_0x0291;
                case 24: goto L_0x0288;
                case 25: goto L_0x0264;
                case 26: goto L_0x025b;
                case 27: goto L_0x024e;
                case 28: goto L_0x0245;
                case 29: goto L_0x023c;
                case 30: goto L_0x0233;
                case 31: goto L_0x0288;
                case 32: goto L_0x0291;
                case 33: goto L_0x022a;
                case 34: goto L_0x0220;
                case 35: goto L_0x0200;
                case 36: goto L_0x01ef;
                case 37: goto L_0x01de;
                case 38: goto L_0x01cd;
                case 39: goto L_0x01bc;
                case 40: goto L_0x01ab;
                case 41: goto L_0x019a;
                case 42: goto L_0x0188;
                case 43: goto L_0x0176;
                case 44: goto L_0x0164;
                case 45: goto L_0x0152;
                case 46: goto L_0x0140;
                case 47: goto L_0x012e;
                case 48: goto L_0x011c;
                case 49: goto L_0x010e;
                case 50: goto L_0x00fe;
                case 51: goto L_0x00f6;
                case 52: goto L_0x00ee;
                case 53: goto L_0x00e2;
                case 54: goto L_0x00d6;
                case 55: goto L_0x00ca;
                case 56: goto L_0x00c2;
                case 57: goto L_0x00ba;
                case 58: goto L_0x00b2;
                case 59: goto L_0x009a;
                case 60: goto L_0x0092;
                case 61: goto L_0x008a;
                case 62: goto L_0x007e;
                case 63: goto L_0x0072;
                case 64: goto L_0x006a;
                case 65: goto L_0x0062;
                case 66: goto L_0x0056;
                case 67: goto L_0x004a;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x03a6
        L_0x0042:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02a2
        L_0x004a:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = Z(r1, r9)
            goto L_0x02bb
        L_0x0056:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Y(r1, r9)
            goto L_0x02ca
        L_0x0062:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02d5
        L_0x006a:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x02e0
        L_0x0072:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Y(r1, r9)
            goto L_0x02ef
        L_0x007e:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Y(r1, r9)
            goto L_0x02fe
        L_0x008a:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0309
        L_0x0092:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x031a
        L_0x009a:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = com.google.protobuf.x1.E(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.j
            if (r7 == 0) goto L_0x00aa
        L_0x00a8:
            goto L_0x030d
        L_0x00aa:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.m.R(r8, r6)
            goto L_0x0299
        L_0x00b2:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x033e
        L_0x00ba:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x034a
        L_0x00c2:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0356
        L_0x00ca:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = Y(r1, r9)
            goto L_0x0366
        L_0x00d6:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = Z(r1, r9)
            goto L_0x0376
        L_0x00e2:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = Z(r1, r9)
            goto L_0x0386
        L_0x00ee:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x0392
        L_0x00f6:
            boolean r6 = r15.H(r1, r8, r4)
            if (r6 == 0) goto L_0x03a6
            goto L_0x039e
        L_0x00fe:
            com.google.protobuf.o0 r6 = r0.f8815q
            java.lang.Object r7 = com.google.protobuf.x1.E(r1, r9)
            java.lang.Object r9 = r15.t(r4)
            int r6 = r6.c(r8, r7, r9)
            goto L_0x0299
        L_0x010e:
            java.util.List r6 = J(r1, r9)
            com.google.protobuf.l1 r7 = r15.u(r4)
            int r6 = com.google.protobuf.n1.j(r8, r6, r7)
            goto L_0x0299
        L_0x011c:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.t(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x012e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.r(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0140:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0152:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0164:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.e(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0176:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.w(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0188:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.b(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x019a:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ab:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.l(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01cd:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.y(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01de:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.n(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x01ef:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.g(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
            goto L_0x0210
        L_0x0200:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.n1.i(r7)
            if (r7 <= 0) goto L_0x03a6
            boolean r9 = r0.f8807i
            if (r9 == 0) goto L_0x0214
        L_0x0210:
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0214:
            int r6 = com.google.protobuf.m.T(r8)
            int r8 = com.google.protobuf.m.V(r7)
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x0299
        L_0x0220:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.s(r8, r6, r3)
            goto L_0x0299
        L_0x022a:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.q(r8, r6, r3)
            goto L_0x0299
        L_0x0233:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.d(r8, r6, r3)
            goto L_0x0299
        L_0x023c:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.v(r8, r6, r3)
            goto L_0x0299
        L_0x0245:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.c(r8, r6)
            goto L_0x0299
        L_0x024e:
            java.util.List r6 = J(r1, r9)
            com.google.protobuf.l1 r7 = r15.u(r4)
            int r6 = com.google.protobuf.n1.p(r8, r6, r7)
            goto L_0x0299
        L_0x025b:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.u(r8, r6)
            goto L_0x0299
        L_0x0264:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.a(r8, r6, r3)
            goto L_0x0299
        L_0x026d:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.k(r8, r6, r3)
            goto L_0x0299
        L_0x0276:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.x(r8, r6, r3)
            goto L_0x0299
        L_0x027f:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.m(r8, r6, r3)
            goto L_0x0299
        L_0x0288:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.f(r8, r6, r3)
            goto L_0x0299
        L_0x0291:
            java.util.List r6 = J(r1, r9)
            int r6 = com.google.protobuf.n1.h(r8, r6, r3)
        L_0x0299:
            int r5 = r5 + r6
            goto L_0x03a6
        L_0x029c:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02a2:
            java.lang.Object r6 = com.google.protobuf.x1.E(r1, r9)
            com.google.protobuf.t0 r6 = (com.google.protobuf.t0) r6
            com.google.protobuf.l1 r7 = r15.u(r4)
            int r6 = com.google.protobuf.m.t(r8, r6, r7)
            goto L_0x0299
        L_0x02b1:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = com.google.protobuf.x1.C(r1, r9)
        L_0x02bb:
            int r6 = com.google.protobuf.m.P(r8, r6)
            goto L_0x0299
        L_0x02c0:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = com.google.protobuf.x1.A(r1, r9)
        L_0x02ca:
            int r6 = com.google.protobuf.m.N(r8, r6)
            goto L_0x0299
        L_0x02cf:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02d5:
            int r6 = com.google.protobuf.m.L(r8, r13)
            goto L_0x0299
        L_0x02da:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x02e0:
            int r6 = com.google.protobuf.m.J(r8, r3)
            goto L_0x0299
        L_0x02e5:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = com.google.protobuf.x1.A(r1, r9)
        L_0x02ef:
            int r6 = com.google.protobuf.m.l(r8, r6)
            goto L_0x0299
        L_0x02f4:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = com.google.protobuf.x1.A(r1, r9)
        L_0x02fe:
            int r6 = com.google.protobuf.m.U(r8, r6)
            goto L_0x0299
        L_0x0303:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0309:
            java.lang.Object r6 = com.google.protobuf.x1.E(r1, r9)
        L_0x030d:
            com.google.protobuf.j r6 = (com.google.protobuf.j) r6
            int r6 = com.google.protobuf.m.h(r8, r6)
            goto L_0x0299
        L_0x0314:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x031a:
            java.lang.Object r6 = com.google.protobuf.x1.E(r1, r9)
            com.google.protobuf.l1 r7 = r15.u(r4)
            int r6 = com.google.protobuf.n1.o(r8, r6, r7)
            goto L_0x0299
        L_0x0328:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            java.lang.Object r6 = com.google.protobuf.x1.E(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.j
            if (r7 == 0) goto L_0x00aa
            goto L_0x00a8
        L_0x0338:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x033e:
            int r6 = com.google.protobuf.m.e(r8, r11)
            goto L_0x0299
        L_0x0344:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x034a:
            int r6 = com.google.protobuf.m.n(r8, r3)
            goto L_0x0299
        L_0x0350:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0356:
            int r6 = com.google.protobuf.m.p(r8, r13)
            goto L_0x0299
        L_0x035c:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            int r6 = com.google.protobuf.x1.A(r1, r9)
        L_0x0366:
            int r6 = com.google.protobuf.m.w(r8, r6)
            goto L_0x0299
        L_0x036c:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = com.google.protobuf.x1.C(r1, r9)
        L_0x0376:
            int r6 = com.google.protobuf.m.W(r8, r6)
            goto L_0x0299
        L_0x037c:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
            long r6 = com.google.protobuf.x1.C(r1, r9)
        L_0x0386:
            int r6 = com.google.protobuf.m.y(r8, r6)
            goto L_0x0299
        L_0x038c:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x0392:
            int r6 = com.google.protobuf.m.r(r8, r12)
            goto L_0x0299
        L_0x0398:
            boolean r6 = r15.B(r1, r4)
            if (r6 == 0) goto L_0x03a6
        L_0x039e:
            r6 = 0
            int r6 = com.google.protobuf.m.j(r8, r6)
            goto L_0x0299
        L_0x03a6:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x03aa:
            com.google.protobuf.t1 r2 = r0.f8813o
            int r1 = r15.y(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.x(java.lang.Object):int");
    }

    private void x0(t1 t1Var, Object obj, a2 a2Var) {
        t1Var.t(t1Var.g(obj), a2Var);
    }

    private int y(t1 t1Var, Object obj) {
        return t1Var.h(t1Var.g(obj));
    }

    private static int z(Object obj, long j10) {
        return x1.A(obj, j10);
    }

    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i10 = 0; i10 < this.f8799a.length; i10 += 3) {
            P(obj, obj2, i10);
        }
        n1.G(this.f8813o, obj, obj2);
        if (this.f8804f) {
            n1.E(this.f8814p, obj, obj2);
        }
    }

    public void b(Object obj, a2 a2Var) {
        if (a2Var.B() == a2.a.DESCENDING) {
            u0(obj, a2Var);
        } else if (this.f8806h) {
            t0(obj, a2Var);
        } else {
            s0(obj, a2Var);
        }
    }

    public void c(Object obj) {
        int i10;
        int i11 = this.f8809k;
        while (true) {
            i10 = this.f8810l;
            if (i11 >= i10) {
                break;
            }
            long U = U(r0(this.f8808j[i11]));
            Object E = x1.E(obj, U);
            if (E != null) {
                x1.S(obj, U, this.f8815q.e(E));
            }
            i11++;
        }
        int length = this.f8808j.length;
        while (i10 < length) {
            this.f8812n.c(obj, (long) this.f8808j[i10]);
            i10++;
        }
        this.f8813o.j(obj);
        if (this.f8804f) {
            this.f8814p.f(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0379, code lost:
        if (r0 != r15) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03b9, code lost:
        if (r0 != r15) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03db, code lost:
        if (r0 != r15) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03de, code lost:
        r8 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0139, code lost:
        r4 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01ca, code lost:
        r10.putObject(r4, r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0210, code lost:
        r1 = r6 | r21;
        r14 = r4;
        r13 = r5;
        r2 = r7;
        r3 = r11;
        r6 = r24;
        r11 = r33;
        r5 = r1;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x025f, code lost:
        r10.putInt(r4, r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x028b, code lost:
        r3 = r11;
        r14 = r13;
        r1 = r17;
        r6 = r24;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02cb, code lost:
        r5 = r6 | r21;
        r13 = r32;
        r14 = r4;
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d1, code lost:
        r3 = r11;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d6, code lost:
        r8 = r33;
        r2 = r3;
        r23 = r6;
        r21 = r7;
        r27 = r10;
        r9 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c0(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.protobuf.f.a r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f8798s
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0439
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.protobuf.f.G(r0, r12, r3, r9)
            int r3 = r9.f8568a
            r4 = r3
            r3 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r1) goto L_0x0038
            int r2 = r2 / r7
            int r1 = r15.g0(r0, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.f0(r0)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x0051
            r17 = r0
            r2 = r3
            r9 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r18 = -1
            r21 = 0
            goto L_0x03e2
        L_0x0051:
            int[] r1 = r15.f8799a
            int r19 = r2 + 1
            r1 = r1[r19]
            int r7 = q0(r1)
            long r11 = U(r1)
            r19 = r4
            r4 = 17
            r20 = r1
            if (r7 > r4) goto L_0x02e2
            int[] r4 = r15.f8799a
            int r21 = r2 + 2
            r4 = r4[r21]
            int r21 = r4 >>> 20
            r1 = 1
            int r21 = r1 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r17 = r2
            if (r4 == r6) goto L_0x0088
            if (r6 == r13) goto L_0x0080
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0080:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r24 = r4
            goto L_0x008a
        L_0x0088:
            r24 = r6
        L_0x008a:
            r6 = r5
            r1 = 5
            switch(r7) {
                case 0: goto L_0x02b0;
                case 1: goto L_0x0295;
                case 2: goto L_0x0264;
                case 3: goto L_0x0264;
                case 4: goto L_0x0248;
                case 5: goto L_0x021f;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01ce;
                case 8: goto L_0x01a5;
                case 9: goto L_0x0170;
                case 10: goto L_0x0156;
                case 11: goto L_0x0248;
                case 12: goto L_0x013d;
                case 13: goto L_0x01f4;
                case 14: goto L_0x021f;
                case 15: goto L_0x011e;
                case 16: goto L_0x00f0;
                case 17: goto L_0x009f;
                default: goto L_0x008f;
            }
        L_0x008f:
            r12 = r30
            r4 = r14
            r7 = r17
            r11 = r19
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r17 = r0
            goto L_0x02d6
        L_0x009f:
            r2 = 3
            if (r8 != r2) goto L_0x00e3
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r17
            com.google.protobuf.l1 r1 = r15.u(r2)
            r17 = r0
            r0 = r1
            r18 = -1
            r1 = r30
            r7 = r2
            r2 = r3
            r3 = r32
            r8 = r19
            r5 = r34
            int r0 = com.google.protobuf.f.m(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00c6
            java.lang.Object r1 = r9.f8570c
            goto L_0x00d0
        L_0x00c6:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f8570c
            java.lang.Object r1 = com.google.protobuf.c0.h(r1, r2)
        L_0x00d0:
            r10.putObject(r14, r11, r1)
            r5 = r6 | r21
            r12 = r30
            r13 = r32
            r11 = r33
            r2 = r7
            r3 = r8
            r1 = r17
            r6 = r24
            goto L_0x0019
        L_0x00e3:
            r7 = r17
            r18 = -1
            r17 = r0
            r12 = r30
            r4 = r14
            r11 = r19
            goto L_0x01a0
        L_0x00f0:
            r7 = r17
            r4 = r19
            r18 = -1
            r17 = r0
            if (r8 != 0) goto L_0x011a
            r1 = r11
            r12 = r30
            int r8 = com.google.protobuf.f.K(r12, r3, r9)
            long r13 = r9.f8569b
            long r13 = com.google.protobuf.k.c(r13)
            r0 = r10
            r2 = r1
            r1 = r29
            r11 = r4
            r4 = r13
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r14 = r29
            r13 = r32
            r2 = r7
            r0 = r8
            goto L_0x02d1
        L_0x011a:
            r12 = r30
            r11 = r4
            goto L_0x0139
        L_0x011e:
            r13 = r11
            r7 = r17
            r11 = r19
            r18 = -1
            r12 = r30
            r17 = r0
            if (r8 != 0) goto L_0x0139
            int r0 = com.google.protobuf.f.H(r12, r3, r9)
            int r1 = r9.f8568a
            int r1 = com.google.protobuf.k.b(r1)
            r4 = r29
            goto L_0x025f
        L_0x0139:
            r4 = r29
            goto L_0x01a0
        L_0x013d:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r12 = r30
            if (r8 != 0) goto L_0x01a0
            int r0 = com.google.protobuf.f.H(r12, r3, r9)
            int r1 = r9.f8568a
            r15.s(r7)
            goto L_0x025f
        L_0x0156:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r30
            if (r8 != r0) goto L_0x01a0
            int r0 = com.google.protobuf.f.b(r12, r3, r9)
            java.lang.Object r1 = r9.f8570c
            r10.putObject(r4, r13, r1)
            goto L_0x02cb
        L_0x0170:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r12 = r30
            if (r8 != r0) goto L_0x019e
            com.google.protobuf.l1 r0 = r15.u(r7)
            r5 = r32
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.protobuf.f.o(r0, r12, r3, r5, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x0193
            java.lang.Object r1 = r9.f8570c
            goto L_0x01ca
        L_0x0193:
            java.lang.Object r1 = r10.getObject(r4, r13)
            java.lang.Object r2 = r9.f8570c
            java.lang.Object r1 = com.google.protobuf.c0.h(r1, r2)
            goto L_0x01ca
        L_0x019e:
            r5 = r32
        L_0x01a0:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02d6
        L_0x01a5:
            r5 = r32
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != r0) goto L_0x02d6
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01c4
            int r0 = com.google.protobuf.f.B(r12, r3, r9)
            goto L_0x01c8
        L_0x01c4:
            int r0 = com.google.protobuf.f.E(r12, r3, r9)
        L_0x01c8:
            java.lang.Object r1 = r9.f8570c
        L_0x01ca:
            r10.putObject(r4, r13, r1)
            goto L_0x0210
        L_0x01ce:
            r5 = r32
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != 0) goto L_0x02d6
            int r0 = com.google.protobuf.f.K(r12, r3, r9)
            long r1 = r9.f8569b
            r25 = 0
            int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r3 == 0) goto L_0x01ef
            r1 = 1
            goto L_0x01f0
        L_0x01ef:
            r1 = 0
        L_0x01f0:
            com.google.protobuf.x1.I(r4, r13, r1)
            goto L_0x0210
        L_0x01f4:
            r5 = r32
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != r1) goto L_0x02d6
            int r0 = com.google.protobuf.f.g(r12, r3)
            r10.putInt(r4, r13, r0)
            int r0 = r3 + 4
        L_0x0210:
            r1 = r6 | r21
            r14 = r4
            r13 = r5
            r2 = r7
            r3 = r11
            r6 = r24
            r11 = r33
            r5 = r1
            r1 = r17
            goto L_0x0019
        L_0x021f:
            r5 = r32
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != r0) goto L_0x02d6
            long r22 = com.google.protobuf.f.i(r12, r3)
            r0 = r10
            r1 = r29
            r8 = r3
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r5 = r6 | r21
            r2 = r7
            goto L_0x028b
        L_0x0248:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != 0) goto L_0x02d6
            int r0 = com.google.protobuf.f.H(r12, r3, r9)
            int r1 = r9.f8568a
        L_0x025f:
            r10.putInt(r4, r13, r1)
            goto L_0x02cb
        L_0x0264:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != 0) goto L_0x02d6
            int r8 = com.google.protobuf.f.K(r12, r3, r9)
            long r2 = r9.f8569b
            r0 = r10
            r1 = r29
            r22 = r2
            r2 = r13
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r5 = r6 | r21
            r2 = r7
            r0 = r8
        L_0x028b:
            r3 = r11
            r14 = r13
            r1 = r17
            r6 = r24
            r13 = r32
            goto L_0x0338
        L_0x0295:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != r1) goto L_0x02d6
            float r0 = com.google.protobuf.f.k(r12, r3)
            com.google.protobuf.x1.P(r4, r13, r0)
            int r0 = r3 + 4
            goto L_0x02cb
        L_0x02b0:
            r4 = r14
            r7 = r17
            r18 = -1
            r17 = r0
            r13 = r11
            r11 = r19
            r0 = 1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            if (r8 != r0) goto L_0x02d6
            double r0 = com.google.protobuf.f.d(r12, r3)
            com.google.protobuf.x1.O(r4, r13, r0)
            int r0 = r3 + 8
        L_0x02cb:
            r5 = r6 | r21
            r13 = r32
            r14 = r4
            r2 = r7
        L_0x02d1:
            r3 = r11
            r1 = r17
            goto L_0x0336
        L_0x02d6:
            r8 = r33
            r2 = r3
            r23 = r6
            r21 = r7
            r27 = r10
            r9 = r11
            goto L_0x03e2
        L_0x02e2:
            r17 = r0
            r4 = r14
            r18 = -1
            r13 = r11
            r11 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r30
            r0 = 27
            if (r7 != r0) goto L_0x0349
            r0 = 2
            if (r8 != r0) goto L_0x033c
            java.lang.Object r0 = r10.getObject(r4, r13)
            com.google.protobuf.c0$i r0 = (com.google.protobuf.c0.i) r0
            boolean r1 = r0.T()
            if (r1 != 0) goto L_0x0314
            int r1 = r0.size()
            if (r1 != 0) goto L_0x030b
            r1 = 10
            goto L_0x030d
        L_0x030b:
            int r1 = r1 * 2
        L_0x030d:
            com.google.protobuf.c0$i r0 = r0.a(r1)
            r10.putObject(r4, r13, r0)
        L_0x0314:
            r7 = r0
            com.google.protobuf.l1 r0 = r15.u(r2)
            r1 = r11
            r21 = r2
            r2 = r30
            r4 = r32
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.google.protobuf.f.p(r0, r1, r2, r3, r4, r5, r6)
            r14 = r29
            r13 = r32
            r3 = r11
            r1 = r17
            r2 = r21
            r5 = r23
        L_0x0336:
            r6 = r24
        L_0x0338:
            r11 = r33
            goto L_0x0019
        L_0x033c:
            r21 = r2
            r23 = r5
            r24 = r6
            r15 = r3
            r27 = r10
            r19 = r11
            goto L_0x03bc
        L_0x0349:
            r21 = r2
            r23 = r5
            r24 = r6
            r0 = 49
            if (r7 > r0) goto L_0x0395
            r1 = r20
            long r5 = (long) r1
            r0 = r28
            r1 = r29
            r2 = r30
            r4 = r3
            r15 = r4
            r4 = r32
            r25 = r5
            r5 = r11
            r6 = r17
            r31 = r7
            r7 = r8
            r8 = r21
            r27 = r10
            r9 = r25
            r19 = r11
            r11 = r31
            r12 = r13
            r14 = r34
            int r0 = r0.e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03de
        L_0x037b:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r17
            r3 = r19
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            goto L_0x0019
        L_0x0395:
            r15 = r3
            r31 = r7
            r27 = r10
            r19 = r11
            r1 = r20
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x03c2
            r0 = 2
            if (r8 != r0) goto L_0x03bc
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r21
            r6 = r13
            r8 = r34
            int r0 = r0.a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03de
            goto L_0x037b
        L_0x03bc:
            r8 = r33
            r2 = r15
        L_0x03bf:
            r9 = r19
            goto L_0x03e2
        L_0x03c2:
            r0 = r28
            r10 = r1
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r17
            r7 = r8
            r8 = r10
            r10 = r13
            r12 = r21
            r13 = r34
            int r0 = r0.b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03de
            goto L_0x037b
        L_0x03de:
            r8 = r33
            r2 = r0
            goto L_0x03bf
        L_0x03e2:
            if (r9 != r8) goto L_0x03f2
            if (r8 == 0) goto L_0x03f2
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r28
            r0 = r2
            r3 = r9
            r5 = r23
            r6 = r24
            goto L_0x0444
        L_0x03f2:
            r10 = r28
            boolean r0 = r10.f8804f
            r11 = r34
            if (r0 == 0) goto L_0x0414
            com.google.protobuf.r r0 = r11.f8571d
            com.google.protobuf.r r1 = com.google.protobuf.r.b()
            if (r0 == r1) goto L_0x0414
            com.google.protobuf.t0 r5 = r10.f8803e
            com.google.protobuf.t1 r6 = r10.f8813o
            r0 = r9
            r1 = r30
            r3 = r32
            r4 = r29
            r7 = r34
            int r0 = com.google.protobuf.f.f(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0423
        L_0x0414:
            com.google.protobuf.u1 r4 = v(r29)
            r0 = r9
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.protobuf.f.F(r0, r1, r2, r3, r4, r5)
        L_0x0423:
            r14 = r29
            r12 = r30
            r13 = r32
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r17
            r2 = r21
            r5 = r23
            r6 = r24
            r10 = r27
            r11 = r8
            goto L_0x0019
        L_0x0439:
            r23 = r5
            r24 = r6
            r27 = r10
            r8 = r11
            r10 = r15
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0444:
            if (r6 == r1) goto L_0x044f
            long r1 = (long) r6
            r4 = r29
            r6 = r27
            r6.putInt(r4, r1, r5)
            goto L_0x0451
        L_0x044f:
            r4 = r29
        L_0x0451:
            int r1 = r10.f8809k
            r2 = 0
        L_0x0454:
            int r5 = r10.f8810l
            if (r1 >= r5) goto L_0x0467
            int[] r5 = r10.f8808j
            r5 = r5[r1]
            com.google.protobuf.t1 r6 = r10.f8813o
            java.lang.Object r2 = r10.q(r4, r5, r2, r6)
            com.google.protobuf.u1 r2 = (com.google.protobuf.u1) r2
            int r1 = r1 + 1
            goto L_0x0454
        L_0x0467:
            if (r2 == 0) goto L_0x046e
            com.google.protobuf.t1 r1 = r10.f8813o
            r1.o(r4, r2)
        L_0x046e:
            r1 = r32
            if (r8 != 0) goto L_0x047a
            if (r0 != r1) goto L_0x0475
            goto L_0x047e
        L_0x0475:
            com.google.protobuf.d0 r0 = com.google.protobuf.d0.g()
            throw r0
        L_0x047a:
            if (r0 > r1) goto L_0x047f
            if (r3 != r8) goto L_0x047f
        L_0x047e:
            return r0
        L_0x047f:
            com.google.protobuf.d0 r0 = com.google.protobuf.d0.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.c0(java.lang.Object, byte[], int, int, int, com.google.protobuf.f$a):int");
    }

    public final boolean d(Object obj) {
        int i10;
        int i11;
        Object obj2 = obj;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f8809k) {
            int i15 = this.f8808j[i14];
            int T = T(i15);
            int r02 = r0(i15);
            int i16 = this.f8799a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f8798s.getInt(obj2, (long) i17);
                }
                i10 = i13;
                i11 = i17;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (I(r02) && !C(obj, i15, i11, i10, i18)) {
                return false;
            }
            int q02 = q0(r02);
            if (q02 != 9 && q02 != 17) {
                if (q02 != 27) {
                    if (q02 == 60 || q02 == 68) {
                        if (H(obj2, T, i15) && !D(obj2, r02, u(i15))) {
                            return false;
                        }
                    } else if (q02 != 49) {
                        if (q02 == 50 && !F(obj2, r02, i15)) {
                            return false;
                        }
                    }
                }
                if (!E(obj2, r02, i15)) {
                    return false;
                }
            } else if (C(obj, i15, i11, i10, i18) && !D(obj2, r02, u(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f8804f || this.f8814p.c(obj2).n();
    }

    public void e(Object obj, j1 j1Var, r rVar) {
        rVar.getClass();
        L(this.f8813o, this.f8814p, obj, j1Var, rVar);
    }

    public boolean f(Object obj, Object obj2) {
        int length = this.f8799a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f8813o.g(obj).equals(this.f8813o.g(obj2))) {
            return false;
        }
        if (this.f8804f) {
            return this.f8814p.c(obj).equals(this.f8814p.c(obj2));
        }
        return true;
    }

    public void g(Object obj, byte[] bArr, int i10, int i11, f.a aVar) {
        if (this.f8806h) {
            d0(obj, bArr, i10, i11, aVar);
        } else {
            c0(obj, bArr, i10, i11, 0, aVar);
        }
    }

    public int h(Object obj) {
        return this.f8806h ? x(obj) : w(obj);
    }

    public Object i() {
        return this.f8811m.a(this.f8803e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r3 = com.google.protobuf.x1.E(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        r2 = r2 * 53;
        r3 = Y(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r2 = r2 * 53;
        r3 = Z(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r2 = r2 * 53;
        r3 = com.google.protobuf.x1.E(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d5, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        if (r3 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.protobuf.x1.E(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
        r3 = com.google.protobuf.c0.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011f, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = com.google.protobuf.c0.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f8799a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.r0(r1)
            int r4 = r8.T(r1)
            long r5 = U(r3)
            int r3 = q0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0119;
                case 1: goto L_0x010e;
                case 2: goto L_0x0107;
                case 3: goto L_0x0107;
                case 4: goto L_0x0100;
                case 5: goto L_0x0107;
                case 6: goto L_0x0100;
                case 7: goto L_0x00f5;
                case 8: goto L_0x00e8;
                case 9: goto L_0x00da;
                case 10: goto L_0x00cf;
                case 11: goto L_0x0100;
                case 12: goto L_0x0100;
                case 13: goto L_0x0100;
                case 14: goto L_0x0107;
                case 15: goto L_0x0100;
                case 16: goto L_0x0107;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00cf;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00cf;
                case 21: goto L_0x00cf;
                case 22: goto L_0x00cf;
                case 23: goto L_0x00cf;
                case 24: goto L_0x00cf;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00cf;
                case 27: goto L_0x00cf;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00cf;
                case 30: goto L_0x00cf;
                case 31: goto L_0x00cf;
                case 32: goto L_0x00cf;
                case 33: goto L_0x00cf;
                case 34: goto L_0x00cf;
                case 35: goto L_0x00cf;
                case 36: goto L_0x00cf;
                case 37: goto L_0x00cf;
                case 38: goto L_0x00cf;
                case 39: goto L_0x00cf;
                case 40: goto L_0x00cf;
                case 41: goto L_0x00cf;
                case 42: goto L_0x00cf;
                case 43: goto L_0x00cf;
                case 44: goto L_0x00cf;
                case 45: goto L_0x00cf;
                case 46: goto L_0x00cf;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00cf;
                case 49: goto L_0x00cf;
                case 50: goto L_0x00cf;
                case 51: goto L_0x00bb;
                case 52: goto L_0x00ae;
                case 53: goto L_0x00a0;
                case 54: goto L_0x0099;
                case 55: goto L_0x008b;
                case 56: goto L_0x0084;
                case 57: goto L_0x007d;
                case 58: goto L_0x006f;
                case 59: goto L_0x0067;
                case 60: goto L_0x0059;
                case 61: goto L_0x0051;
                case 62: goto L_0x004a;
                case 63: goto L_0x0043;
                case 64: goto L_0x003c;
                case 65: goto L_0x0034;
                case 66: goto L_0x002d;
                case 67: goto L_0x0025;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0128
        L_0x001e:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x005f
        L_0x0025:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x002d:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0034:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x003c:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0049
        L_0x0043:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0049:
            goto L_0x0091
        L_0x004a:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0051:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00cf
        L_0x0059:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x005f:
            java.lang.Object r3 = com.google.protobuf.x1.E(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d5
        L_0x0067:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00e8
        L_0x006f:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = V(r9, r5)
            goto L_0x00fb
        L_0x007d:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0091
        L_0x0084:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x008b:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0091:
            int r2 = r2 * 53
            int r3 = Y(r9, r5)
            goto L_0x0127
        L_0x0099:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x00a6
        L_0x00a0:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x00a6:
            int r2 = r2 * 53
            long r3 = Z(r9, r5)
            goto L_0x0123
        L_0x00ae:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = X(r9, r5)
            goto L_0x0114
        L_0x00bb:
            boolean r3 = r8.H(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = W(r9, r5)
            goto L_0x011f
        L_0x00c8:
            java.lang.Object r3 = com.google.protobuf.x1.E(r9, r5)
            if (r3 == 0) goto L_0x00e4
            goto L_0x00e0
        L_0x00cf:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.x1.E(r9, r5)
        L_0x00d5:
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00da:
            java.lang.Object r3 = com.google.protobuf.x1.E(r9, r5)
            if (r3 == 0) goto L_0x00e4
        L_0x00e0:
            int r7 = r3.hashCode()
        L_0x00e4:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00e8:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.x1.E(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0127
        L_0x00f5:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.x1.r(r9, r5)
        L_0x00fb:
            int r3 = com.google.protobuf.c0.c(r3)
            goto L_0x0127
        L_0x0100:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.x1.A(r9, r5)
            goto L_0x0127
        L_0x0107:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.x1.C(r9, r5)
            goto L_0x0123
        L_0x010e:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.x1.z(r9, r5)
        L_0x0114:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0127
        L_0x0119:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.x1.y(r9, r5)
        L_0x011f:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0123:
            int r3 = com.google.protobuf.c0.f(r3)
        L_0x0127:
            int r2 = r2 + r3
        L_0x0128:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            com.google.protobuf.t1 r0 = r8.f8813o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f8804f
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            com.google.protobuf.s r0 = r8.f8814p
            com.google.protobuf.v r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w0.j(java.lang.Object):int");
    }
}
