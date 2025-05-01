package com.google.firebase.firestore;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LoadBundleTask f8115e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ OnProgressListener f8116f;

    public /* synthetic */ m(LoadBundleTask loadBundleTask, OnProgressListener onProgressListener) {
        this.f8115e = loadBundleTask;
        this.f8116f = onProgressListener;
    }

    public final void run() {
        this.f8115e.lambda$addOnProgressListener$0(this.f8116f);
    }
}
