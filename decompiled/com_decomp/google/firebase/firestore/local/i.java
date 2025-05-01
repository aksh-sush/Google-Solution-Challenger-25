package com.google.firebase.firestore.local;

import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class i implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BundleMetadata f8014b;

    public /* synthetic */ i(LocalStore localStore, BundleMetadata bundleMetadata) {
        this.f8013a = localStore;
        this.f8014b = bundleMetadata;
    }

    public final Object get() {
        return this.f8013a.lambda$hasNewerBundle$8(this.f8014b);
    }
}
