package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.concurrent.Callable;
import n4.j;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j f8282e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Callable f8283f;

    public /* synthetic */ k(j jVar, Callable callable) {
        this.f8282e = jVar;
        this.f8283f = callable;
    }

    public final void run() {
        AsyncQueue.b.q(this.f8282e, this.f8283f);
    }
}
