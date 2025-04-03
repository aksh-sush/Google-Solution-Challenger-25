package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: h  reason: collision with root package name */
    private boolean f7216h = false;

    public SearchBar$ScrollingViewBehavior() {
    }

    /* access modifiers changed from: protected */
    public boolean N() {
        return true;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return super.h(coordinatorLayout, view, view2);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
