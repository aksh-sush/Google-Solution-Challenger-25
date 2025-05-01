package com.onesignal.common;

import android.app.Activity;
import db.l;

public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void requestPermissions(Activity activity, String[] strArr, int i10) {
        l.e(activity, "activity");
        l.e(strArr, "permissions");
        c.INSTANCE.requestPermissions(activity, strArr, i10);
    }

    public final boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return c.INSTANCE.shouldShowRequestPermissionRationale(activity, str);
    }
}
