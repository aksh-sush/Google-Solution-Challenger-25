package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7871e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ EventListener f7872f;

    public /* synthetic */ l(FirestoreClient firestoreClient, EventListener eventListener) {
        this.f7871e = firestoreClient;
        this.f7872f = eventListener;
    }

    public final void run() {
        this.f7871e.lambda$removeSnapshotsInSyncListener$17(this.f7872f);
    }
}
