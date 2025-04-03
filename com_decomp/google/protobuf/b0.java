package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class b0 extends c implements c0.g, RandomAccess, e1 {

    /* renamed from: h  reason: collision with root package name */
    private static final b0 f8535h;

    /* renamed from: f  reason: collision with root package name */
    private int[] f8536f;

    /* renamed from: g  reason: collision with root package name */
    private int f8537g;

    static {
        b0 b0Var = new b0(new int[0], 0);
        f8535h = b0Var;
        b0Var.c();
    }

    private b0(int[] iArr, int i10) {
        this.f8536f = iArr;
        this.f8537g = i10;
    }

    private void h(int i10, int i11) {
        int i12;
        b();
        if (i10 < 0 || i10 > (i12 = this.f8537g)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int[] iArr = this.f8536f;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f8536f, i10, iArr2, i10 + 1, this.f8537g - i10);
            this.f8536f = iArr2;
        }
        this.f8536f[i10] = i11;
        this.f8537g++;
        this.modCount++;
    }

    public static b0 i() {
        return f8535h;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f8537g) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8537g;
    }

    public c0.g a(int i10) {
        if (i10 >= this.f8537g) {
            return new b0(Arrays.copyOf(this.f8536f, i10), this.f8537g);
        }
        throw new IllegalArgumentException();
    }

    public boolean addAll(Collection collection) {
        b();
        c0.a(collection);
        if (!(collection instanceof b0)) {
            return super.addAll(collection);
        }
        b0 b0Var = (b0) collection;
        int i10 = b0Var.f8537g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8537g;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f8536f;
            if (i12 > iArr.length) {
                this.f8536f = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(b0Var.f8536f, 0, this.f8536f, this.f8537g, b0Var.f8537g);
            this.f8537g = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i10, Integer num) {
        h(i10, num.intValue());
    }

    /* renamed from: e */
    public boolean add(Integer num) {
        f(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        if (this.f8537g != b0Var.f8537g) {
            return false;
        }
        int[] iArr = b0Var.f8536f;
        for (int i10 = 0; i10 < this.f8537g; i10++) {
            if (this.f8536f[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void f(int i10) {
        b();
        int i11 = this.f8537g;
        int[] iArr = this.f8536f;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f8536f = iArr2;
        }
        int[] iArr3 = this.f8536f;
        int i12 = this.f8537g;
        this.f8537g = i12 + 1;
        iArr3[i12] = i10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8537g; i11++) {
            i10 = (i10 * 31) + this.f8536f[i11];
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f8536f[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Integer get(int i10) {
        return Integer.valueOf(l(i10));
    }

    public int l(int i10) {
        j(i10);
        return this.f8536f[i10];
    }

    /* renamed from: o */
    public Integer remove(int i10) {
        b();
        j(i10);
        int[] iArr = this.f8536f;
        int i11 = iArr[i10];
        int i12 = this.f8537g;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f8537g--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* renamed from: p */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(q(i10, num.intValue()));
    }

    public int q(int i10, int i11) {
        b();
        j(i10);
        int[] iArr = this.f8536f;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f8536f;
            System.arraycopy(iArr, i11, iArr, i10, this.f8537g - i11);
            this.f8537g -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f8537g;
    }
}
