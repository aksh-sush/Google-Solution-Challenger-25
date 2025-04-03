package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue.DelayedTask f8279e;

    public /* synthetic */ h(AsyncQueue.DelayedTask delayedTask) {
        this.f8279e = delayedTask;
    }

    public final void run() {
        this.f8279e.handleDelayElapsed();
    }
}
