package com.google.firebase.firestore.util;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f8288e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f8289f;

    public /* synthetic */ p(q qVar, Runnable runnable) {
        this.f8288e = qVar;
        this.f8289f = runnable;
    }

    public final void run() {
        this.f8288e.b(this.f8289f);
    }
}
