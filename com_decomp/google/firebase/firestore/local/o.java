package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class o implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LruGarbageCollector f8059b;

    public /* synthetic */ o(LocalStore localStore, LruGarbageCollector lruGarbageCollector) {
        this.f8058a = localStore;
        this.f8059b = lruGarbageCollector;
    }

    public final Object get() {
        return this.f8058a.lambda$collectGarbage$14(this.f8059b);
    }
}
