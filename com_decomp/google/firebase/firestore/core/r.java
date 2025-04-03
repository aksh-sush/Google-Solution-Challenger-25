package com.google.firebase.firestore.core;

import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Callable;

public final /* synthetic */ class r implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7887a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function f7888b;

    public /* synthetic */ r(FirestoreClient firestoreClient, Function function) {
        this.f7887a = firestoreClient;
        this.f7888b = function;
    }

    public final Object call() {
        return this.f7887a.lambda$transaction$12(this.f7888b);
    }
}
