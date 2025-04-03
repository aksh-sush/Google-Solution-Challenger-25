package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class q1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f8069a;

    public /* synthetic */ q1(Consumer consumer) {
        this.f8069a = consumer;
    }

    public final void accept(Object obj) {
        this.f8069a.accept((ResourcePath) d.b(((Cursor) obj).getString(0)).popLast());
    }
}
