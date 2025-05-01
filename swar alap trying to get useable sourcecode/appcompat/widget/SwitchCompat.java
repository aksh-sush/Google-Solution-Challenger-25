package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property W = new a(Float.class, "thumbPos");

    /* renamed from: a0, reason: collision with root package name */
    private static final int[] f974a0 = {R.attr.state_checked};
    private float A;
    private VelocityTracker B;
    private int C;
    float D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private boolean L;
    private final TextPaint M;
    private ColorStateList N;
    private Layout O;
    private Layout P;
    private TransformationMethod Q;
    ObjectAnimator R;
    private final b0 S;
    private m T;
    private c U;
    private final Rect V;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f975e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f976f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f977g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f978h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f979i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f980j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f981k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f982l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f983m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f984n;

    /* renamed from: o, reason: collision with root package name */
    private int f985o;

    /* renamed from: p, reason: collision with root package name */
    private int f986p;

    /* renamed from: q, reason: collision with root package name */
    private int f987q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f988r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f989s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f990t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f991u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f992v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f993w;

    /* renamed from: x, reason: collision with root package name */
    private int f994x;

    /* renamed from: y, reason: collision with root package name */
    private int f995y;

    /* renamed from: z, reason: collision with root package name */
    private float f996z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.D);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b {
        static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    static class c extends f.e {

        /* renamed from: a, reason: collision with root package name */
        private final Reference f997a;

        c(SwitchCompat switchCompat) {
            this.f997a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f997a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.e
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f997a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.K);
    }

    private void a(boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) W, z10 ? 1.0f : 0.0f);
        this.R = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.R, true);
        this.R.start();
    }

    private void b() {
        Drawable drawable = this.f975e;
        if (drawable != null) {
            if (this.f978h || this.f979i) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f975e = mutate;
                if (this.f978h) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f976f);
                }
                if (this.f979i) {
                    androidx.core.graphics.drawable.a.p(this.f975e, this.f977g);
                }
                if (this.f975e.isStateful()) {
                    this.f975e.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f980j;
        if (drawable != null) {
            if (this.f983m || this.f984n) {
                Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
                this.f980j = mutate;
                if (this.f983m) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f981k);
                }
                if (this.f984n) {
                    androidx.core.graphics.drawable.a.p(this.f980j, this.f982l);
                }
                if (this.f980j.isStateful()) {
                    this.f980j.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f10 = getEmojiTextViewHelper().f(this.Q);
        return f10 != null ? f10.getTransformation(charSequence, this) : charSequence;
    }

    private m getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new m(this);
        }
        return this.T;
    }

    private boolean getTargetCheckedState() {
        return this.D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((q1.b(this) ? 1.0f - this.D : this.D) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f980j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f975e;
        Rect d10 = drawable2 != null ? o0.d(drawable2) : o0.f1248c;
        return ((((this.E - this.G) - rect.left) - rect.right) - d10.left) - d10.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f975e == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f975e.getPadding(this.V);
        int i10 = this.I;
        int i11 = this.f995y;
        int i12 = i10 - i11;
        int i13 = (this.H + thumbOffset) - i11;
        int i14 = this.G + i13;
        Rect rect = this.V;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.K + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.M, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f991u;
            if (charSequence == null) {
                charSequence = getResources().getString(f.h.f10137b);
            }
            androidx.core.view.h0.J0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f989s;
            if (charSequence == null) {
                charSequence = getResources().getString(f.h.f10138c);
            }
            androidx.core.view.h0.J0(this, charSequence);
        }
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void p() {
        if (this.U == null && this.T.b() && androidx.emoji2.text.f.h()) {
            androidx.emoji2.text.f b10 = androidx.emoji2.text.f.b();
            int d10 = b10.d();
            if (d10 == 3 || d10 == 0) {
                c cVar = new c(this);
                this.U = cVar;
                b10.s(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f994x = 0;
        boolean z10 = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z11) {
            this.B.computeCurrentVelocity(1000);
            float xVelocity = this.B.getXVelocity();
            if (Math.abs(xVelocity) <= this.C) {
                z10 = getTargetCheckedState();
            } else if (!q1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z10 = false;
            }
        } else {
            z10 = isChecked;
        }
        if (z10 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z10);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f991u = charSequence;
        this.f992v = g(charSequence);
        this.P = null;
        if (this.f993w) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f989s = charSequence;
        this.f990t = g(charSequence);
        this.O = null;
        if (this.f993w) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.V;
        int i12 = this.H;
        int i13 = this.I;
        int i14 = this.J;
        int i15 = this.K;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f975e;
        Rect d10 = drawable != null ? o0.d(drawable) : o0.f1248c;
        Drawable drawable2 = this.f980j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (d10 != null) {
                int i17 = d10.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = d10.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = d10.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = d10.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f980j.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f980j.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f975e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.G + rect.right;
            this.f975e.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f975e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f980j;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f975e;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f980j;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!q1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f987q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (q1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f987q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.j.p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f993w;
    }

    public boolean getSplitTrack() {
        return this.f988r;
    }

    public int getSwitchMinWidth() {
        return this.f986p;
    }

    public int getSwitchPadding() {
        return this.f987q;
    }

    public CharSequence getTextOff() {
        return this.f991u;
    }

    public CharSequence getTextOn() {
        return this.f989s;
    }

    public Drawable getThumbDrawable() {
        return this.f975e;
    }

    protected final float getThumbPosition() {
        return this.D;
    }

    public int getThumbTextPadding() {
        return this.f985o;
    }

    public ColorStateList getThumbTintList() {
        return this.f976f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f977g;
    }

    public Drawable getTrackDrawable() {
        return this.f980j;
    }

    public ColorStateList getTrackTintList() {
        return this.f981k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f982l;
    }

    void j() {
        setTextOnInternal(this.f989s);
        setTextOffInternal(this.f991u);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f975e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f980j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.R.end();
        this.R = null;
    }

    public void m(Context context, int i10) {
        f1 t10 = f1.t(context, i10, f.j.f10159a3);
        ColorStateList c10 = t10.c(f.j.f10181e3);
        if (c10 == null) {
            c10 = getTextColors();
        }
        this.N = c10;
        int f10 = t10.f(f.j.f10165b3, 0);
        if (f10 != 0) {
            float f11 = f10;
            if (f11 != this.M.getTextSize()) {
                this.M.setTextSize(f11);
                requestLayout();
            }
        }
        o(t10.k(f.j.f10171c3, -1), t10.k(f.j.f10176d3, -1));
        this.Q = t10.a(f.j.f10216l3, false) ? new j.a(getContext()) : null;
        setTextOnInternal(this.f989s);
        setTextOffInternal(this.f991u);
        t10.w();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.M.setFakeBoldText(false);
            this.M.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(defaultFromStyle);
            int i11 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i10;
            this.M.setFakeBoldText((i11 & 1) != 0);
            this.M.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f974a0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.V;
        Drawable drawable = this.f980j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.I;
        int i11 = this.K;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f975e;
        if (drawable != null) {
            if (!this.f988r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d10 = o0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d10.left;
                rect.right -= d10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.O : this.P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.N;
            if (colorStateList != null) {
                this.M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f989s : this.f991u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        int i18;
        super.onLayout(z10, i10, i11, i12, i13);
        int i19 = 0;
        if (this.f975e != null) {
            Rect rect = this.V;
            Drawable drawable = this.f980j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d10 = o0.d(this.f975e);
            i14 = Math.max(0, d10.left - rect.left);
            i19 = Math.max(0, d10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (q1.b(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.E + i15) - i14) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i15 = (width - this.E) + i14 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i16 = this.F;
            i17 = paddingTop - (i16 / 2);
        } else {
            if (gravity == 80) {
                i18 = getHeight() - getPaddingBottom();
                i17 = i18 - this.F;
                this.H = i15;
                this.I = i17;
                this.K = i18;
                this.J = width;
            }
            i17 = getPaddingTop();
            i16 = this.F;
        }
        i18 = i16 + i17;
        this.H = i15;
        this.I = i17;
        this.K = i18;
        this.J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f993w) {
            if (this.O == null) {
                this.O = i(this.f990t);
            }
            if (this.P == null) {
                this.P = i(this.f992v);
            }
        }
        Rect rect = this.V;
        Drawable drawable = this.f975e;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f975e.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f975e.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.G = Math.max(this.f993w ? Math.max(this.O.getWidth(), this.P.getWidth()) + (this.f985o * 2) : 0, i12);
        Drawable drawable2 = this.f980j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f980j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f975e;
        if (drawable3 != null) {
            Rect d10 = o0.d(drawable3);
            i15 = Math.max(i15, d10.left);
            i16 = Math.max(i16, d10.right);
        }
        int max = this.L ? Math.max(this.f986p, (this.G * 2) + i15 + i16) : this.f986p;
        int max2 = Math.max(i14, i13);
        this.E = max;
        this.F = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f989s : this.f991u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.B
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.f994x
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f996z
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.q1.b(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.D
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.D
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.f996z = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f996z
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f995y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.A
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f995y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.f994x = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f996z = r0
            r6.A = r3
            return r1
        L8b:
            int r0 = r6.f994x
            if (r0 != r2) goto L96
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.f994x = r0
            android.view.VelocityTracker r0 = r6.B
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb9
            r6.f994x = r1
            r6.f996z = r0
            r6.A = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && androidx.core.view.h0.W(this)) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.j.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f989s);
        setTextOffInternal(this.f991u);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.L = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f993w != z10) {
            this.f993w = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f988r = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f986p = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f987q = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.M.getTypeface() == null || this.M.getTypeface().equals(typeface)) && (this.M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f975e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f975e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.D = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(g.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f985o = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f976f = colorStateList;
        this.f978h = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f977g = mode;
        this.f979i = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f980j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f980j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(g.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f981k = colorStateList;
        this.f983m = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f982l = mode;
        this.f984n = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f975e || drawable == this.f980j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f976f = null;
        this.f977g = null;
        this.f978h = false;
        this.f979i = false;
        this.f981k = null;
        this.f982l = null;
        this.f983m = false;
        this.f984n = false;
        this.B = VelocityTracker.obtain();
        this.L = true;
        this.V = new Rect();
        b1.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = f.j.L2;
        f1 v10 = f1.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.h0.q0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        Drawable g10 = v10.g(f.j.O2);
        this.f975e = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v10.g(f.j.X2);
        this.f980j = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        setTextOnInternal(v10.p(f.j.M2));
        setTextOffInternal(v10.p(f.j.N2));
        this.f993w = v10.a(f.j.P2, true);
        this.f985o = v10.f(f.j.U2, 0);
        this.f986p = v10.f(f.j.R2, 0);
        this.f987q = v10.f(f.j.S2, 0);
        this.f988r = v10.a(f.j.Q2, false);
        ColorStateList c10 = v10.c(f.j.V2);
        if (c10 != null) {
            this.f976f = c10;
            this.f978h = true;
        }
        PorterDuff.Mode e10 = o0.e(v10.k(f.j.W2, -1), null);
        if (this.f977g != e10) {
            this.f977g = e10;
            this.f979i = true;
        }
        if (this.f978h || this.f979i) {
            b();
        }
        ColorStateList c11 = v10.c(f.j.Y2);
        if (c11 != null) {
            this.f981k = c11;
            this.f983m = true;
        }
        PorterDuff.Mode e11 = o0.e(v10.k(f.j.Z2, -1), null);
        if (this.f982l != e11) {
            this.f982l = e11;
            this.f984n = true;
        }
        if (this.f983m || this.f984n) {
            c();
        }
        int n10 = v10.n(f.j.T2, 0);
        if (n10 != 0) {
            m(context, n10);
        }
        b0 b0Var = new b0(this);
        this.S = b0Var;
        b0Var.m(attributeSet, i10);
        v10.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f995y = viewConfiguration.getScaledTouchSlop();
        this.C = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}