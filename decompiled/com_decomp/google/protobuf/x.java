package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class x extends c implements c0.f, RandomAccess, e1 {

    /* renamed from: h  reason: collision with root package name */
    private static final x f8823h;

    /* renamed from: f  reason: collision with root package name */
    private float[] f8824f;

    /* renamed from: g  reason: collision with root package name */
    private int f8825g;

    static {
        x xVar = new x(new float[0], 0);
        f8823h = xVar;
        xVar.c();
    }

    private x(float[] fArr, int i10) {
        this.f8824f = fArr;
        this.f8825g = i10;
    }

    private void h(int i10, float f10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8825g)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        float[] fArr = this.f8824f;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f8824f, i10, fArr2, i10 + 1, this.f8825g - i10);
            this.f8824f = fArr2;
        }
        this.f8824f[i10] = f10;
        this.f8825g++;
        this.modCount++;
    }

    public static x i() {
        return f8823h;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f8825g) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8825g;
    }

    public c0.f a(int i10) {
        if (i10 >= this.f8825g) {
            return new x(Arrays.copyOf(this.f8824f, i10), this.f8825g);
        }
        throw new IllegalArgumentException();
    }

    public boolean addAll(Collection collection) {
        b();
        c0.a(collection);
        if (!(collection instanceof x)) {
            return super.addAll(collection);
        }
        x xVar = (x) collection;
        int i10 = xVar.f8825g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8825g;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f8824f;
            if (i12 > fArr.length) {
                this.f8824f = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(xVar.f8824f, 0, this.f8824f, this.f8825g, xVar.f8825g);
            this.f8825g = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i10, Float f10) {
        h(i10, f10.floatValue());
    }

    /* renamed from: e */
    public boolean add(Float f10) {
        f(f10.floatValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return super.equals(obj);
        }
        x xVar = (x) obj;
        if (this.f8825g != xVar.f8825g) {
            return false;
        }
        float[] fArr = xVar.f8824f;
        for (int i10 = 0; i10 < this.f8825g; i10++) {
            if (Float.floatToIntBits(this.f8824f[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(float f10) {
        b();
        int i10 = this.f8825g;
        float[] fArr = this.f8824f;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f8824f = fArr2;
        }
        float[] fArr3 = this.f8824f;
        int i11 = this.f8825g;
        this.f8825g = i11 + 1;
        fArr3[i11] = f10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8825g; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f8824f[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f8824f[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Float get(int i10) {
        return Float.valueOf(l(i10));
    }

    public float l(int i10) {
        j(i10);
        return this.f8824f[i10];
    }

    /* renamed from: o */
    public Float remove(int i10) {
        b();
        j(i10);
        float[] fArr = this.f8824f;
        float f10 = fArr[i10];
        int i11 = this.f8825g;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8825g--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: p */
    public Float set(int i10, Float f10) {
        return Float.valueOf(q(i10, f10.floatValue()));
    }

    public float q(int i10, float f10) {
        b();
        j(i10);
        float[] fArr = this.f8824f;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            float[] fArr = this.f8824f;
            System.arraycopy(fArr, i11, fArr, i10, this.f8825g - i11);
            this.f8825g -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f8825g;
    }
}
