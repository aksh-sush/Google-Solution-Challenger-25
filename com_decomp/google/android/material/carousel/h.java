package com.google.android.material.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import z.a;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f6945b = {1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f6946c = {1, 0};

    /* renamed from: a  reason: collision with root package name */
    private int f6947a = 0;

    /* access modifiers changed from: package-private */
    public f c(b bVar, View view) {
        float c10 = (float) bVar.c();
        if (bVar.f()) {
            c10 = (float) bVar.a();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f10 = (float) (qVar.topMargin + qVar.bottomMargin);
        float measuredHeight = (float) view.getMeasuredHeight();
        if (bVar.f()) {
            f10 = (float) (qVar.leftMargin + qVar.rightMargin);
            measuredHeight = (float) view.getMeasuredWidth();
        }
        float f11 = f10;
        float h10 = e.h(view.getContext()) + f11;
        float g10 = e.g(view.getContext()) + f11;
        float min = Math.min(measuredHeight + f11, c10);
        float a10 = a.a((measuredHeight / 3.0f) + f11, e.h(view.getContext()) + f11, e.g(view.getContext()) + f11);
        float f12 = (min + a10) / 2.0f;
        int[] iArr = f6945b;
        if (c10 < 2.0f * h10) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f6946c;
        if (bVar.b() == 1) {
            iArr = d.a(iArr);
            iArr2 = d.a(iArr2);
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int ceil = (int) Math.ceil((double) (c10 / min));
        int max = (ceil - ((int) Math.max(1.0d, Math.floor((double) (((c10 - (((float) e.i(iArr4)) * f12)) - (((float) e.i(iArr3)) * g10)) / min))))) + 1;
        int[] iArr5 = new int[max];
        for (int i10 = 0; i10 < max; i10++) {
            iArr5[i10] = ceil - i10;
        }
        a c11 = a.c(c10, a10, h10, g10, iArr3, f12, iArr4, min, iArr5);
        this.f6947a = c11.e();
        if (e(c11, bVar.e())) {
            c11 = a.c(c10, a10, h10, g10, new int[]{c11.f6910c}, f12, new int[]{c11.f6911d}, min, new int[]{c11.f6914g});
        }
        return e.d(view.getContext(), f11, c10, c11, bVar.b());
    }

    /* access modifiers changed from: package-private */
    public boolean d(b bVar, int i10) {
        return (i10 < this.f6947a && bVar.e() >= this.f6947a) || (i10 >= this.f6947a && bVar.e() < this.f6947a);
    }

    /* access modifiers changed from: package-private */
    public boolean e(a aVar, int i10) {
        int e10 = aVar.e() - i10;
        boolean z10 = e10 > 0 && (aVar.f6910c > 0 || aVar.f6911d > 1);
        while (e10 > 0) {
            int i11 = aVar.f6910c;
            if (i11 > 0) {
                aVar.f6910c = i11 - 1;
            } else {
                int i12 = aVar.f6911d;
                if (i12 > 1) {
                    aVar.f6911d = i12 - 1;
                }
            }
            e10--;
        }
        return z10;
    }
}
