package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1162a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1163b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1164c;

    private f1(Context context, TypedArray typedArray) {
        this.f1162a = context;
        this.f1163b = typedArray;
    }

    public static f1 t(Context context, int i10, int[] iArr) {
        return new f1(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static f1 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new f1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static f1 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new f1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1163b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1163b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1163b.hasValue(i10) || (resourceId = this.f1163b.getResourceId(i10, 0)) == 0 || (a10 = g.a.a(this.f1162a, resourceId)) == null) ? this.f1163b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f1163b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1163b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1163b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1163b.hasValue(i10) || (resourceId = this.f1163b.getResourceId(i10, 0)) == 0) ? this.f1163b.getDrawable(i10) : g.a.b(this.f1162a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1163b.hasValue(i10) || (resourceId = this.f1163b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1162a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1163b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f1163b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1164c == null) {
            this.f1164c = new TypedValue();
        }
        return androidx.core.content.res.h.i(this.f1162a, resourceId, this.f1164c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f1163b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1163b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1163b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1163b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1163b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1163b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1163b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1163b;
    }

    public boolean s(int i10) {
        return this.f1163b.hasValue(i10);
    }

    public void w() {
        this.f1163b.recycle();
    }
}