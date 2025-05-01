package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f1228a;

    /* renamed from: b, reason: collision with root package name */
    private final i0.f f1229b;

    m(TextView textView) {
        this.f1228a = textView;
        this.f1229b = new i0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1229b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1229b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f1228a.getContext().obtainStyledAttributes(attributeSet, f.j.f10188g0, i10, 0);
        try {
            int i11 = f.j.f10258u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z10) {
        this.f1229b.c(z10);
    }

    void e(boolean z10) {
        this.f1229b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f1229b.e(transformationMethod);
    }
}