package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

public final /* synthetic */ class z0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f8110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f8111b;

    public /* synthetic */ z0(e1 e1Var, List list) {
        this.f8110a = e1Var;
        this.f8111b = list;
    }

    public final void accept(Object obj) {
        this.f8110a.B(this.f8111b, (Cursor) obj);
    }
}
