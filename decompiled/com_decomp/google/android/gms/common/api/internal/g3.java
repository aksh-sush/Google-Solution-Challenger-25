package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import q3.b;

final class g3 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f5379a;

    /* synthetic */ g3(z zVar, f3 f3Var) {
        this.f5379a = zVar;
    }

    public final void a(b bVar) {
        this.f5379a.f5553m.lock();
        try {
            this.f5379a.f5551k = bVar;
            z.y(this.f5379a);
        } finally {
            this.f5379a.f5553m.unlock();
        }
    }

    public final void b(Bundle bundle) {
        this.f5379a.f5553m.lock();
        try {
            this.f5379a.f5551k = b.f14642i;
            z.y(this.f5379a);
        } finally {
            this.f5379a.f5553m.unlock();
        }
    }

    public final void c(int i10, boolean z10) {
        this.f5379a.f5553m.lock();
        try {
            z zVar = this.f5379a;
            if (zVar.f5552l) {
                zVar.f5552l = false;
                z.w(this.f5379a, i10, z10);
            } else {
                zVar.f5552l = true;
                this.f5379a.f5544d.onConnectionSuspended(i10);
            }
        } finally {
            this.f5379a.f5553m.unlock();
        }
    }
}
