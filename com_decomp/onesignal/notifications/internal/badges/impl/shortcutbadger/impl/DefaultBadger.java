package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a9.a;
import a9.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class DefaultBadger implements a {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    public void executeBadge(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i10);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (b9.a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }

    public List<String> getSupportLaunchers() {
        return new ArrayList(0);
    }

    /* access modifiers changed from: package-private */
    public boolean isSupported(Context context) {
        return b9.a.canResolveBroadcast(context, new Intent(INTENT_ACTION));
    }
}
