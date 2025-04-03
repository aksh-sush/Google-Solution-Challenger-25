package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

public final /* synthetic */ class j0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8027a;

    public /* synthetic */ j0(String str) {
        this.f8027a = str;
    }

    public final Object apply(Object obj) {
        return l0.c(this.f8027a, (Cursor) obj);
    }
}
