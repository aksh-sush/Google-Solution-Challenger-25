package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class s1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c2 f8083a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8084b;

    public /* synthetic */ s1(c2 c2Var, String str) {
        this.f8083a = c2Var;
        this.f8084b = str;
    }

    public final void accept(Object obj) {
        this.f8083a.R(this.f8084b, (Cursor) obj);
    }
}
