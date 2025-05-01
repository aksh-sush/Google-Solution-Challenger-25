package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.s;
import h4.a;
import java.util.concurrent.Callable;

final class s8 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i9 f6406a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w8 f6407b;

    s8(w8 w8Var, i9 i9Var) {
        this.f6407b = w8Var;
        this.f6406a = i9Var;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (this.f6407b.U((String) s.k(this.f6406a.f6059e)).k() && a.b(this.f6406a.f6080z).k()) {
            return this.f6407b.R(this.f6406a).f0();
        }
        this.f6407b.d().v().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
