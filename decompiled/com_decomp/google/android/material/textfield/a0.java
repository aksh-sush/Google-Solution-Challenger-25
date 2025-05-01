package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f1;
import androidx.core.view.h0;
import androidx.core.view.r;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import d5.c;
import o4.e;
import o4.g;
import o4.j;

class a0 extends LinearLayout {

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout f7336e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f7337f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f7338g;

    /* renamed from: h  reason: collision with root package name */
    private final CheckableImageButton f7339h;

    /* renamed from: i  reason: collision with root package name */
    private ColorStateList f7340i;

    /* renamed from: j  reason: collision with root package name */
    private PorterDuff.Mode f7341j;

    /* renamed from: k  reason: collision with root package name */
    private int f7342k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView.ScaleType f7343l;

    /* renamed from: m  reason: collision with root package name */
    private View.OnLongClickListener f7344m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7345n;

    a0(TextInputLayout textInputLayout, f1 f1Var) {
        super(textInputLayout.getContext());
        this.f7336e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(g.design_text_input_start_icon, this, false);
        this.f7339h = checkableImageButton;
        u.e(checkableImageButton);
        c0 c0Var = new c0(getContext());
        this.f7337f = c0Var;
        j(f1Var);
        i(f1Var);
        addView(checkableImageButton);
        addView(c0Var);
    }

    private void C() {
        int i10 = 8;
        int i11 = (this.f7338g == null || this.f7345n) ? 8 : 0;
        if (this.f7339h.getVisibility() == 0 || i11 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f7337f.setVisibility(i11);
        this.f7336e.o0();
    }

    private void i(f1 f1Var) {
        this.f7337f.setVisibility(8);
        this.f7337f.setId(e.textinput_prefix_text);
        this.f7337f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        h0.u0(this.f7337f, 1);
        o(f1Var.n(j.f14090w6, 0));
        int i10 = j.f14098x6;
        if (f1Var.s(i10)) {
            p(f1Var.c(i10));
        }
        n(f1Var.p(j.f14082v6));
    }

    private void j(f1 f1Var) {
        if (c.g(getContext())) {
            r.c((ViewGroup.MarginLayoutParams) this.f7339h.getLayoutParams(), 0);
        }
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        int i10 = j.D6;
        if (f1Var.s(i10)) {
            this.f7340i = c.b(getContext(), f1Var, i10);
        }
        int i11 = j.E6;
        if (f1Var.s(i11)) {
            this.f7341j = v.i(f1Var.k(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = j.A6;
        if (f1Var.s(i12)) {
            s(f1Var.g(i12));
            int i13 = j.f14114z6;
            if (f1Var.s(i13)) {
                r(f1Var.p(i13));
            }
            q(f1Var.a(j.f14106y6, true));
        }
        t(f1Var.f(j.B6, getResources().getDimensionPixelSize(o4.c.mtrl_min_touch_target_size)));
        int i14 = j.C6;
        if (f1Var.s(i14)) {
            w(u.b(f1Var.k(i14, -1)));
        }
    }

    /* access modifiers changed from: package-private */
    public void A(androidx.core.view.accessibility.h0 h0Var) {
        View view;
        if (this.f7337f.getVisibility() == 0) {
            h0Var.m0(this.f7337f);
            view = this.f7337f;
        } else {
            view = this.f7339h;
        }
        h0Var.A0(view);
    }

    /* access modifiers changed from: package-private */
    public void B() {
        EditText editText = this.f7336e.f7291h;
        if (editText != null) {
            h0.G0(this.f7337f, k() ? 0 : h0.J(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(o4.c.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f7338g;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f7337f.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return h0.J(this) + h0.J(this.f7337f) + (k() ? this.f7339h.getMeasuredWidth() + r.a((ViewGroup.MarginLayoutParams) this.f7339h.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView d() {
        return this.f7337f;
    }

    /* access modifiers changed from: package-private */
    public CharSequence e() {
        return this.f7339h.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable f() {
        return this.f7339h.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f7342k;
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType h() {
        return this.f7343l;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f7339h.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void l(boolean z10) {
        this.f7345n = z10;
        C();
    }

    /* access modifiers changed from: package-private */
    public void m() {
        u.d(this.f7336e, this.f7339h, this.f7340i);
    }

    /* access modifiers changed from: package-private */
    public void n(CharSequence charSequence) {
        this.f7338g = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7337f.setText(charSequence);
        C();
    }

    /* access modifiers changed from: package-private */
    public void o(int i10) {
        androidx.core.widget.j.n(this.f7337f, i10);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    /* access modifiers changed from: package-private */
    public void p(ColorStateList colorStateList) {
        this.f7337f.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        this.f7339h.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f7339h.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(Drawable drawable) {
        this.f7339h.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f7336e, this.f7339h, this.f7340i, this.f7341j);
            z(true);
            m();
            return;
        }
        z(false);
        u((View.OnClickListener) null);
        v((View.OnLongClickListener) null);
        r((CharSequence) null);
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i10 != this.f7342k) {
            this.f7342k = i10;
            u.g(this.f7339h, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(View.OnClickListener onClickListener) {
        u.h(this.f7339h, onClickListener, this.f7344m);
    }

    /* access modifiers changed from: package-private */
    public void v(View.OnLongClickListener onLongClickListener) {
        this.f7344m = onLongClickListener;
        u.i(this.f7339h, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void w(ImageView.ScaleType scaleType) {
        this.f7343l = scaleType;
        u.j(this.f7339h, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void x(ColorStateList colorStateList) {
        if (this.f7340i != colorStateList) {
            this.f7340i = colorStateList;
            u.a(this.f7336e, this.f7339h, colorStateList, this.f7341j);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(PorterDuff.Mode mode) {
        if (this.f7341j != mode) {
            this.f7341j = mode;
            u.a(this.f7336e, this.f7339h, this.f7340i, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void z(boolean z10) {
        if (k() != z10) {
            this.f7339h.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
