package com.google.firebase.firestore.core;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Listener;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.j;

public final /* synthetic */ class o implements Listener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f7879b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f7880c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AsyncQueue f7881d;

    public /* synthetic */ o(FirestoreClient firestoreClient, AtomicBoolean atomicBoolean, j jVar, AsyncQueue asyncQueue) {
        this.f7878a = firestoreClient;
        this.f7879b = atomicBoolean;
        this.f7880c = jVar;
        this.f7881d = asyncQueue;
    }

    public final void onValue(Object obj) {
        this.f7878a.lambda$new$2(this.f7879b, this.f7880c, this.f7881d, (User) obj);
    }
}
