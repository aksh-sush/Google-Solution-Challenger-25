package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: g, reason: collision with root package name */
    private Context f559g;

    /* renamed from: h, reason: collision with root package name */
    private ActionBarContextView f560h;

    /* renamed from: i, reason: collision with root package name */
    private b.a f561i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f562j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f563k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f564l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f565m;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f559g = context;
        this.f560h = actionBarContextView;
        this.f561i = aVar;
        androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f565m = S;
        S.R(this);
        this.f564l = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f561i.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f560h.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f563k) {
            return;
        }
        this.f563k = true;
        this.f561i.b(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f562j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f565m;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f560h.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f560h.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f560h.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f561i.a(this, this.f565m);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f560h.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f560h.setCustomView(view);
        this.f562j = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f559g.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f560h.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f559g.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f560h.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f560h.setTitleOptional(z10);
    }
}