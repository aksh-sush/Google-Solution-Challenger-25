package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public class j1 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f1196a;

    /* renamed from: b, reason: collision with root package name */
    private int f1197b;

    /* renamed from: c, reason: collision with root package name */
    private View f1198c;

    /* renamed from: d, reason: collision with root package name */
    private View f1199d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f1200e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f1201f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f1202g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1203h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f1204i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f1205j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f1206k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f1207l;

    /* renamed from: m, reason: collision with root package name */
    boolean f1208m;

    /* renamed from: n, reason: collision with root package name */
    private c f1209n;

    /* renamed from: o, reason: collision with root package name */
    private int f1210o;

    /* renamed from: p, reason: collision with root package name */
    private int f1211p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f1212q;

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1213e;

        a() {
            this.f1213e = new androidx.appcompat.view.menu.a(j1.this.f1196a.getContext(), 0, R.id.home, 0, 0, j1.this.f1204i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j1 j1Var = j1.this;
            Window.Callback callback = j1Var.f1207l;
            if (callback == null || !j1Var.f1208m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1213e);
        }
    }

    class b extends androidx.core.view.r0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1215a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1216b;

        b(int i10) {
            this.f1216b = i10;
        }

        @Override // androidx.core.view.r0, androidx.core.view.q0
        public void a(View view) {
            this.f1215a = true;
        }

        @Override // androidx.core.view.q0
        public void b(View view) {
            if (this.f1215a) {
                return;
            }
            j1.this.f1196a.setVisibility(this.f1216b);
        }

        @Override // androidx.core.view.r0, androidx.core.view.q0
        public void c(View view) {
            j1.this.f1196a.setVisibility(0);
        }
    }

    public j1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, f.h.f10136a, f.e.f10077n);
    }

    private void F(CharSequence charSequence) {
        this.f1204i = charSequence;
        if ((this.f1197b & 8) != 0) {
            this.f1196a.setTitle(charSequence);
            if (this.f1203h) {
                androidx.core.view.h0.v0(this.f1196a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f1197b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1206k)) {
                this.f1196a.setNavigationContentDescription(this.f1211p);
            } else {
                this.f1196a.setNavigationContentDescription(this.f1206k);
            }
        }
    }

    private void H() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1197b & 4) != 0) {
            toolbar = this.f1196a;
            drawable = this.f1202g;
            if (drawable == null) {
                drawable = this.f1212q;
            }
        } else {
            toolbar = this.f1196a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f1197b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f1201f) == null) {
            drawable = this.f1200e;
        }
        this.f1196a.setLogo(drawable);
    }

    private int z() {
        if (this.f1196a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1212q = this.f1196a.getNavigationIcon();
        return 15;
    }

    public void A(View view) {
        View view2 = this.f1199d;
        if (view2 != null && (this.f1197b & 16) != 0) {
            this.f1196a.removeView(view2);
        }
        this.f1199d = view;
        if (view == null || (this.f1197b & 16) == 0) {
            return;
        }
        this.f1196a.addView(view);
    }

    public void B(int i10) {
        if (i10 == this.f1211p) {
            return;
        }
        this.f1211p = i10;
        if (TextUtils.isEmpty(this.f1196a.getNavigationContentDescription())) {
            s(this.f1211p);
        }
    }

    public void C(Drawable drawable) {
        this.f1201f = drawable;
        I();
    }

    public void D(CharSequence charSequence) {
        this.f1206k = charSequence;
        G();
    }

    public void E(CharSequence charSequence) {
        this.f1205j = charSequence;
        if ((this.f1197b & 8) != 0) {
            this.f1196a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.j0
    public void a(Menu menu, m.a aVar) {
        if (this.f1209n == null) {
            c cVar = new c(this.f1196a.getContext());
            this.f1209n = cVar;
            cVar.p(f.f.f10096g);
        }
        this.f1209n.k(aVar);
        this.f1196a.K((androidx.appcompat.view.menu.g) menu, this.f1209n);
    }

    @Override // androidx.appcompat.widget.j0
    public boolean b() {
        return this.f1196a.B();
    }

    @Override // androidx.appcompat.widget.j0
    public void c() {
        this.f1208m = true;
    }

    @Override // androidx.appcompat.widget.j0
    public void collapseActionView() {
        this.f1196a.e();
    }

    @Override // androidx.appcompat.widget.j0
    public boolean d() {
        return this.f1196a.A();
    }

    @Override // androidx.appcompat.widget.j0
    public boolean e() {
        return this.f1196a.w();
    }

    @Override // androidx.appcompat.widget.j0
    public boolean f() {
        return this.f1196a.Q();
    }

    @Override // androidx.appcompat.widget.j0
    public boolean g() {
        return this.f1196a.d();
    }

    @Override // androidx.appcompat.widget.j0
    public Context getContext() {
        return this.f1196a.getContext();
    }

    @Override // androidx.appcompat.widget.j0
    public CharSequence getTitle() {
        return this.f1196a.getTitle();
    }

    @Override // androidx.appcompat.widget.j0
    public void h() {
        this.f1196a.f();
    }

    @Override // androidx.appcompat.widget.j0
    public void i(m.a aVar, g.a aVar2) {
        this.f1196a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.j0
    public void j(int i10) {
        this.f1196a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.j0
    public void k(z0 z0Var) {
        View view = this.f1198c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1196a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1198c);
            }
        }
        this.f1198c = z0Var;
    }

    @Override // androidx.appcompat.widget.j0
    public ViewGroup l() {
        return this.f1196a;
    }

    @Override // androidx.appcompat.widget.j0
    public void m(boolean z10) {
    }

    @Override // androidx.appcompat.widget.j0
    public boolean n() {
        return this.f1196a.v();
    }

    @Override // androidx.appcompat.widget.j0
    public void o(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f1197b ^ i10;
        this.f1197b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1196a.setTitle(this.f1204i);
                    toolbar = this.f1196a;
                    charSequence = this.f1205j;
                } else {
                    charSequence = null;
                    this.f1196a.setTitle((CharSequence) null);
                    toolbar = this.f1196a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) == 0 || (view = this.f1199d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1196a.addView(view);
            } else {
                this.f1196a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.j0
    public int p() {
        return this.f1197b;
    }

    @Override // androidx.appcompat.widget.j0
    public Menu q() {
        return this.f1196a.getMenu();
    }

    @Override // androidx.appcompat.widget.j0
    public void r(int i10) {
        C(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.j0
    public void s(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    @Override // androidx.appcompat.widget.j0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.j0
    public void setTitle(CharSequence charSequence) {
        this.f1203h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.j0
    public void setWindowCallback(Window.Callback callback) {
        this.f1207l = callback;
    }

    @Override // androidx.appcompat.widget.j0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1203h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.j0
    public int t() {
        return this.f1210o;
    }

    @Override // androidx.appcompat.widget.j0
    public androidx.core.view.p0 u(int i10, long j10) {
        return androidx.core.view.h0.e(this.f1196a).b(i10 == 0 ? 1.0f : 0.0f).g(j10).i(new b(i10));
    }

    @Override // androidx.appcompat.widget.j0
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.j0
    public void w() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.j0
    public void x(Drawable drawable) {
        this.f1202g = drawable;
        H();
    }

    @Override // androidx.appcompat.widget.j0
    public void y(boolean z10) {
        this.f1196a.setCollapsible(z10);
    }

    public j1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1210o = 0;
        this.f1211p = 0;
        this.f1196a = toolbar;
        this.f1204i = toolbar.getTitle();
        this.f1205j = toolbar.getSubtitle();
        this.f1203h = this.f1204i != null;
        this.f1202g = toolbar.getNavigationIcon();
        f1 v10 = f1.v(toolbar.getContext(), null, f.j.f10155a, f.a.f10018c, 0);
        this.f1212q = v10.g(f.j.f10212l);
        if (z10) {
            CharSequence p10 = v10.p(f.j.f10242r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(f.j.f10232p);
            if (!TextUtils.isEmpty(p11)) {
                E(p11);
            }
            Drawable g10 = v10.g(f.j.f10222n);
            if (g10 != null) {
                C(g10);
            }
            Drawable g11 = v10.g(f.j.f10217m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1202g == null && (drawable = this.f1212q) != null) {
                x(drawable);
            }
            o(v10.k(f.j.f10192h, 0));
            int n10 = v10.n(f.j.f10187g, 0);
            if (n10 != 0) {
                A(LayoutInflater.from(this.f1196a.getContext()).inflate(n10, (ViewGroup) this.f1196a, false));
                o(this.f1197b | 16);
            }
            int m10 = v10.m(f.j.f10202j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1196a.getLayoutParams();
                layoutParams.height = m10;
                this.f1196a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(f.j.f10182f, -1);
            int e11 = v10.e(f.j.f10177e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1196a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(f.j.f10247s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1196a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(f.j.f10237q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1196a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(f.j.f10227o, 0);
            if (n13 != 0) {
                this.f1196a.setPopupTheme(n13);
            }
        } else {
            this.f1197b = z();
        }
        v10.w();
        B(i10);
        this.f1206k = this.f1196a.getNavigationContentDescription();
        this.f1196a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.j0
    public void setIcon(Drawable drawable) {
        this.f1200e = drawable;
        I();
    }
}