package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class j1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f8028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8029b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ BackgroundQueue f8030c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Query f8031d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ImmutableSortedMap[] f8032e;

    public /* synthetic */ j1(m1 m1Var, int i10, BackgroundQueue backgroundQueue, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        this.f8028a = m1Var;
        this.f8029b = i10;
        this.f8030c = backgroundQueue;
        this.f8031d = query;
        this.f8032e = immutableSortedMapArr;
    }

    public final void accept(Object obj) {
        this.f8028a.n(this.f8029b, this.f8030c, this.f8031d, this.f8032e, (Cursor) obj);
    }
}
