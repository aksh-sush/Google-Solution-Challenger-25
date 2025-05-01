package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f846m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f847n;

    /* renamed from: o, reason: collision with root package name */
    private View f848o;

    /* renamed from: p, reason: collision with root package name */
    private View f849p;

    /* renamed from: q, reason: collision with root package name */
    private View f850q;

    /* renamed from: r, reason: collision with root package name */
    private LinearLayout f851r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f852s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f853t;

    /* renamed from: u, reason: collision with root package name */
    private int f854u;

    /* renamed from: v, reason: collision with root package name */
    private int f855v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f856w;

    /* renamed from: x, reason: collision with root package name */
    private int f857x;

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f858e;

        a(androidx.appcompat.view.b bVar) {
            this.f858e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f858e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f851r == null) {
            LayoutInflater.from(getContext()).inflate(f.g.f10116a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f851r = linearLayout;
            this.f852s = (TextView) linearLayout.findViewById(f.f.f10094e);
            this.f853t = (TextView) this.f851r.findViewById(f.f.f10093d);
            if (this.f854u != 0) {
                this.f852s.setTextAppearance(getContext(), this.f854u);
            }
            if (this.f855v != 0) {
                this.f853t.setTextAppearance(getContext(), this.f855v);
            }
        }
        this.f852s.setText(this.f846m);
        this.f853t.setText(this.f847n);
        boolean z10 = !TextUtils.isEmpty(this.f846m);
        boolean z11 = !TextUtils.isEmpty(this.f847n);
        int i10 = 0;
        this.f853t.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f851r;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f851r.getParent() == null) {
            addView(this.f851r);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.p0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f848o == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f847n;
    }

    public CharSequence getTitle() {
        return this.f846m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(androidx.appcompat.view.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f848o
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f857x
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f848o = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f848o
            goto L15
        L22:
            android.view.View r0 = r3.f848o
            int r1 = f.f.f10098i
            android.view.View r0 = r0.findViewById(r1)
            r3.f849p = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            androidx.appcompat.widget.c r0 = r3.f1038h
            if (r0 == 0) goto L41
            r0.y()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1038h = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f1038h
            android.content.Context r2 = r3.f1036f
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f1038h
            androidx.appcompat.view.menu.n r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f1037g = r4
            r1 = 0
            androidx.core.view.h0.w0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f1037g
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(androidx.appcompat.view.b):void");
    }

    public boolean j() {
        return this.f856w;
    }

    public void k() {
        removeAllViews();
        this.f850q = null;
        this.f1037g = null;
        this.f1038h = null;
        View view = this.f849p;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1038h;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1038h;
        if (cVar != null) {
            cVar.B();
            this.f1038h.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = q1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f848o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f848o.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = androidx.appcompat.widget.a.d(paddingRight, i14, b10);
            paddingRight = androidx.appcompat.widget.a.d(d10 + e(this.f848o, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f851r;
        if (linearLayout != null && this.f850q == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f851r, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f850q;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1037g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f1039i;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        View view = this.f848o;
        if (view != null) {
            int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f848o.getLayoutParams();
            paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1037g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1037g, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f851r;
        if (linearLayout != null && this.f850q == null) {
            if (this.f856w) {
                this.f851r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f851r.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f851r.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f850q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f850q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f1039i > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1039i = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f850q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f850q = view;
        if (view != null && (linearLayout = this.f851r) != null) {
            removeView(linearLayout);
            this.f851r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f847n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f846m = charSequence;
        i();
        androidx.core.view.h0.v0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f856w) {
            requestLayout();
        }
        this.f856w = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f10022g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f1 v10 = f1.v(context, attributeSet, f.j.f10277y, i10, 0);
        androidx.core.view.h0.w0(this, v10.g(f.j.f10282z));
        this.f854u = v10.n(f.j.D, 0);
        this.f855v = v10.n(f.j.C, 0);
        this.f1039i = v10.m(f.j.B, 0);
        this.f857x = v10.n(f.j.A, f.g.f10119d);
        v10.w();
    }
}