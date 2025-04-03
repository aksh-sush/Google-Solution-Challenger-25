package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import n4.a;
import n4.i;

final /* synthetic */ class v implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f8483a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f8484b;

    v(FirebaseMessaging firebaseMessaging, ExecutorService executorService) {
        this.f8483a = firebaseMessaging;
        this.f8484b = executorService;
    }

    public Object a(i iVar) {
        return this.f8483a.lambda$deleteToken$5$FirebaseMessaging(this.f8484b, iVar);
    }
}
