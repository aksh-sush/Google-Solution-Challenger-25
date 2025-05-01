package com.google.firebase.firestore.core;

import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.bundle.BundleReader;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7884e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ BundleReader f7885f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ LoadBundleTask f7886g;

    public /* synthetic */ q(FirestoreClient firestoreClient, BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        this.f7884e = firestoreClient;
        this.f7885f = bundleReader;
        this.f7886g = loadBundleTask;
    }

    public final void run() {
        this.f7884e.lambda$loadBundle$15(this.f7885f, this.f7886g);
    }
}
