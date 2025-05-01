package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class i implements Executor {

    /* renamed from: e  reason: collision with root package name */
    static final Executor f8406e = new i();

    private i() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
