package com.google.common.collect;

abstract class u extends s {

    class a extends n {
        a() {
        }

        public Object get(int i10) {
            return u.this.get(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return u.this.i();
        }

        public int size() {
            return u.this.size();
        }
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public int d(Object[] objArr, int i10) {
        return b().d(objArr, i10);
    }

    /* access modifiers changed from: package-private */
    public abstract Object get(int i10);

    /* renamed from: j */
    public p0 iterator() {
        return b().iterator();
    }

    /* access modifiers changed from: package-private */
    public n p() {
        return new a();
    }
}
