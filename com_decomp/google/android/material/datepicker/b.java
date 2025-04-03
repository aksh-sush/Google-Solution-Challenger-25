package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.h;
import androidx.core.view.h0;
import d5.c;
import g5.g;
import g5.k;
import o4.j;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f7014a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f7015b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f7016c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f7017d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7018e;

    /* renamed from: f  reason: collision with root package name */
    private final k f7019f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, k kVar, Rect rect) {
        h.d(rect.left);
        h.d(rect.top);
        h.d(rect.right);
        h.d(rect.bottom);
        this.f7014a = rect;
        this.f7015b = colorStateList2;
        this.f7016c = colorStateList;
        this.f7017d = colorStateList3;
        this.f7018e = i10;
        this.f7019f = kVar;
    }

    static b a(Context context, int i10) {
        h.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, j.L2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(j.M2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.O2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.N2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.P2, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, j.Q2);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, j.V2);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, j.T2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.U2, 0);
        k m10 = k.b(context, obtainStyledAttributes.getResourceId(j.R2, 0), obtainStyledAttributes.getResourceId(j.S2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* access modifiers changed from: package-private */
    public void b(TextView textView) {
        c(textView, (ColorStateList) null, (ColorStateList) null);
    }

    /* access modifiers changed from: package-private */
    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f7019f);
        gVar2.setShapeAppearanceModel(this.f7019f);
        if (colorStateList == null) {
            colorStateList = this.f7016c;
        }
        gVar.T(colorStateList);
        gVar.Y((float) this.f7018e, this.f7017d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f7015b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7015b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7014a;
        h0.w0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
