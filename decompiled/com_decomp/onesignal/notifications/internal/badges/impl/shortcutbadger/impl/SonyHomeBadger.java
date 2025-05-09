package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

public class SonyHomeBadger implements a9.a {
    private static final String INTENT_ACTION = "com.sonyericsson.home.action.UPDATE_BADGE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME";
    private static final String INTENT_EXTRA_MESSAGE = "com.sonyericsson.home.intent.extra.badge.MESSAGE";
    private static final String INTENT_EXTRA_PACKAGE_NAME = "com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME";
    private static final String INTENT_EXTRA_SHOW_MESSAGE = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
    private static final String PROVIDER_COLUMNS_ACTIVITY_NAME = "activity_name";
    private static final String PROVIDER_COLUMNS_BADGE_COUNT = "badge_count";
    private static final String PROVIDER_COLUMNS_PACKAGE_NAME = "package_name";
    private static final String PROVIDER_CONTENT_URI = "content://com.sonymobile.home.resourceprovider/badge";
    private static final String SONY_HOME_PROVIDER_NAME = "com.sonymobile.home.resourceprovider";
    private final Uri BADGE_CONTENT_URI = Uri.parse(PROVIDER_CONTENT_URI);
    private AsyncQueryHandler mQueryHandler;

    class a extends AsyncQueryHandler {
        a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues createContentValues(int i10, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(PROVIDER_COLUMNS_BADGE_COUNT, Integer.valueOf(i10));
        contentValues.put(PROVIDER_COLUMNS_PACKAGE_NAME, componentName.getPackageName());
        contentValues.put(PROVIDER_COLUMNS_ACTIVITY_NAME, componentName.getClassName());
        return contentValues;
    }

    private static void executeBadgeByBroadcast(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGE_NAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        intent.putExtra(INTENT_EXTRA_MESSAGE, String.valueOf(i10));
        intent.putExtra(INTENT_EXTRA_SHOW_MESSAGE, i10 > 0);
        context.sendBroadcast(intent);
    }

    private void executeBadgeByContentProvider(Context context, ComponentName componentName, int i10) {
        if (i10 >= 0) {
            ContentValues createContentValues = createContentValues(i10, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.mQueryHandler == null) {
                    this.mQueryHandler = new a(context.getApplicationContext().getContentResolver());
                }
                insertBadgeAsync(createContentValues);
                return;
            }
            insertBadgeSync(context, createContentValues);
        }
    }

    private void insertBadgeAsync(ContentValues contentValues) {
        this.mQueryHandler.startInsert(0, (Object) null, this.BADGE_CONTENT_URI, contentValues);
    }

    private void insertBadgeSync(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.BADGE_CONTENT_URI, contentValues);
    }

    private static boolean sonyBadgeContentProviderExists(Context context) {
        return context.getPackageManager().resolveContentProvider(SONY_HOME_PROVIDER_NAME, 0) != null;
    }

    public void executeBadge(Context context, ComponentName componentName, int i10) {
        if (sonyBadgeContentProviderExists(context)) {
            executeBadgeByContentProvider(context, componentName, i10);
        } else {
            executeBadgeByBroadcast(context, componentName, i10);
        }
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }
}
