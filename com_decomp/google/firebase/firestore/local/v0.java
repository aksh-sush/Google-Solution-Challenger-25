package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

public final /* synthetic */ class v0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f8093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f8094b;

    public /* synthetic */ v0(e1 e1Var, List list) {
        this.f8093a = e1Var;
        this.f8094b = list;
    }

    public final void accept(Object obj) {
        this.f8093a.A(this.f8094b, (Cursor) obj);
    }
}
