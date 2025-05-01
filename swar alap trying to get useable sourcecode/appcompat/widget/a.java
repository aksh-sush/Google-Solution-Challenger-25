package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    protected final C0012a f1035e;

    /* renamed from: f, reason: collision with root package name */
    protected final Context f1036f;

    /* renamed from: g, reason: collision with root package name */
    protected ActionMenuView f1037g;

    /* renamed from: h, reason: collision with root package name */
    protected c f1038h;

    /* renamed from: i, reason: collision with root package name */
    protected int f1039i;

    /* renamed from: j, reason: collision with root package name */
    protected androidx.core.view.p0 f1040j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1041k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1042l;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0012a implements androidx.core.view.q0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1043a = false;

        /* renamed from: b, reason: collision with root package name */
        int f1044b;

        protected C0012a() {
        }

        @Override // androidx.core.view.q0
        public void a(View view) {
            this.f1043a = true;
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            if (this.f1043a) {
                return;
            }
            a aVar = a.this;
            aVar.f1040j = null;
            a.super.setVisibility(this.f1044b);
        }

        @Override // androidx.core.view.q0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1043a = false;
        }

        public C0012a d(androidx.core.view.p0 p0Var, int i10) {
            a.this.f1040j = p0Var;
            this.f1044b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1035e = new C0012a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.f10016a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1036f = context;
        } else {
            this.f1036f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.p0 f(int i10, long j10) {
        androidx.core.view.p0 b10;
        androidx.core.view.p0 p0Var = this.f1040j;
        if (p0Var != null) {
            p0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = androidx.core.view.h0.e(this).b(1.0f);
        } else {
            b10 = androidx.core.view.h0.e(this).b(0.0f);
        }
        b10.g(j10);
        b10.i(this.f1035e.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.f1040j != null ? this.f1035e.f1044b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1039i;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.j.f10155a, f.a.f10018c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(f.j.f10202j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1038h;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1042l = false;
        }
        if (!this.f1042l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1042l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1042l = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1041k = false;
        }
        if (!this.f1041k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1041k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1041k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.p0 p0Var = this.f1040j;
            if (p0Var != null) {
                p0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}