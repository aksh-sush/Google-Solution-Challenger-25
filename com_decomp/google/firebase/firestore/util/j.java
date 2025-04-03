package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f8281a;

    public /* synthetic */ j(Runnable runnable) {
        this.f8281a = runnable;
    }

    public final Object call() {
        return this.f8281a.run();
    }
}
