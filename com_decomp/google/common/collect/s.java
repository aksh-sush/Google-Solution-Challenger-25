package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import l5.j;

public abstract class s extends l implements Set {

    /* renamed from: f  reason: collision with root package name */
    private transient n f7648f;

    private static class a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        final Object[] f7649e;

        a(Object[] objArr) {
            this.f7649e = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return s.o(this.f7649e);
        }
    }

    s() {
    }

    static int k(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        j.e(z10, "collection too large");
        return 1073741824;
    }

    private static s l(int i10, Object... objArr) {
        if (i10 == 0) {
            return r();
        }
        if (i10 == 1) {
            return s(objArr[0]);
        }
        int k10 = k(i10);
        Object[] objArr2 = new Object[k10];
        int i11 = k10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object a10 = b0.a(objArr[i14], i14);
            int hashCode = a10.hashCode();
            int a11 = k.a(hashCode);
            while (true) {
                int i15 = a11 & i11;
                Object obj = objArr2[i15];
                if (obj == null) {
                    objArr[i13] = a10;
                    objArr2[i15] = a10;
                    i12 += hashCode;
                    i13++;
                    break;
                } else if (obj.equals(a10)) {
                    break;
                } else {
                    a11++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            return new j0(objArr[0], i12);
        }
        if (k(i13) < k10 / 2) {
            return l(i13, objArr);
        }
        if (t(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new g0(objArr, i12, objArr2, i11, i13);
    }

    public static s m(Collection collection) {
        if ((collection instanceof s) && !(collection instanceof SortedSet)) {
            s sVar = (s) collection;
            if (!sVar.i()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static s o(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? l(objArr.length, (Object[]) objArr.clone()) : s(objArr[0]);
        }
        return r();
    }

    public static s r() {
        return g0.f7570l;
    }

    public static s s(Object obj) {
        return new j0(obj);
    }

    private static boolean t(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public n b() {
        n nVar = this.f7648f;
        if (nVar != null) {
            return nVar;
        }
        n p10 = p();
        this.f7648f = p10;
        return p10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || !q() || !((s) obj).q() || hashCode() == obj.hashCode()) {
            return i0.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return i0.b(this);
    }

    public abstract p0 j();

    /* access modifiers changed from: package-private */
    public n p() {
        return n.k(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new a(toArray());
    }
}
