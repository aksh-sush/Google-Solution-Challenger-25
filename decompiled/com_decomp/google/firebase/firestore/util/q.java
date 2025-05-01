package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

class q implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f8290e;

    /* renamed from: f  reason: collision with root package name */
    private final Semaphore f8291f;

    q(int i10, Executor executor) {
        this.f8291f = new Semaphore(i10);
        this.f8290e = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        runnable.run();
        this.f8291f.release();
    }

    public void execute(Runnable runnable) {
        if (this.f8291f.tryAcquire()) {
            try {
                this.f8290e.execute(new p(this, runnable));
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        runnable.run();
    }
}
