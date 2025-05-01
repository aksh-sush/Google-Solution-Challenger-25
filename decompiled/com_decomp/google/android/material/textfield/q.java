package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.h0;
import b5.d;
import o4.h;

class q extends t {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f7370s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f7371e;

    /* renamed from: f  reason: collision with root package name */
    private final int f7372f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f7373g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f7374h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f7375i = new j(this);

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f7376j = new k(this);

    /* renamed from: k  reason: collision with root package name */
    private final c.b f7377k = new l(this);

    /* renamed from: l  reason: collision with root package name */
    private boolean f7378l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7379m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7380n;

    /* renamed from: o  reason: collision with root package name */
    private long f7381o = Long.MAX_VALUE;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f7382p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f7383q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f7384r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f7384r.start();
        }
    }

    q(s sVar) {
        super(sVar);
        Context context = sVar.getContext();
        int i10 = o4.a.motionDurationShort3;
        this.f7372f = d.f(context, i10, 67);
        this.f7371e = d.f(sVar.getContext(), i10, 50);
        this.f7373g = d.g(sVar.getContext(), o4.a.motionEasingLinearInterpolator, p4.a.f14445a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f7373g);
        ofFloat.setDuration((long) i10);
        ofFloat.addUpdateListener(new m(this));
        return ofFloat;
    }

    private void F() {
        this.f7384r = E(this.f7372f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f7371e, 1.0f, 0.0f);
        this.f7383q = E;
        E.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f7381o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f7374h.isPopupShowing();
        O(isPopupShowing);
        this.f7379m = isPopupShowing;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f7418d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f7378l = z10;
        r();
        if (!z10) {
            O(false);
            this.f7379m = false;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        AutoCompleteTextView autoCompleteTextView = this.f7374h;
        if (autoCompleteTextView != null && !r.a(autoCompleteTextView)) {
            h0.C0(this.f7418d, z10 ? 2 : 1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f7379m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f7380n != z10) {
            this.f7380n = z10;
            this.f7384r.cancel();
            this.f7383q.start();
        }
    }

    private void P() {
        this.f7374h.setOnTouchListener(new o(this));
        if (f7370s) {
            this.f7374h.setOnDismissListener(new p(this));
        }
        this.f7374h.setThreshold(0);
    }

    private void Q() {
        if (this.f7374h != null) {
            if (G()) {
                this.f7379m = false;
            }
            if (!this.f7379m) {
                if (f7370s) {
                    O(!this.f7380n);
                } else {
                    this.f7380n = !this.f7380n;
                    r();
                }
                if (this.f7380n) {
                    this.f7374h.requestFocus();
                    this.f7374h.showDropDown();
                    return;
                }
                this.f7374h.dismissDropDown();
                return;
            }
            this.f7379m = false;
        }
    }

    private void R() {
        this.f7379m = true;
        this.f7381o = System.currentTimeMillis();
    }

    public void a(Editable editable) {
        if (this.f7382p.isTouchExplorationEnabled() && r.a(this.f7374h) && !this.f7418d.hasFocus()) {
            this.f7374h.dismissDropDown();
        }
        this.f7374h.post(new n(this));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h.exposed_dropdown_menu_content_description;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return f7370s ? o4.d.mtrl_dropdown_arrow : o4.d.mtrl_ic_arrow_drop_down;
    }

    /* access modifiers changed from: package-private */
    public View.OnFocusChangeListener e() {
        return this.f7376j;
    }

    /* access modifiers changed from: package-private */
    public View.OnClickListener f() {
        return this.f7375i;
    }

    public c.b h() {
        return this.f7377k;
    }

    /* access modifiers changed from: package-private */
    public boolean i(int i10) {
        return i10 != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f7378l;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f7380n;
    }

    public void n(EditText editText) {
        this.f7374h = D(editText);
        P();
        this.f7415a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f7382p.isTouchExplorationEnabled()) {
            h0.C0(this.f7418d, 2);
        }
        this.f7415a.setEndIconVisible(true);
    }

    public void o(View view, androidx.core.view.accessibility.h0 h0Var) {
        if (!r.a(this.f7374h)) {
            h0Var.b0(Spinner.class.getName());
        }
        if (h0Var.M()) {
            h0Var.l0((CharSequence) null);
        }
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (this.f7382p.isEnabled() && !r.a(this.f7374h)) {
            boolean z10 = accessibilityEvent.getEventType() == 32768 && this.f7380n && !this.f7374h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                Q();
                R();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        F();
        this.f7382p = (AccessibilityManager) this.f7417c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public boolean t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f7374h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f7370s) {
                this.f7374h.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
