package com.mikepenz.materialize.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.c0;
import androidx.core.view.h0;
import androidx.core.view.h1;
import b7.h;
import b7.i;
import f7.b;

public class ScrimInsetsRelativeLayout extends RelativeLayout implements f7.a {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Drawable f9264e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Rect f9265f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f9266g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9267h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9268i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9269j;

    class a implements c0 {
        a() {
        }

        public h1 a(View view, h1 h1Var) {
            if (ScrimInsetsRelativeLayout.this.f9265f == null) {
                Rect unused = ScrimInsetsRelativeLayout.this.f9265f = new Rect();
            }
            ScrimInsetsRelativeLayout.this.f9265f.set(h1Var.j(), h1Var.l(), h1Var.k(), h1Var.i());
            ScrimInsetsRelativeLayout scrimInsetsRelativeLayout = ScrimInsetsRelativeLayout.this;
            scrimInsetsRelativeLayout.setWillNotDraw(scrimInsetsRelativeLayout.f9264e == null);
            h0.j0(ScrimInsetsRelativeLayout.this);
            b unused2 = ScrimInsetsRelativeLayout.this.getClass();
            return h1Var.c();
        }
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f9265f != null && this.f9264e != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (!this.f9269j) {
                Rect rect = this.f9265f;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.f9267h) {
                this.f9266g.set(0, 0, width, this.f9265f.top);
                this.f9264e.setBounds(this.f9266g);
                this.f9264e.draw(canvas);
            }
            if (this.f9268i) {
                this.f9266g.set(0, height - this.f9265f.bottom, width, height);
                this.f9264e.setBounds(this.f9266g);
                this.f9264e.draw(canvas);
            }
            Rect rect2 = this.f9266g;
            Rect rect3 = this.f9265f;
            rect2.set(0, rect3.top, rect3.left, height - rect3.bottom);
            this.f9264e.setBounds(this.f9266g);
            this.f9264e.draw(canvas);
            Rect rect4 = this.f9266g;
            Rect rect5 = this.f9265f;
            rect4.set(width - rect5.right, rect5.top, width, height - rect5.bottom);
            this.f9264e.setBounds(this.f9266g);
            this.f9264e.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Drawable getInsetForeground() {
        return this.f9264e;
    }

    public b getOnInsetsCallback() {
        return null;
    }

    public ViewGroup getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f9264e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f9264e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setInsetForeground(int i10) {
        this.f9264e = new ColorDrawable(i10);
    }

    public void setOnInsetsCallback(b bVar) {
    }

    public void setSystemUIVisible(boolean z10) {
        this.f9269j = z10;
    }

    public void setTintNavigationBar(boolean z10) {
        this.f9268i = z10;
    }

    public void setTintStatusBar(boolean z10) {
        this.f9267h = z10;
    }

    public ScrimInsetsRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9266g = new Rect();
        this.f9267h = true;
        this.f9268i = true;
        this.f9269j = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.A, i10, h.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.f9264e = obtainStyledAttributes.getDrawable(i.B);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        h0.F0(this, new a());
    }

    public void setInsetForeground(Drawable drawable) {
        this.f9264e = drawable;
    }
}
