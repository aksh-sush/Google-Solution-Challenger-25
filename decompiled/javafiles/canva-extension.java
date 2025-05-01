package f5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f10348i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f10349j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f10350k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f10351l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f10352a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f10353b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f10354c;

    /* renamed from: d, reason: collision with root package name */
    private int f10355d;

    /* renamed from: e, reason: collision with root package name */
    private int f10356e;

    /* renamed from: f, reason: collision with root package name */
    private int f10357f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f10358g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f10359h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10 = f11 < 0.0f;
        Path path = this.f10358g;
        if (z10) {
            int[] iArr = f10350k;
            iArr[0] = 0;
            iArr[1] = this.f10357f;
            iArr[2] = this.f10356e;
            iArr[3] = this.f10355d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            int[] iArr2 = f10350k;
            iArr2[0] = 0;
            iArr2[1] = this.f10355d;
            iArr2[2] = this.f10356e;
            iArr2[3] = this.f10357f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / width);
        float[] fArr = f10351l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        this.f10353b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f10350k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f10359h);
        }
        canvas.drawArc(rectF, f10, f11, true, this.f10353b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f10348i;
        iArr[0] = this.f10357f;
        iArr[1] = this.f10356e;
        iArr[2] = this.f10355d;
        Paint paint = this.f10354c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f10349j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f10354c);
        canvas.restore();
    }

    public Paint c() {
        return this.f10352a;
    }

    public void d(int i10) {
        this.f10355d = androidx.core.graphics.a.k(i10, 68);
        this.f10356e = androidx.core.graphics.a.k(i10, 20);
        this.f10357f = androidx.core.graphics.a.k(i10, 0);
        this.f10352a.setColor(this.f10355d);
    }

    public a(int i10) {
        this.f10358g = new Path();
        Paint paint = new Paint();
        this.f10359h = paint;
        this.f10352a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f10353b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f10354c = new Paint(paint2);
    }
}