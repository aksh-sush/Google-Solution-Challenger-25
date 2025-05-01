package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.view.h0;
import androidx.core.widget.j;
import g5.h;
import g5.k;
import g5.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.i;

public class MaterialButton extends f implements Checkable, n {

    /* renamed from: v  reason: collision with root package name */
    private static final int[] f6832v = {16842911};

    /* renamed from: w  reason: collision with root package name */
    private static final int[] f6833w = {16842912};

    /* renamed from: x  reason: collision with root package name */
    private static final int f6834x = i.Widget_MaterialComponents_Button;

    /* renamed from: h  reason: collision with root package name */
    private final a f6835h;

    /* renamed from: i  reason: collision with root package name */
    private final LinkedHashSet f6836i;

    /* renamed from: j  reason: collision with root package name */
    private a f6837j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f6838k;

    /* renamed from: l  reason: collision with root package name */
    private ColorStateList f6839l;

    /* renamed from: m  reason: collision with root package name */
    private Drawable f6840m;

    /* renamed from: n  reason: collision with root package name */
    private String f6841n;

    /* renamed from: o  reason: collision with root package name */
    private int f6842o;

    /* renamed from: p  reason: collision with root package name */
    private int f6843p;

    /* renamed from: q  reason: collision with root package name */
    private int f6844q;

    /* renamed from: r  reason: collision with root package name */
    private int f6845r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6846s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6847t;

    /* renamed from: u  reason: collision with root package name */
    private int f6848u;

    interface a {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class b extends d0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        boolean f6849g;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }

        private void b(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f6849g = z10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6849g ? 1 : 0);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o4.a.materialButtonStyle);
    }

    private boolean b() {
        int i10 = this.f6848u;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f6848u;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f6848u;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return h0.E(this) == 1;
    }

    private boolean f() {
        a aVar = this.f6835h;
        return aVar != null && !aVar.o();
    }

    private void g() {
        if (c()) {
            j.i(this, this.f6840m, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            j.i(this, (Drawable) null, (Drawable) null, this.f6840m, (Drawable) null);
        } else if (d()) {
            j.i(this, (Drawable) null, this.f6840m, (Drawable) null, (Drawable) null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil((double) f10);
    }

    private void h(boolean z10) {
        Drawable drawable = this.f6840m;
        boolean z11 = true;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.f6840m = mutate;
            androidx.core.graphics.drawable.a.o(mutate, this.f6839l);
            PorterDuff.Mode mode = this.f6838k;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.f6840m, mode);
            }
            int i10 = this.f6842o;
            if (i10 == 0) {
                i10 = this.f6840m.getIntrinsicWidth();
            }
            int i11 = this.f6842o;
            if (i11 == 0) {
                i11 = this.f6840m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6840m;
            int i12 = this.f6843p;
            int i13 = this.f6844q;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f6840m.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] a10 = j.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        if ((!c() || drawable3 == this.f6840m) && ((!b() || drawable5 == this.f6840m) && (!d() || drawable4 == this.f6840m))) {
            z11 = false;
        }
        if (z11) {
            g();
        }
    }

    private void i(int i10, int i11) {
        if (this.f6840m != null && getLayout() != null) {
            if (c() || b()) {
                this.f6844q = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i12 = this.f6848u;
                boolean z10 = true;
                if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f6843p = 0;
                } else {
                    int i13 = this.f6842o;
                    if (i13 == 0) {
                        i13 = this.f6840m.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - h0.I(this)) - i13) - this.f6845r) - h0.J(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean e10 = e();
                    if (this.f6848u != 4) {
                        z10 = false;
                    }
                    if (e10 != z10) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.f6843p != textLayoutWidth) {
                        this.f6843p = textLayoutWidth;
                        h(false);
                        return;
                    }
                    return;
                }
            } else if (d()) {
                this.f6843p = 0;
                if (this.f6848u == 16) {
                    this.f6844q = 0;
                } else {
                    int i14 = this.f6842o;
                    if (i14 == 0) {
                        i14 = this.f6840m.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i14) - this.f6845r) - getPaddingBottom()) / 2);
                    if (this.f6844q != max) {
                        this.f6844q = max;
                        h(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            h(false);
        }
    }

    public boolean a() {
        a aVar = this.f6835h;
        return aVar != null && aVar.p();
    }

    /* access modifiers changed from: package-private */
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f6841n)) {
            return this.f6841n;
        }
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f6835h.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6840m;
    }

    public int getIconGravity() {
        return this.f6848u;
    }

    public int getIconPadding() {
        return this.f6845r;
    }

    public int getIconSize() {
        return this.f6842o;
    }

    public ColorStateList getIconTint() {
        return this.f6839l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6838k;
    }

    public int getInsetBottom() {
        return this.f6835h.c();
    }

    public int getInsetTop() {
        return this.f6835h.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f6835h.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f6835h.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f6835h.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f6835h.k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f6835h.l() : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f6835h.m() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f6846s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f6835h.f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f6832v);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6833w);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f6835h) != null) {
            aVar.J(i13 - i11, i12 - i10);
        }
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f6849g);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f6849g = this.f6846s;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.f6835h.q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f6840m != null) {
            if (this.f6840m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setA11yClassName(String str) {
        this.f6841n = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f6835h.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f6835h.t();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (f()) {
            this.f6835h.u(z10);
        }
    }

    public void setChecked(boolean z10) {
        if (a() && isEnabled() && this.f6846s != z10) {
            this.f6846s = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f6846s);
            }
            if (!this.f6847t) {
                this.f6847t = true;
                Iterator it = this.f6836i.iterator();
                if (!it.hasNext()) {
                    this.f6847t = false;
                } else {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f6835h.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f6835h.f().S(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6840m != drawable) {
            this.f6840m = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f6848u != i10) {
            this.f6848u = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f6845r != i10) {
            this.f6845r = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6842o != i10) {
            this.f6842o = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6839l != colorStateList) {
            this.f6839l = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6838k != mode) {
            this.f6838k = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f6835h.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f6835h.x(i10);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f6837j = aVar;
    }

    public void setPressed(boolean z10) {
        a aVar = this.f6837j;
        if (aVar != null) {
            aVar.a(this, z10);
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f6835h.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        if (f()) {
            this.f6835h.z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (f()) {
            this.f6835h.A(z10);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f6835h.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f6835h.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f6835h.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f6835h.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f6835h.F(z10);
    }

    public void toggle() {
        setChecked(!this.f6846s);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f6834x
            android.content.Context r9 = j5.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f6836i = r9
            r9 = 0
            r8.f6846s = r9
            r8.f6847t = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = o4.j.f13918b2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r1 = o4.j.f14022o2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f6845r = r1
            int r1 = o4.j.f14046r2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.v.i(r1, r2)
            r8.f6838k = r1
            android.content.Context r1 = r8.getContext()
            int r2 = o4.j.f14038q2
            android.content.res.ColorStateList r1 = d5.c.a(r1, r0, r2)
            r8.f6839l = r1
            android.content.Context r1 = r8.getContext()
            int r2 = o4.j.f14006m2
            android.graphics.drawable.Drawable r1 = d5.c.d(r1, r0, r2)
            r8.f6840m = r1
            int r1 = o4.j.f14014n2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f6848u = r1
            int r1 = o4.j.f14030p2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f6842o = r1
            g5.k$b r10 = g5.k.e(r7, r10, r11, r6)
            g5.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f6835h = r11
            r11.r(r0)
            r0.recycle()
            int r10 = r8.f6845r
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f6840m
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
