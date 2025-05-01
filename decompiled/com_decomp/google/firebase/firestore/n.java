package com.google.firebase.firestore;

import com.google.firebase.firestore.LoadBundleTask;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LoadBundleTask.a f8128e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LoadBundleTaskProgress f8129f;

    public /* synthetic */ n(LoadBundleTask.a aVar, LoadBundleTaskProgress loadBundleTaskProgress) {
        this.f8128e = aVar;
        this.f8129f = loadBundleTaskProgress;
    }

    public final void run() {
        this.f8128e.c(this.f8129f);
    }
}
