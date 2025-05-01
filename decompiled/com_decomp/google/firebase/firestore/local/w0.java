package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class w0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f8096a;

    public /* synthetic */ w0(e1 e1Var) {
        this.f8096a = e1Var;
    }

    public final void accept(Object obj) {
        this.f8096a.L((Cursor) obj);
    }
}
