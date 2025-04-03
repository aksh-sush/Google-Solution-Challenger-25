package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DocumentKey;
import java.util.concurrent.Callable;

public final /* synthetic */ class s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirestoreClient f7889a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DocumentKey f7890b;

    public /* synthetic */ s(FirestoreClient firestoreClient, DocumentKey documentKey) {
        this.f7889a = firestoreClient;
        this.f7890b = documentKey;
    }

    public final Object call() {
        return this.f7889a.lambda$getDocumentFromLocalCache$8(this.f7890b);
    }
}
