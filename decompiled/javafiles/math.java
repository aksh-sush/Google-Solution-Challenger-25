package androidx.appcompat.app;

/* loaded from: classes.dex */
class g0 {

    /* renamed from: d, reason: collision with root package name */
    private static g0 f415d;

    /* renamed from: a, reason: collision with root package name */
    public long f416a;

    /* renamed from: b, reason: collision with root package name */
    public long f417b;

    /* renamed from: c, reason: collision with root package name */
    public int f418c;

    g0() {
    }

    static g0 b() {
        if (f415d == null) {
            f415d = new g0();
        }
        return f415d;
    }

    public void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(d12) * 0.03341960161924362d) + d12 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d11) / 360.0d) + (Math.sin(d12) * 0.0053d) + (Math.sin(2.0d * sin) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d13 = 0.01745329238474369d * d10;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d13) * Math.sin(asin))) / (Math.cos(d13) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.f418c = 1;
        } else {
            if (sin2 > -1.0d) {
                double acos = (float) (Math.acos(sin2) / 6.283185307179586d);
                this.f416a = Math.round((round + acos) * 8.64E7d) + 946728000000L;
                long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
                this.f417b = round2;
                if (round2 >= j10 || this.f416a <= j10) {
                    this.f418c = 1;
                    return;
                } else {
                    this.f418c = 0;
                    return;
                }
            }
            this.f418c = 0;
        }
        this.f416a = -1L;
        this.f417b = -1L;
    }
}