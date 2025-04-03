package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import l1.e;
import l1.i;
import n1.a;

public class MDButton extends TextView {

    /* renamed from: e  reason: collision with root package name */
    private boolean f4612e = false;

    /* renamed from: f  reason: collision with root package name */
    private e f4613f;

    /* renamed from: g  reason: collision with root package name */
    private int f4614g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f4615h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f4616i;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        this.f4614g = context.getResources().getDimensionPixelSize(i.md_dialog_frame_margin);
        this.f4613f = e.END;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10, boolean z11) {
        if (this.f4612e != z10 || z11) {
            setGravity(z10 ? this.f4613f.a() | 16 : 17);
            setTextAlignment(z10 ? this.f4613f.c() : 4);
            a.t(this, z10 ? this.f4615h : this.f4616i);
            if (z10) {
                setPadding(this.f4614g, getPaddingTop(), this.f4614g, getPaddingBottom());
            }
            this.f4612e = z10;
        }
    }

    public void setAllCapsCompat(boolean z10) {
        setAllCaps(z10);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f4616i = drawable;
        if (!this.f4612e) {
            b(false, true);
        }
    }

    public void setStackedGravity(e eVar) {
        this.f4613f = eVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f4615h = drawable;
        if (this.f4612e) {
            b(true, true);
        }
    }
}
