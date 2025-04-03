package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import db.l;
import java.lang.ref.WeakReference;

public final class g {
    public static final g INSTANCE = new g();
    private static final int MARGIN_ERROR_PX_SIZE = u.INSTANCE.dpToPx(24);

    private g() {
    }

    public final String getCarrierName(Context context) {
        l.e(context, "appContext");
        try {
            Object systemService = context.getSystemService("phone");
            l.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if (l.a("", networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Integer getNetType(Context context) {
        l.e(context, "appContext");
        Object systemService = context.getSystemService("connectivity");
        l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }

    public final boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        View view;
        l.e(weakReference, "activityWeakReference");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Activity activity = weakReference.get();
            l.b(activity);
            Window window = activity.getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        return view != null && displayMetrics.heightPixels - rect.bottom > MARGIN_ERROR_PX_SIZE;
    }
}
