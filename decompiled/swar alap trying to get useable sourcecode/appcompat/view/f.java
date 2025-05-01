package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f566a;

    /* renamed from: b, reason: collision with root package name */
    final b f567b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f568a;

        /* renamed from: b, reason: collision with root package name */
        final Context f569b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f570c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final androidx.collection.g f571d = new androidx.collection.g();

        public a(Context context, ActionMode.Callback callback) {
            this.f569b = context;
            this.f568a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f571d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f569b, (y.a) menu);
            this.f571d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f568a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public void b(b bVar) {
            this.f568a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f568a.onActionItemClicked(e(bVar), new j(this.f569b, (y.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f568a.onCreateActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f570c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f570c.get(i10);
                if (fVar != null && fVar.f567b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f569b, bVar);
            this.f570c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f566a = context;
        this.f567b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f567b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f567b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f566a, (y.a) this.f567b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f567b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f567b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f567b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f567b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f567b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f567b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f567b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f567b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f567b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f567b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f567b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f567b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f567b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f567b.r(charSequence);
    }
}