package com.google.firebase.firestore;

import n4.j;

public final /* synthetic */ class c implements EventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f7831a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f7832b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Source f7833c;

    public /* synthetic */ c(j jVar, j jVar2, Source source) {
        this.f7831a = jVar;
        this.f7832b = jVar2;
        this.f7833c = source;
    }

    public final void onEvent(Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        DocumentReference.lambda$getViaSnapshotListener$1(this.f7831a, this.f7832b, this.f7833c, (DocumentSnapshot) obj, firebaseFirestoreException);
    }
}
