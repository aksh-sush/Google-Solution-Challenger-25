package com.google.firebase.firestore.core;

import com.google.firebase.firestore.auth.User;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7863e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ User f7864f;

    public /* synthetic */ h(FirestoreClient firestoreClient, User user) {
        this.f7863e = firestoreClient;
        this.f7864f = user;
    }

    public final void run() {
        this.f7863e.lambda$new$1(this.f7864f);
    }
}
