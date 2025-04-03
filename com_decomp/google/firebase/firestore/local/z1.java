package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.firebase.firestore.util.Consumer;

public final /* synthetic */ class z1 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean[] f8112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SQLiteStatement f8113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f8114c;

    public /* synthetic */ z1(boolean[] zArr, SQLiteStatement sQLiteStatement, long j10) {
        this.f8112a = zArr;
        this.f8113b = sQLiteStatement;
        this.f8114c = j10;
    }

    public final void accept(Object obj) {
        c2.Q(this.f8112a, this.f8113b, this.f8114c, (Cursor) obj);
    }
}
