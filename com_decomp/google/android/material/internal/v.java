package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.c0;
import androidx.core.view.h0;
import androidx.core.view.h1;
import androidx.core.view.i2;
import x4.g;

public abstract class v {

    class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f7210a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f7211b;

        a(c cVar, d dVar) {
            this.f7210a = cVar;
            this.f7211b = dVar;
        }

        public h1 a(View view, h1 h1Var) {
            return this.f7210a.a(view, h1Var, new d(this.f7211b));
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            h0.p0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        h1 a(View view, h1 h1Var, d dVar);
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f7212a;

        /* renamed from: b  reason: collision with root package name */
        public int f7213b;

        /* renamed from: c  reason: collision with root package name */
        public int f7214c;

        /* renamed from: d  reason: collision with root package name */
        public int f7215d;

        public d(int i10, int i11, int i12, int i13) {
            this.f7212a = i10;
            this.f7213b = i11;
            this.f7214c = i12;
            this.f7215d = i13;
        }

        public d(d dVar) {
            this.f7212a = dVar.f7212a;
            this.f7213b = dVar.f7213b;
            this.f7214c = dVar.f7214c;
            this.f7215d = dVar.f7215d;
        }
    }

    public static void b(View view, c cVar) {
        h0.F0(view, new a(cVar, new d(h0.J(view), view.getPaddingTop(), h0.I(view), view.getPaddingBottom())));
        j(view);
    }

    public static float c(Context context, int i10) {
        return TypedValue.applyDimension(1, (float) i10, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList f10 = g.f(view.getBackground());
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager e(View view) {
        return (InputMethodManager) androidx.core.content.a.i(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += h0.y((View) parent);
        }
        return f10;
    }

    public static boolean g(View view) {
        return h0.E(view) == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view) {
        if (h0.V(view)) {
            h0.p0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void k(View view, boolean z10) {
        view.requestFocus();
        view.post(new u(view, z10));
    }

    public static void l(View view, boolean z10) {
        i2 O;
        if (!z10 || (O = h0.O(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            O.c(h1.m.a());
        }
    }
}
