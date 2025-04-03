package com.google.firebase.messaging;

import n4.j;

final /* synthetic */ class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final FirebaseMessaging f8466e;

    /* renamed from: f  reason: collision with root package name */
    private final j f8467f;

    t(FirebaseMessaging firebaseMessaging, j jVar) {
        this.f8466e = firebaseMessaging;
        this.f8467f = jVar;
    }

    public void run() {
        this.f8466e.lambda$getToken$2$FirebaseMessaging(this.f8467f);
    }
}
