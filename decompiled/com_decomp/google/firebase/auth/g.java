package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class g implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.AuthStateListener f7682e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7683f;

    g(FirebaseAuth firebaseAuth, FirebaseAuth.AuthStateListener authStateListener) {
        this.f7683f = firebaseAuth;
        this.f7682e = authStateListener;
    }

    public final void run() {
        this.f7682e.onAuthStateChanged(this.f7683f);
    }
}
