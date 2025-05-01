package com.google.firebase.messaging;

import java.util.concurrent.Executor;

final /* synthetic */ class d implements Executor {

    /* renamed from: e  reason: collision with root package name */
    static final Executor f8386e = new d();

    private d() {
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
