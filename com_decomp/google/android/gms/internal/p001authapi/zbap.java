package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.b;
import k3.a;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbap  reason: invalid package */
final class zbap extends zby {
    final /* synthetic */ j zba;

    zbap(zbaq zbaq, j jVar) {
        this.zba = jVar;
    }

    public final void zbb(Status status, a aVar) {
        if (status.j0()) {
            this.zba.c(aVar);
        } else {
            this.zba.b(b.a(status));
        }
    }
}
