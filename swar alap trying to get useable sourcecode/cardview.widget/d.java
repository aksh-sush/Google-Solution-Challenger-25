package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
class d extends Drawable {

    /* renamed from: a */
    private float f1423a;

    /* renamed from: c */
    private final RectF f1425c;

    /* renamed from: d */
    private final Rect f1426d;

    /* renamed from: e */
    private float f1427e;

    /* renamed from: h */
    private ColorStateList f1430h;

    /* renamed from: i */
    private PorterDuffColorFilter f1431i;

    /* renamed from: j */
    private ColorStateList f1432j;

    /* renamed from: f */
    private boolean f1428f = false;

    /* renamed from: g */
    private boolean f1429g = true;

    /* renamed from: k */
    private PorterDuff.Mode f1433k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f1424b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f1423a = f10;
        e(colorStateList);
        this.f1425c = new RectF();
        this.f1426d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1430h = colorStateList;
        this.f1424b.setColor(colorStateList.getColorForState(getState(), this.f1430h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1425c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1426d.set(rect);
        if (this.f1428f) {
            this.f1426d.inset((int) Math.ceil(e.a(this.f1427e, this.f1423a, this.f1429g)), (int) Math.ceil(e.b(this.f1427e, this.f1423a, this.f1429g)));
            this.f1425c.set(this.f1426d);
        }
    }

    public ColorStateList b() {
        return this.f1430h;
    }

    float c() {
        return this.f1427e;
    }

    public float d() {
        return this.f1423a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1424b;
        if (this.f1431i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1431i);
            z10 = true;
        }
        RectF rectF = this.f1425c;
        float f10 = this.f1423a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f1427e && this.f1428f == z10 && this.f1429g == z11) {
            return;
        }
        this.f1427e = f10;
        this.f1428f = z10;
        this.f1429g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1426d, this.f1423a);
    }

    void h(float f10) {
        if (f10 == this.f1423a) {
            return;
        }
        this.f1423a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1432j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1430h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1430h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1424b.getColor();
        if (z10) {
            this.f1424b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1432j;
        if (colorStateList2 == null || (mode = this.f1433k) == null) {
            return z10;
        }
        this.f1431i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1424b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1424b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1432j = colorStateList;
        this.f1431i = a(colorStateList, this.f1433k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1433k = mode;
        this.f1431i = a(this.f1432j, mode);
        invalidateSelf();
    }
}