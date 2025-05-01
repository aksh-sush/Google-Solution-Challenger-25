package com.google.firebase.firestore;

import n4.j;

public final /* synthetic */ class o implements EventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f8130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f8131b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Source f8132c;

    public /* synthetic */ o(j jVar, j jVar2, Source source) {
        this.f8130a = jVar;
        this.f8131b = jVar2;
        this.f8132c = source;
    }

    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        Query.lambda$getViaSnapshotListener$1(this.f8130a, this.f8131b, this.f8132c, (QuerySnapshot) obj, firebaseFirestoreException);
    }
}
