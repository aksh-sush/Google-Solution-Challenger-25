package com.google.android.material.search;

import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class SearchView extends FrameLayout {

    public static class Behavior extends CoordinatorLayout.b {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean E(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return E(coordinatorLayout, (SearchView) null, view2);
        }
    }
}
