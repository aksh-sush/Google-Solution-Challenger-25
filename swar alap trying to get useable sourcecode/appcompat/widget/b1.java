package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f1086a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f1087b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f1088c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f1089d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f1090e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1091f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f1092g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f1093h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f1094i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f1095j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.j.f10278y0);
        try {
            if (!obtainStyledAttributes.hasValue(f.j.D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList e10 = e(context, i10);
        if (e10 != null && e10.isStateful()) {
            return e10.getColorForState(f1087b, e10.getDefaultColor());
        }
        TypedValue f10 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f10, true);
        return d(context, i10, f10.getFloat());
    }

    public static int c(Context context, int i10) {
        int[] iArr = f1095j;
        iArr[0] = i10;
        f1 u10 = f1.u(context, null, iArr);
        try {
            return u10.b(0, 0);
        } finally {
            u10.w();
        }
    }

    static int d(Context context, int i10, float f10) {
        return androidx.core.graphics.a.k(c(context, i10), Math.round(Color.alpha(r0) * f10));
    }

    public static ColorStateList e(Context context, int i10) {
        int[] iArr = f1095j;
        iArr[0] = i10;
        f1 u10 = f1.u(context, null, iArr);
        try {
            return u10.c(0);
        } finally {
            u10.w();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f1086a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}