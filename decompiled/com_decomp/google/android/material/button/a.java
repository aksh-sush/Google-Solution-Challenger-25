package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.view.h0;
import com.google.android.material.internal.v;
import d5.c;
import e5.b;
import g5.g;
import g5.k;
import g5.n;
import o4.j;

class a {

    /* renamed from: u  reason: collision with root package name */
    private static final boolean f6869u = true;

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f6870v;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f6871a;

    /* renamed from: b  reason: collision with root package name */
    private k f6872b;

    /* renamed from: c  reason: collision with root package name */
    private int f6873c;

    /* renamed from: d  reason: collision with root package name */
    private int f6874d;

    /* renamed from: e  reason: collision with root package name */
    private int f6875e;

    /* renamed from: f  reason: collision with root package name */
    private int f6876f;

    /* renamed from: g  reason: collision with root package name */
    private int f6877g;

    /* renamed from: h  reason: collision with root package name */
    private int f6878h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuff.Mode f6879i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f6880j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f6881k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f6882l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f6883m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6884n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6885o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6886p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6887q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6888r = true;

    /* renamed from: s  reason: collision with root package name */
    private LayerDrawable f6889s;

    /* renamed from: t  reason: collision with root package name */
    private int f6890t;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        if (i10 > 22) {
            z10 = false;
        }
        f6870v = z10;
    }

    a(MaterialButton materialButton, k kVar) {
        this.f6871a = materialButton;
        this.f6872b = kVar;
    }

    private void G(int i10, int i11) {
        int J = h0.J(this.f6871a);
        int paddingTop = this.f6871a.getPaddingTop();
        int I = h0.I(this.f6871a);
        int paddingBottom = this.f6871a.getPaddingBottom();
        int i12 = this.f6875e;
        int i13 = this.f6876f;
        this.f6876f = i11;
        this.f6875e = i10;
        if (!this.f6885o) {
            H();
        }
        h0.G0(this.f6871a, J, (paddingTop + i10) - i12, I, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f6871a.setInternalBackground(a());
        g f10 = f();
        if (f10 != null) {
            f10.S((float) this.f6890t);
            f10.setState(this.f6871a.getDrawableState());
        }
    }

    private void I(k kVar) {
        if (!f6870v || this.f6885o) {
            if (f() != null) {
                f().setShapeAppearanceModel(kVar);
            }
            if (n() != null) {
                n().setShapeAppearanceModel(kVar);
            }
            if (e() != null) {
                e().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        int J = h0.J(this.f6871a);
        int paddingTop = this.f6871a.getPaddingTop();
        int I = h0.I(this.f6871a);
        int paddingBottom = this.f6871a.getPaddingBottom();
        H();
        h0.G0(this.f6871a, J, paddingTop, I, paddingBottom);
    }

    private void K() {
        g f10 = f();
        g n10 = n();
        if (f10 != null) {
            f10.Y((float) this.f6878h, this.f6881k);
            if (n10 != null) {
                n10.X((float) this.f6878h, this.f6884n ? v4.a.d(this.f6871a, o4.a.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f6873c, this.f6875e, this.f6874d, this.f6876f);
    }

    private Drawable a() {
        g gVar = new g(this.f6872b);
        gVar.J(this.f6871a.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f6880j);
        PorterDuff.Mode mode = this.f6879i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.Y((float) this.f6878h, this.f6881k);
        g gVar2 = new g(this.f6872b);
        gVar2.setTint(0);
        gVar2.X((float) this.f6878h, this.f6884n ? v4.a.d(this.f6871a, o4.a.colorSurface) : 0);
        if (f6869u) {
            g gVar3 = new g(this.f6872b);
            this.f6883m = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.b(this.f6882l), L(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f6883m);
            this.f6889s = rippleDrawable;
            return rippleDrawable;
        }
        e5.a aVar = new e5.a(this.f6872b);
        this.f6883m = aVar;
        androidx.core.graphics.drawable.a.o(aVar, b.b(this.f6882l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f6883m});
        this.f6889s = layerDrawable;
        return L(layerDrawable);
    }

    private g g(boolean z10) {
        LayerDrawable layerDrawable = this.f6889s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f6869u ? (LayerDrawable) ((InsetDrawable) this.f6889s.getDrawable(0)).getDrawable() : this.f6889s).getDrawable(z10 ^ true ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    /* access modifiers changed from: package-private */
    public void A(boolean z10) {
        this.f6884n = z10;
        K();
    }

    /* access modifiers changed from: package-private */
    public void B(ColorStateList colorStateList) {
        if (this.f6881k != colorStateList) {
            this.f6881k = colorStateList;
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (this.f6878h != i10) {
            this.f6878h = i10;
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        if (this.f6880j != colorStateList) {
            this.f6880j = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f6880j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        if (this.f6879i != mode) {
            this.f6879i = mode;
            if (f() != null && this.f6879i != null) {
                androidx.core.graphics.drawable.a.p(f(), this.f6879i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void F(boolean z10) {
        this.f6888r = z10;
    }

    /* access modifiers changed from: package-private */
    public void J(int i10, int i11) {
        Drawable drawable = this.f6883m;
        if (drawable != null) {
            drawable.setBounds(this.f6873c, this.f6875e, i11 - this.f6874d, i10 - this.f6876f);
        }
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f6877g;
    }

    public int c() {
        return this.f6876f;
    }

    public int d() {
        return this.f6875e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f6889s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f6889s.getNumberOfLayers() > 2 ? this.f6889s.getDrawable(2) : this.f6889s.getDrawable(1));
    }

    /* access modifiers changed from: package-private */
    public g f() {
        return g(false);
    }

    /* access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.f6882l;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return this.f6872b;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList j() {
        return this.f6881k;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f6878h;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList l() {
        return this.f6880j;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode m() {
        return this.f6879i;
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        return this.f6885o;
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f6887q;
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f6888r;
    }

    /* access modifiers changed from: package-private */
    public void r(TypedArray typedArray) {
        this.f6873c = typedArray.getDimensionPixelOffset(j.f13934d2, 0);
        this.f6874d = typedArray.getDimensionPixelOffset(j.f13942e2, 0);
        this.f6875e = typedArray.getDimensionPixelOffset(j.f13950f2, 0);
        this.f6876f = typedArray.getDimensionPixelOffset(j.f13958g2, 0);
        int i10 = j.f13990k2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f6877g = dimensionPixelSize;
            z(this.f6872b.w((float) dimensionPixelSize));
            this.f6886p = true;
        }
        this.f6878h = typedArray.getDimensionPixelSize(j.f14070u2, 0);
        this.f6879i = v.i(typedArray.getInt(j.f13982j2, -1), PorterDuff.Mode.SRC_IN);
        this.f6880j = c.a(this.f6871a.getContext(), typedArray, j.f13974i2);
        this.f6881k = c.a(this.f6871a.getContext(), typedArray, j.f14062t2);
        this.f6882l = c.a(this.f6871a.getContext(), typedArray, j.f14054s2);
        this.f6887q = typedArray.getBoolean(j.f13966h2, false);
        this.f6890t = typedArray.getDimensionPixelSize(j.f13998l2, 0);
        this.f6888r = typedArray.getBoolean(j.f14078v2, true);
        int J = h0.J(this.f6871a);
        int paddingTop = this.f6871a.getPaddingTop();
        int I = h0.I(this.f6871a);
        int paddingBottom = this.f6871a.getPaddingBottom();
        if (typedArray.hasValue(j.f13926c2)) {
            t();
        } else {
            H();
        }
        h0.G0(this.f6871a, J + this.f6873c, paddingTop + this.f6875e, I + this.f6874d, paddingBottom + this.f6876f);
    }

    /* access modifiers changed from: package-private */
    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        this.f6885o = true;
        this.f6871a.setSupportBackgroundTintList(this.f6880j);
        this.f6871a.setSupportBackgroundTintMode(this.f6879i);
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f6887q = z10;
    }

    /* access modifiers changed from: package-private */
    public void v(int i10) {
        if (!this.f6886p || this.f6877g != i10) {
            this.f6877g = i10;
            this.f6886p = true;
            z(this.f6872b.w((float) i10));
        }
    }

    public void w(int i10) {
        G(this.f6875e, i10);
    }

    public void x(int i10) {
        G(i10, this.f6876f);
    }

    /* access modifiers changed from: package-private */
    public void y(ColorStateList colorStateList) {
        if (this.f6882l != colorStateList) {
            this.f6882l = colorStateList;
            boolean z10 = f6869u;
            if (z10 && (this.f6871a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f6871a.getBackground()).setColor(b.b(colorStateList));
            } else if (!z10 && (this.f6871a.getBackground() instanceof e5.a)) {
                ((e5.a) this.f6871a.getBackground()).setTintList(b.b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void z(k kVar) {
        this.f6872b = kVar;
        I(kVar);
    }
}
