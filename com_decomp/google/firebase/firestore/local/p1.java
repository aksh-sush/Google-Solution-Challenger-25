package com.google.firebase.firestore.local;

import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.local.a0;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class p1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.a f8064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SQLiteStatement f8065b;

    public /* synthetic */ p1(a0.a aVar, SQLiteStatement sQLiteStatement) {
        this.f8064a = aVar;
        this.f8065b = sQLiteStatement;
    }

    public final void accept(Object obj) {
        c2.K(this.f8064a, this.f8065b, (ResourcePath) obj);
    }
}
