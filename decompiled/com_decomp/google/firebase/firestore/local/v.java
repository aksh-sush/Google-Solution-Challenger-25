package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LruGarbageCollector.a f8092a;

    public /* synthetic */ v(LruGarbageCollector.a aVar) {
        this.f8092a = aVar;
    }

    public final void accept(Object obj) {
        this.f8092a.b((Long) obj);
    }
}
