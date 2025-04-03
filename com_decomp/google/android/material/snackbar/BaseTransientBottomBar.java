package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.v;
import com.google.android.material.snackbar.a;
import g5.g;
import g5.k;
import o4.j;

public abstract class BaseTransientBottomBar {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeInterpolator f7252a = p4.a.f14446b;

    /* renamed from: b  reason: collision with root package name */
    private static final TimeInterpolator f7253b = p4.a.f14445a;

    /* renamed from: c  reason: collision with root package name */
    private static final TimeInterpolator f7254c = p4.a.f14448d;

    /* renamed from: d  reason: collision with root package name */
    static final Handler f7255d = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f7256e = false;

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f7257f = {o4.a.snackbarStyle};

    /* renamed from: g  reason: collision with root package name */
    private static final String f7258g = BaseTransientBottomBar.class.getSimpleName();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        private final b f7259k = new b(this);

        public boolean F(View view) {
            return this.f7259k.a(view);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f7259k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            } else if (i10 != 1) {
                return false;
            } else {
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    a.b().f((a.b) null);
                }
            } else if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                a.b().e((a.b) null);
            }
        }
    }

    protected static class c extends FrameLayout {

        /* renamed from: o  reason: collision with root package name */
        private static final View.OnTouchListener f7260o = new a();

        /* renamed from: e  reason: collision with root package name */
        k f7261e;

        /* renamed from: f  reason: collision with root package name */
        private int f7262f;

        /* renamed from: g  reason: collision with root package name */
        private final float f7263g;

        /* renamed from: h  reason: collision with root package name */
        private final float f7264h;

        /* renamed from: i  reason: collision with root package name */
        private final int f7265i;

        /* renamed from: j  reason: collision with root package name */
        private final int f7266j;

        /* renamed from: k  reason: collision with root package name */
        private ColorStateList f7267k;

        /* renamed from: l  reason: collision with root package name */
        private PorterDuff.Mode f7268l;

        /* renamed from: m  reason: collision with root package name */
        private Rect f7269m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f7270n;

        class a implements View.OnTouchListener {
            a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected c(Context context, AttributeSet attributeSet) {
            super(j5.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.D4);
            int i10 = j.K4;
            if (obtainStyledAttributes.hasValue(i10)) {
                h0.A0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f7262f = obtainStyledAttributes.getInt(j.G4, 0);
            if (obtainStyledAttributes.hasValue(j.M4) || obtainStyledAttributes.hasValue(j.N4)) {
                this.f7261e = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f7263g = obtainStyledAttributes.getFloat(j.H4, 1.0f);
            setBackgroundTintList(d5.c.a(context2, obtainStyledAttributes, j.I4));
            setBackgroundTintMode(v.i(obtainStyledAttributes.getInt(j.J4, -1), PorterDuff.Mode.SRC_IN));
            this.f7264h = obtainStyledAttributes.getFloat(j.F4, 1.0f);
            this.f7265i = obtainStyledAttributes.getDimensionPixelSize(j.E4, -1);
            this.f7266j = obtainStyledAttributes.getDimensionPixelSize(j.L4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f7260o);
            setFocusable(true);
            if (getBackground() == null) {
                h0.w0(this, a());
            }
        }

        private Drawable a() {
            int l10 = v4.a.l(this, o4.a.colorSurface, o4.a.colorOnSurface, getBackgroundOverlayColorAlpha());
            k kVar = this.f7261e;
            Drawable a10 = kVar != null ? BaseTransientBottomBar.d(l10, kVar) : BaseTransientBottomBar.c(l10, getResources());
            ColorStateList colorStateList = this.f7267k;
            Drawable r10 = androidx.core.graphics.drawable.a.r(a10);
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.o(r10, this.f7267k);
            }
            return r10;
        }

        private void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f7269m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f7264h;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f7262f;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f7263g;
        }

        /* access modifiers changed from: package-private */
        public int getMaxInlineActionWidth() {
            return this.f7266j;
        }

        /* access modifiers changed from: package-private */
        public int getMaxWidth() {
            return this.f7265i;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            h0.p0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (this.f7265i > 0 && getMeasuredWidth() > (i12 = this.f7265i)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i10) {
            this.f7262f = i10;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f7267k == null)) {
                drawable = androidx.core.graphics.drawable.a.r(drawable.mutate());
                androidx.core.graphics.drawable.a.o(drawable, this.f7267k);
                androidx.core.graphics.drawable.a.p(drawable, this.f7268l);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f7267k = colorStateList;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.o(r10, colorStateList);
                androidx.core.graphics.drawable.a.p(r10, this.f7268l);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f7268l = mode;
            if (getBackground() != null) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(getBackground().mutate());
                androidx.core.graphics.drawable.a.p(r10, mode);
                if (r10 != getBackground()) {
                    super.setBackgroundDrawable(r10);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f7270n && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                b((ViewGroup.MarginLayoutParams) layoutParams);
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f7260o);
            super.setOnClickListener(onClickListener);
        }
    }

    /* access modifiers changed from: private */
    public static GradientDrawable c(int i10, Resources resources) {
        float dimension = resources.getDimension(o4.c.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static g d(int i10, k kVar) {
        g gVar = new g(kVar);
        gVar.T(ColorStateList.valueOf(i10));
        return gVar;
    }
}
