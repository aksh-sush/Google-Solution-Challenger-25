package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.util.Supplier;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class h implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LocalStore f8007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f8008b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f8009c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Timestamp f8010d;

    public /* synthetic */ h(LocalStore localStore, Set set, List list, Timestamp timestamp) {
        this.f8007a = localStore;
        this.f8008b = set;
        this.f8009c = list;
        this.f8010d = timestamp;
    }

    public final Object get() {
        return this.f8007a.lambda$writeLocally$1(this.f8008b, this.f8009c, this.f8010d);
    }
}
