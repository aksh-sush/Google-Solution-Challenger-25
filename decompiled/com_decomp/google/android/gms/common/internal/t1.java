package com.google.android.gms.common.internal;

import android.os.Bundle;
import q3.b;

public final class t1 extends b1 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f5704g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, (Bundle) null);
        this.f5704g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (!this.f5704g.enableLocalFallback() || !c.zzo(this.f5704g)) {
            this.f5704g.zzc.b(bVar);
            this.f5704g.onConnectionFailed(bVar);
            return;
        }
        c.zzk(this.f5704g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f5704g.zzc.b(b.f14642i);
        return true;
    }
}
