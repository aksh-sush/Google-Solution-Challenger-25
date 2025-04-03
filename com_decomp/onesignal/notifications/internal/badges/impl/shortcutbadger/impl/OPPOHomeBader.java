package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a9.a;
import a9.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

public class OPPOHomeBader implements a {
    private static final String INTENT_ACTION = "com.oppo.unsettledevent";
    private static final String INTENT_EXTRA_BADGEUPGRADE_COUNT = "app_badge_count";
    private static final String INTENT_EXTRA_BADGE_COUNT = "number";
    private static final String INTENT_EXTRA_BADGE_UPGRADENUMBER = "upgradeNumber";
    private static final String INTENT_EXTRA_PACKAGENAME = "pakeageName";
    private static final String PROVIDER_CONTENT_URI = "content://com.android.badge/badge";
    private int mCurrentTotalCount = -1;

    private void executeBadgeByBroadcast(Context context, ComponentName componentName, int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i10);
        intent.putExtra(INTENT_EXTRA_BADGE_UPGRADENUMBER, i10);
        b9.a.sendIntentExplicitly(context, intent);
    }

    private void executeBadgeByContentProvider(Context context, int i10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(INTENT_EXTRA_BADGEUPGRADE_COUNT, i10);
            context.getContentResolver().call(Uri.parse(PROVIDER_CONTENT_URI), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new b("Unable to execute Badge By Content Provider");
        }
    }

    public void executeBadge(Context context, ComponentName componentName, int i10) {
        if (this.mCurrentTotalCount != i10) {
            this.mCurrentTotalCount = i10;
            executeBadgeByContentProvider(context, i10);
        }
    }

    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.oppo.launcher");
    }
}
