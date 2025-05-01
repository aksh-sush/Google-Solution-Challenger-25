package com.google.protobuf;

import com.google.protobuf.j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

final class b1 extends j.i {

    /* renamed from: i  reason: collision with root package name */
    private final ByteBuffer f8538i;

    b1(ByteBuffer byteBuffer) {
        c0.b(byteBuffer, "buffer");
        this.f8538i = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer U(int i10, int i11) {
        if (i10 < this.f8538i.position() || i11 > this.f8538i.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
        }
        ByteBuffer slice = this.f8538i.slice();
        slice.position(i10 - this.f8538i.position());
        slice.limit(i11 - this.f8538i.position());
        return slice;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    private Object writeReplace() {
        return j.l(this.f8538i.slice());
    }

    /* access modifiers changed from: protected */
    public int A(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f8538i.get(i13);
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int C(int i10, int i11, int i12) {
        return y1.u(i10, this.f8538i, i11, i12 + i11);
    }

    public j F(int i10, int i11) {
        try {
            return new b1(U(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public String K(Charset charset) {
        int i10;
        int i11;
        byte[] bArr;
        if (this.f8538i.hasArray()) {
            bArr = this.f8538i.array();
            i11 = this.f8538i.arrayOffset() + this.f8538i.position();
            i10 = this.f8538i.remaining();
        } else {
            bArr = H();
            i10 = bArr.length;
            i11 = 0;
        }
        return new String(bArr, i11, i10, charset);
    }

    /* access modifiers changed from: package-private */
    public void Q(i iVar) {
        iVar.a(this.f8538i.slice());
    }

    /* access modifiers changed from: package-private */
    public boolean S(j jVar, int i10, int i11) {
        return F(0, i11).equals(jVar.F(i10, i11 + i10));
    }

    public ByteBuffer d() {
        return this.f8538i.asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (size() != jVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof b1 ? this.f8538i.equals(((b1) obj).f8538i) : obj instanceof k1 ? obj.equals(this) : this.f8538i.equals(jVar.d());
    }

    public byte f(int i10) {
        try {
            return this.f8538i.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void s(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer slice = this.f8538i.slice();
        slice.position(i10);
        slice.get(bArr, i11, i12);
    }

    public int size() {
        return this.f8538i.remaining();
    }

    public byte u(int i10) {
        return f(i10);
    }

    public boolean w() {
        return y1.r(this.f8538i);
    }

    public k z() {
        return k.i(this.f8538i, true);
    }
}
