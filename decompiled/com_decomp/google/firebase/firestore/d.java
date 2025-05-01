package com.google.firebase.firestore;

import com.google.firebase.firestore.core.ViewSnapshot;

public final /* synthetic */ class d implements EventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DocumentReference f7902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EventListener f7903b;

    public /* synthetic */ d(DocumentReference documentReference, EventListener eventListener) {
        this.f7902a = documentReference;
        this.f7903b = eventListener;
    }

    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.f7902a.lambda$addSnapshotListenerInternal$2(this.f7903b, (ViewSnapshot) obj, firebaseFirestoreException);
    }
}
