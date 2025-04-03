package com.google.firebase.firestore;

import com.google.firebase.firestore.core.AsyncEventListener;

public final /* synthetic */ class h implements ListenerRegistration {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f7911a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AsyncEventListener f7912b;

    public /* synthetic */ h(FirebaseFirestore firebaseFirestore, AsyncEventListener asyncEventListener) {
        this.f7911a = firebaseFirestore;
        this.f7912b = asyncEventListener;
    }

    public final void remove() {
        this.f7911a.lambda$addSnapshotsInSyncListener$5(this.f7912b);
    }
}
