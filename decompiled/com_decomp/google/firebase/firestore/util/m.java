package com.google.firebase.firestore.util;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ExponentialBackoff f8286e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f8287f;

    public /* synthetic */ m(ExponentialBackoff exponentialBackoff, Runnable runnable) {
        this.f8286e = exponentialBackoff;
        this.f8287f = runnable;
    }

    public final void run() {
        this.f8286e.lambda$backoffAndRun$0(this.f8287f);
    }
}
