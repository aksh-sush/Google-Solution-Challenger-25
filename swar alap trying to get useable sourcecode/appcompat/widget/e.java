package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f1152a;

    /* renamed from: d, reason: collision with root package name */
    private d1 f1155d;

    /* renamed from: e, reason: collision with root package name */
    private d1 f1156e;

    /* renamed from: f, reason: collision with root package name */
    private d1 f1157f;

    /* renamed from: c, reason: collision with root package name */
    private int f1154c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f1153b = j.b();

    e(View view) {
        this.f1152a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1157f == null) {
            this.f1157f = new d1();
        }
        d1 d1Var = this.f1157f;
        d1Var.a();
        ColorStateList u10 = androidx.core.view.h0.u(this.f1152a);
        if (u10 != null) {
            d1Var.f1151d = true;
            d1Var.f1148a = u10;
        }
        PorterDuff.Mode v10 = androidx.core.view.h0.v(this.f1152a);
        if (v10 != null) {
            d1Var.f1150c = true;
            d1Var.f1149b = v10;
        }
        if (!d1Var.f1151d && !d1Var.f1150c) {
            return false;
        }
        j.i(drawable, d1Var, this.f1152a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 > 21 ? this.f1155d != null : i10 == 21;
    }

    void b() {
        Drawable background = this.f1152a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            d1 d1Var = this.f1156e;
            if (d1Var != null) {
                j.i(background, d1Var, this.f1152a.getDrawableState());
                return;
            }
            d1 d1Var2 = this.f1155d;
            if (d1Var2 != null) {
                j.i(background, d1Var2, this.f1152a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        d1 d1Var = this.f1156e;
        if (d1Var != null) {
            return d1Var.f1148a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        d1 d1Var = this.f1156e;
        if (d1Var != null) {
            return d1Var.f1149b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1152a.getContext();
        int[] iArr = f.j.U3;
        f1 v10 = f1.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1152a;
        androidx.core.view.h0.q0(view, view.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        try {
            int i11 = f.j.V3;
            if (v10.s(i11)) {
                this.f1154c = v10.n(i11, -1);
                ColorStateList f10 = this.f1153b.f(this.f1152a.getContext(), this.f1154c);
                if (f10 != null) {
                    h(f10);
                }
            }
            int i12 = f.j.W3;
            if (v10.s(i12)) {
                androidx.core.view.h0.x0(this.f1152a, v10.c(i12));
            }
            int i13 = f.j.X3;
            if (v10.s(i13)) {
                androidx.core.view.h0.y0(this.f1152a, o0.e(v10.k(i13, -1), null));
            }
        } finally {
            v10.w();
        }
    }

    void f(Drawable drawable) {
        this.f1154c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f1154c = i10;
        j jVar = this.f1153b;
        h(jVar != null ? jVar.f(this.f1152a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1155d == null) {
                this.f1155d = new d1();
            }
            d1 d1Var = this.f1155d;
            d1Var.f1148a = colorStateList;
            d1Var.f1151d = true;
        } else {
            this.f1155d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1156e == null) {
            this.f1156e = new d1();
        }
        d1 d1Var = this.f1156e;
        d1Var.f1148a = colorStateList;
        d1Var.f1151d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1156e == null) {
            this.f1156e = new d1();
        }
        d1 d1Var = this.f1156e;
        d1Var.f1149b = mode;
        d1Var.f1150c = true;
        b();
    }
}