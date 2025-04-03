package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.s;
import java.util.Set;
import q3.b;

public final class i0 implements c1 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f1 f5407a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5408b = false;

    public i0(f1 f1Var) {
        this.f5407a = f1Var;
    }

    public final void a(Bundle bundle) {
    }

    public final void b(int i10) {
        this.f5407a.o((b) null);
        this.f5407a.f5368o.c(i10, this.f5408b);
    }

    public final void c() {
    }

    public final void d() {
        if (this.f5408b) {
            this.f5408b = false;
            this.f5407a.p(new h0(this, this));
        }
    }

    public final void e(b bVar, a aVar, boolean z10) {
    }

    public final e f(e eVar) {
        h(eVar);
        return eVar;
    }

    public final boolean g() {
        if (this.f5408b) {
            return false;
        }
        Set<l2> set = this.f5407a.f5367n.f5324w;
        if (set == null || set.isEmpty()) {
            this.f5407a.o((b) null);
            return true;
        }
        this.f5408b = true;
        for (l2 f10 : set) {
            f10.f();
        }
        return false;
    }

    public final e h(e eVar) {
        try {
            this.f5407a.f5367n.f5325x.a(eVar);
            b1 b1Var = this.f5407a.f5367n;
            a.f fVar = (a.f) b1Var.f5316o.get(eVar.getClientKey());
            s.l(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f5407a.f5360g.containsKey(eVar.getClientKey())) {
                eVar.run(fVar);
            } else {
                eVar.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f5407a.p(new g0(this, this));
        }
        return eVar;
    }
}
