package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class p0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Consumer f8063a;

    public /* synthetic */ p0(Consumer consumer) {
        this.f8063a = consumer;
    }

    public final void accept(Object obj) {
        this.f8063a.accept(Long.valueOf(((Cursor) obj).getLong(0)));
    }
}
