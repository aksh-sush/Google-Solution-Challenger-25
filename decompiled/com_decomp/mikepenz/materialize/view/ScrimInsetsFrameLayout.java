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
import android.widget.FrameLayout;
import androidx.core.view.c0;
import androidx.core.view.h0;
import androidx.core.view.h1;
import b7.h;
import b7.i;
import f7.b;

public class ScrimInsetsFrameLayout extends FrameLayout implements f7.a {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Drawable f9257e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Rect f9258f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f9259g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private boolean f9260h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9261i = true;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9262j = true;

    class a implements c0 {
        a() {
        }

        public h1 a(View view, h1 h1Var) {
            if (ScrimInsetsFrameLayout.this.f9258f == null) {
                Rect unused = ScrimInsetsFrameLayout.this.f9258f = new Rect();
            }
            ScrimInsetsFrameLayout.this.f9258f.set(h1Var.j(), h1Var.l(), h1Var.k(), h1Var.i());
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            scrimInsetsFrameLayout.setWillNotDraw(scrimInsetsFrameLayout.f9257e == null);
            h0.j0(ScrimInsetsFrameLayout.this);
            b unused2 = ScrimInsetsFrameLayout.this.getClass();
            return h1Var.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context, attributeSet, 0);
    }

    private void e(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.C, i10, h.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.f9257e = obtainStyledAttributes.getDrawable(i.D);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        h0.F0(this, new a());
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f9258f != null && this.f9257e != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (!this.f9262j) {
                Rect rect = this.f9258f;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.f9260h) {
                this.f9259g.set(0, 0, width, this.f9258f.top);
                this.f9257e.setBounds(this.f9259g);
                this.f9257e.draw(canvas);
            }
            if (this.f9261i) {
                this.f9259g.set(0, height - this.f9258f.bottom, width, height);
                this.f9257e.setBounds(this.f9259g);
                this.f9257e.draw(canvas);
            }
            Rect rect2 = this.f9259g;
            Rect rect3 = this.f9258f;
            rect2.set(0, rect3.top, rect3.left, height - rect3.bottom);
            this.f9257e.setBounds(this.f9259g);
            this.f9257e.draw(canvas);
            Rect rect4 = this.f9259g;
            Rect rect5 = this.f9258f;
            rect4.set(width - rect5.right, rect5.top, width, height - rect5.bottom);
            this.f9257e.setBounds(this.f9259g);
            this.f9257e.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public Drawable getInsetForeground() {
        return this.f9257e;
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
        Drawable drawable = this.f9257e;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f9257e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setInsetForeground(int i10) {
        this.f9257e = new ColorDrawable(i10);
    }

    public void setOnInsetsCallback(b bVar) {
    }

    public void setSystemUIVisible(boolean z10) {
        this.f9262j = z10;
    }

    public void setTintNavigationBar(boolean z10) {
        this.f9261i = z10;
    }

    public void setTintStatusBar(boolean z10) {
        this.f9260h = z10;
    }

    public void setInsetForeground(Drawable drawable) {
        this.f9257e = drawable;
    }
}
