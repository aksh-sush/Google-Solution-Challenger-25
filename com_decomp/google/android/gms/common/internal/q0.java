package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.TimeUnit;
import n4.j;

final class q0 implements PendingResult.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PendingResult f5689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f5690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r.a f5691c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t0 f5692d;

    q0(PendingResult pendingResult, j jVar, r.a aVar, t0 t0Var) {
        this.f5689a = pendingResult;
        this.f5690b = jVar;
        this.f5691c = aVar;
        this.f5692d = t0Var;
    }

    public final void a(Status status) {
        if (status.j0()) {
            this.f5690b.c(this.f5691c.a(this.f5689a.await(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f5690b.b(b.a(status));
    }
}
