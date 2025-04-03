package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockHandView f7500a;

    public /* synthetic */ b(ClockHandView clockHandView) {
        this.f7500a = clockHandView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7500a.l(valueAnimator);
    }
}
