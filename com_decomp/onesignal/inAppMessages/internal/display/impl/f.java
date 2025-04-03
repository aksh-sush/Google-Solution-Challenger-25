package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import db.l;

public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: animateViewColor$lambda-0  reason: not valid java name */
    public static final void m4animateViewColor$lambda0(View view, ValueAnimator valueAnimator) {
        l.e(view, "$view");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f10, float f11, int i10, Interpolator interpolator, Animation.AnimationListener animationListener) {
        l.e(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f10, f11);
        translateAnimation.setDuration((long) i10);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(View view, int i10, int i11, int i12, Animator.AnimatorListener animatorListener) {
        l.e(view, "view");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) i10);
        valueAnimator.setIntValues(new int[]{i11, i12});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new e(view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i10, Interpolator interpolator, Animation.AnimationListener animationListener) {
        l.e(view, "view");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration((long) i10);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
