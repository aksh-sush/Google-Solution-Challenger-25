package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f7249a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f7249a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i10) {
        float d10 = (float) d();
        return (((float) i10) - d10) / (((float) c()) - d10);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.max(0, this.f7249a.f0() + this.f7249a.d0());
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return (-this.f7249a.Y()) - this.f7249a.d0();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f7249a.d0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return -this.f7249a.Y();
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        return view.getRight() + this.f7249a.d0();
    }

    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean j(float f10) {
        return f10 > 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f7249a.h0());
    }

    /* access modifiers changed from: package-private */
    public boolean m(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f7249a.b0())) > this.f7249a.c0();
    }

    /* access modifiers changed from: package-private */
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f7249a.g0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
