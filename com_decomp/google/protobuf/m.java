package com.google.protobuf;

import com.google.protobuf.y1;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class m extends i {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f8677c = Logger.getLogger(m.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f8678d = x1.G();

    /* renamed from: a  reason: collision with root package name */
    n f8679a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f8680b;

    private static abstract class b extends m {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f8681e;

        /* renamed from: f  reason: collision with root package name */
        final int f8682f;

        /* renamed from: g  reason: collision with root package name */
        int f8683g;

        /* renamed from: h  reason: collision with root package name */
        int f8684h;

        b(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f8681e = bArr;
                this.f8682f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void a1(byte b10) {
            byte[] bArr = this.f8681e;
            int i10 = this.f8683g;
            this.f8683g = i10 + 1;
            bArr[i10] = b10;
            this.f8684h++;
        }

        /* access modifiers changed from: package-private */
        public final void b1(int i10) {
            byte[] bArr = this.f8681e;
            int i11 = this.f8683g;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f8683g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f8684h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void c1(long j10) {
            byte[] bArr = this.f8681e;
            int i10 = this.f8683g;
            int i11 = i10 + 1;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i13 + 1;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f8683g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f8684h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void d1(int i10) {
            if (i10 >= 0) {
                f1(i10);
            } else {
                g1((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void e1(int i10, int i11) {
            f1(z1.c(i10, i11));
        }

        /* access modifiers changed from: package-private */
        public final void f1(int i10) {
            if (m.f8678d) {
                long j10 = (long) this.f8683g;
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f8681e;
                    int i11 = this.f8683g;
                    this.f8683g = i11 + 1;
                    x1.L(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f8681e;
                int i12 = this.f8683g;
                this.f8683g = i12 + 1;
                x1.L(bArr2, (long) i12, (byte) i10);
                this.f8684h += (int) (((long) this.f8683g) - j10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.f8681e;
                int i13 = this.f8683g;
                this.f8683g = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                this.f8684h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f8681e;
            int i14 = this.f8683g;
            this.f8683g = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f8684h++;
        }

        public final int g0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* access modifiers changed from: package-private */
        public final void g1(long j10) {
            if (m.f8678d) {
                long j11 = (long) this.f8683g;
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f8681e;
                    int i10 = this.f8683g;
                    this.f8683g = i10 + 1;
                    x1.L(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f8681e;
                int i11 = this.f8683g;
                this.f8683g = i11 + 1;
                x1.L(bArr2, (long) i11, (byte) ((int) j10));
                this.f8684h += (int) (((long) this.f8683g) - j11);
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f8681e;
                int i12 = this.f8683g;
                this.f8683g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                this.f8684h++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f8681e;
            int i13 = this.f8683g;
            this.f8683g = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
            this.f8684h++;
        }
    }

    private static class c extends m {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f8685e;

        /* renamed from: f  reason: collision with root package name */
        private final int f8686f;

        /* renamed from: g  reason: collision with root package name */
        private final int f8687g;

        /* renamed from: h  reason: collision with root package name */
        private int f8688h;

        c(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                int i12 = i10 + i11;
                if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                    this.f8685e = bArr;
                    this.f8686f = i10;
                    this.f8688h = i10;
                    this.f8687g = i12;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void C0(int i10, int i11) {
            V0(i10, 0);
            D0(i11);
        }

        public final void D0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void G0(int i10, t0 t0Var, l1 l1Var) {
            V0(i10, 2);
            X0(((a) t0Var).getSerializedSize(l1Var));
            l1Var.b(t0Var, this.f8679a);
        }

        public final void H0(t0 t0Var) {
            X0(t0Var.getSerializedSize());
            t0Var.writeTo((m) this);
        }

        public final void I0(int i10, t0 t0Var) {
            V0(1, 3);
            W0(2, i10);
            c1(3, t0Var);
            V0(1, 4);
        }

        public final void J0(int i10, j jVar) {
            V0(1, 3);
            W0(2, i10);
            m0(3, jVar);
            V0(1, 4);
        }

        public final void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        public final void U0(String str) {
            int i10;
            int i11 = this.f8688h;
            try {
                int V = m.V(str.length() * 3);
                int V2 = m.V(str.length());
                if (V2 == V) {
                    int i12 = i11 + V2;
                    this.f8688h = i12;
                    i10 = y1.i(str, this.f8685e, i12, g0());
                    this.f8688h = i11;
                    X0((i10 - i11) - V2);
                } else {
                    X0(y1.j(str));
                    i10 = y1.i(str, this.f8685e, this.f8688h, g0());
                }
                this.f8688h = i10;
            } catch (y1.d e10) {
                this.f8688h = i11;
                b0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        public final void V0(int i10, int i11) {
            X0(z1.c(i10, i11));
        }

        public final void W0(int i10, int i11) {
            V0(i10, 0);
            X0(i11);
        }

        public final void X0(int i10) {
            if (!m.f8678d || d.c() || g0() < 5) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f8685e;
                    int i11 = this.f8688h;
                    this.f8688h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8685e;
                    int i12 = this.f8688h;
                    this.f8688h = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), 1}), e10);
                }
            } else if ((i10 & -128) == 0) {
                byte[] bArr3 = this.f8685e;
                int i13 = this.f8688h;
                this.f8688h = i13 + 1;
                x1.L(bArr3, (long) i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f8685e;
                int i14 = this.f8688h;
                this.f8688h = i14 + 1;
                x1.L(bArr4, (long) i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & -128) == 0) {
                    byte[] bArr5 = this.f8685e;
                    int i16 = this.f8688h;
                    this.f8688h = i16 + 1;
                    x1.L(bArr5, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f8685e;
                int i17 = this.f8688h;
                this.f8688h = i17 + 1;
                x1.L(bArr6, (long) i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & -128) == 0) {
                    byte[] bArr7 = this.f8685e;
                    int i19 = this.f8688h;
                    this.f8688h = i19 + 1;
                    x1.L(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f8685e;
                int i20 = this.f8688h;
                this.f8688h = i20 + 1;
                x1.L(bArr8, (long) i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & -128) == 0) {
                    byte[] bArr9 = this.f8685e;
                    int i22 = this.f8688h;
                    this.f8688h = i22 + 1;
                    x1.L(bArr9, (long) i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f8685e;
                int i23 = this.f8688h;
                this.f8688h = i23 + 1;
                x1.L(bArr10, (long) i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f8685e;
                int i24 = this.f8688h;
                this.f8688h = i24 + 1;
                x1.L(bArr11, (long) i24, (byte) (i21 >>> 7));
            }
        }

        public final void Y0(int i10, long j10) {
            V0(i10, 0);
            Z0(j10);
        }

        public final void Z0(long j10) {
            if (!m.f8678d || g0() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f8685e;
                    int i10 = this.f8688h;
                    this.f8688h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f8685e;
                    int i11 = this.f8688h;
                    this.f8688h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f8685e;
                    int i12 = this.f8688h;
                    this.f8688h = i12 + 1;
                    x1.L(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f8685e;
                int i13 = this.f8688h;
                this.f8688h = i13 + 1;
                x1.L(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void a(ByteBuffer byteBuffer) {
            a1(byteBuffer);
        }

        public void a0() {
        }

        public final void a1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f8685e, this.f8688h, remaining);
                this.f8688h += remaining;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), Integer.valueOf(remaining)}), e10);
            }
        }

        public final void b(byte[] bArr, int i10, int i11) {
            b1(bArr, i10, i11);
        }

        public final void b1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f8685e, this.f8688h, i11);
                this.f8688h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), Integer.valueOf(i11)}), e10);
            }
        }

        public final void c1(int i10, t0 t0Var) {
            V0(i10, 2);
            H0(t0Var);
        }

        public final int g0() {
            return this.f8687g - this.f8688h;
        }

        public final void h0(byte b10) {
            try {
                byte[] bArr = this.f8685e;
                int i10 = this.f8688h;
                this.f8688h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), 1}), e10);
            }
        }

        public final void i0(int i10, boolean z10) {
            V0(i10, 0);
            h0(z10 ? (byte) 1 : 0);
        }

        public final void l0(byte[] bArr, int i10, int i11) {
            X0(i11);
            b1(bArr, i10, i11);
        }

        public final void m0(int i10, j jVar) {
            V0(i10, 2);
            n0(jVar);
        }

        public final void n0(j jVar) {
            X0(jVar.size());
            jVar.Q(this);
        }

        public final void s0(int i10, int i11) {
            V0(i10, 5);
            t0(i11);
        }

        public final void t0(int i10) {
            try {
                byte[] bArr = this.f8685e;
                int i11 = this.f8688h;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f8688h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), 1}), e10);
            }
        }

        public final void u0(int i10, long j10) {
            V0(i10, 1);
            v0(j10);
        }

        public final void v0(long j10) {
            try {
                byte[] bArr = this.f8685e;
                int i10 = this.f8688h;
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f8688h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f8688h), Integer.valueOf(this.f8687g), 1}), e10);
            }
        }
    }

    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static final class e extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f8689i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.f8689i = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private void h1() {
            this.f8689i.write(this.f8681e, 0, this.f8683g);
            this.f8683g = 0;
        }

        private void i1(int i10) {
            if (this.f8682f - this.f8683g < i10) {
                h1();
            }
        }

        public void C0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            d1(i11);
        }

        public void D0(int i10) {
            if (i10 >= 0) {
                X0(i10);
            } else {
                Z0((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void G0(int i10, t0 t0Var, l1 l1Var) {
            V0(i10, 2);
            m1(t0Var, l1Var);
        }

        public void H0(t0 t0Var) {
            X0(t0Var.getSerializedSize());
            t0Var.writeTo((m) this);
        }

        public void I0(int i10, t0 t0Var) {
            V0(1, 3);
            W0(2, i10);
            l1(3, t0Var);
            V0(1, 4);
        }

        public void J0(int i10, j jVar) {
            V0(1, 3);
            W0(2, i10);
            m0(3, jVar);
            V0(1, 4);
        }

        public void T0(int i10, String str) {
            V0(i10, 2);
            U0(str);
        }

        public void U0(String str) {
            int i10;
            int i11;
            try {
                int length = str.length() * 3;
                int V = m.V(length);
                int i12 = V + length;
                int i13 = this.f8682f;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int i14 = y1.i(str, bArr, 0, length);
                    X0(i14);
                    b(bArr, 0, i14);
                    return;
                }
                if (i12 > i13 - this.f8683g) {
                    h1();
                }
                int V2 = m.V(str.length());
                i10 = this.f8683g;
                if (V2 == V) {
                    int i15 = i10 + V2;
                    this.f8683g = i15;
                    int i16 = y1.i(str, this.f8681e, i15, this.f8682f - i15);
                    this.f8683g = i10;
                    i11 = (i16 - i10) - V2;
                    f1(i11);
                    this.f8683g = i16;
                } else {
                    i11 = y1.j(str);
                    f1(i11);
                    this.f8683g = y1.i(str, this.f8681e, this.f8683g, i11);
                }
                this.f8684h += i11;
            } catch (y1.d e10) {
                this.f8684h -= this.f8683g - i10;
                this.f8683g = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new d(e11);
            } catch (y1.d e12) {
                b0(str, e12);
            }
        }

        public void V0(int i10, int i11) {
            X0(z1.c(i10, i11));
        }

        public void W0(int i10, int i11) {
            i1(20);
            e1(i10, 0);
            f1(i11);
        }

        public void X0(int i10) {
            i1(5);
            f1(i10);
        }

        public void Y0(int i10, long j10) {
            i1(20);
            e1(i10, 0);
            g1(j10);
        }

        public void Z0(long j10) {
            i1(10);
            g1(j10);
        }

        public void a(ByteBuffer byteBuffer) {
            j1(byteBuffer);
        }

        public void a0() {
            if (this.f8683g > 0) {
                h1();
            }
        }

        public void b(byte[] bArr, int i10, int i11) {
            k1(bArr, i10, i11);
        }

        public void h0(byte b10) {
            if (this.f8683g == this.f8682f) {
                h1();
            }
            a1(b10);
        }

        public void i0(int i10, boolean z10) {
            i1(11);
            e1(i10, 0);
            a1(z10 ? (byte) 1 : 0);
        }

        public void j1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i10 = this.f8682f;
            int i11 = this.f8683g;
            if (i10 - i11 >= remaining) {
                byteBuffer.get(this.f8681e, i11, remaining);
                this.f8683g += remaining;
            } else {
                int i12 = i10 - i11;
                byteBuffer.get(this.f8681e, i11, i12);
                remaining -= i12;
                this.f8683g = this.f8682f;
                this.f8684h += i12;
                h1();
                while (true) {
                    int i13 = this.f8682f;
                    if (remaining <= i13) {
                        break;
                    }
                    byteBuffer.get(this.f8681e, 0, i13);
                    this.f8689i.write(this.f8681e, 0, this.f8682f);
                    int i14 = this.f8682f;
                    remaining -= i14;
                    this.f8684h += i14;
                }
                byteBuffer.get(this.f8681e, 0, remaining);
                this.f8683g = remaining;
            }
            this.f8684h += remaining;
        }

        public void k1(byte[] bArr, int i10, int i11) {
            int i12 = this.f8682f;
            int i13 = this.f8683g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f8681e, i13, i11);
                this.f8683g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f8681e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f8683g = this.f8682f;
                this.f8684h += i14;
                h1();
                if (i11 <= this.f8682f) {
                    System.arraycopy(bArr, i15, this.f8681e, 0, i11);
                    this.f8683g = i11;
                } else {
                    this.f8689i.write(bArr, i15, i11);
                }
            }
            this.f8684h += i11;
        }

        public void l0(byte[] bArr, int i10, int i11) {
            X0(i11);
            k1(bArr, i10, i11);
        }

        public void l1(int i10, t0 t0Var) {
            V0(i10, 2);
            H0(t0Var);
        }

        public void m0(int i10, j jVar) {
            V0(i10, 2);
            n0(jVar);
        }

        /* access modifiers changed from: package-private */
        public void m1(t0 t0Var, l1 l1Var) {
            X0(((a) t0Var).getSerializedSize(l1Var));
            l1Var.b(t0Var, this.f8679a);
        }

        public void n0(j jVar) {
            X0(jVar.size());
            jVar.Q(this);
        }

        public void s0(int i10, int i11) {
            i1(14);
            e1(i10, 5);
            b1(i11);
        }

        public void t0(int i10) {
            i1(4);
            b1(i10);
        }

        public void u0(int i10, long j10) {
            i1(18);
            e1(i10, 1);
            c1(j10);
        }

        public void v0(long j10) {
            i1(8);
            c1(j10);
        }
    }

    private m() {
    }

    static int A(int i10) {
        return V(i10) + i10;
    }

    public static int B(int i10, t0 t0Var) {
        return (T(1) * 2) + U(2, i10) + C(3, t0Var);
    }

    public static int C(int i10, t0 t0Var) {
        return T(i10) + E(t0Var);
    }

    static int D(int i10, t0 t0Var, l1 l1Var) {
        return T(i10) + F(t0Var, l1Var);
    }

    public static int E(t0 t0Var) {
        return A(t0Var.getSerializedSize());
    }

    static int F(t0 t0Var, l1 l1Var) {
        return A(((a) t0Var).getSerializedSize(l1Var));
    }

    static int G(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int H(int i10, j jVar) {
        return (T(1) * 2) + U(2, i10) + h(3, jVar);
    }

    public static int I(int i10) {
        return V(i10);
    }

    public static int J(int i10, int i11) {
        return T(i10) + K(i11);
    }

    public static int K(int i10) {
        return 4;
    }

    public static int L(int i10, long j10) {
        return T(i10) + M(j10);
    }

    public static int M(long j10) {
        return 8;
    }

    public static int N(int i10, int i11) {
        return T(i10) + O(i11);
    }

    public static int O(int i10) {
        return V(Y(i10));
    }

    public static int P(int i10, long j10) {
        return T(i10) + Q(j10);
    }

    public static int Q(long j10) {
        return X(Z(j10));
    }

    public static int R(int i10, String str) {
        return T(i10) + S(str);
    }

    public static int S(String str) {
        int i10;
        try {
            i10 = y1.j(str);
        } catch (y1.d unused) {
            i10 = str.getBytes(c0.f8540a).length;
        }
        return A(i10);
    }

    public static int T(int i10) {
        return V(z1.c(i10, 0));
    }

    public static int U(int i10, int i11) {
        return T(i10) + V(i11);
    }

    public static int V(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int W(int i10, long j10) {
        return T(i10) + X(j10);
    }

    public static int X(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int Y(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long Z(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static m d0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int e(int i10, boolean z10) {
        return T(i10) + f(z10);
    }

    public static m e0(byte[] bArr) {
        return f0(bArr, 0, bArr.length);
    }

    public static int f(boolean z10) {
        return 1;
    }

    public static m f0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int g(byte[] bArr) {
        return A(bArr.length);
    }

    public static int h(int i10, j jVar) {
        return T(i10) + i(jVar);
    }

    public static int i(j jVar) {
        return A(jVar.size());
    }

    public static int j(int i10, double d10) {
        return T(i10) + k(d10);
    }

    public static int k(double d10) {
        return 8;
    }

    public static int l(int i10, int i11) {
        return T(i10) + m(i11);
    }

    public static int m(int i10) {
        return x(i10);
    }

    public static int n(int i10, int i11) {
        return T(i10) + o(i11);
    }

    public static int o(int i10) {
        return 4;
    }

    public static int p(int i10, long j10) {
        return T(i10) + q(j10);
    }

    public static int q(long j10) {
        return 8;
    }

    public static int r(int i10, float f10) {
        return T(i10) + s(f10);
    }

    public static int s(float f10) {
        return 4;
    }

    static int t(int i10, t0 t0Var, l1 l1Var) {
        return (T(i10) * 2) + v(t0Var, l1Var);
    }

    public static int u(t0 t0Var) {
        return t0Var.getSerializedSize();
    }

    static int v(t0 t0Var, l1 l1Var) {
        return ((a) t0Var).getSerializedSize(l1Var);
    }

    public static int w(int i10, int i11) {
        return T(i10) + x(i11);
    }

    public static int x(int i10) {
        if (i10 >= 0) {
            return V(i10);
        }
        return 10;
    }

    public static int y(int i10, long j10) {
        return T(i10) + z(j10);
    }

    public static int z(long j10) {
        return X(j10);
    }

    public final void A0(t0 t0Var) {
        t0Var.writeTo(this);
    }

    /* access modifiers changed from: package-private */
    public final void B0(t0 t0Var, l1 l1Var) {
        l1Var.b(t0Var, this.f8679a);
    }

    public abstract void C0(int i10, int i11);

    public abstract void D0(int i10);

    public final void E0(int i10, long j10) {
        Y0(i10, j10);
    }

    public final void F0(long j10) {
        Z0(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void G0(int i10, t0 t0Var, l1 l1Var);

    public abstract void H0(t0 t0Var);

    public abstract void I0(int i10, t0 t0Var);

    public abstract void J0(int i10, j jVar);

    public final void K0(int i10) {
        X0(i10);
    }

    public final void L0(int i10, int i11) {
        s0(i10, i11);
    }

    public final void M0(int i10) {
        t0(i10);
    }

    public final void N0(int i10, long j10) {
        u0(i10, j10);
    }

    public final void O0(long j10) {
        v0(j10);
    }

    public final void P0(int i10, int i11) {
        W0(i10, Y(i11));
    }

    public final void Q0(int i10) {
        X0(Y(i10));
    }

    public final void R0(int i10, long j10) {
        Y0(i10, Z(j10));
    }

    public final void S0(long j10) {
        Z0(Z(j10));
    }

    public abstract void T0(int i10, String str);

    public abstract void U0(String str);

    public abstract void V0(int i10, int i11);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10);

    public abstract void Y0(int i10, long j10);

    public abstract void Z0(long j10);

    public abstract void a0();

    public abstract void b(byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public final void b0(String str, y1.d dVar) {
        f8677c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(c0.f8540a);
        try {
            X0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        } catch (d e11) {
            throw e11;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c0() {
        return this.f8680b;
    }

    public final void d() {
        if (g0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int g0();

    public abstract void h0(byte b10);

    public abstract void i0(int i10, boolean z10);

    public final void j0(boolean z10) {
        h0(z10 ? (byte) 1 : 0);
    }

    public final void k0(byte[] bArr) {
        l0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void l0(byte[] bArr, int i10, int i11);

    public abstract void m0(int i10, j jVar);

    public abstract void n0(j jVar);

    public final void o0(int i10, double d10) {
        u0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void p0(double d10) {
        v0(Double.doubleToRawLongBits(d10));
    }

    public final void q0(int i10, int i11) {
        C0(i10, i11);
    }

    public final void r0(int i10) {
        D0(i10);
    }

    public abstract void s0(int i10, int i11);

    public abstract void t0(int i10);

    public abstract void u0(int i10, long j10);

    public abstract void v0(long j10);

    public final void w0(int i10, float f10) {
        s0(i10, Float.floatToRawIntBits(f10));
    }

    public final void x0(float f10) {
        t0(Float.floatToRawIntBits(f10));
    }

    public final void y0(int i10, t0 t0Var) {
        V0(i10, 3);
        A0(t0Var);
        V0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    public final void z0(int i10, t0 t0Var, l1 l1Var) {
        V0(i10, 3);
        B0(t0Var, l1Var);
        V0(i10, 4);
    }
}
