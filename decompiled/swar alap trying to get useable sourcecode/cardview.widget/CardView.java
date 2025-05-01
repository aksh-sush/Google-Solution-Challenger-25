package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: l */
    private static final int[] f1412l = {R.attr.colorBackground};

    /* renamed from: m */
    private static final c f1413m;

    /* renamed from: e */
    private boolean f1414e;

    /* renamed from: f */
    private boolean f1415f;

    /* renamed from: g */
    int f1416g;

    /* renamed from: h */
    int f1417h;

    /* renamed from: i */
    final Rect f1418i;

    /* renamed from: j */
    final Rect f1419j;

    /* renamed from: k */
    private final b f1420k;

    class a implements b {

        /* renamed from: a */
        private Drawable f1421a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public View a() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.b
        public void b(int i10, int i11, int i12, int i13) {
            CardView.this.f1419j.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1418i;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void c(Drawable drawable) {
            this.f1421a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable f() {
            return this.f1421a;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f1413m = aVar;
        aVar.f();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1413m.b(this.f1420k);
    }

    public float getCardElevation() {
        return f1413m.e(this.f1420k);
    }

    public int getContentPaddingBottom() {
        return this.f1418i.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1418i.left;
    }

    public int getContentPaddingRight() {
        return this.f1418i.right;
    }

    public int getContentPaddingTop() {
        return this.f1418i.top;
    }

    public float getMaxCardElevation() {
        return f1413m.a(this.f1420k);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1415f;
    }

    public float getRadius() {
        return f1413m.g(this.f1420k);
    }

    public boolean getUseCompatPadding() {
        return this.f1414e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!(f1413m instanceof androidx.cardview.widget.a)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.i(this.f1420k)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.h(this.f1420k)), View.MeasureSpec.getSize(i11)), mode2);
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1413m.m(this.f1420k, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1413m.k(this.f1420k, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1413m.n(this.f1420k, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1417h = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1416g = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1415f) {
            this.f1415f = z10;
            f1413m.l(this.f1420k);
        }
    }

    public void setRadius(float f10) {
        f1413m.d(this.f1420k, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1414e != z10) {
            this.f1414e = z10;
            f1413m.j(this.f1420k);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p.a.f14568a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1413m.m(this.f1420k, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources;
        int i11;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1418i = rect;
        this.f1419j = new Rect();
        a aVar = new a();
        this.f1420k = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.d.f14572a, i10, p.c.f14571a);
        int i12 = p.d.f14575d;
        if (obtainStyledAttributes.hasValue(i12)) {
            valueOf = obtainStyledAttributes.getColorStateList(i12);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1412l);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i11 = p.b.f14570b;
            } else {
                resources = getResources();
                i11 = p.b.f14569a;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i11));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(p.d.f14576e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(p.d.f14577f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(p.d.f14578g, 0.0f);
        this.f1414e = obtainStyledAttributes.getBoolean(p.d.f14580i, false);
        this.f1415f = obtainStyledAttributes.getBoolean(p.d.f14579h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(p.d.f14581j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(p.d.f14583l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(p.d.f14585n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(p.d.f14584m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(p.d.f14582k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1416g = obtainStyledAttributes.getDimensionPixelSize(p.d.f14573b, 0);
        this.f1417h = obtainStyledAttributes.getDimensionPixelSize(p.d.f14574c, 0);
        obtainStyledAttributes.recycle();
        f1413m.c(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}