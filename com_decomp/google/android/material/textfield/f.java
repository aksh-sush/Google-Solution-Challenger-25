package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import b5.d;
import o4.h;

class f extends t {

    /* renamed from: e  reason: collision with root package name */
    private final int f7350e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7351f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f7352g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f7353h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f7354i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f7355j = new d(this);

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f7356k = new e(this);

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f7357l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f7358m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationStart(Animator animator) {
            f.this.f7416b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            f.this.f7416b.a0(false);
        }
    }

    f(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i10 = o4.a.motionDurationShort3;
        this.f7350e = d.f(context, i10, 100);
        this.f7351f = d.f(sVar.getContext(), i10, 150);
        this.f7352g = d.g(sVar.getContext(), o4.a.motionEasingLinearInterpolator, p4.a.f14445a);
        this.f7353h = d.g(sVar.getContext(), o4.a.motionEasingEmphasizedInterpolator, p4.a.f14448d);
    }

    private void A(boolean z10) {
        boolean z11 = this.f7416b.F() == z10;
        if (z10 && !this.f7357l.isRunning()) {
            this.f7358m.cancel();
            this.f7357l.start();
            if (z11) {
                this.f7357l.end();
            }
        } else if (!z10) {
            this.f7357l.cancel();
            this.f7358m.start();
            if (z11) {
                this.f7358m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f7352g);
        ofFloat.setDuration((long) this.f7350e);
        ofFloat.addUpdateListener(new c(this));
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(this.f7353h);
        ofFloat.setDuration((long) this.f7351f);
        ofFloat.addUpdateListener(new b(this));
        return ofFloat;
    }

    private void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7357l = animatorSet;
        animatorSet.playTogether(new Animator[]{C, B});
        this.f7357l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f7358m = B2;
        B2.addListener(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f7418d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7418d.setScaleX(floatValue);
        this.f7418d.setScaleY(floatValue);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f7354i;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            r();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f7354i;
        return editText != null && (editText.hasFocus() || this.f7418d.hasFocus()) && this.f7354i.getText().length() > 0;
    }

    /* access modifiers changed from: package-private */
    public void a(Editable editable) {
        if (this.f7416b.w() == null) {
            A(J());
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.clear_text_end_icon_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return o4.d.mtrl_ic_cancel;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f7356k;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f7355j;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener g() {
        return this.f7356k;
    }

    public void n(EditText editText) {
        this.f7354i = editText;
        this.f7415a.setEndIconVisible(J());
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f7416b.w() != null) {
            A(z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        D();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        EditText editText = this.f7354i;
        if (editText != null) {
            editText.post(new a(this));
        }
    }
}
