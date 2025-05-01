package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.server.response.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y3.l;
import y3.m;

public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    private final int f5751e;

    /* renamed from: f  reason: collision with root package name */
    private final Parcel f5752f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5753g = 2;

    /* renamed from: h  reason: collision with root package name */
    private final h f5754h;

    /* renamed from: i  reason: collision with root package name */
    private final String f5755i;

    /* renamed from: j  reason: collision with root package name */
    private int f5756j;

    /* renamed from: k  reason: collision with root package name */
    private int f5757k;

    c(int i10, Parcel parcel, h hVar) {
        this.f5751e = i10;
        this.f5752f = (Parcel) s.k(parcel);
        this.f5754h = hVar;
        this.f5755i = hVar == null ? null : hVar.U();
        this.f5756j = 2;
    }

    private final void e(a.C0089a aVar) {
        if (aVar.f5746k != -1) {
            Parcel parcel = this.f5752f;
            if (parcel != null) {
                int i10 = this.f5756j;
                if (i10 == 0) {
                    this.f5757k = s3.c.a(parcel);
                    this.f5756j = 1;
                } else if (i10 != 1) {
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0109, code lost:
        r2 = com.google.android.gms.common.server.response.a.zaD(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010d, code lost:
        i(r11, r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0216, code lost:
        r11.append(r2);
        r11.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024b, code lost:
        r11.append(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
        /*
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x000d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.a$a r2 = (com.google.android.gms.common.server.response.a.C0089a) r2
            int r2 = r2.m0()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = s3.b.L(r13)
            r1 = 0
            r2 = 0
        L_0x0032:
            int r3 = r13.dataPosition()
            if (r3 >= r12) goto L_0x0259
            int r3 = s3.b.C(r13)
            int r4 = s3.b.v(r3)
            java.lang.Object r4 = r0.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x0032
            java.lang.String r5 = ","
            if (r2 == 0) goto L_0x004f
            r11.append(r5)
        L_0x004f:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.common.server.response.a$a r4 = (com.google.android.gms.common.server.response.a.C0089a) r4
            java.lang.String r6 = "\""
            r11.append(r6)
            r11.append(r2)
            java.lang.String r2 = "\":"
            r11.append(r2)
            boolean r2 = r4.F0()
            r7 = 1
            if (r2 == 0) goto L_0x0113
            int r2 = r4.f5743h
            switch(r2) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f3;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00dc;
                case 6: goto L_0x00d3;
                case 7: goto L_0x00ce;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00c5;
                case 10: goto L_0x0095;
                case 11: goto L_0x008d;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 36
            r12.<init>(r13)
            java.lang.String r13 = "Unknown field out type = "
            r12.append(r13)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x008d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x0095:
            android.os.Bundle r2 = s3.b.f(r13, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c0
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r2.getString(r6)
            java.lang.Object r8 = com.google.android.gms.common.internal.s.k(r8)
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r6, r8)
            goto L_0x00a6
        L_0x00c0:
            java.lang.Object r2 = com.google.android.gms.common.server.response.a.zaD(r4, r3)
            goto L_0x010d
        L_0x00c5:
            byte[] r2 = s3.b.g(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.a.zaD(r4, r2)
            goto L_0x010d
        L_0x00ce:
            java.lang.String r2 = s3.b.p(r13, r3)
            goto L_0x0109
        L_0x00d3:
            boolean r2 = s3.b.w(r13, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0109
        L_0x00dc:
            java.math.BigDecimal r2 = s3.b.a(r13, r3)
            goto L_0x0109
        L_0x00e1:
            double r2 = s3.b.y(r13, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L_0x0109
        L_0x00ea:
            float r2 = s3.b.A(r13, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x0109
        L_0x00f3:
            long r2 = s3.b.G(r13, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0109
        L_0x00fc:
            java.math.BigInteger r2 = s3.b.c(r13, r3)
            goto L_0x0109
        L_0x0101:
            int r2 = s3.b.E(r13, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0109:
            java.lang.Object r2 = com.google.android.gms.common.server.response.a.zaD(r4, r2)
        L_0x010d:
            i(r11, r4, r2)
        L_0x0110:
            r2 = 1
            goto L_0x0032
        L_0x0113:
            boolean r2 = r4.f5744i
            if (r2 == 0) goto L_0x0195
            java.lang.String r2 = "["
            r11.append(r2)
            int r2 = r4.f5743h
            switch(r2) {
                case 0: goto L_0x0187;
                case 1: goto L_0x017f;
                case 2: goto L_0x0177;
                case 3: goto L_0x016f;
                case 4: goto L_0x0167;
                case 5: goto L_0x015f;
                case 6: goto L_0x0157;
                case 7: goto L_0x014f;
                case 8: goto L_0x0147;
                case 9: goto L_0x0147;
                case 10: goto L_0x0147;
                case 11: goto L_0x0129;
                default: goto L_0x0121;
            }
        L_0x0121:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0129:
            android.os.Parcel[] r2 = s3.b.n(r13, r3)
            int r3 = r2.length
            r6 = 0
        L_0x012f:
            if (r6 >= r3) goto L_0x018e
            if (r6 <= 0) goto L_0x0136
            r11.append(r5)
        L_0x0136:
            r8 = r2[r6]
            r8.setDataPosition(r1)
            java.util.Map r8 = r4.D0()
            r9 = r2[r6]
            r10.f(r11, r8, r9)
            int r6 = r6 + 1
            goto L_0x012f
        L_0x0147:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x014f:
            java.lang.String[] r2 = s3.b.q(r13, r3)
            y3.b.j(r11, r2)
            goto L_0x018e
        L_0x0157:
            boolean[] r2 = s3.b.e(r13, r3)
            y3.b.i(r11, r2)
            goto L_0x018e
        L_0x015f:
            java.math.BigDecimal[] r2 = s3.b.b(r13, r3)
            y3.b.h(r11, r2)
            goto L_0x018e
        L_0x0167:
            double[] r2 = s3.b.i(r13, r3)
            y3.b.d(r11, r2)
            goto L_0x018e
        L_0x016f:
            float[] r2 = s3.b.j(r13, r3)
            y3.b.e(r11, r2)
            goto L_0x018e
        L_0x0177:
            long[] r2 = s3.b.l(r13, r3)
            y3.b.g(r11, r2)
            goto L_0x018e
        L_0x017f:
            java.math.BigInteger[] r2 = s3.b.d(r13, r3)
            y3.b.h(r11, r2)
            goto L_0x018e
        L_0x0187:
            int[] r2 = s3.b.k(r13, r3)
            y3.b.f(r11, r2)
        L_0x018e:
            java.lang.String r2 = "]"
        L_0x0190:
            r11.append(r2)
            goto L_0x0110
        L_0x0195:
            int r2 = r4.f5743h
            switch(r2) {
                case 0: goto L_0x0250;
                case 1: goto L_0x0247;
                case 2: goto L_0x023e;
                case 3: goto L_0x0235;
                case 4: goto L_0x022c;
                case 5: goto L_0x0227;
                case 6: goto L_0x021e;
                case 7: goto L_0x020b;
                case 8: goto L_0x01ff;
                case 9: goto L_0x01f3;
                case 10: goto L_0x01b2;
                case 11: goto L_0x01a2;
                default: goto L_0x019a;
            }
        L_0x019a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x01a2:
            android.os.Parcel r2 = s3.b.m(r13, r3)
            r2.setDataPosition(r1)
            java.util.Map r3 = r4.D0()
            r10.f(r11, r3, r2)
            goto L_0x0110
        L_0x01b2:
            android.os.Bundle r2 = s3.b.f(r13, r3)
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "{"
            r11.append(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
        L_0x01c4:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x01f0
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r4 != 0) goto L_0x01d5
            r11.append(r5)
        L_0x01d5:
            r11.append(r6)
            r11.append(r8)
            java.lang.String r4 = "\":\""
            r11.append(r4)
            java.lang.String r4 = r2.getString(r8)
            java.lang.String r4 = y3.l.a(r4)
            r11.append(r4)
            r11.append(r6)
            r4 = 0
            goto L_0x01c4
        L_0x01f0:
            java.lang.String r2 = "}"
            goto L_0x0190
        L_0x01f3:
            byte[] r2 = s3.b.g(r13, r3)
            r11.append(r6)
            java.lang.String r2 = y3.c.d(r2)
            goto L_0x0216
        L_0x01ff:
            byte[] r2 = s3.b.g(r13, r3)
            r11.append(r6)
            java.lang.String r2 = y3.c.c(r2)
            goto L_0x0216
        L_0x020b:
            java.lang.String r2 = s3.b.p(r13, r3)
            r11.append(r6)
            java.lang.String r2 = y3.l.a(r2)
        L_0x0216:
            r11.append(r2)
            r11.append(r6)
            goto L_0x0110
        L_0x021e:
            boolean r2 = s3.b.w(r13, r3)
            r11.append(r2)
            goto L_0x0110
        L_0x0227:
            java.math.BigDecimal r2 = s3.b.a(r13, r3)
            goto L_0x024b
        L_0x022c:
            double r2 = s3.b.y(r13, r3)
            r11.append(r2)
            goto L_0x0110
        L_0x0235:
            float r2 = s3.b.A(r13, r3)
            r11.append(r2)
            goto L_0x0110
        L_0x023e:
            long r2 = s3.b.G(r13, r3)
            r11.append(r2)
            goto L_0x0110
        L_0x0247:
            java.math.BigInteger r2 = s3.b.c(r13, r3)
        L_0x024b:
            r11.append(r2)
            goto L_0x0110
        L_0x0250:
            int r2 = s3.b.E(r13, r3)
            r11.append(r2)
            goto L_0x0110
        L_0x0259:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x0265
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x0265:
            s3.b$a r11 = new s3.b$a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 37
            r0.<init>(r1)
            java.lang.String r1 = "Overread allowed size end="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12, r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.c.f(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    private static final void g(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(l.a(s.k(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(y3.c.c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(y3.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                m.a(sb2, (HashMap) s.k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb3 = new StringBuilder(26);
                sb3.append("Unknown type = ");
                sb3.append(i10);
                throw new IllegalArgumentException(sb3.toString());
        }
    }

    private static final void i(StringBuilder sb2, a.C0089a aVar, Object obj) {
        if (aVar.f5742g) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                g(sb2, aVar.f5741f, arrayList.get(i10));
            }
            sb2.append("]");
            return;
        }
        g(sb2, aVar.f5741f, obj);
    }

    public final void addConcreteTypeArrayInternal(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) s.k(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) ((a) arrayList.get(i10))).d());
        }
        s3.c.A(this.f5752f, aVar.m0(), arrayList2, true);
    }

    public final void addConcreteTypeInternal(a.C0089a aVar, String str, a aVar2) {
        e(aVar);
        s3.c.z(this.f5752f, aVar.m0(), ((c) aVar2).d(), true);
    }

    public final Parcel d() {
        int i10 = this.f5756j;
        if (i10 != 0) {
            if (i10 == 1) {
                s3.c.b(this.f5752f, this.f5757k);
            }
            return this.f5752f;
        }
        int a10 = s3.c.a(this.f5752f);
        this.f5757k = a10;
        s3.c.b(this.f5752f, a10);
        this.f5756j = 2;
        return this.f5752f;
    }

    public final Map getFieldMappings() {
        h hVar = this.f5754h;
        if (hVar == null) {
            return null;
        }
        return hVar.V((String) s.k(this.f5755i));
    }

    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* access modifiers changed from: protected */
    public final void setBooleanInternal(a.C0089a aVar, String str, boolean z10) {
        e(aVar);
        s3.c.g(this.f5752f, aVar.m0(), z10);
    }

    /* access modifiers changed from: protected */
    public final void setDecodedBytesInternal(a.C0089a aVar, String str, byte[] bArr) {
        e(aVar);
        s3.c.k(this.f5752f, aVar.m0(), bArr, true);
    }

    /* access modifiers changed from: protected */
    public final void setIntegerInternal(a.C0089a aVar, String str, int i10) {
        e(aVar);
        s3.c.t(this.f5752f, aVar.m0(), i10);
    }

    /* access modifiers changed from: protected */
    public final void setLongInternal(a.C0089a aVar, String str, long j10) {
        e(aVar);
        s3.c.w(this.f5752f, aVar.m0(), j10);
    }

    /* access modifiers changed from: protected */
    public final void setStringInternal(a.C0089a aVar, String str, String str2) {
        e(aVar);
        s3.c.D(this.f5752f, aVar.m0(), str2, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringMapInternal(a.C0089a aVar, String str, Map map) {
        e(aVar);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) s.k(map)).keySet()) {
            bundle.putString(str2, (String) map.get(str2));
        }
        s3.c.j(this.f5752f, aVar.m0(), bundle, true);
    }

    /* access modifiers changed from: protected */
    public final void setStringsInternal(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = (String) arrayList.get(i10);
        }
        s3.c.E(this.f5752f, aVar.m0(), strArr, true);
    }

    public final String toString() {
        s.l(this.f5754h, "Cannot convert to JSON on client side.");
        Parcel d10 = d();
        d10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        f(sb2, (Map) s.k(this.f5754h.V((String) s.k(this.f5755i))), d10);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = s3.c.a(parcel);
        s3.c.t(parcel, 1, this.f5751e);
        s3.c.z(parcel, 2, d(), false);
        s3.c.B(parcel, 3, this.f5753g != 0 ? this.f5754h : null, i10, false);
        s3.c.b(parcel, a10);
    }

    /* access modifiers changed from: protected */
    public final void zab(a.C0089a aVar, String str, BigDecimal bigDecimal) {
        e(aVar);
        s3.c.c(this.f5752f, aVar.m0(), bigDecimal, true);
    }

    /* access modifiers changed from: protected */
    public final void zad(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        s3.c.d(this.f5752f, aVar.m0(), bigDecimalArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaf(a.C0089a aVar, String str, BigInteger bigInteger) {
        e(aVar);
        s3.c.e(this.f5752f, aVar.m0(), bigInteger, true);
    }

    /* access modifiers changed from: protected */
    public final void zah(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        s3.c.f(this.f5752f, aVar.m0(), bigIntegerArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zak(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        s3.c.h(this.f5752f, aVar.m0(), zArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zan(a.C0089a aVar, String str, double d10) {
        e(aVar);
        s3.c.m(this.f5752f, aVar.m0(), d10);
    }

    /* access modifiers changed from: protected */
    public final void zap(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        s3.c.n(this.f5752f, aVar.m0(), dArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zar(a.C0089a aVar, String str, float f10) {
        e(aVar);
        s3.c.p(this.f5752f, aVar.m0(), f10);
    }

    /* access modifiers changed from: protected */
    public final void zat(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        s3.c.q(this.f5752f, aVar.m0(), fArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaw(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        s3.c.u(this.f5752f, aVar.m0(), iArr, true);
    }

    /* access modifiers changed from: protected */
    public final void zaz(a.C0089a aVar, String str, ArrayList arrayList) {
        e(aVar);
        int size = ((ArrayList) s.k(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        s3.c.x(this.f5752f, aVar.m0(), jArr, true);
    }
}
