package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.i2;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class d2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i2 f7972a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Target f7973b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i2.c f7974c;

    public /* synthetic */ d2(i2 i2Var, Target target, i2.c cVar) {
        this.f7972a = i2Var;
        this.f7973b = target;
        this.f7974c = cVar;
    }

    public final void accept(Object obj) {
        this.f7972a.t(this.f7973b, this.f7974c, (Cursor) obj);
    }
}
