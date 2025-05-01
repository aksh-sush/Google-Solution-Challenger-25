package com.google.firebase.firestore.local;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8061e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f8062f;

    public /* synthetic */ p(LocalStore localStore, int i10) {
        this.f8061e = localStore;
        this.f8062f = i10;
    }

    public final void run() {
        this.f8061e.lambda$releaseTarget$13(this.f8062f);
    }
}
