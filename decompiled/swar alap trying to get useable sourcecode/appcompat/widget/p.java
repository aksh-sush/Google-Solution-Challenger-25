package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f1262a;

    /* renamed from: b, reason: collision with root package name */
    private d1 f1263b;

    /* renamed from: c, reason: collision with root package name */
    private d1 f1264c;

    /* renamed from: d, reason: collision with root package name */
    private d1 f1265d;

    /* renamed from: e, reason: collision with root package name */
    private int f1266e = 0;

    public p(ImageView imageView) {
        this.f1262a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1265d == null) {
            this.f1265d = new d1();
        }
        d1 d1Var = this.f1265d;
        d1Var.a();
        ColorStateList a10 = androidx.core.widget.e.a(this.f1262a);
        if (a10 != null) {
            d1Var.f1151d = true;
            d1Var.f1148a = a10;
        }
        PorterDuff.Mode b10 = androidx.core.widget.e.b(this.f1262a);
        if (b10 != null) {
            d1Var.f1150c = true;
            d1Var.f1149b = b10;
        }
        if (!d1Var.f1151d && !d1Var.f1150c) {
            return false;
        }
        j.i(drawable, d1Var, this.f1262a.getDrawableState());
        return true;
    }

    private boolean l() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1263b != null : i10 == 21;
    }

    void b() {
        if (this.f1262a.getDrawable() != null) {
            this.f1262a.getDrawable().setLevel(this.f1266e);
        }
    }

    void c() {
        Drawable drawable = this.f1262a.getDrawable();
        if (drawable != null) {
            o0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            d1 d1Var = this.f1264c;
            if (d1Var != null) {
                j.i(drawable, d1Var, this.f1262a.getDrawableState());
                return;
            }
            d1 d1Var2 = this.f1263b;
            if (d1Var2 != null) {
                j.i(drawable, d1Var2, this.f1262a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        d1 d1Var = this.f1264c;
        if (d1Var != null) {
            return d1Var.f1148a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        d1 d1Var = this.f1264c;
        if (d1Var != null) {
            return d1Var.f1149b;
        }
        return null;
    }

    boolean f() {
        return !(this.f1262a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int n10;
        Context context = this.f1262a.getContext();
        int[] iArr = f.j.P;
        f1 v10 = f1.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1262a;
        androidx.core.view.h0.q0(imageView, imageView.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            Drawable drawable = this.f1262a.getDrawable();
            if (drawable == null && (n10 = v10.n(f.j.Q, -1)) != -1 && (drawable = g.a.b(this.f1262a.getContext(), n10)) != null) {
                this.f1262a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                o0.b(drawable);
            }
            int i11 = f.j.R;
            if (v10.s(i11)) {
                androidx.core.widget.e.c(this.f1262a, v10.c(i11));
            }
            int i12 = f.j.S;
            if (v10.s(i12)) {
                androidx.core.widget.e.d(this.f1262a, o0.e(v10.k(i12, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    void h(Drawable drawable) {
        this.f1266e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable b10 = g.a.b(this.f1262a.getContext(), i10);
            if (b10 != null) {
                o0.b(b10);
            }
            this.f1262a.setImageDrawable(b10);
        } else {
            this.f1262a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f1264c == null) {
            this.f1264c = new d1();
        }
        d1 d1Var = this.f1264c;
        d1Var.f1148a = colorStateList;
        d1Var.f1151d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f1264c == null) {
            this.f1264c = new d1();
        }
        d1 d1Var = this.f1264c;
        d1Var.f1149b = mode;
        d1Var.f1150c = true;
        c();
    }
}