package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import androidx.core.view.h1;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements i0, androidx.core.view.z, androidx.core.view.a0 {
    static final int[] J = {f.a.f10017b, R.attr.windowContentOverlay};
    private androidx.core.view.h1 A;
    private androidx.core.view.h1 B;
    private d C;
    private OverScroller D;
    ViewPropertyAnimator E;
    final AnimatorListenerAdapter F;
    private final Runnable G;
    private final Runnable H;
    private final androidx.core.view.b0 I;

    /* renamed from: e, reason: collision with root package name */
    private int f860e;

    /* renamed from: f, reason: collision with root package name */
    private int f861f;

    /* renamed from: g, reason: collision with root package name */
    private ContentFrameLayout f862g;

    /* renamed from: h, reason: collision with root package name */
    ActionBarContainer f863h;

    /* renamed from: i, reason: collision with root package name */
    private j0 f864i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f865j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f866k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f867l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f868m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f869n;

    /* renamed from: o, reason: collision with root package name */
    boolean f870o;

    /* renamed from: p, reason: collision with root package name */
    private int f871p;

    /* renamed from: q, reason: collision with root package name */
    private int f872q;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f873r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f874s;

    /* renamed from: t, reason: collision with root package name */
    private final Rect f875t;

    /* renamed from: u, reason: collision with root package name */
    private final Rect f876u;

    /* renamed from: v, reason: collision with root package name */
    private final Rect f877v;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f878w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f879x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.core.view.h1 f880y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.core.view.h1 f881z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f870o = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = null;
            actionBarOverlayLayout.f870o = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f863h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.E = actionBarOverlayLayout.f863h.animate().translationY(-ActionBarOverlayLayout.this.f863h.getHeight()).setListener(ActionBarOverlayLayout.this.F);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z10);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f861f = 0;
        this.f873r = new Rect();
        this.f874s = new Rect();
        this.f875t = new Rect();
        this.f876u = new Rect();
        this.f877v = new Rect();
        this.f878w = new Rect();
        this.f879x = new Rect();
        androidx.core.view.h1 h1Var = androidx.core.view.h1.f2473b;
        this.f880y = h1Var;
        this.f881z = h1Var;
        this.A = h1Var;
        this.B = h1Var;
        this.F = new a();
        this.G = new b();
        this.H = new c();
        v(context);
        this.I = new androidx.core.view.b0(this);
    }

    private void A() {
        u();
        this.G.run();
    }

    private boolean B(float f10) {
        this.D.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
        return this.D.getFinalY() > this.f863h.getHeight();
    }

    private void p() {
        u();
        this.H.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j0 t(View view) {
        if (view instanceof j0) {
            return (j0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(J);
        this.f860e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f865j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f866k = context.getApplicationInfo().targetSdkVersion < 19;
        this.D = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.H, 600L);
    }

    private void y() {
        u();
        postDelayed(this.G, 600L);
    }

    @Override // androidx.appcompat.widget.i0
    public void a(Menu menu, m.a aVar) {
        z();
        this.f864i.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.i0
    public boolean b() {
        z();
        return this.f864i.b();
    }

    @Override // androidx.appcompat.widget.i0
    public void c() {
        z();
        this.f864i.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.i0
    public boolean d() {
        z();
        return this.f864i.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f865j == null || this.f866k) {
            return;
        }
        int bottom = this.f863h.getVisibility() == 0 ? (int) (this.f863h.getBottom() + this.f863h.getTranslationY() + 0.5f) : 0;
        this.f865j.setBounds(0, bottom, getWidth(), this.f865j.getIntrinsicHeight() + bottom);
        this.f865j.draw(canvas);
    }

    @Override // androidx.appcompat.widget.i0
    public boolean e() {
        z();
        return this.f864i.e();
    }

    @Override // androidx.appcompat.widget.i0
    public boolean f() {
        z();
        return this.f864i.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.i0
    public boolean g() {
        z();
        return this.f864i.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f863h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f864i.getTitle();
    }

    @Override // androidx.core.view.z
    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.z
    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.z
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f864i.v();
        } else if (i10 == 5) {
            this.f864i.w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void l() {
        z();
        this.f864i.h();
    }

    @Override // androidx.core.view.a0
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.core.view.z
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.z
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.h1 w10 = androidx.core.view.h1.w(windowInsets, this);
        boolean q10 = q(this.f863h, new Rect(w10.j(), w10.l(), w10.k(), w10.i()), true, true, false, true);
        androidx.core.view.h0.h(this, w10, this.f873r);
        Rect rect = this.f873r;
        androidx.core.view.h1 m10 = w10.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f880y = m10;
        boolean z10 = true;
        if (!this.f881z.equals(m10)) {
            this.f881z = this.f880y;
            q10 = true;
        }
        if (this.f874s.equals(this.f873r)) {
            z10 = q10;
        } else {
            this.f874s.set(this.f873r);
        }
        if (z10) {
            requestLayout();
        }
        return w10.a().c().b().u();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.h0.p0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        androidx.core.view.h1 a10;
        z();
        measureChildWithMargins(this.f863h, i10, 0, i11, 0);
        e eVar = (e) this.f863h.getLayoutParams();
        int max = Math.max(0, this.f863h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f863h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f863h.getMeasuredState());
        boolean z10 = (androidx.core.view.h0.P(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f860e;
            if (this.f868m && this.f863h.getTabContainer() != null) {
                measuredHeight += this.f860e;
            }
        } else {
            measuredHeight = this.f863h.getVisibility() != 8 ? this.f863h.getMeasuredHeight() : 0;
        }
        this.f875t.set(this.f873r);
        androidx.core.view.h1 h1Var = this.f880y;
        this.A = h1Var;
        if (this.f867l || z10) {
            a10 = new h1.b(this.A).d(androidx.core.graphics.b.b(h1Var.j(), this.A.l() + measuredHeight, this.A.k(), this.A.i() + 0)).a();
        } else {
            Rect rect = this.f875t;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a10 = h1Var.m(0, measuredHeight, 0, 0);
        }
        this.A = a10;
        q(this.f862g, this.f875t, true, true, true, true);
        if (!this.B.equals(this.A)) {
            androidx.core.view.h1 h1Var2 = this.A;
            this.B = h1Var2;
            androidx.core.view.h0.i(this.f862g, h1Var2);
        }
        measureChildWithMargins(this.f862g, i10, 0, i11, 0);
        e eVar2 = (e) this.f862g.getLayoutParams();
        int max3 = Math.max(max, this.f862g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f862g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f862g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f869n || !z10) {
            return false;
        }
        if (B(f11)) {
            p();
        } else {
            A();
        }
        this.f870o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f871p + i11;
        this.f871p = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.I.b(view, view2, i10);
        this.f871p = getActionBarHideOffset();
        u();
        d dVar = this.C;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f863h.getVisibility() != 0) {
            return false;
        }
        return this.f869n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f869n && !this.f870o) {
            if (this.f871p <= this.f863h.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.C;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f872q ^ i10;
        this.f872q = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.C;
        if (dVar != null) {
            dVar.e(!z11);
            if (z10 || !z11) {
                this.C.a();
            } else {
                this.C.f();
            }
        }
        if ((i11 & 256) == 0 || this.C == null) {
            return;
        }
        androidx.core.view.h0.p0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f861f = i10;
        d dVar = this.C;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f863h.setTranslationY(-Math.max(0, Math.min(i10, this.f863h.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.C = dVar;
        if (getWindowToken() != null) {
            this.C.c(this.f861f);
            int i10 = this.f872q;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.h0.p0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f868m = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f869n) {
            this.f869n = z10;
            if (z10) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        z();
        this.f864i.setIcon(i10);
    }

    public void setLogo(int i10) {
        z();
        this.f864i.r(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f867l = z10;
        this.f866k = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.i0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f864i.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.i0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f864i.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.G);
        removeCallbacks(this.H);
        ViewPropertyAnimator viewPropertyAnimator = this.E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f867l;
    }

    void z() {
        if (this.f862g == null) {
            this.f862g = (ContentFrameLayout) findViewById(f.f.f10091b);
            this.f863h = (ActionBarContainer) findViewById(f.f.f10092c);
            this.f864i = t(findViewById(f.f.f10090a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f864i.setIcon(drawable);
    }
}