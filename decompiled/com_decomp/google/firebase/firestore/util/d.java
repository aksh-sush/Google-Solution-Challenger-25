package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue f8270e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue.TimerId f8271f;

    public /* synthetic */ d(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId) {
        this.f8270e = asyncQueue;
        this.f8271f = timerId;
    }

    public final void run() {
        this.f8270e.lambda$runDelayedTasksUntil$6(this.f8271f);
    }
}
