package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b  reason: collision with root package name */
    private final Rect f7512b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final RectF f7513c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f7514d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final int[] f7515e = new int[2];

    public FabTransformationBehavior() {
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public void g(CoordinatorLayout.e eVar) {
        if (eVar.f2009h == 0) {
            eVar.f2009h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
