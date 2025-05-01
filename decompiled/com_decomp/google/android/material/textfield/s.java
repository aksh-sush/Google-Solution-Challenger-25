package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.f1;
import androidx.core.view.accessibility.c;
import androidx.core.view.h0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.r;
import com.google.android.material.internal.v;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.e;
import o4.g;
import o4.h;
import o4.j;

class s extends LinearLayout {
    private final TextInputLayout.f A;

    /* renamed from: e  reason: collision with root package name */
    final TextInputLayout f7386e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f7387f;

    /* renamed from: g  reason: collision with root package name */
    private final CheckableImageButton f7388g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f7389h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f7390i;

    /* renamed from: j  reason: collision with root package name */
    private View.OnLongClickListener f7391j;

    /* renamed from: k  reason: collision with root package name */
    private final CheckableImageButton f7392k;

    /* renamed from: l  reason: collision with root package name */
    private final d f7393l;

    /* renamed from: m  reason: collision with root package name */
    private int f7394m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final LinkedHashSet f7395n = new LinkedHashSet();

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f7396o;

    /* renamed from: p  reason: collision with root package name */
    private PorterDuff.Mode f7397p;

    /* renamed from: q  reason: collision with root package name */
    private int f7398q;

    /* renamed from: r  reason: collision with root package name */
    private ImageView.ScaleType f7399r;

    /* renamed from: s  reason: collision with root package name */
    private View.OnLongClickListener f7400s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f7401t;

    /* renamed from: u  reason: collision with root package name */
    private final TextView f7402u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7403v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public EditText f7404w;

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager f7405x;

    /* renamed from: y  reason: collision with root package name */
    private c.b f7406y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final TextWatcher f7407z = new a();

    class a extends r {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            s.this.m().a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            s.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        public void a(TextInputLayout textInputLayout) {
            if (s.this.f7404w != textInputLayout.getEditText()) {
                if (s.this.f7404w != null) {
                    s.this.f7404w.removeTextChangedListener(s.this.f7407z);
                    if (s.this.f7404w.getOnFocusChangeListener() == s.this.m().e()) {
                        s.this.f7404w.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = s.this.f7404w = textInputLayout.getEditText();
                if (s.this.f7404w != null) {
                    s.this.f7404w.addTextChangedListener(s.this.f7407z);
                }
                s.this.m().n(s.this.f7404w);
                s sVar = s.this;
                sVar.h0(sVar.m());
            }
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        public void onViewAttachedToWindow(View view) {
            s.this.g();
        }

        public void onViewDetachedFromWindow(View view) {
            s.this.M();
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray f7411a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        private final s f7412b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f7413c;

        /* renamed from: d  reason: collision with root package name */
        private final int f7414d;

        d(s sVar, f1 f1Var) {
            this.f7412b = sVar;
            this.f7413c = f1Var.n(j.Q5, 0);
            this.f7414d = f1Var.n(j.f14026o6, 0);
        }

        private t b(int i10) {
            if (i10 == -1) {
                return new g(this.f7412b);
            }
            if (i10 == 0) {
                return new x(this.f7412b);
            }
            if (i10 == 1) {
                return new z(this.f7412b, this.f7414d);
            }
            if (i10 == 2) {
                return new f(this.f7412b);
            }
            if (i10 == 3) {
                return new q(this.f7412b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        /* access modifiers changed from: package-private */
        public t c(int i10) {
            t tVar = (t) this.f7411a.get(i10);
            if (tVar != null) {
                return tVar;
            }
            t b10 = b(i10);
            this.f7411a.append(i10, b10);
            return b10;
        }
    }

    s(TextInputLayout textInputLayout, f1 f1Var) {
        super(textInputLayout.getContext());
        b bVar = new b();
        this.A = bVar;
        this.f7405x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7386e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7387f = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, e.text_input_error_icon);
        this.f7388g = i10;
        CheckableImageButton i11 = i(frameLayout, from, e.text_input_end_icon);
        this.f7392k = i11;
        this.f7393l = new d(this, f1Var);
        c0 c0Var = new c0(getContext());
        this.f7402u = c0Var;
        C(f1Var);
        B(f1Var);
        D(f1Var);
        frameLayout.addView(i11);
        addView(c0Var);
        addView(frameLayout);
        addView(i10);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(f1 f1Var) {
        int i10 = j.f14034p6;
        if (!f1Var.s(i10)) {
            int i11 = j.U5;
            if (f1Var.s(i11)) {
                this.f7396o = d5.c.b(getContext(), f1Var, i11);
            }
            int i12 = j.V5;
            if (f1Var.s(i12)) {
                this.f7397p = v.i(f1Var.k(i12, -1), (PorterDuff.Mode) null);
            }
        }
        int i13 = j.S5;
        if (f1Var.s(i13)) {
            U(f1Var.k(i13, 0));
            int i14 = j.P5;
            if (f1Var.s(i14)) {
                Q(f1Var.p(i14));
            }
            O(f1Var.a(j.O5, true));
        } else if (f1Var.s(i10)) {
            int i15 = j.f14042q6;
            if (f1Var.s(i15)) {
                this.f7396o = d5.c.b(getContext(), f1Var, i15);
            }
            int i16 = j.f14050r6;
            if (f1Var.s(i16)) {
                this.f7397p = v.i(f1Var.k(i16, -1), (PorterDuff.Mode) null);
            }
            U(f1Var.a(i10, false) ? 1 : 0);
            Q(f1Var.p(j.f14018n6));
        }
        T(f1Var.f(j.R5, getResources().getDimensionPixelSize(o4.c.mtrl_min_touch_target_size)));
        int i17 = j.T5;
        if (f1Var.s(i17)) {
            X(u.b(f1Var.k(i17, -1)));
        }
    }

    private void C(f1 f1Var) {
        int i10 = j.f13914a6;
        if (f1Var.s(i10)) {
            this.f7389h = d5.c.b(getContext(), f1Var, i10);
        }
        int i11 = j.f13922b6;
        if (f1Var.s(i11)) {
            this.f7390i = v.i(f1Var.k(i11, -1), (PorterDuff.Mode) null);
        }
        int i12 = j.Z5;
        if (f1Var.s(i12)) {
            c0(f1Var.g(i12));
        }
        this.f7388g.setContentDescription(getResources().getText(h.error_icon_content_description));
        h0.C0(this.f7388g, 2);
        this.f7388g.setClickable(false);
        this.f7388g.setPressable(false);
        this.f7388g.setFocusable(false);
    }

    private void D(f1 f1Var) {
        this.f7402u.setVisibility(8);
        this.f7402u.setId(e.textinput_suffix_text);
        this.f7402u.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        h0.u0(this.f7402u, 1);
        q0(f1Var.n(j.G6, 0));
        int i10 = j.H6;
        if (f1Var.s(i10)) {
            r0(f1Var.c(i10));
        }
        p0(f1Var.p(j.F6));
    }

    /* access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        c.b bVar = this.f7406y;
        if (bVar != null && (accessibilityManager = this.f7405x) != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, bVar);
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f7406y != null && this.f7405x != null && h0.V(this)) {
            androidx.core.view.accessibility.c.a(this.f7405x, this.f7406y);
        }
    }

    /* access modifiers changed from: private */
    public void h0(t tVar) {
        if (this.f7404w != null) {
            if (tVar.e() != null) {
                this.f7404w.setOnFocusChangeListener(tVar.e());
            }
            if (tVar.g() != null) {
                this.f7392k.setOnFocusChangeListener(tVar.g());
            }
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(g.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        u.e(checkableImageButton);
        if (d5.c.g(getContext())) {
            androidx.core.view.r.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f7395n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void s0(t tVar) {
        tVar.s();
        this.f7406y = tVar.h();
        g();
    }

    private int t(t tVar) {
        int a10 = this.f7393l.f7413c;
        return a10 == 0 ? tVar.d() : a10;
    }

    private void t0(t tVar) {
        M();
        this.f7406y = null;
        tVar.u();
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            u.a(this.f7386e, this.f7392k, this.f7396o, this.f7397p);
            return;
        }
        Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
        androidx.core.graphics.drawable.a.n(mutate, this.f7386e.getErrorCurrentTextColors());
        this.f7392k.setImageDrawable(mutate);
    }

    private void v0() {
        int i10 = 8;
        this.f7387f.setVisibility((this.f7392k.getVisibility() != 0 || G()) ? 8 : 0);
        if (F() || G() || ((this.f7401t == null || this.f7403v) ? (char) 8 : 0) == 0) {
            i10 = 0;
        }
        setVisibility(i10);
    }

    private void w0() {
        int i10 = 0;
        boolean z10 = s() != null && this.f7386e.N() && this.f7386e.d0();
        CheckableImageButton checkableImageButton = this.f7388g;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        v0();
        x0();
        if (!A()) {
            this.f7386e.o0();
        }
    }

    private void y0() {
        int visibility = this.f7402u.getVisibility();
        boolean z10 = false;
        int i10 = (this.f7401t == null || this.f7403v) ? 8 : 0;
        if (visibility != i10) {
            t m10 = m();
            if (i10 == 0) {
                z10 = true;
            }
            m10.q(z10);
        }
        v0();
        this.f7402u.setVisibility(i10);
        this.f7386e.o0();
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f7394m != 0;
    }

    /* access modifiers changed from: package-private */
    public boolean E() {
        return A() && this.f7392k.isChecked();
    }

    /* access modifiers changed from: package-private */
    public boolean F() {
        return this.f7387f.getVisibility() == 0 && this.f7392k.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean G() {
        return this.f7388g.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z10) {
        this.f7403v = z10;
        y0();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f7386e.d0());
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        u.d(this.f7386e, this.f7392k, this.f7396o);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        u.d(this.f7386e, this.f7388g, this.f7389h);
    }

    /* access modifiers changed from: package-private */
    public void L(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        t m10 = m();
        boolean z12 = true;
        if (!m10.l() || (isChecked = this.f7392k.isChecked()) == m10.m()) {
            z11 = false;
        } else {
            this.f7392k.setChecked(!isChecked);
            z11 = true;
        }
        if (!m10.j() || (isActivated = this.f7392k.isActivated()) == m10.k()) {
            z12 = z11;
        } else {
            N(!isActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z10) {
        this.f7392k.setActivated(z10);
    }

    /* access modifiers changed from: package-private */
    public void O(boolean z10) {
        this.f7392k.setCheckable(z10);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f7392k.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(int i10) {
        S(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void S(Drawable drawable) {
        this.f7392k.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f7386e, this.f7392k, this.f7396o, this.f7397p);
            J();
        }
    }

    /* access modifiers changed from: package-private */
    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i10 != this.f7398q) {
            this.f7398q = i10;
            u.g(this.f7392k, i10);
            u.g(this.f7388g, i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        if (this.f7394m != i10) {
            t0(m());
            int i11 = this.f7394m;
            this.f7394m = i10;
            j(i11);
            a0(i10 != 0);
            t m10 = m();
            R(t(m10));
            P(m10.c());
            O(m10.l());
            if (m10.i(this.f7386e.getBoxBackgroundMode())) {
                s0(m10);
                V(m10.f());
                EditText editText = this.f7404w;
                if (editText != null) {
                    m10.n(editText);
                    h0(m10);
                }
                u.a(this.f7386e, this.f7392k, this.f7396o, this.f7397p);
                L(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f7386e.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void V(View.OnClickListener onClickListener) {
        u.h(this.f7392k, onClickListener, this.f7400s);
    }

    /* access modifiers changed from: package-private */
    public void W(View.OnLongClickListener onLongClickListener) {
        this.f7400s = onLongClickListener;
        u.i(this.f7392k, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void X(ImageView.ScaleType scaleType) {
        this.f7399r = scaleType;
        u.j(this.f7392k, scaleType);
        u.j(this.f7388g, scaleType);
    }

    /* access modifiers changed from: package-private */
    public void Y(ColorStateList colorStateList) {
        if (this.f7396o != colorStateList) {
            this.f7396o = colorStateList;
            u.a(this.f7386e, this.f7392k, colorStateList, this.f7397p);
        }
    }

    /* access modifiers changed from: package-private */
    public void Z(PorterDuff.Mode mode) {
        if (this.f7397p != mode) {
            this.f7397p = mode;
            u.a(this.f7386e, this.f7392k, this.f7396o, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void a0(boolean z10) {
        if (F() != z10) {
            this.f7392k.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f7386e.o0();
        }
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        c0(i10 != 0 ? g.a.b(getContext(), i10) : null);
        K();
    }

    /* access modifiers changed from: package-private */
    public void c0(Drawable drawable) {
        this.f7388g.setImageDrawable(drawable);
        w0();
        u.a(this.f7386e, this.f7388g, this.f7389h, this.f7390i);
    }

    /* access modifiers changed from: package-private */
    public void d0(View.OnClickListener onClickListener) {
        u.h(this.f7388g, onClickListener, this.f7391j);
    }

    /* access modifiers changed from: package-private */
    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f7391j = onLongClickListener;
        u.i(this.f7388g, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    public void f0(ColorStateList colorStateList) {
        if (this.f7389h != colorStateList) {
            this.f7389h = colorStateList;
            u.a(this.f7386e, this.f7388g, colorStateList, this.f7390i);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(PorterDuff.Mode mode) {
        if (this.f7390i != mode) {
            this.f7390i = mode;
            u.a(this.f7386e, this.f7388g, this.f7389h, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        this.f7392k.performClick();
        this.f7392k.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* access modifiers changed from: package-private */
    public void j0(CharSequence charSequence) {
        this.f7392k.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (G()) {
            return this.f7388g;
        }
        if (!A() || !F()) {
            return null;
        }
        return this.f7392k;
    }

    /* access modifiers changed from: package-private */
    public void k0(int i10) {
        l0(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    /* access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f7392k.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public void l0(Drawable drawable) {
        this.f7392k.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public t m() {
        return this.f7393l.c(this.f7394m);
    }

    /* access modifiers changed from: package-private */
    public void m0(boolean z10) {
        if (z10 && this.f7394m != 1) {
            U(1);
        } else if (!z10) {
            U(0);
        }
    }

    /* access modifiers changed from: package-private */
    public Drawable n() {
        return this.f7392k.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public void n0(ColorStateList colorStateList) {
        this.f7396o = colorStateList;
        u.a(this.f7386e, this.f7392k, colorStateList, this.f7397p);
    }

    /* access modifiers changed from: package-private */
    public int o() {
        return this.f7398q;
    }

    /* access modifiers changed from: package-private */
    public void o0(PorterDuff.Mode mode) {
        this.f7397p = mode;
        u.a(this.f7386e, this.f7392k, this.f7396o, mode);
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f7394m;
    }

    /* access modifiers changed from: package-private */
    public void p0(CharSequence charSequence) {
        this.f7401t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f7402u.setText(charSequence);
        y0();
    }

    /* access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.f7399r;
    }

    /* access modifiers changed from: package-private */
    public void q0(int i10) {
        androidx.core.widget.j.n(this.f7402u, i10);
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f7392k;
    }

    /* access modifiers changed from: package-private */
    public void r0(ColorStateList colorStateList) {
        this.f7402u.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public Drawable s() {
        return this.f7388g.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f7392k.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    public Drawable v() {
        return this.f7392k.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public CharSequence w() {
        return this.f7401t;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.f7402u.getTextColors();
    }

    /* access modifiers changed from: package-private */
    public void x0() {
        if (this.f7386e.f7291h != null) {
            h0.G0(this.f7402u, getContext().getResources().getDimensionPixelSize(o4.c.material_input_text_to_prefix_suffix_padding), this.f7386e.f7291h.getPaddingTop(), (F() || G()) ? 0 : h0.I(this.f7386e.f7291h), this.f7386e.f7291h.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    public int y() {
        return h0.I(this) + h0.I(this.f7402u) + ((F() || G()) ? this.f7392k.getMeasuredWidth() + androidx.core.view.r.b((ViewGroup.MarginLayoutParams) this.f7392k.getLayoutParams()) : 0);
    }

    /* access modifiers changed from: package-private */
    public TextView z() {
        return this.f7402u;
    }
}
