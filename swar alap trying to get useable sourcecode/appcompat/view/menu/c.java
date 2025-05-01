package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final Context f679a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.g f680b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.g f681c;

    c(Context context) {
        this.f679a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof y.b)) {
            return menuItem;
        }
        y.b bVar = (y.b) menuItem;
        if (this.f680b == null) {
            this.f680b = new androidx.collection.g();
        }
        MenuItem menuItem2 = (MenuItem) this.f680b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f679a, bVar);
        this.f680b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        androidx.collection.g gVar = this.f680b;
        if (gVar != null) {
            gVar.clear();
        }
        androidx.collection.g gVar2 = this.f681c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f680b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f680b.size()) {
            if (((y.b) this.f680b.i(i11)).getGroupId() == i10) {
                this.f680b.k(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f680b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f680b.size(); i11++) {
            if (((y.b) this.f680b.i(i11)).getItemId() == i10) {
                this.f680b.k(i11);
                return;
            }
        }
    }
}