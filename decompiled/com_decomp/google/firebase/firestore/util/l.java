package com.google.firebase.firestore.util;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BackgroundQueue f8284e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f8285f;

    public /* synthetic */ l(BackgroundQueue backgroundQueue, Runnable runnable) {
        this.f8284e = backgroundQueue;
        this.f8285f = runnable;
    }

    public final void run() {
        this.f8284e.lambda$execute$0(this.f8285f);
    }
}
