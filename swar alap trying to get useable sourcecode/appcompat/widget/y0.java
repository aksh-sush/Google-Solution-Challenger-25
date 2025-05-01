package androidx.appcompat.widget;

/* loaded from: classes.dex */
class y0 {

    /* renamed from: a, reason: collision with root package name */
    private int f1402a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f1403b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f1404c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f1405d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f1406e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f1407f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1408g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1409h = false;

    y0() {
    }

    public int a() {
        return this.f1408g ? this.f1402a : this.f1403b;
    }

    public int b() {
        return this.f1402a;
    }

    public int c() {
        return this.f1403b;
    }

    public int d() {
        return this.f1408g ? this.f1403b : this.f1402a;
    }

    public void e(int i10, int i11) {
        this.f1409h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1406e = i10;
            this.f1402a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1407f = i11;
            this.f1403b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1408g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f1408g = r2
            boolean r0 = r1.f1409h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f1405d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f1406e
        L16:
            r1.f1402a = r2
            int r2 = r1.f1404c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f1404c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f1406e
        L24:
            r1.f1402a = r2
            int r2 = r1.f1405d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f1406e
            r1.f1402a = r2
        L2f:
            int r2 = r1.f1407f
        L31:
            r1.f1403b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1404c = i10;
        this.f1405d = i11;
        this.f1409h = true;
        if (this.f1408g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1402a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1403b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1402a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1403b = i11;
        }
    }
}