package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import java.util.ArrayList;

/* loaded from: classes.dex */
class f0 extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    final j0 f391a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f392b;

    /* renamed from: c, reason: collision with root package name */
    final h.g f393c;

    /* renamed from: d, reason: collision with root package name */
    boolean f394d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f395e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f396f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f397g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f398h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f399i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.this.z();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return f0.this.f392b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements m.a {

        /* renamed from: e, reason: collision with root package name */
        private boolean f402e;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f402e) {
                return;
            }
            this.f402e = true;
            f0.this.f391a.h();
            f0.this.f392b.onPanelClosed(108, gVar);
            this.f402e = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            f0.this.f392b.onMenuOpened(108, gVar);
            return true;
        }
    }

    private final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (f0.this.f391a.b()) {
                f0.this.f392b.onPanelClosed(108, gVar);
            } else if (f0.this.f392b.onPreparePanel(0, null, gVar)) {
                f0.this.f392b.onMenuOpened(108, gVar);
            }
        }
    }

    private class e implements h.g {
        e() {
        }

        @Override // androidx.appcompat.app.h.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            f0 f0Var = f0.this;
            if (f0Var.f394d) {
                return false;
            }
            f0Var.f391a.c();
            f0.this.f394d = true;
            return false;
        }

        @Override // androidx.appcompat.app.h.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(f0.this.f391a.getContext());
            }
            return null;
        }
    }

    f0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f399i = bVar;
        androidx.core.util.h.g(toolbar);
        j1 j1Var = new j1(toolbar, false);
        this.f391a = j1Var;
        this.f392b = (Window.Callback) androidx.core.util.h.g(callback);
        j1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        j1Var.setWindowTitle(charSequence);
        this.f393c = new e();
    }

    private Menu y() {
        if (!this.f395e) {
            this.f391a.i(new c(), new d());
            this.f395e = true;
        }
        return this.f391a.q();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f391a.e();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (!this.f391a.n()) {
            return false;
        }
        this.f391a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z10) {
        if (z10 == this.f396f) {
            return;
        }
        this.f396f = z10;
        if (this.f397g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f397g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f391a.p();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f391a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f391a.l().removeCallbacks(this.f398h);
        androidx.core.view.h0.k0(this.f391a.l(), this.f398h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    void n() {
        this.f391a.l().removeCallbacks(this.f398h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu y10 = y();
        if (y10 == null) {
            return false;
        }
        y10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return y10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f391a.f();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(int i10) {
        this.f391a.s(i10);
    }

    @Override // androidx.appcompat.app.a
    public void t(Drawable drawable) {
        this.f391a.x(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f391a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f391a.setWindowTitle(charSequence);
    }

    void z() {
        Menu y10 = y();
        androidx.appcompat.view.menu.g gVar = y10 instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) y10 : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            y10.clear();
            if (!this.f392b.onCreatePanelMenu(0, y10) || !this.f392b.onPreparePanel(0, null, y10)) {
                y10.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }
}