package com.google.protobuf;

import com.google.android.gms.common.api.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class j implements Iterable, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final j f8600f = new C0112j(c0.f8542c);

    /* renamed from: g  reason: collision with root package name */
    private static final f f8601g = (d.c() ? new k((a) null) : new d((a) null));

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator f8602h = new b();

    /* renamed from: e  reason: collision with root package name */
    private int f8603e = 0;

    class a extends c {

        /* renamed from: e  reason: collision with root package name */
        private int f8604e = 0;

        /* renamed from: f  reason: collision with root package name */
        private final int f8605f;

        a() {
            this.f8605f = j.this.size();
        }

        public byte a() {
            int i10 = this.f8604e;
            if (i10 < this.f8605f) {
                this.f8604e = i10 + 1;
                return j.this.u(i10);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f8604e < this.f8605f;
        }
    }

    static class b implements Comparator {
        b() {
        }

        /* renamed from: a */
        public int compare(j jVar, j jVar2) {
            g x10 = jVar.x();
            g x11 = jVar2.x();
            while (x10.hasNext() && x11.hasNext()) {
                int compare = Integer.compare(j.I(x10.a()), j.I(x11.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(jVar.size(), jVar2.size());
        }
    }

    static abstract class c implements g {
        c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }
    }

    private static final class e extends C0112j {

        /* renamed from: j  reason: collision with root package name */
        private final int f8607j;

        /* renamed from: k  reason: collision with root package name */
        private final int f8608k;

        e(byte[] bArr, int i10, int i11) {
            super(bArr);
            j.i(i10, i10 + i11, bArr.length);
            this.f8607j = i10;
            this.f8608k = i11;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* access modifiers changed from: protected */
        public int U() {
            return this.f8607j;
        }

        public byte f(int i10) {
            j.h(i10, size());
            return this.f8611i[this.f8607j + i10];
        }

        /* access modifiers changed from: protected */
        public void s(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f8611i, U() + i10, bArr, i11, i12);
        }

        public int size() {
            return this.f8608k;
        }

        /* access modifiers changed from: package-private */
        public byte u(int i10) {
            return this.f8611i[this.f8607j + i10];
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return j.O(H());
        }
    }

    private interface f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    public interface g extends Iterator {
        byte a();
    }

    static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final m f8609a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f8610b;

        private h(int i10) {
            byte[] bArr = new byte[i10];
            this.f8610b = bArr;
            this.f8609a = m.e0(bArr);
        }

        public j a() {
            this.f8609a.d();
            return new C0112j(this.f8610b);
        }

        public m b() {
            return this.f8609a;
        }

        /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }
    }

    static abstract class i extends j {
        i() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean S(j jVar, int i10, int i11);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return j.super.x();
        }

        /* access modifiers changed from: protected */
        public final int t() {
            return 0;
        }

        /* access modifiers changed from: protected */
        public final boolean v() {
            return true;
        }
    }

    /* renamed from: com.google.protobuf.j$j  reason: collision with other inner class name */
    private static class C0112j extends i {

        /* renamed from: i  reason: collision with root package name */
        protected final byte[] f8611i;

        C0112j(byte[] bArr) {
            bArr.getClass();
            this.f8611i = bArr;
        }

        /* access modifiers changed from: protected */
        public final int A(int i10, int i11, int i12) {
            return c0.i(i10, this.f8611i, U() + i11, i12);
        }

        /* access modifiers changed from: protected */
        public final int C(int i10, int i11, int i12) {
            int U = U() + i11;
            return y1.v(i10, this.f8611i, U, i12 + U);
        }

        public final j F(int i10, int i11) {
            int i12 = j.i(i10, i11, size());
            return i12 == 0 ? j.f8600f : new e(this.f8611i, U() + i10, i12);
        }

        /* access modifiers changed from: protected */
        public final String K(Charset charset) {
            return new String(this.f8611i, U(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        public final void Q(i iVar) {
            iVar.b(this.f8611i, U(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean S(j jVar, int i10, int i11) {
            if (i11 <= jVar.size()) {
                int i12 = i10 + i11;
                if (i12 > jVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + jVar.size());
                } else if (!(jVar instanceof C0112j)) {
                    return jVar.F(i10, i12).equals(F(0, i11));
                } else {
                    C0112j jVar2 = (C0112j) jVar;
                    byte[] bArr = this.f8611i;
                    byte[] bArr2 = jVar2.f8611i;
                    int U = U() + i11;
                    int U2 = U();
                    int U3 = jVar2.U() + i10;
                    while (U2 < U) {
                        if (bArr[U2] != bArr2[U3]) {
                            return false;
                        }
                        U2++;
                        U3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i11 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int U() {
            return 0;
        }

        public final ByteBuffer d() {
            return ByteBuffer.wrap(this.f8611i, U(), size()).asReadOnlyBuffer();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof j) || size() != ((j) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C0112j)) {
                return obj.equals(this);
            }
            C0112j jVar = (C0112j) obj;
            int D = D();
            int D2 = jVar.D();
            if (D == 0 || D2 == 0 || D == D2) {
                return S(jVar, 0, size());
            }
            return false;
        }

        public byte f(int i10) {
            return this.f8611i[i10];
        }

        /* access modifiers changed from: protected */
        public void s(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.f8611i, i10, bArr, i11, i12);
        }

        public int size() {
            return this.f8611i.length;
        }

        /* access modifiers changed from: package-private */
        public byte u(int i10) {
            return this.f8611i[i10];
        }

        public final boolean w() {
            int U = U();
            return y1.t(this.f8611i, U, size() + U);
        }

        public final k z() {
            return k.l(this.f8611i, U(), size(), true);
        }
    }

    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }
    }

    j() {
    }

    /* access modifiers changed from: private */
    public static int I(byte b10) {
        return b10 & 255;
    }

    private String M() {
        if (size() <= 50) {
            return q1.a(this);
        }
        return q1.a(F(0, 47)) + "...";
    }

    static j N(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new b1(byteBuffer);
        }
        return P(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    static j O(byte[] bArr) {
        return new C0112j(bArr);
    }

    static j P(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    private static j e(Iterator it, int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i10)}));
        } else if (i10 == 1) {
            return (j) it.next();
        } else {
            int i11 = i10 >>> 1;
            return e(it, i11).j(e(it, i10 - i11));
        }
    }

    static void h(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return;
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    static int i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        } else if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
        }
    }

    public static j k(Iterable iterable) {
        int i10;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            i10 = 0;
            while (it.hasNext()) {
                it.next();
                i10++;
            }
        } else {
            i10 = ((Collection) iterable).size();
        }
        return i10 == 0 ? f8600f : e(iterable.iterator(), i10);
    }

    public static j l(ByteBuffer byteBuffer) {
        return m(byteBuffer, byteBuffer.remaining());
    }

    public static j m(ByteBuffer byteBuffer, int i10) {
        i(0, i10, byteBuffer.remaining());
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return new C0112j(bArr);
    }

    public static j o(byte[] bArr) {
        return p(bArr, 0, bArr.length);
    }

    public static j p(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new C0112j(f8601g.a(bArr, i10, i11));
    }

    public static j q(String str) {
        return new C0112j(str.getBytes(c0.f8540a));
    }

    static h y(int i10) {
        return new h(i10, (a) null);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public abstract int C(int i10, int i11, int i12);

    /* access modifiers changed from: protected */
    public final int D() {
        return this.f8603e;
    }

    public final j E(int i10) {
        return F(i10, size());
    }

    public abstract j F(int i10, int i11);

    public final byte[] H() {
        int size = size();
        if (size == 0) {
            return c0.f8542c;
        }
        byte[] bArr = new byte[size];
        s(bArr, 0, 0, size);
        return bArr;
    }

    public final String J(Charset charset) {
        return size() == 0 ? "" : K(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String K(Charset charset);

    public final String L() {
        return J(c0.f8540a);
    }

    /* access modifiers changed from: package-private */
    public abstract void Q(i iVar);

    public abstract ByteBuffer d();

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int i10 = this.f8603e;
        if (i10 == 0) {
            int size = size();
            i10 = A(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f8603e = i10;
        }
        return i10;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final j j(j jVar) {
        if (a.e.API_PRIORITY_OTHER - size() >= jVar.size()) {
            return k1.V(this, jVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + jVar.size());
    }

    public final void r(byte[] bArr, int i10, int i11, int i12) {
        i(i10, i10 + i12, size());
        i(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            s(bArr, i10, i11, i12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void s(byte[] bArr, int i10, int i11, int i12);

    public abstract int size();

    /* access modifiers changed from: protected */
    public abstract int t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), M()});
    }

    /* access modifiers changed from: package-private */
    public abstract byte u(int i10);

    /* access modifiers changed from: protected */
    public abstract boolean v();

    public abstract boolean w();

    public g x() {
        return new a();
    }

    public abstract k z();
}
