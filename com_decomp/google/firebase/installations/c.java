package com.google.firebase.installations;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f8319e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f8320f;

    public /* synthetic */ c(FirebaseInstallations firebaseInstallations, boolean z10) {
        this.f8319e = firebaseInstallations;
        this.f8320f = z10;
    }

    public final void run() {
        this.f8319e.lambda$doRegistrationOrRefresh$2(this.f8320f);
    }
}
