package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.w;
import n4.j;

/* renamed from: com.google.android.gms.internal.auth-api.zbbf  reason: invalid package */
final class zbbf extends zbae {
    final /* synthetic */ j zba;

    zbbf(zbbg zbbg, j jVar) {
        this.zba = jVar;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        w.a(status, pendingIntent, this.zba);
    }
}
