package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f1187b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static j f1188c;

    /* renamed from: a, reason: collision with root package name */
    private w0 f1189a;

    class a implements w0.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f1190a = {f.e.R, f.e.P, f.e.f10064a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f1191b = {f.e.f10078o, f.e.B, f.e.f10083t, f.e.f10079p, f.e.f10080q, f.e.f10082s, f.e.f10081r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f1192c = {f.e.O, f.e.Q, f.e.f10074k, f.e.K, f.e.L, f.e.M, f.e.N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f1193d = {f.e.f10086w, f.e.f10072i, f.e.f10085v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f1194e = {f.e.J, f.e.S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f1195f = {f.e.f10066c, f.e.f10070g, f.e.f10067d, f.e.f10071h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int c10 = b1.c(context, f.a.f10035t);
            return new ColorStateList(new int[][]{b1.f1087b, b1.f1090e, b1.f1088c, b1.f1094i}, new int[]{b1.b(context, f.a.f10033r), androidx.core.graphics.a.g(c10, i10), androidx.core.graphics.a.g(c10, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, b1.c(context, f.a.f10032q));
        }

        private ColorStateList j(Context context) {
            return h(context, b1.c(context, f.a.f10033r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = f.a.f10037v;
            ColorStateList e10 = b1.e(context, i10);
            if (e10 == null || !e10.isStateful()) {
                iArr[0] = b1.f1087b;
                iArr2[0] = b1.b(context, i10);
                iArr[1] = b1.f1091f;
                iArr2[1] = b1.c(context, f.a.f10034s);
                iArr[2] = b1.f1094i;
                iArr2[2] = b1.c(context, i10);
            } else {
                int[] iArr3 = b1.f1087b;
                iArr[0] = iArr3;
                iArr2[0] = e10.getColorForState(iArr3, 0);
                iArr[1] = b1.f1091f;
                iArr2[1] = b1.c(context, f.a.f10034s);
                iArr[2] = b1.f1094i;
                iArr2[2] = e10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(w0 w0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = w0Var.j(context, f.e.F);
            Drawable j11 = w0Var.j(context, f.e.G);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (o0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1187b;
            }
            drawable.setColorFilter(j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.w0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.a()
                int[] r1 = r6.f1190a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = f.a.f10036u
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f1192c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = f.a.f10034s
                goto L11
            L20:
                int[] r1 = r6.f1193d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = f.e.f10084u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = f.e.f10075l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.o0.a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.b1.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.w0.f
        public PorterDuff.Mode b(int i10) {
            if (i10 == f.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public Drawable c(w0 w0Var, Context context, int i10) {
            int i11;
            if (i10 == f.e.f10073j) {
                return new LayerDrawable(new Drawable[]{w0Var.j(context, f.e.f10072i), w0Var.j(context, f.e.f10074k)});
            }
            if (i10 == f.e.f10088y) {
                i11 = f.d.f10057g;
            } else if (i10 == f.e.f10087x) {
                i11 = f.d.f10058h;
            } else {
                if (i10 != f.e.f10089z) {
                    return null;
                }
                i11 = f.d.f10059i;
            }
            return l(w0Var, context, i11);
        }

        @Override // androidx.appcompat.widget.w0.f
        public ColorStateList d(Context context, int i10) {
            if (i10 == f.e.f10076m) {
                return g.a.a(context, f.c.f10047e);
            }
            if (i10 == f.e.I) {
                return g.a.a(context, f.c.f10050h);
            }
            if (i10 == f.e.H) {
                return k(context);
            }
            if (i10 == f.e.f10069f) {
                return j(context);
            }
            if (i10 == f.e.f10065b) {
                return g(context);
            }
            if (i10 == f.e.f10068e) {
                return i(context);
            }
            if (i10 == f.e.D || i10 == f.e.E) {
                return g.a.a(context, f.c.f10049g);
            }
            if (f(this.f1191b, i10)) {
                return b1.e(context, f.a.f10036u);
            }
            if (f(this.f1194e, i10)) {
                return g.a.a(context, f.c.f10046d);
            }
            if (f(this.f1195f, i10)) {
                return g.a.a(context, f.c.f10045c);
            }
            if (i10 == f.e.A) {
                return g.a.a(context, f.c.f10048f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.w0.f
        public boolean e(Context context, int i10, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c10;
            if (i10 == f.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = f.a.f10036u;
                m(findDrawableByLayerId2, b1.c(context, i11), j.f1187b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), b1.c(context, i11), j.f1187b);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                c10 = b1.c(context, f.a.f10034s);
            } else {
                if (i10 != f.e.f10088y && i10 != f.e.f10087x && i10 != f.e.f10089z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), b1.b(context, f.a.f10036u), j.f1187b);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i12 = f.a.f10034s;
                m(findDrawableByLayerId3, b1.c(context, i12), j.f1187b);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                c10 = b1.c(context, i12);
            }
            m(findDrawableByLayerId, c10, j.f1187b);
            return true;
        }
    }

    public static synchronized j b() {
        j jVar;
        synchronized (j.class) {
            if (f1188c == null) {
                h();
            }
            jVar = f1188c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (j.class) {
            l10 = w0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void h() {
        synchronized (j.class) {
            if (f1188c == null) {
                j jVar = new j();
                f1188c = jVar;
                jVar.f1189a = w0.h();
                f1188c.f1189a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, d1 d1Var, int[] iArr) {
        w0.w(drawable, d1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f1189a.j(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f1189a.k(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f1189a.m(context, i10);
    }

    public synchronized void g(Context context) {
        this.f1189a.s(context);
    }
}