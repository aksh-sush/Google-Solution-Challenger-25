package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class o extends c implements c0.b, RandomAccess, e1 {

    /* renamed from: h  reason: collision with root package name */
    private static final o f8705h;

    /* renamed from: f  reason: collision with root package name */
    private double[] f8706f;

    /* renamed from: g  reason: collision with root package name */
    private int f8707g;

    static {
        o oVar = new o(new double[0], 0);
        f8705h = oVar;
        oVar.c();
    }

    private o(double[] dArr, int i10) {
        this.f8706f = dArr;
        this.f8707g = i10;
    }

    private void h(int i10, double d10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8707g)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        double[] dArr = this.f8706f;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f8706f, i10, dArr2, i10 + 1, this.f8707g - i10);
            this.f8706f = dArr2;
        }
        this.f8706f[i10] = d10;
        this.f8707g++;
        this.modCount++;
    }

    public static o i() {
        return f8705h;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f8707g) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8707g;
    }

    public c0.b a(int i10) {
        if (i10 >= this.f8707g) {
            return new o(Arrays.copyOf(this.f8706f, i10), this.f8707g);
        }
        throw new IllegalArgumentException();
    }

    public boolean addAll(Collection collection) {
        b();
        c0.a(collection);
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int i10 = oVar.f8707g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8707g;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f8706f;
            if (i12 > dArr.length) {
                this.f8706f = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(oVar.f8706f, 0, this.f8706f, this.f8707g, oVar.f8707g);
            this.f8707g = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i10, Double d10) {
        h(i10, d10.doubleValue());
    }

    /* renamed from: e */
    public boolean add(Double d10) {
        f(d10.doubleValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.f8707g != oVar.f8707g) {
            return false;
        }
        double[] dArr = oVar.f8706f;
        for (int i10 = 0; i10 < this.f8707g; i10++) {
            if (Double.doubleToLongBits(this.f8706f[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public void f(double d10) {
        b();
        int i10 = this.f8707g;
        double[] dArr = this.f8706f;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f8706f = dArr2;
        }
        double[] dArr3 = this.f8706f;
        int i11 = this.f8707g;
        this.f8707g = i11 + 1;
        dArr3[i11] = d10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8707g; i11++) {
            i10 = (i10 * 31) + c0.f(Double.doubleToLongBits(this.f8706f[i11]));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f8706f[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Double get(int i10) {
        return Double.valueOf(l(i10));
    }

    public double l(int i10) {
        j(i10);
        return this.f8706f[i10];
    }

    /* renamed from: o */
    public Double remove(int i10) {
        b();
        j(i10);
        double[] dArr = this.f8706f;
        double d10 = dArr[i10];
        int i11 = this.f8707g;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f8707g--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: p */
    public Double set(int i10, Double d10) {
        return Double.valueOf(q(i10, d10.doubleValue()));
    }

    public double q(int i10, double d10) {
        b();
        j(i10);
        double[] dArr = this.f8706f;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            double[] dArr = this.f8706f;
            System.arraycopy(dArr, i11, dArr, i10, this.f8707g - i11);
            this.f8707g -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f8707g;
    }
}
