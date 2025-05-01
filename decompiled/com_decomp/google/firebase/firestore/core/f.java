package com.google.firebase.firestore.core;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7860e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ QueryListener f7861f;

    public /* synthetic */ f(FirestoreClient firestoreClient, QueryListener queryListener) {
        this.f7860e = firestoreClient;
        this.f7861f = queryListener;
    }

    public final void run() {
        this.f7860e.lambda$listen$6(this.f7861f);
    }
}
