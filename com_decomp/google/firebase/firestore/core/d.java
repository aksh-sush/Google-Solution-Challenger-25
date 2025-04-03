package com.google.firebase.firestore.core;

import com.google.firebase.firestore.FirebaseFirestoreException;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AsyncEventListener f7855e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f7856f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestoreException f7857g;

    public /* synthetic */ d(AsyncEventListener asyncEventListener, Object obj, FirebaseFirestoreException firebaseFirestoreException) {
        this.f7855e = asyncEventListener;
        this.f7856f = obj;
        this.f7857g = firebaseFirestoreException;
    }

    public final void run() {
        this.f7855e.lambda$onEvent$0(this.f7856f, this.f7857g);
    }
}
