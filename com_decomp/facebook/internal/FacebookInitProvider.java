package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.i0;
import db.g;
import db.l;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: e  reason: collision with root package name */
    public static final a f4800e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private static final String f4801f = FacebookInitProvider.class.getSimpleName();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        l.e(uri, "uri");
        return 0;
    }

    public String getType(Uri uri) {
        l.e(uri, "uri");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        l.e(uri, "uri");
        return null;
    }

    public boolean onCreate() {
        try {
            Context context = getContext();
            if (context != null) {
                i0.M(context);
                return false;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception e10) {
            Log.i(f4801f, "Failed to auto initialize the Facebook SDK", e10);
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        l.e(uri, "uri");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        l.e(uri, "uri");
        return 0;
    }
}
