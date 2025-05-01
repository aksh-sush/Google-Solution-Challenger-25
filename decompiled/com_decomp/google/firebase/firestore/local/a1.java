package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

public final /* synthetic */ class a1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f7946a;

    public /* synthetic */ a1(List list) {
        this.f7946a = list;
    }

    public final void accept(Object obj) {
        this.f7946a.add(d.b(((Cursor) obj).getString(0)));
    }
}
