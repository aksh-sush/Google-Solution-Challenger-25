package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class y0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e1 f8105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8106b;

    public /* synthetic */ y0(e1 e1Var, int i10) {
        this.f8105a = e1Var;
        this.f8106b = i10;
    }

    public final Object apply(Object obj) {
        return this.f8105a.J(this.f8106b, (Cursor) obj);
    }
}
