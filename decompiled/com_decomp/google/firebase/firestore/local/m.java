package com.google.firebase.firestore.local;

import java.util.List;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8048e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f8049f;

    public /* synthetic */ m(LocalStore localStore, List list) {
        this.f8048e = localStore;
        this.f8049f = list;
    }

    public final void run() {
        this.f8048e.lambda$notifyLocalViewChanges$6(this.f8049f);
    }
}
