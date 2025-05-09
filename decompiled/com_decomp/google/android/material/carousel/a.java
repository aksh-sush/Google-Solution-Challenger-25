package com.google.android.material.carousel;

final class a {

    /* renamed from: a  reason: collision with root package name */
    final int f6908a;

    /* renamed from: b  reason: collision with root package name */
    float f6909b;

    /* renamed from: c  reason: collision with root package name */
    int f6910c;

    /* renamed from: d  reason: collision with root package name */
    int f6911d;

    /* renamed from: e  reason: collision with root package name */
    float f6912e;

    /* renamed from: f  reason: collision with root package name */
    float f6913f;

    /* renamed from: g  reason: collision with root package name */
    final int f6914g;

    /* renamed from: h  reason: collision with root package name */
    final float f6915h;

    a(int i10, float f10, float f11, float f12, int i11, float f13, int i12, float f14, int i13, float f15) {
        this.f6908a = i10;
        this.f6909b = z.a.a(f10, f11, f12);
        this.f6910c = i11;
        this.f6912e = f13;
        this.f6911d = i12;
        this.f6913f = f14;
        this.f6914g = i13;
        d(f15, f11, f12, f14);
        this.f6915h = b(f14);
    }

    private float a(float f10, int i10, float f11, int i11, int i12) {
        if (i10 <= 0) {
            f11 = 0.0f;
        }
        float f12 = ((float) i11) / 2.0f;
        return (f10 - ((((float) i10) + f12) * f11)) / (((float) i12) + f12);
    }

    private float b(float f10) {
        if (!g()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f10 - this.f6913f) * ((float) this.f6908a);
    }

    static a c(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr5.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr5[i12];
                int length2 = iArr4.length;
                int i14 = 0;
                while (i14 < length2) {
                    a aVar2 = r8;
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar3 = new a(i10, f11, f12, f13, iArr4[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f6915h < aVar.f6915h) {
                        if (aVar2.f6915h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                int i19 = length;
                i12++;
            }
        }
        return aVar;
    }

    private void d(float f10, float f11, float f12, float f13) {
        float f14;
        float f15 = f10 - f();
        int i10 = this.f6910c;
        if (i10 > 0 && f15 > 0.0f) {
            float f16 = this.f6909b;
            this.f6909b = f16 + Math.min(f15 / ((float) i10), f12 - f16);
        } else if (i10 > 0 && f15 < 0.0f) {
            float f17 = this.f6909b;
            this.f6909b = f17 + Math.max(f15 / ((float) i10), f11 - f17);
        }
        int i11 = this.f6910c;
        float f18 = i11 > 0 ? this.f6909b : 0.0f;
        this.f6909b = f18;
        float a10 = a(f10, i11, f18, this.f6911d, this.f6914g);
        this.f6913f = a10;
        float f19 = (this.f6909b + a10) / 2.0f;
        this.f6912e = f19;
        int i12 = this.f6911d;
        if (i12 > 0 && a10 != f13) {
            float f20 = (f13 - a10) * ((float) this.f6914g);
            float min = Math.min(Math.abs(f20), f19 * 0.1f * ((float) i12));
            if (f20 > 0.0f) {
                this.f6912e -= min / ((float) this.f6911d);
                f14 = this.f6913f + (min / ((float) this.f6914g));
            } else {
                this.f6912e += min / ((float) this.f6911d);
                f14 = this.f6913f - (min / ((float) this.f6914g));
            }
            this.f6913f = f14;
        }
    }

    private float f() {
        return (this.f6913f * ((float) this.f6914g)) + (this.f6912e * ((float) this.f6911d)) + (this.f6909b * ((float) this.f6910c));
    }

    private boolean g() {
        int i10 = this.f6914g;
        if (i10 <= 0 || this.f6910c <= 0 || this.f6911d <= 0) {
            return i10 <= 0 || this.f6910c <= 0 || this.f6913f > this.f6909b;
        }
        float f10 = this.f6913f;
        float f11 = this.f6912e;
        return f10 > f11 && f11 > this.f6909b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f6910c + this.f6911d + this.f6914g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f6908a + ", smallCount=" + this.f6910c + ", smallSize=" + this.f6909b + ", mediumCount=" + this.f6911d + ", mediumSize=" + this.f6912e + ", largeCount=" + this.f6914g + ", largeSize=" + this.f6913f + ", cost=" + this.f6915h + "]";
    }
}
