package com.google.android.material.transformation;

import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import java.util.List;
import z4.a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private int f7511a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    public a E(CoordinatorLayout coordinatorLayout, View view) {
        List q10 = coordinatorLayout.q(view);
        int size = q10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) q10.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                b.a(view2);
                return null;
            }
        }
        return null;
    }

    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b.a(view2);
        throw null;
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (h0.W(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
