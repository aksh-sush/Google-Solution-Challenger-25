package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.k0;
import androidx.core.view.h0;
import androidx.core.view.o;
import e0.c;
import g5.g;
import g5.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o4.h;
import o4.i;
import o4.j;

public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {
    private static final int A = i.Widget_Material3_SideSheet;

    /* renamed from: z  reason: collision with root package name */
    private static final int f7217z = h.side_sheet_accessibility_pane_title;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f7218a;

    /* renamed from: b  reason: collision with root package name */
    private float f7219b;

    /* renamed from: c  reason: collision with root package name */
    private g f7220c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f7221d;

    /* renamed from: e  reason: collision with root package name */
    private k f7222e;

    /* renamed from: f  reason: collision with root package name */
    private final c f7223f = new c();

    /* renamed from: g  reason: collision with root package name */
    private float f7224g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f7225h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f7226i = 5;

    /* renamed from: j  reason: collision with root package name */
    private int f7227j = 5;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public e0.c f7228k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f7229l;

    /* renamed from: m  reason: collision with root package name */
    private float f7230m = 0.1f;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f7231n;

    /* renamed from: o  reason: collision with root package name */
    private int f7232o;

    /* renamed from: p  reason: collision with root package name */
    private int f7233p;

    /* renamed from: q  reason: collision with root package name */
    private int f7234q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public WeakReference f7235r;

    /* renamed from: s  reason: collision with root package name */
    private WeakReference f7236s;

    /* renamed from: t  reason: collision with root package name */
    private int f7237t = -1;

    /* renamed from: u  reason: collision with root package name */
    private VelocityTracker f7238u;

    /* renamed from: v  reason: collision with root package name */
    private b5.c f7239v;

    /* renamed from: w  reason: collision with root package name */
    private int f7240w;

    /* renamed from: x  reason: collision with root package name */
    private final Set f7241x = new LinkedHashSet();

    /* renamed from: y  reason: collision with root package name */
    private final c.C0206c f7242y = new a();

    class a extends c.C0206c {
        a() {
        }

        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            return z.a.b(i10, SideSheetBehavior.this.f7218a.f(), SideSheetBehavior.this.f7218a.e());
        }

        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return SideSheetBehavior.this.f7231n + SideSheetBehavior.this.d0();
        }

        public void onViewDragStateChanged(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f7225h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View Z = SideSheetBehavior.this.Z();
            if (!(Z == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) Z.getLayoutParams()) == null)) {
                SideSheetBehavior.this.f7218a.n(marginLayoutParams, view.getLeft(), view.getRight());
                Z.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        public void onViewReleased(View view, float f10, float f11) {
            int L = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, L, sideSheetBehavior.F0());
        }

        public boolean tryCaptureView(View view, int i10) {
            return (SideSheetBehavior.this.f7226i == 1 || SideSheetBehavior.this.f7235r == null || SideSheetBehavior.this.f7235r.get() != view) ? false : true;
        }
    }

    protected static class b extends d0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final int f7244g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7244g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7244g);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f7244g = sideSheetBehavior.f7226i;
        }
    }

    class c {

        /* renamed from: a  reason: collision with root package name */
        private int f7245a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7246b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f7247c = new e(this);

        c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            this.f7246b = false;
            if (SideSheetBehavior.this.f7228k != null && SideSheetBehavior.this.f7228k.m(true)) {
                b(this.f7245a);
            } else if (SideSheetBehavior.this.f7226i == 2) {
                SideSheetBehavior.this.B0(this.f7245a);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            if (SideSheetBehavior.this.f7235r != null && SideSheetBehavior.this.f7235r.get() != null) {
                this.f7245a = i10;
                if (!this.f7246b) {
                    h0.k0((View) SideSheetBehavior.this.f7235r.get(), this.f7247c);
                    this.f7246b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
    }

    private boolean C0() {
        return this.f7228k != null && (this.f7225h || this.f7226i == 1);
    }

    private boolean E0(View view) {
        return (view.isShown() || h0.r(view) != null) && this.f7225h;
    }

    /* access modifiers changed from: private */
    public void G0(View view, int i10, boolean z10) {
        if (p0(view, i10, z10)) {
            B0(2);
            this.f7223f.b(i10);
            return;
        }
        B0(i10);
    }

    private void H0() {
        View view;
        WeakReference weakReference = this.f7235r;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            h0.m0(view, 262144);
            h0.m0(view, 1048576);
            if (this.f7226i != 5) {
                t0(view, h0.a.f2418y, 5);
            }
            if (this.f7226i != 3) {
                t0(view, h0.a.f2416w, 3);
            }
        }
    }

    private void I0(k kVar) {
        g gVar = this.f7220c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    private void J0(View view) {
        int i10 = this.f7226i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f7226i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f7218a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f7218a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f7226i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (D0(view, f10)) {
            return (this.f7218a.l(f10, f11) || this.f7218a.k(view)) ? 5 : 3;
        }
        if (f10 == 0.0f || !d.a(f10, f11)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.f7218a.d())) {
                return 3;
            }
        }
    }

    private void S() {
        WeakReference weakReference = this.f7236s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7236s = null;
    }

    private k0 T(int i10) {
        return new h5.a(this, i10);
    }

    private void U(Context context) {
        if (this.f7222e != null) {
            g gVar = new g(this.f7222e);
            this.f7220c = gVar;
            gVar.J(context);
            ColorStateList colorStateList = this.f7221d;
            if (colorStateList != null) {
                this.f7220c.T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f7220c.setTint(typedValue.data);
        }
    }

    /* access modifiers changed from: private */
    public void V(View view, int i10) {
        if (!this.f7241x.isEmpty()) {
            this.f7218a.b(i10);
            Iterator it = this.f7241x.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    private void W(View view) {
        if (androidx.core.view.h0.r(view) == null) {
            androidx.core.view.h0.v0(view, view.getResources().getString(f7217z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private CoordinatorLayout.e j0() {
        View view;
        WeakReference weakReference = this.f7235r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.e j02 = j0();
        return j02 != null && j02.leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.e j02 = j0();
        return j02 != null && j02.rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return C0() && Q((float) this.f7240w, motionEvent.getX()) > ((float) this.f7228k.z());
    }

    private boolean n0(float f10) {
        return this.f7218a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.h0.V(view);
    }

    private boolean p0(View view, int i10, boolean z10) {
        int e02 = e0(i10);
        e0.c i02 = i0();
        return i02 != null && (!z10 ? i02.Q(view, e02, view.getTop()) : i02.O(e02, view.getTop()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean q0(int i10, View view, k0.a aVar) {
        A0(i10);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r0(int i10) {
        View view = (View) this.f7235r.get();
        if (view != null) {
            G0(view, i10, false);
        }
    }

    private void s0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f7236s == null && (i10 = this.f7237t) != -1 && (findViewById = coordinatorLayout.findViewById(i10)) != null) {
            this.f7236s = new WeakReference(findViewById);
        }
    }

    private void t0(View view, h0.a aVar, int i10) {
        androidx.core.view.h0.o0(view, aVar, (CharSequence) null, T(i10));
    }

    private void u0() {
        VelocityTracker velocityTracker = this.f7238u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7238u = null;
        }
    }

    private void v0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void y0(int i10) {
        c cVar = this.f7218a;
        if (cVar != null && cVar.i() == i10) {
            return;
        }
        if (i10 == 0) {
            this.f7218a = new b(this);
            if (this.f7222e != null && !l0()) {
                k.b v10 = this.f7222e.v();
                v10.E(0.0f).w(0.0f);
                I0(v10.m());
            }
        } else if (i10 == 1) {
            this.f7218a = new a(this);
            if (this.f7222e != null && !k0()) {
                k.b v11 = this.f7222e.v();
                v11.A(0.0f).s(0.0f);
                I0(v11.m());
            }
        } else {
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be " + 0 + " or " + 1 + ".");
        }
    }

    private void z0(View view, int i10) {
        y0(o.b(((CoordinatorLayout.e) view.getLayoutParams()).f2004c, i10) == 3 ? 1 : 0);
    }

    public void A0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f7235r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i10);
        } else {
            v0((View) this.f7235r.get(), new h5.b(this, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void B0(int i10) {
        View view;
        if (this.f7226i != i10) {
            this.f7226i = i10;
            if (i10 == 3 || i10 == 5) {
                this.f7227j = i10;
            }
            WeakReference weakReference = this.f7235r;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                J0(view);
                Iterator it = this.f7241x.iterator();
                if (!it.hasNext()) {
                    H0();
                } else {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7226i == 1 && actionMasked == 0) {
            return true;
        }
        if (C0()) {
            this.f7228k.F(motionEvent);
        }
        if (actionMasked == 0) {
            u0();
        }
        if (this.f7238u == null) {
            this.f7238u = VelocityTracker.obtain();
        }
        this.f7238u.addMovement(motionEvent);
        if (C0() && actionMasked == 2 && !this.f7229l && m0(motionEvent)) {
            this.f7228k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f7229l;
    }

    /* access modifiers changed from: package-private */
    public boolean D0(View view, float f10) {
        return this.f7218a.m(view, f10);
    }

    public boolean F0() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int Y() {
        return this.f7231n;
    }

    public View Z() {
        WeakReference weakReference = this.f7236s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f7218a.c();
    }

    public float b0() {
        return this.f7230m;
    }

    /* access modifiers changed from: package-private */
    public float c0() {
        return 0.5f;
    }

    /* access modifiers changed from: package-private */
    public int d0() {
        return this.f7234q;
    }

    /* access modifiers changed from: package-private */
    public int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f7218a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    /* access modifiers changed from: package-private */
    public int f0() {
        return this.f7233p;
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f7235r = null;
        this.f7228k = null;
        this.f7239v = null;
    }

    /* access modifiers changed from: package-private */
    public int g0() {
        return this.f7232o;
    }

    /* access modifiers changed from: package-private */
    public int h0() {
        return 500;
    }

    /* access modifiers changed from: package-private */
    public e0.c i0() {
        return this.f7228k;
    }

    public void j() {
        super.j();
        this.f7235r = null;
        this.f7228k = null;
        this.f7239v = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3 = r2.f7228k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
        /*
            r2 = this;
            boolean r3 = r2.E0(r4)
            r4 = 1
            r0 = 0
            if (r3 != 0) goto L_0x000b
            r2.f7229l = r4
            return r0
        L_0x000b:
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L_0x0014
            r2.u0()
        L_0x0014:
            android.view.VelocityTracker r1 = r2.f7238u
            if (r1 != 0) goto L_0x001e
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r2.f7238u = r1
        L_0x001e:
            android.view.VelocityTracker r1 = r2.f7238u
            r1.addMovement(r5)
            if (r3 == 0) goto L_0x0032
            if (r3 == r4) goto L_0x002b
            r1 = 3
            if (r3 == r1) goto L_0x002b
            goto L_0x0039
        L_0x002b:
            boolean r3 = r2.f7229l
            if (r3 == 0) goto L_0x0039
            r2.f7229l = r0
            return r0
        L_0x0032:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.f7240w = r3
        L_0x0039:
            boolean r3 = r2.f7229l
            if (r3 != 0) goto L_0x0048
            e0.c r3 = r2.f7228k
            if (r3 == 0) goto L_0x0048
            boolean r3 = r3.P(r5)
            if (r3 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (androidx.core.view.h0.B(coordinatorLayout) && !androidx.core.view.h0.B(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f7235r == null) {
            this.f7235r = new WeakReference(view);
            this.f7239v = new b5.c(view);
            g gVar = this.f7220c;
            if (gVar != null) {
                androidx.core.view.h0.w0(view, gVar);
                g gVar2 = this.f7220c;
                float f10 = this.f7224g;
                if (f10 == -1.0f) {
                    f10 = androidx.core.view.h0.y(view);
                }
                gVar2.S(f10);
            } else {
                ColorStateList colorStateList = this.f7221d;
                if (colorStateList != null) {
                    androidx.core.view.h0.x0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (androidx.core.view.h0.C(view) == 0) {
                androidx.core.view.h0.C0(view, 1);
            }
            W(view);
        }
        z0(view, i10);
        if (this.f7228k == null) {
            this.f7228k = e0.c.o(coordinatorLayout, this.f7242y);
        }
        int g10 = this.f7218a.g(view);
        coordinatorLayout.G(view, i10);
        this.f7232o = coordinatorLayout.getWidth();
        this.f7233p = this.f7218a.h(coordinatorLayout);
        this.f7231n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f7234q = marginLayoutParams != null ? this.f7218a.a(marginLayoutParams) : 0;
        androidx.core.view.h0.c0(view, P(g10, view));
        s0(coordinatorLayout);
        for (Object a10 : this.f7241x) {
            android.support.v4.media.session.b.a(a10);
        }
        return true;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void w0(int i10) {
        this.f7237t = i10;
        S();
        WeakReference weakReference = this.f7235r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 != -1 && androidx.core.view.h0.W(view)) {
                view.requestLayout();
            }
        }
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i10 = bVar.f7244g;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f7226i = i10;
        this.f7227j = i10;
    }

    public void x0(boolean z10) {
        this.f7225h = z10;
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f14080v4);
        int i10 = j.f14096x4;
        if (obtainStyledAttributes.hasValue(i10)) {
            this.f7221d = d5.c.a(context, obtainStyledAttributes, i10);
        }
        if (obtainStyledAttributes.hasValue(j.A4)) {
            this.f7222e = k.e(context, attributeSet, 0, A).m();
        }
        int i11 = j.f14112z4;
        if (obtainStyledAttributes.hasValue(i11)) {
            w0(obtainStyledAttributes.getResourceId(i11, -1));
        }
        U(context);
        this.f7224g = obtainStyledAttributes.getDimension(j.f14088w4, -1.0f);
        x0(obtainStyledAttributes.getBoolean(j.f14104y4, true));
        obtainStyledAttributes.recycle();
        this.f7219b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
