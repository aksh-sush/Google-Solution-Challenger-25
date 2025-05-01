package com.google.protobuf;

import com.google.android.gms.common.api.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    int f8615a;

    /* renamed from: b  reason: collision with root package name */
    int f8616b;

    /* renamed from: c  reason: collision with root package name */
    int f8617c;

    /* renamed from: d  reason: collision with root package name */
    l f8618d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8619e;

    private static final class b extends k {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f8620f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f8621g;

        /* renamed from: h  reason: collision with root package name */
        private int f8622h;

        /* renamed from: i  reason: collision with root package name */
        private int f8623i;

        /* renamed from: j  reason: collision with root package name */
        private int f8624j;

        /* renamed from: k  reason: collision with root package name */
        private int f8625k;

        /* renamed from: l  reason: collision with root package name */
        private int f8626l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f8627m;

        /* renamed from: n  reason: collision with root package name */
        private int f8628n;

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f8628n = a.e.API_PRIORITY_OTHER;
            this.f8620f = bArr;
            this.f8622h = i11 + i10;
            this.f8624j = i10;
            this.f8625k = i10;
            this.f8621g = z10;
        }

        private void Q() {
            int i10 = this.f8622h + this.f8623i;
            this.f8622h = i10;
            int i11 = i10 - this.f8625k;
            int i12 = this.f8628n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f8623i = i13;
                this.f8622h = i10 - i13;
                return;
            }
            this.f8623i = 0;
        }

        private void T() {
            if (this.f8622h - this.f8624j >= 10) {
                U();
            } else {
                V();
            }
        }

        private void U() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f8620f;
                int i11 = this.f8624j;
                this.f8624j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        private void V() {
            int i10 = 0;
            while (i10 < 10) {
                if (J() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        public int A() {
            return k.b(N());
        }

        public long B() {
            return k.c(O());
        }

        public String C() {
            int N = N();
            if (N > 0) {
                int i10 = this.f8622h;
                int i11 = this.f8624j;
                if (N <= i10 - i11) {
                    String str = new String(this.f8620f, i11, N, c0.f8540a);
                    this.f8624j += N;
                    return str;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N < 0) {
                throw d0.f();
            }
            throw d0.k();
        }

        public String D() {
            int N = N();
            if (N > 0) {
                int i10 = this.f8622h;
                int i11 = this.f8624j;
                if (N <= i10 - i11) {
                    String h10 = y1.h(this.f8620f, i11, N);
                    this.f8624j += N;
                    return h10;
                }
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw d0.f();
            }
            throw d0.k();
        }

        public int E() {
            if (e()) {
                this.f8626l = 0;
                return 0;
            }
            int N = N();
            this.f8626l = N;
            if (z1.a(N) != 0) {
                return this.f8626l;
            }
            throw d0.b();
        }

        public int F() {
            return N();
        }

        public long G() {
            return O();
        }

        public boolean I(int i10) {
            int b10 = z1.b(i10);
            if (b10 == 0) {
                T();
                return true;
            } else if (b10 == 1) {
                S(8);
                return true;
            } else if (b10 == 2) {
                S(N());
                return true;
            } else if (b10 == 3) {
                R();
                a(z1.c(z1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    S(4);
                    return true;
                }
                throw d0.d();
            }
        }

        public byte J() {
            int i10 = this.f8624j;
            if (i10 != this.f8622h) {
                byte[] bArr = this.f8620f;
                this.f8624j = i10 + 1;
                return bArr[i10];
            }
            throw d0.k();
        }

        public byte[] K(int i10) {
            if (i10 > 0) {
                int i11 = this.f8622h;
                int i12 = this.f8624j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f8624j = i13;
                    return Arrays.copyOfRange(this.f8620f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw d0.k();
            } else if (i10 == 0) {
                return c0.f8542c;
            } else {
                throw d0.f();
            }
        }

        public int L() {
            int i10 = this.f8624j;
            if (this.f8622h - i10 >= 4) {
                byte[] bArr = this.f8620f;
                this.f8624j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw d0.k();
        }

        public long M() {
            int i10 = this.f8624j;
            if (this.f8622h - i10 >= 8) {
                byte[] bArr = this.f8620f;
                this.f8624j = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw d0.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int N() {
            /*
                r5 = this;
                int r0 = r5.f8624j
                int r1 = r5.f8622h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f8620f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f8624j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.P()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f8624j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.b.N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long O() {
            /*
                r11 = this;
                int r0 = r11.f8624j
                int r1 = r11.f8622h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f8620f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f8624j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f8624j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.b.O():long");
        }

        /* access modifiers changed from: package-private */
        public long P() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte J = J();
                j10 |= ((long) (J & Byte.MAX_VALUE)) << i10;
                if ((J & 128) == 0) {
                    return j10;
                }
            }
            throw d0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.E()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.b.R():void");
        }

        public void S(int i10) {
            if (i10 >= 0) {
                int i11 = this.f8622h;
                int i12 = this.f8624j;
                if (i10 <= i11 - i12) {
                    this.f8624j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw d0.f();
            }
            throw d0.k();
        }

        public void a(int i10) {
            if (this.f8626l != i10) {
                throw d0.a();
            }
        }

        public int d() {
            return this.f8624j - this.f8625k;
        }

        public boolean e() {
            return this.f8624j == this.f8622h;
        }

        public void m(int i10) {
            this.f8628n = i10;
            Q();
        }

        public int n(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f8628n;
                if (d10 <= i11) {
                    this.f8628n = d10;
                    Q();
                    return i11;
                }
                throw d0.k();
            }
            throw d0.f();
        }

        public boolean o() {
            return O() != 0;
        }

        public j p() {
            int N = N();
            if (N > 0) {
                int i10 = this.f8622h;
                int i11 = this.f8624j;
                if (N <= i10 - i11) {
                    j p10 = (!this.f8621g || !this.f8627m) ? j.p(this.f8620f, i11, N) : j.P(this.f8620f, i11, N);
                    this.f8624j += N;
                    return p10;
                }
            }
            return N == 0 ? j.f8600f : j.O(K(N));
        }

        public double q() {
            return Double.longBitsToDouble(M());
        }

        public int r() {
            return N();
        }

        public int s() {
            return L();
        }

        public long t() {
            return M();
        }

        public float u() {
            return Float.intBitsToFloat(L());
        }

        public int v() {
            return N();
        }

        public long w() {
            return O();
        }

        public int y() {
            return L();
        }

        public long z() {
            return M();
        }
    }

    private static final class c extends k {

        /* renamed from: f  reason: collision with root package name */
        private final InputStream f8629f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f8630g;

        /* renamed from: h  reason: collision with root package name */
        private int f8631h;

        /* renamed from: i  reason: collision with root package name */
        private int f8632i;

        /* renamed from: j  reason: collision with root package name */
        private int f8633j;

        /* renamed from: k  reason: collision with root package name */
        private int f8634k;

        /* renamed from: l  reason: collision with root package name */
        private int f8635l;

        /* renamed from: m  reason: collision with root package name */
        private int f8636m;

        private c(InputStream inputStream, int i10) {
            super();
            this.f8636m = a.e.API_PRIORITY_OTHER;
            c0.b(inputStream, "input");
            this.f8629f = inputStream;
            this.f8630g = new byte[i10];
            this.f8631h = 0;
            this.f8633j = 0;
            this.f8635l = 0;
        }

        private j J(int i10) {
            byte[] M = M(i10);
            if (M != null) {
                return j.o(M);
            }
            int i11 = this.f8633j;
            int i12 = this.f8631h;
            int i13 = i12 - i11;
            this.f8635l += i12;
            this.f8633j = 0;
            this.f8631h = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8630g, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return j.O(bArr);
        }

        private byte[] L(int i10, boolean z10) {
            byte[] M = M(i10);
            if (M != null) {
                return z10 ? (byte[]) M.clone() : M;
            }
            int i11 = this.f8633j;
            int i12 = this.f8631h;
            int i13 = i12 - i11;
            this.f8635l += i12;
            this.f8633j = 0;
            this.f8631h = 0;
            List<byte[]> N = N(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f8630g, i11, bArr, 0, i13);
            for (byte[] bArr2 : N) {
                System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                i13 += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) {
            if (i10 == 0) {
                return c0.f8542c;
            }
            if (i10 >= 0) {
                int i11 = this.f8635l;
                int i12 = this.f8633j;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f8617c <= 0) {
                    int i14 = this.f8636m;
                    if (i13 <= i14) {
                        int i15 = this.f8631h - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > this.f8629f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f8630g, this.f8633j, bArr, 0, i15);
                        this.f8635l += this.f8631h;
                        this.f8633j = 0;
                        this.f8631h = 0;
                        while (i15 < i10) {
                            int read = this.f8629f.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f8635l += read;
                                i15 += read;
                            } else {
                                throw d0.k();
                            }
                        }
                        return bArr;
                    }
                    W((i14 - i11) - i12);
                    throw d0.k();
                }
                throw d0.j();
            }
            throw d0.f();
        }

        private List N(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f8629f.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f8635l += read;
                        i11 += read;
                    } else {
                        throw d0.k();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f8631h + this.f8632i;
            this.f8631h = i10;
            int i11 = this.f8635l + i10;
            int i12 = this.f8636m;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f8632i = i13;
                this.f8631h = i10 - i13;
                return;
            }
            this.f8632i = 0;
        }

        private void U(int i10) {
            if (b0(i10)) {
                return;
            }
            if (i10 > (this.f8617c - this.f8635l) - this.f8633j) {
                throw d0.j();
            }
            throw d0.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
            throw new java.lang.IllegalStateException(r8.f8629f.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void X(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x008f
                int r0 = r8.f8635l
                int r1 = r8.f8633j
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f8636m
                if (r2 > r3) goto L_0x0085
                int r0 = r0 + r1
                r8.f8635l = r0
                int r0 = r8.f8631h
                int r0 = r0 - r1
                r1 = 0
                r8.f8631h = r1
                r8.f8633j = r1
            L_0x0018:
                if (r0 >= r9) goto L_0x0062
                int r1 = r9 - r0
                java.io.InputStream r2 = r8.f8629f     // Catch:{ all -> 0x0058 }
                long r3 = (long) r1     // Catch:{ all -> 0x0058 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0058 }
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0033
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x0033
                if (r7 != 0) goto L_0x0030
                goto L_0x0062
            L_0x0030:
                int r2 = (int) r1     // Catch:{ all -> 0x0058 }
                int r0 = r0 + r2
                goto L_0x0018
            L_0x0033:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0058 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0058 }
                r3.<init>()     // Catch:{ all -> 0x0058 }
                java.io.InputStream r4 = r8.f8629f     // Catch:{ all -> 0x0058 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0058 }
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0058 }
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0058 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0058 }
                r9.<init>(r1)     // Catch:{ all -> 0x0058 }
                throw r9     // Catch:{ all -> 0x0058 }
            L_0x0058:
                r9 = move-exception
                int r1 = r8.f8635l
                int r1 = r1 + r0
                r8.f8635l = r1
                r8.T()
                throw r9
            L_0x0062:
                int r1 = r8.f8635l
                int r1 = r1 + r0
                r8.f8635l = r1
                r8.T()
                if (r0 >= r9) goto L_0x0084
                int r0 = r8.f8631h
                int r1 = r8.f8633j
                int r1 = r0 - r1
                r8.f8633j = r0
                r0 = 1
            L_0x0075:
                r8.U(r0)
                int r2 = r9 - r1
                int r3 = r8.f8631h
                if (r2 <= r3) goto L_0x0082
                int r1 = r1 + r3
                r8.f8633j = r3
                goto L_0x0075
            L_0x0082:
                r8.f8633j = r2
            L_0x0084:
                return
            L_0x0085:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.W(r3)
                com.google.protobuf.d0 r9 = com.google.protobuf.d0.k()
                throw r9
            L_0x008f:
                com.google.protobuf.d0 r9 = com.google.protobuf.d0.f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.c.X(int):void");
        }

        private void Y() {
            if (this.f8631h - this.f8633j >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f8630g;
                int i11 = this.f8633j;
                this.f8633j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        private void a0() {
            int i10 = 0;
            while (i10 < 10) {
                if (K() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        private boolean b0(int i10) {
            int i11 = this.f8633j;
            int i12 = i11 + i10;
            int i13 = this.f8631h;
            if (i12 > i13) {
                int i14 = this.f8617c;
                int i15 = this.f8635l;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f8636m) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.f8630g;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.f8635l += i11;
                    this.f8631h -= i11;
                    this.f8633j = 0;
                }
                InputStream inputStream = this.f8629f;
                byte[] bArr2 = this.f8630g;
                int i16 = this.f8631h;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f8617c - this.f8635l) - i16));
                if (read == 0 || read < -1 || read > this.f8630g.length) {
                    throw new IllegalStateException(this.f8629f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f8631h += read;
                    T();
                    if (this.f8631h >= i10) {
                        return true;
                    }
                    return b0(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public int A() {
            return k.b(Q());
        }

        public long B() {
            return k.c(R());
        }

        public String C() {
            int Q = Q();
            if (Q > 0) {
                int i10 = this.f8631h;
                int i11 = this.f8633j;
                if (Q <= i10 - i11) {
                    String str = new String(this.f8630g, i11, Q, c0.f8540a);
                    this.f8633j += Q;
                    return str;
                }
            }
            if (Q == 0) {
                return "";
            }
            if (Q > this.f8631h) {
                return new String(L(Q, false), c0.f8540a);
            }
            U(Q);
            String str2 = new String(this.f8630g, this.f8633j, Q, c0.f8540a);
            this.f8633j += Q;
            return str2;
        }

        public String D() {
            byte[] bArr;
            int i10;
            int Q = Q();
            int i11 = this.f8633j;
            int i12 = this.f8631h;
            if (Q <= i12 - i11 && Q > 0) {
                bArr = this.f8630g;
                i10 = i11 + Q;
            } else if (Q == 0) {
                return "";
            } else {
                i11 = 0;
                if (Q <= i12) {
                    U(Q);
                    bArr = this.f8630g;
                    i10 = Q + 0;
                } else {
                    bArr = L(Q, false);
                    return y1.h(bArr, i11, Q);
                }
            }
            this.f8633j = i10;
            return y1.h(bArr, i11, Q);
        }

        public int E() {
            if (e()) {
                this.f8634k = 0;
                return 0;
            }
            int Q = Q();
            this.f8634k = Q;
            if (z1.a(Q) != 0) {
                return this.f8634k;
            }
            throw d0.b();
        }

        public int F() {
            return Q();
        }

        public long G() {
            return R();
        }

        public boolean I(int i10) {
            int b10 = z1.b(i10);
            if (b10 == 0) {
                Y();
                return true;
            } else if (b10 == 1) {
                W(8);
                return true;
            } else if (b10 == 2) {
                W(Q());
                return true;
            } else if (b10 == 3) {
                V();
                a(z1.c(z1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    W(4);
                    return true;
                }
                throw d0.d();
            }
        }

        public byte K() {
            if (this.f8633j == this.f8631h) {
                U(1);
            }
            byte[] bArr = this.f8630g;
            int i10 = this.f8633j;
            this.f8633j = i10 + 1;
            return bArr[i10];
        }

        public int O() {
            int i10 = this.f8633j;
            if (this.f8631h - i10 < 4) {
                U(4);
                i10 = this.f8633j;
            }
            byte[] bArr = this.f8630g;
            this.f8633j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() {
            int i10 = this.f8633j;
            if (this.f8631h - i10 < 8) {
                U(8);
                i10 = this.f8633j;
            }
            byte[] bArr = this.f8630g;
            this.f8633j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int Q() {
            /*
                r5 = this;
                int r0 = r5.f8633j
                int r1 = r5.f8631h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f8630g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f8633j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.S()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f8633j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.c.Q():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long R() {
            /*
                r11 = this;
                int r0 = r11.f8633j
                int r1 = r11.f8631h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f8630g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f8633j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.S()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f8633j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.c.R():long");
        }

        /* access modifiers changed from: package-private */
        public long S() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte K = K();
                j10 |= ((long) (K & Byte.MAX_VALUE)) << i10;
                if ((K & 128) == 0) {
                    return j10;
                }
            }
            throw d0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void V() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.E()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.c.V():void");
        }

        public void W(int i10) {
            int i11 = this.f8631h;
            int i12 = this.f8633j;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f8633j = i12 + i10;
            }
        }

        public void a(int i10) {
            if (this.f8634k != i10) {
                throw d0.a();
            }
        }

        public int d() {
            return this.f8635l + this.f8633j;
        }

        public boolean e() {
            return this.f8633j == this.f8631h && !b0(1);
        }

        public void m(int i10) {
            this.f8636m = i10;
            T();
        }

        public int n(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f8635l + this.f8633j;
                int i12 = this.f8636m;
                if (i11 <= i12) {
                    this.f8636m = i11;
                    T();
                    return i12;
                }
                throw d0.k();
            }
            throw d0.f();
        }

        public boolean o() {
            return R() != 0;
        }

        public j p() {
            int Q = Q();
            int i10 = this.f8631h;
            int i11 = this.f8633j;
            if (Q > i10 - i11 || Q <= 0) {
                return Q == 0 ? j.f8600f : J(Q);
            }
            j p10 = j.p(this.f8630g, i11, Q);
            this.f8633j += Q;
            return p10;
        }

        public double q() {
            return Double.longBitsToDouble(P());
        }

        public int r() {
            return Q();
        }

        public int s() {
            return O();
        }

        public long t() {
            return P();
        }

        public float u() {
            return Float.intBitsToFloat(O());
        }

        public int v() {
            return Q();
        }

        public long w() {
            return R();
        }

        public int y() {
            return O();
        }

        public long z() {
            return P();
        }
    }

    private static final class d extends k {

        /* renamed from: f  reason: collision with root package name */
        private final ByteBuffer f8637f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f8638g;

        /* renamed from: h  reason: collision with root package name */
        private final long f8639h;

        /* renamed from: i  reason: collision with root package name */
        private long f8640i;

        /* renamed from: j  reason: collision with root package name */
        private long f8641j;

        /* renamed from: k  reason: collision with root package name */
        private long f8642k;

        /* renamed from: l  reason: collision with root package name */
        private int f8643l;

        /* renamed from: m  reason: collision with root package name */
        private int f8644m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f8645n;

        /* renamed from: o  reason: collision with root package name */
        private int f8646o;

        private d(ByteBuffer byteBuffer, boolean z10) {
            super();
            this.f8646o = a.e.API_PRIORITY_OTHER;
            this.f8637f = byteBuffer;
            long i10 = x1.i(byteBuffer);
            this.f8639h = i10;
            this.f8640i = ((long) byteBuffer.limit()) + i10;
            long position = i10 + ((long) byteBuffer.position());
            this.f8641j = position;
            this.f8642k = position;
            this.f8638g = z10;
        }

        private int J(long j10) {
            return (int) (j10 - this.f8639h);
        }

        static boolean K() {
            return x1.H();
        }

        private void R() {
            long j10 = this.f8640i + ((long) this.f8643l);
            this.f8640i = j10;
            int i10 = (int) (j10 - this.f8642k);
            int i11 = this.f8646o;
            if (i10 > i11) {
                int i12 = i10 - i11;
                this.f8643l = i12;
                this.f8640i = j10 - ((long) i12);
                return;
            }
            this.f8643l = 0;
        }

        private int S() {
            return (int) (this.f8640i - this.f8641j);
        }

        private void V() {
            if (S() >= 10) {
                W();
            } else {
                X();
            }
        }

        private void W() {
            int i10 = 0;
            while (i10 < 10) {
                long j10 = this.f8641j;
                this.f8641j = 1 + j10;
                if (x1.u(j10) < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        private void X() {
            int i10 = 0;
            while (i10 < 10) {
                if (L() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw com.google.protobuf.d0.k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f8637f.position(r0);
            r3.f8637f.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer Y(long r4, long r6) {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f8637f
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f8637f
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f8637f     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.J(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f8637f     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.J(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f8637f     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f8637f
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f8637f
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                com.google.protobuf.d0 r4 = com.google.protobuf.d0.k()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f8637f
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f8637f
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.d.Y(long, long):java.nio.ByteBuffer");
        }

        public int A() {
            return k.b(O());
        }

        public long B() {
            return k.c(P());
        }

        public String C() {
            int O = O();
            if (O > 0 && O <= S()) {
                byte[] bArr = new byte[O];
                long j10 = (long) O;
                x1.n(this.f8641j, bArr, 0, j10);
                String str = new String(bArr, c0.f8540a);
                this.f8641j += j10;
                return str;
            } else if (O == 0) {
                return "";
            } else {
                if (O < 0) {
                    throw d0.f();
                }
                throw d0.k();
            }
        }

        public String D() {
            int O = O();
            if (O > 0 && O <= S()) {
                String g10 = y1.g(this.f8637f, J(this.f8641j), O);
                this.f8641j += (long) O;
                return g10;
            } else if (O == 0) {
                return "";
            } else {
                if (O <= 0) {
                    throw d0.f();
                }
                throw d0.k();
            }
        }

        public int E() {
            if (e()) {
                this.f8644m = 0;
                return 0;
            }
            int O = O();
            this.f8644m = O;
            if (z1.a(O) != 0) {
                return this.f8644m;
            }
            throw d0.b();
        }

        public int F() {
            return O();
        }

        public long G() {
            return P();
        }

        public boolean I(int i10) {
            int b10 = z1.b(i10);
            if (b10 == 0) {
                V();
                return true;
            } else if (b10 == 1) {
                U(8);
                return true;
            } else if (b10 == 2) {
                U(O());
                return true;
            } else if (b10 == 3) {
                T();
                a(z1.c(z1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    U(4);
                    return true;
                }
                throw d0.d();
            }
        }

        public byte L() {
            long j10 = this.f8641j;
            if (j10 != this.f8640i) {
                this.f8641j = 1 + j10;
                return x1.u(j10);
            }
            throw d0.k();
        }

        public int M() {
            long j10 = this.f8641j;
            if (this.f8640i - j10 >= 4) {
                this.f8641j = 4 + j10;
                return ((x1.u(j10 + 3) & 255) << 24) | (x1.u(j10) & 255) | ((x1.u(1 + j10) & 255) << 8) | ((x1.u(2 + j10) & 255) << 16);
            }
            throw d0.k();
        }

        public long N() {
            long j10 = this.f8641j;
            if (this.f8640i - j10 >= 8) {
                this.f8641j = 8 + j10;
                return ((((long) x1.u(j10 + 7)) & 255) << 56) | (((long) x1.u(j10)) & 255) | ((((long) x1.u(1 + j10)) & 255) << 8) | ((((long) x1.u(2 + j10)) & 255) << 16) | ((((long) x1.u(3 + j10)) & 255) << 24) | ((((long) x1.u(4 + j10)) & 255) << 32) | ((((long) x1.u(5 + j10)) & 255) << 40) | ((((long) x1.u(6 + j10)) & 255) << 48);
            }
            throw d0.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (com.google.protobuf.x1.u(r4) < 0) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int O() {
            /*
                r10 = this;
                long r0 = r10.f8641j
                long r2 = r10.f8640i
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.x1.u(r0)
                if (r0 < 0) goto L_0x0017
                r10.f8641j = r4
                return r0
            L_0x0017:
                long r6 = r10.f8640i
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.x1.u(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.x1.u(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.x1.u(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.x1.u(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.x1.u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.x1.u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.x1.u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.x1.u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.x1.u(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.Q()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f8641j = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.d.O():int");
        }

        public long P() {
            long j10;
            long j11;
            long j12;
            byte b10;
            long j13 = this.f8641j;
            if (this.f8640i != j13) {
                long j14 = j13 + 1;
                byte u10 = x1.u(j13);
                if (u10 >= 0) {
                    this.f8641j = j14;
                    return (long) u10;
                } else if (this.f8640i - j14 >= 9) {
                    long j15 = j14 + 1;
                    byte u11 = u10 ^ (x1.u(j14) << 7);
                    if (u11 < 0) {
                        b10 = u11 ^ Byte.MIN_VALUE;
                    } else {
                        long j16 = j15 + 1;
                        byte u12 = u11 ^ (x1.u(j15) << 14);
                        if (u12 >= 0) {
                            j10 = (long) (u12 ^ 16256);
                        } else {
                            j15 = j16 + 1;
                            byte u13 = u12 ^ (x1.u(j16) << 21);
                            if (u13 < 0) {
                                b10 = u13 ^ -2080896;
                            } else {
                                j16 = j15 + 1;
                                long u14 = ((long) u13) ^ (((long) x1.u(j15)) << 28);
                                if (u14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    long j17 = j16 + 1;
                                    long u15 = u14 ^ (((long) x1.u(j16)) << 35);
                                    if (u15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        j16 = j17 + 1;
                                        u14 = u15 ^ (((long) x1.u(j17)) << 42);
                                        if (u14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            j17 = j16 + 1;
                                            u15 = u14 ^ (((long) x1.u(j16)) << 49);
                                            if (u15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                j16 = j17 + 1;
                                                j10 = (u15 ^ (((long) x1.u(j17)) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    long j18 = 1 + j16;
                                                    if (((long) x1.u(j16)) >= 0) {
                                                        j15 = j18;
                                                        this.f8641j = j15;
                                                        return j10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j10 = u15 ^ j11;
                                    j15 = j17;
                                    this.f8641j = j15;
                                    return j10;
                                }
                                j10 = u14 ^ j12;
                            }
                        }
                        j15 = j16;
                        this.f8641j = j15;
                        return j10;
                    }
                    j10 = (long) b10;
                    this.f8641j = j15;
                    return j10;
                }
            }
            return Q();
        }

        /* access modifiers changed from: package-private */
        public long Q() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte L = L();
                j10 |= ((long) (L & Byte.MAX_VALUE)) << i10;
                if ((L & 128) == 0) {
                    return j10;
                }
            }
            throw d0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void T() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.E()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.I(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.d.T():void");
        }

        public void U(int i10) {
            if (i10 >= 0 && i10 <= S()) {
                this.f8641j += (long) i10;
            } else if (i10 < 0) {
                throw d0.f();
            } else {
                throw d0.k();
            }
        }

        public void a(int i10) {
            if (this.f8644m != i10) {
                throw d0.a();
            }
        }

        public int d() {
            return (int) (this.f8641j - this.f8642k);
        }

        public boolean e() {
            return this.f8641j == this.f8640i;
        }

        public void m(int i10) {
            this.f8646o = i10;
            R();
        }

        public int n(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f8646o;
                if (d10 <= i11) {
                    this.f8646o = d10;
                    R();
                    return i11;
                }
                throw d0.k();
            }
            throw d0.f();
        }

        public boolean o() {
            return P() != 0;
        }

        public j p() {
            int O = O();
            if (O <= 0 || O > S()) {
                if (O == 0) {
                    return j.f8600f;
                }
                if (O < 0) {
                    throw d0.f();
                }
                throw d0.k();
            } else if (!this.f8638g || !this.f8645n) {
                byte[] bArr = new byte[O];
                long j10 = (long) O;
                x1.n(this.f8641j, bArr, 0, j10);
                this.f8641j += j10;
                return j.O(bArr);
            } else {
                long j11 = this.f8641j;
                long j12 = (long) O;
                ByteBuffer Y = Y(j11, j11 + j12);
                this.f8641j += j12;
                return j.N(Y);
            }
        }

        public double q() {
            return Double.longBitsToDouble(N());
        }

        public int r() {
            return O();
        }

        public int s() {
            return M();
        }

        public long t() {
            return N();
        }

        public float u() {
            return Float.intBitsToFloat(M());
        }

        public int v() {
            return O();
        }

        public long w() {
            return P();
        }

        public int y() {
            return M();
        }

        public long z() {
            return N();
        }
    }

    private k() {
        this.f8616b = 100;
        this.f8617c = a.e.API_PRIORITY_OTHER;
        this.f8619e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static k f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static k g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? j(c0.f8542c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static k h(ByteBuffer byteBuffer) {
        return i(byteBuffer, false);
    }

    static k i(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z10);
        }
        if (byteBuffer.isDirect() && d.K()) {
            return new d(byteBuffer, z10);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, remaining, true);
    }

    public static k j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static k k(byte[] bArr, int i10, int i11) {
        return l(bArr, i10, i11, false);
    }

    static k l(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.n(i11);
            return bVar;
        } catch (d0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int x(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & 127) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw d0.k();
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw d0.k();
            } else if ((read2 & 128) == 0) {
                return i11;
            } else {
                i12 += 7;
            }
        }
        throw d0.e();
    }

    public abstract int A();

    public abstract long B();

    public abstract String C();

    public abstract String D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public final int H(int i10) {
        if (i10 >= 0) {
            int i11 = this.f8617c;
            this.f8617c = i10;
            return i11;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i10);
    }

    public abstract boolean I(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void m(int i10);

    public abstract int n(int i10);

    public abstract boolean o();

    public abstract j p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int y();

    public abstract long z();
}
