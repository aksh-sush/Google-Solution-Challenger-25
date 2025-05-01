package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.n;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import l5.j;

public abstract class l extends AbstractCollection implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f7605e = new Object[0];

    static abstract class a extends b {

        /* renamed from: a  reason: collision with root package name */
        Object[] f7606a;

        /* renamed from: b  reason: collision with root package name */
        int f7607b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f7608c;

        a(int i10) {
            g.b(i10, "initialCapacity");
            this.f7606a = new Object[i10];
        }

        private void e(int i10) {
            Object[] objArr = this.f7606a;
            if (objArr.length < i10) {
                this.f7606a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
            } else if (this.f7608c) {
                this.f7606a = (Object[]) objArr.clone();
            } else {
                return;
            }
            this.f7608c = false;
        }

        public a d(Object obj) {
            j.o(obj);
            e(this.f7607b + 1);
            Object[] objArr = this.f7606a;
            int i10 = this.f7607b;
            this.f7607b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }
    }

    public static abstract class b {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b a(Object obj);

        public b b(Iterator it) {
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    l() {
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public abstract n b();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        p0 j10 = j();
        while (j10.hasNext()) {
            objArr[i10] = j10.next();
            i10++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Object[] e() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    public abstract p0 j();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f7605e);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new n.c(toArray());
    }

    public final Object[] toArray(Object[] objArr) {
        j.o(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] e10 = e();
            if (e10 != null) {
                return d0.a(e10, h(), f(), objArr);
            }
            objArr = b0.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
