package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.h0;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f6728a;

    /* renamed from: b  reason: collision with root package name */
    private int f6729b;

    /* renamed from: c  reason: collision with root package name */
    private int f6730c;

    /* renamed from: d  reason: collision with root package name */
    private int f6731d;

    /* renamed from: e  reason: collision with root package name */
    private int f6732e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6733f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6734g = true;

    public d(View view) {
        this.f6728a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f6728a;
        h0.d0(view, this.f6731d - (view.getTop() - this.f6729b));
        View view2 = this.f6728a;
        h0.c0(view2, this.f6732e - (view2.getLeft() - this.f6730c));
    }

    public int b() {
        return this.f6731d;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f6729b = this.f6728a.getTop();
        this.f6730c = this.f6728a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f6734g || this.f6732e == i10) {
            return false;
        }
        this.f6732e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f6733f || this.f6731d == i10) {
            return false;
        }
        this.f6731d = i10;
        a();
        return true;
    }
}
