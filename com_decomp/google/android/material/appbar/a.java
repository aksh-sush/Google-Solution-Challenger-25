package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import com.google.android.gms.common.api.a;

abstract class a extends c {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f6711d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f6712e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6713f;

    /* renamed from: g  reason: collision with root package name */
    private int f6714g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f6715h;

    /* renamed from: i  reason: collision with root package name */
    private int f6716i = -1;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f6717j;

    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    private class C0092a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final CoordinatorLayout f6718e;

        /* renamed from: f  reason: collision with root package name */
        private final View f6719f;

        C0092a(CoordinatorLayout coordinatorLayout, View view) {
            this.f6718e = coordinatorLayout;
            this.f6719f = view;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f6719f != null && (overScroller = a.this.f6712e) != null) {
                if (overScroller.computeScrollOffset()) {
                    a aVar = a.this;
                    aVar.O(this.f6718e, this.f6719f, aVar.f6712e.getCurrY());
                    h0.k0(this.f6719f, this);
                    return;
                }
                a.this.M(this.f6718e, this.f6719f);
            }
        }
    }

    public a() {
    }

    private void H() {
        if (this.f6717j == null) {
            this.f6717j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f6714g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f6715h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f6714g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f6715h
            int r7 = r1 - r0
            r11.f6715h = r0
            int r8 = r11.J(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.N(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f6717j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f6717j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f6717j
            int r4 = r11.f6714g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.K(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.I(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f6713f = r3
            r11.f6714g = r1
            android.view.VelocityTracker r13 = r11.f6717j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f6717j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f6717j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f6713f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract boolean G(View view);

    /* access modifiers changed from: package-private */
    public final boolean I(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        View view2 = view;
        Runnable runnable = this.f6711d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f6711d = null;
        }
        if (this.f6712e == null) {
            this.f6712e = new OverScroller(view.getContext());
        }
        this.f6712e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f6712e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C0092a aVar = new C0092a(coordinatorLayout, view);
            this.f6711d = aVar;
            h0.k0(view, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        M(coordinatorLayout, view);
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract int J(View view);

    /* access modifiers changed from: package-private */
    public abstract int K(View view);

    /* access modifiers changed from: package-private */
    public abstract int L();

    /* access modifiers changed from: package-private */
    public abstract void M(CoordinatorLayout coordinatorLayout, View view);

    /* access modifiers changed from: package-private */
    public final int N(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return P(coordinatorLayout, view, L() - i10, i11, i12);
    }

    /* access modifiers changed from: package-private */
    public int O(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return P(coordinatorLayout, view, i10, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
    }

    /* access modifiers changed from: package-private */
    public abstract int P(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f6716i < 0) {
            this.f6716i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f6713f) {
            int i10 = this.f6714g;
            if (i10 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y10 - this.f6715h) > this.f6716i) {
                this.f6715h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f6714g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = G(view) && coordinatorLayout.z(view, x10, y11);
            this.f6713f = z10;
            if (z10) {
                this.f6715h = y11;
                this.f6714g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f6712e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f6712e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f6717j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
