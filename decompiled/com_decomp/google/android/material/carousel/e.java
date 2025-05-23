package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.f;
import o4.c;

abstract class e {
    static float a(float f10, float f11, int i10) {
        return f10 + (((float) Math.max(0, i10 - 1)) * f11);
    }

    static float b(float f10, float f11, int i10) {
        return i10 > 0 ? f10 + (f11 / 2.0f) : f10;
    }

    static f c(Context context, float f10, float f11, a aVar) {
        float f12;
        float f13;
        float f14 = f10;
        float f15 = f11;
        a aVar2 = aVar;
        float min = Math.min(f(context) + f14, aVar2.f6913f);
        float f16 = min / 2.0f;
        float f17 = 0.0f - f16;
        float b10 = b(0.0f, aVar2.f6909b, aVar2.f6910c);
        float j10 = j(0.0f, a(b10, aVar2.f6909b, (int) Math.floor((double) (((float) aVar2.f6910c) / 2.0f))), aVar2.f6909b, aVar2.f6910c);
        float b11 = b(j10, aVar2.f6912e, aVar2.f6911d);
        float j11 = j(j10, a(b11, aVar2.f6912e, (int) Math.floor((double) (((float) aVar2.f6911d) / 2.0f))), aVar2.f6912e, aVar2.f6911d);
        float b12 = b(j11, aVar2.f6913f, aVar2.f6914g);
        float j12 = j(j11, a(b12, aVar2.f6913f, aVar2.f6914g), aVar2.f6913f, aVar2.f6914g);
        float b13 = b(j12, aVar2.f6912e, aVar2.f6911d);
        float b14 = b(j(j12, a(b13, aVar2.f6912e, (int) Math.ceil((double) (((float) aVar2.f6911d) / 2.0f))), aVar2.f6912e, aVar2.f6911d), aVar2.f6909b, aVar2.f6910c);
        float f18 = f16 + f15;
        float b15 = d.b(min, aVar2.f6913f, f14);
        float b16 = d.b(aVar2.f6909b, aVar2.f6913f, f14);
        float b17 = d.b(aVar2.f6912e, aVar2.f6913f, f14);
        f.b a10 = new f.b(aVar2.f6913f, f15).a(f17, b15, min);
        int i10 = aVar2.f6910c;
        if (i10 > 0) {
            f12 = f18;
            a10.f(b10, b16, aVar2.f6909b, (int) Math.floor((double) (((float) i10) / 2.0f)));
        } else {
            f12 = f18;
        }
        int i11 = aVar2.f6911d;
        if (i11 > 0) {
            a10.f(b11, b17, aVar2.f6912e, (int) Math.floor((double) (((float) i11) / 2.0f)));
        }
        float f19 = b16;
        a10.g(b12, 0.0f, aVar2.f6913f, aVar2.f6914g, true);
        int i12 = aVar2.f6911d;
        if (i12 > 0) {
            f13 = 2.0f;
            a10.f(b13, b17, aVar2.f6912e, (int) Math.ceil((double) (((float) i12) / 2.0f)));
        } else {
            f13 = 2.0f;
        }
        int i13 = aVar2.f6910c;
        if (i13 > 0) {
            a10.f(b14, f19, aVar2.f6909b, (int) Math.ceil((double) (((float) i13) / f13)));
        }
        a10.a(f12, b15, min);
        return a10.h();
    }

    static f d(Context context, float f10, float f11, a aVar, int i10) {
        return i10 == 1 ? c(context, f10, f11, aVar) : e(context, f10, f11, aVar);
    }

    static f e(Context context, float f10, float f11, a aVar) {
        float min = Math.min(f(context) + f10, aVar.f6913f);
        float f12 = min / 2.0f;
        float f13 = 0.0f - f12;
        float b10 = b(0.0f, aVar.f6913f, aVar.f6914g);
        float j10 = j(0.0f, a(b10, aVar.f6913f, aVar.f6914g), aVar.f6913f, aVar.f6914g);
        float b11 = b(j10, aVar.f6912e, aVar.f6911d);
        float b12 = b(j(j10, b11, aVar.f6912e, aVar.f6911d), aVar.f6909b, aVar.f6910c);
        float f14 = f12 + f11;
        float b13 = d.b(min, aVar.f6913f, f10);
        float b14 = d.b(aVar.f6909b, aVar.f6913f, f10);
        float b15 = d.b(aVar.f6912e, aVar.f6913f, f10);
        f.b g10 = new f.b(aVar.f6913f, f11).a(f13, b13, min).g(b10, 0.0f, aVar.f6913f, aVar.f6914g, true);
        if (aVar.f6911d > 0) {
            g10.b(b11, b15, aVar.f6912e);
        }
        int i10 = aVar.f6910c;
        if (i10 > 0) {
            g10.f(b12, b14, aVar.f6909b, i10);
        }
        g10.a(f14, b13, min);
        return g10.h();
    }

    static float f(Context context) {
        return context.getResources().getDimension(c.m3_carousel_gone_size);
    }

    static float g(Context context) {
        return context.getResources().getDimension(c.m3_carousel_small_item_size_max);
    }

    static float h(Context context) {
        return context.getResources().getDimension(c.m3_carousel_small_item_size_min);
    }

    static int i(int[] iArr) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 : iArr) {
            if (i11 > i10) {
                i10 = i11;
            }
        }
        return i10;
    }

    static float j(float f10, float f11, float f12, int i10) {
        return i10 > 0 ? f11 + (f12 / 2.0f) : f10;
    }
}
