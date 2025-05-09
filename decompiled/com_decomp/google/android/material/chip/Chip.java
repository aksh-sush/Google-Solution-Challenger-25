package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.accessibility.h0;
import com.google.android.material.chip.a;
import com.google.android.material.internal.s;
import com.google.android.material.internal.v;
import d5.d;
import d5.f;
import g5.k;
import g5.n;
import java.util.List;
import o4.h;
import o4.i;
import o4.j;

public class Chip extends AppCompatCheckBox implements a.C0093a, n, Checkable {
    private static final int A = i.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */
    public static final Rect B = new Rect();
    private static final int[] C = {16842913};
    private static final int[] D = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public a f6948i;

    /* renamed from: j  reason: collision with root package name */
    private InsetDrawable f6949j;

    /* renamed from: k  reason: collision with root package name */
    private RippleDrawable f6950k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f6951l;

    /* renamed from: m  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f6952m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6953n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6954o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6955p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f6956q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6957r;

    /* renamed from: s  reason: collision with root package name */
    private int f6958s;

    /* renamed from: t  reason: collision with root package name */
    private int f6959t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f6960u;

    /* renamed from: v  reason: collision with root package name */
    private final c f6961v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6962w;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f6963x;

    /* renamed from: y  reason: collision with root package name */
    private final RectF f6964y;

    /* renamed from: z  reason: collision with root package name */
    private final f f6965z;

    class a extends f {
        a() {
        }

        public void a(int i10) {
        }

        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f6948i.G2() ? Chip.this.f6948i.b1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f6948i != null) {
                Chip.this.f6948i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends e0.a {
        c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        public int B(float f10, float f11) {
            return (!Chip.this.n() || !Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f6951l != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.u();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void M(h0 h0Var) {
            h0Var.Z(Chip.this.r());
            h0Var.c0(Chip.this.isClickable());
            h0Var.b0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                h0Var.z0(text);
            } else {
                h0Var.f0(text);
            }
        }

        /* access modifiers changed from: protected */
        public void N(int i10, h0 h0Var) {
            CharSequence charSequence = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = h.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i11, objArr).trim();
                }
                h0Var.f0(closeIconContentDescription);
                h0Var.X(Chip.this.getCloseIconTouchBoundsInt());
                h0Var.b(h0.a.f2402i);
                h0Var.g0(Chip.this.isEnabled());
                return;
            }
            h0Var.f0(charSequence);
            h0Var.X(Chip.B);
        }

        /* access modifiers changed from: protected */
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                boolean unused = Chip.this.f6956q = z10;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o4.a.chipStyle);
    }

    private void A() {
        this.f6950k = new RippleDrawable(e5.b.b(this.f6948i.Z0()), getBackgroundDrawable(), (Drawable) null);
        this.f6948i.F2(false);
        androidx.core.view.h0.w0(this, this.f6950k);
        B();
    }

    private void B() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6948i) != null) {
            int D0 = (int) (aVar.D0() + this.f6948i.d1() + this.f6948i.k0());
            int I0 = (int) (this.f6948i.I0() + this.f6948i.e1() + this.f6948i.g0());
            if (this.f6949j != null) {
                Rect rect = new Rect();
                this.f6949j.getPadding(rect);
                I0 += rect.left;
                D0 += rect.right;
            }
            androidx.core.view.h0.G0(this, I0, getPaddingTop(), D0, getPaddingBottom());
        }
    }

    private void C() {
        TextPaint paint = getPaint();
        a aVar = this.f6948i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f6965z);
        }
    }

    private void D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f6964y.setEmpty();
        if (n() && this.f6951l != null) {
            this.f6948i.S0(this.f6964y);
        }
        return this.f6964y;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f6963x.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f6963x;
    }

    private d getTextAppearance() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    private void j(a aVar) {
        aVar.j2(this);
    }

    private int[] k() {
        int isEnabled = isEnabled();
        if (this.f6956q) {
            isEnabled++;
        }
        if (this.f6955p) {
            isEnabled++;
        }
        if (this.f6954o) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i10 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i10 = 1;
        }
        if (this.f6956q) {
            iArr[i10] = 16842908;
            i10++;
        }
        if (this.f6955p) {
            iArr[i10] = 16843623;
            i10++;
        }
        if (this.f6954o) {
            iArr[i10] = 16842919;
            i10++;
        }
        if (isChecked()) {
            iArr[i10] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f6949j && this.f6948i.getCallback() == null) {
            this.f6948i.setCallback(this.f6949j);
        }
    }

    /* access modifiers changed from: private */
    public boolean n() {
        a aVar = this.f6948i;
        return (aVar == null || aVar.L0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray i11 = s.i(context, attributeSet, j.f13916b0, i10, A, new int[0]);
        this.f6957r = i11.getBoolean(j.I0, false);
        this.f6959t = (int) Math.ceil((double) i11.getDimension(j.f14084w0, (float) Math.ceil((double) v.c(getContext(), 48))));
        i11.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f6949j = new InsetDrawable(this.f6948i, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f6955p != z10) {
            this.f6955p = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f6954o != z10) {
            this.f6954o = z10;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t(CompoundButton compoundButton, boolean z10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f6952m;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    private void v() {
        if (this.f6949j != null) {
            this.f6949j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            z();
        }
    }

    private void x(a aVar) {
        if (aVar != null) {
            aVar.j2((a.C0093a) null);
        }
    }

    private void y() {
        boolean z10;
        if (!n() || !s() || this.f6951l == null) {
            androidx.core.view.h0.s0(this, (androidx.core.view.a) null);
            z10 = false;
        } else {
            androidx.core.view.h0.s0(this, this.f6961v);
            z10 = true;
        }
        this.f6962w = z10;
    }

    private void z() {
        if (e5.b.f9903a) {
            A();
            return;
        }
        this.f6948i.F2(true);
        androidx.core.view.h0.w0(this, getBackgroundDrawable());
        B();
        m();
    }

    public void a() {
        l(this.f6959t);
        requestLayout();
        invalidateOutline();
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f6962w ? super.dispatchHoverEvent(motionEvent) : this.f6961v.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6962w) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f6961v.w(keyEvent) || this.f6961v.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f6948i;
        if ((aVar == null || !aVar.j1()) ? false : this.f6948i.f2(k())) {
            invalidate();
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f6960u)) {
            return this.f6960u;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6949j;
        return insetDrawable == null ? this.f6948i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.z0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.C0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6948i;
    }

    public float getChipEndPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipIconSize() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (!this.f6962w || !(this.f6961v.A() == 1 || this.f6961v.x() == 1)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(getCloseIconTouchBoundsInt());
        }
    }

    public p4.c getHideMotionSpec() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f6948i.A();
    }

    public p4.c getShowMotionSpec() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f6948i;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f6959t = i10;
        int i11 = 0;
        if (!w()) {
            if (this.f6949j != null) {
                v();
            } else {
                z();
            }
            return false;
        }
        int max = Math.max(0, i10 - this.f6948i.getIntrinsicHeight());
        int max2 = Math.max(0, i10 - this.f6948i.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i12 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i11 = max / 2;
            }
            if (this.f6949j != null) {
                Rect rect = new Rect();
                this.f6949j.getPadding(rect);
                if (rect.top == i11 && rect.bottom == i11 && rect.left == i12 && rect.right == i12) {
                    z();
                    return true;
                }
            }
            if (getMinHeight() != i10) {
                setMinHeight(i10);
            }
            if (getMinWidth() != i10) {
                setMinWidth(i10);
            }
            q(i12, i11, i12, i11);
            z();
            return true;
        }
        if (this.f6949j != null) {
            v();
        } else {
            z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5.h.f(this, this.f6948i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f6962w) {
            this.f6961v.I(z10, i10, rect);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z10 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z10 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z10);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) ? super.onResolvePointerIcon(motionEvent, i10) : PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f6958s != i10) {
            this.f6958s = i10;
            B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r2) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f6954o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r3)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f6954o
            if (r0 == 0) goto L_0x0034
            r5.u()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r3)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r2)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x004b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean r() {
        a aVar = this.f6948i;
        return aVar != null && aVar.i1();
    }

    public boolean s() {
        a aVar = this.f6948i;
        return aVar != null && aVar.k1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f6960u = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6950k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6950k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.r1(z10);
        }
    }

    public void setCheckableResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.s1(i10);
        }
    }

    public void setChecked(boolean z10) {
        a aVar = this.f6948i;
        if (aVar == null) {
            this.f6953n = z10;
        } else if (aVar.i1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.t1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.u1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.v1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.w1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.x1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.z1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.A1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.B1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f6948i;
        if (aVar2 != aVar) {
            x(aVar2);
            this.f6948i = aVar;
            aVar.u2(false);
            j(this.f6948i);
            l(this.f6959t);
        }
    }

    public void setChipEndPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.D1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.F1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.H1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.L1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.N1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.O1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.P1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.T1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.W1(drawable);
        }
        y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.X1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.Y1(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.a2(i10);
        }
        y();
    }

    public void setCloseIconSize(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.b2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.c2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.g2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i12 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6948i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f6948i;
                if (aVar != null) {
                    aVar.k2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f6957r = z10;
        l(this.f6959t);
    }

    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(p4.c cVar) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.l2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.m2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.n2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.p2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    public void setLayoutDirection(int i10) {
        if (this.f6948i != null) {
            super.setLayoutDirection(i10);
        }
    }

    public void setLines(int i10) {
        if (i10 <= 1) {
            super.setLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i10) {
        if (i10 <= 1) {
            super.setMaxLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setMinLines(int i10) {
        if (i10 <= 1) {
            super.setMinLines(i10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6952m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6951l = onClickListener;
        y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
        if (!this.f6948i.g1()) {
            A();
        }
    }

    public void setRippleColorResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.t2(i10);
            if (!this.f6948i.g1()) {
                A();
            }
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f6948i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(p4.c cVar) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.v2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.w2(i10);
        }
    }

    public void setSingleLine(boolean z10) {
        if (z10) {
            super.setSingleLine(z10);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f6948i;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.G2() ? null : charSequence, bufferType);
            a aVar2 = this.f6948i;
            if (aVar2 != null) {
                aVar2.x2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.z2(i10);
        }
        C();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.A2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.C2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        C();
    }

    public void setTextStartPadding(float f10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.D2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.E2(i10);
        }
    }

    public boolean u() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f6951l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f6962w) {
            this.f6961v.U(1, 1);
        }
        return z10;
    }

    public boolean w() {
        return this.f6957r;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = A
            android.content.Context r8 = j5.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f6963x = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f6964y = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f6965z = r8
            android.content.Context r8 = r7.getContext()
            r7.D(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.p0(r8, r9, r10, r4)
            r7.o(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.h0.y(r7)
            r6.S(r0)
            int[] r2 = o4.j.f13916b0
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L_0x0051
            int r10 = o4.j.f13940e0
            android.content.res.ColorStateList r8 = d5.c.a(r8, r9, r10)
            r7.setTextColor(r8)
        L_0x0051:
            int r8 = o4.j.N0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f6961v = r9
            r7.y()
            if (r8 != 0) goto L_0x0069
            r7.p()
        L_0x0069:
            boolean r8 = r7.f6953n
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.b1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.V0()
            r7.setEllipsize(r8)
            r7.C()
            com.google.android.material.chip.a r8 = r7.f6948i
            boolean r8 = r8.G2()
            if (r8 != 0) goto L_0x008e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L_0x008e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.B()
            boolean r8 = r7.w()
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f6959t
            r7.setMinHeight(r8)
        L_0x00a2:
            int r8 = androidx.core.view.h0.E(r7)
            r7.f6958s = r8
            u4.b r8 = new u4.b
            r8.<init>(r7)
            super.setOnCheckedChangeListener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.y1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.M1(z10);
        }
    }

    public void setCloseIconVisible(boolean z10) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.i2(z10);
        }
        y();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.z2(i10);
        }
        C();
    }

    public void setTextAppearance(d dVar) {
        a aVar = this.f6948i;
        if (aVar != null) {
            aVar.y2(dVar);
        }
        C();
    }
}
