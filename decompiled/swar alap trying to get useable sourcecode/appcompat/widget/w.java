package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
class w extends s {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f1361d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1362e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f1363f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f1364g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1365h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1366i;

    w(SeekBar seekBar) {
        super(seekBar);
        this.f1363f = null;
        this.f1364g = null;
        this.f1365h = false;
        this.f1366i = false;
        this.f1361d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1362e;
        if (drawable != null) {
            if (this.f1365h || this.f1366i) {
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1362e = r10;
                if (this.f1365h) {
                    androidx.core.graphics.drawable.a.o(r10, this.f1363f);
                }
                if (this.f1366i) {
                    androidx.core.graphics.drawable.a.p(this.f1362e, this.f1364g);
                }
                if (this.f1362e.isStateful()) {
                    this.f1362e.setState(this.f1361d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.s
    void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        Context context = this.f1361d.getContext();
        int[] iArr = f.j.T;
        f1 v10 = f1.v(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f1361d;
        androidx.core.view.h0.q0(seekBar, seekBar.getContext(), iArr, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(f.j.U);
        if (h10 != null) {
            this.f1361d.setThumb(h10);
        }
        j(v10.g(f.j.V));
        int i11 = f.j.X;
        if (v10.s(i11)) {
            this.f1364g = o0.e(v10.k(i11, -1), this.f1364g);
            this.f1366i = true;
        }
        int i12 = f.j.W;
        if (v10.s(i12)) {
            this.f1363f = v10.c(i12);
            this.f1365h = true;
        }
        v10.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1362e != null) {
            int max = this.f1361d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1362e.getIntrinsicWidth();
                int intrinsicHeight = this.f1362e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1362e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f1361d.getWidth() - this.f1361d.getPaddingLeft()) - this.f1361d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1361d.getPaddingLeft(), this.f1361d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1362e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1362e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1361d.getDrawableState())) {
            this.f1361d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1362e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1362e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1362e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1361d);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.view.h0.E(this.f1361d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1361d.getDrawableState());
            }
            f();
        }
        this.f1361d.invalidate();
    }
}