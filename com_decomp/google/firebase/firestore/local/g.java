package com.google.firebase.firestore.local;

import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.LocalStore;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8002e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LocalStore.b f8003f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Target f8004g;

    public /* synthetic */ g(LocalStore localStore, LocalStore.b bVar, Target target) {
        this.f8002e = localStore;
        this.f8003f = bVar;
        this.f8004g = target;
    }

    public final void run() {
        this.f8002e.lambda$allocateTarget$7(this.f8003f, this.f8004g);
    }
}
