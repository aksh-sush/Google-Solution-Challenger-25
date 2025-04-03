package com.google.firebase.firestore.util;

import java.util.concurrent.Semaphore;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Runnable f8275e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Throwable[] f8276f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Semaphore f8277g;

    public /* synthetic */ f(Runnable runnable, Throwable[] thArr, Semaphore semaphore) {
        this.f8275e = runnable;
        this.f8276f = thArr;
        this.f8277g = semaphore;
    }

    public final void run() {
        AsyncQueue.lambda$runSync$4(this.f8275e, this.f8276f, this.f8277g);
    }
}
