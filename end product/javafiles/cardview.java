package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
abstract class e extends Drawable {

    /* renamed from: a */
    private static final double f1434a = Math.cos(Math.toRadians(45.0d));

    static float a(float f10, float f11, boolean z10) {
        return z10 ? (float) (f10 + ((1.0d - f1434a) * f11)) : f10;
    }

    static float b(float f10, float f11, boolean z10) {
        float f12 = f10 * 1.5f;
        return z10 ? (float) (f12 + ((1.0d - f1434a) * f11)) : f12;
    }
}