package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.t0;
import androidx.core.view.h0;
import com.google.android.material.internal.e;
import com.google.android.material.internal.s;
import g5.g;
import o4.c;
import o4.i;
import o4.j;

public class w extends d {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final t0 f7451i;

    /* renamed from: j  reason: collision with root package name */
    private final AccessibilityManager f7452j;

    /* renamed from: k  reason: collision with root package name */
    private final Rect f7453k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7454l;

    /* renamed from: m  reason: collision with root package name */
    private final float f7455m;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f7456n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f7457o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f7458p;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            w wVar = w.this;
            w.this.j(i10 < 0 ? wVar.f7451i.v() : wVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = w.this.f7451i.y();
                    i10 = w.this.f7451i.x();
                    j10 = w.this.f7451i.w();
                }
                onItemClickListener.onItemClick(w.this.f7451i.g(), view, i10, j10);
            }
            w.this.f7451i.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* renamed from: e  reason: collision with root package name */
        private ColorStateList f7460e;

        /* renamed from: f  reason: collision with root package name */
        private ColorStateList f7461f;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {16843623, -16842919};
            int[] iArr2 = {16842913, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{v4.a.j(w.this.f7457o, w.this.f7458p.getColorForState(iArr2, 0)), v4.a.j(w.this.f7457o, w.this.f7458p.getColorForState(iArr, 0)), w.this.f7457o});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f7457o);
            if (this.f7461f == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.o(colorDrawable, this.f7460e);
            return new RippleDrawable(this.f7461f, colorDrawable, (Drawable) null);
        }

        private boolean c() {
            return w.this.f7457o != 0;
        }

        private boolean d() {
            return w.this.f7458p != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {16842919};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f7458p.getColorForState(iArr, 0), 0});
        }

        /* access modifiers changed from: package-private */
        public void f() {
            this.f7461f = e();
            this.f7460e = a();
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                h0.w0(textView, w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o4.a.f13896a);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        AccessibilityManager accessibilityManager = this.f7452j;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int h() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f10 = f();
        int i10 = 0;
        if (adapter == null || f10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f7451i.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, f10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable f11 = this.f7451i.f();
        if (f11 != null) {
            f11.getPadding(this.f7453k);
            Rect rect = this.f7453k;
            i11 += rect.left + rect.right;
        }
        return i11 + f10.getEndIconView().getMeasuredWidth();
    }

    private void i() {
        TextInputLayout f10 = f();
        if (f10 != null) {
            f10.r0();
        }
    }

    /* access modifiers changed from: private */
    public void j(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public void dismissDropDown() {
        if (g()) {
            this.f7451i.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f7456n;
    }

    public CharSequence getHint() {
        TextInputLayout f10 = f();
        return (f10 == null || !f10.R()) ? super.getHint() : f10.getHint();
    }

    public float getPopupElevation() {
        return this.f7455m;
    }

    public int getSimpleItemSelectedColor() {
        return this.f7457o;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f7458p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f10 = f();
        if (f10 != null && f10.R() && super.getHint() == null && e.b()) {
            setHint("");
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7451i.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), h()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (!g()) {
            super.onWindowFocusChanged(z10);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f7451i.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        t0 t0Var = this.f7451i;
        if (t0Var != null) {
            t0Var.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f7456n = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).T(this.f7456n);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f7451i.M(getOnItemSelectedListener());
    }

    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        i();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f7457o = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f7458p = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void showDropDown() {
        if (g()) {
            this.f7451i.d();
        } else {
            super.showDropDown();
        }
    }

    public w(Context context, AttributeSet attributeSet, int i10) {
        super(j5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f7453k = new Rect();
        Context context2 = getContext();
        TypedArray i11 = s.i(context2, attributeSet, j.T1, i10, i.f13906b, new int[0]);
        int i12 = j.U1;
        if (i11.hasValue(i12) && i11.getInt(i12, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f7454l = i11.getResourceId(j.X1, o4.g.mtrl_auto_complete_simple_item);
        this.f7455m = (float) i11.getDimensionPixelOffset(j.V1, c.mtrl_exposed_dropdown_menu_popup_elevation);
        int i13 = j.W1;
        if (i11.hasValue(i13)) {
            this.f7456n = ColorStateList.valueOf(i11.getColor(i13, 0));
        }
        this.f7457o = i11.getColor(j.Y1, 0);
        this.f7458p = d5.c.a(context2, i11, j.Z1);
        this.f7452j = (AccessibilityManager) context2.getSystemService("accessibility");
        t0 t0Var = new t0(context2);
        this.f7451i = t0Var;
        t0Var.J(true);
        t0Var.D(this);
        t0Var.I(2);
        t0Var.p(getAdapter());
        t0Var.L(new a());
        int i14 = j.f13910a2;
        if (i11.hasValue(i14)) {
            setSimpleItems(i11.getResourceId(i14, 0));
        }
        i11.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f7454l, strArr));
    }
}
