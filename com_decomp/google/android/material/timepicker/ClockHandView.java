package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.h0;
import b5.d;
import com.google.android.material.internal.v;
import java.util.ArrayList;
import java.util.List;
import o4.c;
import o4.i;
import o4.j;

class ClockHandView extends View {

    /* renamed from: e  reason: collision with root package name */
    private final int f7475e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f7476f;

    /* renamed from: g  reason: collision with root package name */
    private final ValueAnimator f7477g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7478h;

    /* renamed from: i  reason: collision with root package name */
    private float f7479i;

    /* renamed from: j  reason: collision with root package name */
    private float f7480j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7481k;

    /* renamed from: l  reason: collision with root package name */
    private final int f7482l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7483m;

    /* renamed from: n  reason: collision with root package name */
    private final List f7484n;

    /* renamed from: o  reason: collision with root package name */
    private final int f7485o;

    /* renamed from: p  reason: collision with root package name */
    private final float f7486p;

    /* renamed from: q  reason: collision with root package name */
    private final Paint f7487q;

    /* renamed from: r  reason: collision with root package name */
    private final RectF f7488r;

    /* renamed from: s  reason: collision with root package name */
    private final int f7489s;

    /* renamed from: t  reason: collision with root package name */
    private float f7490t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7491u;

    /* renamed from: v  reason: collision with root package name */
    private double f7492v;

    /* renamed from: w  reason: collision with root package name */
    private int f7493w;

    /* renamed from: x  reason: collision with root package name */
    private int f7494x;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o4.a.materialClockStyle);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (a5.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + v.c(getContext(), 12)) {
            i10 = 1;
        }
        this.f7494x = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int h10 = h(this.f7494x);
        float f10 = (float) width;
        float f11 = (float) h10;
        float f12 = (float) height;
        this.f7487q.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f7492v)) * f11) + f10, (f11 * ((float) Math.sin(this.f7492v))) + f12, (float) this.f7485o, this.f7487q);
        double sin = Math.sin(this.f7492v);
        double cos = Math.cos(this.f7492v);
        double d10 = (double) ((float) (h10 - this.f7485o));
        float f13 = (float) (width + ((int) (cos * d10)));
        float f14 = (float) (height + ((int) (d10 * sin)));
        this.f7487q.setStrokeWidth((float) this.f7489s);
        canvas.drawLine(f10, f12, f13, f14, this.f7487q);
        canvas.drawCircle(f10, f12, this.f7486p, this.f7487q);
    }

    private int f(float f10, float f11) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(((float) this.f7493w) * 0.66f) : this.f7493w;
    }

    private Pair j(float f10) {
        float g10 = g();
        if (Math.abs(g10 - f10) > 180.0f) {
            if (g10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (g10 < 180.0f && f10 > 180.0f) {
                g10 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g10), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = (float) f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f7478h) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f7490t = f11;
        this.f7492v = Math.toRadians((double) (f11 - 90.0f));
        float h10 = (float) h(this.f7494x);
        float width = ((float) (getWidth() / 2)) + (((float) Math.cos(this.f7492v)) * h10);
        float height = ((float) (getHeight() / 2)) + (h10 * ((float) Math.sin(this.f7492v)));
        RectF rectF = this.f7488r;
        int i10 = this.f7485o;
        rectF.set(width - ((float) i10), height - ((float) i10), width + ((float) i10), height + ((float) i10));
        for (b a10 : this.f7484n) {
            a10.a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f7484n.add(bVar);
    }

    public RectF e() {
        return this.f7488r;
    }

    public float g() {
        return this.f7490t;
    }

    public int i() {
        return this.f7485o;
    }

    public void m(int i10) {
        this.f7493w = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f7477g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair j10 = j(f10);
        this.f7477g.setFloatValues(new float[]{((Float) j10.first).floatValue(), ((Float) j10.second).floatValue()});
        this.f7477g.setDuration((long) this.f7475e);
        this.f7477g.setInterpolator(this.f7476f);
        this.f7477g.addUpdateListener(new b(this));
        this.f7477g.addListener(new a());
        this.f7477g.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f7477g.isRunning()) {
            n(g());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f7479i = x10;
            this.f7480j = y10;
            this.f7481k = true;
            this.f7491u = false;
            z12 = false;
            z11 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f7479i);
            int i11 = (int) (y10 - this.f7480j);
            this.f7481k = (i10 * i10) + (i11 * i11) > this.f7482l;
            z12 = this.f7491u;
            boolean z13 = actionMasked == 1;
            if (this.f7483m) {
                c(x10, y10);
            }
            z10 = z13;
            z11 = false;
            this.f7491u |= k(x10, y10, z12, z11, z10);
            return true;
        } else {
            z12 = false;
            z11 = false;
        }
        z10 = false;
        this.f7491u |= k(x10, y10, z12, z11, z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f7483m && !z10) {
            this.f7494x = 1;
        }
        this.f7483m = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7477g = new ValueAnimator();
        this.f7484n = new ArrayList();
        Paint paint = new Paint();
        this.f7487q = paint;
        this.f7488r = new RectF();
        this.f7494x = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.W0, i10, i.Widget_MaterialComponents_TimePicker_Clock);
        this.f7475e = d.f(context, o4.a.motionDurationLong2, 200);
        this.f7476f = d.g(context, o4.a.motionEasingEmphasizedInterpolator, p4.a.f14446b);
        this.f7493w = obtainStyledAttributes.getDimensionPixelSize(j.Y0, 0);
        this.f7485o = obtainStyledAttributes.getDimensionPixelSize(j.Z0, 0);
        Resources resources = getResources();
        this.f7489s = resources.getDimensionPixelSize(c.material_clock_hand_stroke_width);
        this.f7486p = (float) resources.getDimensionPixelSize(c.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(j.X0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f7482l = ViewConfiguration.get(context).getScaledTouchSlop();
        h0.C0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
