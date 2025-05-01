package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.v0;
import androidx.core.view.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int F = f.g.f10120e;
    private boolean A;
    private m.a B;
    ViewTreeObserver C;
    private PopupWindow.OnDismissListener D;
    boolean E;

    /* renamed from: f, reason: collision with root package name */
    private final Context f682f;

    /* renamed from: g, reason: collision with root package name */
    private final int f683g;

    /* renamed from: h, reason: collision with root package name */
    private final int f684h;

    /* renamed from: i, reason: collision with root package name */
    private final int f685i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f686j;

    /* renamed from: k, reason: collision with root package name */
    final Handler f687k;

    /* renamed from: s, reason: collision with root package name */
    private View f695s;

    /* renamed from: t, reason: collision with root package name */
    View f696t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f698v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f699w;

    /* renamed from: x, reason: collision with root package name */
    private int f700x;

    /* renamed from: y, reason: collision with root package name */
    private int f701y;

    /* renamed from: l, reason: collision with root package name */
    private final List f688l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    final List f689m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f690n = new a();

    /* renamed from: o, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f691o = new b();

    /* renamed from: p, reason: collision with root package name */
    private final u0 f692p = new c();

    /* renamed from: q, reason: collision with root package name */
    private int f693q = 0;

    /* renamed from: r, reason: collision with root package name */
    private int f694r = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f702z = false;

    /* renamed from: u, reason: collision with root package name */
    private int f697u = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.f689m.size() <= 0 || ((C0011d) d.this.f689m.get(0)).f710a.B()) {
                return;
            }
            View view = d.this.f696t;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator it = d.this.f689m.iterator();
            while (it.hasNext()) {
                ((C0011d) it.next()).f710a.d();
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
            ViewTreeObserver viewTreeObserver = d.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.C = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.C.removeGlobalOnLayoutListener(dVar.f690n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements u0 {

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C0011d f706e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MenuItem f707f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ g f708g;

            a(C0011d c0011d, MenuItem menuItem, g gVar) {
                this.f706e = c0011d;
                this.f707f = menuItem;
                this.f708g = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0011d c0011d = this.f706e;
                if (c0011d != null) {
                    d.this.E = true;
                    c0011d.f711b.e(false);
                    d.this.E = false;
                }
                if (this.f707f.isEnabled() && this.f707f.hasSubMenu()) {
                    this.f708g.L(this.f707f, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.u0
        public void c(g gVar, MenuItem menuItem) {
            d.this.f687k.removeCallbacksAndMessages(null);
            int size = d.this.f689m.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (gVar == ((C0011d) d.this.f689m.get(i10)).f711b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            d.this.f687k.postAtTime(new a(i11 < d.this.f689m.size() ? (C0011d) d.this.f689m.get(i11) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.u0
        public void e(g gVar, MenuItem menuItem) {
            d.this.f687k.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0011d {

        /* renamed from: a, reason: collision with root package name */
        public final v0 f710a;

        /* renamed from: b, reason: collision with root package name */
        public final g f711b;

        /* renamed from: c, reason: collision with root package name */
        public final int f712c;

        public C0011d(v0 v0Var, g gVar, int i10) {
            this.f710a = v0Var;
            this.f711b = gVar;
            this.f712c = i10;
        }

        public ListView a() {
            return this.f710a.g();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f682f = context;
        this.f695s = view;
        this.f684h = i10;
        this.f685i = i11;
        this.f686j = z10;
        Resources resources = context.getResources();
        this.f683g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f10052b));
        this.f687k = new Handler();
    }

    private int A(g gVar) {
        int size = this.f689m.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == ((C0011d) this.f689m.get(i10)).f711b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0011d c0011d, g gVar) {
        f fVar;
        int i10;
        int firstVisiblePosition;
        MenuItem B = B(c0011d.f711b, gVar);
        if (B == null) {
            return null;
        }
        ListView a10 = c0011d.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i10 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (B == fVar.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return h0.E(this.f695s) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List list = this.f689m;
        ListView a10 = ((C0011d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f696t.getWindowVisibleDisplayFrame(rect);
        return this.f697u == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0011d c0011d;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f682f);
        f fVar = new f(gVar, from, this.f686j, F);
        if (!b() && this.f702z) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int o10 = k.o(fVar, null, this.f682f, this.f683g);
        v0 z10 = z();
        z10.p(fVar);
        z10.F(o10);
        z10.G(this.f694r);
        if (this.f689m.size() > 0) {
            List list = this.f689m;
            c0011d = (C0011d) list.get(list.size() - 1);
            view = C(c0011d, gVar);
        } else {
            c0011d = null;
            view = null;
        }
        if (view != null) {
            z10.V(false);
            z10.S(null);
            int E = E(o10);
            boolean z11 = E == 1;
            this.f697u = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.D(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f695s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f694r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f695s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f694r & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.l(i12);
            z10.N(true);
            z10.j(i11);
        } else {
            if (this.f698v) {
                z10.l(this.f700x);
            }
            if (this.f699w) {
                z10.j(this.f701y);
            }
            z10.H(n());
        }
        this.f689m.add(new C0011d(z10, gVar, this.f697u));
        z10.d();
        ListView g10 = z10.g();
        g10.setOnKeyListener(this);
        if (c0011d == null && this.A && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(f.g.f10127l, (ViewGroup) g10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            g10.addHeaderView(frameLayout, null, false);
            z10.d();
        }
    }

    private v0 z() {
        v0 v0Var = new v0(this.f682f, null, this.f684h, this.f685i);
        v0Var.U(this.f692p);
        v0Var.L(this);
        v0Var.K(this);
        v0Var.D(this.f695s);
        v0Var.G(this.f694r);
        v0Var.J(true);
        v0Var.I(2);
        return v0Var;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        int A = A(gVar);
        if (A < 0) {
            return;
        }
        int i10 = A + 1;
        if (i10 < this.f689m.size()) {
            ((C0011d) this.f689m.get(i10)).f711b.e(false);
        }
        C0011d c0011d = (C0011d) this.f689m.remove(A);
        c0011d.f711b.O(this);
        if (this.E) {
            c0011d.f710a.T(null);
            c0011d.f710a.E(0);
        }
        c0011d.f710a.dismiss();
        int size = this.f689m.size();
        this.f697u = size > 0 ? ((C0011d) this.f689m.get(size - 1)).f712c : D();
        if (size != 0) {
            if (z10) {
                ((C0011d) this.f689m.get(0)).f711b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.C.removeGlobalOnLayoutListener(this.f690n);
            }
            this.C = null;
        }
        this.f696t.removeOnAttachStateChangeListener(this.f691o);
        this.D.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.f689m.size() > 0 && ((C0011d) this.f689m.get(0)).f710a.b();
    }

    @Override // androidx.appcompat.view.menu.p
    public void d() {
        if (b()) {
            return;
        }
        Iterator it = this.f688l.iterator();
        while (it.hasNext()) {
            F((g) it.next());
        }
        this.f688l.clear();
        View view = this.f695s;
        this.f696t = view;
        if (view != null) {
            boolean z10 = this.C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.C = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f690n);
            }
            this.f696t.addOnAttachStateChangeListener(this.f691o);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f689m.size();
        if (size > 0) {
            C0011d[] c0011dArr = (C0011d[]) this.f689m.toArray(new C0011d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0011d c0011d = c0011dArr[i10];
                if (c0011d.f710a.b()) {
                    c0011d.f710a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(r rVar) {
        for (C0011d c0011d : this.f689m) {
            if (rVar == c0011d.f711b) {
                c0011d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        l(rVar);
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void f(boolean z10) {
        Iterator it = this.f689m.iterator();
        while (it.hasNext()) {
            k.y(((C0011d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView g() {
        if (this.f689m.isEmpty()) {
            return null;
        }
        return ((C0011d) this.f689m.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void k(m.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f682f);
        if (b()) {
            F(gVar);
        } else {
            this.f688l.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0011d c0011d;
        int size = this.f689m.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                c0011d = null;
                break;
            }
            c0011d = (C0011d) this.f689m.get(i10);
            if (!c0011d.f710a.b()) {
                break;
            } else {
                i10++;
            }
        }
        if (c0011d != null) {
            c0011d.f711b.e(false);
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
        if (this.f695s != view) {
            this.f695s = view;
            this.f694r = androidx.core.view.o.b(this.f693q, h0.E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z10) {
        this.f702z = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        if (this.f693q != i10) {
            this.f693q = i10;
            this.f694r = androidx.core.view.o.b(i10, h0.E(this.f695s));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i10) {
        this.f698v = true;
        this.f700x = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.D = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z10) {
        this.A = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i10) {
        this.f699w = true;
        this.f701y = i10;
    }
}