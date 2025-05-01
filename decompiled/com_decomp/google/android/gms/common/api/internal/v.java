package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;
import n4.j;
import q3.d;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private final d[] f5501a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5502b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5503c;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public r f5504a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5505b = true;

        /* renamed from: c  reason: collision with root package name */
        private d[] f5506c;

        /* renamed from: d  reason: collision with root package name */
        private int f5507d = 0;

        /* synthetic */ a(i2 i2Var) {
        }

        public v a() {
            s.b(this.f5504a != null, "execute parameter required");
            return new h2(this, this.f5506c, this.f5505b, this.f5507d);
        }

        public a b(r rVar) {
            this.f5504a = rVar;
            return this;
        }

        public a c(boolean z10) {
            this.f5505b = z10;
            return this;
        }

        public a d(d... dVarArr) {
            this.f5506c = dVarArr;
            return this;
        }

        public a e(int i10) {
            this.f5507d = i10;
            return this;
        }
    }

    protected v(d[] dVarArr, boolean z10, int i10) {
        this.f5501a = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f5502b = z11;
        this.f5503c = i10;
    }

    public static a a() {
        return new a((i2) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(a.b bVar, j jVar);

    public boolean c() {
        return this.f5502b;
    }

    public final int d() {
        return this.f5503c;
    }

    public final d[] e() {
        return this.f5501a;
    }
}
