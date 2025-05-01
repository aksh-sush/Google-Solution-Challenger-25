package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.f0;
import com.google.protobuf.t0;
import com.google.protobuf.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class v {

    /* renamed from: d  reason: collision with root package name */
    private static final v f8750d = new v(true);

    /* renamed from: a  reason: collision with root package name */
    private final o1 f8751a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8752b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8753c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8754a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f8755b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                com.google.protobuf.z1$b[] r0 = com.google.protobuf.z1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8755b = r0
                r1 = 1
                com.google.protobuf.z1$b r2 = com.google.protobuf.z1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8755b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z1$b r3 = com.google.protobuf.z1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f8755b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z1$b r4 = com.google.protobuf.z1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f8755b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z1$b r5 = com.google.protobuf.z1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f8755b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z1$b r6 = com.google.protobuf.z1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f8755b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z1$b r7 = com.google.protobuf.z1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f8755b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z1$b r8 = com.google.protobuf.z1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f8755b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.z1$b r9 = com.google.protobuf.z1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f8755b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.z1$b r10 = com.google.protobuf.z1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                com.google.protobuf.z1$c[] r9 = com.google.protobuf.z1.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f8754a = r9
                com.google.protobuf.z1$c r10 = com.google.protobuf.z1.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f8754a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                com.google.protobuf.z1$c r9 = com.google.protobuf.z1.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x00fd }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x0107 }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x0111 }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x011b }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x012f }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f8754a     // Catch:{ NoSuchFieldError -> 0x0139 }
                com.google.protobuf.z1$c r1 = com.google.protobuf.z1.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v.a.<clinit>():void");
        }
    }

    public interface b extends Comparable {
        boolean b();

        z1.b e();

        t0.a g(t0.a aVar, t0 t0Var);

        int getNumber();

        z1.c j();

        boolean k();
    }

    private v() {
        this.f8751a = o1.q(16);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(z1.b bVar, int i10, Object obj) {
        int T = m.T(i10);
        if (bVar == z1.b.GROUP) {
            T *= 2;
        }
        return T + e(bVar, obj);
    }

    static int e(z1.b bVar, Object obj) {
        switch (a.f8755b[bVar.ordinal()]) {
            case 1:
                return m.k(((Double) obj).doubleValue());
            case 2:
                return m.s(((Float) obj).floatValue());
            case 3:
                return m.z(((Long) obj).longValue());
            case 4:
                return m.X(((Long) obj).longValue());
            case 5:
                return m.x(((Integer) obj).intValue());
            case 6:
                return m.q(((Long) obj).longValue());
            case 7:
                return m.o(((Integer) obj).intValue());
            case 8:
                return m.f(((Boolean) obj).booleanValue());
            case 9:
                return m.u((t0) obj);
            case 10:
                return m.E((t0) obj);
            case 11:
                return obj instanceof j ? m.i((j) obj) : m.S((String) obj);
            case 12:
                return obj instanceof j ? m.i((j) obj) : m.g((byte[]) obj);
            case 13:
                return m.V(((Integer) obj).intValue());
            case 14:
                return m.K(((Integer) obj).intValue());
            case 15:
                return m.M(((Long) obj).longValue());
            case 16:
                return m.O(((Integer) obj).intValue());
            case 17:
                return m.Q(((Long) obj).longValue());
            case 18:
                return obj instanceof c0.c ? m.m(((c0.c) obj).getNumber()) : m.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b bVar, Object obj) {
        z1.b e10 = bVar.e();
        int number = bVar.getNumber();
        if (!bVar.b()) {
            return d(e10, number, obj);
        }
        int i10 = 0;
        List<Object> list = (List) obj;
        if (bVar.k()) {
            for (Object e11 : list) {
                i10 += e(e10, e11);
            }
            return m.T(number) + i10 + m.I(i10);
        }
        for (Object d10 : list) {
            i10 += d(e10, number, d10);
        }
        return i10;
    }

    private int j(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        return (bVar.j() != z1.c.MESSAGE || bVar.b() || bVar.k()) ? f(bVar, value) : m.B(((b) entry.getKey()).getNumber(), (t0) value);
    }

    static int l(z1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.c();
    }

    private static boolean o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.j() != z1.c.MESSAGE) {
            return true;
        }
        boolean b10 = bVar.b();
        Object value = entry.getValue();
        if (b10) {
            for (t0 isInitialized : (List) value) {
                if (!isInitialized.isInitialized()) {
                    return false;
                }
            }
            return true;
        } else if (value instanceof t0) {
            return ((t0) value).isInitialized();
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static boolean p(z1.b bVar, Object obj) {
        c0.a(obj);
        switch (a.f8754a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof j) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof c0.c);
            case 9:
                return obj instanceof t0;
            default:
                return false;
        }
    }

    private void t(Map.Entry entry) {
        Object obj;
        o1 o1Var;
        Object h10;
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.b()) {
            Object h11 = h(bVar);
            if (h11 == null) {
                h11 = new ArrayList();
            }
            for (Object c10 : (List) value) {
                ((List) h11).add(c(c10));
            }
            this.f8751a.r(bVar, h11);
            return;
        }
        if (bVar.j() != z1.c.MESSAGE || (h10 = h(bVar)) == null) {
            o1Var = this.f8751a;
            obj = c(value);
        } else {
            obj = bVar.g(((t0) h10).toBuilder(), (t0) value).build();
            o1Var = this.f8751a;
        }
        o1Var.r(bVar, obj);
    }

    public static v u() {
        return new v();
    }

    private void w(z1.b bVar, Object obj) {
        if (!p(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void x(m mVar, z1.b bVar, int i10, Object obj) {
        if (bVar == z1.b.GROUP) {
            mVar.y0(i10, (t0) obj);
            return;
        }
        mVar.V0(i10, l(bVar, false));
        y(mVar, bVar, obj);
    }

    static void y(m mVar, z1.b bVar, Object obj) {
        switch (a.f8755b[bVar.ordinal()]) {
            case 1:
                mVar.p0(((Double) obj).doubleValue());
                return;
            case 2:
                mVar.x0(((Float) obj).floatValue());
                return;
            case 3:
                mVar.F0(((Long) obj).longValue());
                return;
            case 4:
                mVar.Z0(((Long) obj).longValue());
                return;
            case 5:
                mVar.D0(((Integer) obj).intValue());
                return;
            case 6:
                mVar.v0(((Long) obj).longValue());
                return;
            case 7:
                mVar.t0(((Integer) obj).intValue());
                return;
            case 8:
                mVar.j0(((Boolean) obj).booleanValue());
                return;
            case 9:
                mVar.A0((t0) obj);
                return;
            case 10:
                mVar.H0((t0) obj);
                return;
            case 11:
                if (!(obj instanceof j)) {
                    mVar.U0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof j)) {
                    mVar.k0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                mVar.X0(((Integer) obj).intValue());
                return;
            case 14:
                mVar.M0(((Integer) obj).intValue());
                return;
            case 15:
                mVar.O0(((Long) obj).longValue());
                return;
            case 16:
                mVar.Q0(((Integer) obj).intValue());
                return;
            case 17:
                mVar.S0(((Long) obj).longValue());
                return;
            case 18:
                mVar.r0(obj instanceof c0.c ? ((c0.c) obj).getNumber() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        mVar.n0((j) obj);
    }

    public void a(b bVar, Object obj) {
        List list;
        if (bVar.b()) {
            w(bVar.e(), obj);
            Object h10 = h(bVar);
            if (h10 == null) {
                list = new ArrayList();
                this.f8751a.r(bVar, list);
            } else {
                list = (List) h10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public v clone() {
        v u10 = u();
        for (int i10 = 0; i10 < this.f8751a.k(); i10++) {
            Map.Entry j10 = this.f8751a.j(i10);
            u10.v((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry entry : this.f8751a.m()) {
            u10.v((b) entry.getKey(), entry.getValue());
        }
        u10.f8753c = this.f8753c;
        return u10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return this.f8751a.equals(((v) obj).f8751a);
    }

    /* access modifiers changed from: package-private */
    public Iterator g() {
        return this.f8753c ? new f0.b(this.f8751a.h().iterator()) : this.f8751a.h().iterator();
    }

    public Object h(b bVar) {
        return this.f8751a.get(bVar);
    }

    public int hashCode() {
        return this.f8751a.hashCode();
    }

    public int i() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f8751a.k(); i11++) {
            i10 += j(this.f8751a.j(i11));
        }
        for (Map.Entry j10 : this.f8751a.m()) {
            i10 += j(j10);
        }
        return i10;
    }

    public int k() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f8751a.k(); i11++) {
            Map.Entry j10 = this.f8751a.j(i11);
            i10 += f((b) j10.getKey(), j10.getValue());
        }
        for (Map.Entry entry : this.f8751a.m()) {
            i10 += f((b) entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f8751a.isEmpty();
    }

    public boolean n() {
        for (int i10 = 0; i10 < this.f8751a.k(); i10++) {
            if (!o(this.f8751a.j(i10))) {
                return false;
            }
        }
        for (Map.Entry o10 : this.f8751a.m()) {
            if (!o(o10)) {
                return false;
            }
        }
        return true;
    }

    public Iterator q() {
        return this.f8753c ? new f0.b(this.f8751a.entrySet().iterator()) : this.f8751a.entrySet().iterator();
    }

    public void r() {
        if (!this.f8752b) {
            this.f8751a.p();
            this.f8752b = true;
        }
    }

    public void s(v vVar) {
        for (int i10 = 0; i10 < vVar.f8751a.k(); i10++) {
            t(vVar.f8751a.j(i10));
        }
        for (Map.Entry t10 : vVar.f8751a.m()) {
            t(t10);
        }
    }

    public void v(b bVar, Object obj) {
        if (!bVar.b()) {
            w(bVar.e(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object w10 : arrayList) {
                w(bVar.e(), w10);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f8751a.r(bVar, obj);
    }

    private v(o1 o1Var) {
        this.f8751a = o1Var;
        r();
    }

    private v(boolean z10) {
        this(o1.q(0));
        r();
    }
}
