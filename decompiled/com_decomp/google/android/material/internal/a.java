package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.p;
import androidx.core.util.h;
import androidx.core.view.h0;
import com.google.android.material.internal.o;
import d5.a;
import d5.d;
import d5.j;

public final class a {

    /* renamed from: t0  reason: collision with root package name */
    private static final boolean f7124t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    private static final Paint f7125u0 = null;
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private d5.a D;
    private d5.a E;
    private TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    private CharSequence G;
    private CharSequence H;
    private boolean I;
    private boolean J = true;
    private boolean K;
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    private final TextPaint V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;

    /* renamed from: a  reason: collision with root package name */
    private final View f7126a;

    /* renamed from: a0  reason: collision with root package name */
    private float f7127a0;

    /* renamed from: b  reason: collision with root package name */
    private float f7128b;

    /* renamed from: b0  reason: collision with root package name */
    private float f7129b0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7130c;

    /* renamed from: c0  reason: collision with root package name */
    private ColorStateList f7131c0;

    /* renamed from: d  reason: collision with root package name */
    private float f7132d;

    /* renamed from: d0  reason: collision with root package name */
    private float f7133d0;

    /* renamed from: e  reason: collision with root package name */
    private float f7134e;

    /* renamed from: e0  reason: collision with root package name */
    private float f7135e0;

    /* renamed from: f  reason: collision with root package name */
    private int f7136f;

    /* renamed from: f0  reason: collision with root package name */
    private float f7137f0;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f7138g;

    /* renamed from: g0  reason: collision with root package name */
    private ColorStateList f7139g0;

    /* renamed from: h  reason: collision with root package name */
    private final Rect f7140h;

    /* renamed from: h0  reason: collision with root package name */
    private float f7141h0;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f7142i;

    /* renamed from: i0  reason: collision with root package name */
    private float f7143i0;

    /* renamed from: j  reason: collision with root package name */
    private int f7144j = 16;

    /* renamed from: j0  reason: collision with root package name */
    private float f7145j0;

    /* renamed from: k  reason: collision with root package name */
    private int f7146k = 16;

    /* renamed from: k0  reason: collision with root package name */
    private StaticLayout f7147k0;

    /* renamed from: l  reason: collision with root package name */
    private float f7148l = 15.0f;

    /* renamed from: l0  reason: collision with root package name */
    private float f7149l0;

    /* renamed from: m  reason: collision with root package name */
    private float f7150m = 15.0f;

    /* renamed from: m0  reason: collision with root package name */
    private float f7151m0;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f7152n;

    /* renamed from: n0  reason: collision with root package name */
    private float f7153n0;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f7154o;

    /* renamed from: o0  reason: collision with root package name */
    private CharSequence f7155o0;

    /* renamed from: p  reason: collision with root package name */
    private int f7156p;

    /* renamed from: p0  reason: collision with root package name */
    private int f7157p0 = 1;

    /* renamed from: q  reason: collision with root package name */
    private float f7158q;

    /* renamed from: q0  reason: collision with root package name */
    private float f7159q0 = 0.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f7160r;

    /* renamed from: r0  reason: collision with root package name */
    private float f7161r0 = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f7162s;

    /* renamed from: s0  reason: collision with root package name */
    private int f7163s0 = o.f7180n;

    /* renamed from: t  reason: collision with root package name */
    private float f7164t;

    /* renamed from: u  reason: collision with root package name */
    private float f7165u;

    /* renamed from: v  reason: collision with root package name */
    private float f7166v;

    /* renamed from: w  reason: collision with root package name */
    private Typeface f7167w;

    /* renamed from: x  reason: collision with root package name */
    private Typeface f7168x;

    /* renamed from: y  reason: collision with root package name */
    private Typeface f7169y;

    /* renamed from: z  reason: collision with root package name */
    private Typeface f7170z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C0096a implements a.C0201a {
        C0096a() {
        }

        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f7126a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f7140h = new Rect();
        this.f7138g = new Rect();
        this.f7142i = new RectF();
        this.f7134e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f7148l);
        textPaint.setTypeface(this.f7170z);
        textPaint.setLetterSpacing(this.f7143i0);
    }

    private void B(float f10) {
        if (this.f7130c) {
            this.f7142i.set(f10 < this.f7134e ? this.f7138g : this.f7140h);
            return;
        }
        this.f7142i.left = G((float) this.f7138g.left, (float) this.f7140h.left, f10, this.X);
        this.f7142i.top = G(this.f7158q, this.f7160r, f10, this.X);
        this.f7142i.right = G((float) this.f7138g.right, (float) this.f7140h.right, f10, this.X);
        this.f7142i.bottom = G((float) this.f7138g.bottom, (float) this.f7140h.bottom, f10, this.X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return h0.E(this.f7126a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? p.f2369d : p.f2368c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return p4.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f7151m0 = f10;
        h0.j0(this.f7126a);
    }

    private boolean U(Typeface typeface) {
        d5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f7169y == typeface) {
            return false;
        }
        this.f7169y = typeface;
        Typeface b10 = j.b(this.f7126a.getContext().getResources().getConfiguration(), typeface);
        this.f7168x = b10;
        if (b10 == null) {
            b10 = this.f7169y;
        }
        this.f7167w = b10;
        return true;
    }

    private void Y(float f10) {
        this.f7153n0 = f10;
        h0.j0(this.f7126a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), Math.round((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), Math.round((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), Math.round((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(boolean r10) {
        /*
            r9 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.i(r0, r10)
            java.lang.CharSequence r0 = r9.H
            if (r0 == 0) goto L_0x001c
            android.text.StaticLayout r1 = r9.f7147k0
            if (r1 == 0) goto L_0x001c
            android.text.TextPaint r2 = r9.V
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r3 = r9.F
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r1, r3)
            r9.f7155o0 = r0
        L_0x001c:
            java.lang.CharSequence r0 = r9.f7155o0
            r1 = 0
            if (r0 == 0) goto L_0x002a
            android.text.TextPaint r2 = r9.V
            float r0 = r9.I(r2, r0)
            r9.f7149l0 = r0
            goto L_0x002c
        L_0x002a:
            r9.f7149l0 = r1
        L_0x002c:
            int r0 = r9.f7146k
            boolean r2 = r9.I
            int r0 = androidx.core.view.o.b(r0, r2)
            r2 = r0 & 112(0x70, float:1.57E-43)
            r3 = 80
            r4 = 48
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r4) goto L_0x0066
            if (r2 == r3) goto L_0x0059
            android.text.TextPaint r2 = r9.V
            float r2 = r2.descent()
            android.text.TextPaint r6 = r9.V
            float r6 = r6.ascent()
            float r2 = r2 - r6
            float r2 = r2 / r5
            android.graphics.Rect r6 = r9.f7140h
            int r6 = r6.centerY()
            float r6 = (float) r6
            float r6 = r6 - r2
            r9.f7160r = r6
            goto L_0x006d
        L_0x0059:
            android.graphics.Rect r2 = r9.f7140h
            int r2 = r2.bottom
            float r2 = (float) r2
            android.text.TextPaint r6 = r9.V
            float r6 = r6.ascent()
            float r2 = r2 + r6
            goto L_0x006b
        L_0x0066:
            android.graphics.Rect r2 = r9.f7140h
            int r2 = r2.top
            float r2 = (float) r2
        L_0x006b:
            r9.f7160r = r2
        L_0x006d:
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            r6 = 5
            r7 = 1
            if (r0 == r7) goto L_0x0085
            if (r0 == r6) goto L_0x007d
            android.graphics.Rect r0 = r9.f7140h
            int r0 = r0.left
            float r0 = (float) r0
            goto L_0x0090
        L_0x007d:
            android.graphics.Rect r0 = r9.f7140h
            int r0 = r0.right
            float r0 = (float) r0
            float r8 = r9.f7149l0
            goto L_0x008f
        L_0x0085:
            android.graphics.Rect r0 = r9.f7140h
            int r0 = r0.centerX()
            float r0 = (float) r0
            float r8 = r9.f7149l0
            float r8 = r8 / r5
        L_0x008f:
            float r0 = r0 - r8
        L_0x0090:
            r9.f7164t = r0
            r9.i(r1, r10)
            android.text.StaticLayout r10 = r9.f7147k0
            if (r10 == 0) goto L_0x009f
            int r10 = r10.getHeight()
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009f:
            r10 = 0
        L_0x00a0:
            android.text.StaticLayout r0 = r9.f7147k0
            if (r0 == 0) goto L_0x00ae
            int r8 = r9.f7157p0
            if (r8 <= r7) goto L_0x00ae
            int r0 = r0.getWidth()
            float r1 = (float) r0
            goto L_0x00b8
        L_0x00ae:
            java.lang.CharSequence r0 = r9.H
            if (r0 == 0) goto L_0x00b8
            android.text.TextPaint r1 = r9.V
            float r1 = r9.I(r1, r0)
        L_0x00b8:
            android.text.StaticLayout r0 = r9.f7147k0
            if (r0 == 0) goto L_0x00c1
            int r0 = r0.getLineCount()
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            r9.f7156p = r0
            int r0 = r9.f7144j
            boolean r8 = r9.I
            int r0 = androidx.core.view.o.b(r0, r8)
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 == r4) goto L_0x00ec
            if (r8 == r3) goto L_0x00de
            float r10 = r10 / r5
            android.graphics.Rect r3 = r9.f7138g
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r10
        L_0x00db:
            r9.f7158q = r3
            goto L_0x00f3
        L_0x00de:
            android.graphics.Rect r3 = r9.f7138g
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r10
            android.text.TextPaint r10 = r9.V
            float r10 = r10.descent()
            float r3 = r3 + r10
            goto L_0x00db
        L_0x00ec:
            android.graphics.Rect r10 = r9.f7138g
            int r10 = r10.top
            float r10 = (float) r10
            r9.f7158q = r10
        L_0x00f3:
            r10 = r0 & r2
            if (r10 == r7) goto L_0x0105
            if (r10 == r6) goto L_0x00ff
            android.graphics.Rect r10 = r9.f7138g
            int r10 = r10.left
            float r10 = (float) r10
            goto L_0x010e
        L_0x00ff:
            android.graphics.Rect r10 = r9.f7138g
            int r10 = r10.right
            float r10 = (float) r10
            goto L_0x010d
        L_0x0105:
            android.graphics.Rect r10 = r9.f7138g
            int r10 = r10.centerX()
            float r10 = (float) r10
            float r1 = r1 / r5
        L_0x010d:
            float r10 = r10 - r1
        L_0x010e:
            r9.f7162s = r10
            r9.j()
            float r10 = r9.f7128b
            r9.d0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b(boolean):void");
    }

    private boolean b0(Typeface typeface) {
        d5.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface b10 = j.b(this.f7126a.getContext().getResources().getConfiguration(), typeface);
        this.A = b10;
        if (b10 == null) {
            b10 = this.B;
        }
        this.f7170z = b10;
        return true;
    }

    private void c() {
        g(this.f7128b);
    }

    private float d(float f10) {
        float f11 = this.f7134e;
        return f10 <= f11 ? p4.a.b(1.0f, 0.0f, this.f7132d, f11, f10) : p4.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z10 = f7124t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        h0.j0(this.f7126a);
    }

    private float e() {
        float f10 = this.f7132d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean D2 = D();
        return this.J ? F(charSequence, D2) : D2;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f7130c) {
            this.f7165u = G(this.f7162s, this.f7164t, f10, this.X);
            this.f7166v = G(this.f7158q, this.f7160r, f10, this.X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f7134e) {
            this.f7165u = this.f7162s;
            this.f7166v = this.f7158q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f7165u = this.f7164t;
            this.f7166v = this.f7160r - ((float) Math.max(0, this.f7136f));
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = p4.a.f14446b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f7154o != this.f7152n) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        float f12 = this.f7141h0;
        float f13 = this.f7143i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = G(this.f7133d0, this.Z, f10, (TimeInterpolator) null);
        this.Q = G(this.f7135e0, this.f7127a0, f10, (TimeInterpolator) null);
        this.R = G(this.f7137f0, this.f7129b0, f10, (TimeInterpolator) null);
        int a10 = a(u(this.f7139g0), u(this.f7131c0), f10);
        this.S = a10;
        this.V.setShadowLayer(this.P, this.Q, this.R, a10);
        if (this.f7130c) {
            int alpha = this.V.getAlpha();
            this.V.setAlpha((int) (d(f10) * ((float) alpha)));
        }
        h0.j0(this.f7126a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.G != null) {
            float width = (float) this.f7140h.width();
            float width2 = (float) this.f7138g.width();
            if (C(f10, 1.0f)) {
                f12 = this.f7150m;
                f11 = this.f7141h0;
                this.N = 1.0f;
                typeface = this.f7167w;
            } else {
                float f13 = this.f7148l;
                float f14 = this.f7143i0;
                Typeface typeface2 = this.f7170z;
                if (C(f10, 0.0f)) {
                    this.N = 1.0f;
                } else {
                    this.N = G(this.f7148l, this.f7150m, f10, this.Y) / this.f7148l;
                }
                float f15 = this.f7150m / this.f7148l;
                width = (z10 || this.f7130c || width2 * f15 <= width) ? width2 : Math.min(width / f15, width2);
                f12 = f13;
                f11 = f14;
                typeface = typeface2;
            }
            int i10 = 1;
            boolean z11 = false;
            if (width > 0.0f) {
                boolean z12 = this.O != f12;
                boolean z13 = this.f7145j0 != f11;
                boolean z14 = this.C != typeface;
                StaticLayout staticLayout = this.f7147k0;
                boolean z15 = z12 || z13 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
                this.O = f12;
                this.f7145j0 = f11;
                this.C = typeface;
                this.U = false;
                TextPaint textPaint = this.V;
                if (this.N != 1.0f) {
                    z11 = true;
                }
                textPaint.setLinearText(z11);
                z11 = z15;
            }
            if (this.H == null || z11) {
                this.V.setTextSize(this.O);
                this.V.setTypeface(this.C);
                this.V.setLetterSpacing(this.f7145j0);
                this.I = f(this.G);
                if (j0()) {
                    i10 = this.f7157p0;
                }
                StaticLayout k10 = k(i10, width, this.I);
                this.f7147k0 = k10;
                this.H = k10.getText();
            }
        }
    }

    private void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    private boolean j0() {
        return this.f7157p0 > 1 && (!this.I || this.f7130c) && !this.K;
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        Layout.Alignment alignment;
        StaticLayout staticLayout = null;
        if (i10 == 1) {
            try {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } catch (o.a e10) {
                Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            }
        } else {
            alignment = y();
        }
        staticLayout = o.c(this.G, this.V, (int) f10).e(this.F).h(z10).d(alignment).g(false).j(i10).i(this.f7159q0, this.f7161r0).f(this.f7163s0).k((p) null).a();
        return (StaticLayout) h.g(staticLayout);
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f7130c) {
            this.V.setAlpha((int) (this.f7153n0 * ((float) alpha)));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, v4.a.a(this.S, textPaint.getAlpha()));
            }
            Canvas canvas2 = canvas;
            this.f7147k0.draw(canvas);
        } else {
            Canvas canvas3 = canvas;
        }
        if (!this.f7130c) {
            this.V.setAlpha((int) (this.f7151m0 * ((float) alpha)));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, v4.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f7147k0.getLineBaseline(0);
        CharSequence charSequence = this.f7155o0;
        float f12 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (!this.f7130c) {
            String trim = this.f7155o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f7147k0.getLineEnd(0), str.length()), 0.0f, f12, this.V);
        }
    }

    private void n() {
        if (this.L == null && !this.f7138g.isEmpty() && !TextUtils.isEmpty(this.H)) {
            g(0.0f);
            int width = this.f7147k0.getWidth();
            int height = this.f7147k0.getHeight();
            if (width > 0 && height > 0) {
                this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f7147k0.draw(new Canvas(this.L));
                if (this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    private float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) - (this.f7149l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? (float) this.f7140h.left : ((float) this.f7140h.right) - this.f7149l0 : this.I ? ((float) this.f7140h.right) - this.f7149l0 : (float) this.f7140h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (((float) i10) / 2.0f) + (this.f7149l0 / 2.0f);
        }
        return ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.I ? rectF.left + this.f7149l0 : (float) this.f7140h.right : this.I ? (float) this.f7140h.right : rectF.left + this.f7149l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f7152n);
    }

    private Layout.Alignment y() {
        int b10 = androidx.core.view.o.b(this.f7144j, this.I ? 1 : 0) & 7;
        if (b10 != 1) {
            return b10 != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f7150m);
        textPaint.setTypeface(this.f7167w);
        textPaint.setLetterSpacing(this.f7141h0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f7152n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f7154o
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f7152n
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.E():boolean");
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f7169y;
            if (typeface != null) {
                this.f7168x = j.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f7168x;
            if (typeface3 == null) {
                typeface3 = this.f7169y;
            }
            this.f7167w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f7170z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f7126a.getHeight() > 0 && this.f7126a.getWidth() > 0) || z10) {
            b(z10);
            c();
        }
    }

    public void M(ColorStateList colorStateList) {
        if (this.f7154o != colorStateList || this.f7152n != colorStateList) {
            this.f7154o = colorStateList;
            this.f7152n = colorStateList;
            J();
        }
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (!L(this.f7140h, i10, i11, i12, i13)) {
            this.f7140h.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        d dVar = new d(this.f7126a.getContext(), i10);
        if (dVar.i() != null) {
            this.f7154o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f7150m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f9335c;
        if (colorStateList != null) {
            this.f7131c0 = colorStateList;
        }
        this.f7127a0 = dVar.f9340h;
        this.f7129b0 = dVar.f9341i;
        this.Z = dVar.f9342j;
        this.f7141h0 = dVar.f9344l;
        d5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new d5.a(new C0096a(), dVar.e());
        dVar.h(this.f7126a.getContext(), this.E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f7154o != colorStateList) {
            this.f7154o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f7146k != i10) {
            this.f7146k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (!L(this.f7138g, i10, i11, i12, i13)) {
            this.f7138g.set(i10, i11, i12, i13);
            this.U = true;
        }
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f7143i0 != f10) {
            this.f7143i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f7144j != i10) {
            this.f7144j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f7148l != f10) {
            this.f7148l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float a10 = z.a.a(f10, 0.0f, 1.0f);
        if (a10 != this.f7128b) {
            this.f7128b = a10;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean U2 = U(typeface);
        boolean b02 = b0(typeface);
        if (U2 || b02) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.H != null && this.f7142i.width() > 0.0f && this.f7142i.height() > 0.0f) {
            this.V.setTextSize(this.O);
            float f10 = this.f7165u;
            float f11 = this.f7166v;
            boolean z10 = this.K && this.L != null;
            float f12 = this.N;
            if (f12 != 1.0f && !this.f7130c) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.L, f10, f11, this.M);
                canvas.restoreToCount(save);
                return;
            }
            if (!j0() || (this.f7130c && this.f7128b <= this.f7134e)) {
                canvas.translate(f10, f11);
                this.f7147k0.draw(canvas);
            } else {
                m(canvas, this.f7165u - ((float) this.f7147k0.getLineStart(0)), f11);
            }
            canvas.restoreToCount(save);
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i10, i11), (float) this.f7140h.left);
        rectF.top = (float) this.f7140h.top;
        rectF.right = Math.min(s(rectF, i10, i11), (float) this.f7140h.right);
        rectF.bottom = ((float) this.f7140h.top) + q();
    }

    public ColorStateList p() {
        return this.f7154o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public int t() {
        return u(this.f7154o);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.f7128b;
    }
}
