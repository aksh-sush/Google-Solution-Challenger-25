package com.google.firebase.firestore.core;

import n4.j;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7858e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7859f;

    public /* synthetic */ e(FirestoreClient firestoreClient, j jVar) {
        this.f7858e = firestoreClient;
        this.f7859f = jVar;
    }

    public final void run() {
        this.f7858e.lambda$waitForPendingWrites$13(this.f7859f);
    }
}
