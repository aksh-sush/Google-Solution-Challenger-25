package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.o0;
import androidx.core.view.h0;
import androidx.core.view.r;
import androidx.core.widget.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import g5.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o4.h;
import o4.i;
import z0.n;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int F0 = i.Widget_Design_TextInputLayout;
    private static final int[][] G0 = {new int[]{16842919}, new int[0]};
    private z0.d A;
    private boolean A0;
    private z0.d B;
    private ValueAnimator B0;
    private ColorStateList C;
    private boolean C0;
    private ColorStateList D;
    /* access modifiers changed from: private */
    public boolean D0;
    private ColorStateList E;
    private boolean E0;
    private ColorStateList F;
    private boolean G;
    private CharSequence H;
    private boolean I;
    private g5.g J;
    private g5.g K;
    private StateListDrawable L;
    private boolean M;
    private g5.g N;
    private g5.g O;
    private k P;
    private boolean Q;
    private final int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;

    /* renamed from: a0  reason: collision with root package name */
    private int f7281a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f7282b0;

    /* renamed from: c0  reason: collision with root package name */
    private final Rect f7283c0;

    /* renamed from: d0  reason: collision with root package name */
    private final Rect f7284d0;

    /* renamed from: e  reason: collision with root package name */
    private final FrameLayout f7285e;

    /* renamed from: e0  reason: collision with root package name */
    private final RectF f7286e0;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final a0 f7287f;

    /* renamed from: f0  reason: collision with root package name */
    private Typeface f7288f0;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final s f7289g;

    /* renamed from: g0  reason: collision with root package name */
    private Drawable f7290g0;

    /* renamed from: h  reason: collision with root package name */
    EditText f7291h;

    /* renamed from: h0  reason: collision with root package name */
    private int f7292h0;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f7293i;

    /* renamed from: i0  reason: collision with root package name */
    private final LinkedHashSet f7294i0;

    /* renamed from: j  reason: collision with root package name */
    private int f7295j;

    /* renamed from: j0  reason: collision with root package name */
    private Drawable f7296j0;

    /* renamed from: k  reason: collision with root package name */
    private int f7297k;

    /* renamed from: k0  reason: collision with root package name */
    private int f7298k0;

    /* renamed from: l  reason: collision with root package name */
    private int f7299l;

    /* renamed from: l0  reason: collision with root package name */
    private Drawable f7300l0;

    /* renamed from: m  reason: collision with root package name */
    private int f7301m;

    /* renamed from: m0  reason: collision with root package name */
    private ColorStateList f7302m0;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final v f7303n;

    /* renamed from: n0  reason: collision with root package name */
    private ColorStateList f7304n0;

    /* renamed from: o  reason: collision with root package name */
    boolean f7305o;

    /* renamed from: o0  reason: collision with root package name */
    private int f7306o0;

    /* renamed from: p  reason: collision with root package name */
    private int f7307p;

    /* renamed from: p0  reason: collision with root package name */
    private int f7308p0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f7309q;

    /* renamed from: q0  reason: collision with root package name */
    private int f7310q0;

    /* renamed from: r  reason: collision with root package name */
    private e f7311r;

    /* renamed from: r0  reason: collision with root package name */
    private ColorStateList f7312r0;

    /* renamed from: s  reason: collision with root package name */
    private TextView f7313s;

    /* renamed from: s0  reason: collision with root package name */
    private int f7314s0;

    /* renamed from: t  reason: collision with root package name */
    private int f7315t;

    /* renamed from: t0  reason: collision with root package name */
    private int f7316t0;

    /* renamed from: u  reason: collision with root package name */
    private int f7317u;

    /* renamed from: u0  reason: collision with root package name */
    private int f7318u0;

    /* renamed from: v  reason: collision with root package name */
    private CharSequence f7319v;

    /* renamed from: v0  reason: collision with root package name */
    private int f7320v0;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f7321w;

    /* renamed from: w0  reason: collision with root package name */
    private int f7322w0;

    /* renamed from: x  reason: collision with root package name */
    private TextView f7323x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f7324x0;

    /* renamed from: y  reason: collision with root package name */
    private ColorStateList f7325y;

    /* renamed from: y0  reason: collision with root package name */
    final com.google.android.material.internal.a f7326y0;

    /* renamed from: z  reason: collision with root package name */
    private int f7327z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f7328z0;

    class a implements TextWatcher {
        a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.D0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f7305o) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f7321w) {
                TextInputLayout.this.y0(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            TextInputLayout.this.f7289g.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f7326y0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* renamed from: d  reason: collision with root package name */
        private final TextInputLayout f7332d;

        public d(TextInputLayout textInputLayout) {
            this.f7332d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            if (r3 != null) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(android.view.View r14, androidx.core.view.accessibility.h0 r15) {
            /*
                r13 = this;
                super.g(r14, r15)
                com.google.android.material.textfield.TextInputLayout r0 = r13.f7332d
                android.widget.EditText r0 = r0.getEditText()
                if (r0 == 0) goto L_0x0010
                android.text.Editable r0 = r0.getText()
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                com.google.android.material.textfield.TextInputLayout r1 = r13.f7332d
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f7332d
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f7332d
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f7332d
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r13.f7332d
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r13.f7332d
                boolean r9 = r9.P()
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L_0x0051
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L_0x004f
                goto L_0x0051
            L_0x004f:
                r11 = 0
                goto L_0x0052
            L_0x0051:
                r11 = 1
            L_0x0052:
                if (r8 == 0) goto L_0x0059
                java.lang.String r1 = r1.toString()
                goto L_0x005b
            L_0x0059:
                java.lang.String r1 = ""
            L_0x005b:
                com.google.android.material.textfield.TextInputLayout r8 = r13.f7332d
                com.google.android.material.textfield.a0 r8 = r8.f7287f
                r8.A(r15)
                java.lang.String r8 = ", "
                if (r6 == 0) goto L_0x006c
                r15.z0(r0)
                goto L_0x0091
            L_0x006c:
                boolean r12 = android.text.TextUtils.isEmpty(r1)
                if (r12 != 0) goto L_0x008c
                r15.z0(r1)
                if (r9 == 0) goto L_0x0091
                if (r3 == 0) goto L_0x0091
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r1)
                r9.append(r8)
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                goto L_0x008e
            L_0x008c:
                if (r3 == 0) goto L_0x0091
            L_0x008e:
                r15.z0(r3)
            L_0x0091:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00bd
                int r3 = android.os.Build.VERSION.SDK_INT
                r9 = 26
                if (r3 < r9) goto L_0x00a1
                r15.l0(r1)
                goto L_0x00b8
            L_0x00a1:
                if (r6 == 0) goto L_0x00b5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                r3.append(r8)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
            L_0x00b5:
                r15.z0(r1)
            L_0x00b8:
                r1 = r6 ^ 1
                r15.v0(r1)
            L_0x00bd:
                if (r0 == 0) goto L_0x00c6
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00c6
                goto L_0x00c7
            L_0x00c6:
                r4 = -1
            L_0x00c7:
                r15.n0(r4)
                if (r11 == 0) goto L_0x00d3
                if (r10 == 0) goto L_0x00cf
                goto L_0x00d0
            L_0x00cf:
                r2 = r5
            L_0x00d0:
                r15.h0(r2)
            L_0x00d3:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f7332d
                com.google.android.material.textfield.v r0 = r0.f7303n
                android.view.View r0 = r0.t()
                if (r0 == 0) goto L_0x00e2
                r15.m0(r0)
            L_0x00e2:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f7332d
                com.google.android.material.textfield.s r0 = r0.f7289g
                com.google.android.material.textfield.t r0 = r0.m()
                r0.o(r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.d.g(android.view.View, androidx.core.view.accessibility.h0):void");
        }

        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f7332d.f7289g.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends d0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        CharSequence f7333g;

        /* renamed from: h  reason: collision with root package name */
        boolean f7334h;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7333g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7334h = parcel.readInt() != 1 ? false : true;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f7333g + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f7333g, parcel, i10);
            parcel.writeInt(this.f7334h ? 1 : 0);
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o4.a.textInputStyle);
    }

    private z0.d A() {
        z0.d dVar = new z0.d();
        dVar.U((long) b5.d.f(getContext(), o4.a.motionDurationShort2, 87));
        dVar.W(b5.d.g(getContext(), o4.a.motionEasingLinearInterpolator, p4.a.f14445a));
        return dVar;
    }

    private boolean B() {
        return this.G && !TextUtils.isEmpty(this.H) && (this.J instanceof h);
    }

    private void C() {
        Iterator it = this.f7294i0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        g5.g gVar;
        if (this.O != null && (gVar = this.N) != null) {
            gVar.draw(canvas);
            if (this.f7291h.isFocused()) {
                Rect bounds = this.O.getBounds();
                Rect bounds2 = this.N.getBounds();
                float x10 = this.f7326y0.x();
                int centerX = bounds2.centerX();
                bounds.left = p4.a.c(centerX, bounds2.left, x10);
                bounds.right = p4.a.c(centerX, bounds2.right, x10);
                this.O.draw(canvas);
            }
        }
    }

    private void E(Canvas canvas) {
        if (this.G) {
            this.f7326y0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.B0.cancel();
        }
        if (!z10 || !this.A0) {
            this.f7326y0.c0(0.0f);
        } else {
            l(0.0f);
        }
        if (B() && ((h) this.J).h0()) {
            y();
        }
        this.f7324x0 = true;
        L();
        this.f7287f.l(true);
        this.f7289g.H(true);
    }

    private g5.g G(boolean z10) {
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(o4.c.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f7291h;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : (float) getResources().getDimensionPixelOffset(o4.c.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(o4.c.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        k m10 = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f7291h;
        g5.g m11 = g5.g.m(getContext(), popupElevation, editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null);
        m11.setShapeAppearanceModel(m10);
        m11.V(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m11;
    }

    private static Drawable H(g5.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{v4.a.k(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f7291h.getCompoundPaddingLeft() : this.f7289g.y() : this.f7287f.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f7291h.getCompoundPaddingRight() : this.f7287f.c() : this.f7289g.y());
    }

    private static Drawable K(Context context, g5.g gVar, int i10, int[][] iArr) {
        int c10 = v4.a.c(context, o4.a.colorSurface, "TextInputLayout");
        g5.g gVar2 = new g5.g(gVar.A());
        int k10 = v4.a.k(i10, c10, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{k10, 0}));
        gVar2.setTint(c10);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{k10, c10});
        g5.g gVar3 = new g5.g(gVar.A());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    private void L() {
        TextView textView = this.f7323x;
        if (textView != null && this.f7321w) {
            textView.setText((CharSequence) null);
            n.a(this.f7285e, this.B);
            this.f7323x.setVisibility(4);
        }
    }

    private boolean Q() {
        return d0() || (this.f7313s != null && this.f7309q);
    }

    private boolean S() {
        return this.S == 1 && this.f7291h.getMinLines() <= 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f7291h.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.S != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.f7286e0;
            this.f7326y0.o(rectF, this.f7291h.getWidth(), this.f7291h.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.U));
                ((h) this.J).k0(rectF);
            }
        }
    }

    private void X() {
        if (B() && !this.f7324x0) {
            y();
            W();
        }
    }

    private static void Y(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z10);
            }
        }
    }

    private void a0() {
        TextView textView = this.f7323x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        Drawable orCreateFilledDropDownMenuBackground;
        EditText editText = this.f7291h;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.S;
                if (i10 == 2) {
                    orCreateFilledDropDownMenuBackground = getOrCreateOutlinedDropDownMenuBackground();
                } else if (i10 == 1) {
                    orCreateFilledDropDownMenuBackground = getOrCreateFilledDropDownMenuBackground();
                } else {
                    return;
                }
                autoCompleteTextView.setDropDownBackgroundDrawable(orCreateFilledDropDownMenuBackground);
            }
        }
    }

    private boolean e0() {
        return (this.f7289g.G() || ((this.f7289g.A() && M()) || this.f7289g.w() != null)) && this.f7289g.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f7287f.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.f7323x != null && this.f7321w && !TextUtils.isEmpty(this.f7319v)) {
            this.f7323x.setText(this.f7319v);
            n.a(this.f7285e, this.A);
            this.f7323x.setVisibility(0);
            this.f7323x.bringToFront();
            announceForAccessibility(this.f7319v);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f7291h;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.J;
        }
        int d10 = v4.a.d(this.f7291h, o4.a.f13899f);
        int i10 = this.S;
        if (i10 == 2) {
            return K(getContext(), this.J, d10, G0);
        }
        if (i10 == 1) {
            return H(this.J, this.f7282b0, d10, G0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.L == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.L = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.L.addState(new int[0], G(false));
        }
        return this.L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.K == null) {
            this.K = G(true);
        }
        return this.K;
    }

    private void h0() {
        Resources resources;
        int i10;
        if (this.S == 1) {
            if (d5.c.h(getContext())) {
                resources = getResources();
                i10 = o4.c.material_font_2_0_box_collapsed_padding_top;
            } else if (d5.c.g(getContext())) {
                resources = getResources();
                i10 = o4.c.material_font_1_3_box_collapsed_padding_top;
            } else {
                return;
            }
            this.T = resources.getDimensionPixelSize(i10);
        }
    }

    private void i0(Rect rect) {
        g5.g gVar = this.N;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.V, rect.right, i10);
        }
        g5.g gVar2 = this.O;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.W, rect.right, i11);
        }
    }

    private void j() {
        TextView textView = this.f7323x;
        if (textView != null) {
            this.f7285e.addView(textView);
            this.f7323x.setVisibility(0);
        }
    }

    private void j0() {
        if (this.f7313s != null) {
            EditText editText = this.f7291h;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        EditText editText;
        int J2;
        int dimensionPixelSize;
        int I2;
        Resources resources;
        int i10;
        if (this.f7291h != null && this.S == 1) {
            if (d5.c.h(getContext())) {
                editText = this.f7291h;
                J2 = h0.J(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(o4.c.material_filled_edittext_font_2_0_padding_top);
                I2 = h0.I(this.f7291h);
                resources = getResources();
                i10 = o4.c.material_filled_edittext_font_2_0_padding_bottom;
            } else if (d5.c.g(getContext())) {
                editText = this.f7291h;
                J2 = h0.J(editText);
                dimensionPixelSize = getResources().getDimensionPixelSize(o4.c.material_filled_edittext_font_1_3_padding_top);
                I2 = h0.I(this.f7291h);
                resources = getResources();
                i10 = o4.c.material_filled_edittext_font_1_3_padding_bottom;
            } else {
                return;
            }
            h0.G0(editText, J2, dimensionPixelSize, I2, resources.getDimensionPixelSize(i10));
        }
    }

    private static void l0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? h.character_counter_overflowed_content_description : h.character_counter_content_description, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
    }

    private void m() {
        g5.g gVar = this.J;
        if (gVar != null) {
            k A2 = gVar.A();
            k kVar = this.P;
            if (A2 != kVar) {
                this.J.setShapeAppearanceModel(kVar);
            }
            if (w()) {
                this.J.X((float) this.U, this.f7281a0);
            }
            int q10 = q();
            this.f7282b0 = q10;
            this.J.T(ColorStateList.valueOf(q10));
            n();
            r0();
        }
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f7313s;
        if (textView != null) {
            c0(textView, this.f7309q ? this.f7315t : this.f7317u);
            if (!this.f7309q && (colorStateList2 = this.C) != null) {
                this.f7313s.setTextColor(colorStateList2);
            }
            if (this.f7309q && (colorStateList = this.D) != null) {
                this.f7313s.setTextColor(colorStateList);
            }
        }
    }

    private void n() {
        if (this.N != null && this.O != null) {
            if (x()) {
                this.N.T(ColorStateList.valueOf(this.f7291h.isFocused() ? this.f7306o0 : this.f7281a0));
                this.O.T(ColorStateList.valueOf(this.f7281a0));
            }
            invalidate();
        }
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.E;
        if (colorStateList2 == null) {
            colorStateList2 = v4.a.h(getContext(), o4.a.f13898e);
        }
        EditText editText = this.f7291h;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.f7291h.getTextCursorDrawable()).mutate();
            if (Q() && (colorStateList = this.F) != null) {
                colorStateList2 = colorStateList;
            }
            androidx.core.graphics.drawable.a.o(mutate, colorStateList2);
        }
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.R;
        rectF.left = f10 - ((float) i10);
        rectF.right += (float) i10;
    }

    private void p() {
        int i10 = this.S;
        if (i10 == 0) {
            this.J = null;
        } else if (i10 == 1) {
            this.J = new g5.g(this.P);
            this.N = new g5.g();
            this.O = new g5.g();
            return;
        } else if (i10 == 2) {
            this.J = (!this.G || (this.J instanceof h)) ? new g5.g(this.P) : h.g0(this.P);
        } else {
            throw new IllegalArgumentException(this.S + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.N = null;
        this.O = null;
    }

    private int q() {
        return this.S == 1 ? v4.a.j(v4.a.e(this, o4.a.colorSurface, 0), this.f7282b0) : this.f7282b0;
    }

    private void q0() {
        h0.w0(this.f7291h, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        int i10;
        int i11;
        if (this.f7291h != null) {
            Rect rect2 = this.f7284d0;
            boolean g10 = v.g(this);
            rect2.bottom = rect.bottom;
            int i12 = this.S;
            if (i12 == 1) {
                rect2.left = I(rect.left, g10);
                i10 = rect.top + this.T;
            } else if (i12 != 2) {
                rect2.left = I(rect.left, g10);
                i10 = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f7291h.getPaddingLeft();
                rect2.top = rect.top - v();
                i11 = rect.right - this.f7291h.getPaddingRight();
                rect2.right = i11;
                return rect2;
            }
            rect2.top = i10;
            i11 = J(rect.right, g10);
            rect2.right = i11;
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return S() ? (int) (((float) rect2.top) + f10) : rect.bottom - this.f7291h.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int max;
        if (this.f7291h == null || this.f7291h.getMeasuredHeight() >= (max = Math.max(this.f7289g.getMeasuredHeight(), this.f7287f.getMeasuredHeight()))) {
            return false;
        }
        this.f7291h.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f7291h == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f7291h = editText;
            int i10 = this.f7295j;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f7299l);
            }
            int i11 = this.f7297k;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f7301m);
            }
            this.M = false;
            V();
            setTextInputAccessibilityDelegate(new d(this));
            this.f7326y0.i0(this.f7291h.getTypeface());
            this.f7326y0.a0(this.f7291h.getTextSize());
            int i12 = Build.VERSION.SDK_INT;
            this.f7326y0.X(this.f7291h.getLetterSpacing());
            int gravity = this.f7291h.getGravity();
            this.f7326y0.S((gravity & -113) | 48);
            this.f7326y0.Z(gravity);
            this.f7291h.addTextChangedListener(new a());
            if (this.f7302m0 == null) {
                this.f7302m0 = this.f7291h.getHintTextColors();
            }
            if (this.G) {
                if (TextUtils.isEmpty(this.H)) {
                    CharSequence hint = this.f7291h.getHint();
                    this.f7293i = hint;
                    setHint(hint);
                    this.f7291h.setHint((CharSequence) null);
                }
                this.I = true;
            }
            if (i12 >= 29) {
                n0();
            }
            if (this.f7313s != null) {
                k0(this.f7291h.getText());
            }
            p0();
            this.f7303n.f();
            this.f7287f.bringToFront();
            this.f7289g.bringToFront();
            C();
            this.f7289g.x0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            v0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.H)) {
            this.H = charSequence;
            this.f7326y0.g0(charSequence);
            if (!this.f7324x0) {
                W();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f7321w != z10) {
            if (z10) {
                j();
            } else {
                a0();
                this.f7323x = null;
            }
            this.f7321w = z10;
        }
    }

    private int t(Rect rect, float f10) {
        return S() ? (int) (((float) rect.centerY()) - (f10 / 2.0f)) : rect.top + this.f7291h.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.S != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7285e.getLayoutParams();
            int v10 = v();
            if (v10 != layoutParams.topMargin) {
                layoutParams.topMargin = v10;
                this.f7285e.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.f7291h != null) {
            Rect rect2 = this.f7284d0;
            float w10 = this.f7326y0.w();
            rect2.left = rect.left + this.f7291h.getCompoundPaddingLeft();
            rect2.top = t(rect, w10);
            rect2.right = rect.right - this.f7291h.getCompoundPaddingRight();
            rect2.bottom = s(rect, rect2, w10);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int v() {
        float q10;
        if (!this.G) {
            return 0;
        }
        int i10 = this.S;
        if (i10 == 0) {
            q10 = this.f7326y0.q();
        } else if (i10 != 2) {
            return 0;
        } else {
            q10 = this.f7326y0.q() / 2.0f;
        }
        return (int) q10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(boolean r6, boolean r7) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            android.widget.EditText r1 = r5.f7291h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            android.text.Editable r1 = r1.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.widget.EditText r4 = r5.f7291h
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.hasFocus()
            if (r4 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            android.content.res.ColorStateList r3 = r5.f7302m0
            if (r3 == 0) goto L_0x002c
            com.google.android.material.internal.a r4 = r5.f7326y0
            r4.M(r3)
        L_0x002c:
            if (r0 != 0) goto L_0x004c
            android.content.res.ColorStateList r0 = r5.f7302m0
            if (r0 == 0) goto L_0x0040
            r3 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r3 = new int[]{r3}
            int r4 = r5.f7322w0
            int r0 = r0.getColorForState(r3, r4)
            goto L_0x0042
        L_0x0040:
            int r0 = r5.f7322w0
        L_0x0042:
            com.google.android.material.internal.a r3 = r5.f7326y0
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
        L_0x0048:
            r3.M(r0)
            goto L_0x0078
        L_0x004c:
            boolean r0 = r5.d0()
            if (r0 == 0) goto L_0x005e
            com.google.android.material.internal.a r0 = r5.f7326y0
            com.google.android.material.textfield.v r3 = r5.f7303n
            android.content.res.ColorStateList r3 = r3.r()
            r0.M(r3)
            goto L_0x0078
        L_0x005e:
            boolean r0 = r5.f7309q
            if (r0 == 0) goto L_0x006d
            android.widget.TextView r0 = r5.f7313s
            if (r0 == 0) goto L_0x006d
            com.google.android.material.internal.a r3 = r5.f7326y0
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto L_0x0048
        L_0x006d:
            if (r2 == 0) goto L_0x0078
            android.content.res.ColorStateList r0 = r5.f7304n0
            if (r0 == 0) goto L_0x0078
            com.google.android.material.internal.a r3 = r5.f7326y0
            r3.R(r0)
        L_0x0078:
            if (r1 != 0) goto L_0x0091
            boolean r0 = r5.f7328z0
            if (r0 == 0) goto L_0x0091
            boolean r0 = r5.isEnabled()
            if (r0 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x0087
            goto L_0x0091
        L_0x0087:
            if (r7 != 0) goto L_0x008d
            boolean r7 = r5.f7324x0
            if (r7 != 0) goto L_0x009a
        L_0x008d:
            r5.F(r6)
            goto L_0x009a
        L_0x0091:
            if (r7 != 0) goto L_0x0097
            boolean r7 = r5.f7324x0
            if (r7 == 0) goto L_0x009a
        L_0x0097:
            r5.z(r6)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v0(boolean, boolean):void");
    }

    private boolean w() {
        return this.S == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.f7323x != null && (editText = this.f7291h) != null) {
            this.f7323x.setGravity(editText.getGravity());
            this.f7323x.setPadding(this.f7291h.getCompoundPaddingLeft(), this.f7291h.getCompoundPaddingTop(), this.f7291h.getCompoundPaddingRight(), this.f7291h.getCompoundPaddingBottom());
        }
    }

    private boolean x() {
        return this.U > -1 && this.f7281a0 != 0;
    }

    private void x0() {
        EditText editText = this.f7291h;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((h) this.J).i0();
        }
    }

    /* access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.f7311r.a(editable) != 0 || this.f7324x0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.B0.cancel();
        }
        if (!z10 || !this.A0) {
            this.f7326y0.c0(1.0f);
        } else {
            l(1.0f);
        }
        this.f7324x0 = false;
        if (B()) {
            W();
        }
        x0();
        this.f7287f.l(false);
        this.f7289g.H(false);
    }

    private void z0(boolean z10, boolean z11) {
        int defaultColor = this.f7312r0.getDefaultColor();
        int colorForState = this.f7312r0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f7312r0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z10) {
            this.f7281a0 = colorForState2;
        } else if (z11) {
            this.f7281a0 = colorForState;
        } else {
            this.f7281a0 = defaultColor;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r5.f7291h;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0() {
        /*
            r5 = this;
            g5.g r0 = r5.J
            if (r0 == 0) goto L_0x00bd
            int r0 = r5.S
            if (r0 != 0) goto L_0x000a
            goto L_0x00bd
        L_0x000a:
            boolean r0 = r5.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r5.f7291h
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r5.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r5.f7291h
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x003c
            int r3 = r5.f7322w0
        L_0x0039:
            r5.f7281a0 = r3
            goto L_0x006e
        L_0x003c:
            boolean r3 = r5.d0()
            if (r3 == 0) goto L_0x004f
            android.content.res.ColorStateList r3 = r5.f7312r0
            if (r3 == 0) goto L_0x004a
        L_0x0046:
            r5.z0(r0, r1)
            goto L_0x006e
        L_0x004a:
            int r3 = r5.getErrorCurrentTextColors()
            goto L_0x0039
        L_0x004f:
            boolean r3 = r5.f7309q
            if (r3 == 0) goto L_0x0061
            android.widget.TextView r3 = r5.f7313s
            if (r3 == 0) goto L_0x0061
            android.content.res.ColorStateList r4 = r5.f7312r0
            if (r4 == 0) goto L_0x005c
            goto L_0x0046
        L_0x005c:
            int r3 = r3.getCurrentTextColor()
            goto L_0x0039
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            int r3 = r5.f7310q0
            goto L_0x0039
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            int r3 = r5.f7308p0
            goto L_0x0039
        L_0x006b:
            int r3 = r5.f7306o0
            goto L_0x0039
        L_0x006e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L_0x0077
            r5.n0()
        L_0x0077:
            com.google.android.material.textfield.s r3 = r5.f7289g
            r3.I()
            r5.Z()
            int r3 = r5.S
            r4 = 2
            if (r3 != r4) goto L_0x009c
            int r3 = r5.U
            if (r0 == 0) goto L_0x0091
            boolean r4 = r5.isEnabled()
            if (r4 == 0) goto L_0x0091
            int r4 = r5.W
            goto L_0x0093
        L_0x0091:
            int r4 = r5.V
        L_0x0093:
            r5.U = r4
            int r4 = r5.U
            if (r4 == r3) goto L_0x009c
            r5.X()
        L_0x009c:
            int r3 = r5.S
            if (r3 != r2) goto L_0x00ba
            boolean r2 = r5.isEnabled()
            if (r2 != 0) goto L_0x00ab
            int r0 = r5.f7316t0
        L_0x00a8:
            r5.f7282b0 = r0
            goto L_0x00ba
        L_0x00ab:
            if (r1 == 0) goto L_0x00b2
            if (r0 != 0) goto L_0x00b2
            int r0 = r5.f7320v0
            goto L_0x00a8
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            int r0 = r5.f7318u0
            goto L_0x00a8
        L_0x00b7:
            int r0 = r5.f7314s0
            goto L_0x00a8
        L_0x00ba:
            r5.m()
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.A0():void");
    }

    public boolean M() {
        return this.f7289g.F();
    }

    public boolean N() {
        return this.f7303n.A();
    }

    public boolean O() {
        return this.f7303n.B();
    }

    /* access modifiers changed from: package-private */
    public final boolean P() {
        return this.f7324x0;
    }

    public boolean R() {
        return this.I;
    }

    public void Z() {
        this.f7287f.m();
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f7285e.addView(view, layoutParams2);
            this.f7285e.setLayoutParams(layoutParams);
            t0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void c0(TextView textView, int i10) {
        boolean z10 = true;
        try {
            j.n(textView, i10);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            j.n(textView, i.f13905a);
            textView.setTextColor(androidx.core.content.a.c(getContext(), o4.b.design_error));
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d0() {
        return this.f7303n.l();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f7291h;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f7293i != null) {
            boolean z10 = this.I;
            this.I = false;
            CharSequence hint = editText.getHint();
            this.f7291h.setHint(this.f7293i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
            } finally {
                this.f7291h.setHint(hint);
                this.I = z10;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i10);
            onProvideAutofillVirtualStructure(viewStructure, i10);
            viewStructure.setChildCount(this.f7285e.getChildCount());
            for (int i11 = 0; i11 < this.f7285e.getChildCount(); i11++) {
                View childAt = this.f7285e.getChildAt(i11);
                ViewStructure a10 = viewStructure.newChild(i11);
                childAt.dispatchProvideAutofillStructure(a10, i10);
                if (childAt == this.f7291h) {
                    a10.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.C0) {
            boolean z10 = true;
            this.C0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            com.google.android.material.internal.a aVar = this.f7326y0;
            boolean f02 = aVar != null ? aVar.f0(drawableState) | false : false;
            if (this.f7291h != null) {
                if (!h0.W(this) || !isEnabled()) {
                    z10 = false;
                }
                u0(z10);
            }
            p0();
            A0();
            if (f02) {
                invalidate();
            }
            this.C0 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.f7291h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public g5.g getBoxBackground() {
        int i10 = this.S;
        if (i10 == 1 || i10 == 2) {
            return this.J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f7282b0;
    }

    public int getBoxBackgroundMode() {
        return this.S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (v.g(this) ? this.P.j() : this.P.l()).a(this.f7286e0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (v.g(this) ? this.P.l() : this.P.j()).a(this.f7286e0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (v.g(this) ? this.P.r() : this.P.t()).a(this.f7286e0);
    }

    public float getBoxCornerRadiusTopStart() {
        return (v.g(this) ? this.P.t() : this.P.r()).a(this.f7286e0);
    }

    public int getBoxStrokeColor() {
        return this.f7310q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f7312r0;
    }

    public int getBoxStrokeWidth() {
        return this.V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.W;
    }

    public int getCounterMaxLength() {
        return this.f7307p;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f7305o || !this.f7309q || (textView = this.f7313s) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.D;
    }

    public ColorStateList getCounterTextColor() {
        return this.C;
    }

    public ColorStateList getCursorColor() {
        return this.E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f7302m0;
    }

    public EditText getEditText() {
        return this.f7291h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f7289g.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f7289g.n();
    }

    public int getEndIconMinSize() {
        return this.f7289g.o();
    }

    public int getEndIconMode() {
        return this.f7289g.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f7289g.q();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f7289g.r();
    }

    public CharSequence getError() {
        if (this.f7303n.A()) {
            return this.f7303n.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f7303n.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f7303n.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f7303n.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f7289g.s();
    }

    public CharSequence getHelperText() {
        if (this.f7303n.B()) {
            return this.f7303n.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f7303n.u();
    }

    public CharSequence getHint() {
        if (this.G) {
            return this.H;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f7326y0.q();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f7326y0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f7304n0;
    }

    public e getLengthCounter() {
        return this.f7311r;
    }

    public int getMaxEms() {
        return this.f7297k;
    }

    public int getMaxWidth() {
        return this.f7301m;
    }

    public int getMinEms() {
        return this.f7295j;
    }

    public int getMinWidth() {
        return this.f7299l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f7289g.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f7289g.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f7321w) {
            return this.f7319v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f7327z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f7325y;
    }

    public CharSequence getPrefixText() {
        return this.f7287f.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f7287f.b();
    }

    public TextView getPrefixTextView() {
        return this.f7287f.d();
    }

    public k getShapeAppearanceModel() {
        return this.P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f7287f.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f7287f.f();
    }

    public int getStartIconMinSize() {
        return this.f7287f.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f7287f.h();
    }

    public CharSequence getSuffixText() {
        return this.f7289g.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f7289g.x();
    }

    public TextView getSuffixTextView() {
        return this.f7289g.z();
    }

    public Typeface getTypeface() {
        return this.f7288f0;
    }

    public void i(f fVar) {
        this.f7294i0.add(fVar);
        if (this.f7291h != null) {
            fVar.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(Editable editable) {
        int a10 = this.f7311r.a(editable);
        boolean z10 = this.f7309q;
        int i10 = this.f7307p;
        if (i10 == -1) {
            this.f7313s.setText(String.valueOf(a10));
            this.f7313s.setContentDescription((CharSequence) null);
            this.f7309q = false;
        } else {
            this.f7309q = a10 > i10;
            l0(getContext(), this.f7313s, a10, this.f7307p, this.f7309q);
            if (z10 != this.f7309q) {
                m0();
            }
            this.f7313s.setText(androidx.core.text.a.c().j(getContext().getString(h.character_counter_pattern, new Object[]{Integer.valueOf(a10), Integer.valueOf(this.f7307p)})));
        }
        if (this.f7291h != null && z10 != this.f7309q) {
            u0(false);
            A0();
            p0();
        }
    }

    /* access modifiers changed from: package-private */
    public void l(float f10) {
        if (this.f7326y0.x() != f10) {
            if (this.B0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.B0 = valueAnimator;
                valueAnimator.setInterpolator(b5.d.g(getContext(), o4.a.motionEasingEmphasizedInterpolator, p4.a.f14446b));
                this.B0.setDuration((long) b5.d.f(getContext(), o4.a.motionDurationMedium4, 167));
                this.B0.addUpdateListener(new c());
            }
            this.B0.setFloatValues(new float[]{this.f7326y0.x(), f10});
            this.B0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f7291h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.f0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.a0 r0 = r10.f7287f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7291h
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f7290g0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f7292h0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f7290g0 = r6
            r10.f7292h0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f7291h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f7290g0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f7291h
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.i(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f7290g0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f7291h
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.j.a(r0)
            android.widget.EditText r6 = r10.f7291h
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.j.i(r6, r2, r7, r8, r0)
            r10.f7290g0 = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.e0()
            if (r6 == 0) goto L_0x00d4
            com.google.android.material.textfield.s r2 = r10.f7289g
            android.widget.TextView r2 = r2.z()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f7291h
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.s r6 = r10.f7289g
            com.google.android.material.internal.CheckableImageButton r6 = r6.k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.r.b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f7291h
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            android.graphics.drawable.Drawable r7 = r10.f7296j0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f7298k0
            if (r8 == r2) goto L_0x00b3
            r10.f7298k0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f7291h
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f7296j0
            r4 = r6[r4]
        L_0x00af:
            androidx.core.widget.j.i(r0, r1, r2, r3, r4)
            goto L_0x00f5
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f7296j0 = r7
            r10.f7298k0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f7296j0
            if (r2 == r3) goto L_0x00d2
            r10.f7300l0 = r2
            android.widget.EditText r0 = r10.f7291h
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            goto L_0x00af
        L_0x00d2:
            r5 = r0
            goto L_0x00f5
        L_0x00d4:
            android.graphics.drawable.Drawable r6 = r10.f7296j0
            if (r6 == 0) goto L_0x00f6
            android.widget.EditText r6 = r10.f7291h
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.j.a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f7296j0
            if (r3 != r7) goto L_0x00f2
            android.widget.EditText r0 = r10.f7291h
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f7300l0
            r4 = r6[r4]
            androidx.core.widget.j.i(r0, r1, r3, r7, r4)
            goto L_0x00f3
        L_0x00f2:
            r5 = r0
        L_0x00f3:
            r10.f7296j0 = r2
        L_0x00f5:
            r0 = r5
        L_0x00f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o0():boolean");
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7326y0.H(configuration);
    }

    public void onGlobalLayout() {
        this.f7289g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.E0 = false;
        boolean s02 = s0();
        boolean o02 = o0();
        if (s02 || o02) {
            this.f7291h.post(new l0(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f7291h;
        if (editText != null) {
            Rect rect = this.f7283c0;
            com.google.android.material.internal.b.a(this, editText, rect);
            i0(rect);
            if (this.G) {
                this.f7326y0.a0(this.f7291h.getTextSize());
                int gravity = this.f7291h.getGravity();
                this.f7326y0.S((gravity & -113) | 48);
                this.f7326y0.Z(gravity);
                this.f7326y0.O(r(rect));
                this.f7326y0.W(u(rect));
                this.f7326y0.J();
                if (B() && !this.f7324x0) {
                    W();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.E0) {
            this.f7289g.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        w0();
        this.f7289g.x0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        setError(gVar.f7333g);
        if (gVar.f7334h) {
            post(new b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.Q) {
            float a10 = this.P.r().a(this.f7286e0);
            float a11 = this.P.t().a(this.f7286e0);
            float a12 = this.P.j().a(this.f7286e0);
            float a13 = this.P.l().a(this.f7286e0);
            g5.d q10 = this.P.q();
            g5.d s10 = this.P.s();
            k m10 = k.a().z(s10).D(q10).r(this.P.k()).v(this.P.i()).A(a11).E(a10).s(a13).w(a12).m();
            this.Q = z10;
            setShapeAppearanceModel(m10);
        }
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (d0()) {
            gVar.f7333g = getError();
        }
        gVar.f7334h = this.f7289g.E();
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public void p0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f7291h;
        if (editText != null && this.S == 0 && (background = editText.getBackground()) != null) {
            if (o0.a(background)) {
                background = background.mutate();
            }
            if (d0()) {
                currentTextColor = getErrorCurrentTextColors();
            } else if (!this.f7309q || (textView = this.f7313s) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.f7291h.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        EditText editText = this.f7291h;
        if (editText != null && this.J != null) {
            if ((this.M || editText.getBackground() == null) && this.S != 0) {
                q0();
                this.M = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f7282b0 != i10) {
            this.f7282b0 = i10;
            this.f7314s0 = i10;
            this.f7318u0 = i10;
            this.f7320v0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(androidx.core.content.a.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f7314s0 = defaultColor;
        this.f7282b0 = defaultColor;
        this.f7316t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f7318u0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f7320v0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 != this.S) {
            this.S = i10;
            if (this.f7291h != null) {
                V();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.T = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.P = this.P.v().y(i10, this.P.r()).C(i10, this.P.t()).q(i10, this.P.j()).u(i10, this.P.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f7310q0 != i10) {
            this.f7310q0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f7306o0 = colorStateList.getDefaultColor();
            this.f7322w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f7308p0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f7310q0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            A0();
        }
        this.f7310q0 = defaultColor;
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f7312r0 != colorStateList) {
            this.f7312r0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.V = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.W = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f7305o != z10) {
            if (z10) {
                c0 c0Var = new c0(getContext());
                this.f7313s = c0Var;
                c0Var.setId(o4.e.textinput_counter);
                Typeface typeface = this.f7288f0;
                if (typeface != null) {
                    this.f7313s.setTypeface(typeface);
                }
                this.f7313s.setMaxLines(1);
                this.f7303n.e(this.f7313s, 2);
                r.d((ViewGroup.MarginLayoutParams) this.f7313s.getLayoutParams(), getResources().getDimensionPixelOffset(o4.c.mtrl_textinput_counter_margin_start));
                m0();
                j0();
            } else {
                this.f7303n.C(this.f7313s, 2);
                this.f7313s = null;
            }
            this.f7305o = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f7307p != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.f7307p = i10;
            if (this.f7305o) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f7315t != i10) {
            this.f7315t = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f7317u != i10) {
            this.f7317u = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f7302m0 = colorStateList;
        this.f7304n0 = colorStateList;
        if (this.f7291h != null) {
            u0(false);
        }
    }

    public void setEnabled(boolean z10) {
        Y(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f7289g.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f7289g.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f7289g.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f7289g.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f7289g.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f7289g.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f7289g.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7289g.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f7289g.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f7289g.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f7289g.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f7289g.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f7303n.A()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f7303n.Q(charSequence);
        } else {
            this.f7303n.w();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f7303n.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f7303n.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f7303n.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f7289g.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f7289g.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7289g.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f7289g.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f7289g.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f7303n.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f7303n.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f7328z0 != z10) {
            this.f7328z0 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f7303n.R(charSequence);
        } else if (O()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f7303n.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f7303n.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f7303n.J(i10);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.A0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.G) {
            this.G = z10;
            if (!z10) {
                this.I = false;
                if (!TextUtils.isEmpty(this.H) && TextUtils.isEmpty(this.f7291h.getHint())) {
                    this.f7291h.setHint(this.H);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f7291h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.H)) {
                        setHint(hint);
                    }
                    this.f7291h.setHint((CharSequence) null);
                }
                this.I = true;
            }
            if (this.f7291h != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f7326y0.P(i10);
        this.f7304n0 = this.f7326y0.p();
        if (this.f7291h != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f7304n0 != colorStateList) {
            if (this.f7302m0 == null) {
                this.f7326y0.R(colorStateList);
            }
            this.f7304n0 = colorStateList;
            if (this.f7291h != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f7311r = eVar;
    }

    public void setMaxEms(int i10) {
        this.f7297k = i10;
        EditText editText = this.f7291h;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f7301m = i10;
        EditText editText = this.f7291h;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f7295j = i10;
        EditText editText = this.f7291h;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f7299l = i10;
        EditText editText = this.f7291h;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f7289g.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f7289g.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f7289g.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f7289g.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f7289g.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f7323x == null) {
            c0 c0Var = new c0(getContext());
            this.f7323x = c0Var;
            c0Var.setId(o4.e.textinput_placeholder);
            h0.C0(this.f7323x, 2);
            z0.d A2 = A();
            this.A = A2;
            A2.Z(67);
            this.B = A();
            setPlaceholderTextAppearance(this.f7327z);
            setPlaceholderTextColor(this.f7325y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f7321w) {
                setPlaceholderTextEnabled(true);
            }
            this.f7319v = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f7327z = i10;
        TextView textView = this.f7323x;
        if (textView != null) {
            j.n(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f7325y != colorStateList) {
            this.f7325y = colorStateList;
            TextView textView = this.f7323x;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f7287f.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f7287f.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f7287f.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g5.g gVar = this.J;
        if (gVar != null && gVar.A() != kVar) {
            this.P = kVar;
            m();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f7287f.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f7287f.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f7287f.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f7287f.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f7287f.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f7287f.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f7287f.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f7287f.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f7289g.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f7289g.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f7289g.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f7291h;
        if (editText != null) {
            h0.s0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f7288f0) {
            this.f7288f0 = typeface;
            this.f7326y0.i0(typeface);
            this.f7303n.N(typeface);
            TextView textView = this.f7313s;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u0(boolean z10) {
        v0(z10, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r7 = r23
            r8 = r24
            int r9 = F0
            r1 = r22
            android.content.Context r1 = j5.a.c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f7295j = r10
            r0.f7297k = r10
            r0.f7299l = r10
            r0.f7301m = r10
            com.google.android.material.textfield.v r1 = new com.google.android.material.textfield.v
            r1.<init>(r0)
            r0.f7303n = r1
            com.google.android.material.textfield.k0 r1 = new com.google.android.material.textfield.k0
            r1.<init>()
            r0.f7311r = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7283c0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f7284d0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f7286e0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7294i0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f7326y0 = r1
            r11 = 0
            r0.E0 = r11
            android.content.Context r12 = r21.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f7285e = r14
            r14.setAddStatesFromChildren(r13)
            android.animation.TimeInterpolator r2 = p4.a.f14445a
            r1.h0(r2)
            r1.e0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.S(r2)
            int[] r3 = o4.j.f14017n5
            int r15 = o4.j.K5
            int r6 = o4.j.I5
            int r5 = o4.j.f13930c6
            int r4 = o4.j.f13970h6
            int r2 = o4.j.f14002l6
            int[] r16 = new int[]{r15, r6, r5, r4, r2}
            r1 = r12
            r17 = r2
            r2 = r23
            r18 = r4
            r4 = r24
            r19 = r5
            r5 = r9
            r20 = r6
            r6 = r16
            androidx.appcompat.widget.f1 r1 = com.google.android.material.internal.s.j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.a0 r2 = new com.google.android.material.textfield.a0
            r2.<init>(r0, r1)
            r0.f7287f = r2
            int r3 = o4.j.f13994k6
            boolean r3 = r1.a(r3, r13)
            r0.G = r3
            int r3 = o4.j.f14057s5
            java.lang.CharSequence r3 = r1.p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = o4.j.f13986j6
            boolean r3 = r1.a(r3, r13)
            r0.A0 = r3
            int r3 = o4.j.f13946e6
            boolean r3 = r1.a(r3, r13)
            r0.f7328z0 = r3
            int r3 = o4.j.f14073u5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00d0
            int r3 = r1.k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00df
        L_0x00d0:
            int r3 = o4.j.f14049r5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00df
            int r3 = r1.f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00df:
            int r3 = o4.j.f14065t5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00ef
            int r3 = r1.k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x00fe
        L_0x00ef:
            int r3 = o4.j.f14041q5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x00fe
            int r3 = r1.f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x00fe:
            g5.k$b r3 = g5.k.e(r12, r7, r8, r9)
            g5.k r3 = r3.m()
            r0.P = r3
            android.content.res.Resources r3 = r12.getResources()
            int r4 = o4.c.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.R = r3
            int r3 = o4.j.f14097x5
            int r3 = r1.e(r3, r11)
            r0.T = r3
            int r3 = o4.j.E5
            android.content.res.Resources r4 = r12.getResources()
            int r5 = o4.c.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.V = r3
            int r3 = o4.j.F5
            android.content.res.Resources r4 = r12.getResources()
            int r5 = o4.c.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.f(r3, r4)
            r0.W = r3
            int r3 = r0.V
            r0.U = r3
            int r3 = o4.j.B5
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.d(r3, r4)
            int r5 = o4.j.A5
            float r5 = r1.d(r5, r4)
            int r6 = o4.j.f14105y5
            float r6 = r1.d(r6, r4)
            int r7 = o4.j.f14113z5
            float r4 = r1.d(r7, r4)
            g5.k r7 = r0.P
            g5.k$b r7 = r7.v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x016c
            r7.A(r3)
        L_0x016c:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0173
            r7.E(r5)
        L_0x0173:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017a
            r7.w(r6)
        L_0x017a:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0181
            r7.s(r4)
        L_0x0181:
            g5.k r3 = r7.m()
            r0.P = r3
            int r3 = o4.j.f14081v5
            android.content.res.ColorStateList r3 = d5.c.b(r12, r1, r3)
            if (r3 == 0) goto L_0x01e5
            int r4 = r3.getDefaultColor()
            r0.f7314s0 = r4
            r0.f7282b0 = r4
            boolean r4 = r3.isStateful()
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r6 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01c6
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f7316t0 = r4
            r4 = 16842908(0x101009c, float:2.3693995E-38)
            r6 = 16842910(0x101009e, float:2.3694E-38)
            int[] r4 = new int[]{r4, r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f7318u0 = r4
            int[] r4 = new int[]{r5, r6}
            int r3 = r3.getColorForState(r4, r10)
            goto L_0x01e2
        L_0x01c6:
            int r3 = r0.f7314s0
            r0.f7318u0 = r3
            int r3 = o4.b.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = g.a.a(r12, r3)
            int[] r4 = new int[]{r6}
            int r4 = r3.getColorForState(r4, r10)
            r0.f7316t0 = r4
            int[] r4 = new int[]{r5}
            int r3 = r3.getColorForState(r4, r10)
        L_0x01e2:
            r0.f7320v0 = r3
            goto L_0x01ef
        L_0x01e5:
            r0.f7282b0 = r11
            r0.f7314s0 = r11
            r0.f7316t0 = r11
            r0.f7318u0 = r11
            r0.f7320v0 = r11
        L_0x01ef:
            int r3 = o4.j.f14033p5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x01ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.f7304n0 = r3
            r0.f7302m0 = r3
        L_0x01ff:
            int r3 = o4.j.C5
            android.content.res.ColorStateList r4 = d5.c.b(r12, r1, r3)
            int r3 = r1.b(r3, r11)
            r0.f7310q0 = r3
            int r3 = o4.b.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f7306o0 = r3
            int r3 = o4.b.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f7322w0 = r3
            int r3 = o4.b.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.a.c(r12, r3)
            r0.f7308p0 = r3
            if (r4 == 0) goto L_0x0228
            r0.setBoxStrokeColorStateList(r4)
        L_0x0228:
            int r3 = o4.j.D5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x0237
            android.content.res.ColorStateList r3 = d5.c.b(r12, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0237:
            r3 = r17
            int r4 = r1.n(r3, r10)
            if (r4 == r10) goto L_0x0246
            int r3 = r1.n(r3, r11)
            r0.setHintTextAppearance(r3)
        L_0x0246:
            int r3 = o4.j.M5
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.E = r3
            int r3 = o4.j.N5
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.F = r3
            r3 = r19
            int r3 = r1.n(r3, r11)
            int r4 = o4.j.X5
            java.lang.CharSequence r4 = r1.p(r4)
            int r5 = o4.j.W5
            int r5 = r1.k(r5, r13)
            int r6 = o4.j.Y5
            boolean r6 = r1.a(r6, r11)
            r7 = r18
            int r7 = r1.n(r7, r11)
            int r8 = o4.j.f13962g6
            boolean r8 = r1.a(r8, r11)
            int r9 = o4.j.f13954f6
            java.lang.CharSequence r9 = r1.p(r9)
            int r12 = o4.j.f14066t6
            int r12 = r1.n(r12, r11)
            int r13 = o4.j.f14058s6
            java.lang.CharSequence r13 = r1.p(r13)
            int r10 = o4.j.G5
            boolean r10 = r1.a(r10, r11)
            int r11 = o4.j.H5
            r23 = r9
            r9 = -1
            int r9 = r1.k(r11, r9)
            r0.setCounterMaxLength(r9)
            r9 = 0
            int r11 = r1.n(r15, r9)
            r0.f7317u = r11
            r11 = r20
            int r11 = r1.n(r11, r9)
            r0.f7315t = r11
            int r11 = o4.j.f14089w5
            int r9 = r1.k(r11, r9)
            r0.setBoxBackgroundMode(r9)
            r0.setErrorContentDescription(r4)
            r0.setErrorAccessibilityLiveRegion(r5)
            int r4 = r0.f7315t
            r0.setCounterOverflowTextAppearance(r4)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r3)
            int r3 = r0.f7317u
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r12)
            int r3 = o4.j.f13938d6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02e1
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x02e1:
            int r3 = o4.j.f13978i6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02f0
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x02f0:
            int r3 = o4.j.f14010m6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x02ff
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x02ff:
            int r3 = o4.j.L5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x030e
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x030e:
            int r3 = o4.j.J5
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x031d
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x031d:
            int r3 = o4.j.f14074u6
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L_0x032c
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x032c:
            com.google.android.material.textfield.s r3 = new com.google.android.material.textfield.s
            r3.<init>(r0, r1)
            r0.f7289g = r3
            int r4 = o4.j.f14025o5
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r1.w()
            r1 = 2
            androidx.core.view.h0.C0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r1 < r7) goto L_0x034a
            androidx.core.view.h0.D0(r0, r5)
        L_0x034a:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r8)
            r0.setErrorEnabled(r6)
            r0.setCounterEnabled(r10)
            r1 = r23
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f7289g.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f7289g.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f7289g.c0(drawable);
    }

    public void setHint(CharSequence charSequence) {
        if (this.G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f7289g.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f7289g.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f7287f.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f7287f.s(drawable);
    }
}
