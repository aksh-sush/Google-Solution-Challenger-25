package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class c extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private d f6725a;

    /* renamed from: b  reason: collision with root package name */
    private int f6726b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f6727c = 0;

    public c() {
    }

    public int E() {
        d dVar = this.f6725a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.G(view, i10);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f6725a == null) {
            this.f6725a = new d(view);
        }
        this.f6725a.c();
        this.f6725a.a();
        int i11 = this.f6726b;
        if (i11 != 0) {
            this.f6725a.e(i11);
            this.f6726b = 0;
        }
        int i12 = this.f6727c;
        if (i12 == 0) {
            return true;
        }
        this.f6725a.d(i12);
        this.f6727c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
