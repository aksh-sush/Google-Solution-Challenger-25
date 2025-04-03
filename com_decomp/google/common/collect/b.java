package com.google.common.collect;

import java.util.NoSuchElementException;
import l5.j;

public abstract class b extends p0 {

    /* renamed from: e  reason: collision with root package name */
    private C0098b f7520e = C0098b.NOT_READY;

    /* renamed from: f  reason: collision with root package name */
    private Object f7521f;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7522a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.b$b[] r0 = com.google.common.collect.b.C0098b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7522a = r0
                com.google.common.collect.b$b r1 = com.google.common.collect.b.C0098b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7522a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.b$b r1 = com.google.common.collect.b.C0098b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.b.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.b$b  reason: collision with other inner class name */
    private enum C0098b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean d() {
        this.f7520e = C0098b.FAILED;
        this.f7521f = b();
        if (this.f7520e == C0098b.DONE) {
            return false;
        }
        this.f7520e = C0098b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Object b();

    /* access modifiers changed from: protected */
    public final Object c() {
        this.f7520e = C0098b.DONE;
        return null;
    }

    public final boolean hasNext() {
        j.u(this.f7520e != C0098b.FAILED);
        int i10 = a.f7522a[this.f7520e.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.f7520e = C0098b.NOT_READY;
            Object obj = this.f7521f;
            this.f7521f = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
