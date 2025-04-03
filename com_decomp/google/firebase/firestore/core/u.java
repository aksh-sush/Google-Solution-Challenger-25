package com.google.firebase.firestore.core;

import n4.j;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7891e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f7892f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7893g;

    public /* synthetic */ u(FirestoreClient firestoreClient, String str, j jVar) {
        this.f7891e = firestoreClient;
        this.f7892f = str;
        this.f7893g = jVar;
    }

    public final void run() {
        this.f7891e.lambda$getNamedQuery$16(this.f7892f, this.f7893g);
    }
}
