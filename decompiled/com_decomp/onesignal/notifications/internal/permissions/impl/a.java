package com.onesignal.notifications.internal.permissions.impl;

import android.content.Context;
import android.content.Intent;
import db.l;

public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void show(Context context) {
        l.e(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
