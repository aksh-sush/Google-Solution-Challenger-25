package com.google.firebase.firestore.model;

import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.c1;
import com.google.protobuf.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import t5.b;
import t5.r;
import t5.x;

public class Values {
    public static final x NAN_VALUE = ((x) x.F().i(Double.NaN).build());
    public static final x NULL_VALUE = ((x) x.F().n(c1.NULL_VALUE).build());
    public static final int TYPE_ORDER_ARRAY = 9;
    public static final int TYPE_ORDER_BLOB = 6;
    public static final int TYPE_ORDER_BOOLEAN = 1;
    public static final int TYPE_ORDER_GEOPOINT = 8;
    public static final int TYPE_ORDER_MAP = 10;
    public static final int TYPE_ORDER_NULL = 0;
    public static final int TYPE_ORDER_NUMBER = 2;
    public static final int TYPE_ORDER_REFERENCE = 7;
    public static final int TYPE_ORDER_SERVER_TIMESTAMP = 4;
    public static final int TYPE_ORDER_STRING = 5;
    public static final int TYPE_ORDER_TIMESTAMP = 3;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                t5.x$c[] r0 = t5.x.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8126a = r0
                t5.x$c r1 = t5.x.c.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x001d }
                t5.x$c r1 = t5.x.c.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0028 }
                t5.x$c r1 = t5.x.c.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0033 }
                t5.x$c r1 = t5.x.c.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x003e }
                t5.x$c r1 = t5.x.c.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0049 }
                t5.x$c r1 = t5.x.c.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0054 }
                t5.x$c r1 = t5.x.c.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0060 }
                t5.x$c r1 = t5.x.c.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x006c }
                t5.x$c r1 = t5.x.c.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0078 }
                t5.x$c r1 = t5.x.c.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8126a     // Catch:{ NoSuchFieldError -> 0x0084 }
                t5.x$c r1 = t5.x.c.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.Values.a.<clinit>():void");
        }
    }

    private static boolean arrayEquals(x xVar, x xVar2) {
        t5.a t10 = xVar.t();
        t5.a t11 = xVar2.t();
        if (t10.q() != t11.q()) {
            return false;
        }
        for (int i10 = 0; i10 < t10.q(); i10++) {
            if (!equals(t10.p(i10), t11.p(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String canonicalId(x xVar) {
        StringBuilder sb2 = new StringBuilder();
        canonifyValue(sb2, xVar);
        return sb2.toString();
    }

    private static void canonifyArray(StringBuilder sb2, t5.a aVar) {
        sb2.append("[");
        for (int i10 = 0; i10 < aVar.q(); i10++) {
            canonifyValue(sb2, aVar.p(i10));
            if (i10 != aVar.q() - 1) {
                sb2.append(",");
            }
        }
        sb2.append("]");
    }

    private static void canonifyGeoPoint(StringBuilder sb2, w5.a aVar) {
        sb2.append(String.format("geo(%s,%s)", new Object[]{Double.valueOf(aVar.l()), Double.valueOf(aVar.m())}));
    }

    private static void canonifyObject(StringBuilder sb2, r rVar) {
        ArrayList<String> arrayList = new ArrayList<>(rVar.l().keySet());
        Collections.sort(arrayList);
        sb2.append("{");
        boolean z10 = true;
        for (String str : arrayList) {
            if (!z10) {
                sb2.append(",");
            } else {
                z10 = false;
            }
            sb2.append(str);
            sb2.append(":");
            canonifyValue(sb2, rVar.n(str));
        }
        sb2.append("}");
    }

    private static void canonifyReference(StringBuilder sb2, x xVar) {
        Assert.hardAssert(isReferenceValue(xVar), "Value should be a ReferenceValue", new Object[0]);
        sb2.append(DocumentKey.fromName(xVar.B()));
    }

    private static void canonifyTimestamp(StringBuilder sb2, r1 r1Var) {
        sb2.append(String.format("time(%s,%s)", new Object[]{Long.valueOf(r1Var.m()), Integer.valueOf(r1Var.l())}));
    }

    private static void canonifyValue(StringBuilder sb2, x xVar) {
        String str;
        switch (a.f8126a[xVar.E().ordinal()]) {
            case 1:
                str = "null";
                break;
            case 2:
                sb2.append(xVar.u());
                return;
            case 3:
                sb2.append(xVar.z());
                return;
            case 4:
                sb2.append(xVar.x());
                return;
            case 5:
                canonifyTimestamp(sb2, xVar.D());
                return;
            case 6:
                str = xVar.C();
                break;
            case 7:
                str = Util.toDebugString(xVar.v());
                break;
            case 8:
                canonifyReference(sb2, xVar);
                return;
            case 9:
                canonifyGeoPoint(sb2, xVar.y());
                return;
            case 10:
                canonifyArray(sb2, xVar.t());
                return;
            case 11:
                canonifyObject(sb2, xVar.A());
                return;
            default:
                throw Assert.fail("Invalid value type: " + xVar.E(), new Object[0]);
        }
        sb2.append(str);
    }

    public static int compare(x xVar, x xVar2) {
        int typeOrder = typeOrder(xVar);
        int typeOrder2 = typeOrder(xVar2);
        if (typeOrder != typeOrder2) {
            return Util.compareIntegers(typeOrder, typeOrder2);
        }
        switch (typeOrder) {
            case 0:
                return 0;
            case 1:
                return Util.compareBooleans(xVar.u(), xVar2.u());
            case 2:
                return compareNumbers(xVar, xVar2);
            case 3:
                return compareTimestamps(xVar.D(), xVar2.D());
            case 4:
                return compareTimestamps(ServerTimestamps.getLocalWriteTime(xVar), ServerTimestamps.getLocalWriteTime(xVar2));
            case 5:
                return xVar.C().compareTo(xVar2.C());
            case 6:
                return Util.compareByteStrings(xVar.v(), xVar2.v());
            case 7:
                return compareReferences(xVar.B(), xVar2.B());
            case 8:
                return compareGeoPoints(xVar.y(), xVar2.y());
            case 9:
                return compareArrays(xVar.t(), xVar2.t());
            case 10:
                return compareMaps(xVar.A(), xVar2.A());
            default:
                throw Assert.fail("Invalid value type: " + typeOrder, new Object[0]);
        }
    }

    private static int compareArrays(t5.a aVar, t5.a aVar2) {
        int min = Math.min(aVar.q(), aVar2.q());
        for (int i10 = 0; i10 < min; i10++) {
            int compare = compare(aVar.p(i10), aVar2.p(i10));
            if (compare != 0) {
                return compare;
            }
        }
        return Util.compareIntegers(aVar.q(), aVar2.q());
    }

    private static int compareGeoPoints(w5.a aVar, w5.a aVar2) {
        int compareDoubles = Util.compareDoubles(aVar.l(), aVar2.l());
        return compareDoubles == 0 ? Util.compareDoubles(aVar.m(), aVar2.m()) : compareDoubles;
    }

    private static int compareMaps(r rVar, r rVar2) {
        Iterator it = new TreeMap(rVar.l()).entrySet().iterator();
        Iterator it2 = new TreeMap(rVar2.l()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int compare = compare((x) entry.getValue(), (x) entry2.getValue());
            if (compare != 0) {
                return compare;
            }
        }
        return Util.compareBooleans(it.hasNext(), it2.hasNext());
    }

    private static int compareNumbers(x xVar, x xVar2) {
        x.c E = xVar.E();
        x.c cVar = x.c.DOUBLE_VALUE;
        if (E == cVar) {
            double x10 = xVar.x();
            if (xVar2.E() == cVar) {
                return Util.compareDoubles(x10, xVar2.x());
            }
            if (xVar2.E() == x.c.INTEGER_VALUE) {
                return Util.compareMixed(x10, xVar2.z());
            }
        } else {
            x.c E2 = xVar.E();
            x.c cVar2 = x.c.INTEGER_VALUE;
            if (E2 == cVar2) {
                long z10 = xVar.z();
                if (xVar2.E() == cVar2) {
                    return Util.compareLongs(z10, xVar2.z());
                }
                if (xVar2.E() == cVar) {
                    return Util.compareMixed(xVar2.x(), z10) * -1;
                }
            }
        }
        throw Assert.fail("Unexpected values: %s vs %s", xVar, xVar2);
    }

    private static int compareReferences(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int compareTo = split[i10].compareTo(split2[i10]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Util.compareIntegers(split.length, split2.length);
    }

    private static int compareTimestamps(r1 r1Var, r1 r1Var2) {
        int compareLongs = Util.compareLongs(r1Var.m(), r1Var2.m());
        return compareLongs != 0 ? compareLongs : Util.compareIntegers(r1Var.l(), r1Var2.l());
    }

    public static boolean contains(b bVar, x xVar) {
        for (x equals : bVar.a()) {
            if (equals(equals, xVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals(x xVar, x xVar2) {
        int typeOrder;
        if (xVar == null && xVar2 == null) {
            return true;
        }
        if (xVar == null || xVar2 == null || (typeOrder = typeOrder(xVar)) != typeOrder(xVar2)) {
            return false;
        }
        if (typeOrder == 2) {
            return numberEquals(xVar, xVar2);
        }
        if (typeOrder == 4) {
            return ServerTimestamps.getLocalWriteTime(xVar).equals(ServerTimestamps.getLocalWriteTime(xVar2));
        }
        if (typeOrder != 9) {
            return typeOrder != 10 ? xVar.equals(xVar2) : objectEquals(xVar, xVar2);
        }
        return arrayEquals(xVar, xVar2);
    }

    public static boolean isArray(x xVar) {
        return xVar != null && xVar.E() == x.c.ARRAY_VALUE;
    }

    public static boolean isDouble(x xVar) {
        return xVar != null && xVar.E() == x.c.DOUBLE_VALUE;
    }

    public static boolean isInteger(x xVar) {
        return xVar != null && xVar.E() == x.c.INTEGER_VALUE;
    }

    public static boolean isMapValue(x xVar) {
        return xVar != null && xVar.E() == x.c.MAP_VALUE;
    }

    public static boolean isNanValue(x xVar) {
        return xVar != null && Double.isNaN(xVar.x());
    }

    public static boolean isNullValue(x xVar) {
        return xVar != null && xVar.E() == x.c.NULL_VALUE;
    }

    public static boolean isNumber(x xVar) {
        return isInteger(xVar) || isDouble(xVar);
    }

    public static boolean isReferenceValue(x xVar) {
        return xVar != null && xVar.E() == x.c.REFERENCE_VALUE;
    }

    private static boolean numberEquals(x xVar, x xVar2) {
        x.c E = xVar.E();
        x.c cVar = x.c.INTEGER_VALUE;
        if (E == cVar && xVar2.E() == cVar) {
            return xVar.z() == xVar2.z();
        }
        x.c E2 = xVar.E();
        x.c cVar2 = x.c.DOUBLE_VALUE;
        return E2 == cVar2 && xVar2.E() == cVar2 && Double.doubleToLongBits(xVar.x()) == Double.doubleToLongBits(xVar2.x());
    }

    private static boolean objectEquals(x xVar, x xVar2) {
        r A = xVar.A();
        r A2 = xVar2.A();
        if (A.k() != A2.k()) {
            return false;
        }
        for (Map.Entry entry : A.l().entrySet()) {
            if (!equals((x) entry.getValue(), (x) A2.l().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static x refValue(DatabaseId databaseId, DocumentKey documentKey) {
        return (x) x.F().o(String.format("projects/%s/databases/%s/documents/%s", new Object[]{databaseId.getProjectId(), databaseId.getDatabaseId(), documentKey.toString()})).build();
    }

    public static int typeOrder(x xVar) {
        switch (a.f8126a[xVar.E().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return ServerTimestamps.isServerTimestamp(xVar) ? 4 : 10;
            default:
                throw Assert.fail("Invalid value type: " + xVar.E(), new Object[0]);
        }
    }
}
