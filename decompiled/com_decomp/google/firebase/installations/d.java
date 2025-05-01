package com.google.firebase.installations;

import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseInstallations f8321a;

    public /* synthetic */ d(FirebaseInstallations firebaseInstallations) {
        this.f8321a = firebaseInstallations;
    }

    public final Object call() {
        return this.f8321a.deleteFirebaseInstallationId();
    }
}
