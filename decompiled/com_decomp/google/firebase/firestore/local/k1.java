package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class k1 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f8038a;

    public /* synthetic */ k1(m1 m1Var) {
        this.f8038a = m1Var;
    }

    public final Object apply(Object obj) {
        return this.f8038a.k((Cursor) obj);
    }
}
