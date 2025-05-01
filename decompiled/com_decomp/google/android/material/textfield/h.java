package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import g5.g;
import g5.k;

abstract class h extends g {
    b D;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        /* access modifiers changed from: protected */
        public void r(Canvas canvas) {
            if (this.D.f7361w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                boolean unused = canvas.clipOutRect(this.D.f7361w);
            } else {
                canvas.clipRect(this.D.f7361w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    private h(b bVar) {
        super((g.c) bVar);
        this.D = bVar;
    }

    /* access modifiers changed from: private */
    public static h f0(b bVar) {
        return new c(bVar);
    }

    static h g0(k kVar) {
        if (kVar == null) {
            kVar = new k();
        }
        return f0(new b(kVar, new RectF()));
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return !this.D.f7361w.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void j0(float f10, float f11, float f12, float f13) {
        if (f10 != this.D.f7361w.left || f11 != this.D.f7361w.top || f12 != this.D.f7361w.right || f13 != this.D.f7361w.bottom) {
            this.D.f7361w.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public Drawable mutate() {
        this.D = new b(this.D);
        return this;
    }

    private static final class b extends g.c {
        /* access modifiers changed from: private */

        /* renamed from: w  reason: collision with root package name */
        public final RectF f7361w;

        private b(b bVar) {
            super(bVar);
            this.f7361w = bVar.f7361w;
        }

        public Drawable newDrawable() {
            h e02 = h.f0(this);
            e02.invalidateSelf();
            return e02;
        }

        private b(k kVar, RectF rectF) {
            super(kVar, (y4.a) null);
            this.f7361w = rectF;
        }
    }
}
