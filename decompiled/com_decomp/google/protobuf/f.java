package com.google.protobuf;

import android.support.v4.media.session.b;
import com.google.protobuf.c0;

abstract class f {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f8568a;

        /* renamed from: b  reason: collision with root package name */
        public long f8569b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8570c;

        /* renamed from: d  reason: collision with root package name */
        public final r f8571d;

        a(r rVar) {
            rVar.getClass();
            this.f8571d = rVar;
        }
    }

    static int A(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        int K = K(bArr, i11, aVar);
        while (true) {
            k0Var.h(k.c(aVar.f8569b));
            if (K >= i12) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    static int B(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a;
        if (i11 < 0) {
            throw d0.f();
        } else if (i11 == 0) {
            aVar.f8570c = "";
            return H;
        } else {
            aVar.f8570c = new String(bArr, H, i11, c0.f8540a);
            return H + i11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int C(int r4, byte[] r5, int r6, int r7, com.google.protobuf.c0.i r8, com.google.protobuf.f.a r9) {
        /*
            int r6 = H(r5, r6, r9)
            int r0 = r9.f8568a
            if (r0 < 0) goto L_0x003f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.c0.f8540a
            r2.<init>(r5, r6, r0, r3)
        L_0x0017:
            r8.add(r2)
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x003e
            int r0 = H(r5, r6, r9)
            int r2 = r9.f8568a
            if (r4 == r2) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            int r6 = H(r5, r0, r9)
            int r0 = r9.f8568a
            if (r0 < 0) goto L_0x0039
            if (r0 != 0) goto L_0x0031
            goto L_0x000c
        L_0x0031:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.c0.f8540a
            r2.<init>(r5, r6, r0, r3)
            goto L_0x0017
        L_0x0039:
            com.google.protobuf.d0 r4 = com.google.protobuf.d0.f()
            throw r4
        L_0x003e:
            return r6
        L_0x003f:
            com.google.protobuf.d0 r4 = com.google.protobuf.d0.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.C(int, byte[], int, int, com.google.protobuf.c0$i, com.google.protobuf.f$a):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int D(int r5, byte[] r6, int r7, int r8, com.google.protobuf.c0.i r9, com.google.protobuf.f.a r10) {
        /*
            int r7 = H(r6, r7, r10)
            int r0 = r10.f8568a
            if (r0 < 0) goto L_0x0059
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
        L_0x000c:
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.y1.t(r6, r7, r2)
            if (r3 == 0) goto L_0x0054
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.c0.f8540a
            r3.<init>(r6, r7, r0, r4)
        L_0x001f:
            r9.add(r3)
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0053
            int r0 = H(r6, r7, r10)
            int r2 = r10.f8568a
            if (r5 == r2) goto L_0x002e
            goto L_0x0053
        L_0x002e:
            int r7 = H(r6, r0, r10)
            int r0 = r10.f8568a
            if (r0 < 0) goto L_0x004e
            if (r0 != 0) goto L_0x0039
            goto L_0x000c
        L_0x0039:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.y1.t(r6, r7, r2)
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.c0.f8540a
            r3.<init>(r6, r7, r0, r4)
            goto L_0x001f
        L_0x0049:
            com.google.protobuf.d0 r5 = com.google.protobuf.d0.c()
            throw r5
        L_0x004e:
            com.google.protobuf.d0 r5 = com.google.protobuf.d0.f()
            throw r5
        L_0x0053:
            return r7
        L_0x0054:
            com.google.protobuf.d0 r5 = com.google.protobuf.d0.c()
            throw r5
        L_0x0059:
            com.google.protobuf.d0 r5 = com.google.protobuf.d0.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.D(int, byte[], int, int, com.google.protobuf.c0$i, com.google.protobuf.f$a):int");
    }

    static int E(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a;
        if (i11 < 0) {
            throw d0.f();
        } else if (i11 == 0) {
            aVar.f8570c = "";
            return H;
        } else {
            aVar.f8570c = y1.h(bArr, H, i11);
            return H + i11;
        }
    }

    static int F(int i10, byte[] bArr, int i11, int i12, u1 u1Var, a aVar) {
        if (z1.a(i10) != 0) {
            int b10 = z1.b(i10);
            if (b10 == 0) {
                int K = K(bArr, i11, aVar);
                u1Var.q(i10, Long.valueOf(aVar.f8569b));
                return K;
            } else if (b10 == 1) {
                u1Var.q(i10, Long.valueOf(i(bArr, i11)));
                return i11 + 8;
            } else if (b10 == 2) {
                int H = H(bArr, i11, aVar);
                int i13 = aVar.f8568a;
                if (i13 < 0) {
                    throw d0.f();
                } else if (i13 <= bArr.length - H) {
                    u1Var.q(i10, i13 == 0 ? j.f8600f : j.p(bArr, H, i13));
                    return H + i13;
                } else {
                    throw d0.k();
                }
            } else if (b10 == 3) {
                u1 n10 = u1.n();
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int H2 = H(bArr, i11, aVar);
                    int i16 = aVar.f8568a;
                    i15 = i16;
                    if (i16 == i14) {
                        i11 = H2;
                        break;
                    }
                    int F = F(i15, bArr, H2, i12, n10, aVar);
                    i15 = i16;
                    i11 = F;
                }
                if (i11 > i12 || i15 != i14) {
                    throw d0.g();
                }
                u1Var.q(i10, n10);
                return i11;
            } else if (b10 == 5) {
                u1Var.q(i10, Integer.valueOf(g(bArr, i11)));
                return i11 + 4;
            } else {
                throw d0.b();
            }
        } else {
            throw d0.b();
        }
    }

    static int G(int i10, byte[] bArr, int i11, a aVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] < 0) {
                                i17 = i19;
                            } else {
                                aVar.f8568a = i18;
                                return i19;
                            }
                        }
                    }
                }
            }
            aVar.f8568a = i16 | i12;
            return i17;
        }
        aVar.f8568a = i14 | i13;
        return i15;
    }

    static int H(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return G(b10, bArr, i11, aVar);
        }
        aVar.f8568a = b10;
        return i11;
    }

    static int I(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        int H = H(bArr, i11, aVar);
        while (true) {
            b0Var.f(aVar.f8568a);
            if (H >= i12) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }

    static int J(long j10, byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i12;
            byte b12 = b11;
            i11 = i13;
            b10 = b12;
        }
        aVar.f8569b = j11;
        return i11;
    }

    static int K(byte[] bArr, int i10, a aVar) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 < 0) {
            return J(j10, bArr, i11, aVar);
        }
        aVar.f8569b = j10;
        return i11;
    }

    static int L(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        int K = K(bArr, i11, aVar);
        while (true) {
            k0Var.h(aVar.f8569b);
            if (K >= i12) {
                break;
            }
            int H = H(bArr, K, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            K = K(bArr, H, aVar);
        }
        return K;
    }

    static int M(int i10, byte[] bArr, int i11, int i12, a aVar) {
        if (z1.a(i10) != 0) {
            int b10 = z1.b(i10);
            if (b10 == 0) {
                return K(bArr, i11, aVar);
            }
            if (b10 == 1) {
                return i11 + 8;
            }
            if (b10 == 2) {
                return H(bArr, i11, aVar) + aVar.f8568a;
            }
            if (b10 == 3) {
                int i13 = (i10 & -8) | 4;
                int i14 = 0;
                while (i11 < i12) {
                    i11 = H(bArr, i11, aVar);
                    i14 = aVar.f8568a;
                    if (i14 == i13) {
                        break;
                    }
                    i11 = M(i14, bArr, i11, i12, aVar);
                }
                if (i11 <= i12 && i14 == i13) {
                    return i11;
                }
                throw d0.g();
            } else if (b10 == 5) {
                return i11 + 4;
            } else {
                throw d0.b();
            }
        } else {
            throw d0.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1:0x000e, code lost:
        if (r12.f8569b != 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r11.h(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r9 >= r10) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = H(r8, r9, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r7 == r12.f8568a) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r9 = K(r8, r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r12.f8569b == 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(int r7, byte[] r8, int r9, int r10, com.google.protobuf.c0.i r11, com.google.protobuf.f.a r12) {
        /*
            com.google.protobuf.h r11 = (com.google.protobuf.h) r11
            int r9 = K(r8, r9, r12)
            long r0 = r12.f8569b
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r11.h(r0)
            if (r9 >= r10) goto L_0x002c
            int r0 = H(r8, r9, r12)
            int r1 = r12.f8568a
            if (r7 == r1) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            int r9 = K(r8, r0, r12)
            long r0 = r12.f8569b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0012
            goto L_0x0010
        L_0x002c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a(int, byte[], int, int, com.google.protobuf.c0$i, com.google.protobuf.f$a):int");
    }

    static int b(byte[] bArr, int i10, a aVar) {
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a;
        if (i11 < 0) {
            throw d0.f();
        } else if (i11 > bArr.length - H) {
            throw d0.k();
        } else if (i11 == 0) {
            aVar.f8570c = j.f8600f;
            return H;
        } else {
            aVar.f8570c = j.p(bArr, H, i11);
            return H + i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r4 = H(r3, r0, r7);
        r0 = r7.f8568a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0 < 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 > (r3.length - r4)) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r0 != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw com.google.protobuf.d0.k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        throw com.google.protobuf.d0.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r0 == 0) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r6.add(com.google.protobuf.j.f8600f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r6.add(com.google.protobuf.j.p(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r4 >= r5) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = H(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r2 == r7.f8568a) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.c0.i r6, com.google.protobuf.f.a r7) {
        /*
            int r4 = H(r3, r4, r7)
            int r0 = r7.f8568a
            if (r0 < 0) goto L_0x0046
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0041
            if (r0 != 0) goto L_0x0014
        L_0x000e:
            com.google.protobuf.j r0 = com.google.protobuf.j.f8600f
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.j r1 = com.google.protobuf.j.p(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x0040
            int r0 = H(r3, r4, r7)
            int r1 = r7.f8568a
            if (r2 == r1) goto L_0x0027
            goto L_0x0040
        L_0x0027:
            int r4 = H(r3, r0, r7)
            int r0 = r7.f8568a
            if (r0 < 0) goto L_0x003b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0036
            if (r0 != 0) goto L_0x0014
            goto L_0x000e
        L_0x0036:
            com.google.protobuf.d0 r2 = com.google.protobuf.d0.k()
            throw r2
        L_0x003b:
            com.google.protobuf.d0 r2 = com.google.protobuf.d0.f()
            throw r2
        L_0x0040:
            return r4
        L_0x0041:
            com.google.protobuf.d0 r2 = com.google.protobuf.d0.k()
            throw r2
        L_0x0046:
            com.google.protobuf.d0 r2 = com.google.protobuf.d0.f()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.c(int, byte[], int, int, com.google.protobuf.c0$i, com.google.protobuf.f$a):int");
    }

    static double d(byte[] bArr, int i10) {
        return Double.longBitsToDouble(i(bArr, i10));
    }

    static int e(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        o oVar = (o) iVar;
        oVar.f(d(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            oVar.f(d(bArr, H));
            i13 = H + 8;
        }
        return i13;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, Object obj, t0 t0Var, t1 t1Var, a aVar) {
        if (aVar.f8571d.a(t0Var, i10 >>> 3) == null) {
            return F(i10, bArr, i11, i12, w0.v(obj), aVar);
        }
        b.a(obj);
        throw null;
    }

    static int g(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int h(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        b0Var.f(g(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            b0Var.f(g(bArr, H));
            i13 = H + 4;
        }
        return i13;
    }

    static long i(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    static int j(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        k0Var.h(i(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            k0Var.h(i(bArr, H));
            i13 = H + 8;
        }
        return i13;
    }

    static float k(byte[] bArr, int i10) {
        return Float.intBitsToFloat(g(bArr, i10));
    }

    static int l(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        x xVar = (x) iVar;
        xVar.f(k(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int H = H(bArr, i13, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            xVar.f(k(bArr, H));
            i13 = H + 4;
        }
        return i13;
    }

    static int m(l1 l1Var, byte[] bArr, int i10, int i11, int i12, a aVar) {
        w0 w0Var = (w0) l1Var;
        Object i13 = w0Var.i();
        int c02 = w0Var.c0(i13, bArr, i10, i11, i12, aVar);
        w0Var.c(i13);
        aVar.f8570c = i13;
        return c02;
    }

    static int n(l1 l1Var, int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        int i13 = (i10 & -8) | 4;
        int m10 = m(l1Var, bArr, i11, i12, i13, aVar);
        while (true) {
            iVar.add(aVar.f8570c);
            if (m10 >= i12) {
                break;
            }
            int H = H(bArr, m10, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            m10 = m(l1Var, bArr, H, i12, i13, aVar);
        }
        return m10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int o(com.google.protobuf.l1 r6, byte[] r7, int r8, int r9, com.google.protobuf.f.a r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = G(r8, r7, r0, r10)
            int r8 = r10.f8568a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.i()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.g(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.f8570c = r9
            return r8
        L_0x0025:
            com.google.protobuf.d0 r6 = com.google.protobuf.d0.k()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.o(com.google.protobuf.l1, byte[], int, int, com.google.protobuf.f$a):int");
    }

    static int p(l1 l1Var, int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        int o10 = o(l1Var, bArr, i11, i12, aVar);
        while (true) {
            iVar.add(aVar.f8570c);
            if (o10 >= i12) {
                break;
            }
            int H = H(bArr, o10, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            o10 = o(l1Var, bArr, H, i12, aVar);
        }
        return o10;
    }

    static int q(byte[] bArr, int i10, c0.i iVar, a aVar) {
        h hVar = (h) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            hVar.h(aVar.f8569b != 0);
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int r(byte[] bArr, int i10, c0.i iVar, a aVar) {
        o oVar = (o) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            oVar.f(d(bArr, H));
            H += 8;
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int s(byte[] bArr, int i10, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            b0Var.f(g(bArr, H));
            H += 4;
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int t(byte[] bArr, int i10, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            k0Var.h(i(bArr, H));
            H += 8;
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int u(byte[] bArr, int i10, c0.i iVar, a aVar) {
        x xVar = (x) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            xVar.f(k(bArr, H));
            H += 4;
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int v(byte[] bArr, int i10, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            H = H(bArr, H, aVar);
            b0Var.f(k.b(aVar.f8568a));
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int w(byte[] bArr, int i10, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            k0Var.h(k.c(aVar.f8569b));
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int x(byte[] bArr, int i10, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            H = H(bArr, H, aVar);
            b0Var.f(aVar.f8568a);
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int y(byte[] bArr, int i10, c0.i iVar, a aVar) {
        k0 k0Var = (k0) iVar;
        int H = H(bArr, i10, aVar);
        int i11 = aVar.f8568a + H;
        while (H < i11) {
            H = K(bArr, H, aVar);
            k0Var.h(aVar.f8569b);
        }
        if (H == i11) {
            return H;
        }
        throw d0.k();
    }

    static int z(int i10, byte[] bArr, int i11, int i12, c0.i iVar, a aVar) {
        b0 b0Var = (b0) iVar;
        int H = H(bArr, i11, aVar);
        while (true) {
            b0Var.f(k.b(aVar.f8568a));
            if (H >= i12) {
                break;
            }
            int H2 = H(bArr, H, aVar);
            if (i10 != aVar.f8568a) {
                break;
            }
            H = H(bArr, H2, aVar);
        }
        return H;
    }
}
