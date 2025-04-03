package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;
import java.util.Set;

public final /* synthetic */ class b1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f7949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f7950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f7951c;

    public /* synthetic */ b1(e1 e1Var, Set set, List list) {
        this.f7949a = e1Var;
        this.f7950b = set;
        this.f7951c = list;
    }

    public final void accept(Object obj) {
        this.f7949a.C(this.f7950b, this.f7951c, (Cursor) obj);
    }
}
