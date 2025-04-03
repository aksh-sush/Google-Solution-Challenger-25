package com.onesignal.common;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import db.l;

public final class u {
    public static final u INSTANCE = new u();

    private u() {
    }

    private final int getDisplaySizeY(Activity activity) {
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        return point.y;
    }

    private final int getWindowHeightAPI23Plus(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        l.d(decorView, "activity.window.decorView");
        WindowInsets a10 = decorView.getRootWindowInsets();
        int height = decorView.getHeight();
        return a10 == null ? height : (height - a10.getStableInsetBottom()) - a10.getStableInsetTop();
    }

    private final int getWindowHeightLollipop(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2 ? getWindowVisibleDisplayFrame(activity).height() : getDisplaySizeY(activity);
    }

    private final Rect getWindowVisibleDisplayFrame(Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    public final int dpToPx(int i10) {
        return (int) (((float) i10) * Resources.getSystem().getDisplayMetrics().density);
    }

    public final int[] getCutoutAndStatusBarInsets(Activity activity) {
        float f10;
        float f11;
        DisplayCutout a10;
        l.e(activity, "activity");
        Rect windowVisibleDisplayFrame = getWindowVisibleDisplayFrame(activity);
        View findViewById = activity.getWindow().findViewById(16908290);
        float top = ((float) (windowVisibleDisplayFrame.top - findViewById.getTop())) / Resources.getSystem().getDisplayMetrics().density;
        float bottom = ((float) (findViewById.getBottom() - windowVisibleDisplayFrame.bottom)) / Resources.getSystem().getDisplayMetrics().density;
        if (Build.VERSION.SDK_INT != 29 || (a10 = activity.getWindowManager().getDefaultDisplay().getCutout()) == null) {
            f11 = 0.0f;
            f10 = 0.0f;
        } else {
            f11 = ((float) a10.getSafeInsetRight()) / Resources.getSystem().getDisplayMetrics().density;
            f10 = ((float) a10.getSafeInsetLeft()) / Resources.getSystem().getDisplayMetrics().density;
        }
        return new int[]{c.a(top), c.a(bottom), c.a(f11), c.a(f10)};
    }

    public final int getFullbleedWindowWidth(Activity activity) {
        l.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 23) {
            return getWindowWidth(activity);
        }
        View decorView = activity.getWindow().getDecorView();
        l.d(decorView, "activity.window.decorView");
        return decorView.getWidth();
    }

    public final int getWindowHeight(Activity activity) {
        l.e(activity, "activity");
        return Build.VERSION.SDK_INT >= 23 ? getWindowHeightAPI23Plus(activity) : getWindowHeightLollipop(activity);
    }

    public final int getWindowWidth(Activity activity) {
        l.e(activity, "activity");
        return getWindowVisibleDisplayFrame(activity).width();
    }
}
