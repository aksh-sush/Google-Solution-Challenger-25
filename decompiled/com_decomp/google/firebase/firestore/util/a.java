package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f8268a;

    public /* synthetic */ a(Runnable runnable) {
        this.f8268a = runnable;
    }

    public final Object call() {
        return this.f8268a.run();
    }
}
