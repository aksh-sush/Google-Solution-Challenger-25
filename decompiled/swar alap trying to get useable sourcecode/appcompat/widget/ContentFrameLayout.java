package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f914e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f915f;

    /* renamed from: g, reason: collision with root package name */
    private TypedValue f916g;

    /* renamed from: h, reason: collision with root package name */
    private TypedValue f917h;

    /* renamed from: i, reason: collision with root package name */
    private TypedValue f918i;

    /* renamed from: j, reason: collision with root package name */
    private TypedValue f919j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f920k;

    /* renamed from: l, reason: collision with root package name */
    private a f921l;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f920k.set(i10, i11, i12, i13);
        if (androidx.core.view.h0.W(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f918i == null) {
            this.f918i = new TypedValue();
        }
        return this.f918i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f919j == null) {
            this.f919j = new TypedValue();
        }
        return this.f919j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f916g == null) {
            this.f916g = new TypedValue();
        }
        return this.f916g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f917h == null) {
            this.f917h = new TypedValue();
        }
        return this.f917h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f914e == null) {
            this.f914e = new TypedValue();
        }
        return this.f914e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f915f == null) {
            this.f915f = new TypedValue();
        }
        return this.f915f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f921l;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f921l;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f921l = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f920k = new Rect();
    }
}