package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p1;
import androidx.core.app.o0;
import androidx.lifecycle.n0;
import androidx.savedstate.a;

/* loaded from: classes.dex */
public abstract class d extends androidx.fragment.app.e implements e, o0.a, b.c {

    /* renamed from: e, reason: collision with root package name */
    private g f378e;

    /* renamed from: f, reason: collision with root package name */
    private Resources f379f;

    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.v().C(bundle);
            return bundle;
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            g v10 = d.this.v();
            v10.t();
            v10.y(d.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public d() {
        x();
    }

    private boolean F(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void x() {
        getSavedStateRegistry().h("androidx:appcompat", new a());
        addOnContextAvailableListener(new b());
    }

    private void y() {
        n0.a(getWindow().getDecorView(), this);
        androidx.lifecycle.o0.a(getWindow().getDecorView(), this);
        u0.e.a(getWindow().getDecorView(), this);
        androidx.activity.t.a(getWindow().getDecorView(), this);
    }

    protected void A(androidx.core.os.h hVar) {
    }

    protected void B(int i10) {
    }

    public void C(o0 o0Var) {
    }

    public void D() {
    }

    public boolean E() {
        Intent i10 = i();
        if (i10 == null) {
            return false;
        }
        if (!I(i10)) {
            H(i10);
            return true;
        }
        o0 f10 = o0.f(this);
        z(f10);
        C(f10);
        f10.h();
        try {
            androidx.core.app.b.p(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void G(Toolbar toolbar) {
        v().M(toolbar);
    }

    public void H(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    public boolean I(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        v().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(v().g(context));
    }

    @Override // androidx.appcompat.app.e
    public void b(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.b.c
    public b.InterfaceC0009b c() {
        return v().n();
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a w10 = w();
        if (getWindow().hasFeature(0)) {
            if (w10 == null || !w10.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void d(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a w10 = w();
        if (keyCode == 82 && w10 != null && w10.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return v().j(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return v().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f379f == null && p1.c()) {
            this.f379f = new p1(this, super.getResources());
        }
        Resources resources = this.f379f;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.core.app.o0.a
    public Intent i() {
        return androidx.core.app.i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        v().u();
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b k(b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v().x(configuration);
        if (this.f379f != null) {
            this.f379f.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        D();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        v().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (F(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a w10 = w();
        if (menuItem.getItemId() != 16908332 || w10 == null || (w10.j() & 4) == 0) {
            return false;
        }
        return E();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        v().A(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        v().B();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        v().D();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        v().E();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        v().O(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a w10 = w();
        if (getWindow().hasFeature(0)) {
            if (w10 == null || !w10.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        y();
        v().I(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        v().N(i10);
    }

    @Override // androidx.fragment.app.e
    public void supportInvalidateOptionsMenu() {
        v().u();
    }

    public g v() {
        if (this.f378e == null) {
            this.f378e = g.h(this, this);
        }
        return this.f378e;
    }

    public androidx.appcompat.app.a w() {
        return v().s();
    }

    public void z(o0 o0Var) {
        o0Var.d(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        y();
        v().J(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        v().K(view, layoutParams);
    }
}