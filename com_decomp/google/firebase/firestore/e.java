package com.google.firebase.firestore;

import com.google.firebase.firestore.Transaction;
import com.google.firebase.firestore.util.Function;
import java.util.concurrent.Executor;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseFirestore f7904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f7905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Transaction.Function f7906c;

    public /* synthetic */ e(FirebaseFirestore firebaseFirestore, Executor executor, Transaction.Function function) {
        this.f7904a = firebaseFirestore;
        this.f7905b = executor;
        this.f7906c = function;
    }

    public final Object apply(Object obj) {
        return this.f7904a.lambda$runTransaction$1(this.f7905b, this.f7906c, (com.google.firebase.firestore.core.Transaction) obj);
    }
}
