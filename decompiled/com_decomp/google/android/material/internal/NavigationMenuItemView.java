package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.s0;
import androidx.core.content.res.h;
import androidx.core.view.accessibility.h0;
import androidx.core.widget.j;
import o4.c;
import o4.d;
import o4.e;
import o4.g;

public class NavigationMenuItemView extends d implements n.a {
    private static final int[] K = {16842912};
    private boolean A;
    boolean B;
    boolean C;
    private final CheckedTextView D;
    private FrameLayout E;
    private i F;
    private ColorStateList G;
    private boolean H;
    private Drawable I;
    private final androidx.core.view.a J;

    /* renamed from: z  reason: collision with root package name */
    private int f7121z;

    class a extends androidx.core.view.a {
        a() {
        }

        public void g(View view, h0 h0Var) {
            super.g(view, h0Var);
            h0Var.Z(NavigationMenuItemView.this.B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        int i10;
        s0.a aVar;
        if (D()) {
            this.D.setVisibility(8);
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                aVar = (s0.a) frameLayout.getLayoutParams();
                i10 = -1;
            } else {
                return;
            }
        } else {
            this.D.setVisibility(0);
            FrameLayout frameLayout2 = this.E;
            if (frameLayout2 != null) {
                aVar = (s0.a) frameLayout2.getLayoutParams();
                i10 = -2;
            } else {
                return;
            }
        }
        aVar.width = i10;
        this.E.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(f.a.f9997t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.F.getTitle() == null && this.F.getIcon() == null && this.F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E == null) {
                this.E = (FrameLayout) ((ViewStub) findViewById(e.design_menu_item_action_area_stub)).inflate();
            }
            this.E.removeAllViews();
            this.E.addView(view);
        }
    }

    public boolean d() {
        return false;
    }

    public void e(i iVar, int i10) {
        this.F = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            androidx.core.view.h0.w0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        k1.a(this, iVar.getTooltipText());
        B();
    }

    public i getItemData() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        i iVar = this.F;
        if (iVar != null && iVar.isCheckable() && this.F.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.B != z10) {
            this.B = z10;
            this.J.l(this.D, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.D.setChecked(z10);
        CheckedTextView checkedTextView = this.D;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (!z10 || !this.C) ? 0 : 1);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.G);
            }
            int i10 = this.f7121z;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.A) {
            if (this.I == null) {
                Drawable f10 = h.f(getResources(), d.navigation_empty_icon, getContext().getTheme());
                this.I = f10;
                if (f10 != null) {
                    int i11 = this.f7121z;
                    f10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.I;
        }
        j.i(this.D, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.D.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f7121z = i10;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.H = colorStateList != null;
        i iVar = this.F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.D.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.A = z10;
    }

    public void setTextAppearance(int i10) {
        j.n(this.D, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = true;
        a aVar = new a();
        this.J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(g.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.design_menu_item_text);
        this.D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        androidx.core.view.h0.s0(checkedTextView, aVar);
    }
}
