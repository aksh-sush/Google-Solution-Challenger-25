package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b5.d;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: j  reason: collision with root package name */
    private static final int f6735j = o4.a.motionDurationLong2;

    /* renamed from: k  reason: collision with root package name */
    private static final int f6736k = o4.a.motionDurationMedium4;

    /* renamed from: l  reason: collision with root package name */
    private static final int f6737l = o4.a.motionEasingEmphasizedInterpolator;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet f6738a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private int f6739b;

    /* renamed from: c  reason: collision with root package name */
    private int f6740c;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f6741d;

    /* renamed from: e  reason: collision with root package name */
    private TimeInterpolator f6742e;

    /* renamed from: f  reason: collision with root package name */
    private int f6743f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f6744g = 2;

    /* renamed from: h  reason: collision with root package name */
    private int f6745h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ViewPropertyAnimator f6746i;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f6746i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    private void F(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f6746i = view.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    private void M(View view, int i10) {
        this.f6744g = i10;
        Iterator it = this.f6738a.iterator();
        if (it.hasNext()) {
            b.a(it.next());
            throw null;
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean G() {
        return this.f6744g == 1;
    }

    public boolean H() {
        return this.f6744g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z10) {
        if (!G()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6746i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            M(view, 1);
            int i10 = this.f6743f + this.f6745h;
            if (z10) {
                F(view, i10, (long) this.f6740c, this.f6742e);
                return;
            }
            view.setTranslationY((float) i10);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z10) {
        if (!H()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f6746i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            M(view, 2);
            if (z10) {
                F(view, 0, (long) this.f6739b, this.f6741d);
                return;
            }
            view.setTranslationY((float) 0);
        }
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f6743f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f6739b = d.f(view.getContext(), f6735j, 225);
        this.f6740c = d.f(view.getContext(), f6736k, 175);
        Context context = view.getContext();
        int i11 = f6737l;
        this.f6741d = d.g(context, i11, p4.a.f14448d);
        this.f6742e = d.g(view.getContext(), i11, p4.a.f14447c);
        return super.l(coordinatorLayout, view, i10);
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            I(view);
        } else if (i11 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
