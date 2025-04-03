package com.google.firebase.firestore.core;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7869e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ QueryListener f7870f;

    public /* synthetic */ k(FirestoreClient firestoreClient, QueryListener queryListener) {
        this.f7869e = firestoreClient;
        this.f7870f = queryListener;
    }

    public final void run() {
        this.f7869e.lambda$stopListening$7(this.f7870f);
    }
}
