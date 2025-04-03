package com.google.firebase.installations;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f8322e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f8323f;

    public /* synthetic */ e(FirebaseInstallations firebaseInstallations, boolean z10) {
        this.f8322e = firebaseInstallations;
        this.f8323f = z10;
    }

    public final void run() {
        this.f8322e.lambda$getToken$1(this.f8323f);
    }
}
