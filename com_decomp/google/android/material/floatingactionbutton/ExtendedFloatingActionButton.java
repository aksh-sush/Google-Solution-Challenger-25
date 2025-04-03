package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import o4.j;

public abstract class ExtendedFloatingActionButton extends MaterialButton {

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7109a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f7110b;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7109a = false;
            this.f7110b = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                return ((CoordinatorLayout.e) layoutParams).e() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean I(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            throw null;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!I(view, extendedFloatingActionButton)) {
                return false;
            }
            throw null;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean G(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (!F(view)) {
                return false;
            }
            J(view, extendedFloatingActionButton);
            return false;
        }

        public boolean H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List q10 = coordinatorLayout.q(extendedFloatingActionButton);
            int size = q10.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) q10.get(i11);
                if (F(view) && J(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.G(extendedFloatingActionButton, i10);
            return true;
        }

        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            b.a(view);
            return E(coordinatorLayout, (ExtendedFloatingActionButton) null, rect);
        }

        public void g(CoordinatorLayout.e eVar) {
            if (eVar.f2009h == 0) {
                eVar.f2009h = 80;
            }
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return G(coordinatorLayout, (ExtendedFloatingActionButton) null, view2);
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return H(coordinatorLayout, (ExtendedFloatingActionButton) null, i10);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f14021o1);
            this.f7109a = obtainStyledAttributes.getBoolean(j.f14029p1, false);
            this.f7110b = obtainStyledAttributes.getBoolean(j.f14037q1, true);
            obtainStyledAttributes.recycle();
        }
    }
}
