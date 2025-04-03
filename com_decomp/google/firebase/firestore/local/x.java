package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LruGarbageCollector.Scheduler f8098e;

    public /* synthetic */ x(LruGarbageCollector.Scheduler scheduler) {
        this.f8098e = scheduler;
    }

    public final void run() {
        this.f8098e.lambda$scheduleGC$0();
    }
}
