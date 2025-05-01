package com.google.firebase.firestore.local;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8066e;

    public /* synthetic */ q(LocalStore localStore) {
        this.f8066e = localStore;
    }

    public final void run() {
        this.f8066e.lambda$startMutationQueue$0();
    }
}
