package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.z1;
import java.nio.ByteBuffer;
import java.util.List;

abstract class g implements j1 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f8576a;

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
                f8576a = r0
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f8576a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.z1$b r1 = com.google.protobuf.z1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.a.<clinit>():void");
        }
    }

    private static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f8577a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f8578b;

        /* renamed from: c  reason: collision with root package name */
        private int f8579c;

        /* renamed from: d  reason: collision with root package name */
        private final int f8580d;

        /* renamed from: e  reason: collision with root package name */
        private int f8581e;

        /* renamed from: f  reason: collision with root package name */
        private int f8582f;

        /* renamed from: g  reason: collision with root package name */
        private int f8583g;

        public b(ByteBuffer byteBuffer, boolean z10) {
            super((a) null);
            this.f8577a = z10;
            this.f8578b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f8579c = arrayOffset;
            this.f8580d = arrayOffset;
            this.f8581e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean R() {
            return this.f8579c == this.f8581e;
        }

        private byte S() {
            int i10 = this.f8579c;
            if (i10 != this.f8581e) {
                byte[] bArr = this.f8578b;
                this.f8579c = i10 + 1;
                return bArr[i10];
            }
            throw d0.k();
        }

        private Object T(z1.b bVar, Class cls, r rVar) {
            switch (a.f8576a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(r());
                case 2:
                    return B();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(b());
                case 5:
                    return Integer.valueOf(p());
                case 6:
                    return Long.valueOf(f());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(E());
                case 9:
                    return Long.valueOf(L());
                case 10:
                    return m(cls, rVar);
                case 11:
                    return Integer.valueOf(G());
                case 12:
                    return Long.valueOf(v());
                case 13:
                    return Integer.valueOf(h());
                case 14:
                    return Long.valueOf(k());
                case 15:
                    return M();
                case 16:
                    return Integer.valueOf(D());
                case 17:
                    return Long.valueOf(d());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private Object U(l1 l1Var, r rVar) {
            int i10 = this.f8583g;
            this.f8583g = z1.c(z1.a(this.f8582f), 4);
            try {
                Object i11 = l1Var.i();
                l1Var.e(i11, this, rVar);
                l1Var.c(i11);
                if (this.f8582f == this.f8583g) {
                    return i11;
                }
                throw d0.g();
            } finally {
                this.f8583g = i10;
            }
        }

        private int V() {
            f0(4);
            return W();
        }

        private int W() {
            int i10 = this.f8579c;
            byte[] bArr = this.f8578b;
            this.f8579c = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        private long X() {
            f0(8);
            return Y();
        }

        private long Y() {
            int i10 = this.f8579c;
            byte[] bArr = this.f8578b;
            this.f8579c = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        private Object Z(l1 l1Var, r rVar) {
            int c02 = c0();
            f0(c02);
            int i10 = this.f8581e;
            int i11 = this.f8579c + c02;
            this.f8581e = i11;
            try {
                Object i12 = l1Var.i();
                l1Var.e(i12, this, rVar);
                l1Var.c(i12);
                if (this.f8579c == i11) {
                    return i12;
                }
                throw d0.g();
            } finally {
                this.f8581e = i10;
            }
        }

        private int c0() {
            byte b10;
            int i10 = this.f8579c;
            int i11 = this.f8581e;
            if (i11 != i10) {
                byte[] bArr = this.f8578b;
                int i12 = i10 + 1;
                byte b11 = bArr[i10];
                if (b11 >= 0) {
                    this.f8579c = i12;
                    return b11;
                } else if (i11 - i12 < 9) {
                    return (int) e0();
                } else {
                    int i13 = i12 + 1;
                    byte b12 = b11 ^ (bArr[i12] << 7);
                    if (b12 < 0) {
                        b10 = b12 ^ Byte.MIN_VALUE;
                    } else {
                        int i14 = i13 + 1;
                        byte b13 = b12 ^ (bArr[i13] << 14);
                        if (b13 >= 0) {
                            b10 = b13 ^ 16256;
                        } else {
                            i13 = i14 + 1;
                            byte b14 = b13 ^ (bArr[i14] << 21);
                            if (b14 < 0) {
                                b10 = b14 ^ -2080896;
                            } else {
                                i14 = i13 + 1;
                                byte b15 = bArr[i13];
                                b10 = (b14 ^ (b15 << 28)) ^ 266354560;
                                if (b15 < 0) {
                                    i13 = i14 + 1;
                                    if (bArr[i14] < 0) {
                                        i14 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            i13 = i14 + 1;
                                            if (bArr[i14] < 0) {
                                                i14 = i13 + 1;
                                                if (bArr[i13] < 0) {
                                                    i13 = i14 + 1;
                                                    if (bArr[i14] < 0) {
                                                        throw d0.e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i13 = i14;
                    }
                    this.f8579c = i13;
                    return b10;
                }
            } else {
                throw d0.k();
            }
        }

        private long e0() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte S = S();
                j10 |= ((long) (S & Byte.MAX_VALUE)) << i10;
                if ((S & 128) == 0) {
                    return j10;
                }
            }
            throw d0.e();
        }

        private void f0(int i10) {
            if (i10 < 0 || i10 > this.f8581e - this.f8579c) {
                throw d0.k();
            }
        }

        private void g0(int i10) {
            if (this.f8579c != i10) {
                throw d0.k();
            }
        }

        private void h0(int i10) {
            if (z1.b(this.f8582f) != i10) {
                throw d0.d();
            }
        }

        private void i0(int i10) {
            f0(i10);
            this.f8579c += i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void j0() {
            /*
                r3 = this;
                int r0 = r3.f8583g
                int r1 = r3.f8582f
                int r1 = com.google.protobuf.z1.a(r1)
                r2 = 4
                int r1 = com.google.protobuf.z1.c(r1, r2)
                r3.f8583g = r1
            L_0x000f:
                int r1 = r3.t()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.F()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f8582f
                int r2 = r3.f8583g
                if (r1 != r2) goto L_0x0027
                r3.f8583g = r0
                return
            L_0x0027:
                com.google.protobuf.d0 r0 = com.google.protobuf.d0.g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.b.j0():void");
        }

        private void k0() {
            int i10 = this.f8581e;
            int i11 = this.f8579c;
            if (i10 - i11 >= 10) {
                byte[] bArr = this.f8578b;
                int i12 = 0;
                while (i12 < 10) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        this.f8579c = i13;
                        return;
                    } else {
                        i12++;
                        i11 = i13;
                    }
                }
            }
            l0();
        }

        private void l0() {
            int i10 = 0;
            while (i10 < 10) {
                if (S() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw d0.e();
        }

        private void m0(int i10) {
            f0(i10);
            if ((i10 & 3) != 0) {
                throw d0.g();
            }
        }

        private void n0(int i10) {
            f0(i10);
            if ((i10 & 7) != 0) {
                throw d0.g();
            }
        }

        public Object A(l1 l1Var, r rVar) {
            h0(3);
            return U(l1Var, rVar);
        }

        public j B() {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return j.f8600f;
            }
            f0(c02);
            j P = this.f8577a ? j.P(this.f8578b, this.f8579c, c02) : j.p(this.f8578b, this.f8579c, c02);
            this.f8579c += c02;
            return P;
        }

        public void C(List list) {
            int i10;
            int i11;
            if (list instanceof x) {
                x xVar = (x) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        xVar.f(Float.intBitsToFloat(W()));
                    }
                } else if (b10 == 5) {
                    do {
                        xVar.f(readFloat());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Float.valueOf(Float.intBitsToFloat(W())));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else {
                    throw d0.d();
                }
            }
        }

        public int D() {
            h0(0);
            return c0();
        }

        public int E() {
            h0(0);
            return c0();
        }

        public boolean F() {
            int i10;
            int i11;
            if (R() || (i10 = this.f8582f) == this.f8583g) {
                return false;
            }
            int b10 = z1.b(i10);
            if (b10 != 0) {
                if (b10 == 1) {
                    i11 = 8;
                } else if (b10 == 2) {
                    i11 = c0();
                } else if (b10 == 3) {
                    j0();
                    return true;
                } else if (b10 == 5) {
                    i11 = 4;
                } else {
                    throw d0.d();
                }
                i0(i11);
                return true;
            }
            k0();
            return true;
        }

        public int G() {
            h0(5);
            return V();
        }

        public void H(List list) {
            int i10;
            if (z1.b(this.f8582f) == 2) {
                do {
                    list.add(B());
                    if (!R()) {
                        i10 = this.f8579c;
                    } else {
                        return;
                    }
                } while (c0() == this.f8582f);
                this.f8579c = i10;
                return;
            }
            throw d0.d();
        }

        public void I(List list) {
            int i10;
            int i11;
            if (list instanceof o) {
                o oVar = (o) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 1) {
                    do {
                        oVar.f(readDouble());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        oVar.f(Double.longBitsToDouble(Y()));
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Double.valueOf(Double.longBitsToDouble(Y())));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public void J(List list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof k0) {
                k0 k0Var = (k0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        k0Var.h(L());
                        if (!R()) {
                            i12 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i12;
                    return;
                } else if (b10 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        k0Var.h(d0());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(L()));
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                    return;
                } else if (b11 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw d0.d();
                }
            }
            g0(i10);
        }

        public void K(List list) {
            int i10;
            int i11;
            if (list instanceof k0) {
                k0 k0Var = (k0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 1) {
                    do {
                        k0Var.h(v());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        k0Var.h(Y());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 1) {
                    do {
                        list.add(Long.valueOf(v()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public long L() {
            h0(0);
            return d0();
        }

        public String M() {
            return a0(true);
        }

        public void N(List list) {
            int i10;
            int i11;
            if (list instanceof k0) {
                k0 k0Var = (k0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 1) {
                    do {
                        k0Var.h(f());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = c0();
                    n0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        k0Var.h(Y());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 1) {
                    do {
                        list.add(Long.valueOf(f()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = c0();
                    n0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Long.valueOf(Y()));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public void O(List list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        b0Var.f(E());
                        if (!R()) {
                            i12 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i12;
                    return;
                } else if (b10 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        b0Var.f(c0());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(E()));
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                    return;
                } else if (b11 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw d0.d();
                }
            }
            g0(i10);
        }

        public void P(List list) {
            int i10;
            int i11;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        b0Var.f(b());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f8579c + c0();
                    while (this.f8579c < c02) {
                        b0Var.f(c0());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(b()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f8579c + c0();
                    while (this.f8579c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public void a(List list) {
            int i10;
            int i11;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        b0Var.f(h());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f8579c + c0();
                    while (this.f8579c < c02) {
                        b0Var.f(k.b(c0()));
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(h()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f8579c + c0();
                    while (this.f8579c < c03) {
                        list.add(Integer.valueOf(k.b(c0())));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public String a0(boolean z10) {
            h0(2);
            int c02 = c0();
            if (c02 == 0) {
                return "";
            }
            f0(c02);
            if (z10) {
                byte[] bArr = this.f8578b;
                int i10 = this.f8579c;
                if (!y1.t(bArr, i10, i10 + c02)) {
                    throw d0.c();
                }
            }
            String str = new String(this.f8578b, this.f8579c, c02, c0.f8540a);
            this.f8579c += c02;
            return str;
        }

        public int b() {
            h0(0);
            return c0();
        }

        public void b0(List list, boolean z10) {
            int i10;
            int i11;
            if (z1.b(this.f8582f) != 2) {
                throw d0.d();
            } else if (!(list instanceof i0) || z10) {
                do {
                    list.add(a0(z10));
                    if (!R()) {
                        i10 = this.f8579c;
                    } else {
                        return;
                    }
                } while (c0() == this.f8582f);
                this.f8579c = i10;
            } else {
                i0 i0Var = (i0) list;
                do {
                    i0Var.n(B());
                    if (!R()) {
                        i11 = this.f8579c;
                    } else {
                        return;
                    }
                } while (c0() == this.f8582f);
                this.f8579c = i11;
            }
        }

        public int c() {
            return this.f8582f;
        }

        public long d() {
            h0(0);
            return d0();
        }

        public long d0() {
            long j10;
            int i10;
            long j11;
            long j12;
            byte b10;
            int i11 = this.f8579c;
            int i12 = this.f8581e;
            if (i12 != i11) {
                byte[] bArr = this.f8578b;
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f8579c = i13;
                    return (long) b11;
                } else if (i12 - i13 < 9) {
                    return e0();
                } else {
                    int i14 = i13 + 1;
                    byte b12 = b11 ^ (bArr[i13] << 7);
                    if (b12 < 0) {
                        b10 = b12 ^ Byte.MIN_VALUE;
                    } else {
                        int i15 = i14 + 1;
                        byte b13 = b12 ^ (bArr[i14] << 14);
                        if (b13 >= 0) {
                            i10 = i15;
                            j10 = (long) (b13 ^ 16256);
                        } else {
                            i14 = i15 + 1;
                            byte b14 = b13 ^ (bArr[i15] << 21);
                            if (b14 < 0) {
                                b10 = b14 ^ -2080896;
                            } else {
                                long j13 = (long) b14;
                                int i16 = i14 + 1;
                                long j14 = j13 ^ (((long) bArr[i14]) << 28);
                                if (j14 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i17 = i16 + 1;
                                    long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                    if (j15 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i16 = i17 + 1;
                                        j14 = j15 ^ (((long) bArr[i17]) << 42);
                                        if (j14 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i17 = i16 + 1;
                                            j15 = j14 ^ (((long) bArr[i16]) << 49);
                                            if (j15 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                int i18 = i17 + 1;
                                                long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                                if (j16 < 0) {
                                                    i10 = i18 + 1;
                                                    if (((long) bArr[i18]) < 0) {
                                                        throw d0.e();
                                                    }
                                                } else {
                                                    i10 = i18;
                                                }
                                                j10 = j16;
                                            }
                                        }
                                    }
                                    j10 = j15 ^ j11;
                                }
                                j10 = j14 ^ j12;
                                i10 = i16;
                            }
                        }
                        this.f8579c = i10;
                        return j10;
                    }
                    j10 = (long) b10;
                    this.f8579c = i10;
                    return j10;
                }
            } else {
                throw d0.k();
            }
        }

        public void e(List list) {
            int i10;
            int i11;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        b0Var.f(W());
                    }
                } else if (b10 == 5) {
                    do {
                        b0Var.f(p());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Integer.valueOf(p()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else {
                    throw d0.d();
                }
            }
        }

        public long f() {
            h0(1);
            return X();
        }

        public void g(List list) {
            int i10;
            int i11;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 2) {
                    int c02 = c0();
                    m0(c02);
                    int i12 = this.f8579c + c02;
                    while (this.f8579c < i12) {
                        b0Var.f(W());
                    }
                } else if (b10 == 5) {
                    do {
                        b0Var.f(G());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 2) {
                    int c03 = c0();
                    m0(c03);
                    int i13 = this.f8579c + c03;
                    while (this.f8579c < i13) {
                        list.add(Integer.valueOf(W()));
                    }
                } else if (b11 == 5) {
                    do {
                        list.add(Integer.valueOf(G()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else {
                    throw d0.d();
                }
            }
        }

        public int h() {
            h0(0);
            return k.b(c0());
        }

        public void i(List list) {
            int i10;
            int i11;
            if (list instanceof k0) {
                k0 k0Var = (k0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        k0Var.h(k());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f8579c + c0();
                    while (this.f8579c < c02) {
                        k0Var.h(k.c(d0()));
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(k()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f8579c + c0();
                    while (this.f8579c < c03) {
                        list.add(Long.valueOf(k.c(d0())));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public void j(List list, l1 l1Var, r rVar) {
            int i10;
            if (z1.b(this.f8582f) == 3) {
                int i11 = this.f8582f;
                do {
                    list.add(U(l1Var, rVar));
                    if (!R()) {
                        i10 = this.f8579c;
                    } else {
                        return;
                    }
                } while (c0() == i11);
                this.f8579c = i10;
                return;
            }
            throw d0.d();
        }

        public long k() {
            h0(0);
            return k.c(d0());
        }

        public void l(List list) {
            int i10;
            int i11;
            if (list instanceof b0) {
                b0 b0Var = (b0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        b0Var.f(D());
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                } else if (b10 == 2) {
                    int c02 = this.f8579c + c0();
                    while (this.f8579c < c02) {
                        b0Var.f(c0());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Integer.valueOf(D()));
                        if (!R()) {
                            i10 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i10;
                } else if (b11 == 2) {
                    int c03 = this.f8579c + c0();
                    while (this.f8579c < c03) {
                        list.add(Integer.valueOf(c0()));
                    }
                } else {
                    throw d0.d();
                }
            }
        }

        public Object m(Class cls, r rVar) {
            h0(2);
            return Z(g1.a().d(cls), rVar);
        }

        public void n(List list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof h) {
                h hVar = (h) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        hVar.h(r());
                        if (!R()) {
                            i12 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i12;
                    return;
                } else if (b10 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        hVar.h(c0() != 0);
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Boolean.valueOf(r()));
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                    return;
                } else if (b11 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        list.add(Boolean.valueOf(c0() != 0));
                    }
                } else {
                    throw d0.d();
                }
            }
            g0(i10);
        }

        public String o() {
            return a0(false);
        }

        public int p() {
            h0(5);
            return V();
        }

        public Object q(Class cls, r rVar) {
            h0(3);
            return U(g1.a().d(cls), rVar);
        }

        public boolean r() {
            h0(0);
            return c0() != 0;
        }

        public double readDouble() {
            h0(1);
            return Double.longBitsToDouble(X());
        }

        public float readFloat() {
            h0(5);
            return Float.intBitsToFloat(V());
        }

        public void s(List list, l1 l1Var, r rVar) {
            int i10;
            if (z1.b(this.f8582f) == 2) {
                int i11 = this.f8582f;
                do {
                    list.add(Z(l1Var, rVar));
                    if (!R()) {
                        i10 = this.f8579c;
                    } else {
                        return;
                    }
                } while (c0() == i11);
                this.f8579c = i10;
                return;
            }
            throw d0.d();
        }

        public int t() {
            if (R()) {
                return a.e.API_PRIORITY_OTHER;
            }
            int c02 = c0();
            this.f8582f = c02;
            return c02 == this.f8583g ? a.e.API_PRIORITY_OTHER : z1.a(c02);
        }

        public void u(List list) {
            b0(list, false);
        }

        public long v() {
            h0(1);
            return X();
        }

        public Object w(l1 l1Var, r rVar) {
            h0(2);
            return Z(l1Var, rVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (F() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.d0("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void x(java.util.Map r8, com.google.protobuf.m0.a r9, com.google.protobuf.r r10) {
            /*
                r7 = this;
                r0 = 2
                r7.h0(r0)
                int r1 = r7.c0()
                r7.f0(r1)
                int r2 = r7.f8581e
                int r3 = r7.f8579c
                int r3 = r3 + r1
                r7.f8581e = r3
                java.lang.Object r1 = r9.f8694b     // Catch:{ all -> 0x005b }
                java.lang.Object r3 = r9.f8696d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.t()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f8581e = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.F()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.d0 r4 = new com.google.protobuf.d0     // Catch:{ a -> 0x004e }
                r4.<init>(r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                com.google.protobuf.z1$b r4 = r9.f8695c     // Catch:{ a -> 0x004e }
                java.lang.Object r5 = r9.f8696d     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.z1$b r4 = r9.f8693a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.T(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.F()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.d0 r8 = new com.google.protobuf.d0     // Catch:{ all -> 0x005b }
                r8.<init>(r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f8581e = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.b.x(java.util.Map, com.google.protobuf.m0$a, com.google.protobuf.r):void");
        }

        public void y(List list) {
            int i10;
            int i11;
            int i12;
            if (list instanceof k0) {
                k0 k0Var = (k0) list;
                int b10 = z1.b(this.f8582f);
                if (b10 == 0) {
                    do {
                        k0Var.h(d());
                        if (!R()) {
                            i12 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i12;
                    return;
                } else if (b10 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        k0Var.h(d0());
                    }
                } else {
                    throw d0.d();
                }
            } else {
                int b11 = z1.b(this.f8582f);
                if (b11 == 0) {
                    do {
                        list.add(Long.valueOf(d()));
                        if (!R()) {
                            i11 = this.f8579c;
                        } else {
                            return;
                        }
                    } while (c0() == this.f8582f);
                    this.f8579c = i11;
                    return;
                } else if (b11 == 2) {
                    i10 = this.f8579c + c0();
                    while (this.f8579c < i10) {
                        list.add(Long.valueOf(d0()));
                    }
                } else {
                    throw d0.d();
                }
            }
            g0(i10);
        }

        public void z(List list) {
            b0(list, true);
        }
    }

    private g() {
    }

    /* synthetic */ g(a aVar) {
        this();
    }

    public static g Q(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
