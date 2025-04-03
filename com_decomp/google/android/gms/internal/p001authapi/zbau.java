package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import k3.f;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbau  reason: invalid package */
final class zbau extends zbai {
    final /* synthetic */ j zba;

    zbau(zbaw zbaw, j jVar) {
        this.zba = jVar;
    }

    public final void zbb(Status status, f fVar) {
        if (status.j0()) {
            this.zba.c(fVar);
        } else {
            this.zba.b(b.a(status));
        }
    }
}
