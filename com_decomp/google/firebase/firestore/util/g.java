package com.google.firebase.firestore.util;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Throwable f8278e;

    public /* synthetic */ g(Throwable th) {
        this.f8278e = th;
    }

    public final void run() {
        AsyncQueue.lambda$panic$3(this.f8278e);
    }
}
