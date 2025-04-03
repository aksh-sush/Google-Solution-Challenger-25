package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;

final class h implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f7684e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ InternalTokenResult f7685f;

    h(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.f7684e = firebaseAuth;
        this.f7685f = internalTokenResult;
    }

    public final void run() {
        for (IdTokenListener onIdTokenChanged : this.f7684e.zzc) {
            onIdTokenChanged.onIdTokenChanged(this.f7685f);
        }
        for (FirebaseAuth.IdTokenListener onIdTokenChanged2 : this.f7684e.zzb) {
            onIdTokenChanged2.onIdTokenChanged(this.f7684e);
        }
    }
}
