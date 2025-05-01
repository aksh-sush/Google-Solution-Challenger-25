package com.google.firebase.messaging;

import n4.j;

final /* synthetic */ class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final FirebaseMessaging f8478e;

    /* renamed from: f  reason: collision with root package name */
    private final j f8479f;

    u(FirebaseMessaging firebaseMessaging, j jVar) {
        this.f8478e = firebaseMessaging;
        this.f8479f = jVar;
    }

    public void run() {
        this.f8478e.lambda$deleteToken$3$FirebaseMessaging(this.f8479f);
    }
}
