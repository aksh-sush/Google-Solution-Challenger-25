package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class b extends Drawable implements Drawable.Callback {

    /* renamed from: e, reason: collision with root package name */
    private d f10903e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f10904f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f10905g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f10906h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10908j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10910l;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f10911m;

    /* renamed from: n, reason: collision with root package name */
    private long f10912n;

    /* renamed from: o, reason: collision with root package name */
    private long f10913o;

    /* renamed from: p, reason: collision with root package name */
    private c f10914p;

    /* renamed from: i, reason: collision with root package name */
    private int f10907i = 255;

    /* renamed from: k, reason: collision with root package name */
    private int f10909k = -1;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: h.b$b, reason: collision with other inner class name */
    private static class C0228b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    static class c implements Drawable.Callback {

        /* renamed from: e, reason: collision with root package name */
        private Drawable.Callback f10916e;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f10916e;
            this.f10916e = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f10916e = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f10916e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f10916e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f10917a;

        /* renamed from: b, reason: collision with root package name */
        Resources f10918b;

        /* renamed from: c, reason: collision with root package name */
        int f10919c;

        /* renamed from: d, reason: collision with root package name */
        int f10920d;

        /* renamed from: e, reason: collision with root package name */
        int f10921e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray f10922f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f10923g;

        /* renamed from: h, reason: collision with root package name */
        int f10924h;

        /* renamed from: i, reason: collision with root package name */
        boolean f10925i;

        /* renamed from: j, reason: collision with root package name */
        boolean f10926j;

        /* renamed from: k, reason: collision with root package name */
        Rect f10927k;

        /* renamed from: l, reason: collision with root package name */
        boolean f10928l;

        /* renamed from: m, reason: collision with root package name */
        boolean f10929m;

        /* renamed from: n, reason: collision with root package name */
        int f10930n;

        /* renamed from: o, reason: collision with root package name */
        int f10931o;

        /* renamed from: p, reason: collision with root package name */
        int f10932p;

        /* renamed from: q, reason: collision with root package name */
        int f10933q;

        /* renamed from: r, reason: collision with root package name */
        boolean f10934r;

        /* renamed from: s, reason: collision with root package name */
        int f10935s;

        /* renamed from: t, reason: collision with root package name */
        boolean f10936t;

        /* renamed from: u, reason: collision with root package name */
        boolean f10937u;

        /* renamed from: v, reason: collision with root package name */
        boolean f10938v;

        /* renamed from: w, reason: collision with root package name */
        boolean f10939w;

        /* renamed from: x, reason: collision with root package name */
        boolean f10940x;

        /* renamed from: y, reason: collision with root package name */
        boolean f10941y;

        /* renamed from: z, reason: collision with root package name */
        int f10942z;

        d(d dVar, b bVar, Resources resources) {
            this.f10925i = false;
            this.f10928l = false;
            this.f10940x = true;
            this.A = 0;
            this.B = 0;
            this.f10917a = bVar;
            this.f10918b = resources != null ? resources : dVar != null ? dVar.f10918b : null;
            int f10 = b.f(resources, dVar != null ? dVar.f10919c : 0);
            this.f10919c = f10;
            if (dVar == null) {
                this.f10923g = new Drawable[10];
                this.f10924h = 0;
                return;
            }
            this.f10920d = dVar.f10920d;
            this.f10921e = dVar.f10921e;
            this.f10938v = true;
            this.f10939w = true;
            this.f10925i = dVar.f10925i;
            this.f10928l = dVar.f10928l;
            this.f10940x = dVar.f10940x;
            this.f10941y = dVar.f10941y;
            this.f10942z = dVar.f10942z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f10919c == f10) {
                if (dVar.f10926j) {
                    this.f10927k = dVar.f10927k != null ? new Rect(dVar.f10927k) : null;
                    this.f10926j = true;
                }
                if (dVar.f10929m) {
                    this.f10930n = dVar.f10930n;
                    this.f10931o = dVar.f10931o;
                    this.f10932p = dVar.f10932p;
                    this.f10933q = dVar.f10933q;
                    this.f10929m = true;
                }
            }
            if (dVar.f10934r) {
                this.f10935s = dVar.f10935s;
                this.f10934r = true;
            }
            if (dVar.f10936t) {
                this.f10937u = dVar.f10937u;
                this.f10936t = true;
            }
            Drawable[] drawableArr = dVar.f10923g;
            this.f10923g = new Drawable[drawableArr.length];
            this.f10924h = dVar.f10924h;
            SparseArray sparseArray = dVar.f10922f;
            this.f10922f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f10924h);
            int i10 = this.f10924h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f10922f.put(i11, constantState);
                    } else {
                        this.f10923g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f10922f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f10923g[this.f10922f.keyAt(i10)] = s(((Drawable.ConstantState) this.f10922f.valueAt(i10)).newDrawable(this.f10918b));
                }
                this.f10922f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f10942z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f10917a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i10 = this.f10924h;
            if (i10 >= this.f10923g.length) {
                o(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f10917a);
            this.f10923g[i10] = drawable;
            this.f10924h++;
            this.f10921e = drawable.getChangingConfigurations() | this.f10921e;
            p();
            this.f10927k = null;
            this.f10926j = false;
            this.f10929m = false;
            this.f10938v = false;
            return i10;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i10 = this.f10924h;
                Drawable[] drawableArr = this.f10923g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i11], theme);
                        this.f10921e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                y(C0228b.c(theme));
            }
        }

        public boolean c() {
            if (this.f10938v) {
                return this.f10939w;
            }
            e();
            this.f10938v = true;
            int i10 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f10939w = false;
                    return false;
                }
            }
            this.f10939w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10922f.get(i11);
                    if (constantState != null && C0228b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f10929m = true;
            e();
            int i10 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            this.f10931o = -1;
            this.f10930n = -1;
            this.f10933q = 0;
            this.f10932p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f10930n) {
                    this.f10930n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f10931o) {
                    this.f10931o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f10932p) {
                    this.f10932p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f10933q) {
                    this.f10933q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f10923g.length;
        }

        public final Drawable g(int i10) {
            int indexOfKey;
            Drawable drawable = this.f10923g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f10922f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable s10 = s(((Drawable.ConstantState) this.f10922f.valueAt(indexOfKey)).newDrawable(this.f10918b));
            this.f10923g[i10] = s10;
            this.f10922f.removeAt(indexOfKey);
            if (this.f10922f.size() == 0) {
                this.f10922f = null;
            }
            return s10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f10920d | this.f10921e;
        }

        public final int h() {
            return this.f10924h;
        }

        public final int i() {
            if (!this.f10929m) {
                d();
            }
            return this.f10931o;
        }

        public final int j() {
            if (!this.f10929m) {
                d();
            }
            return this.f10933q;
        }

        public final int k() {
            if (!this.f10929m) {
                d();
            }
            return this.f10932p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f10925i) {
                return null;
            }
            Rect rect2 = this.f10927k;
            if (rect2 != null || this.f10926j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i10 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f10926j = true;
            this.f10927k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f10929m) {
                d();
            }
            return this.f10930n;
        }

        public final int n() {
            if (this.f10934r) {
                return this.f10935s;
            }
            e();
            int i10 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f10935s = opacity;
            this.f10934r = true;
            return opacity;
        }

        public void o(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f10923g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f10923g = drawableArr;
        }

        void p() {
            this.f10934r = false;
            this.f10936t = false;
        }

        public final boolean q() {
            return this.f10928l;
        }

        abstract void r();

        public final void t(boolean z10) {
            this.f10928l = z10;
        }

        public final void u(int i10) {
            this.A = i10;
        }

        public final void v(int i10) {
            this.B = i10;
        }

        final boolean w(int i10, int i11) {
            int i12 = this.f10924h;
            Drawable[] drawableArr = this.f10923g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean m10 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawable, i10) : false;
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f10942z = i10;
            return z10;
        }

        public final void x(boolean z10) {
            this.f10925i = z10;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f10918b = resources;
                int f10 = b.f(resources, this.f10919c);
                int i10 = this.f10919c;
                this.f10919c = f10;
                if (i10 != f10) {
                    this.f10929m = false;
                    this.f10926j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f10914p == null) {
            this.f10914p = new c();
        }
        drawable.setCallback(this.f10914p.b(drawable.getCallback()));
        try {
            if (this.f10903e.A <= 0 && this.f10908j) {
                drawable.setAlpha(this.f10907i);
            }
            d dVar = this.f10903e;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f10903e;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f10903e.f10940x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f10903e.C);
            Rect rect = this.f10904f;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f10914p.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f10908j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f10905g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f10912n
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f10907i
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            h.b$d r9 = r13.f10903e
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f10907i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f10912n = r6
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f10906h
            if (r9 == 0) goto L61
            long r10 = r13.f10913o
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f10906h = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.f10903e
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f10907i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f10913o = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f10911m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f10903e.b(theme);
    }

    abstract d b();

    int c() {
        return this.f10909k;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f10903e.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f10906h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f10909k
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.f10903e
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f10906h
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f10905g
            if (r0 == 0) goto L29
            r9.f10906h = r0
            h.b$d r0 = r9.f10903e
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f10913o = r0
            goto L35
        L29:
            r9.f10906h = r4
            r9.f10913o = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f10905g
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b$d r0 = r9.f10903e
            int r1 = r0.f10924h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f10905g = r0
            r9.f10909k = r10
            if (r0 == 0) goto L5a
            h.b$d r10 = r9.f10903e
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f10912n = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f10905g = r4
            r10 = -1
            r9.f10909k = r10
        L5a:
            long r0 = r9.f10912n
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f10913o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f10911m
            if (r0 != 0) goto L73
            h.b$a r0 = new h.b$a
            r0.<init>()
            r9.f10911m = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10907i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f10903e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f10903e.c()) {
            return null;
        }
        this.f10903e.f10920d = getChangingConfigurations();
        return this.f10903e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f10905g;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f10904f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f10903e.q()) {
            return this.f10903e.i();
        }
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f10903e.q()) {
            return this.f10903e.m();
        }
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f10903e.q()) {
            return this.f10903e.j();
        }
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f10903e.q()) {
            return this.f10903e.k();
        }
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f10905g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f10903e.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            C0228b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l10 = this.f10903e.l();
        if (l10 != null) {
            rect.set(l10);
            padding = (l10.right | ((l10.left | l10.top) | l10.bottom)) != 0;
        } else {
            Drawable drawable = this.f10905g;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    void h(d dVar) {
        this.f10903e = dVar;
        int i10 = this.f10909k;
        if (i10 >= 0) {
            Drawable g10 = dVar.g(i10);
            this.f10905g = g10;
            if (g10 != null) {
                d(g10);
            }
        }
        this.f10906h = null;
    }

    final void i(Resources resources) {
        this.f10903e.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f10903e;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f10905g || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f10903e.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f10906h;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f10906h = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f10905g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f10908j) {
                this.f10905g.setAlpha(this.f10907i);
            }
        }
        if (this.f10913o != 0) {
            this.f10913o = 0L;
            z10 = true;
        }
        if (this.f10912n != 0) {
            this.f10912n = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f10910l && super.mutate() == this) {
            d b10 = b();
            b10.r();
            h(b10);
            this.f10910l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10906h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f10905g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f10903e.w(i10, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f10906h;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f10905g;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f10905g || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f10908j && this.f10907i == i10) {
            return;
        }
        this.f10908j = true;
        this.f10907i = i10;
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            if (this.f10912n == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f10903e;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f10905g;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f10903e;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f10905g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f10903e;
        if (dVar.f10940x != z10) {
            dVar.f10940x = z10;
            Drawable drawable = this.f10905g;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f10904f;
        if (rect == null) {
            this.f10904f = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f10905g;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f10903e;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f10905g, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f10903e;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f10905g, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f10906h;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f10905g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f10905g || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}