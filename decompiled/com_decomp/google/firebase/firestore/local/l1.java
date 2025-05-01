package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;

public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m1 f8044e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ byte[] f8045f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Query f8046g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ImmutableSortedMap[] f8047h;

    public /* synthetic */ l1(m1 m1Var, byte[] bArr, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        this.f8044e = m1Var;
        this.f8045f = bArr;
        this.f8046g = query;
        this.f8047h = immutableSortedMapArr;
    }

    public final void run() {
        this.f8044e.m(this.f8045f, this.f8046g, this.f8047h);
    }
}
