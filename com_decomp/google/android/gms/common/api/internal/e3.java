package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import q3.b;

final class e3 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f5352a;

    /* synthetic */ e3(z zVar, d3 d3Var) {
        this.f5352a = zVar;
    }

    public final void a(b bVar) {
        this.f5352a.f5553m.lock();
        try {
            this.f5352a.f5550j = bVar;
            z.y(this.f5352a);
        } finally {
            this.f5352a.f5553m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f5352a.f5553m.lock();
        try {
            z.x(this.f5352a, bundle);
            this.f5352a.f5550j = b.f14642i;
            z.y(this.f5352a);
        } finally {
            this.f5352a.f5553m.unlock();
        }
    }

    public final void c(int i10, boolean z10) {
        this.f5352a.f5553m.lock();
        try {
            z zVar = this.f5352a;
            if (!zVar.f5552l && zVar.f5551k != null) {
                if (zVar.f5551k.j0()) {
                    this.f5352a.f5552l = true;
                    this.f5352a.f5545e.onConnectionSuspended(i10);
                }
            }
            this.f5352a.f5552l = false;
            z.w(this.f5352a, i10, z10);
        } finally {
            this.f5352a.f5553m.unlock();
        }
    }
}
