package com.onesignal.notifications.internal.display.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.notifications.activities.NotificationOpenedActivity;
import com.onesignal.notifications.activities.NotificationOpenedActivityAndroid22AndOlder;
import db.l;

public final class a {
    private final Context context;
    private final Class<?> notificationOpenedClassAndroid22AndOlder = NotificationOpenedActivityAndroid22AndOlder.class;
    private final Class<?> notificationOpenedClassAndroid23Plus = NotificationOpenedActivity.class;

    public a(Context context2) {
        l.e(context2, "context");
        this.context = context2;
    }

    private final Intent getNewBaseIntentAndroidAPI22AndOlder() {
        Intent intent = new Intent(this.context, this.notificationOpenedClassAndroid22AndOlder);
        intent.addFlags(403177472);
        return intent;
    }

    private final Intent getNewBaseIntentAndroidAPI23Plus() {
        return new Intent(this.context, this.notificationOpenedClassAndroid23Plus);
    }

    public final Context getContext() {
        return this.context;
    }

    public final PendingIntent getNewActionPendingIntent(int i10, Intent intent) {
        l.e(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.context, i10, intent, 201326592);
    }

    public final Intent getNewBaseIntent(int i10) {
        Intent addFlags = (Build.VERSION.SDK_INT >= 23 ? getNewBaseIntentAndroidAPI23Plus() : getNewBaseIntentAndroidAPI22AndOlder()).putExtra("androidNotificationId", i10).addFlags(603979776);
        l.d(addFlags, "intent\n            .putE…_CLEAR_TOP,\n            )");
        return addFlags;
    }
}
