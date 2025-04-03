package com.google.firebase.firestore.core;

import java.util.concurrent.Callable;

public final /* synthetic */ class v implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Query f7895b;

    public /* synthetic */ v(FirestoreClient firestoreClient, Query query) {
        this.f7894a = firestoreClient;
        this.f7895b = query;
    }

    public final Object call() {
        return this.f7894a.lambda$getDocumentsFromLocalCache$10(this.f7895b);
    }
}
