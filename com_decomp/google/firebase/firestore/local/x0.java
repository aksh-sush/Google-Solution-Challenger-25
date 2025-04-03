package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.List;

public final /* synthetic */ class x0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f8099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f8100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8101c;

    public /* synthetic */ x0(e1 e1Var, List list, int i10) {
        this.f8099a = e1Var;
        this.f8100b = list;
        this.f8101c = i10;
    }

    public final void accept(Object obj) {
        this.f8099a.E(this.f8100b, this.f8101c, (Cursor) obj);
    }
}
