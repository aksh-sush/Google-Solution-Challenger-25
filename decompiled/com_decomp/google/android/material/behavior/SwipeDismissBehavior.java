package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.h0;
import androidx.core.view.accessibility.k0;
import androidx.core.view.h0;
import e0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    e0.c f6748a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6749b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f6750c;

    /* renamed from: d  reason: collision with root package name */
    private float f6751d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6752e;

    /* renamed from: f  reason: collision with root package name */
    int f6753f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f6754g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f6755h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f6756i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.C0206c f6757j = new a();

    class a extends c.C0206c {

        /* renamed from: a  reason: collision with root package name */
        private int f6758a;

        /* renamed from: b  reason: collision with root package name */
        private int f6759b = -1;

        a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 1
                r2 = 0
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = androidx.core.view.h0.E(r7)
                if (r7 != r1) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f6753f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r1
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r0 = 1
            L_0x0024:
                return r0
            L_0x0025:
                if (r4 != r1) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r0 = 1
            L_0x0031:
                return r0
            L_0x0032:
                int r8 = r7.getLeft()
                int r2 = r6.f6758a
                int r8 = r8 - r2
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r2 = r2.f6754g
                float r7 = r7 * r2
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r0 = 1
            L_0x004f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f6758a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int clampViewPositionHorizontal(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.h0.E(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f6753f
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f6758a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f6758a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f6758a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f6758a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f6758a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.H(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        public int clampViewPositionVertical(View view, int i10, int i11) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i10) {
            this.f6759b = i10;
            this.f6758a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                boolean unused = SwipeDismissBehavior.this.f6750c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                boolean unused2 = SwipeDismissBehavior.this.f6750c = false;
            }
        }

        public void onViewDragStateChanged(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f6755h;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f6756i;
            float abs = (float) Math.abs(i10 - this.f6758a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r4 = r3.getLeft();
            r0 = r2.f6758a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f6759b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.a(r3, r4)
                if (r0 == 0) goto L_0x0023
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x001d
                int r4 = r3.getLeft()
                int r0 = r2.f6758a
                if (r4 >= r0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                int r0 = r0 + r5
                goto L_0x0021
            L_0x001d:
                int r4 = r2.f6758a
                int r0 = r4 - r5
            L_0x0021:
                r4 = 1
                goto L_0x0026
            L_0x0023:
                int r0 = r2.f6758a
                r4 = 0
            L_0x0026:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                e0.c r5 = r5.f6748a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L_0x003f
                com.google.android.material.behavior.SwipeDismissBehavior$c r5 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                androidx.core.view.h0.k0(r3, r5)
                goto L_0x0046
            L_0x003f:
                if (r4 == 0) goto L_0x0046
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r3.getClass()
            L_0x0046:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i10) {
            int i11 = this.f6759b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements k0 {
        b() {
        }

        public boolean a(View view, k0.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z11 = h0.E(view) == 1;
            int i10 = SwipeDismissBehavior.this.f6753f;
            if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
                z10 = true;
            }
            int width = view.getWidth();
            if (z10) {
                width = -width;
            }
            h0.c0(view, width);
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    private class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final View f6762e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f6763f;

        c(View view, boolean z10) {
            this.f6762e = view;
            this.f6763f = z10;
        }

        public void run() {
            e0.c cVar = SwipeDismissBehavior.this.f6748a;
            if (cVar != null && cVar.m(true)) {
                h0.k0(this.f6762e, this);
            } else if (this.f6763f) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f6748a == null) {
            this.f6748a = this.f6752e ? e0.c.n(viewGroup, this.f6751d, this.f6757j) : e0.c.o(viewGroup, this.f6757j);
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void N(View view) {
        h0.m0(view, 1048576);
        if (F(view)) {
            h0.o0(view, h0.a.f2418y, (CharSequence) null, new b());
        }
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f6748a == null) {
            return false;
        }
        if (this.f6750c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f6748a.F(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f6756i = G(0.0f, f10, 1.0f);
    }

    public void L(float f10) {
        this.f6755h = G(0.0f, f10, 1.0f);
    }

    public void M(int i10) {
        this.f6753f = i10;
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f6749b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6749b = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6749b = false;
        }
        if (!z10) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f6750c && this.f6748a.P(motionEvent);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean l10 = super.l(coordinatorLayout, view, i10);
        if (androidx.core.view.h0.C(view) == 0) {
            androidx.core.view.h0.C0(view, 1);
            N(view);
        }
        return l10;
    }
}
