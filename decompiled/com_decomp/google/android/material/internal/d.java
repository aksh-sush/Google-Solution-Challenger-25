package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.s0;
import o4.j;

public abstract class d extends s0 {

    /* renamed from: t  reason: collision with root package name */
    private Drawable f7174t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f7175u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private final Rect f7176v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    private int f7177w = 119;

    /* renamed from: x  reason: collision with root package name */
    protected boolean f7178x = true;

    /* renamed from: y  reason: collision with root package name */
    boolean f7179y = false;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray i11 = s.i(context, attributeSet, j.f14093x1, i10, 0, new int[0]);
        this.f7177w = i11.getInt(j.f14109z1, this.f7177w);
        Drawable drawable = i11.getDrawable(j.f14101y1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f7178x = i11.getBoolean(j.A1, true);
        i11.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7174t;
        if (drawable != null) {
            if (this.f7179y) {
                this.f7179y = false;
                Rect rect = this.f7175u;
                Rect rect2 = this.f7176v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f7178x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f7177w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f7174t;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7174t;
        if (drawable != null && drawable.isStateful()) {
            this.f7174t.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f7174t;
    }

    public int getForegroundGravity() {
        return this.f7177w;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7174t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f7179y = z10 | this.f7179y;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f7179y = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7174t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f7174t);
            }
            this.f7174t = drawable;
            this.f7179y = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f7177w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i10) {
        if (this.f7177w != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f7177w = i10;
            if (i10 == 119 && this.f7174t != null) {
                this.f7174t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7174t;
    }
}
