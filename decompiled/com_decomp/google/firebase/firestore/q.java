package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ViewSnapshot;

public final /* synthetic */ class q implements EventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Query f8141a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EventListener f8142b;

    public /* synthetic */ q(Query query, EventListener eventListener) {
        this.f8141a = query;
        this.f8142b = eventListener;
    }

    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.f8141a.lambda$addSnapshotListenerInternal$2(this.f8142b, (ViewSnapshot) obj, firebaseFirestoreException);
    }
}
