package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.internal.q;
import com.google.android.material.internal.v;
import d5.d;
import e5.b;
import g5.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p4.c;

public class a extends g implements Drawable.Callback, q.b {
    private static final int[] N0 = {16842910};
    private static final ShapeDrawable O0 = new ShapeDrawable(new OvalShape());
    private int A0 = 255;
    private ColorFilter B0;
    private PorterDuffColorFilter C0;
    private ColorStateList D;
    private ColorStateList D0;
    private ColorStateList E;
    private PorterDuff.Mode E0 = PorterDuff.Mode.SRC_IN;
    private float F;
    private int[] F0;
    private float G = -1.0f;
    private boolean G0;
    private ColorStateList H;
    private ColorStateList H0;
    private float I;
    private WeakReference I0 = new WeakReference((Object) null);
    private ColorStateList J;
    private TextUtils.TruncateAt J0;
    private CharSequence K;
    private boolean K0;
    private boolean L;
    private int L0;
    private Drawable M;
    private boolean M0;
    private ColorStateList N;
    private float O;
    private boolean P;
    private boolean Q;
    private Drawable R;
    private Drawable S;
    private ColorStateList T;
    private float U;
    private CharSequence V;
    private boolean W;
    private boolean X;
    private Drawable Y;
    private ColorStateList Z;

    /* renamed from: a0  reason: collision with root package name */
    private c f6969a0;

    /* renamed from: b0  reason: collision with root package name */
    private c f6970b0;

    /* renamed from: c0  reason: collision with root package name */
    private float f6971c0;

    /* renamed from: d0  reason: collision with root package name */
    private float f6972d0;

    /* renamed from: e0  reason: collision with root package name */
    private float f6973e0;

    /* renamed from: f0  reason: collision with root package name */
    private float f6974f0;

    /* renamed from: g0  reason: collision with root package name */
    private float f6975g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f6976h0;

    /* renamed from: i0  reason: collision with root package name */
    private float f6977i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f6978j0;

    /* renamed from: k0  reason: collision with root package name */
    private final Context f6979k0;

    /* renamed from: l0  reason: collision with root package name */
    private final Paint f6980l0 = new Paint(1);

    /* renamed from: m0  reason: collision with root package name */
    private final Paint f6981m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Paint.FontMetrics f6982n0 = new Paint.FontMetrics();

    /* renamed from: o0  reason: collision with root package name */
    private final RectF f6983o0 = new RectF();

    /* renamed from: p0  reason: collision with root package name */
    private final PointF f6984p0 = new PointF();

    /* renamed from: q0  reason: collision with root package name */
    private final Path f6985q0 = new Path();

    /* renamed from: r0  reason: collision with root package name */
    private final q f6986r0;

    /* renamed from: s0  reason: collision with root package name */
    private int f6987s0;

    /* renamed from: t0  reason: collision with root package name */
    private int f6988t0;

    /* renamed from: u0  reason: collision with root package name */
    private int f6989u0;

    /* renamed from: v0  reason: collision with root package name */
    private int f6990v0;

    /* renamed from: w0  reason: collision with root package name */
    private int f6991w0;

    /* renamed from: x0  reason: collision with root package name */
    private int f6992x0;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f6993y0;

    /* renamed from: z0  reason: collision with root package name */
    private int f6994z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0093a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        J(context);
        this.f6979k0 = context;
        q qVar = new q(this);
        this.f6986r0 = qVar;
        this.K = "";
        qVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f6981m0 = null;
        int[] iArr = N0;
        setState(iArr);
        f2(iArr);
        this.K0 = true;
        if (b.f9903a) {
            O0.setTint(-1);
        }
    }

    private boolean H2() {
        return this.X && this.Y != null && this.f6993y0;
    }

    private boolean I2() {
        return this.L && this.M != null;
    }

    private boolean J2() {
        return this.Q && this.R != null;
    }

    private void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    private void L2() {
        this.H0 = this.G0 ? b.b(this.J) : null;
    }

    private void M2() {
        this.S = new RippleDrawable(b.b(Z0()), this.R, O0);
    }

    private float T0() {
        Drawable drawable = this.f6993y0 ? this.Y : this.M;
        float f10 = this.O;
        if (f10 <= 0.0f && drawable != null) {
            f10 = (float) Math.ceil((double) v.c(this.f6979k0, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f10) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f10;
    }

    private float U0() {
        Drawable drawable = this.f6993y0 ? this.Y : this.M;
        float f10 = this.O;
        return (f10 > 0.0f || drawable == null) ? f10 : (float) drawable.getIntrinsicWidth();
    }

    private void V1(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            onStateChange(getState());
        }
    }

    private void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.R) {
                if (drawable.isStateful()) {
                    drawable.setState(Q0());
                }
                androidx.core.graphics.drawable.a.o(drawable, this.T);
                return;
            }
            Drawable drawable2 = this.M;
            if (drawable == drawable2 && this.P) {
                androidx.core.graphics.drawable.a.o(drawable2, this.N);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private void f0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f10 = this.f6971c0 + this.f6972d0;
            float U0 = U0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.left) + f10;
                rectF.left = f11;
                rectF.right = f11 + U0;
            } else {
                float f12 = ((float) rect.right) - f10;
                rectF.right = f12;
                rectF.left = f12 - U0;
            }
            float T0 = T0();
            float exactCenterY = rect.exactCenterY() - (T0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + T0;
        }
    }

    private ColorFilter f1() {
        ColorFilter colorFilter = this.B0;
        return colorFilter != null ? colorFilter : this.C0;
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f10 = this.f6978j0 + this.f6977i0 + this.U + this.f6976h0 + this.f6975g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = ((float) rect.right) - f10;
            } else {
                rectF.left = ((float) rect.left) + f10;
            }
        }
    }

    private static boolean h1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f6978j0 + this.f6977i0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = ((float) rect.right) - f10;
                rectF.right = f11;
                rectF.left = f11 - this.U;
            } else {
                float f12 = ((float) rect.left) + f10;
                rectF.left = f12;
                rectF.right = f12 + this.U;
            }
            float exactCenterY = rect.exactCenterY();
            float f13 = this.U;
            float f14 = exactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f6978j0 + this.f6977i0 + this.U + this.f6976h0 + this.f6975g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f11 = (float) rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = (float) i10;
                rectF.right = ((float) i10) + f10;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.K != null) {
            float g02 = this.f6971c0 + g0() + this.f6974f0;
            float k02 = this.f6978j0 + k0() + this.f6975g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = ((float) rect.left) + g02;
                rectF.right = ((float) rect.right) - k02;
            } else {
                rectF.left = ((float) rect.left) + k02;
                rectF.right = ((float) rect.right) - g02;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    private static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float m0() {
        this.f6986r0.f().getFontMetrics(this.f6982n0);
        Paint.FontMetrics fontMetrics = this.f6982n0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean n1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean o0() {
        return this.X && this.Y != null && this.W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f6979k0
            int[] r2 = o4.j.f13916b0
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r10 = o4.j.N0
            boolean r10 = r9.hasValue(r10)
            r7.M0 = r10
            android.content.Context r10 = r7.f6979k0
            int r0 = o4.j.A0
            android.content.res.ColorStateList r10 = d5.c.a(r10, r9, r0)
            r7.V1(r10)
            android.content.Context r10 = r7.f6979k0
            int r0 = o4.j.f14012n0
            android.content.res.ColorStateList r10 = d5.c.a(r10, r9, r0)
            r7.z1(r10)
            int r10 = o4.j.f14076v0
            r0 = 0
            float r10 = r9.getDimension(r10, r0)
            r7.N1(r10)
            int r10 = o4.j.f14020o0
            boolean r1 = r9.hasValue(r10)
            if (r1 == 0) goto L_0x0045
            float r10 = r9.getDimension(r10, r0)
            r7.B1(r10)
        L_0x0045:
            android.content.Context r10 = r7.f6979k0
            int r1 = o4.j.f14100y0
            android.content.res.ColorStateList r10 = d5.c.a(r10, r9, r1)
            r7.R1(r10)
            int r10 = o4.j.f14108z0
            float r10 = r9.getDimension(r10, r0)
            r7.T1(r10)
            android.content.Context r10 = r7.f6979k0
            int r1 = o4.j.M0
            android.content.res.ColorStateList r10 = d5.c.a(r10, r9, r1)
            r7.s2(r10)
            int r10 = o4.j.f13964h0
            java.lang.CharSequence r10 = r9.getText(r10)
            r7.x2(r10)
            android.content.Context r10 = r7.f6979k0
            int r1 = o4.j.f13924c0
            d5.d r10 = d5.c.f(r10, r9, r1)
            int r1 = o4.j.f13932d0
            float r2 = r10.j()
            float r1 = r9.getDimension(r1, r2)
            r10.l(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 >= r2) goto L_0x0093
            android.content.Context r1 = r7.f6979k0
            int r2 = o4.j.f13940e0
            android.content.res.ColorStateList r1 = d5.c.a(r1, r9, r2)
            r10.k(r1)
        L_0x0093:
            r7.y2(r10)
            int r10 = o4.j.f13948f0
            int r10 = r9.getInt(r10, r6)
            r1 = 1
            if (r10 == r1) goto L_0x00ac
            r1 = 2
            if (r10 == r1) goto L_0x00a9
            r1 = 3
            if (r10 == r1) goto L_0x00a6
            goto L_0x00b1
        L_0x00a6:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            goto L_0x00ae
        L_0x00a9:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00ae
        L_0x00ac:
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.START
        L_0x00ae:
            r7.k2(r10)
        L_0x00b1:
            int r10 = o4.j.f14068u0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.M1(r10)
            java.lang.String r10 = "http://schemas.android.com/apk/res-auto"
            if (r8 == 0) goto L_0x00d7
            java.lang.String r1 = "chipIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x00d7
            java.lang.String r1 = "chipIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x00d7
            int r1 = o4.j.f14044r0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.M1(r1)
        L_0x00d7:
            android.content.Context r1 = r7.f6979k0
            int r2 = o4.j.f14036q0
            android.graphics.drawable.Drawable r1 = d5.c.d(r1, r9, r2)
            r7.F1(r1)
            int r1 = o4.j.f14060t0
            boolean r2 = r9.hasValue(r1)
            if (r2 == 0) goto L_0x00f3
            android.content.Context r2 = r7.f6979k0
            android.content.res.ColorStateList r1 = d5.c.a(r2, r9, r1)
            r7.J1(r1)
        L_0x00f3:
            int r1 = o4.j.f14052s0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r9.getDimension(r1, r2)
            r7.H1(r1)
            int r1 = o4.j.H0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.i2(r1)
            if (r8 == 0) goto L_0x0122
            java.lang.String r1 = "closeIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x0122
            java.lang.String r1 = "closeIconVisible"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 != 0) goto L_0x0122
            int r1 = o4.j.C0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.i2(r1)
        L_0x0122:
            android.content.Context r1 = r7.f6979k0
            int r2 = o4.j.B0
            android.graphics.drawable.Drawable r1 = d5.c.d(r1, r9, r2)
            r7.W1(r1)
            android.content.Context r1 = r7.f6979k0
            int r2 = o4.j.G0
            android.content.res.ColorStateList r1 = d5.c.a(r1, r9, r2)
            r7.g2(r1)
            int r1 = o4.j.E0
            float r1 = r9.getDimension(r1, r0)
            r7.b2(r1)
            int r1 = o4.j.f13972i0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.r1(r1)
            int r1 = o4.j.f14004m0
            boolean r1 = r9.getBoolean(r1, r6)
            r7.y1(r1)
            if (r8 == 0) goto L_0x016e
            java.lang.String r1 = "checkedIconEnabled"
            java.lang.String r1 = r8.getAttributeValue(r10, r1)
            if (r1 == 0) goto L_0x016e
            java.lang.String r1 = "checkedIconVisible"
            java.lang.String r8 = r8.getAttributeValue(r10, r1)
            if (r8 != 0) goto L_0x016e
            int r8 = o4.j.f13988k0
            boolean r8 = r9.getBoolean(r8, r6)
            r7.y1(r8)
        L_0x016e:
            android.content.Context r8 = r7.f6979k0
            int r10 = o4.j.f13980j0
            android.graphics.drawable.Drawable r8 = d5.c.d(r8, r9, r10)
            r7.t1(r8)
            int r8 = o4.j.f13996l0
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto L_0x018a
            android.content.Context r10 = r7.f6979k0
            android.content.res.ColorStateList r8 = d5.c.a(r10, r9, r8)
            r7.v1(r8)
        L_0x018a:
            android.content.Context r8 = r7.f6979k0
            int r10 = o4.j.O0
            p4.c r8 = p4.c.b(r8, r9, r10)
            r7.v2(r8)
            android.content.Context r8 = r7.f6979k0
            int r10 = o4.j.J0
            p4.c r8 = p4.c.b(r8, r9, r10)
            r7.l2(r8)
            int r8 = o4.j.f14092x0
            float r8 = r9.getDimension(r8, r0)
            r7.P1(r8)
            int r8 = o4.j.L0
            float r8 = r9.getDimension(r8, r0)
            r7.p2(r8)
            int r8 = o4.j.K0
            float r8 = r9.getDimension(r8, r0)
            r7.n2(r8)
            int r8 = o4.j.Q0
            float r8 = r9.getDimension(r8, r0)
            r7.D2(r8)
            int r8 = o4.j.P0
            float r8 = r9.getDimension(r8, r0)
            r7.A2(r8)
            int r8 = o4.j.F0
            float r8 = r9.getDimension(r8, r0)
            r7.d2(r8)
            int r8 = o4.j.D0
            float r8 = r9.getDimension(r8, r0)
            r7.Y1(r8)
            int r8 = o4.j.f14028p0
            float r8 = r9.getDimension(r8, r0)
            r7.D1(r8)
            int r8 = o4.j.f13956g0
            r10 = 2147483647(0x7fffffff, float:NaN)
            int r8 = r9.getDimensionPixelSize(r8, r10)
            r7.r2(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.o1(android.util.AttributeSet, int, int):void");
    }

    public static a p0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.o1(attributeSet, i10, i11);
        return aVar;
    }

    private void q0(Canvas canvas, Rect rect) {
        if (H2()) {
            f0(rect, this.f6983o0);
            RectF rectF = this.f6983o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.Y.setBounds(0, 0, (int) this.f6983o0.width(), (int) this.f6983o0.height());
            this.Y.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean q1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.D
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f6987s0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r6.l(r1)
            int r3 = r6.f6987s0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r6.f6987s0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r6.E
            if (r3 == 0) goto L_0x0028
            int r5 = r6.f6988t0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r6.l(r3)
            int r5 = r6.f6988t0
            if (r5 == r3) goto L_0x0034
            r6.f6988t0 = r3
            r0 = 1
        L_0x0034:
            int r1 = v4.a.j(r1, r3)
            int r3 = r6.f6989u0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.ColorStateList r5 = r6.v()
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r6.f6989u0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.T(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r6.H
            if (r1 == 0) goto L_0x0060
            int r3 = r6.f6990v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r6.f6990v0
            if (r3 == r1) goto L_0x0068
            r6.f6990v0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r6.H0
            if (r1 == 0) goto L_0x007b
            boolean r1 = e5.b.c(r7)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r6.H0
            int r3 = r6.f6991w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r6.f6991w0
            if (r3 == r1) goto L_0x0087
            r6.f6991w0 = r1
            boolean r1 = r6.G0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.google.android.material.internal.q r1 = r6.f6986r0
            d5.d r1 = r1.e()
            if (r1 == 0) goto L_0x00ac
            com.google.android.material.internal.q r1 = r6.f6986r0
            d5.d r1 = r1.e()
            android.content.res.ColorStateList r1 = r1.i()
            if (r1 == 0) goto L_0x00ac
            com.google.android.material.internal.q r1 = r6.f6986r0
            d5.d r1 = r1.e()
            android.content.res.ColorStateList r1 = r1.i()
            int r3 = r6.f6992x0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            int r3 = r6.f6992x0
            if (r3 == r1) goto L_0x00b4
            r6.f6992x0 = r1
            r0 = 1
        L_0x00b4:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = h1(r1, r3)
            if (r1 == 0) goto L_0x00c7
            boolean r1 = r6.W
            if (r1 == 0) goto L_0x00c7
            r1 = 1
            goto L_0x00c8
        L_0x00c7:
            r1 = 0
        L_0x00c8:
            boolean r3 = r6.f6993y0
            if (r3 == r1) goto L_0x00e2
            android.graphics.drawable.Drawable r3 = r6.Y
            if (r3 == 0) goto L_0x00e2
            float r0 = r6.g0()
            r6.f6993y0 = r1
            float r1 = r6.g0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e1
            r0 = 1
            r1 = 1
            goto L_0x00e3
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            android.content.res.ColorStateList r3 = r6.D0
            if (r3 == 0) goto L_0x00ee
            int r5 = r6.f6994z0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00ef
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            int r5 = r6.f6994z0
            if (r5 == r3) goto L_0x0100
            r6.f6994z0 = r3
            android.content.res.ColorStateList r0 = r6.D0
            android.graphics.PorterDuff$Mode r3 = r6.E0
            android.graphics.PorterDuffColorFilter r0 = x4.g.j(r6, r0, r3)
            r6.C0 = r0
            goto L_0x0101
        L_0x0100:
            r4 = r0
        L_0x0101:
            android.graphics.drawable.Drawable r0 = r6.M
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x0110
            android.graphics.drawable.Drawable r0 = r6.M
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0110:
            android.graphics.drawable.Drawable r0 = r6.Y
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x011f
            android.graphics.drawable.Drawable r0 = r6.Y
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x011f:
            android.graphics.drawable.Drawable r0 = r6.R
            boolean r0 = m1(r0)
            if (r0 == 0) goto L_0x013c
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.R
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x013c:
            boolean r7 = e5.b.f9903a
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.S
            boolean r7 = m1(r7)
            if (r7 == 0) goto L_0x014f
            android.graphics.drawable.Drawable r7 = r6.S
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x014f:
            if (r4 == 0) goto L_0x0154
            r6.invalidateSelf()
        L_0x0154:
            if (r1 == 0) goto L_0x0159
            r6.p1()
        L_0x0159:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.q1(int[], int[]):boolean");
    }

    private void r0(Canvas canvas, Rect rect) {
        if (!this.M0) {
            this.f6980l0.setColor(this.f6988t0);
            this.f6980l0.setStyle(Paint.Style.FILL);
            this.f6980l0.setColorFilter(f1());
            this.f6983o0.set(rect);
            canvas.drawRoundRect(this.f6983o0, C0(), C0(), this.f6980l0);
        }
    }

    private void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            f0(rect, this.f6983o0);
            RectF rectF = this.f6983o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.M.setBounds(0, 0, (int) this.f6983o0.width(), (int) this.f6983o0.height());
            this.M.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.I > 0.0f && !this.M0) {
            this.f6980l0.setColor(this.f6990v0);
            this.f6980l0.setStyle(Paint.Style.STROKE);
            if (!this.M0) {
                this.f6980l0.setColorFilter(f1());
            }
            RectF rectF = this.f6983o0;
            float f10 = this.I;
            rectF.set(((float) rect.left) + (f10 / 2.0f), ((float) rect.top) + (f10 / 2.0f), ((float) rect.right) - (f10 / 2.0f), ((float) rect.bottom) - (f10 / 2.0f));
            float f11 = this.G - (this.I / 2.0f);
            canvas.drawRoundRect(this.f6983o0, f11, f11, this.f6980l0);
        }
    }

    private void u0(Canvas canvas, Rect rect) {
        if (!this.M0) {
            this.f6980l0.setColor(this.f6987s0);
            this.f6980l0.setStyle(Paint.Style.FILL);
            this.f6983o0.set(rect);
            canvas.drawRoundRect(this.f6983o0, C0(), C0(), this.f6980l0);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (J2()) {
            i0(rect, this.f6983o0);
            RectF rectF = this.f6983o0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.R.setBounds(0, 0, (int) this.f6983o0.width(), (int) this.f6983o0.height());
            if (b.f9903a) {
                this.S.setBounds(this.R.getBounds());
                this.S.jumpToCurrentState();
                drawable = this.S;
            } else {
                drawable = this.R;
            }
            drawable.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        this.f6980l0.setColor(this.f6991w0);
        this.f6980l0.setStyle(Paint.Style.FILL);
        this.f6983o0.set(rect);
        if (!this.M0) {
            canvas.drawRoundRect(this.f6983o0, C0(), C0(), this.f6980l0);
            return;
        }
        h(new RectF(rect), this.f6985q0);
        super.p(canvas, this.f6980l0, this.f6985q0, s());
    }

    private void x0(Canvas canvas, Rect rect) {
        Paint paint = this.f6981m0;
        if (paint != null) {
            paint.setColor(androidx.core.graphics.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f6981m0);
            if (I2() || H2()) {
                f0(rect, this.f6983o0);
                canvas.drawRect(this.f6983o0, this.f6981m0);
            }
            if (this.K != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f6981m0);
            }
            if (J2()) {
                i0(rect, this.f6983o0);
                canvas.drawRect(this.f6983o0, this.f6981m0);
            }
            this.f6981m0.setColor(androidx.core.graphics.a.k(-65536, 127));
            h0(rect, this.f6983o0);
            canvas.drawRect(this.f6983o0, this.f6981m0);
            this.f6981m0.setColor(androidx.core.graphics.a.k(-16711936, 127));
            j0(rect, this.f6983o0);
            canvas.drawRect(this.f6983o0, this.f6981m0);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.K != null) {
            Paint.Align n02 = n0(rect, this.f6984p0);
            l0(rect, this.f6983o0);
            if (this.f6986r0.e() != null) {
                this.f6986r0.f().drawableState = getState();
                this.f6986r0.l(this.f6979k0);
            }
            this.f6986r0.f().setTextAlign(n02);
            int i10 = 0;
            boolean z10 = Math.round(this.f6986r0.g(b1().toString())) > Math.round(this.f6983o0.width());
            if (z10) {
                i10 = canvas.save();
                canvas.clipRect(this.f6983o0);
            }
            CharSequence charSequence = this.K;
            if (z10 && this.J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f6986r0.f(), this.f6983o0.width(), this.J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f6984p0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f6986r0.f());
            if (z10) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public ColorStateList A0() {
        return this.Z;
    }

    public void A1(int i10) {
        z1(g.a.a(this.f6979k0, i10));
    }

    public void A2(float f10) {
        if (this.f6975g0 != f10) {
            this.f6975g0 = f10;
            invalidateSelf();
            p1();
        }
    }

    public ColorStateList B0() {
        return this.E;
    }

    public void B1(float f10) {
        if (this.G != f10) {
            this.G = f10;
            setShapeAppearanceModel(A().w(f10));
        }
    }

    public void B2(int i10) {
        A2(this.f6979k0.getResources().getDimension(i10));
    }

    public float C0() {
        return this.M0 ? C() : this.G;
    }

    public void C1(int i10) {
        B1(this.f6979k0.getResources().getDimension(i10));
    }

    public void C2(float f10) {
        d c12 = c1();
        if (c12 != null) {
            c12.l(f10);
            this.f6986r0.f().setTextSize(f10);
            a();
        }
    }

    public float D0() {
        return this.f6978j0;
    }

    public void D1(float f10) {
        if (this.f6978j0 != f10) {
            this.f6978j0 = f10;
            invalidateSelf();
            p1();
        }
    }

    public void D2(float f10) {
        if (this.f6974f0 != f10) {
            this.f6974f0 = f10;
            invalidateSelf();
            p1();
        }
    }

    public Drawable E0() {
        Drawable drawable = this.M;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void E1(int i10) {
        D1(this.f6979k0.getResources().getDimension(i10));
    }

    public void E2(int i10) {
        D2(this.f6979k0.getResources().getDimension(i10));
    }

    public float F0() {
        return this.O;
    }

    public void F1(Drawable drawable) {
        Drawable E02 = E0();
        if (E02 != drawable) {
            float g02 = g0();
            this.M = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float g03 = g0();
            K2(E02);
            if (I2()) {
                e0(this.M);
            }
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void F2(boolean z10) {
        if (this.G0 != z10) {
            this.G0 = z10;
            L2();
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.N;
    }

    public void G1(int i10) {
        F1(g.a.b(this.f6979k0, i10));
    }

    /* access modifiers changed from: package-private */
    public boolean G2() {
        return this.K0;
    }

    public float H0() {
        return this.F;
    }

    public void H1(float f10) {
        if (this.O != f10) {
            float g02 = g0();
            this.O = f10;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public float I0() {
        return this.f6971c0;
    }

    public void I1(int i10) {
        H1(this.f6979k0.getResources().getDimension(i10));
    }

    public ColorStateList J0() {
        return this.H;
    }

    public void J1(ColorStateList colorStateList) {
        this.P = true;
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (I2()) {
                androidx.core.graphics.drawable.a.o(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float K0() {
        return this.I;
    }

    public void K1(int i10) {
        J1(g.a.a(this.f6979k0, i10));
    }

    public Drawable L0() {
        Drawable drawable = this.R;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void L1(int i10) {
        M1(this.f6979k0.getResources().getBoolean(i10));
    }

    public CharSequence M0() {
        return this.V;
    }

    public void M1(boolean z10) {
        if (this.L != z10) {
            boolean I2 = I2();
            this.L = z10;
            boolean I22 = I2();
            if (I2 != I22) {
                if (I22) {
                    e0(this.M);
                } else {
                    K2(this.M);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public float N0() {
        return this.f6977i0;
    }

    public void N1(float f10) {
        if (this.F != f10) {
            this.F = f10;
            invalidateSelf();
            p1();
        }
    }

    public float O0() {
        return this.U;
    }

    public void O1(int i10) {
        N1(this.f6979k0.getResources().getDimension(i10));
    }

    public float P0() {
        return this.f6976h0;
    }

    public void P1(float f10) {
        if (this.f6971c0 != f10) {
            this.f6971c0 = f10;
            invalidateSelf();
            p1();
        }
    }

    public int[] Q0() {
        return this.F0;
    }

    public void Q1(int i10) {
        P1(this.f6979k0.getResources().getDimension(i10));
    }

    public ColorStateList R0() {
        return this.T;
    }

    public void R1(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (this.M0) {
                Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S0(RectF rectF) {
        j0(getBounds(), rectF);
    }

    public void S1(int i10) {
        R1(g.a.a(this.f6979k0, i10));
    }

    public void T1(float f10) {
        if (this.I != f10) {
            this.I = f10;
            this.f6980l0.setStrokeWidth(f10);
            if (this.M0) {
                super.a0(f10);
            }
            invalidateSelf();
        }
    }

    public void U1(int i10) {
        T1(this.f6979k0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt V0() {
        return this.J0;
    }

    public c W0() {
        return this.f6970b0;
    }

    public void W1(Drawable drawable) {
        Drawable L02 = L0();
        if (L02 != drawable) {
            float k02 = k0();
            this.R = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (b.f9903a) {
                M2();
            }
            float k03 = k0();
            K2(L02);
            if (J2()) {
                e0(this.R);
            }
            invalidateSelf();
            if (k02 != k03) {
                p1();
            }
        }
    }

    public float X0() {
        return this.f6973e0;
    }

    public void X1(CharSequence charSequence) {
        if (this.V != charSequence) {
            this.V = androidx.core.text.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Y0() {
        return this.f6972d0;
    }

    public void Y1(float f10) {
        if (this.f6977i0 != f10) {
            this.f6977i0 = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public ColorStateList Z0() {
        return this.J;
    }

    public void Z1(int i10) {
        Y1(this.f6979k0.getResources().getDimension(i10));
    }

    public void a() {
        p1();
        invalidateSelf();
    }

    public c a1() {
        return this.f6969a0;
    }

    public void a2(int i10) {
        W1(g.a.b(this.f6979k0, i10));
    }

    public CharSequence b1() {
        return this.K;
    }

    public void b2(float f10) {
        if (this.U != f10) {
            this.U = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public d c1() {
        return this.f6986r0.e();
    }

    public void c2(int i10) {
        b2(this.f6979k0.getResources().getDimension(i10));
    }

    public float d1() {
        return this.f6975g0;
    }

    public void d2(float f10) {
        if (this.f6976h0 != f10) {
            this.f6976h0 = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i11 = this.A0;
            if (i11 < 255) {
                i10 = r4.a.a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i11);
            } else {
                i10 = 0;
            }
            u0(canvas, bounds);
            r0(canvas, bounds);
            if (this.M0) {
                super.draw(canvas);
            }
            t0(canvas, bounds);
            w0(canvas, bounds);
            s0(canvas, bounds);
            q0(canvas, bounds);
            if (this.K0) {
                y0(canvas, bounds);
            }
            v0(canvas, bounds);
            x0(canvas, bounds);
            if (this.A0 < 255) {
                canvas.restoreToCount(i10);
            }
        }
    }

    public float e1() {
        return this.f6974f0;
    }

    public void e2(int i10) {
        d2(this.f6979k0.getResources().getDimension(i10));
    }

    public boolean f2(int[] iArr) {
        if (Arrays.equals(this.F0, iArr)) {
            return false;
        }
        this.F0 = iArr;
        if (J2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float g0() {
        if (I2() || H2()) {
            return this.f6972d0 + U0() + this.f6973e0;
        }
        return 0.0f;
    }

    public boolean g1() {
        return this.G0;
    }

    public void g2(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (J2()) {
                androidx.core.graphics.drawable.a.o(this.R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.A0;
    }

    public ColorFilter getColorFilter() {
        return this.B0;
    }

    public int getIntrinsicHeight() {
        return (int) this.F;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f6971c0 + g0() + this.f6974f0 + this.f6986r0.g(b1().toString()) + this.f6975g0 + k0() + this.f6978j0), this.L0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.G);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.G);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void h2(int i10) {
        g2(g.a.a(this.f6979k0, i10));
    }

    public boolean i1() {
        return this.W;
    }

    public void i2(boolean z10) {
        if (this.Q != z10) {
            boolean J2 = J2();
            this.Q = z10;
            boolean J22 = J2();
            if (J2 != J22) {
                if (J22) {
                    e0(this.R);
                } else {
                    K2(this.R);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return l1(this.D) || l1(this.E) || l1(this.H) || (this.G0 && l1(this.H0)) || n1(this.f6986r0.e()) || o0() || m1(this.M) || m1(this.Y) || l1(this.D0);
    }

    public boolean j1() {
        return m1(this.R);
    }

    public void j2(C0093a aVar) {
        this.I0 = new WeakReference(aVar);
    }

    /* access modifiers changed from: package-private */
    public float k0() {
        if (J2()) {
            return this.f6976h0 + this.U + this.f6977i0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.Q;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.J0 = truncateAt;
    }

    public void l2(c cVar) {
        this.f6970b0 = cVar;
    }

    public void m2(int i10) {
        l2(c.c(this.f6979k0, i10));
    }

    /* access modifiers changed from: package-private */
    public Paint.Align n0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.K != null) {
            float g02 = this.f6971c0 + g0() + this.f6974f0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = ((float) rect.left) + g02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - g02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m0();
        }
        return align;
    }

    public void n2(float f10) {
        if (this.f6973e0 != f10) {
            float g02 = g0();
            this.f6973e0 = f10;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void o2(int i10) {
        n2(this.f6979k0.getResources().getDimension(i10));
    }

    public boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (I2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.M, i10);
        }
        if (H2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Y, i10);
        }
        if (J2()) {
            onLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.R, i10);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (I2()) {
            onLevelChange |= this.M.setLevel(i10);
        }
        if (H2()) {
            onLevelChange |= this.Y.setLevel(i10);
        }
        if (J2()) {
            onLevelChange |= this.R.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.M0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, Q0());
    }

    /* access modifiers changed from: protected */
    public void p1() {
        C0093a aVar = (C0093a) this.I0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void p2(float f10) {
        if (this.f6972d0 != f10) {
            float g02 = g0();
            this.f6972d0 = f10;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void q2(int i10) {
        p2(this.f6979k0.getResources().getDimension(i10));
    }

    public void r1(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            float g02 = g0();
            if (!z10 && this.f6993y0) {
                this.f6993y0 = false;
            }
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void r2(int i10) {
        this.L0 = i10;
    }

    public void s1(int i10) {
        r1(this.f6979k0.getResources().getBoolean(i10));
    }

    public void s2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (this.A0 != i10) {
            this.A0 = i10;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.B0 != colorFilter) {
            this.B0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            this.D0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.E0 != mode) {
            this.E0 = mode;
            this.C0 = x4.g.j(this, this.D0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (I2()) {
            visible |= this.M.setVisible(z10, z11);
        }
        if (H2()) {
            visible |= this.Y.setVisible(z10, z11);
        }
        if (J2()) {
            visible |= this.R.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(Drawable drawable) {
        if (this.Y != drawable) {
            float g02 = g0();
            this.Y = drawable;
            float g03 = g0();
            K2(this.Y);
            e0(this.Y);
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void t2(int i10) {
        s2(g.a.a(this.f6979k0, i10));
    }

    public void u1(int i10) {
        t1(g.a.b(this.f6979k0, i10));
    }

    /* access modifiers changed from: package-private */
    public void u2(boolean z10) {
        this.K0 = z10;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (o0()) {
                androidx.core.graphics.drawable.a.o(this.Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v2(c cVar) {
        this.f6969a0 = cVar;
    }

    public void w1(int i10) {
        v1(g.a.a(this.f6979k0, i10));
    }

    public void w2(int i10) {
        v2(c.c(this.f6979k0, i10));
    }

    public void x1(int i10) {
        y1(this.f6979k0.getResources().getBoolean(i10));
    }

    public void x2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.K, charSequence)) {
            this.K = charSequence;
            this.f6986r0.k(true);
            invalidateSelf();
            p1();
        }
    }

    public void y1(boolean z10) {
        if (this.X != z10) {
            boolean H2 = H2();
            this.X = z10;
            boolean H22 = H2();
            if (H2 != H22) {
                if (H22) {
                    e0(this.Y);
                } else {
                    K2(this.Y);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void y2(d dVar) {
        this.f6986r0.j(dVar, this.f6979k0);
    }

    public Drawable z0() {
        return this.Y;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    public void z2(int i10) {
        y2(new d(this.f6979k0, i10));
    }
}
