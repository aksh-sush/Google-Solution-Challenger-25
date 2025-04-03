package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a9.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

public class VivoHomeBadger implements a {
    public void executeBadge(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }

    public List<String> getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }
}
