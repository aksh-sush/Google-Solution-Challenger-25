package com.google.firebase.messaging;

import com.google.firebase.messaging.k0;
import n4.i;

final /* synthetic */ class z implements k0.a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f8493a;

    /* renamed from: b  reason: collision with root package name */
    private final i f8494b;

    z(FirebaseMessaging firebaseMessaging, i iVar) {
        this.f8493a = firebaseMessaging;
        this.f8494b = iVar;
    }

    public i start() {
        return this.f8493a.lambda$blockingGetToken$8$FirebaseMessaging(this.f8494b);
    }
}
