package com.google.firebase.messaging;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

final /* synthetic */ class o implements FirebaseInstanceIdInternal.NewTokenListener {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseMessaging f8433a;

    o(FirebaseMessaging firebaseMessaging) {
        this.f8433a = firebaseMessaging;
    }

    public void onNewToken(String str) {
        this.f8433a.bridge$lambda$0$FirebaseMessaging(str);
    }
}
