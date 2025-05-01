package com.google.firebase.messaging;

import n4.a;
import n4.i;

final /* synthetic */ class y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f8490a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8491b;

    y(FirebaseMessaging firebaseMessaging, String str) {
        this.f8490a = firebaseMessaging;
        this.f8491b = str;
    }

    public Object a(i iVar) {
        return this.f8490a.lambda$blockingGetToken$9$FirebaseMessaging(this.f8491b, iVar);
    }
}
