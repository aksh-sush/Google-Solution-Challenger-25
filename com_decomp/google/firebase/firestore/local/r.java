package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class r implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutationBatchResult f8071b;

    public /* synthetic */ r(LocalStore localStore, MutationBatchResult mutationBatchResult) {
        this.f8070a = localStore;
        this.f8071b = mutationBatchResult;
    }

    public final Object get() {
        return this.f8070a.lambda$acknowledgeBatch$2(this.f8071b);
    }
}
