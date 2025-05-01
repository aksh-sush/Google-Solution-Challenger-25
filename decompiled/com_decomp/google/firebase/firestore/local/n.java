package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8053e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ BundleMetadata f8054f;

    public /* synthetic */ n(LocalStore localStore, BundleMetadata bundleMetadata) {
        this.f8053e = localStore;
        this.f8054f = bundleMetadata;
    }

    public final void run() {
        this.f8053e.lambda$saveBundle$9(this.f8054f);
    }
}
