package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private boolean f836e;

    /* renamed from: f, reason: collision with root package name */
    private View f837f;

    /* renamed from: g, reason: collision with root package name */
    private View f838g;

    /* renamed from: h, reason: collision with root package name */
    private View f839h;

    /* renamed from: i, reason: collision with root package name */
    Drawable f840i;

    /* renamed from: j, reason: collision with root package name */
    Drawable f841j;

    /* renamed from: k, reason: collision with root package name */
    Drawable f842k;

    /* renamed from: l, reason: collision with root package name */
    boolean f843l;

    /* renamed from: m, reason: collision with root package name */
    boolean f844m;

    /* renamed from: n, reason: collision with root package name */
    private int f845n;

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.h0.w0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f10155a);
        this.f840i = obtainStyledAttributes.getDrawable(f.j.f10161b);
        this.f841j = obtainStyledAttributes.getDrawable(f.j.f10172d);
        this.f845n = obtainStyledAttributes.getDimensionPixelSize(f.j.f10202j, -1);
        boolean z10 = true;
        if (getId() == f.f.H) {
            this.f843l = true;
            this.f842k = obtainStyledAttributes.getDrawable(f.j.f10167c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f843l ? this.f840i != null || this.f841j != null : this.f842k != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f840i;
        if (drawable != null && drawable.isStateful()) {
            this.f840i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f841j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f841j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f842k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f842k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f837f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f840i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f841j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f842k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f838g = findViewById(f.f.f10090a);
        this.f839h = findViewById(f.f.f10095f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f836e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f837f;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view2.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f843l) {
            Drawable drawable3 = this.f842k;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f840i != null) {
                if (this.f838g.getVisibility() == 0) {
                    drawable2 = this.f840i;
                    left = this.f838g.getLeft();
                    top = this.f838g.getTop();
                    right = this.f838g.getRight();
                    view = this.f838g;
                } else {
                    View view3 = this.f839h;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f840i.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f840i;
                        left = this.f839h.getLeft();
                        top = this.f839h.getTop();
                        right = this.f839h.getRight();
                        view = this.f839h;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f844m = z13;
            if (!z13 || (drawable = this.f841j) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f838g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f845n
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f838g
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f837f
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f838g
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f838g
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f839h
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f839h
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f837f
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f840i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f840i);
        }
        this.f840i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f838g;
            if (view != null) {
                this.f840i.setBounds(view.getLeft(), this.f838g.getTop(), this.f838g.getRight(), this.f838g.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f843l ? this.f840i != null || this.f841j != null : this.f842k != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f842k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f842k);
        }
        this.f842k = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f843l && (drawable2 = this.f842k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f843l ? !(this.f840i != null || this.f841j != null) : this.f842k == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f841j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f841j);
        }
        this.f841j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f844m && (drawable2 = this.f841j) != null) {
                drawable2.setBounds(this.f837f.getLeft(), this.f837f.getTop(), this.f837f.getRight(), this.f837f.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f843l ? this.f840i != null || this.f841j != null : this.f842k != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(z0 z0Var) {
        View view = this.f837f;
        if (view != null) {
            removeView(view);
        }
        this.f837f = z0Var;
    }

    public void setTransitioning(boolean z10) {
        this.f836e = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f840i;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f841j;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f842k;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f840i && !this.f843l) || (drawable == this.f841j && this.f844m) || ((drawable == this.f842k && this.f843l) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}