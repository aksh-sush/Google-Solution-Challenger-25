package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import s3.c;
import y3.l;

public abstract class a {

    /* renamed from: com.google.android.gms.common.server.response.a$a  reason: collision with other inner class name */
    public static class C0089a extends s3.a {
        public static final d CREATOR = new d();

        /* renamed from: e  reason: collision with root package name */
        private final int f5740e;

        /* renamed from: f  reason: collision with root package name */
        protected final int f5741f;

        /* renamed from: g  reason: collision with root package name */
        protected final boolean f5742g;

        /* renamed from: h  reason: collision with root package name */
        protected final int f5743h;

        /* renamed from: i  reason: collision with root package name */
        protected final boolean f5744i;

        /* renamed from: j  reason: collision with root package name */
        protected final String f5745j;

        /* renamed from: k  reason: collision with root package name */
        protected final int f5746k;

        /* renamed from: l  reason: collision with root package name */
        protected final Class f5747l;

        /* renamed from: m  reason: collision with root package name */
        protected final String f5748m;

        /* renamed from: n  reason: collision with root package name */
        private h f5749n;
        /* access modifiers changed from: private */

        /* renamed from: o  reason: collision with root package name */
        public b f5750o;

        C0089a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, w3.b bVar) {
            this.f5740e = i10;
            this.f5741f = i11;
            this.f5742g = z10;
            this.f5743h = i12;
            this.f5744i = z11;
            this.f5745j = str;
            this.f5746k = i13;
            if (str2 == null) {
                this.f5747l = null;
                this.f5748m = null;
            } else {
                this.f5747l = c.class;
                this.f5748m = str2;
            }
            if (bVar == null) {
                this.f5750o = null;
            } else {
                this.f5750o = bVar.V();
            }
        }

        public static C0089a U(String str, int i10) {
            return new C0089a(8, false, 8, false, str, i10, (Class) null, (b) null);
        }

        public static C0089a V(String str, int i10, Class cls) {
            return new C0089a(11, false, 11, false, str, i10, cls, (b) null);
        }

        public static C0089a W(String str, int i10, Class cls) {
            return new C0089a(11, true, 11, true, str, i10, cls, (b) null);
        }

        public static C0089a X(String str, int i10) {
            return new C0089a(0, false, 0, false, str, i10, (Class) null, (b) null);
        }

        public static C0089a j0(String str, int i10) {
            return new C0089a(7, false, 7, false, str, i10, (Class) null, (b) null);
        }

        public static C0089a l0(String str, int i10) {
            return new C0089a(7, true, 7, true, str, i10, (Class) null, (b) null);
        }

        public final Object A0(Object obj) {
            s.k(this.f5750o);
            return s.k(this.f5750o.D(obj));
        }

        public final Object B0(Object obj) {
            s.k(this.f5750o);
            return this.f5750o.r(obj);
        }

        /* access modifiers changed from: package-private */
        public final String C0() {
            String str = this.f5748m;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map D0() {
            s.k(this.f5748m);
            s.k(this.f5749n);
            return (Map) s.k(this.f5749n.V(this.f5748m));
        }

        public final void E0(h hVar) {
            this.f5749n = hVar;
        }

        public final boolean F0() {
            return this.f5750o != null;
        }

        public int m0() {
            return this.f5746k;
        }

        public final String toString() {
            q.a a10 = q.d(this).a("versionCode", Integer.valueOf(this.f5740e)).a("typeIn", Integer.valueOf(this.f5741f)).a("typeInArray", Boolean.valueOf(this.f5742g)).a("typeOut", Integer.valueOf(this.f5743h)).a("typeOutArray", Boolean.valueOf(this.f5744i)).a("outputFieldName", this.f5745j).a("safeParcelFieldId", Integer.valueOf(this.f5746k)).a("concreteTypeName", C0());
            Class cls = this.f5747l;
            if (cls != null) {
                a10.a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f5750o;
            if (bVar != null) {
                a10.a("converterName", bVar.getClass().getCanonicalName());
            }
            return a10.toString();
        }

        /* access modifiers changed from: package-private */
        public final w3.b w0() {
            b bVar = this.f5750o;
            if (bVar == null) {
                return null;
            }
            return w3.b.U(bVar);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            int a10 = c.a(parcel);
            c.t(parcel, 1, this.f5740e);
            c.t(parcel, 2, this.f5741f);
            c.g(parcel, 3, this.f5742g);
            c.t(parcel, 4, this.f5743h);
            c.g(parcel, 5, this.f5744i);
            c.D(parcel, 6, this.f5745j, false);
            c.t(parcel, 7, m0());
            c.D(parcel, 8, C0(), false);
            c.B(parcel, 9, w0(), i10, false);
            c.b(parcel, a10);
        }

        protected C0089a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f5740e = 1;
            this.f5741f = i10;
            this.f5742g = z10;
            this.f5743h = i11;
            this.f5744i = z11;
            this.f5745j = str;
            this.f5746k = i12;
            this.f5747l = cls;
            this.f5748m = cls == null ? null : cls.getCanonicalName();
            this.f5750o = bVar;
        }
    }

    public interface b {
        Object D(Object obj);

        Object r(Object obj);
    }

    private final void a(C0089a aVar, Object obj) {
        String str = aVar.f5745j;
        Object A0 = aVar.A0(obj);
        int i10 = aVar.f5743h;
        switch (i10) {
            case 0:
                if (A0 != null) {
                    setIntegerInternal(aVar, str, ((Integer) A0).intValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 1:
                zaf(aVar, str, (BigInteger) A0);
                return;
            case 2:
                if (A0 != null) {
                    setLongInternal(aVar, str, ((Long) A0).longValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 4:
                if (A0 != null) {
                    zan(aVar, str, ((Double) A0).doubleValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 5:
                zab(aVar, str, (BigDecimal) A0);
                return;
            case 6:
                if (A0 != null) {
                    setBooleanInternal(aVar, str, ((Boolean) A0).booleanValue());
                    return;
                } else {
                    c(str);
                    return;
                }
            case 7:
                setStringInternal(aVar, str, (String) A0);
                return;
            case 8:
            case 9:
                if (A0 != null) {
                    setDecodedBytesInternal(aVar, str, (byte[]) A0);
                    return;
                } else {
                    c(str);
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Unsupported type for conversion: ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
        }
    }

    private static final void b(StringBuilder sb2, C0089a aVar, Object obj) {
        String aVar2;
        int i10 = aVar.f5741f;
        if (i10 == 11) {
            Class cls = aVar.f5747l;
            s.k(cls);
            aVar2 = ((a) cls.cast(obj)).toString();
        } else if (i10 == 7) {
            aVar2 = "\"";
            sb2.append(aVar2);
            sb2.append(l.a((String) obj));
        } else {
            sb2.append(obj);
            return;
        }
        sb2.append(aVar2);
    }

    private static final void c(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 58);
            sb2.append("Output field (");
            sb2.append(str);
            sb2.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb2.toString());
        }
    }

    protected static final <O, I> I zaD(C0089a aVar, Object obj) {
        return aVar.f5750o != null ? aVar.B0(obj) : obj;
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0089a aVar, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0089a aVar, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0089a> getFieldMappings();

    /* access modifiers changed from: protected */
    public Object getFieldValue(C0089a aVar) {
        String str = aVar.f5745j;
        if (aVar.f5747l == null) {
            return getValueObject(str);
        }
        s.p(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", aVar.f5745j);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 4);
            sb2.append("get");
            sb2.append(upperCase);
            sb2.append(substring);
            return getClass().getMethod(sb2.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object getValueObject(String str);

    /* access modifiers changed from: protected */
    public boolean isFieldSet(C0089a aVar) {
        if (aVar.f5743h != 11) {
            return isPrimitiveFieldSet(aVar.f5745j);
        }
        if (aVar.f5744i) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    public abstract boolean isPrimitiveFieldSet(String str);

    /* access modifiers changed from: protected */
    public void setBooleanInternal(C0089a aVar, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    /* access modifiers changed from: protected */
    public void setDecodedBytesInternal(C0089a aVar, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    /* access modifiers changed from: protected */
    public void setIntegerInternal(C0089a aVar, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    /* access modifiers changed from: protected */
    public void setLongInternal(C0089a aVar, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringInternal(C0089a aVar, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringMapInternal(C0089a aVar, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    /* access modifiers changed from: protected */
    public void setStringsInternal(C0089a aVar, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r1.append(r3);
        r1.append("\"");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.a$a r4 = (com.google.android.gms.common.server.response.a.C0089a) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L_0x0013
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = zaD(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L_0x0041
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L_0x0044
        L_0x0041:
            r1.append(r7)
        L_0x0044:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L_0x0059
            java.lang.String r3 = "null"
        L_0x0055:
            r1.append(r3)
            goto L_0x0013
        L_0x0059:
            int r3 = r4.f5743h
            switch(r3) {
                case 8: goto L_0x007f;
                case 9: goto L_0x0075;
                case 10: goto L_0x006f;
                default: goto L_0x005e;
            }
        L_0x005e:
            boolean r3 = r4.f5742g
            if (r3 == 0) goto L_0x00a5
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L_0x008f
        L_0x006f:
            java.util.HashMap r5 = (java.util.HashMap) r5
            y3.m.a(r1, r5)
            goto L_0x0013
        L_0x0075:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = y3.c.d(r5)
            goto L_0x0088
        L_0x007f:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = y3.c.c(r5)
        L_0x0088:
            r1.append(r3)
            r1.append(r6)
            goto L_0x0013
        L_0x008f:
            if (r6 >= r3) goto L_0x00a2
            if (r6 <= 0) goto L_0x0096
            r1.append(r7)
        L_0x0096:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto L_0x009f
            b(r1, r4, r8)
        L_0x009f:
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00a2:
            java.lang.String r3 = "]"
            goto L_0x0055
        L_0x00a5:
            b(r1, r4, r5)
            goto L_0x0013
        L_0x00aa:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
            goto L_0x00b5
        L_0x00b3:
            java.lang.String r0 = "{}"
        L_0x00b5:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.a.toString():java.lang.String");
    }

    public final <O> void zaA(C0089a aVar, String str) {
        if (aVar.f5750o != null) {
            a(aVar, str);
        } else {
            setStringInternal(aVar, aVar.f5745j, str);
        }
    }

    public final <O> void zaB(C0089a aVar, Map<String, String> map) {
        if (aVar.f5750o != null) {
            a(aVar, map);
        } else {
            setStringMapInternal(aVar, aVar.f5745j, map);
        }
    }

    public final <O> void zaC(C0089a aVar, ArrayList<String> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            setStringsInternal(aVar, aVar.f5745j, arrayList);
        }
    }

    public final <O> void zaa(C0089a aVar, BigDecimal bigDecimal) {
        if (aVar.f5750o != null) {
            a(aVar, bigDecimal);
        } else {
            zab(aVar, aVar.f5745j, bigDecimal);
        }
    }

    /* access modifiers changed from: protected */
    public void zab(C0089a aVar, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final <O> void zac(C0089a aVar, ArrayList<BigDecimal> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zad(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zad(C0089a aVar, String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final <O> void zae(C0089a aVar, BigInteger bigInteger) {
        if (aVar.f5750o != null) {
            a(aVar, bigInteger);
        } else {
            zaf(aVar, aVar.f5745j, bigInteger);
        }
    }

    /* access modifiers changed from: protected */
    public void zaf(C0089a aVar, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final <O> void zag(C0089a aVar, ArrayList<BigInteger> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zah(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zah(C0089a aVar, String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final <O> void zai(C0089a aVar, boolean z10) {
        if (aVar.f5750o != null) {
            a(aVar, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(aVar, aVar.f5745j, z10);
        }
    }

    public final <O> void zaj(C0089a aVar, ArrayList<Boolean> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zak(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zak(C0089a aVar, String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void zal(C0089a aVar, byte[] bArr) {
        if (aVar.f5750o != null) {
            a(aVar, bArr);
        } else {
            setDecodedBytesInternal(aVar, aVar.f5745j, bArr);
        }
    }

    public final <O> void zam(C0089a aVar, double d10) {
        if (aVar.f5750o != null) {
            a(aVar, Double.valueOf(d10));
        } else {
            zan(aVar, aVar.f5745j, d10);
        }
    }

    /* access modifiers changed from: protected */
    public void zan(C0089a aVar, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final <O> void zao(C0089a aVar, ArrayList<Double> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zap(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zap(C0089a aVar, String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final <O> void zaq(C0089a aVar, float f10) {
        if (aVar.f5750o != null) {
            a(aVar, Float.valueOf(f10));
        } else {
            zar(aVar, aVar.f5745j, f10);
        }
    }

    /* access modifiers changed from: protected */
    public void zar(C0089a aVar, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final <O> void zas(C0089a aVar, ArrayList<Float> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zat(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zat(C0089a aVar, String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final <O> void zau(C0089a aVar, int i10) {
        if (aVar.f5750o != null) {
            a(aVar, Integer.valueOf(i10));
        } else {
            setIntegerInternal(aVar, aVar.f5745j, i10);
        }
    }

    public final <O> void zav(C0089a aVar, ArrayList<Integer> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zaw(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zaw(C0089a aVar, String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final <O> void zax(C0089a aVar, long j10) {
        if (aVar.f5750o != null) {
            a(aVar, Long.valueOf(j10));
        } else {
            setLongInternal(aVar, aVar.f5745j, j10);
        }
    }

    public final <O> void zay(C0089a aVar, ArrayList<Long> arrayList) {
        if (aVar.f5750o != null) {
            a(aVar, arrayList);
        } else {
            zaz(aVar, aVar.f5745j, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void zaz(C0089a aVar, String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
