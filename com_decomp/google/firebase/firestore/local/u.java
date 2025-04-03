package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LruGarbageCollector.a f8089a;

    public /* synthetic */ u(LruGarbageCollector.a aVar) {
        this.f8089a = aVar;
    }

    public final void accept(Object obj) {
        this.f8089a.b(Long.valueOf(((TargetData) obj).getSequenceNumber()));
    }
}
