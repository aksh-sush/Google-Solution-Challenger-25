package com.google.firebase.firestore.core;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import n4.j;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7874e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7875f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Context f7876g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestoreSettings f7877h;

    public /* synthetic */ n(FirestoreClient firestoreClient, j jVar, Context context, FirebaseFirestoreSettings firebaseFirestoreSettings) {
        this.f7874e = firestoreClient;
        this.f7875f = jVar;
        this.f7876g = context;
        this.f7877h = firebaseFirestoreSettings;
    }

    public final void run() {
        this.f7874e.lambda$new$0(this.f7875f, this.f7876g, this.f7877h);
    }
}
