package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class f implements Executor {

    /* renamed from: e  reason: collision with root package name */
    static final Executor f8396e = new f();

    private f() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
