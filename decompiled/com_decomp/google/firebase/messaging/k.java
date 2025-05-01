package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class k implements Executor {

    /* renamed from: e  reason: collision with root package name */
    static final Executor f8415e = new k();

    private k() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
