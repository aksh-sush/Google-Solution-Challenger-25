package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.util.Supplier;

public final /* synthetic */ class l implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImmutableSortedMap f8040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TargetData f8041c;

    public /* synthetic */ l(LocalStore localStore, ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        this.f8039a = localStore;
        this.f8040b = immutableSortedMap;
        this.f8041c = targetData;
    }

    public final Object get() {
        return this.f8039a.lambda$applyBundledDocuments$10(this.f8040b, this.f8041c);
    }
}
