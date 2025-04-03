package com.google.firebase.firestore.util;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RuntimeException f8292e;

    public /* synthetic */ r(RuntimeException runtimeException) {
        this.f8292e = runtimeException;
    }

    public final void run() {
        Util.lambda$crashMainThread$1(this.f8292e);
    }
}
