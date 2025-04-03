package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.h0;
import androidx.core.widget.j;
import b5.d;
import java.util.ArrayList;
import java.util.List;
import o4.c;
import o4.e;

final class v {
    private ColorStateList A;
    private Typeface B;

    /* renamed from: a  reason: collision with root package name */
    private final int f7419a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7420b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7421c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f7422d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f7423e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f7424f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f7425g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f7426h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f7427i;

    /* renamed from: j  reason: collision with root package name */
    private int f7428j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f7429k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Animator f7430l;

    /* renamed from: m  reason: collision with root package name */
    private final float f7431m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f7432n;

    /* renamed from: o  reason: collision with root package name */
    private int f7433o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f7434p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7435q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public TextView f7436r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f7437s;

    /* renamed from: t  reason: collision with root package name */
    private int f7438t;

    /* renamed from: u  reason: collision with root package name */
    private int f7439u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f7440v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f7441w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7442x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f7443y;

    /* renamed from: z  reason: collision with root package name */
    private int f7444z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f7446b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f7447c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f7448d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f7445a = i10;
            this.f7446b = textView;
            this.f7447c = i11;
            this.f7448d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = v.this.f7432n = this.f7445a;
            Animator unused2 = v.this.f7430l = null;
            TextView textView = this.f7446b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f7447c == 1 && v.this.f7436r != null) {
                    v.this.f7436r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f7448d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f7448d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f7448d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f7448d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f7426h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7425g = context;
        this.f7426h = textInputLayout;
        this.f7431m = (float) context.getResources().getDimensionPixelSize(c.design_textinput_caption_translate_y);
        int i10 = o4.a.motionDurationShort4;
        this.f7419a = d.f(context, i10, 217);
        this.f7420b = d.f(context, o4.a.motionDurationMedium4, 167);
        this.f7421c = d.f(context, i10, 167);
        int i11 = o4.a.motionEasingEmphasizedDecelerateInterpolator;
        this.f7422d = d.g(context, i11, p4.a.f14448d);
        TimeInterpolator timeInterpolator = p4.a.f14445a;
        this.f7423e = d.g(context, i11, timeInterpolator);
        this.f7424f = d.g(context, o4.a.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 != i11) {
            if (!(i11 == 0 || (m11 = m(i11)) == null)) {
                m11.setVisibility(0);
                m11.setAlpha(1.0f);
            }
            if (!(i10 == 0 || (m10 = m(i10)) == null)) {
                m10.setVisibility(4);
                if (i10 == 1) {
                    m10.setText((CharSequence) null);
                }
            }
            this.f7432n = i11;
        }
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return h0.W(this.f7426h) && this.f7426h.isEnabled() && (this.f7433o != this.f7432n || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i10, int i11, boolean z10) {
        boolean z11 = z10;
        if (i10 != i11) {
            if (z11) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f7430l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i12 = i10;
                int i13 = i11;
                i(arrayList2, this.f7442x, this.f7443y, 2, i12, i13);
                i(arrayList2, this.f7435q, this.f7436r, 1, i12, i13);
                p4.b.a(animatorSet, arrayList);
                animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
                animatorSet.start();
            } else {
                D(i10, i11);
            }
            this.f7426h.p0();
            this.f7426h.u0(z11);
            this.f7426h.A0();
        }
    }

    private boolean g() {
        return (this.f7427i == null || this.f7426h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            boolean z11 = false;
            if (i10 == i12 || i10 == i11) {
                ObjectAnimator j10 = j(textView, i12 == i10);
                if (i10 == i12 && i11 != 0) {
                    z11 = true;
                }
                if (z11) {
                    j10.setStartDelay((long) this.f7421c);
                }
                list.add(j10);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator k10 = k(textView);
                    k10.setStartDelay((long) this.f7421c);
                    list.add(k10);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{z10 ? 1.0f : 0.0f});
        ofFloat.setDuration((long) (z10 ? this.f7420b : this.f7421c));
        ofFloat.setInterpolator(z10 ? this.f7423e : this.f7424f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f7431m, 0.0f});
        ofFloat.setDuration((long) this.f7419a);
        ofFloat.setInterpolator(this.f7422d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f7436r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f7443y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f7425g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return i10 == 1 && this.f7436r != null && !TextUtils.isEmpty(this.f7434p);
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f7435q;
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return this.f7442x;
    }

    /* access modifiers changed from: package-private */
    public void C(TextView textView, int i10) {
        ViewGroup viewGroup;
        if (this.f7427i != null) {
            if (!z(i10) || (viewGroup = this.f7429k) == null) {
                viewGroup = this.f7427i;
            }
            viewGroup.removeView(textView);
            int i11 = this.f7428j - 1;
            this.f7428j = i11;
            O(this.f7427i, i11);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        this.f7438t = i10;
        TextView textView = this.f7436r;
        if (textView != null) {
            h0.u0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f7437s = charSequence;
        TextView textView = this.f7436r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z10) {
        if (this.f7435q != z10) {
            h();
            if (z10) {
                c0 c0Var = new c0(this.f7425g);
                this.f7436r = c0Var;
                c0Var.setId(e.textinput_error);
                this.f7436r.setTextAlignment(5);
                Typeface typeface = this.B;
                if (typeface != null) {
                    this.f7436r.setTypeface(typeface);
                }
                H(this.f7439u);
                I(this.f7440v);
                F(this.f7437s);
                E(this.f7438t);
                this.f7436r.setVisibility(4);
                e(this.f7436r, 0);
            } else {
                w();
                C(this.f7436r, 0);
                this.f7436r = null;
                this.f7426h.p0();
                this.f7426h.A0();
            }
            this.f7435q = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void H(int i10) {
        this.f7439u = i10;
        TextView textView = this.f7436r;
        if (textView != null) {
            this.f7426h.c0(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f7440v = colorStateList;
        TextView textView = this.f7436r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        this.f7444z = i10;
        TextView textView = this.f7443y;
        if (textView != null) {
            j.n(textView, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(boolean z10) {
        if (this.f7442x != z10) {
            h();
            if (z10) {
                c0 c0Var = new c0(this.f7425g);
                this.f7443y = c0Var;
                c0Var.setId(e.textinput_helper_text);
                this.f7443y.setTextAlignment(5);
                Typeface typeface = this.B;
                if (typeface != null) {
                    this.f7443y.setTypeface(typeface);
                }
                this.f7443y.setVisibility(4);
                h0.u0(this.f7443y, 1);
                J(this.f7444z);
                L(this.A);
                e(this.f7443y, 1);
                this.f7443y.setAccessibilityDelegate(new b());
            } else {
                x();
                C(this.f7443y, 1);
                this.f7443y = null;
                this.f7426h.p0();
                this.f7426h.A0();
            }
            this.f7442x = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f7443y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f7436r, typeface);
            M(this.f7443y, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f7434p = charSequence;
        this.f7436r.setText(charSequence);
        int i10 = this.f7432n;
        if (i10 != 1) {
            this.f7433o = 1;
        }
        S(i10, this.f7433o, P(this.f7436r, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f7441w = charSequence;
        this.f7443y.setText(charSequence);
        int i10 = this.f7432n;
        if (i10 != 2) {
            this.f7433o = 2;
        }
        S(i10, this.f7433o, P(this.f7443y, charSequence));
    }

    /* access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f7427i == null && this.f7429k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f7425g);
            this.f7427i = linearLayout;
            linearLayout.setOrientation(0);
            this.f7426h.addView(this.f7427i, -1, -2);
            this.f7429k = new FrameLayout(this.f7425g);
            this.f7427i.addView(this.f7429k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f7426h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f7429k.setVisibility(0);
            this.f7429k.addView(textView);
        } else {
            this.f7427i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7427i.setVisibility(0);
        this.f7428j++;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f7426h.getEditText();
            boolean g10 = d5.c.g(this.f7425g);
            LinearLayout linearLayout = this.f7427i;
            int i10 = c.material_helper_text_font_1_3_padding_horizontal;
            h0.G0(linearLayout, v(g10, i10, h0.J(editText)), v(g10, c.material_helper_text_font_1_3_padding_top, this.f7425g.getResources().getDimensionPixelSize(c.material_helper_text_default_padding_top)), v(g10, i10, h0.I(editText)), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Animator animator = this.f7430l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f7433o);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return this.f7438t;
    }

    /* access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f7437s;
    }

    /* access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f7434p;
    }

    /* access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f7436r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f7436r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f7441w;
    }

    /* access modifiers changed from: package-private */
    public View t() {
        return this.f7443y;
    }

    /* access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f7443y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.f7434p = null;
        h();
        if (this.f7432n == 1) {
            this.f7433o = (!this.f7442x || TextUtils.isEmpty(this.f7441w)) ? 0 : 2;
        }
        S(this.f7432n, this.f7433o, P(this.f7436r, ""));
    }

    /* access modifiers changed from: package-private */
    public void x() {
        h();
        int i10 = this.f7432n;
        if (i10 == 2) {
            this.f7433o = 0;
        }
        S(i10, this.f7433o, P(this.f7443y, ""));
    }

    /* access modifiers changed from: package-private */
    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
