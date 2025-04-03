package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.h0;
import com.google.android.material.internal.t;
import g5.h;
import o4.a;
import o4.i;
import x4.g;

public class MaterialToolbar extends Toolbar {

    /* renamed from: g0  reason: collision with root package name */
    private static final int f6704g0 = i.Widget_MaterialComponents_Toolbar;

    /* renamed from: h0  reason: collision with root package name */
    private static final ImageView.ScaleType[] f6705h0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: b0  reason: collision with root package name */
    private Integer f6706b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f6707c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f6708d0;

    /* renamed from: e0  reason: collision with root package name */
    private ImageView.ScaleType f6709e0;

    /* renamed from: f0  reason: collision with root package name */
    private Boolean f6710f0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.O);
    }

    private Pair S(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void T(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : g.f(background);
        if (valueOf != null) {
            g5.g gVar = new g5.g();
            gVar.T(valueOf);
            gVar.J(context);
            gVar.S(h0.y(this));
            h0.w0(this, gVar);
        }
    }

    private void U(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void V() {
        if (this.f6707c0 || this.f6708d0) {
            TextView e10 = t.e(this);
            TextView c10 = t.c(this);
            if (e10 != null || c10 != null) {
                Pair S = S(e10, c10);
                if (this.f6707c0 && e10 != null) {
                    U(e10, S);
                }
                if (this.f6708d0 && c10 != null) {
                    U(c10, S);
                }
            }
        }
    }

    private Drawable W(Drawable drawable) {
        if (drawable == null || this.f6706b0 == null) {
            return drawable;
        }
        Drawable r10 = androidx.core.graphics.drawable.a.r(drawable.mutate());
        androidx.core.graphics.drawable.a.n(r10, this.f6706b0.intValue());
        return r10;
    }

    private void X() {
        ImageView b10 = t.b(this);
        if (b10 != null) {
            Boolean bool = this.f6710f0;
            if (bool != null) {
                b10.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f6709e0;
            if (scaleType != null) {
                b10.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f6709e0;
    }

    public Integer getNavigationIconTint() {
        return this.f6706b0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        V();
        X();
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f6710f0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f6710f0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f6709e0 != scaleType) {
            this.f6709e0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f6706b0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f6708d0 != z10) {
            this.f6708d0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f6707c0 != z10) {
            this.f6707c0 = z10;
            requestLayout();
        }
    }

    public void x(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).d0();
        }
        super.x(i10);
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).c0();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f6704g0
            android.content.Context r8 = j5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = o4.j.A3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r10 = o4.j.D3
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = o4.j.F3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f6707c0 = r10
            int r10 = o4.j.E3
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f6708d0 = r10
            int r10 = o4.j.C3
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f6705h0
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f6709e0 = r10
        L_0x004a:
            int r10 = o4.j.B3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f6710f0 = r10
        L_0x005c:
            r9.recycle()
            r7.T(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
