package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9278a;

    public /* synthetic */ e(View view) {
        this.f9278a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f.m4animateViewColor$lambda0(this.f9278a, valueAnimator);
    }
}
