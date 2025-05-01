package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class r1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f8077a;

    public /* synthetic */ r1(Consumer consumer) {
        this.f8077a = consumer;
    }

    public final void accept(Object obj) {
        this.f8077a.accept((ResourcePath) d.b(((Cursor) obj).getString(0)).popLast());
    }
}
