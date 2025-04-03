package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a9.a;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import b9.b;
import java.util.Arrays;
import java.util.List;

public class SamsungHomeBadger implements a {
    private static final String[] CONTENT_PROJECTION = {"_id", "class"};
    private static final String CONTENT_URI = "content://com.sec.badge/apps?notify=true";
    private DefaultBadger defaultBadger = new DefaultBadger();

    private ContentValues getContentValues(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    public void executeBadge(Context context, ComponentName componentName, int i10) {
        DefaultBadger defaultBadger2 = this.defaultBadger;
        if (defaultBadger2 == null || !defaultBadger2.isSupported(context)) {
            Uri parse = Uri.parse(CONTENT_URI);
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, CONTENT_PROJECTION, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z10 = false;
                    while (cursor.moveToNext()) {
                        int i11 = cursor.getInt(0);
                        contentResolver.update(parse, getContentValues(componentName, i10, false), "_id=?", new String[]{String.valueOf(i11)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        contentResolver.insert(parse, getContentValues(componentName, i10, true));
                    }
                }
            } finally {
                b.close(cursor);
            }
        } else {
            this.defaultBadger.executeBadge(context, componentName, i10);
        }
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }
}
