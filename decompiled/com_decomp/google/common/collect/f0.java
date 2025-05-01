package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import l5.j;

final class f0 extends o {

    /* renamed from: l  reason: collision with root package name */
    static final o f7556l = new f0((Object) null, new Object[0], 0);

    /* renamed from: i  reason: collision with root package name */
    private final transient Object f7557i;

    /* renamed from: j  reason: collision with root package name */
    final transient Object[] f7558j;

    /* renamed from: k  reason: collision with root package name */
    private final transient int f7559k;

    static class a extends s {

        /* renamed from: g  reason: collision with root package name */
        private final transient o f7560g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public final transient Object[] f7561h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public final transient int f7562i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public final transient int f7563j;

        /* renamed from: com.google.common.collect.f0$a$a  reason: collision with other inner class name */
        class C0100a extends n {
            C0100a() {
            }

            public boolean i() {
                return true;
            }

            public int size() {
                return a.this.f7563j;
            }

            /* renamed from: z */
            public Map.Entry get(int i10) {
                j.m(i10, a.this.f7563j);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f7561h[a.this.f7562i + i11], a.this.f7561h[i11 + (a.this.f7562i ^ 1)]);
            }
        }

        a(o oVar, Object[] objArr, int i10, int i11) {
            this.f7560g = oVar;
            this.f7561h = objArr;
            this.f7562i = i10;
            this.f7563j = i11;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f7560g.get(key));
        }

        /* access modifiers changed from: package-private */
        public int d(Object[] objArr, int i10) {
            return b().d(objArr, i10);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        /* renamed from: j */
        public p0 iterator() {
            return b().iterator();
        }

        /* access modifiers changed from: package-private */
        public n p() {
            return new C0100a();
        }

        public int size() {
            return this.f7563j;
        }
    }

    static final class b extends s {

        /* renamed from: g  reason: collision with root package name */
        private final transient o f7565g;

        /* renamed from: h  reason: collision with root package name */
        private final transient n f7566h;

        b(o oVar, n nVar) {
            this.f7565g = oVar;
            this.f7566h = nVar;
        }

        public n b() {
            return this.f7566h;
        }

        public boolean contains(Object obj) {
            return this.f7565g.get(obj) != null;
        }

        /* access modifiers changed from: package-private */
        public int d(Object[] objArr, int i10) {
            return b().d(objArr, i10);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        /* renamed from: j */
        public p0 iterator() {
            return b().iterator();
        }

        public int size() {
            return this.f7565g.size();
        }
    }

    static final class c extends n {

        /* renamed from: g  reason: collision with root package name */
        private final transient Object[] f7567g;

        /* renamed from: h  reason: collision with root package name */
        private final transient int f7568h;

        /* renamed from: i  reason: collision with root package name */
        private final transient int f7569i;

        c(Object[] objArr, int i10, int i11) {
            this.f7567g = objArr;
            this.f7568h = i10;
            this.f7569i = i11;
        }

        public Object get(int i10) {
            j.m(i10, this.f7569i);
            return this.f7567g[(i10 * 2) + this.f7568h];
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public int size() {
            return this.f7569i;
        }
    }

    private f0(Object obj, Object[] objArr, int i10) {
        this.f7557i = obj;
        this.f7558j = objArr;
        this.f7559k = i10;
    }

    static f0 m(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (f0) f7556l;
        }
        if (i10 == 1) {
            g.a(objArr[0], objArr[1]);
            return new f0((Object) null, objArr, 1);
        }
        j.r(i10, objArr.length >> 1);
        return new f0(n(objArr, i10, s.k(i10), 0), objArr, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object n(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto L_0x000e
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            com.google.common.collect.g.a(r10, r9)
            r9 = 0
            return r9
        L_0x000e:
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x0050
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x001b:
            if (r2 >= r10) goto L_0x004f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.g.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.k.a(r5)
        L_0x0031:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x003f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x001b
        L_0x003f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x004a
            int r5 = r5 + 1
            goto L_0x0031
        L_0x004a:
            java.lang.IllegalArgumentException r9 = o(r3, r4, r9, r6)
            throw r9
        L_0x004f:
            return r11
        L_0x0050:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L_0x0090
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x005a:
            if (r2 >= r10) goto L_0x008f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.g.a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.k.a(r5)
        L_0x0070:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x005a
        L_0x007f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x008a
            int r5 = r5 + 1
            goto L_0x0070
        L_0x008a:
            java.lang.IllegalArgumentException r9 = o(r3, r4, r9, r6)
            throw r9
        L_0x008f:
            return r11
        L_0x0090:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0095:
            if (r2 >= r10) goto L_0x00c5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            com.google.common.collect.g.a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.k.a(r6)
        L_0x00ab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto L_0x00b5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00b5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00c0
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00c0:
            java.lang.IllegalArgumentException r9 = o(r4, r5, r9, r7)
            throw r9
        L_0x00c5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.f0.n(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static IllegalArgumentException o(Object obj, Object obj2, Object[] objArr, int i10) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i10] + "=" + objArr[i10 ^ 1]);
    }

    static Object p(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj2)) {
                return objArr[i11 ^ 1];
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = k.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    byte b10 = bArr[i12] & 255;
                    if (b10 == 255) {
                        return null;
                    }
                    if (objArr[b10].equals(obj2)) {
                        return objArr[b10 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = k.a(obj2.hashCode());
                while (true) {
                    int i13 = a11 & length2;
                    short s10 = sArr[i13] & 65535;
                    if (s10 == 65535) {
                        return null;
                    }
                    if (objArr[s10].equals(obj2)) {
                        return objArr[s10 ^ 1];
                    }
                    a11 = i13 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = k.a(obj2.hashCode());
                while (true) {
                    int i14 = a12 & length3;
                    int i15 = iArr[i14];
                    if (i15 == -1) {
                        return null;
                    }
                    if (objArr[i15].equals(obj2)) {
                        return objArr[i15 ^ 1];
                    }
                    a12 = i14 + 1;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public s c() {
        return new a(this, this.f7558j, 0, this.f7559k);
    }

    /* access modifiers changed from: package-private */
    public s d() {
        return new b(this, new c(this.f7558j, 0, this.f7559k));
    }

    /* access modifiers changed from: package-private */
    public l e() {
        return new c(this.f7558j, 1, this.f7559k);
    }

    public Object get(Object obj) {
        return p(this.f7557i, this.f7558j, this.f7559k, 0, obj);
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        return false;
    }

    public int size() {
        return this.f7559k;
    }
}
