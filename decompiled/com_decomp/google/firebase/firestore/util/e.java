package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n4.j;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Callable f8272e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Executor f8273f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f8274g;

    public /* synthetic */ e(Callable callable, Executor executor, j jVar) {
        this.f8272e = callable;
        this.f8273f = executor;
        this.f8274g = jVar;
    }

    public final void run() {
        AsyncQueue.lambda$callTask$1(this.f8272e, this.f8273f, this.f8274g);
    }
}
