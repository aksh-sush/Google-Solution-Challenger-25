package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

public final /* synthetic */ class t0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f8087a;

    public /* synthetic */ t0(List list) {
        this.f8087a = list;
    }

    public final void accept(Object obj) {
        this.f8087a.add(((Cursor) obj).getString(0));
    }
}
