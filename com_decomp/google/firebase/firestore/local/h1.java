package com.google.firebase.firestore.local;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final /* synthetic */ class h1 implements SQLiteDatabase.CursorFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object[] f8011a;

    public /* synthetic */ h1(Object[] objArr) {
        this.f8011a = objArr;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return SQLitePersistence.bind(sQLiteQuery, this.f8011a);
    }
}
