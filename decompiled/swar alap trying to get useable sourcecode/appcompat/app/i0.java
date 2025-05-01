package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.core.view.p0;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f500a;

    /* renamed from: b, reason: collision with root package name */
    private Context f501b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f502c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f503d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f504e;

    /* renamed from: f, reason: collision with root package name */
    j0 f505f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f506g;

    /* renamed from: h, reason: collision with root package name */
    View f507h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f510k;

    /* renamed from: l, reason: collision with root package name */
    d f511l;

    /* renamed from: m, reason: collision with root package name */
    androidx.appcompat.view.b f512m;

    /* renamed from: n, reason: collision with root package name */
    b.a f513n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f514o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f516q;

    /* renamed from: t, reason: collision with root package name */
    boolean f519t;

    /* renamed from: u, reason: collision with root package name */
    boolean f520u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f521v;

    /* renamed from: x, reason: collision with root package name */
    androidx.appcompat.view.h f523x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f524y;

    /* renamed from: z, reason: collision with root package name */
    boolean f525z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f508i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f509j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f515p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f517r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f518s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f522w = true;
    final q0 A = new a();
    final q0 B = new b();
    final s0 C = new c();

    class a extends r0 {
        a() {
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            View view2;
            i0 i0Var = i0.this;
            if (i0Var.f518s && (view2 = i0Var.f507h) != null) {
                view2.setTranslationY(0.0f);
                i0.this.f504e.setTranslationY(0.0f);
            }
            i0.this.f504e.setVisibility(8);
            i0.this.f504e.setTransitioning(false);
            i0 i0Var2 = i0.this;
            i0Var2.f523x = null;
            i0Var2.A();
            ActionBarOverlayLayout actionBarOverlayLayout = i0.this.f503d;
            if (actionBarOverlayLayout != null) {
                androidx.core.view.h0.p0(actionBarOverlayLayout);
            }
        }
    }

    class b extends r0 {
        b() {
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            i0 i0Var = i0.this;
            i0Var.f523x = null;
            i0Var.f504e.requestLayout();
        }
    }

    class c implements s0 {
        c() {
        }

        @Override // androidx.core.view.s0
        public void a(View view) {
            ((View) i0.this.f504e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: g, reason: collision with root package name */
        private final Context f529g;

        /* renamed from: h, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f530h;

        /* renamed from: i, reason: collision with root package name */
        private b.a f531i;

        /* renamed from: j, reason: collision with root package name */
        private WeakReference f532j;

        public d(Context context, b.a aVar) {
            this.f529g = context;
            this.f531i = aVar;
            androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(context).S(1);
            this.f530h = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f531i;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f531i == null) {
                return;
            }
            k();
            i0.this.f506g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            i0 i0Var = i0.this;
            if (i0Var.f511l != this) {
                return;
            }
            if (i0.z(i0Var.f519t, i0Var.f520u, false)) {
                this.f531i.b(this);
            } else {
                i0 i0Var2 = i0.this;
                i0Var2.f512m = this;
                i0Var2.f513n = this.f531i;
            }
            this.f531i = null;
            i0.this.y(false);
            i0.this.f506g.g();
            i0 i0Var3 = i0.this;
            i0Var3.f503d.setHideOnContentScrollEnabled(i0Var3.f525z);
            i0.this.f511l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f532j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f530h;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f529g);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return i0.this.f506g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return i0.this.f506g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (i0.this.f511l != this) {
                return;
            }
            this.f530h.d0();
            try {
                this.f531i.a(this, this.f530h);
            } finally {
                this.f530h.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return i0.this.f506g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            i0.this.f506g.setCustomView(view);
            this.f532j = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(i0.this.f500a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            i0.this.f506g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(i0.this.f500a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            i0.this.f506g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            i0.this.f506g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f530h.d0();
            try {
                return this.f531i.d(this, this.f530h);
            } finally {
                this.f530h.c0();
            }
        }
    }

    public i0(Activity activity, boolean z10) {
        this.f502c = activity;
        View decorView = activity.getWindow().getDecorView();
        G(decorView);
        if (z10) {
            return;
        }
        this.f507h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j0 D(View view) {
        if (view instanceof j0) {
            return (j0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void F() {
        if (this.f521v) {
            this.f521v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f503d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            P(false);
        }
    }

    private void G(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f.f10105p);
        this.f503d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f505f = D(view.findViewById(f.f.f10090a));
        this.f506g = (ActionBarContextView) view.findViewById(f.f.f10095f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f.f10092c);
        this.f504e = actionBarContainer;
        j0 j0Var = this.f505f;
        if (j0Var == null || this.f506g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f500a = j0Var.getContext();
        boolean z10 = (this.f505f.p() & 4) != 0;
        if (z10) {
            this.f510k = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f500a);
        M(b10.a() || z10);
        K(b10.e());
        TypedArray obtainStyledAttributes = this.f500a.obtainStyledAttributes(null, f.j.f10155a, f.a.f10018c, 0);
        if (obtainStyledAttributes.getBoolean(f.j.f10207k, false)) {
            L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.j.f10197i, 0);
        if (dimensionPixelSize != 0) {
            J(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void K(boolean z10) {
        this.f516q = z10;
        if (z10) {
            this.f504e.setTabContainer(null);
            this.f505f.k(null);
        } else {
            this.f505f.k(null);
            this.f504e.setTabContainer(null);
        }
        boolean z11 = E() == 2;
        this.f505f.y(!this.f516q && z11);
        this.f503d.setHasNonEmbeddedTabs(!this.f516q && z11);
    }

    private boolean N() {
        return androidx.core.view.h0.W(this.f504e);
    }

    private void O() {
        if (this.f521v) {
            return;
        }
        this.f521v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f503d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        P(false);
    }

    private void P(boolean z10) {
        if (z(this.f519t, this.f520u, this.f521v)) {
            if (this.f522w) {
                return;
            }
            this.f522w = true;
            C(z10);
            return;
        }
        if (this.f522w) {
            this.f522w = false;
            B(z10);
        }
    }

    static boolean z(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    void A() {
        b.a aVar = this.f513n;
        if (aVar != null) {
            aVar.b(this.f512m);
            this.f512m = null;
            this.f513n = null;
        }
    }

    public void B(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f523x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f517r != 0 || (!this.f524y && !z10)) {
            this.A.b(null);
            return;
        }
        this.f504e.setAlpha(1.0f);
        this.f504e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f504e.getHeight();
        if (z10) {
            this.f504e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        p0 n10 = androidx.core.view.h0.e(this.f504e).n(f10);
        n10.l(this.C);
        hVar2.c(n10);
        if (this.f518s && (view = this.f507h) != null) {
            hVar2.c(androidx.core.view.h0.e(view).n(f10));
        }
        hVar2.f(D);
        hVar2.e(250L);
        hVar2.g(this.A);
        this.f523x = hVar2;
        hVar2.h();
    }

    public void C(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f523x;
        if (hVar != null) {
            hVar.a();
        }
        this.f504e.setVisibility(0);
        if (this.f517r == 0 && (this.f524y || z10)) {
            this.f504e.setTranslationY(0.0f);
            float f10 = -this.f504e.getHeight();
            if (z10) {
                this.f504e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f504e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            p0 n10 = androidx.core.view.h0.e(this.f504e).n(0.0f);
            n10.l(this.C);
            hVar2.c(n10);
            if (this.f518s && (view2 = this.f507h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(androidx.core.view.h0.e(this.f507h).n(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f523x = hVar2;
            hVar2.h();
        } else {
            this.f504e.setAlpha(1.0f);
            this.f504e.setTranslationY(0.0f);
            if (this.f518s && (view = this.f507h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f503d;
        if (actionBarOverlayLayout != null) {
            androidx.core.view.h0.p0(actionBarOverlayLayout);
        }
    }

    public int E() {
        return this.f505f.t();
    }

    public void H(boolean z10) {
        I(z10 ? 4 : 0, 4);
    }

    public void I(int i10, int i11) {
        int p10 = this.f505f.p();
        if ((i11 & 4) != 0) {
            this.f510k = true;
        }
        this.f505f.o((i10 & i11) | ((~i11) & p10));
    }

    public void J(float f10) {
        androidx.core.view.h0.A0(this.f504e, f10);
    }

    public void L(boolean z10) {
        if (z10 && !this.f503d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f525z = z10;
        this.f503d.setHideOnContentScrollEnabled(z10);
    }

    public void M(boolean z10) {
        this.f505f.m(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f520u) {
            this.f520u = false;
            P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        androidx.appcompat.view.h hVar = this.f523x;
        if (hVar != null) {
            hVar.a();
            this.f523x = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(int i10) {
        this.f517r = i10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e(boolean z10) {
        this.f518s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        if (this.f520u) {
            return;
        }
        this.f520u = true;
        P(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        j0 j0Var = this.f505f;
        if (j0Var == null || !j0Var.n()) {
            return false;
        }
        this.f505f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f514o) {
            return;
        }
        this.f514o = z10;
        if (this.f515p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f515p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f505f.p();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f501b == null) {
            TypedValue typedValue = new TypedValue();
            this.f500a.getTheme().resolveAttribute(f.a.f10020e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f501b = new ContextThemeWrapper(this.f500a, i10);
            } else {
                this.f501b = this.f500a;
            }
        }
        return this.f501b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        K(androidx.appcompat.view.a.b(this.f500a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f511l;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
        if (this.f510k) {
            return;
        }
        H(z10);
    }

    @Override // androidx.appcompat.app.a
    public void s(int i10) {
        this.f505f.s(i10);
    }

    @Override // androidx.appcompat.app.a
    public void t(Drawable drawable) {
        this.f505f.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f524y = z10;
        if (z10 || (hVar = this.f523x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f505f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f505f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b x(b.a aVar) {
        d dVar = this.f511l;
        if (dVar != null) {
            dVar.c();
        }
        this.f503d.setHideOnContentScrollEnabled(false);
        this.f506g.k();
        d dVar2 = new d(this.f506g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f511l = dVar2;
        dVar2.k();
        this.f506g.h(dVar2);
        y(true);
        return dVar2;
    }

    public void y(boolean z10) {
        p0 u10;
        p0 f10;
        if (z10) {
            O();
        } else {
            F();
        }
        if (!N()) {
            if (z10) {
                this.f505f.j(4);
                this.f506g.setVisibility(0);
                return;
            } else {
                this.f505f.j(0);
                this.f506g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f10 = this.f505f.u(4, 100L);
            u10 = this.f506g.f(0, 200L);
        } else {
            u10 = this.f505f.u(0, 200L);
            f10 = this.f506g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f10, u10);
        hVar.h();
    }

    public i0(Dialog dialog) {
        G(dialog.getWindow().getDecorView());
    }
}