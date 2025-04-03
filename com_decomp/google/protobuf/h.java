package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class h extends c implements c0.a, RandomAccess, e1 {

    /* renamed from: h  reason: collision with root package name */
    private static final h f8587h;

    /* renamed from: f  reason: collision with root package name */
    private boolean[] f8588f;

    /* renamed from: g  reason: collision with root package name */
    private int f8589g;

    static {
        h hVar = new h(new boolean[0], 0);
        f8587h = hVar;
        hVar.c();
    }

    private h(boolean[] zArr, int i10) {
        this.f8588f = zArr;
        this.f8589g = i10;
    }

    private void f(int i10, boolean z10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8589g)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        boolean[] zArr = this.f8588f;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f8588f, i10, zArr2, i10 + 1, this.f8589g - i10);
            this.f8588f = zArr2;
        }
        this.f8588f[i10] = z10;
        this.f8589g++;
        this.modCount++;
    }

    public static h i() {
        return f8587h;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f8589g) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8589g;
    }

    public c0.a a(int i10) {
        if (i10 >= this.f8589g) {
            return new h(Arrays.copyOf(this.f8588f, i10), this.f8589g);
        }
        throw new IllegalArgumentException();
    }

    public boolean addAll(Collection collection) {
        b();
        c0.a(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i10 = hVar.f8589g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8589g;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f8588f;
            if (i12 > zArr.length) {
                this.f8588f = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(hVar.f8588f, 0, this.f8588f, this.f8589g, hVar.f8589g);
            this.f8589g = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i10, Boolean bool) {
        f(i10, bool.booleanValue());
    }

    /* renamed from: e */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f8589g != hVar.f8589g) {
            return false;
        }
        boolean[] zArr = hVar.f8588f;
        for (int i10 = 0; i10 < this.f8589g; i10++) {
            if (this.f8588f[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void h(boolean z10) {
        b();
        int i10 = this.f8589g;
        boolean[] zArr = this.f8588f;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f8588f = zArr2;
        }
        boolean[] zArr3 = this.f8588f;
        int i11 = this.f8589g;
        this.f8589g = i11 + 1;
        zArr3[i11] = z10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8589g; i11++) {
            i10 = (i10 * 31) + c0.c(this.f8588f[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f8588f[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Boolean get(int i10) {
        return Boolean.valueOf(l(i10));
    }

    public boolean l(int i10) {
        j(i10);
        return this.f8588f[i10];
    }

    /* renamed from: o */
    public Boolean remove(int i10) {
        b();
        j(i10);
        boolean[] zArr = this.f8588f;
        boolean z10 = zArr[i10];
        int i11 = this.f8589g;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f8589g--;
        this.modCount++;
        return Boolean.valueOf(z10);
    }

    /* renamed from: p */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(q(i10, bool.booleanValue()));
    }

    public boolean q(int i10, boolean z10) {
        b();
        j(i10);
        boolean[] zArr = this.f8588f;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            boolean[] zArr = this.f8588f;
            System.arraycopy(zArr, i11, zArr, i10, this.f8589g - i11);
            this.f8589g -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f8589g;
    }
}
