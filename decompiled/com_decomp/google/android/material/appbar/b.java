package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import androidx.core.view.h1;
import androidx.core.view.o;
import java.util.List;
import z.a;

abstract class b extends c {

    /* renamed from: d  reason: collision with root package name */
    final Rect f6721d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    final Rect f6722e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private int f6723f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f6724g;

    public b() {
    }

    private static int L(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        View G = G(coordinatorLayout.q(view));
        if (G != null) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
            Rect rect = this.f6721d;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, G.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((coordinatorLayout.getHeight() + G.getBottom()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            h1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && h0.B(coordinatorLayout) && !h0.B(view)) {
                rect.left += lastWindowInsets.j();
                rect.right -= lastWindowInsets.k();
            }
            Rect rect2 = this.f6722e;
            o.a(L(eVar.f2004c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            int H = H(G);
            view.layout(rect2.left, rect2.top - H, rect2.right, rect2.bottom - H);
            i11 = rect2.top - G.getBottom();
        } else {
            super.F(coordinatorLayout, view, i10);
            i11 = 0;
        }
        this.f6723f = i11;
    }

    /* access modifiers changed from: package-private */
    public abstract View G(List list);

    /* access modifiers changed from: package-private */
    public final int H(View view) {
        if (this.f6724g == 0) {
            return 0;
        }
        float I = I(view);
        int i10 = this.f6724g;
        return a.b((int) (I * ((float) i10)), 0, i10);
    }

    /* access modifiers changed from: package-private */
    public abstract float I(View view);

    /* access modifiers changed from: package-private */
    public int J(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public final int K() {
        return this.f6723f;
    }

    public final void M(int i10) {
        this.f6724g = i10;
    }

    /* access modifiers changed from: protected */
    public boolean N() {
        return false;
    }

    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View G;
        h1 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (G = G(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (h0.B(G) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int J = size + J(G);
        int measuredHeight = G.getMeasuredHeight();
        if (N()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            J -= measuredHeight;
        }
        coordinatorLayout.H(view, i10, i11, View.MeasureSpec.makeMeasureSpec(J, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
