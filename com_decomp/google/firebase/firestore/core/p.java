package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7882e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EventListener f7883f;

    public /* synthetic */ p(FirestoreClient firestoreClient, EventListener eventListener) {
        this.f7882e = firestoreClient;
        this.f7883f = eventListener;
    }

    public final void run() {
        this.f7882e.lambda$addSnapshotsInSyncListener$14(this.f7883f);
    }
}
