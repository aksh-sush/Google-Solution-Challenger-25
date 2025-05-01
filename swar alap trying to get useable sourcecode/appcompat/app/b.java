package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public abstract class b implements DrawerLayout.e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0009b f355a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f356b;

    /* renamed from: c, reason: collision with root package name */
    private h.d f357c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f358d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f359e;

    /* renamed from: f, reason: collision with root package name */
    boolean f360f;

    /* renamed from: g, reason: collision with root package name */
    private final int f361g;

    /* renamed from: h, reason: collision with root package name */
    private final int f362h;

    /* renamed from: i, reason: collision with root package name */
    View.OnClickListener f363i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f364j;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f360f) {
                bVar.k();
                return;
            }
            View.OnClickListener onClickListener = bVar.f363i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0009b {
        void a(Drawable drawable, int i10);

        boolean b();

        Drawable c();

        void d(int i10);

        Context e();
    }

    public interface c {
        InterfaceC0009b c();
    }

    private static class d implements InterfaceC0009b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f366a;

        static class a {
            static void a(ActionBar actionBar, int i10) {
                actionBar.setHomeActionContentDescription(i10);
            }

            static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        d(Activity activity) {
            this.f366a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void a(Drawable drawable, int i10) {
            ActionBar actionBar = this.f366a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, drawable);
                a.a(actionBar, i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public boolean b() {
            ActionBar actionBar = this.f366a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Drawable c() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void d(int i10) {
            ActionBar actionBar = this.f366a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Context e() {
            ActionBar actionBar = this.f366a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f366a;
        }
    }

    static class e implements InterfaceC0009b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f367a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f368b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f369c;

        e(Toolbar toolbar) {
            this.f367a = toolbar;
            this.f368b = toolbar.getNavigationIcon();
            this.f369c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void a(Drawable drawable, int i10) {
            this.f367a.setNavigationIcon(drawable);
            d(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Drawable c() {
            return this.f368b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public void d(int i10) {
            if (i10 == 0) {
                this.f367a.setNavigationContentDescription(this.f369c);
            } else {
                this.f367a.setNavigationContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0009b
        public Context e() {
            return this.f367a.getContext();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, h.d dVar, int i10, int i11) {
        this.f358d = true;
        this.f360f = true;
        this.f364j = false;
        if (toolbar != null) {
            this.f355a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f355a = ((c) activity).c();
        } else {
            this.f355a = new d(activity);
        }
        this.f356b = drawerLayout;
        this.f361g = i10;
        this.f362h = i11;
        if (dVar == null) {
            this.f357c = new h.d(this.f355a.e());
        } else {
            this.f357c = dVar;
        }
        this.f359e = e();
    }

    private void h(float f10) {
        h.d dVar;
        boolean z10;
        if (f10 != 1.0f) {
            if (f10 == 0.0f) {
                dVar = this.f357c;
                z10 = false;
            }
            this.f357c.e(f10);
        }
        dVar = this.f357c;
        z10 = true;
        dVar.g(z10);
        this.f357c.e(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view, float f10) {
        if (this.f358d) {
            h(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            h(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(View view) {
        h(1.0f);
        if (this.f360f) {
            f(this.f362h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view) {
        h(0.0f);
        if (this.f360f) {
            f(this.f361g);
        }
    }

    Drawable e() {
        return this.f355a.c();
    }

    void f(int i10) {
        this.f355a.d(i10);
    }

    void g(Drawable drawable, int i10) {
        if (!this.f364j && !this.f355a.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f364j = true;
        }
        this.f355a.a(drawable, i10);
    }

    public void i(View.OnClickListener onClickListener) {
        this.f363i = onClickListener;
    }

    public void j() {
        h(this.f356b.C(8388611) ? 1.0f : 0.0f);
        if (this.f360f) {
            g(this.f357c, this.f356b.C(8388611) ? this.f362h : this.f361g);
        }
    }

    void k() {
        int q10 = this.f356b.q(8388611);
        if (this.f356b.F(8388611) && q10 != 2) {
            this.f356b.d(8388611);
        } else if (q10 != 1) {
            this.f356b.K(8388611);
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }
}