package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class j implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8026b;

    public /* synthetic */ j(LocalStore localStore, String str) {
        this.f8025a = localStore;
        this.f8026b = str;
    }

    public final Object get() {
        return this.f8025a.lambda$getNamedQuery$12(this.f8026b);
    }
}
