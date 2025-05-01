package com.google.firebase.firestore.core;

import java.util.List;
import n4.j;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7865e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f7866f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7867g;

    public /* synthetic */ i(FirestoreClient firestoreClient, List list, j jVar) {
        this.f7865e = firestoreClient;
        this.f7866f = list;
        this.f7867g = jVar;
    }

    public final void run() {
        this.f7865e.lambda$write$11(this.f7866f, this.f7867g);
    }
}
