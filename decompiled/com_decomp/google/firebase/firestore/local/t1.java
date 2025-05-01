package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class t1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c2 f8088a;

    public /* synthetic */ t1(c2 c2Var) {
        this.f8088a = c2Var;
    }

    public final void accept(Object obj) {
        this.f8088a.T((Cursor) obj);
    }
}
