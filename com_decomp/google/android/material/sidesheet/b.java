package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    final SideSheetBehavior f7250a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.f7250a = sideSheetBehavior;
    }

    /* access modifiers changed from: package-private */
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: package-private */
    public float b(int i10) {
        float d10 = (float) d();
        return (d10 - ((float) i10)) / (d10 - ((float) c()));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Math.max(0, (d() - this.f7250a.Y()) - this.f7250a.d0());
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f7250a.g0();
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f7250a.g0();
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return c();
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        return view.getLeft() - this.f7250a.d0();
    }

    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean j(float f10) {
        return f10 < 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    /* access modifiers changed from: package-private */
    public boolean l(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f7250a.h0());
    }

    /* access modifiers changed from: package-private */
    public boolean m(View view, float f10) {
        return Math.abs(((float) view.getRight()) + (f10 * this.f7250a.b0())) > this.f7250a.c0();
    }

    /* access modifiers changed from: package-private */
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int g02 = this.f7250a.g0();
        if (i10 <= g02) {
            marginLayoutParams.rightMargin = g02 - i10;
        }
    }
}
