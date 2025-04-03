package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.s;
import java.lang.ref.WeakReference;
import q3.b;

final class k0 implements c.C0088c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f5421a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5422b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5423c;

    public k0(v0 v0Var, a aVar, boolean z10) {
        this.f5421a = new WeakReference(v0Var);
        this.f5422b = aVar;
        this.f5423c = z10;
    }

    public final void b(b bVar) {
        v0 v0Var = (v0) this.f5421a.get();
        if (v0Var != null) {
            s.o(Looper.myLooper() == v0Var.f5508a.f5367n.k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            v0Var.f5509b.lock();
            try {
                if (v0Var.o(0)) {
                    if (!bVar.j0()) {
                        v0Var.m(bVar, this.f5422b, this.f5423c);
                    }
                    if (v0Var.p()) {
                        v0Var.n();
                    }
                }
            } finally {
                v0Var.f5509b.unlock();
            }
        }
    }
}
