package com.google.firebase.messaging;

import java.util.concurrent.ScheduledFuture;
import n4.d;
import n4.i;

final /* synthetic */ class z0 implements d {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture f8495a;

    z0(ScheduledFuture scheduledFuture) {
        this.f8495a = scheduledFuture;
    }

    public void a(i iVar) {
        this.f8495a.cancel(false);
    }
}
