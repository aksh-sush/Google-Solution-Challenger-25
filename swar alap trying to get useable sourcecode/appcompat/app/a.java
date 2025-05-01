package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0008a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f352a;

        public C0008a(int i10, int i11) {
            super(i10, i11);
            this.f352a = 8388627;
        }

        public C0008a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f352a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f10252t);
            this.f352a = obtainStyledAttributes.getInt(f.j.f10257u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0008a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f352a = 0;
        }

        public C0008a(C0008a c0008a) {
            super((ViewGroup.MarginLayoutParams) c0008a);
            this.f352a = 0;
            this.f352a = c0008a.f352a;
        }
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(int i10);

    public abstract void t(Drawable drawable);

    public abstract void u(boolean z10);

    public abstract void v(CharSequence charSequence);

    public abstract void w(CharSequence charSequence);

    public androidx.appcompat.view.b x(b.a aVar) {
        return null;
    }
}