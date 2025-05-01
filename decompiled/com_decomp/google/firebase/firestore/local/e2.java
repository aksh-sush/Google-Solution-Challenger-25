package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class e2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i2 f7990a;

    public /* synthetic */ e2(i2 i2Var) {
        this.f7990a = i2Var;
    }

    public final void accept(Object obj) {
        this.f7990a.v((Cursor) obj);
    }
}
