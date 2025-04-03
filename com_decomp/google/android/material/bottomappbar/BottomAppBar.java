package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;
import o4.a;
import o4.i;

public abstract class BottomAppBar extends Toolbar {

    /* renamed from: b0  reason: collision with root package name */
    private static final int f6765b0 = i.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: c0  reason: collision with root package name */
    private static final int f6766c0 = a.motionDurationLong2;

    /* renamed from: d0  reason: collision with root package name */
    private static final int f6767d0 = a.motionEasingEmphasizedInterpolator;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m  reason: collision with root package name */
        private final Rect f6768m = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public WeakReference f6769n;

        /* renamed from: o  reason: collision with root package name */
        private int f6770o;

        /* renamed from: p  reason: collision with root package name */
        private final View.OnLayoutChangeListener f6771p = new a();

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                b.a(Behavior.this.f6769n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            b.a(view);
            return P(coordinatorLayout, (BottomAppBar) null, view2, view3, i10, i11);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f6769n = new WeakReference(bottomAppBar);
            View T = BottomAppBar.T(bottomAppBar);
            if (T != null && !h0.W(T)) {
                BottomAppBar.V(bottomAppBar, T);
                this.f6770o = ((CoordinatorLayout.e) T.getLayoutParams()).bottomMargin;
                T.addOnLayoutChangeListener(this.f6771p);
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return O(coordinatorLayout, (BottomAppBar) null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    /* access modifiers changed from: private */
    public static void V(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).f2005d = 17;
        throw null;
    }
}
