package com.google.firebase.firestore.core;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7873e;

    public /* synthetic */ m(FirestoreClient firestoreClient) {
        this.f7873e = firestoreClient;
    }

    public final void run() {
        this.f7873e.lambda$disableNetwork$3();
    }
}
