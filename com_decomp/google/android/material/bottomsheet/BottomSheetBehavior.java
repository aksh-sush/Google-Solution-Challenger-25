package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.k0;
import androidx.core.view.h0;
import androidx.core.view.h1;
import com.google.android.material.internal.v;
import e0.c;
import g5.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o4.h;
import o4.i;
import o4.j;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: i0  reason: collision with root package name */
    private static final int f6773i0 = i.Widget_Design_BottomSheet_Modal;
    private boolean A;
    private final g B = new g(this, (a) null);
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G = 0.5f;
    int H;
    float I = -1.0f;
    boolean J;
    /* access modifiers changed from: private */
    public boolean K;
    /* access modifiers changed from: private */
    public boolean L = true;
    int M = 4;
    int N = 4;
    e0.c O;
    private boolean P;
    private int Q;
    private boolean R;
    private float S = 0.1f;
    private int T;
    int U;
    int V;
    WeakReference W;
    WeakReference X;
    WeakReference Y;
    private final ArrayList Z = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    private int f6774a = 0;

    /* renamed from: a0  reason: collision with root package name */
    private VelocityTracker f6775a0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f6776b = true;

    /* renamed from: b0  reason: collision with root package name */
    b5.b f6777b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6778c = false;

    /* renamed from: c0  reason: collision with root package name */
    int f6779c0;

    /* renamed from: d  reason: collision with root package name */
    private float f6780d;

    /* renamed from: d0  reason: collision with root package name */
    private int f6781d0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f6782e;

    /* renamed from: e0  reason: collision with root package name */
    boolean f6783e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f6784f;

    /* renamed from: f0  reason: collision with root package name */
    private Map f6785f0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6786g;

    /* renamed from: g0  reason: collision with root package name */
    final SparseIntArray f6787g0 = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    private int f6788h;

    /* renamed from: h0  reason: collision with root package name */
    private final c.C0206c f6789h0 = new d();

    /* renamed from: i  reason: collision with root package name */
    private int f6790i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public g5.g f6791j;

    /* renamed from: k  reason: collision with root package name */
    private ColorStateList f6792k;

    /* renamed from: l  reason: collision with root package name */
    private int f6793l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f6794m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public int f6795n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6796o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public boolean f6797p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f6798q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f6799r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6800s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f6801t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public boolean f6802u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public boolean f6803v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public int f6804w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f6805x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f6806y;

    /* renamed from: z  reason: collision with root package name */
    private k f6807z;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f6808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f6809f;

        a(View view, int i10) {
            this.f6808e = view;
            this.f6809f = i10;
        }

        public void run() {
            BottomSheetBehavior.this.V0(this.f6808e, this.f6809f, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f6791j != null) {
                BottomSheetBehavior.this.f6791j.U(floatValue);
            }
        }
    }

    class c implements v.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f6812a;

        c(boolean z10) {
            this.f6812a = z10;
        }

        public h1 a(View view, h1 h1Var, v.d dVar) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            androidx.core.graphics.b f10 = h1Var.f(h1.m.d());
            androidx.core.graphics.b f11 = h1Var.f(h1.m.c());
            int unused = BottomSheetBehavior.this.f6805x = f10.f2215b;
            boolean g10 = v.g(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f6797p) {
                int unused2 = BottomSheetBehavior.this.f6804w = h1Var.i();
                paddingBottom = dVar.f7215d + BottomSheetBehavior.this.f6804w;
            }
            if (BottomSheetBehavior.this.f6798q) {
                paddingLeft = (g10 ? dVar.f7214c : dVar.f7212a) + f10.f2214a;
            }
            if (BottomSheetBehavior.this.f6799r) {
                paddingRight = (g10 ? dVar.f7212a : dVar.f7214c) + f10.f2216c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (!BottomSheetBehavior.this.f6801t || marginLayoutParams.leftMargin == (i12 = f10.f2214a)) {
                z10 = false;
            } else {
                marginLayoutParams.leftMargin = i12;
                z10 = true;
            }
            if (BottomSheetBehavior.this.f6802u && marginLayoutParams.rightMargin != (i11 = f10.f2216c)) {
                marginLayoutParams.rightMargin = i11;
                z10 = true;
            }
            if (!BottomSheetBehavior.this.f6803v || marginLayoutParams.topMargin == (i10 = f10.f2215b)) {
                z11 = z10;
            } else {
                marginLayoutParams.topMargin = i10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f6812a) {
                int unused3 = BottomSheetBehavior.this.f6795n = f11.f2217d;
            }
            if (BottomSheetBehavior.this.f6797p || this.f6812a) {
                BottomSheetBehavior.this.a1(false);
            }
            return h1Var;
        }
    }

    class d extends c.C0206c {

        /* renamed from: a  reason: collision with root package name */
        private long f6814a;

        d() {
        }

        private boolean a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.m0()) / 2;
        }

        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(View view, int i10, int i11) {
            return z.a.b(i10, BottomSheetBehavior.this.m0(), getViewVerticalDragRange(view));
        }

        public int getViewVerticalDragRange(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        public void onViewDragStateChanged(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.j0(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
            if (r9 > r7.f6815b.F) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f6815b.m0()) < java.lang.Math.abs(r8.getTop() - r7.f6815b.F)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
            if (r7.f6815b.T0() == false) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f2, code lost:
            if (java.lang.Math.abs(r9 - r7.f6815b.E) < java.lang.Math.abs(r9 - r7.f6815b.H)) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x010e, code lost:
            if (r7.f6815b.T0() != false) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
            if (r7.f6815b.T0() == false) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            if (r10.Q0(r3, (((float) r9) * 100.0f) / ((float) r10.V)) != false) goto L_0x0010;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 6
                r1 = 3
                r2 = 4
                r3 = 0
                int r4 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r4 >= 0) goto L_0x0040
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6776b
                if (r9 == 0) goto L_0x0013
            L_0x0010:
                r0 = 3
                goto L_0x012b
            L_0x0013:
                int r9 = r8.getTop()
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r7.f6814a
                long r3 = r3 - r5
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.T0()
                if (r10 == 0) goto L_0x0038
                float r9 = (float) r9
                r10 = 1120403456(0x42c80000, float:100.0)
                float r9 = r9 * r10
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.V
                float r0 = (float) r0
                float r9 = r9 / r0
                boolean r9 = r10.Q0(r3, r9)
                if (r9 == 0) goto L_0x00ae
                goto L_0x0010
            L_0x0038:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.F
                if (r9 <= r10) goto L_0x0010
                goto L_0x012b
            L_0x0040:
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r5 = r4.J
                if (r5 == 0) goto L_0x0095
                boolean r4 = r4.S0(r8, r10)
                if (r4 == 0) goto L_0x0095
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L_0x0063
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6782e
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x0069
            L_0x0063:
                boolean r9 = r7.a(r8)
                if (r9 == 0) goto L_0x006c
            L_0x0069:
                r0 = 5
                goto L_0x012b
            L_0x006c:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6776b
                if (r9 == 0) goto L_0x0075
                goto L_0x0010
            L_0x0075:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.m0()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r2 = r2.F
                int r10 = r10 - r2
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x012b
                goto L_0x0010
            L_0x0095:
                int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
                if (r3 == 0) goto L_0x00d3
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a6
                goto L_0x00d3
            L_0x00a6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6776b
                if (r9 == 0) goto L_0x00b1
            L_0x00ae:
                r0 = 4
                goto L_0x012b
            L_0x00b1:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.F
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.H
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ae
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012b
                goto L_0x00ae
            L_0x00d3:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f6776b
                if (r10 == 0) goto L_0x00f6
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.E
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.H
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ae
                goto L_0x0010
            L_0x00f6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r10.F
                if (r9 >= r3) goto L_0x0111
                int r10 = r10.H
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x0108
                goto L_0x0010
            L_0x0108:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012b
                goto L_0x00ae
            L_0x0111:
                int r10 = r9 - r3
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.H
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00ae
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.T0()
                if (r9 == 0) goto L_0x012b
                goto L_0x00ae
            L_0x012b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r9.U0()
                r9.V0(r8, r0, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.M;
            if (i11 == 1 || bottomSheetBehavior.f6783e0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f6779c0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f6814a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements k0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6816a;

        e(int i10) {
            this.f6816a = i10;
        }

        public boolean a(View view, k0.a aVar) {
            BottomSheetBehavior.this.N0(this.f6816a);
            return true;
        }
    }

    protected static class f extends d0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        final int f6818g;

        /* renamed from: h  reason: collision with root package name */
        int f6819h;

        /* renamed from: i  reason: collision with root package name */
        boolean f6820i;

        /* renamed from: j  reason: collision with root package name */
        boolean f6821j;

        /* renamed from: k  reason: collision with root package name */
        boolean f6822k;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            /* renamed from: c */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6818g = parcel.readInt();
            this.f6819h = parcel.readInt();
            boolean z10 = false;
            this.f6820i = parcel.readInt() == 1;
            this.f6821j = parcel.readInt() == 1;
            this.f6822k = parcel.readInt() == 1 ? true : z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6818g);
            parcel.writeInt(this.f6819h);
            parcel.writeInt(this.f6820i ? 1 : 0);
            parcel.writeInt(this.f6821j ? 1 : 0);
            parcel.writeInt(this.f6822k ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f6818g = bottomSheetBehavior.M;
            this.f6819h = bottomSheetBehavior.f6784f;
            this.f6820i = bottomSheetBehavior.f6776b;
            this.f6821j = bottomSheetBehavior.J;
            this.f6822k = bottomSheetBehavior.K;
        }
    }

    private class g {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f6823a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public boolean f6824b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f6825c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                boolean unused = g.this.f6824b = false;
                e0.c cVar = BottomSheetBehavior.this.O;
                if (cVar == null || !cVar.m(true)) {
                    g gVar = g.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.M == 2) {
                        bottomSheetBehavior.O0(gVar.f6823a);
                        return;
                    }
                    return;
                }
                g gVar2 = g.this;
                gVar2.c(gVar2.f6823a);
            }
        }

        private g() {
            this.f6825c = new a();
        }

        /* access modifiers changed from: package-private */
        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference != null && weakReference.get() != null) {
                this.f6823a = i10;
                if (!this.f6824b) {
                    h0.k0((View) BottomSheetBehavior.this.W.get(), this.f6825c);
                    this.f6824b = true;
                }
            }
        }

        /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
    }

    private void P0(View view) {
        boolean z10 = Build.VERSION.SDK_INT >= 29 && !r0() && !this.f6786g;
        if (this.f6797p || this.f6798q || this.f6799r || this.f6801t || this.f6802u || this.f6803v || z10) {
            v.b(view, new c(z10));
        }
    }

    private boolean R0() {
        return this.O != null && (this.L || this.M == 1);
    }

    /* access modifiers changed from: private */
    public void V0(View view, int i10, boolean z10) {
        int n02 = n0(i10);
        e0.c cVar = this.O;
        if (cVar != null && (!z10 ? cVar.Q(view, view.getLeft(), n02) : cVar.O(view.getLeft(), n02))) {
            O0(2);
            Y0(i10, true);
            this.B.c(i10);
            return;
        }
        O0(i10);
    }

    private void W0() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    private int X(View view, int i10, int i11) {
        return h0.c(view, view.getResources().getString(i10), g0(i11));
    }

    private void X0(View view, int i10) {
        h0.a aVar;
        if (view != null) {
            f0(view, i10);
            int i11 = 6;
            if (!this.f6776b && this.M != 6) {
                this.f6787g0.put(i10, X(view, h.bottomsheet_action_expand_halfway, 6));
            }
            if (this.J && t0() && this.M != 5) {
                w0(view, h0.a.f2418y, 5);
            }
            int i12 = this.M;
            if (i12 == 3) {
                if (this.f6776b) {
                    i11 = 4;
                }
                aVar = h0.a.f2417x;
            } else if (i12 == 4) {
                if (this.f6776b) {
                    i11 = 3;
                }
                aVar = h0.a.f2416w;
            } else if (i12 == 6) {
                w0(view, h0.a.f2417x, 4);
                w0(view, h0.a.f2416w, 3);
                return;
            } else {
                return;
            }
            w0(view, aVar, i11);
        }
    }

    private void Y() {
        int c02 = c0();
        if (this.f6776b) {
            this.H = Math.max(this.V - c02, this.E);
        } else {
            this.H = this.V - c02;
        }
    }

    private void Y0(int i10, boolean z10) {
        boolean q02;
        ValueAnimator valueAnimator;
        if (i10 != 2 && this.A != (q02 = q0()) && this.f6791j != null) {
            this.A = q02;
            float f10 = 1.0f;
            if (!z10 || (valueAnimator = this.C) == null) {
                ValueAnimator valueAnimator2 = this.C;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.C.cancel();
                }
                g5.g gVar = this.f6791j;
                if (this.A) {
                    f10 = b0();
                }
                gVar.U(f10);
            } else if (valueAnimator.isRunning()) {
                this.C.reverse();
            } else {
                float w10 = this.f6791j.w();
                if (q02) {
                    f10 = b0();
                }
                this.C.setFloatValues(new float[]{w10, f10});
                this.C.start();
            }
        }
    }

    private float Z(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float a10 = (float) roundedCorner.getRadius();
            if (a10 > 0.0f && f10 > 0.0f) {
                return a10 / f10;
            }
        }
        return 0.0f;
    }

    private void Z0(boolean z10) {
        Map map;
        int intValue;
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.f6785f0 == null) {
                        this.f6785f0 = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.W.get()) {
                        if (z10) {
                            this.f6785f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f6778c) {
                                intValue = 4;
                            }
                        } else if (this.f6778c && (map = this.f6785f0) != null && map.containsKey(childAt)) {
                            intValue = ((Integer) this.f6785f0.get(childAt)).intValue();
                        }
                        androidx.core.view.h0.C0(childAt, intValue);
                    }
                }
                if (!z10) {
                    this.f6785f0 = null;
                } else if (this.f6778c) {
                    ((View) this.W.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    private void a0() {
        this.F = (int) (((float) this.V) * (1.0f - this.G));
    }

    /* access modifiers changed from: private */
    public void a1(boolean z10) {
        View view;
        if (this.W != null) {
            Y();
            if (this.M == 4 && (view = (View) this.W.get()) != null) {
                if (z10) {
                    N0(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    private float b0() {
        WeakReference weakReference;
        WindowInsets a10;
        if (this.f6791j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.W.get();
        if (!p0() || (a10 = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Z(this.f6791j.C(), a10.getRoundedCorner(0)), Z(this.f6791j.D(), a10.getRoundedCorner(1)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f6795n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c0() {
        /*
            r3 = this;
            boolean r0 = r3.f6786g
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f6788h
            int r1 = r3.V
            int r2 = r3.U
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.T
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f6804w
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f6796o
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f6797p
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f6795n
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f6784f
            int r2 = r3.f6790i
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f6784f
            int r1 = r3.f6804w
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c0():int");
    }

    private float d0(int i10) {
        float f10;
        float f11;
        int i11 = this.H;
        if (i10 > i11 || i11 == m0()) {
            int i12 = this.H;
            f10 = (float) (i12 - i10);
            f11 = (float) (this.V - i12);
        } else {
            int i13 = this.H;
            f10 = (float) (i13 - i10);
            f11 = (float) (i13 - m0());
        }
        return f10 / f11;
    }

    /* access modifiers changed from: private */
    public boolean e0() {
        return s0() && t0();
    }

    private void f0(View view, int i10) {
        if (view != null) {
            androidx.core.view.h0.m0(view, 524288);
            androidx.core.view.h0.m0(view, 262144);
            androidx.core.view.h0.m0(view, 1048576);
            int i11 = this.f6787g0.get(i10, -1);
            if (i11 != -1) {
                androidx.core.view.h0.m0(view, i11);
                this.f6787g0.delete(i10);
            }
        }
    }

    private k0 g0(int i10) {
        return new e(i10);
    }

    private void h0(Context context) {
        if (this.f6807z != null) {
            g5.g gVar = new g5.g(this.f6807z);
            this.f6791j = gVar;
            gVar.J(context);
            ColorStateList colorStateList = this.f6792k;
            if (colorStateList != null) {
                this.f6791j.T(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f6791j.setTint(typedValue.data);
        }
    }

    private void i0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{b0(), 1.0f});
        this.C = ofFloat;
        ofFloat.setDuration(500);
        this.C.addUpdateListener(new b());
    }

    private int l0(int i10, int i11, int i12, int i13) {
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

    private int n0(int i10) {
        if (i10 == 3) {
            return m0();
        }
        if (i10 == 4) {
            return this.H;
        }
        if (i10 == 5) {
            return this.V;
        }
        if (i10 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float o0() {
        VelocityTracker velocityTracker = this.f6775a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6780d);
        return this.f6775a0.getYVelocity(this.f6779c0);
    }

    private boolean p0() {
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private boolean q0() {
        return this.M == 3 && (this.f6806y || p0());
    }

    private boolean u0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && androidx.core.view.h0.V(view);
    }

    private void w0(View view, h0.a aVar, int i10) {
        androidx.core.view.h0.o0(view, aVar, (CharSequence) null, g0(i10));
    }

    private void x0() {
        this.f6779c0 = -1;
        this.f6781d0 = -1;
        VelocityTracker velocityTracker = this.f6775a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6775a0 = null;
        }
    }

    private void y0(f fVar) {
        int i10 = this.f6774a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f6784f = fVar.f6819h;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f6776b = fVar.f6820i;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.J = fVar.f6821j;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.K = fVar.f6822k;
            }
        }
    }

    private void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.Q = 0;
        this.R = false;
        return (i10 & 2) != 0;
    }

    public void A0(boolean z10) {
        this.L = z10;
    }

    public void B0(int i10) {
        if (i10 >= 0) {
            this.D = i10;
            Y0(this.M, true);
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r4.getTop() <= r2.F) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (T0() != false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto L_0x000f
            r2.O0(r0)
            return
        L_0x000f:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L_0x0024
            java.lang.ref.WeakReference r3 = r2.Y
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L_0x0023
            boolean r3 = r2.R
            if (r3 != 0) goto L_0x0024
        L_0x0023:
            return
        L_0x0024:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L_0x0039
            boolean r3 = r2.f6776b
            if (r3 == 0) goto L_0x002f
            goto L_0x00aa
        L_0x002f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto L_0x00aa
            goto L_0x00a9
        L_0x0039:
            boolean r3 = r2.J
            if (r3 == 0) goto L_0x0049
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L_0x0049
            r0 = 5
            goto L_0x00aa
        L_0x0049:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L_0x008e
            int r3 = r4.getTop()
            boolean r1 = r2.f6776b
            if (r1 == 0) goto L_0x0068
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L_0x0092
            goto L_0x00aa
        L_0x0068:
            int r1 = r2.F
            if (r3 >= r1) goto L_0x007e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L_0x0077
            goto L_0x00aa
        L_0x0077:
            boolean r3 = r2.T0()
            if (r3 == 0) goto L_0x00a9
            goto L_0x0092
        L_0x007e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r2.f6776b
            if (r3 == 0) goto L_0x0094
        L_0x0092:
            r0 = 4
            goto L_0x00aa
        L_0x0094:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L_0x0092
        L_0x00a9:
            r0 = 6
        L_0x00aa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z10) {
        if (this.f6776b != z10) {
            this.f6776b = z10;
            if (this.W != null) {
                Y();
            }
            O0((!this.f6776b || this.M != 6) ? this.M : 3);
            Y0(this.M, true);
            W0();
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.O.F(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f6775a0 == null) {
            this.f6775a0 = VelocityTracker.obtain();
        }
        this.f6775a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.P && Math.abs(((float) this.f6781d0) - motionEvent.getY()) > ((float) this.O.z())) {
            this.O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public void D0(boolean z10) {
        this.f6796o = z10;
    }

    public void E0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f10;
        if (this.W != null) {
            a0();
        }
    }

    public void F0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i10) {
        this.f6794m = i10;
    }

    public void H0(int i10) {
        this.f6793l = i10;
    }

    public void I0(int i10) {
        J0(i10, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void J0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L_0x000c
            boolean r4 = r3.f6786g
            if (r4 != 0) goto L_0x0015
            r3.f6786g = r1
            goto L_0x001f
        L_0x000c:
            boolean r0 = r3.f6786g
            if (r0 != 0) goto L_0x0017
            int r0 = r3.f6784f
            if (r0 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x001f
        L_0x0017:
            r3.f6786g = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f6784f = r4
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r3.a1(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.J0(int, boolean):void");
    }

    public void K0(int i10) {
        this.f6774a = i10;
    }

    public void L0(int i10) {
        this.f6782e = i10;
    }

    public void M0(boolean z10) {
        this.K = z10;
    }

    public void N0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        } else if (this.J || i10 != 5) {
            int i11 = (i10 != 6 || !this.f6776b || n0(i10) > this.E) ? i10 : 3;
            WeakReference weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                O0(i10);
                return;
            }
            View view = (View) this.W.get();
            z0(view, new a(view, i11));
        } else {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void O0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
                this.N = i10;
            }
            WeakReference weakReference = this.W;
            if (weakReference != null && ((View) weakReference.get()) != null) {
                if (i10 == 3) {
                    Z0(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    Z0(false);
                }
                Y0(i10, true);
                if (this.Z.size() <= 0) {
                    W0();
                } else {
                    android.support.v4.media.session.b.a(this.Z.get(0));
                    throw null;
                }
            }
        }
    }

    public boolean Q0(long j10, float f10) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean S0(View view, float f10) {
        if (this.K) {
            return true;
        }
        if (!t0() || view.getTop() < this.H) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * this.S)) - ((float) this.H)) / ((float) c0()) > 0.5f;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.W = null;
        this.O = null;
        this.f6777b0 = null;
    }

    public void j() {
        super.j();
        this.W = null;
        this.O = null;
        this.f6777b0 = null;
    }

    /* access modifiers changed from: package-private */
    public void j0(int i10) {
        if (((View) this.W.get()) != null && !this.Z.isEmpty()) {
            d0(i10);
            if (this.Z.size() > 0) {
                android.support.v4.media.session.b.a(this.Z.get(0));
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r9.L
            if (r0 != 0) goto L_0x000e
            goto L_0x00d4
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.x0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f6775a0
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f6775a0 = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f6775a0
            r3.addMovement(r12)
            r3 = 0
            r4 = 2
            r5 = -1
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f6783e0 = r1
            r9.f6779c0 = r5
            boolean r11 = r9.P
            if (r11 == 0) goto L_0x007f
            r9.P = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f6781d0 = r7
            int r7 = r9.M
            if (r7 == r4) goto L_0x006e
            java.lang.ref.WeakReference r7 = r9.Y
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f6781d0
            boolean r7 = r10.z(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f6779c0 = r7
            r9.f6783e0 = r2
        L_0x006e:
            int r7 = r9.f6779c0
            if (r7 != r5) goto L_0x007c
            int r7 = r9.f6781d0
            boolean r11 = r10.z(r11, r6, r7)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.P = r11
        L_0x007f:
            boolean r11 = r9.P
            if (r11 != 0) goto L_0x008e
            e0.c r11 = r9.O
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.P(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference r11 = r9.Y
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r4) goto L_0x00d3
            if (r3 == 0) goto L_0x00d3
            boolean r11 = r9.P
            if (r11 != 0) goto L_0x00d3
            int r11 = r9.M
            if (r11 == r2) goto L_0x00d3
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.z(r3, r11, r0)
            if (r10 != 0) goto L_0x00d3
            e0.c r10 = r9.O
            if (r10 == 0) goto L_0x00d3
            int r10 = r9.f6781d0
            if (r10 == r5) goto L_0x00d3
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            e0.c r11 = r9.O
            int r11 = r11.z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d3
            r1 = 1
        L_0x00d3:
            return r1
        L_0x00d4:
            r9.P = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (androidx.core.view.h0.X(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View k02 = k0(viewGroup.getChildAt(i10));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r5 == -1) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (r5 == -1) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.h0.B(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.h0.B(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            java.lang.ref.WeakReference r0 = r4.W
            if (r0 != 0) goto L_0x0065
            android.content.res.Resources r0 = r5.getResources()
            int r2 = o4.c.design_bottom_sheet_peek_height_min
            int r0 = r0.getDimensionPixelSize(r2)
            r4.f6788h = r0
            r4.P0(r6)
            com.google.android.material.bottomsheet.a r0 = new com.google.android.material.bottomsheet.a
            r0.<init>(r6)
            androidx.core.view.h0.M0(r6, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r4.W = r0
            b5.b r0 = new b5.b
            r0.<init>(r6)
            r4.f6777b0 = r0
            g5.g r0 = r4.f6791j
            if (r0 == 0) goto L_0x0052
            androidx.core.view.h0.w0(r6, r0)
            g5.g r0 = r4.f6791j
            float r2 = r4.I
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x004e
            float r2 = androidx.core.view.h0.y(r6)
        L_0x004e:
            r0.S(r2)
            goto L_0x0059
        L_0x0052:
            android.content.res.ColorStateList r0 = r4.f6792k
            if (r0 == 0) goto L_0x0059
            androidx.core.view.h0.x0(r6, r0)
        L_0x0059:
            r4.W0()
            int r0 = androidx.core.view.h0.C(r6)
            if (r0 != 0) goto L_0x0065
            androidx.core.view.h0.C0(r6, r1)
        L_0x0065:
            e0.c r0 = r4.O
            if (r0 != 0) goto L_0x0071
            e0.c$c r0 = r4.f6789h0
            e0.c r0 = e0.c.o(r5, r0)
            r4.O = r0
        L_0x0071:
            int r0 = r6.getTop()
            r5.G(r6, r7)
            int r7 = r5.getWidth()
            r4.U = r7
            int r5 = r5.getHeight()
            r4.V = r5
            int r5 = r6.getHeight()
            r4.T = r5
            int r7 = r4.V
            int r5 = r7 - r5
            int r2 = r4.f6805x
            if (r5 >= r2) goto L_0x00a8
            boolean r5 = r4.f6800s
            r3 = -1
            if (r5 == 0) goto L_0x009c
            int r5 = r4.f6794m
            if (r5 != r3) goto L_0x00a2
            goto L_0x00a6
        L_0x009c:
            int r7 = r7 - r2
            int r5 = r4.f6794m
            if (r5 != r3) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            int r7 = java.lang.Math.min(r7, r5)
        L_0x00a6:
            r4.T = r7
        L_0x00a8:
            int r5 = r4.V
            int r7 = r4.T
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r4.E = r5
            r4.a0()
            r4.Y()
            int r5 = r4.M
            r2 = 3
            if (r5 != r2) goto L_0x00c7
            int r5 = r4.m0()
        L_0x00c3:
            androidx.core.view.h0.d0(r6, r5)
            goto L_0x00ea
        L_0x00c7:
            r2 = 6
            if (r5 != r2) goto L_0x00cd
            int r5 = r4.F
            goto L_0x00c3
        L_0x00cd:
            boolean r2 = r4.J
            if (r2 == 0) goto L_0x00d7
            r2 = 5
            if (r5 != r2) goto L_0x00d7
            int r5 = r4.V
            goto L_0x00c3
        L_0x00d7:
            r2 = 4
            if (r5 != r2) goto L_0x00dd
            int r5 = r4.H
            goto L_0x00c3
        L_0x00dd:
            if (r5 == r1) goto L_0x00e2
            r2 = 2
            if (r5 != r2) goto L_0x00ea
        L_0x00e2:
            int r5 = r6.getTop()
            int r0 = r0 - r5
            androidx.core.view.h0.d0(r6, r0)
        L_0x00ea:
            int r5 = r4.M
            r4.Y0(r5, r7)
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.k0(r6)
            r5.<init>(r6)
            r4.Y = r5
            java.util.ArrayList r5 = r4.Z
            int r5 = r5.size()
            if (r5 > 0) goto L_0x0103
            return r1
        L_0x0103:
            java.util.ArrayList r5 = r4.Z
            java.lang.Object r5 = r5.get(r7)
            android.support.v4.media.session.b.a(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f6793l, marginLayoutParams.width), l0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f6794m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f6776b) {
            return this.E;
        }
        return Math.max(this.D, this.f6800s ? 0 : this.f6805x);
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        if (!v0() || (weakReference = this.Y) == null || view2 != weakReference.get()) {
            return false;
        }
        return this.M != 3 || super.o(coordinatorLayout, view, view2, f10, f11);
    }

    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 != 1) {
            WeakReference weakReference = this.Y;
            View view3 = weakReference != null ? (View) weakReference.get() : null;
            if (!v0() || view2 == view3) {
                int top = view.getTop();
                int i14 = top - i11;
                if (i11 <= 0) {
                    if (i11 < 0 && !view2.canScrollVertically(-1)) {
                        if (i14 > this.H && !e0()) {
                            int i15 = top - this.H;
                            iArr[1] = i15;
                            androidx.core.view.h0.d0(view, -i15);
                            i13 = 4;
                        } else if (this.L) {
                            iArr[1] = i11;
                            androidx.core.view.h0.d0(view, -i11);
                            O0(1);
                        } else {
                            return;
                        }
                    }
                    j0(view.getTop());
                    this.Q = i11;
                    this.R = true;
                } else if (i14 < m0()) {
                    int m02 = top - m0();
                    iArr[1] = m02;
                    androidx.core.view.h0.d0(view, -m02);
                    i13 = 3;
                } else if (this.L) {
                    iArr[1] = i11;
                    androidx.core.view.h0.d0(view, -i11);
                    O0(1);
                    j0(view.getTop());
                    this.Q = i11;
                    this.R = true;
                } else {
                    return;
                }
                O0(i13);
                j0(view.getTop());
                this.Q = i11;
                this.R = true;
            }
        }
    }

    public boolean r0() {
        return this.f6796o;
    }

    public boolean s0() {
        return this.J;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public boolean v0() {
        return true;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i10 = fVar.f6818g;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.M = i10;
        this.N = i10;
    }

    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f6790i = context.getResources().getDimensionPixelSize(o4.c.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f14091x);
        int i11 = j.B;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f6792k = d5.c.a(context, obtainStyledAttributes, i11);
        }
        if (obtainStyledAttributes.hasValue(j.T)) {
            this.f6807z = k.e(context, attributeSet, o4.a.bottomSheetStyle, f6773i0).m();
        }
        h0(context);
        i0();
        this.I = obtainStyledAttributes.getDimension(j.A, -1.0f);
        int i12 = j.f14099y;
        if (obtainStyledAttributes.hasValue(i12)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = j.f14107z;
        if (obtainStyledAttributes.hasValue(i13)) {
            G0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = j.H;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i14);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            I0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        } else {
            I0(i10);
        }
        F0(obtainStyledAttributes.getBoolean(j.G, false));
        D0(obtainStyledAttributes.getBoolean(j.L, false));
        C0(obtainStyledAttributes.getBoolean(j.E, true));
        M0(obtainStyledAttributes.getBoolean(j.K, false));
        A0(obtainStyledAttributes.getBoolean(j.C, true));
        K0(obtainStyledAttributes.getInt(j.I, 0));
        E0(obtainStyledAttributes.getFloat(j.F, 0.5f));
        int i15 = j.D;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i15);
        B0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(i15, 0) : peekValue2.data);
        L0(obtainStyledAttributes.getInt(j.J, 500));
        this.f6797p = obtainStyledAttributes.getBoolean(j.P, false);
        this.f6798q = obtainStyledAttributes.getBoolean(j.Q, false);
        this.f6799r = obtainStyledAttributes.getBoolean(j.R, false);
        this.f6800s = obtainStyledAttributes.getBoolean(j.S, true);
        this.f6801t = obtainStyledAttributes.getBoolean(j.M, false);
        this.f6802u = obtainStyledAttributes.getBoolean(j.N, false);
        this.f6803v = obtainStyledAttributes.getBoolean(j.O, false);
        this.f6806y = obtainStyledAttributes.getBoolean(j.U, true);
        obtainStyledAttributes.recycle();
        this.f6780d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
