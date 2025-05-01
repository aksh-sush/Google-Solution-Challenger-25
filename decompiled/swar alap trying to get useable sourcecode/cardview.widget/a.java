package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d o(b bVar) {
        return (d) bVar.f();
    }

    @Override // androidx.cardview.widget.c
    public float a(b bVar) {
        return o(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList b(b bVar) {
        return o(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public void c(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.c(new d(colorStateList, f10));
        View a10 = bVar.a();
        a10.setClipToOutline(true);
        a10.setElevation(f11);
        n(bVar, f12);
    }

    @Override // androidx.cardview.widget.c
    public void d(b bVar, float f10) {
        o(bVar).h(f10);
    }

    @Override // androidx.cardview.widget.c
    public float e(b bVar) {
        return bVar.a().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public void f() {
    }

    @Override // androidx.cardview.widget.c
    public float g(b bVar) {
        return o(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public float h(b bVar) {
        return g(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float i(b bVar) {
        return g(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void j(b bVar) {
        n(bVar, a(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void k(b bVar, float f10) {
        bVar.a().setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public void l(b bVar) {
        n(bVar, a(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar, ColorStateList colorStateList) {
        o(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, float f10) {
        o(bVar).g(f10, bVar.e(), bVar.d());
        p(bVar);
    }

    public void p(b bVar) {
        if (!bVar.e()) {
            bVar.b(0, 0, 0, 0);
            return;
        }
        float a10 = a(bVar);
        float g10 = g(bVar);
        int ceil = (int) Math.ceil(e.a(a10, g10, bVar.d()));
        int ceil2 = (int) Math.ceil(e.b(a10, g10, bVar.d()));
        bVar.b(ceil, ceil2, ceil, ceil2);
    }
}