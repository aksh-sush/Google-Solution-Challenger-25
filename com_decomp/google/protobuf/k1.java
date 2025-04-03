package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.j;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class k1 extends j {

    /* renamed from: n  reason: collision with root package name */
    static final int[] f8650n = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};

    /* renamed from: i  reason: collision with root package name */
    private final int f8651i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final j f8652j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final j f8653k;

    /* renamed from: l  reason: collision with root package name */
    private final int f8654l;

    /* renamed from: m  reason: collision with root package name */
    private final int f8655m;

    class a extends j.c {

        /* renamed from: e  reason: collision with root package name */
        final c f8656e;

        /* renamed from: f  reason: collision with root package name */
        j.g f8657f = c();

        a() {
            this.f8656e = new c(k1.this, (a) null);
        }

        private j.g c() {
            if (this.f8656e.hasNext()) {
                return this.f8656e.next().x();
            }
            return null;
        }

        public byte a() {
            j.g gVar = this.f8657f;
            if (gVar != null) {
                byte a10 = gVar.a();
                if (!this.f8657f.hasNext()) {
                    this.f8657f = c();
                }
                return a10;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f8657f != null;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayDeque f8659a;

        private b() {
            this.f8659a = new ArrayDeque();
        }

        /* access modifiers changed from: private */
        public j b(j jVar, j jVar2) {
            c(jVar);
            c(jVar2);
            j jVar3 = (j) this.f8659a.pop();
            while (!this.f8659a.isEmpty()) {
                jVar3 = new k1((j) this.f8659a.pop(), jVar3, (a) null);
            }
            return jVar3;
        }

        private void c(j jVar) {
            if (jVar.v()) {
                e(jVar);
            } else if (jVar instanceof k1) {
                k1 k1Var = (k1) jVar;
                c(k1Var.f8652j);
                c(k1Var.f8653k);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + jVar.getClass());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(k1.f8650n, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(j jVar) {
            int d10 = d(jVar.size());
            int Y = k1.Y(d10 + 1);
            if (this.f8659a.isEmpty() || ((j) this.f8659a.peek()).size() >= Y) {
                this.f8659a.push(jVar);
                return;
            }
            int Y2 = k1.Y(d10);
            j jVar2 = (j) this.f8659a.pop();
            while (!this.f8659a.isEmpty() && ((j) this.f8659a.peek()).size() < Y2) {
                jVar2 = new k1((j) this.f8659a.pop(), jVar2, (a) null);
            }
            k1 k1Var = new k1(jVar2, jVar, (a) null);
            while (!this.f8659a.isEmpty() && ((j) this.f8659a.peek()).size() < k1.Y(d(k1Var.size()) + 1)) {
                k1Var = new k1((j) this.f8659a.pop(), k1Var, (a) null);
            }
            this.f8659a.push(k1Var);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    private static final class c implements Iterator {

        /* renamed from: e  reason: collision with root package name */
        private final ArrayDeque f8660e;

        /* renamed from: f  reason: collision with root package name */
        private j.i f8661f;

        private c(j jVar) {
            j.i iVar;
            if (jVar instanceof k1) {
                k1 k1Var = (k1) jVar;
                ArrayDeque arrayDeque = new ArrayDeque(k1Var.t());
                this.f8660e = arrayDeque;
                arrayDeque.push(k1Var);
                iVar = b(k1Var.f8652j);
            } else {
                this.f8660e = null;
                iVar = (j.i) jVar;
            }
            this.f8661f = iVar;
        }

        private j.i b(j jVar) {
            while (jVar instanceof k1) {
                k1 k1Var = (k1) jVar;
                this.f8660e.push(k1Var);
                jVar = k1Var.f8652j;
            }
            return (j.i) jVar;
        }

        private j.i c() {
            j.i b10;
            do {
                ArrayDeque arrayDeque = this.f8660e;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                b10 = b(((k1) this.f8660e.pop()).f8653k);
            } while (b10.isEmpty());
            return b10;
        }

        /* renamed from: d */
        public j.i next() {
            j.i iVar = this.f8661f;
            if (iVar != null) {
                this.f8661f = c();
                return iVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f8661f != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ c(j jVar, a aVar) {
            this(jVar);
        }
    }

    private class d extends InputStream {

        /* renamed from: e  reason: collision with root package name */
        private c f8662e;

        /* renamed from: f  reason: collision with root package name */
        private j.i f8663f;

        /* renamed from: g  reason: collision with root package name */
        private int f8664g;

        /* renamed from: h  reason: collision with root package name */
        private int f8665h;

        /* renamed from: i  reason: collision with root package name */
        private int f8666i;

        /* renamed from: j  reason: collision with root package name */
        private int f8667j;

        public d() {
            g();
        }

        private void a() {
            int i10;
            if (this.f8663f != null && this.f8665h == (i10 = this.f8664g)) {
                this.f8666i += i10;
                int i11 = 0;
                this.f8665h = 0;
                if (this.f8662e.hasNext()) {
                    j.i d10 = this.f8662e.next();
                    this.f8663f = d10;
                    i11 = d10.size();
                } else {
                    this.f8663f = null;
                }
                this.f8664g = i11;
            }
        }

        private int c() {
            return k1.this.size() - (this.f8666i + this.f8665h);
        }

        private void g() {
            c cVar = new c(k1.this, (a) null);
            this.f8662e = cVar;
            j.i d10 = cVar.next();
            this.f8663f = d10;
            this.f8664g = d10.size();
            this.f8665h = 0;
            this.f8666i = 0;
        }

        private int h(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (i12 > 0) {
                a();
                if (this.f8663f == null) {
                    break;
                }
                int min = Math.min(this.f8664g - this.f8665h, i12);
                if (bArr != null) {
                    this.f8663f.r(bArr, this.f8665h, i10, min);
                    i10 += min;
                }
                this.f8665h += min;
                i12 -= min;
            }
            return i11 - i12;
        }

        public int available() {
            return c();
        }

        public void mark(int i10) {
            this.f8667j = this.f8666i + this.f8665h;
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            a();
            j.i iVar = this.f8663f;
            if (iVar == null) {
                return -1;
            }
            int i10 = this.f8665h;
            this.f8665h = i10 + 1;
            return iVar.f(i10) & 255;
        }

        public synchronized void reset() {
            g();
            h((byte[]) null, 0, this.f8667j);
        }

        public long skip(long j10) {
            if (j10 >= 0) {
                if (j10 > 2147483647L) {
                    j10 = 2147483647L;
                }
                return (long) h((byte[]) null, 0, (int) j10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            int h10 = h(bArr, i10, i11);
            if (h10 != 0) {
                return h10;
            }
            if (i11 > 0 || c() == 0) {
                return -1;
            }
            return h10;
        }
    }

    private k1(j jVar, j jVar2) {
        this.f8652j = jVar;
        this.f8653k = jVar2;
        int size = jVar.size();
        this.f8654l = size;
        this.f8651i = size + jVar2.size();
        this.f8655m = Math.max(jVar.t(), jVar2.t()) + 1;
    }

    static j V(j jVar, j jVar2) {
        if (jVar2.size() == 0) {
            return jVar;
        }
        if (jVar.size() == 0) {
            return jVar2;
        }
        int size = jVar.size() + jVar2.size();
        if (size < 128) {
            return W(jVar, jVar2);
        }
        if (jVar instanceof k1) {
            k1 k1Var = (k1) jVar;
            if (k1Var.f8653k.size() + jVar2.size() < 128) {
                return new k1(k1Var.f8652j, W(k1Var.f8653k, jVar2));
            } else if (k1Var.f8652j.t() > k1Var.f8653k.t() && k1Var.t() > jVar2.t()) {
                return new k1(k1Var.f8652j, new k1(k1Var.f8653k, jVar2));
            }
        }
        return size >= Y(Math.max(jVar.t(), jVar2.t()) + 1) ? new k1(jVar, jVar2) : new b((a) null).b(jVar, jVar2);
    }

    private static j W(j jVar, j jVar2) {
        int size = jVar.size();
        int size2 = jVar2.size();
        byte[] bArr = new byte[(size + size2)];
        jVar.r(bArr, 0, 0, size);
        jVar2.r(bArr, 0, size, size2);
        return j.O(bArr);
    }

    private boolean X(j jVar) {
        c cVar = new c(this, (a) null);
        j.i iVar = (j.i) cVar.next();
        c cVar2 = new c(jVar, (a) null);
        j.i iVar2 = (j.i) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = iVar.size() - i10;
            int size2 = iVar2.size() - i11;
            int min = Math.min(size, size2);
            if (!(i10 == 0 ? iVar.S(iVar2, i11, min) : iVar2.S(iVar, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f8651i;
            if (i12 < i13) {
                if (min == size) {
                    iVar = (j.i) cVar.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == size2) {
                    iVar2 = (j.i) cVar2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    static int Y(int i10) {
        int[] iArr = f8650n;
        return i10 >= iArr.length ? a.e.API_PRIORITY_OTHER : iArr[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* access modifiers changed from: protected */
    public int A(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f8654l;
        if (i13 <= i14) {
            return this.f8652j.A(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f8653k.A(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f8653k.A(this.f8652j.A(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public int C(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f8654l;
        if (i13 <= i14) {
            return this.f8652j.C(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f8653k.C(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f8653k.C(this.f8652j.C(i10, i11, i15), 0, i12 - i15);
    }

    public j F(int i10, int i11) {
        int i12 = j.i(i10, i11, this.f8651i);
        if (i12 == 0) {
            return j.f8600f;
        }
        if (i12 == this.f8651i) {
            return this;
        }
        int i13 = this.f8654l;
        if (i11 <= i13) {
            return this.f8652j.F(i10, i11);
        }
        return i10 >= i13 ? this.f8653k.F(i10 - i13, i11 - i13) : new k1(this.f8652j.E(i10), this.f8653k.F(0, i11 - this.f8654l));
    }

    /* access modifiers changed from: protected */
    public String K(Charset charset) {
        return new String(H(), charset);
    }

    /* access modifiers changed from: package-private */
    public void Q(i iVar) {
        this.f8652j.Q(iVar);
        this.f8653k.Q(iVar);
    }

    public ByteBuffer d() {
        return ByteBuffer.wrap(H()).asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f8651i != jVar.size()) {
            return false;
        }
        if (this.f8651i == 0) {
            return true;
        }
        int D = D();
        int D2 = jVar.D();
        if (D == 0 || D2 == 0 || D == D2) {
            return X(jVar);
        }
        return false;
    }

    public byte f(int i10) {
        j.h(i10, this.f8651i);
        return u(i10);
    }

    /* access modifiers changed from: protected */
    public void s(byte[] bArr, int i10, int i11, int i12) {
        j jVar;
        int i13 = i10 + i12;
        int i14 = this.f8654l;
        if (i13 <= i14) {
            jVar = this.f8652j;
        } else if (i10 >= i14) {
            jVar = this.f8653k;
            i10 -= i14;
        } else {
            int i15 = i14 - i10;
            this.f8652j.s(bArr, i10, i11, i15);
            this.f8653k.s(bArr, 0, i11 + i15, i12 - i15);
            return;
        }
        jVar.s(bArr, i10, i11, i12);
    }

    public int size() {
        return this.f8651i;
    }

    /* access modifiers changed from: protected */
    public int t() {
        return this.f8655m;
    }

    /* access modifiers changed from: package-private */
    public byte u(int i10) {
        int i11 = this.f8654l;
        return i10 < i11 ? this.f8652j.u(i10) : this.f8653k.u(i10 - i11);
    }

    /* access modifiers changed from: protected */
    public boolean v() {
        return this.f8651i >= Y(this.f8655m);
    }

    public boolean w() {
        int C = this.f8652j.C(0, 0, this.f8654l);
        j jVar = this.f8653k;
        return jVar.C(C, 0, jVar.size()) == 0;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return j.O(H());
    }

    /* renamed from: x */
    public j.g iterator() {
        return new a();
    }

    public k z() {
        return k.f(new d());
    }

    /* synthetic */ k1(j jVar, j jVar2, a aVar) {
        this(jVar, jVar2);
    }
}
