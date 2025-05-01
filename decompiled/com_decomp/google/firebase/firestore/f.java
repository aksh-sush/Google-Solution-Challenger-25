package com.google.firebase.firestore;

import com.google.firebase.firestore.Transaction;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f7907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction.Function f7908b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.core.Transaction f7909c;

    public /* synthetic */ f(FirebaseFirestore firebaseFirestore, Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        this.f7907a = firebaseFirestore;
        this.f7908b = function;
        this.f7909c = transaction;
    }

    public final Object call() {
        return this.f7907a.lambda$runTransaction$0(this.f7908b, this.f7909c);
    }
}
