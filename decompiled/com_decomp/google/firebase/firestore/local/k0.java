package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class k0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f8036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8037b;

    public /* synthetic */ k0(l0 l0Var, String str) {
        this.f8036a = l0Var;
        this.f8037b = str;
    }

    public final Object apply(Object obj) {
        return this.f8036a.d(this.f8037b, (Cursor) obj);
    }
}
