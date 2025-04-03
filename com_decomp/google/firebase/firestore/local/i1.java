package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.Map;

public final /* synthetic */ class i1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m1 f8015a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f8016b;

    public /* synthetic */ i1(m1 m1Var, Map map) {
        this.f8015a = m1Var;
        this.f8016b = map;
    }

    public final void accept(Object obj) {
        this.f8015a.l(this.f8016b, (Cursor) obj);
    }
}
