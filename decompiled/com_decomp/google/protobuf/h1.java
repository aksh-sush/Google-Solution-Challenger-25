package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class h1 extends c implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    private static final h1 f8593h;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f8594f;

    /* renamed from: g  reason: collision with root package name */
    private int f8595g;

    static {
        h1 h1Var = new h1(new Object[0], 0);
        f8593h = h1Var;
        h1Var.c();
    }

    private h1(Object[] objArr, int i10) {
        this.f8594f = objArr;
        this.f8595g = i10;
    }

    private static Object[] d(int i10) {
        return new Object[i10];
    }

    public static h1 e() {
        return f8593h;
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8595g) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8595g;
    }

    public void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8595g)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f8594f;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] d10 = d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f8594f, 0, d10, 0, i10);
            System.arraycopy(this.f8594f, i10, d10, i10 + 1, this.f8595g - i10);
            this.f8594f = d10;
        }
        this.f8594f[i10] = obj;
        this.f8595g++;
        this.modCount++;
    }

    public Object get(int i10) {
        f(i10);
        return this.f8594f[i10];
    }

    /* renamed from: i */
    public h1 a(int i10) {
        if (i10 >= this.f8595g) {
            return new h1(Arrays.copyOf(this.f8594f, i10), this.f8595g);
        }
        throw new IllegalArgumentException();
    }

    public Object remove(int i10) {
        b();
        f(i10);
        Object[] objArr = this.f8594f;
        Object obj = objArr[i10];
        int i11 = this.f8595g;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f8595g--;
        this.modCount++;
        return obj;
    }

    public Object set(int i10, Object obj) {
        b();
        f(i10);
        Object[] objArr = this.f8594f;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f8595g;
    }

    public boolean add(Object obj) {
        b();
        int i10 = this.f8595g;
        Object[] objArr = this.f8594f;
        if (i10 == objArr.length) {
            this.f8594f = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f8594f;
        int i11 = this.f8595g;
        this.f8595g = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }
}
