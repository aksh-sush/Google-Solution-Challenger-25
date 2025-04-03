package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class b0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long[] f7948a;

    public /* synthetic */ b0(long[] jArr) {
        this.f7948a = jArr;
    }

    public final void accept(Object obj) {
        c0.l(this.f7948a, (Long) obj);
    }
}
