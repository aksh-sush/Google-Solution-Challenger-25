package com.google.firebase.firestore.core;

import androidx.fragment.app.e;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f7852e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7853f;

    public /* synthetic */ c(e eVar, Runnable runnable) {
        this.f7852e = eVar;
        this.f7853f = runnable;
    }

    public final void run() {
        ActivityScope.lambda$onFragmentActivityStopCallOnce$1(this.f7852e, this.f7853f);
    }
}
