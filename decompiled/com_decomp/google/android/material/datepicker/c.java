package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import d5.b;
import o4.a;
import o4.j;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f7020a;

    /* renamed from: b  reason: collision with root package name */
    final b f7021b;

    /* renamed from: c  reason: collision with root package name */
    final b f7022c;

    /* renamed from: d  reason: collision with root package name */
    final b f7023d;

    /* renamed from: e  reason: collision with root package name */
    final b f7024e;

    /* renamed from: f  reason: collision with root package name */
    final b f7025f;

    /* renamed from: g  reason: collision with root package name */
    final b f7026g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f7027h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.d(context, a.materialCalendarStyle, j.class.getCanonicalName()), j.B2);
        this.f7020a = b.a(context, obtainStyledAttributes.getResourceId(j.F2, 0));
        this.f7026g = b.a(context, obtainStyledAttributes.getResourceId(j.D2, 0));
        this.f7021b = b.a(context, obtainStyledAttributes.getResourceId(j.E2, 0));
        this.f7022c = b.a(context, obtainStyledAttributes.getResourceId(j.G2, 0));
        ColorStateList a10 = d5.c.a(context, obtainStyledAttributes, j.H2);
        this.f7023d = b.a(context, obtainStyledAttributes.getResourceId(j.J2, 0));
        this.f7024e = b.a(context, obtainStyledAttributes.getResourceId(j.I2, 0));
        this.f7025f = b.a(context, obtainStyledAttributes.getResourceId(j.K2, 0));
        Paint paint = new Paint();
        this.f7027h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
