package com.google.firebase.firestore.local;

import com.google.protobuf.j;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8085e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f8086f;

    public /* synthetic */ t(LocalStore localStore, j jVar) {
        this.f8085e = localStore;
        this.f8086f = jVar;
    }

    public final void run() {
        this.f8085e.lambda$setLastStreamToken$4(this.f8086f);
    }
}
