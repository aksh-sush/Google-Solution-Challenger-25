package com.google.firebase.firestore;

import n4.j;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f7913e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7914f;

    public /* synthetic */ i(FirebaseFirestore firebaseFirestore, j jVar) {
        this.f7913e = firebaseFirestore;
        this.f7914f = jVar;
    }

    public final void run() {
        this.f7913e.lambda$clearPersistence$2(this.f7914f);
    }
}
