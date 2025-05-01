package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.v0;
import androidx.core.view.h0;

/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: z, reason: collision with root package name */
    private static final int f813z = f.g.f10128m;

    /* renamed from: f, reason: collision with root package name */
    private final Context f814f;

    /* renamed from: g, reason: collision with root package name */
    private final g f815g;

    /* renamed from: h, reason: collision with root package name */
    private final f f816h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f817i;

    /* renamed from: j, reason: collision with root package name */
    private final int f818j;

    /* renamed from: k, reason: collision with root package name */
    private final int f819k;

    /* renamed from: l, reason: collision with root package name */
    private final int f820l;

    /* renamed from: m, reason: collision with root package name */
    final v0 f821m;

    /* renamed from: p, reason: collision with root package name */
    private PopupWindow.OnDismissListener f824p;

    /* renamed from: q, reason: collision with root package name */
    private View f825q;

    /* renamed from: r, reason: collision with root package name */
    View f826r;

    /* renamed from: s, reason: collision with root package name */
    private m.a f827s;

    /* renamed from: t, reason: collision with root package name */
    ViewTreeObserver f828t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f829u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f830v;

    /* renamed from: w, reason: collision with root package name */
    private int f831w;

    /* renamed from: y, reason: collision with root package name */
    private boolean f833y;

    /* renamed from: n, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f822n = new a();

    /* renamed from: o, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f823o = new b();

    /* renamed from: x, reason: collision with root package name */
    private int f832x = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.b() || q.this.f821m.B()) {
                return;
            }
            View view = q.this.f826r;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f821m.d();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f828t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f828t = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f828t.removeGlobalOnLayoutListener(qVar.f822n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f814f = context;
        this.f815g = gVar;
        this.f817i = z10;
        this.f816h = new f(gVar, LayoutInflater.from(context), z10, f813z);
        this.f819k = i10;
        this.f820l = i11;
        Resources resources = context.getResources();
        this.f818j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f10052b));
        this.f825q = view;
        this.f821m = new v0(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (b()) {
            return true;
        }
        if (this.f829u || (view = this.f825q) == null) {
            return false;
        }
        this.f826r = view;
        this.f821m.K(this);
        this.f821m.L(this);
        this.f821m.J(true);
        View view2 = this.f826r;
        boolean z10 = this.f828t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f828t = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f822n);
        }
        view2.addOnAttachStateChangeListener(this.f823o);
        this.f821m.D(view2);
        this.f821m.G(this.f832x);
        if (!this.f830v) {
            this.f831w = k.o(this.f816h, null, this.f814f, this.f818j);
            this.f830v = true;
        }
        this.f821m.F(this.f831w);
        this.f821m.I(2);
        this.f821m.H(n());
        this.f821m.d();
        ListView g10 = this.f821m.g();
        g10.setOnKeyListener(this);
        if (this.f833y && this.f815g.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f814f).inflate(f.g.f10127l, (ViewGroup) g10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f815g.x());
            }
            frameLayout.setEnabled(false);
            g10.addHeaderView(frameLayout, null, false);
        }
        this.f821m.p(this.f816h);
        this.f821m.d();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        if (gVar != this.f815g) {
            return;
        }
        dismiss();
        m.a aVar = this.f827s;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return !this.f829u && this.f821m.b();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f821m.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f814f, rVar, this.f826r, this.f817i, this.f819k, this.f820l);
            lVar.j(this.f827s);
            lVar.g(k.x(rVar));
            lVar.i(this.f824p);
            this.f824p = null;
            this.f815g.e(false);
            int a10 = this.f821m.a();
            int n10 = this.f821m.n();
            if ((Gravity.getAbsoluteGravity(this.f832x, h0.E(this.f825q)) & 7) == 5) {
                a10 += this.f825q.getWidth();
            }
            if (lVar.n(a10, n10)) {
                m.a aVar = this.f827s;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        this.f830v = false;
        f fVar = this.f816h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        return this.f821m.g();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.f827s = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f829u = true;
        this.f815g.close();
        ViewTreeObserver viewTreeObserver = this.f828t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f828t = this.f826r.getViewTreeObserver();
            }
            this.f828t.removeGlobalOnLayoutListener(this.f822n);
            this.f828t = null;
        }
        this.f826r.removeOnAttachStateChangeListener(this.f823o);
        PopupWindow.OnDismissListener onDismissListener = this.f824p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.f825q = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z10) {
        this.f816h.d(z10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.f832x = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i10) {
        this.f821m.l(i10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f824p = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z10) {
        this.f833y = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i10) {
        this.f821m.j(i10);
    }
}