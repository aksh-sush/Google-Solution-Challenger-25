package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.w;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbbd  reason: invalid package */
final class zbbd extends i.a {
    final /* synthetic */ j zba;

    zbbd(zbbg zbbg, j jVar) {
        this.zba = jVar;
    }

    public final void onResult(Status status) {
        w.b(status, this.zba);
    }
}
