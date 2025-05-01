package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class r0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final float f1297e;

    /* renamed from: f, reason: collision with root package name */
    private final int f1298f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1299g;

    /* renamed from: h, reason: collision with root package name */
    final View f1300h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f1301i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f1302j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1303k;

    /* renamed from: l, reason: collision with root package name */
    private int f1304l;

    /* renamed from: m, reason: collision with root package name */
    private final int[] f1305m = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = r0.this.f1300h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.e();
        }
    }

    public r0(View view) {
        this.f1300h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1297e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1298f = tapTimeout;
        this.f1299g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1302j;
        if (runnable != null) {
            this.f1300h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1301i;
        if (runnable2 != null) {
            this.f1300h.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        p0 p0Var;
        View view = this.f1300h;
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 == null || !b10.b() || (p0Var = (p0) b10.g()) == null || !p0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(p0Var, obtainNoHistory);
        boolean e10 = p0Var.e(obtainNoHistory, this.f1304l);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1300h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1304l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1297e
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1304l = r6
            java.lang.Runnable r6 = r5.f1301i
            if (r6 != 0) goto L52
            androidx.appcompat.widget.r0$a r6 = new androidx.appcompat.widget.r0$a
            r6.<init>()
            r5.f1301i = r6
        L52:
            java.lang.Runnable r6 = r5.f1301i
            int r1 = r5.f1298f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1302j
            if (r6 != 0) goto L65
            androidx.appcompat.widget.r0$b r6 = new androidx.appcompat.widget.r0$b
            r6.<init>()
            r5.f1302j = r6
        L65:
            java.lang.Runnable r6 = r5.f1302j
            int r1 = r5.f1299g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1305m);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f1305m);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.p b();

    protected abstract boolean c();

    protected boolean d() {
        androidx.appcompat.view.menu.p b10 = b();
        if (b10 == null || !b10.b()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1300h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1303k = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1303k;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1300h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1303k = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1303k = false;
        this.f1304l = -1;
        Runnable runnable = this.f1301i;
        if (runnable != null) {
            this.f1300h.removeCallbacks(runnable);
        }
    }
}