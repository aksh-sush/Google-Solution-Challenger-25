package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class k0 extends c implements c0.h, RandomAccess, e1 {

    /* renamed from: h  reason: collision with root package name */
    private static final k0 f8647h;

    /* renamed from: f  reason: collision with root package name */
    private long[] f8648f;

    /* renamed from: g  reason: collision with root package name */
    private int f8649g;

    static {
        k0 k0Var = new k0(new long[0], 0);
        f8647h = k0Var;
        k0Var.c();
    }

    private k0(long[] jArr, int i10) {
        this.f8648f = jArr;
        this.f8649g = i10;
    }

    private void f(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f8649g)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        long[] jArr = this.f8648f;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f8648f, i10, jArr2, i10 + 1, this.f8649g - i10);
            this.f8648f = jArr2;
        }
        this.f8648f[i10] = j10;
        this.f8649g++;
        this.modCount++;
    }

    public static k0 i() {
        return f8647h;
    }

    private void j(int i10) {
        if (i10 < 0 || i10 >= this.f8649g) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8649g;
    }

    public c0.h a(int i10) {
        if (i10 >= this.f8649g) {
            return new k0(Arrays.copyOf(this.f8648f, i10), this.f8649g);
        }
        throw new IllegalArgumentException();
    }

    public boolean addAll(Collection collection) {
        b();
        c0.a(collection);
        if (!(collection instanceof k0)) {
            return super.addAll(collection);
        }
        k0 k0Var = (k0) collection;
        int i10 = k0Var.f8649g;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8649g;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f8648f;
            if (i12 > jArr.length) {
                this.f8648f = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(k0Var.f8648f, 0, this.f8648f, this.f8649g, k0Var.f8649g);
            this.f8649g = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i10, Long l10) {
        f(i10, l10.longValue());
    }

    /* renamed from: e */
    public boolean add(Long l10) {
        h(l10.longValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        if (this.f8649g != k0Var.f8649g) {
            return false;
        }
        long[] jArr = k0Var.f8648f;
        for (int i10 = 0; i10 < this.f8649g; i10++) {
            if (this.f8648f[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public void h(long j10) {
        b();
        int i10 = this.f8649g;
        long[] jArr = this.f8648f;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f8648f = jArr2;
        }
        long[] jArr3 = this.f8648f;
        int i11 = this.f8649g;
        this.f8649g = i11 + 1;
        jArr3[i11] = j10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8649g; i11++) {
            i10 = (i10 * 31) + c0.f(this.f8648f[i11]);
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f8648f[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Long get(int i10) {
        return Long.valueOf(l(i10));
    }

    public long l(int i10) {
        j(i10);
        return this.f8648f[i10];
    }

    /* renamed from: o */
    public Long remove(int i10) {
        b();
        j(i10);
        long[] jArr = this.f8648f;
        long j10 = jArr[i10];
        int i11 = this.f8649g;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f8649g--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: p */
    public Long set(int i10, Long l10) {
        return Long.valueOf(q(i10, l10.longValue()));
    }

    public long q(int i10, long j10) {
        b();
        j(i10);
        long[] jArr = this.f8648f;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f8648f;
            System.arraycopy(jArr, i11, jArr, i10, this.f8649g - i11);
            this.f8649g -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f8649g;
    }
}
