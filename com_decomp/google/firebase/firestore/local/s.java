package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.bundle.NamedQuery;

public final /* synthetic */ class s implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8078e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ NamedQuery f8079f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ TargetData f8080g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f8081h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ImmutableSortedSet f8082i;

    public /* synthetic */ s(LocalStore localStore, NamedQuery namedQuery, TargetData targetData, int i10, ImmutableSortedSet immutableSortedSet) {
        this.f8078e = localStore;
        this.f8079f = namedQuery;
        this.f8080g = targetData;
        this.f8081h = i10;
        this.f8082i = immutableSortedSet;
    }

    public final void run() {
        this.f8078e.lambda$saveNamedQuery$11(this.f8079f, this.f8080g, this.f8081h, this.f8082i);
    }
}
