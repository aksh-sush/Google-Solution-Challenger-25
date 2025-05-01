package com.onesignal.common;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import db.l;

public final class e {
    public static final e INSTANCE = new e();

    private e() {
    }

    public final int checkSelfPermission(Context context, String str) {
        l.e(context, "context");
        l.e(str, "permission");
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            Log.e("OneSignal", "checkSelfPermission failed, returning PERMISSION_DENIED");
            return -1;
        }
    }

    public final int getColor(Context context, int i10) {
        l.e(context, "context");
        return Build.VERSION.SDK_INT > 22 ? context.getColor(i10) : context.getResources().getColor(i10);
    }
}
