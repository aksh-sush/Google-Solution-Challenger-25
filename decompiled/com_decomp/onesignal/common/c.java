package com.onesignal.common;

import android.app.Activity;
import androidx.core.app.b;
import db.l;

public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void requestPermissions(Activity activity, String[] strArr, int i10) {
        l.e(activity, "activity");
        l.b(strArr);
        activity.requestPermissions(strArr, i10);
    }

    public final boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        l.b(activity);
        l.b(str);
        return b.x(activity, str);
    }
}
