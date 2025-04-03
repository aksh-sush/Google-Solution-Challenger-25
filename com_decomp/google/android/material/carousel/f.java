package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final float f6919a;

    /* renamed from: b  reason: collision with root package name */
    private final List f6920b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6921c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6922d;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f6923a;

        /* renamed from: b  reason: collision with root package name */
        private final float f6924b;

        /* renamed from: c  reason: collision with root package name */
        private final List f6925c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private c f6926d;

        /* renamed from: e  reason: collision with root package name */
        private c f6927e;

        /* renamed from: f  reason: collision with root package name */
        private int f6928f = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f6929g = -1;

        /* renamed from: h  reason: collision with root package name */
        private float f6930h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        private int f6931i = -1;

        b(float f10, float f11) {
            this.f6923a = f10;
            this.f6924b = f11;
        }

        private static float i(float f10, float f11, int i10, int i11) {
            return (f10 - (((float) i10) * f11)) + (((float) i11) * f11);
        }

        /* access modifiers changed from: package-private */
        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        /* access modifiers changed from: package-private */
        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        /* access modifiers changed from: package-private */
        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        /* access modifiers changed from: package-private */
        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float abs;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            float f17 = this.f6924b;
            if (f16 > f17) {
                abs = Math.abs(f16 - Math.max(f16 - f12, f17));
            } else if (f15 < 0.0f) {
                abs = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
            } else {
                f13 = 0.0f;
                return e(f10, f11, f12, z10, z11, f13);
            }
            f13 = abs;
            return e(f10, f11, f12, z10, z11, f13);
        }

        /* access modifiers changed from: package-private */
        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (!z10) {
                    int i10 = this.f6931i;
                    if (i10 == -1 || i10 == 0) {
                        this.f6931i = this.f6925c.size();
                    } else {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13);
            c cVar2 = this.f6926d;
            if (z10) {
                if (cVar2 == null) {
                    this.f6926d = cVar;
                    this.f6928f = this.f6925c.size();
                }
                if (this.f6929g != -1 && this.f6925c.size() - this.f6929g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                } else if (f12 == this.f6926d.f6935d) {
                    this.f6927e = cVar;
                    this.f6929g = this.f6925c.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (cVar2 == null && cVar.f6935d < this.f6930h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else if (this.f6927e != null && cVar.f6935d > this.f6930h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
            this.f6930h = cVar.f6935d;
            this.f6925c.add(cVar);
            return this;
        }

        /* access modifiers changed from: package-private */
        public b f(float f10, float f11, float f12, int i10) {
            return g(f10, f11, f12, i10, false);
        }

        /* access modifiers changed from: package-private */
        public b g(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((((float) i11) * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public f h() {
            if (this.f6926d != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f6925c.size(); i10++) {
                    c cVar = (c) this.f6925c.get(i10);
                    arrayList.add(new c(i(this.f6926d.f6933b, this.f6923a, this.f6928f, i10), cVar.f6933b, cVar.f6934c, cVar.f6935d, cVar.f6936e, cVar.f6937f));
                }
                return new f(this.f6923a, arrayList, this.f6928f, this.f6929g);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        final float f6932a;

        /* renamed from: b  reason: collision with root package name */
        final float f6933b;

        /* renamed from: c  reason: collision with root package name */
        final float f6934c;

        /* renamed from: d  reason: collision with root package name */
        final float f6935d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f6936e;

        /* renamed from: f  reason: collision with root package name */
        final float f6937f;

        c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f);
        }

        static c a(c cVar, c cVar2, float f10) {
            return new c(p4.a.a(cVar.f6932a, cVar2.f6932a, f10), p4.a.a(cVar.f6933b, cVar2.f6933b, f10), p4.a.a(cVar.f6934c, cVar2.f6934c, f10), p4.a.a(cVar.f6935d, cVar2.f6935d, f10));
        }

        c(float f10, float f11, float f12, float f13, boolean z10, float f14) {
            this.f6932a = f10;
            this.f6933b = f11;
            this.f6934c = f12;
            this.f6935d = f13;
            this.f6936e = z10;
            this.f6937f = f14;
        }
    }

    private f(float f10, List list, int i10, int i11) {
        this.f6919a = f10;
        this.f6920b = Collections.unmodifiableList(list);
        this.f6921c = i10;
        this.f6922d = i11;
    }

    static f l(f fVar, f fVar2, float f10) {
        if (fVar.f() == fVar2.f()) {
            List g10 = fVar.g();
            List g11 = fVar2.g();
            if (g10.size() == g11.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < fVar.g().size(); i10++) {
                    arrayList.add(c.a((c) g10.get(i10), (c) g11.get(i10), f10));
                }
                return new f(fVar.f(), arrayList, p4.a.c(fVar.b(), fVar2.b(), f10), p4.a.c(fVar.i(), fVar2.i(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static f m(f fVar, float f10) {
        b bVar = new b(fVar.f(), f10);
        float f11 = (f10 - fVar.j().f6933b) - (fVar.j().f6935d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) fVar.g().get(size);
            bVar.d(f11 + (cVar.f6935d / 2.0f), cVar.f6934c, cVar.f6935d, size >= fVar.b() && size <= fVar.i(), cVar.f6936e);
            f11 += cVar.f6935d;
            size--;
        }
        return bVar.h();
    }

    /* access modifiers changed from: package-private */
    public c a() {
        return (c) this.f6920b.get(this.f6921c);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f6921c;
    }

    /* access modifiers changed from: package-private */
    public c c() {
        return (c) this.f6920b.get(0);
    }

    /* access modifiers changed from: package-private */
    public c d() {
        for (int i10 = 0; i10 < this.f6920b.size(); i10++) {
            c cVar = (c) this.f6920b.get(i10);
            if (!cVar.f6936e) {
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public List e() {
        return this.f6920b.subList(this.f6921c, this.f6922d + 1);
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f6919a;
    }

    /* access modifiers changed from: package-private */
    public List g() {
        return this.f6920b;
    }

    /* access modifiers changed from: package-private */
    public c h() {
        return (c) this.f6920b.get(this.f6922d);
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f6922d;
    }

    /* access modifiers changed from: package-private */
    public c j() {
        List list = this.f6920b;
        return (c) list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public c k() {
        for (int size = this.f6920b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f6920b.get(size);
            if (!cVar.f6936e) {
                return cVar;
            }
        }
        return null;
    }
}
