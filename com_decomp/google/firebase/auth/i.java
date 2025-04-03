package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7686e;

    i(FirebaseAuth firebaseAuth) {
        this.f7686e = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.AuthStateListener onAuthStateChanged : this.f7686e.zzd) {
            onAuthStateChanged.onAuthStateChanged(this.f7686e);
        }
    }
}
