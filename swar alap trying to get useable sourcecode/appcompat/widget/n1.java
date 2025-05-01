package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
class n1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    private static n1 f1231o;

    /* renamed from: p, reason: collision with root package name */
    private static n1 f1232p;

    /* renamed from: e, reason: collision with root package name */
    private final View f1233e;

    /* renamed from: f, reason: collision with root package name */
    private final CharSequence f1234f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1235g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f1236h = new Runnable() { // from class: androidx.appcompat.widget.l1
        @Override // java.lang.Runnable
        public final void run() {
            n1.this.e();
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f1237i = new Runnable() { // from class: androidx.appcompat.widget.m1
        @Override // java.lang.Runnable
        public final void run() {
            n1.this.d();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private int f1238j;

    /* renamed from: k, reason: collision with root package name */
    private int f1239k;

    /* renamed from: l, reason: collision with root package name */
    private o1 f1240l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f1241m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f1242n;

    private n1(View view, CharSequence charSequence) {
        this.f1233e = view;
        this.f1234f = charSequence;
        this.f1235g = androidx.core.view.j0.c(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1233e.removeCallbacks(this.f1236h);
    }

    private void c() {
        this.f1242n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1233e.postDelayed(this.f1236h, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(n1 n1Var) {
        n1 n1Var2 = f1231o;
        if (n1Var2 != null) {
            n1Var2.b();
        }
        f1231o = n1Var;
        if (n1Var != null) {
            n1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        n1 n1Var = f1231o;
        if (n1Var != null && n1Var.f1233e == view) {
            g(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new n1(view, charSequence);
            return;
        }
        n1 n1Var2 = f1232p;
        if (n1Var2 != null && n1Var2.f1233e == view) {
            n1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1242n && Math.abs(x10 - this.f1238j) <= this.f1235g && Math.abs(y10 - this.f1239k) <= this.f1235g) {
            return false;
        }
        this.f1238j = x10;
        this.f1239k = y10;
        this.f1242n = false;
        return true;
    }

    void d() {
        if (f1232p == this) {
            f1232p = null;
            o1 o1Var = this.f1240l;
            if (o1Var != null) {
                o1Var.c();
                this.f1240l = null;
                c();
                this.f1233e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1231o == this) {
            g(null);
        }
        this.f1233e.removeCallbacks(this.f1237i);
    }

    void i(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (androidx.core.view.h0.V(this.f1233e)) {
            g(null);
            n1 n1Var = f1232p;
            if (n1Var != null) {
                n1Var.d();
            }
            f1232p = this;
            this.f1241m = z10;
            o1 o1Var = new o1(this.f1233e.getContext());
            this.f1240l = o1Var;
            o1Var.e(this.f1233e, this.f1238j, this.f1239k, this.f1241m, this.f1234f);
            this.f1233e.addOnAttachStateChangeListener(this);
            if (this.f1241m) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.h0.P(this.f1233e) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1233e.removeCallbacks(this.f1237i);
            this.f1233e.postDelayed(this.f1237i, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1240l != null && this.f1241m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1233e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1233e.isEnabled() && this.f1240l == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1238j = view.getWidth() / 2;
        this.f1239k = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}