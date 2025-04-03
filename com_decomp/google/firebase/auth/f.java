package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class f implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.IdTokenListener f7680e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7681f;

    f(FirebaseAuth firebaseAuth, FirebaseAuth.IdTokenListener idTokenListener) {
        this.f7681f = firebaseAuth;
        this.f7680e = idTokenListener;
    }

    public final void run() {
        this.f7680e.onIdTokenChanged(this.f7681f);
    }
}
