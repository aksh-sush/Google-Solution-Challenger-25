package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.lang.Thread;

public final /* synthetic */ class i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue.b f8280a;

    public /* synthetic */ i(AsyncQueue.b bVar) {
        this.f8280a = bVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f8280a.r(thread, th);
    }
}
