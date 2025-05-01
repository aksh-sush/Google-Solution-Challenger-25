package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class f implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f7991a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7992b;

    public /* synthetic */ f(LocalStore localStore, int i10) {
        this.f7991a = localStore;
        this.f7992b = i10;
    }

    public final Object get() {
        return this.f7991a.lambda$rejectBatch$3(this.f7992b);
    }
}
