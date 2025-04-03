package com.google.firebase.firestore.core;

import android.app.Activity;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Activity f7849e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7850f;

    public /* synthetic */ b(Activity activity, Runnable runnable) {
        this.f7849e = activity;
        this.f7850f = runnable;
    }

    public final void run() {
        ActivityScope.lambda$onActivityStopCallOnce$0(this.f7849e, this.f7850f);
    }
}
