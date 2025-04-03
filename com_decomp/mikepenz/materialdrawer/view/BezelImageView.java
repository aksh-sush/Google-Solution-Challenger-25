package com.mikepenz.materialdrawer.view;

import a7.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.core.view.h0;
import t6.m;
import t6.n;

public class BezelImageView extends ImageView {

    /* renamed from: e  reason: collision with root package name */
    private Paint f9238e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f9239f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f9240g;

    /* renamed from: h  reason: collision with root package name */
    private RectF f9241h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f9242i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9243j;

    /* renamed from: k  reason: collision with root package name */
    private ColorMatrixColorFilter f9244k;

    /* renamed from: l  reason: collision with root package name */
    private int f9245l;

    /* renamed from: m  reason: collision with root package name */
    private int f9246m;

    /* renamed from: n  reason: collision with root package name */
    private ColorFilter f9247n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9248o;

    /* renamed from: p  reason: collision with root package name */
    private Bitmap f9249p;

    /* renamed from: q  reason: collision with root package name */
    private int f9250q;

    /* renamed from: r  reason: collision with root package name */
    private int f9251r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9252s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f9253t;

    private class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        int f9254a;

        /* renamed from: b  reason: collision with root package name */
        int f9255b;

        a(int i10, int i11) {
            this.f9254a = i10;
            this.f9255b = i11;
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, this.f9254a, this.f9255b);
        }
    }

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            this.f9253t = false;
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9253t = true;
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            this.f9253t = false;
        }
        invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9242i;
        if (drawable != null && drawable.isStateful()) {
            this.f9242i.setState(getDrawableState());
        }
        if (isDuplicateParentStateEnabled()) {
            h0.j0(this);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f9242i) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r10.f9239f.setColorFilter(r10.f9244k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.Rect r0 = r10.f9240g
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r0.width()
            android.graphics.Rect r1 = r10.f9240g
            int r1 = r1.height()
            if (r0 == 0) goto L_0x00b8
            if (r1 != 0) goto L_0x0015
            goto L_0x00b8
        L_0x0015:
            boolean r2 = r10.f9248o
            r3 = 0
            if (r2 == 0) goto L_0x0028
            int r2 = r10.f9250q
            if (r0 != r2) goto L_0x0028
            int r2 = r10.f9251r
            if (r1 != r2) goto L_0x0028
            boolean r2 = r10.f9253t
            boolean r4 = r10.f9252s
            if (r2 == r4) goto L_0x00a5
        L_0x0028:
            int r2 = r10.f9250q
            if (r0 != r2) goto L_0x0037
            int r2 = r10.f9251r
            if (r1 != r2) goto L_0x0037
            android.graphics.Bitmap r0 = r10.f9249p
            r1 = 0
            r0.eraseColor(r1)
            goto L_0x0048
        L_0x0037:
            android.graphics.Bitmap r2 = r10.f9249p
            r2.recycle()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r10.f9249p = r2
            r10.f9250q = r0
            r10.f9251r = r1
        L_0x0048:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            android.graphics.Bitmap r1 = r10.f9249p
            r0.<init>(r1)
            android.graphics.drawable.Drawable r1 = r10.f9242i
            r2 = 31
            if (r1 == 0) goto L_0x0087
            int r1 = r0.save()
            android.graphics.drawable.Drawable r4 = r10.f9242i
            r4.draw(r0)
            boolean r4 = r10.f9253t
            if (r4 == 0) goto L_0x0074
            android.graphics.ColorFilter r4 = r10.f9247n
            if (r4 == 0) goto L_0x006c
        L_0x0066:
            android.graphics.Paint r5 = r10.f9239f
            r5.setColorFilter(r4)
            goto L_0x0079
        L_0x006c:
            android.graphics.Paint r4 = r10.f9239f
            android.graphics.ColorMatrixColorFilter r5 = r10.f9244k
            r4.setColorFilter(r5)
            goto L_0x0079
        L_0x0074:
            android.graphics.Paint r4 = r10.f9239f
            r4.setColorFilter(r3)
        L_0x0079:
            android.graphics.RectF r4 = r10.f9241h
            android.graphics.Paint r5 = r10.f9239f
            r0.saveLayer(r4, r5, r2)
            super.onDraw(r0)
            r0.restoreToCount(r1)
            goto L_0x00a5
        L_0x0087:
            boolean r1 = r10.f9253t
            if (r1 == 0) goto L_0x00a2
            int r1 = r0.save()
            r5 = 0
            r6 = 0
            int r4 = r10.f9250q
            float r7 = (float) r4
            int r4 = r10.f9251r
            float r8 = (float) r4
            android.graphics.Paint r9 = r10.f9238e
            r4 = r0
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.ColorFilter r4 = r10.f9247n
            if (r4 == 0) goto L_0x006c
            goto L_0x0066
        L_0x00a2:
            super.onDraw(r0)
        L_0x00a5:
            android.graphics.Bitmap r0 = r10.f9249p
            android.graphics.Rect r1 = r10.f9240g
            int r2 = r1.left
            float r2 = (float) r2
            int r1 = r1.top
            float r1 = (float) r1
            r11.drawBitmap(r0, r2, r1, r3)
            boolean r11 = r10.isPressed()
            r10.f9252s = r11
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialdrawer.view.BezelImageView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (this.f9243j) {
            setOutlineProvider(new a(i10, i11));
        }
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        this.f9240g = new Rect(0, 0, i12 - i10, i13 - i11);
        this.f9241h = new RectF(this.f9240g);
        Drawable drawable = this.f9242i;
        if (drawable != null) {
            drawable.setBounds(this.f9240g);
        }
        if (frame) {
            this.f9248o = false;
        }
        return frame;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i10) {
        super.setImageResource(i10);
    }

    public void setImageURI(Uri uri) {
        if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
            b.a().b(this, uri, (String) null);
        } else {
            super.setImageURI(uri);
        }
    }

    public void setSelectorColor(int i10) {
        this.f9246m = i10;
        this.f9247n = new PorterDuffColorFilter(Color.argb(this.f9245l, Color.red(this.f9246m), Color.green(this.f9246m), Color.blue(this.f9246m)), PorterDuff.Mode.SRC_ATOP);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f9242i || super.verifyDrawable(drawable);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9243j = true;
        this.f9245l = 150;
        this.f9248o = false;
        this.f9252s = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15865o, i10, m.BezelImageView);
        Drawable drawable = obtainStyledAttributes.getDrawable(n.f15867q);
        this.f9242i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f9243j = obtainStyledAttributes.getBoolean(n.f15866p, true);
        this.f9246m = obtainStyledAttributes.getColor(n.f15868r, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f9238e = paint;
        paint.setColor(-16777216);
        Paint paint2 = new Paint();
        this.f9239f = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f9249p = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f9244k = new ColorMatrixColorFilter(colorMatrix);
        if (this.f9246m != 0) {
            this.f9247n = new PorterDuffColorFilter(Color.argb(this.f9245l, Color.red(this.f9246m), Color.green(this.f9246m), Color.blue(this.f9246m)), PorterDuff.Mode.SRC_ATOP);
        }
    }
}
